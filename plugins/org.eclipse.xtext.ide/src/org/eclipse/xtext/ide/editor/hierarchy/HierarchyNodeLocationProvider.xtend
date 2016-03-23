/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.hierarchy

import com.google.inject.ImplementedBy
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.util.ITextRegionWithLineInformation

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.10
 */
@ImplementedBy(DefaultHierarchyNodeLocationProvider)
interface HierarchyNodeLocationProvider {
	def ITextRegionWithLineInformation getTextRegion(EObject obj)
	def ITextRegionWithLineInformation getTextRegion(EObject owner, EStructuralFeature feature, int indexInList)
}