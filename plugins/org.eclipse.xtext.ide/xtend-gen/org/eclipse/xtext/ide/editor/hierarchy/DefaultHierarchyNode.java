/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.editor.hierarchy;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNode;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNodeLocation;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.10
 */
@Accessors
@FinalFieldsConstructor
@SuppressWarnings("all")
public class DefaultHierarchyNode implements HierarchyNode {
  private final Object element;
  
  private final HierarchyNode parent;
  
  private final ArrayList<HierarchyNodeLocation> locations = CollectionLiterals.<HierarchyNodeLocation>newArrayList();
  
  @Override
  public Object getNavigationElement() {
    Object _elvis = null;
    HierarchyNodeLocation _head = IterableExtensions.<HierarchyNodeLocation>head(this.locations);
    if (_head != null) {
      _elvis = _head;
    } else {
      _elvis = this.element;
    }
    return _elvis;
  }
  
  @Override
  public boolean isRecursive() {
    HierarchyNode parent = this.parent;
    while ((parent != null)) {
      {
        Object _element = parent.getElement();
        boolean _equals = Objects.equal(_element, this.element);
        if (_equals) {
          return true;
        }
        HierarchyNode _parent = parent.getParent();
        parent = _parent;
      }
    }
    return false;
  }
  
  public IEObjectDescription getDescription() {
    if ((this.element instanceof IEObjectDescription)) {
      return ((IEObjectDescription)this.element);
    }
    return null;
  }
  
  public DefaultHierarchyNode(final Object element, final HierarchyNode parent) {
    super();
    this.element = element;
    this.parent = parent;
  }
  
  @Pure
  public Object getElement() {
    return this.element;
  }
  
  @Pure
  public HierarchyNode getParent() {
    return this.parent;
  }
  
  @Pure
  public Collection<HierarchyNodeLocation> getLocations() {
    return this.locations;
  }
}
