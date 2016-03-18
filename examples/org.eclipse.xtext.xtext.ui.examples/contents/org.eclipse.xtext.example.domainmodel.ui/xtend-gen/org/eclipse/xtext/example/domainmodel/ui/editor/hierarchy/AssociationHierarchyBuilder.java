/**
 * Copyright (c) 2016 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.example.domainmodel.ui.editor.hierarchy;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage;
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity;
import org.eclipse.xtext.example.domainmodel.domainmodel.Property;
import org.eclipse.xtext.example.domainmodel.ui.editor.hierarchy.AssociationHierarchyNodeLocationProvider;
import org.eclipse.xtext.findReferences.IReferenceFinder;
import org.eclipse.xtext.ide.editor.hierarchy.DefaultCallHierarchyBuilder;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyContext;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNodeLocationProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author kosyakov - Initial contribution and API
 */
@SuppressWarnings("all")
public class AssociationHierarchyBuilder extends DefaultCallHierarchyBuilder {
  @Inject
  private AssociationHierarchyNodeLocationProvider associationHierarchyNodeLocationProvider;
  
  @Override
  protected HierarchyNodeLocationProvider getHierarchyNodeLocationProvider() {
    return this.associationHierarchyNodeLocationProvider;
  }
  
  @Override
  protected boolean filterDeclaration(final IEObjectDescription declaration, final HierarchyContext context) {
    EClass _eClass = null;
    if (declaration!=null) {
      _eClass=declaration.getEClass();
    }
    return EcoreUtil2.isAssignableFrom(DomainmodelPackage.Literals.ENTITY, _eClass);
  }
  
  @Override
  protected IEObjectDescription getDeclaration(final IReferenceDescription reference, final HierarchyContext context) {
    EReference _eReference = null;
    if (reference!=null) {
      _eReference=reference.getEReference();
    }
    EClassifier _eType = null;
    if (_eReference!=null) {
      _eType=_eReference.getEType();
    }
    final EClassifier type = _eType;
    boolean _matched = false;
    if (!_matched) {
      if (type instanceof EClass) {
        boolean _isAssignableFrom = EcoreUtil2.isAssignableFrom(TypesPackage.Literals.JVM_TYPE, ((EClass)type));
        if (_isAssignableFrom) {
          _matched=true;
          IReferenceFinder.IResourceAccess _resourceAccess = this.getResourceAccess();
          URI _containerEObjectURI = reference.getContainerEObjectURI();
          final IUnitOfWork<IEObjectDescription, ResourceSet> _function = new IUnitOfWork<IEObjectDescription, ResourceSet>() {
            @Override
            public IEObjectDescription exec(final ResourceSet it) throws Exception {
              URI _containerEObjectURI = reference.getContainerEObjectURI();
              final EObject referenceOwner = it.getEObject(_containerEObjectURI, true);
              Property _containerOfType = EcoreUtil2.<Property>getContainerOfType(referenceOwner, Property.class);
              final Entity entity = EcoreUtil2.<Entity>getContainerOfType(_containerOfType, Entity.class);
              if ((entity != null)) {
                IResourceDescriptions _indexData = AssociationHierarchyBuilder.this.getIndexData();
                Iterable<IEObjectDescription> _exportedObjectsByObject = _indexData.getExportedObjectsByObject(entity);
                return IterableExtensions.<IEObjectDescription>head(_exportedObjectsByObject);
              }
              return null;
            }
          };
          return _resourceAccess.<IEObjectDescription>readOnly(_containerEObjectURI, _function);
        }
      }
    }
    return null;
  }
}
