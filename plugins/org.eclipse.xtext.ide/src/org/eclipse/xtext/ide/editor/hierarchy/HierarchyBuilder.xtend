/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.hierarchy

import java.util.Collection
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.10
 */
interface HierarchyBuilder {

	def Collection<HierarchyNode> buildRoots(URI uri, HierarchyContext context, IProgressMonitor monitor)

	def boolean mayHaveChildren(HierarchyNode parent, HierarchyContext context, IProgressMonitor monitor)

	def Collection<HierarchyNode> buildChildren(HierarchyNode parent, HierarchyContext context, IProgressMonitor monitor)

}
