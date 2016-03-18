/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.editor.hierarchy;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.LinkedHashMap;
import javax.inject.Provider;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.findReferences.IReferenceFinder;
import org.eclipse.xtext.findReferences.ReferenceAcceptor;
import org.eclipse.xtext.findReferences.TargetURICollector;
import org.eclipse.xtext.findReferences.TargetURIs;
import org.eclipse.xtext.ide.editor.hierarchy.AbstractHierarchyBuilder;
import org.eclipse.xtext.ide.editor.hierarchy.DefaultHierarchyNode;
import org.eclipse.xtext.ide.editor.hierarchy.DefaultHierarchyNodeLocation;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyContext;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNode;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNodeLocation;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNodeLocationProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.util.ITextRegionWithLineInformation;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.10
 */
@SuppressWarnings("all")
public class DefaultCallHierarchyBuilder extends AbstractHierarchyBuilder {
  @Override
  public Collection<HierarchyNode> buildRoots(final URI rootURI, final HierarchyContext context, final IProgressMonitor progressMonitor) {
    TargetURIs _collectTargetURIs = this.collectTargetURIs(rootURI, context);
    final Function1<URI, IEObjectDescription> _function = new Function1<URI, IEObjectDescription>() {
      @Override
      public IEObjectDescription apply(final URI it) {
        return DefaultCallHierarchyBuilder.this.getDeclaration(it);
      }
    };
    Iterable<IEObjectDescription> _map = IterableExtensions.<URI, IEObjectDescription>map(_collectTargetURIs, _function);
    final Function1<IEObjectDescription, Boolean> _function_1 = new Function1<IEObjectDescription, Boolean>() {
      @Override
      public Boolean apply(final IEObjectDescription it) {
        return Boolean.valueOf(DefaultCallHierarchyBuilder.this.filterDeclaration(it, context));
      }
    };
    Iterable<IEObjectDescription> _filter = IterableExtensions.<IEObjectDescription>filter(_map, _function_1);
    final Function1<IEObjectDescription, HierarchyNode> _function_2 = new Function1<IEObjectDescription, HierarchyNode>() {
      @Override
      public HierarchyNode apply(final IEObjectDescription it) {
        return DefaultCallHierarchyBuilder.this.createRoot(it, context);
      }
    };
    Iterable<HierarchyNode> _map_1 = IterableExtensions.<IEObjectDescription, HierarchyNode>map(_filter, _function_2);
    return IterableExtensions.<HierarchyNode>toList(_map_1);
  }
  
  @Override
  public boolean mayHaveChildren(final HierarchyNode parent, final HierarchyContext context, final IProgressMonitor progressMonitor) {
    final Object element = parent.getElement();
    if ((element instanceof IEObjectDescription)) {
      boolean _filterDeclaration = this.filterDeclaration(((IEObjectDescription)element), context);
      boolean _not = (!_filterDeclaration);
      if (_not) {
        return false;
      }
    }
    boolean _isRecursive = parent.isRecursive();
    if (_isRecursive) {
      return false;
    }
    return true;
  }
  
  @Override
  public Collection<HierarchyNode> buildChildren(final HierarchyNode parent, final HierarchyContext context, final IProgressMonitor progressMonitor) {
    final LinkedHashMap<URI, HierarchyNode> children = CollectionLiterals.<URI, HierarchyNode>newLinkedHashMap();
    URI _uRI = this.getURI(parent);
    final Procedure2<IEObjectDescription, IReferenceDescription> _function = new Procedure2<IEObjectDescription, IReferenceDescription>() {
      @Override
      public void apply(final IEObjectDescription description, final IReferenceDescription referenceDescription) {
        URI _eObjectURI = description.getEObjectURI();
        HierarchyNode childNode = children.get(_eObjectURI);
        if ((childNode == null)) {
          HierarchyNode _createChild = DefaultCallHierarchyBuilder.this.createChild(description, parent, context);
          childNode = _createChild;
          URI _eObjectURI_1 = description.getEObjectURI();
          children.put(_eObjectURI_1, childNode);
        }
        Collection<HierarchyNodeLocation> _locations = childNode.getLocations();
        HierarchyNodeLocation _createLocation = DefaultCallHierarchyBuilder.this.createLocation(referenceDescription, context);
        _locations.add(_createLocation);
      }
    };
    this.findCallers(_uRI, context, progressMonitor, _function);
    Collection<HierarchyNode> _values = children.values();
    Iterable<HierarchyNode> _filter = Iterables.<HierarchyNode>filter(_values, HierarchyNode.class);
    return IterableExtensions.<HierarchyNode>toList(_filter);
  }
  
  protected void findCallers(final URI targetURI, final HierarchyContext context, final IProgressMonitor progressMonitor, final Procedure2<? super IEObjectDescription, ? super IReferenceDescription> acceptor) {
    final TargetURIs targetURIs = this.collectTargetURIs(targetURI, context);
    IReferenceFinder _referenceFinder = this.getReferenceFinder();
    IReferenceFinder.IResourceAccess _resourceAccess = this.getResourceAccess();
    IResourceDescriptions _indexData = this.getIndexData();
    IResourceServiceProvider.Registry _resourceServiceProviderRegistry = this.getResourceServiceProviderRegistry();
    final IAcceptor<IReferenceDescription> _function = new IAcceptor<IReferenceDescription>() {
      @Override
      public void accept(final IReferenceDescription reference) {
        final IEObjectDescription declaration = DefaultCallHierarchyBuilder.this.getDeclaration(reference, context);
        if ((declaration != null)) {
          acceptor.apply(declaration, reference);
        }
      }
    };
    ReferenceAcceptor _referenceAcceptor = new ReferenceAcceptor(_resourceServiceProviderRegistry, _function);
    _referenceFinder.findAllReferences(targetURIs, _resourceAccess, _indexData, _referenceAcceptor, progressMonitor);
  }
  
