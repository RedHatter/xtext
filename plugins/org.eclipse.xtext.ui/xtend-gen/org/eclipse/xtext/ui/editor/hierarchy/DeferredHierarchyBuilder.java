/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.hierarchy;

import java.util.Collection;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.progress.IDeferredWorkbenchAdapter;
import org.eclipse.ui.progress.IElementCollector;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.Delegate;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyBuilder;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyContext;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNode;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNodeLocation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.10
 */
@SuppressWarnings("all")
public class DeferredHierarchyBuilder implements HierarchyBuilder {
  @FinalFieldsConstructor
  public static class DeferredHierarchyNode implements IAdaptable, IDeferredWorkbenchAdapter, HierarchyNode {
    @Delegate
    @Accessors
    private final HierarchyNode delegate;
    
    private final HierarchyContext context;
    
    @Extension
    private final HierarchyBuilder hierarchyBuilder;
    
    @Override
    public Object getAdapter(final Class adapterType) {
      boolean _isInstance = adapterType.isInstance(this);
      if (_isInstance) {
        return this;
      }
      return null;
    }
    
    @Override
    public void fetchDeferredChildren(final Object object, final IElementCollector collector, final IProgressMonitor monitor) {
      final HierarchyNode[] children = ((HierarchyNode[])Conversions.unwrapArray(this.hierarchyBuilder.buildChildren(this.delegate, this.context, monitor), HierarchyNode.class));
      collector.add(children, monitor);
      collector.done();
    }
    
    @Override
    public ISchedulingRule getRule(final Object object) {
      return null;
    }
    
    @Override
    public boolean isContainer() {
      return this.hierarchyBuilder.mayHaveChildren(this.delegate, this.context, null);
    }
    
    @Override
    public Object[] getChildren(final Object o) {
      return new Object[] {};
    }
    
    @Override
    public ImageDescriptor getImageDescriptor(final Object object) {
      return null;
    }
    
    @Override
    public String getLabel(final Object o) {
      return null;
    }
    
    @Override
    public Object getParent(final Object o) {
      return null;
    }
    
    @Pure
    public HierarchyNode getDelegate() {
      return this.delegate;
    }
    
    public DeferredHierarchyNode(final HierarchyNode delegate, final HierarchyContext context, final HierarchyBuilder hierarchyBuilder) {
      super();
      this.delegate = delegate;
      this.context = context;
      this.hierarchyBuilder = hierarchyBuilder;
    }
    
    public Object getElement() {
      return this.delegate.getElement();
    }
    
    public boolean isRecursive() {
      return this.delegate.isRecursive();
    }
    
    public HierarchyNode getParent() {
      return this.delegate.getParent();
    }
    
    public Collection<HierarchyNodeLocation> getLocations() {
      return this.delegate.getLocations();
    }
    
    public Object getNavigationElement() {
      return this.delegate.getNavigationElement();
    }
  }
  
  @Accessors
  private HierarchyBuilder hierarchyBuilder;
  
  @Override
  public Collection<HierarchyNode> buildRoots(final URI rootURI, final HierarchyContext context, final IProgressMonitor monitor) {
    Collection<HierarchyNode> _buildRoots = this.hierarchyBuilder.buildRoots(rootURI, context, monitor);
    final Function1<HierarchyNode, HierarchyNode> _function = new Function1<HierarchyNode, HierarchyNode>() {
      @Override
      public HierarchyNode apply(final HierarchyNode it) {
        return DeferredHierarchyBuilder.this.defer(it, context);
      }
    };
    Iterable<HierarchyNode> _map = IterableExtensions.<HierarchyNode, HierarchyNode>map(_buildRoots, _function);
    Iterable<HierarchyNode> _filterNull = IterableExtensions.<HierarchyNode>filterNull(_map);
    return IterableExtensions.<HierarchyNode>toList(_filterNull);
  }
  
  @Override
  public boolean mayHaveChildren(final HierarchyNode parent, final HierarchyContext context, final IProgressMonitor monitor) {
    return this.hierarchyBuilder.mayHaveChildren(parent, context, monitor);
  }
  
  @Override
  public Collection<HierarchyNode> buildChildren(final HierarchyNode node, final HierarchyContext context, final IProgressMonitor monitor) {
    Collection<HierarchyNode> _buildChildren = this.hierarchyBuilder.buildChildren(node, context, monitor);
    final Function1<HierarchyNode, HierarchyNode> _function = new Function1<HierarchyNode, HierarchyNode>() {
      @Override
      public HierarchyNode apply(final HierarchyNode it) {
        return DeferredHierarchyBuilder.this.defer(it, context);
      }
    };
    Iterable<HierarchyNode> _map = IterableExtensions.<HierarchyNode, HierarchyNode>map(_buildChildren, _function);
    Iterable<HierarchyNode> _filterNull = IterableExtensions.<HierarchyNode>filterNull(_map);
    return IterableExtensions.<HierarchyNode>toList(_filterNull);
  }
  
  protected HierarchyNode defer(final HierarchyNode node, final HierarchyContext context) {
    DeferredHierarchyBuilder.DeferredHierarchyNode _xifexpression = null;
    if ((node != null)) {
      _xifexpression = new DeferredHierarchyBuilder.DeferredHierarchyNode(node, context, this);
    }
    return _xifexpression;
  }
  
  @Pure
  public HierarchyBuilder getHierarchyBuilder() {
    return this.hierarchyBuilder;
  }
  
  public void setHierarchyBuilder(final HierarchyBuilder hierarchyBuilder) {
    this.hierarchyBuilder = hierarchyBuilder;
  }
}
