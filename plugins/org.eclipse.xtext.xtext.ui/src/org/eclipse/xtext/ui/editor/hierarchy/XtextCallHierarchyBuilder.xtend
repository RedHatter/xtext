/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.hierarchy

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.XtextPackage
import org.eclipse.xtext.ide.editor.hierarchy.DefaultCallHierarchyBuilder
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyContext
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNode
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IReferenceDescription

import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.10
 */
class XtextCallHierarchyBuilder extends DefaultCallHierarchyBuilder {

	@Inject
	XtextCallHierarchyNodeLocationProvider callHierarchyNodeLocationProvider

	override protected getHierarchyNodeLocationProvider() {
		callHierarchyNodeLocationProvider
	}

	override protected filterDeclaration(IEObjectDescription declaration, HierarchyContext context) {
		return declaration?.EClass.rule
	}

	override protected getDeclaration(IReferenceDescription reference, HierarchyContext context) {
		switch type : reference?.EReference?.EType {
			EClass case type.rule:
				return super.getDeclaration(reference, context)
		}
	}

	protected def boolean isRule(EClass type) {
		XtextPackage.Literals.ABSTRACT_RULE.isAssignableFrom(type)
	}

	override protected createRoot(IEObjectDescription description, HierarchyContext context) {
		new XtextCallHierarchyNode(description, null, description.grammarDescription)
	}

	override protected createChild(IEObjectDescription description, HierarchyNode parent, HierarchyContext context) {
		new XtextCallHierarchyNode(description, parent, description.grammarDescription)
	}

	protected def IEObjectDescription getGrammarDescription(IEObjectDescription description) {
		val resourceURI = description.EObjectURI.trimFragment
		indexData.getResourceDescription(resourceURI).getExportedObjectsByType(XtextPackage.Literals.GRAMMAR).head
	}

}