  protected TargetURIs collectTargetURIs(final URI targetURI, final HierarchyContext context) {
    Provider<TargetURIs> _targetURIProvider = this.getTargetURIProvider();
    final TargetURIs targetURIs = _targetURIProvider.get();
    if ((targetURI == null)) {
      return targetURIs;
    }
    IReferenceFinder.IResourceAccess _resourceAccess = this.getResourceAccess();
    final IUnitOfWork<TargetURIs, ResourceSet> _function = new IUnitOfWork<TargetURIs, ResourceSet>() {
      @Override
      public TargetURIs exec(final ResourceSet resourceSet) throws Exception {
        final EObject targetObject = resourceSet.getEObject(targetURI, true);
        if ((targetObject == null)) {
          return targetURIs;
        }
        TargetURICollector _targetURICollector = DefaultCallHierarchyBuilder.this.getTargetURICollector();
        _targetURICollector.add(targetObject, targetURIs);
        return targetURIs;
      }
    };
    return _resourceAccess.<TargetURIs>readOnly(targetURI, _function);
  }
  
  protected IEObjectDescription getDeclaration(final IReferenceDescription reference, final HierarchyContext context) {
    if ((reference == null)) {
      return null;
    }
    URI _elvis = null;
    URI _containerEObjectURI = reference.getContainerEObjectURI();
    if (_containerEObjectURI != null) {
      _elvis = _containerEObjectURI;
    } else {
      URI _sourceEObjectUri = reference.getSourceEObjectUri();
      _elvis = _sourceEObjectUri;
    }
    final URI declarationURI = _elvis;
    return this.getDeclaration(declarationURI);
  }
  
  protected IEObjectDescription getDeclaration(final URI declarationURI) {
    IResourceDescriptions _indexData = this.getIndexData();
    URI _trimFragment = declarationURI.trimFragment();
    final IResourceDescription resourceDescription = _indexData.getResourceDescription(_trimFragment);
    if ((resourceDescription == null)) {
      return null;
    }
    Iterable<IEObjectDescription> _exportedObjects = resourceDescription.getExportedObjects();
    final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
      @Override
      public Boolean apply(final IEObjectDescription it) {
        URI _eObjectURI = it.getEObjectURI();
        return Boolean.valueOf(Objects.equal(_eObjectURI, declarationURI));
      }
    };
    return IterableExtensions.<IEObjectDescription>findFirst(_exportedObjects, _function);
  }
  
  protected boolean filterDeclaration(final IEObjectDescription declaration, final HierarchyContext context) {
    return (declaration != null);
  }
  
  protected URI getURI(final HierarchyNode node) {
    final Object element = node.getElement();
    if ((element instanceof IEObjectDescription)) {
      return ((IEObjectDescription)element).getEObjectURI();
    }
    return null;
  }
  
  protected HierarchyNode createRoot(final IEObjectDescription description, final HierarchyContext context) {
    return new DefaultHierarchyNode(description, null);
  }
  
  protected HierarchyNode createChild(final IEObjectDescription description, final HierarchyNode parent, final HierarchyContext context) {
    return new DefaultHierarchyNode(description, parent);
  }
  
  protected HierarchyNodeLocation createLocation(final IReferenceDescription referenceDescription, final HierarchyContext context) {
    IReferenceFinder.IResourceAccess _resourceAccess = this.getResourceAccess();
    URI _sourceEObjectUri = referenceDescription.getSourceEObjectUri();
    final IUnitOfWork<DefaultHierarchyNodeLocation, ResourceSet> _function = new IUnitOfWork<DefaultHierarchyNodeLocation, ResourceSet>() {
      @Override
      public DefaultHierarchyNodeLocation exec(final ResourceSet resourceSet) throws Exception {
        URI _sourceEObjectUri = referenceDescription.getSourceEObjectUri();
        final EObject sourceObject = resourceSet.getEObject(_sourceEObjectUri, true);
        final ITextRegionWithLineInformation textRegion = DefaultCallHierarchyBuilder.this.getTextRegion(sourceObject, referenceDescription, context);
        final String text = DefaultCallHierarchyBuilder.this.getText(sourceObject, textRegion);
        return new DefaultHierarchyNodeLocation(text, textRegion, referenceDescription);
      }
    };
    return _resourceAccess.<DefaultHierarchyNodeLocation>readOnly(_sourceEObjectUri, _function);
  }
  
  protected ITextRegionWithLineInformation getTextRegion(final EObject sourceObject, final IReferenceDescription referenceDescription, final HierarchyContext context) {
    HierarchyNodeLocationProvider _hierarchyNodeLocationProvider = this.getHierarchyNodeLocationProvider();
    EReference _eReference = referenceDescription.getEReference();
    int _indexInList = referenceDescription.getIndexInList();
    return _hierarchyNodeLocationProvider.getTextRegion(sourceObject, _eReference, _indexInList);
  }
  
  protected String getText(final EObject sourceObject, final ITextRegionWithLineInformation textRegion) {
    if (((sourceObject == null) || (textRegion == ITextRegionWithLineInformation.EMPTY_REGION))) {
      return "";
    }
    EObject _rootContainer = EcoreUtil.getRootContainer(sourceObject);
    final ICompositeNode node = NodeModelUtils.getNode(_rootContainer);
    if ((node == null)) {
      return "";
    }
    int _offset = textRegion.getOffset();
    int _length = textRegion.getLength();
    final int endOffset = (_offset + _length);
    ICompositeNode _rootNode = node.getRootNode();
    String _text = _rootNode.getText();
    int _offset_1 = textRegion.getOffset();
    return _text.substring(_offset_1, endOffset);
  }
}
