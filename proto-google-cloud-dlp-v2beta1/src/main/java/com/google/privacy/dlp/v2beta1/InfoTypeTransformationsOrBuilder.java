// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

public interface InfoTypeTransformationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.InfoTypeTransformations)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Transformation for each info type. Cannot specify more than one
   * for a given info type. [required]
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.InfoTypeTransformations.InfoTypeTransformation transformations = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2beta1.InfoTypeTransformations.InfoTypeTransformation> 
      getTransformationsList();
  /**
   * <pre>
   * Transformation for each info type. Cannot specify more than one
   * for a given info type. [required]
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.InfoTypeTransformations.InfoTypeTransformation transformations = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoTypeTransformations.InfoTypeTransformation getTransformations(int index);
  /**
   * <pre>
   * Transformation for each info type. Cannot specify more than one
   * for a given info type. [required]
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.InfoTypeTransformations.InfoTypeTransformation transformations = 1;</code>
   */
  int getTransformationsCount();
  /**
   * <pre>
   * Transformation for each info type. Cannot specify more than one
   * for a given info type. [required]
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.InfoTypeTransformations.InfoTypeTransformation transformations = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2beta1.InfoTypeTransformations.InfoTypeTransformationOrBuilder> 
      getTransformationsOrBuilderList();
  /**
   * <pre>
   * Transformation for each info type. Cannot specify more than one
   * for a given info type. [required]
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.InfoTypeTransformations.InfoTypeTransformation transformations = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoTypeTransformations.InfoTypeTransformationOrBuilder getTransformationsOrBuilder(
      int index);
}
