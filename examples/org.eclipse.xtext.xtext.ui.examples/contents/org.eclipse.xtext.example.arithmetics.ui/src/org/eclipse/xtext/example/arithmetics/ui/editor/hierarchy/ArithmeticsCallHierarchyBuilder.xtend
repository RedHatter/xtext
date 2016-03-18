
package org.eclipse.xtext.example.arithmetics.ui.editor.hierarchy

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.example.arithmetics.arithmetics.ArithmeticsPackage
import org.eclipse.xtext.ide.editor.hierarchy.DefaultCallHierarchyBuilder
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyContext
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IReferenceDescription

import static extension org.eclipse.xtext.EcoreUtil2.*

class ArithmeticsCallHierarchyBuilder extends DefaultCallHierarchyBuilder {

	@Inject
	ArithmeticsCallHierarchyNodeLocationProvider arithmeticsCallHierarchyNodeLocationProvider

	override protected getHierarchyNodeLocationProvider() {
		arithmeticsCallHierarchyNodeLocationProvider
	}

	override protected filterDeclaration(IEObjectDescription declaration, HierarchyContext context) {
		return declaration?.EClass.definition
	}

	override protected getDeclaration(IReferenceDescription reference, HierarchyContext context) {
		switch type : reference?.EReference?.EType {
			EClass case type.definition:
				return super.getDeclaration(reference, context)
		}
	}

	protected def boolean isDefinition(EClass type) {
		return ArithmeticsPackage.Literals.ABSTRACT_DEFINITION.isAssignableFrom(type)
	}

}
