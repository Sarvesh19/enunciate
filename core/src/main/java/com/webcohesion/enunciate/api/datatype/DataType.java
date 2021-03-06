package com.webcohesion.enunciate.api.datatype;

import com.webcohesion.enunciate.api.HasStyles;
import com.webcohesion.enunciate.javac.javadoc.JavaDoc;

import javax.lang.model.element.AnnotationMirror;
import java.util.List;
import java.util.Map;

/**
 * @author Ryan Heaton
 */
public interface DataType extends HasStyles {

  String getLabel();

  String getSlug();

  String getDescription();

  String getDeprecated();

  Namespace getNamespace();

  Syntax getSyntax();

  BaseType getBaseType();

  List<DataTypeReference> getSupertypes();

  String getSince();

  String getVersion();

  Example getExample();

  List<? extends Value> getValues();

  List<? extends Property> getProperties();

  Map<String, String> getPropertyMetadata();

  Map<String, AnnotationMirror> getAnnotations();

  JavaDoc getJavaDoc();
}
