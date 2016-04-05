/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xbase.typesystem.internal;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.typesystem.IExpressionScope;
import org.eclipse.xtext.xbase.typesystem.computation.ILinkingCandidate;
import org.eclipse.xtext.xbase.typesystem.computation.IFeatureLinkingCandidate;

/**
 * @author Timothy Johnson
 */
public class ExpressionTransformer
{
	public ExpressionAwareStackedResolvedTypes transformExpression(XExpression expression, AbstractStackedTypeComputationState state)
	{
		if (expression instanceof XFeatureCall)
		{
			XFeatureCall featureCall = (XFeatureCall) expression;
			if (state.getResolvedTypes().getLinkingCandidate(featureCall) instanceof UnresolvableFeatureCall)
				return transformExpression (featureCall, state.getParent());
		}

		return null;
	}

	protected ExpressionAwareStackedResolvedTypes transformExpression(XFeatureCall featureCall, AbstractTypeComputationState state) {
		EList<XExpression> args = featureCall.getActualArguments();

		// One argument of type closure, might be bracket access
		if (args.size () == 1 && args.get(0) instanceof XClosure)
		{
			XMemberFeatureCall method = XbaseFactory.eINSTANCE.createXMemberFeatureCall();
			QualifiedName name = QualifiedName.create("[]");

			XClosure closure = ((XClosure) args.get(0));
			XExpression argument = closure.getExpression();
			if (argument instanceof XBlockExpression)
				argument = ((XBlockExpression) argument).getExpressions().get(0);

			args.clear();

			EObject parent = featureCall.eContainer();
			Object value = parent.eGet(featureCall.eContainingFeature(), false);
			if (value instanceof List)
			{
				List list = (List) value;
				int pos = list.indexOf (featureCall);
				method.setMemberCallTarget(featureCall);
				list.add(pos, method);
			} else
			{
				parent.eSet(featureCall.eContainingFeature(), method);
				method.setMemberCallTarget(featureCall);
			}

			ExpressionAwareStackedResolvedTypes types = state.pushTypes(method);
			ExpressionTypeComputationState expressionState = state.createExpressionComputationState(method, types);
			types.addExpressionScope(method, expressionState.getFeatureScopeSession(), IExpressionScope.Anchor.BEFORE);

			expressionState.computeTypes(featureCall);
			types.basicGetExpressionTypes().remove(method);
			
			List<? extends IFeatureLinkingCandidate> candidates = expressionState.getLinkingCandidatesByName(name, method);
			IFeatureLinkingCandidate best = (IFeatureLinkingCandidate) getBestCandidate(candidates);

			if (best instanceof UnresolvableFeatureCall)
			{
				if (value instanceof List)
				{
					List list = (List) value;
					int pos = list.indexOf (method);
					list.remove(pos);
					list.add(pos, featureCall);
				} else
					parent.eSet(method.eContainingFeature(), featureCall);

				args.add (closure);

				return null;
			}
			
			method.setFeature(best.getFeature());
			if (best.isExtension())
				method.getMemberCallArguments().add(featureCall);

			method.getMemberCallArguments().add(argument);
			best.applyToComputationState();
			types.basicGetLinkingMap().remove(method);

			return types;
		}

		return null;
	}

	protected ILinkingCandidate getBestCandidate(List<? extends ILinkingCandidate> candidates) {
		ILinkingCandidate result = candidates.get(0);
		for(int i = 1; i < candidates.size(); i++) {
			ILinkingCandidate candidate = candidates.get(i);
			result = result.getPreferredCandidate(candidate);
		}
		return result;
	}

}