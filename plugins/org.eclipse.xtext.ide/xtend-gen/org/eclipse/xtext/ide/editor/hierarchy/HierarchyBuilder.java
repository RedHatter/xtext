/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.editor.hierarchy;

import java.util.Collection;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyContext;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNode;

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.10
 */
@SuppressWarnings("all")
public interface HierarchyBuilder {
  public abstract Collection<HierarchyNode> buildRoots(final URI uri, final HierarchyContext context, final IProgressMonitor monitor);
  
  public abstract boolean mayHaveChildren(final HierarchyNode parent, final HierarchyContext context, final IProgressMonitor monitor);
  
  public abstract Collection<HierarchyNode> buildChildren(final HierarchyNode parent, final HierarchyContext context, final IProgressMonitor monitor);
}
