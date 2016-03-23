/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.junit4.ide;

import com.google.inject.Inject;
import java.util.Collection;
import javax.inject.Provider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ide.editor.hierarchy.AbstractHierarchyBuilder;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyBuilder;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyContext;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNode;
import org.eclipse.xtext.ide.editor.hierarchy.HierarchyNodeLocation;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceDescriptionsProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.findrefs.SimpleLocalResourceAccess;
import org.eclipse.xtext.util.LazyStringInputStream;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.junit.Assert;

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.10
 */
@SuppressWarnings("all")
public abstract class AbstractHierarchyBuilderTest {
  @Accessors
  protected static class HierarchyBuilderTestConfiguration {
    private Function1<? super ResourceSet, ? extends HierarchyBuilder> hierarchyBuilderProvider;
    
    private Function1<? super ResourceSet, ? extends HierarchyContext> hierarchyContextProvider = new Function1<ResourceSet, HierarchyContext>() {
      @Override
      public HierarchyContext apply(final ResourceSet it) {
        return new HierarchyContext();
      }
    };
    
    private Collection<Pair<String, String>> models = CollectionLiterals.<Pair<String, String>>newArrayList();
    
    private int index;
    
    private String resourceURI;
    
    private String expectedHierarchy;
    
    @Pure
    public Function1<? super ResourceSet, ? extends HierarchyBuilder> getHierarchyBuilderProvider() {
      return this.hierarchyBuilderProvider;
    }
    
    public void setHierarchyBuilderProvider(final Function1<? super ResourceSet, ? extends HierarchyBuilder> hierarchyBuilderProvider) {
      this.hierarchyBuilderProvider = hierarchyBuilderProvider;
    }
    
    @Pure
    public Function1<? super ResourceSet, ? extends HierarchyContext> getHierarchyContextProvider() {
      return this.hierarchyContextProvider;
    }
    
    public void setHierarchyContextProvider(final Function1<? super ResourceSet, ? extends HierarchyContext> hierarchyContextProvider) {
      this.hierarchyContextProvider = hierarchyContextProvider;
    }
    
    @Pure
    public Collection<Pair<String, String>> getModels() {
      return this.models;
    }
    
    public void setModels(final Collection<Pair<String, String>> models) {
      this.models = models;
    }
    
    @Pure
    public int getIndex() {
      return this.index;
    }
    
    public void setIndex(final int index) {
      this.index = index;
    }
    
    @Pure
    public String getResourceURI() {
      return this.resourceURI;
    }
    
    public void setResourceURI(final String resourceURI) {
      this.resourceURI = resourceURI;
    }
    
    @Pure
    public String getExpectedHierarchy() {
      return this.expectedHierarchy;
    }
    
    public void setExpectedHierarchy(final String expectedHierarchy) {
      this.expectedHierarchy = expectedHierarchy;
    }
  }
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private EObjectAtOffsetHelper _eObjectAtOffsetHelper;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Inject
  private IResourceDescriptionsProvider resourceDescriptionsProvider;
  
  protected void testBuildHierarchy(final Procedure1<? super AbstractHierarchyBuilderTest.HierarchyBuilderTestConfiguration> configurator) {
    @Extension
    final AbstractHierarchyBuilderTest.HierarchyBuilderTestConfiguration configuration = new AbstractHierarchyBuilderTest.HierarchyBuilderTestConfiguration();
    configurator.apply(configuration);
    final ResourceSet resourceSet = this.createResourceSet(configuration);
    final HierarchyBuilder hierarchyBuilder = configuration.hierarchyBuilderProvider.apply(resourceSet);
    final HierarchyContext hierarchyContext = configuration.hierarchyContextProvider.apply(resourceSet);
    String _xifexpression = null;
    if ((configuration.resourceURI == null)) {
      Pair<String, String> _last = IterableExtensions.<Pair<String, String>>last(configuration.models);
      _xifexpression = _last.getKey();
    } else {
      _xifexpression = configuration.resourceURI;
    }
    final String resourceURI = _xifexpression;
    URI _createURI = URI.createURI(resourceURI);
    Resource _resource = resourceSet.getResource(_createURI, false);
    final XtextResource resource = ((XtextResource) _resource);
    EObject _resolveElementAt = this._eObjectAtOffsetHelper.resolveElementAt(resource, configuration.index);
    final URI uri = EcoreUtil2.getPlatformResourceOrNormalizedURI(_resolveElementAt);
    final String actualHierarchy = this.toExpectation(uri, hierarchyBuilder, hierarchyContext);
    Assert.assertEquals(configuration.expectedHierarchy, actualHierarchy);
  }
  
  protected ResourceSet createResourceSet(@Extension final AbstractHierarchyBuilderTest.HierarchyBuilderTestConfiguration configuration) {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      for (final Pair<String, String> model : configuration.models) {
        {
          String _key = model.getKey();
          URI _createURI = URI.createURI(_key);
          final Resource resource = resourceSet.createResource(_createURI);
          String _value = model.getValue();
          LazyStringInputStream _lazyStringInputStream = new LazyStringInputStream(_value, "UTF-8");
          resource.load(_lazyStringInputStream, null);
          this._validationTestHelper.assertNoIssues(resource);
        }
      }
      return resourceSet;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected <T extends AbstractHierarchyBuilder> T configureBuilderWith(final T hierarchyBuilder, final ResourceSet resourceSet) {
    SimpleLocalResourceAccess _simpleLocalResourceAccess = new SimpleLocalResourceAccess(resourceSet);
    hierarchyBuilder.setResourceAccess(_simpleLocalResourceAccess);
    IResourceDescriptions _resourceDescriptions = this.resourceDescriptionsProvider.getResourceDescriptions(resourceSet);
    hierarchyBuilder.setIndexData(_resourceDescriptions);
    return hierarchyBuilder;
  }
  
  protected String toExpectation(final URI uri, final HierarchyBuilder builder, final HierarchyContext context) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Collection<HierarchyNode> _buildRoots = builder.buildRoots(uri, context, null);
      for(final HierarchyNode root : _buildRoots) {
        String _expectation = this.toExpectation(root, builder, context);
        _builder.append(_expectation, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String toExpectation(final HierarchyNode node, final HierarchyBuilder builder, final HierarchyContext context) {
    StringConcatenation _builder = new StringConcatenation();
    Object _element = node.getElement();
    _builder.append(_element, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _internalToExpectation = this.internalToExpectation(node, builder, context);
    _builder.append(_internalToExpectation, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String internalToExpectation(final HierarchyNode node, final HierarchyBuilder builder, final HierarchyContext context) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Collection<HierarchyNodeLocation> _locations = node.getLocations();
      for(final HierarchyNodeLocation location : _locations) {
        String _expectation = this.toExpectation(location);
        _builder.append(_expectation, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _mayHaveChildren = builder.mayHaveChildren(node, context, null);
      if (_mayHaveChildren) {
        {
          Collection<HierarchyNode> _buildChildren = builder.buildChildren(node, context, null);
          for(final HierarchyNode childNode : _buildChildren) {
            String _expectation_1 = this.toExpectation(childNode, builder, context);
            _builder.append(_expectation_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String toExpectation(final HierarchyNodeLocation location) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\'");
    String _text = location.getText();
    _builder.append(_text, "");
    _builder.append("\' [");
    int _offset = location.getOffset();
    _builder.append(_offset, "");
    _builder.append(", ");
    int _length = location.getLength();
    _builder.append(_length, "");
    _builder.append("]");
    return _builder.toString();
  }
}
