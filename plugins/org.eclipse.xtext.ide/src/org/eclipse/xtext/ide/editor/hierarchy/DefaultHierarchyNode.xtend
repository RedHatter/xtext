/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.hierarchy

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.resource.IEObjectDescription

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.10
 */
@Accessors
@FinalFieldsConstructor
class DefaultHierarchyNode implements HierarchyNode {

	val Object element
	val HierarchyNode parent
	val locations = <HierarchyNodeLocation>newArrayList

	override getNavigationElement() {
		return locations.head ?: element
	}

	override boolean isRecursive() {
		var parent = parent
		while (parent !== null) {
			if (parent.element == element)
				return true
			parent = parent.parent
		}
		return false
	}

	def IEObjectDescription getDescription() {
		if (element instanceof IEObjectDescription)
			return element
	}

}
