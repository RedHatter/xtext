/*******************************************************************************
 * Copyright (c) 2016 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.domainmodel.ui.editor.hierarchy

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.example.domainmodel.domainmodel.Property
import org.eclipse.xtext.ide.editor.hierarchy.DefaultCallHierarchyBuilder
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyContext
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IReferenceDescription

import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * @author kosyakov - Initial contribution and API
 */
class AssociationHierarchyBuilder extends DefaultCallHierarchyBuilder {

	@Inject
	AssociationHierarchyNodeLocationProvider associationHierarchyNodeLocationProvider

	override protected getHierarchyNodeLocationProvider() {
		associationHierarchyNodeLocationProvider
	}

	override protected filterDeclaration(IEObjectDescription declaration, HierarchyContext context) {
		return DomainmodelPackage.Literals.ENTITY.isAssignableFrom(declaration?.EClass)
	}

	override protected getDeclaration(IReferenceDescription reference, HierarchyContext context) {
		switch type : reference?.EReference?.EType {
			EClass case TypesPackage.Literals.JVM_TYPE.isAssignableFrom(type): {
				return resourceAccess.readOnly(reference.containerEObjectURI) [
					val referenceOwner = getEObject(reference.containerEObjectURI, true)
					val entity = referenceOwner.getContainerOfType(Property).getContainerOfType(Entity)
					if (entity !== null)
						return indexData.getExportedObjectsByObject(entity).head
				]
			}
		}
	}

}
