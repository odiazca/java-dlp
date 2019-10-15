/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface UpdateDeidentifyTemplateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of organization and deidentify template to be updated, for
   * example `organizations/433245324/deidentifyTemplates/432452342` or
   * projects/project-id/deidentifyTemplates/432452342.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name of organization and deidentify template to be updated, for
   * example `organizations/433245324/deidentifyTemplates/432452342` or
   * projects/project-id/deidentifyTemplates/432452342.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * New DeidentifyTemplate value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
   */
  boolean hasDeidentifyTemplate();
  /**
   *
   *
   * <pre>
   * New DeidentifyTemplate value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
   */
  com.google.privacy.dlp.v2.DeidentifyTemplate getDeidentifyTemplate();
  /**
   *
   *
   * <pre>
   * New DeidentifyTemplate value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2;</code>
   */
  com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder getDeidentifyTemplateOrBuilder();

  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
