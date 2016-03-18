/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.hierarchy

import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.findReferences.ReferenceAcceptor
import org.eclipse.xtext.findReferences.TargetURIs
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IReferenceDescription
import org.eclipse.xtext.util.ITextRegionWithLineInformation

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.10
 */
class DefaultCallHierarchyBuilder extends AbstractHierarchyBuilder {

	override buildRoots(URI rootURI, HierarchyContext context, IProgressMonitor progressMonitor) {
		return rootURI.collectTargetURIs(context).map[declaration].filter[filterDeclaration(context)].map [
			createRoot(context)
		].toList
	}

	override mayHaveChildren(HierarchyNode parent, HierarchyContext context, IProgressMonitor progressMonitor) {
		val element = parent.element
		if (element instanceof IEObjectDescription)
			if (!filterDeclaration(element, context))
				return false

		if (parent.recursive)
			return false

		return true
	}

	override buildChildren(HierarchyNode parent, HierarchyContext context, IProgressMonitor progressMonitor) {
		val children = newLinkedHashMap
		parent.URI.findCallers(context, progressMonitor) [ description, referenceDescription |
			var childNode = children.get(description.EObjectURI)
			if (childNode === null) {
				childNode = createChild(description, parent, context)
				children.put(description.EObjectURI, childNode)
			}
			childNode.locations += referenceDescription.createLocation(context)
		]
		return children.values.filter(HierarchyNode).toList
	}

	protected def void findCallers(
		URI targetURI,
		HierarchyContext context,
		IProgressMonitor progressMonitor,
		(IEObjectDescription, IReferenceDescription)=>void acceptor
	) {
		val targetURIs = targetURI.collectTargetURIs(context)

		referenceFinder.findAllReferences(
			targetURIs,
			resourceAccess,
			indexData,
			new ReferenceAcceptor(resourceServiceProviderRegistry) [ reference |
				val declaration = reference.getDeclaration(context)
				if (declaration !== null)
					acceptor.apply(declaration, reference)
			],
			progressMonitor
		)
	}

	protected def TargetURIs collectTargetURIs(URI targetURI, HierarchyContext context) {
		val targetURIs = targetURIProvider.get
		if(targetURI === null) return targetURIs

		return resourceAccess.readOnly(targetURI) [ resourceSet |
			val targetObject = resourceSet.getEObject(targetURI, true)
			if(targetObject === null) return targetURIs

			targetURICollector.add(targetObject, targetURIs)
			return targetURIs
		]
	}

	protected def IEObjectDescription getDeclaration(IReferenceDescription reference, HierarchyContext context) {
		if(reference === null) return null

		val declarationURI = reference.containerEObjectURI ?: reference.sourceEObjectUri
		return declarationURI.declaration
	}

	protected def IEObjectDescription getDeclaration(URI declarationURI) {
		val resourceDescription = indexData.getResourceDescription(declarationURI.trimFragment)
		if(resourceDescription === null) return null

		return resourceDescription.exportedObjects.findFirst[EObjectURI == declarationURI]
	}

	protected def boolean filterDeclaration(IEObjectDescription declaration, HierarchyContext context) {
		declaration !== null
	}

	protected def URI getURI(HierarchyNode node) {
		val element = node.element
		if (element instanceof IEObjectDescription)
			return element.EObjectURI
	}

	protected def HierarchyNode createRoot(
		IEObjectDescription description,
		HierarchyContext context
	) {
		new DefaultHierarchyNode(description, null)
	}

	protected def HierarchyNode createChild(
		IEObjectDescription description,
		HierarchyNode parent,
		HierarchyContext context
	) {
		return new DefaultHierarchyNode(description, parent)
	}

	protected def HierarchyNodeLocation createLocation(
		IReferenceDescription referenceDescription,
		HierarchyContext context
	) {
		return resourceAccess.readOnly(referenceDescription.sourceEObjectUri) [ resourceSet |
			val sourceObject = resourceSet.getEObject(referenceDescription.sourceEObjectUri, true)
			val textRegion = sourceObject.getTextRegion(referenceDescription, context)
			val text = sourceObject.getText(textRegion)
			return new DefaultHierarchyNodeLocation(text, textRegion, referenceDescription)
		]
	}

	protected def ITextRegionWithLineInformation getTextRegion(
		EObject sourceObject,
		IReferenceDescription referenceDescription,
		HierarchyContext context
	) {
		return hierarchyNodeLocationProvider.getTextRegion(
			sourceObject,
			referenceDescription.EReference,
			referenceDescription.indexInList
		)
	}

	protected def String getText(EObject sourceObject, ITextRegionWithLineInformation textRegion) {
		if (sourceObject === null || textRegion === ITextRegionWithLineInformation.EMPTY_REGION)
			return ''

		val node = sourceObject.rootContainer.node
		if (node === null)
			return ''

		val endOffset = textRegion.offset + textRegion.length
		return node.rootNode.text.substring(textRegion.offset, endOffset)
	}

}
