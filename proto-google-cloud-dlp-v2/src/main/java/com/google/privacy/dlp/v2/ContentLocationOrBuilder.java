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

public interface ContentLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ContentLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the container where the finding is located.
   * The top level name is the source file name or table name. Names of some
   * common storage containers are formatted as follows:
   * * BigQuery tables:  `&lt;project_id&gt;:&lt;dataset_id&gt;.&lt;table_id&gt;`
   * * Cloud Storage files: `gs://&lt;bucket&gt;/&lt;path&gt;`
   * * Datastore namespace: &lt;namespace&gt;
   * Nested names could be absent if the embedded object has no string
   * identifier (for an example an image contained within a document).
   * </pre>
   *
   * <code>string container_name = 1;</code>
   */
  java.lang.String getContainerName();
  /**
   *
   *
   * <pre>
   * Name of the container where the finding is located.
   * The top level name is the source file name or table name. Names of some
   * common storage containers are formatted as follows:
   * * BigQuery tables:  `&lt;project_id&gt;:&lt;dataset_id&gt;.&lt;table_id&gt;`
   * * Cloud Storage files: `gs://&lt;bucket&gt;/&lt;path&gt;`
   * * Datastore namespace: &lt;namespace&gt;
   * Nested names could be absent if the embedded object has no string
   * identifier (for an example an image contained within a document).
   * </pre>
   *
   * <code>string container_name = 1;</code>
   */
  com.google.protobuf.ByteString getContainerNameBytes();

  /**
   *
   *
   * <pre>
   * Location within a row or record of a database table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordLocation record_location = 2;</code>
   */
  boolean hasRecordLocation();
  /**
   *
   *
   * <pre>
   * Location within a row or record of a database table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordLocation record_location = 2;</code>
   */
  com.google.privacy.dlp.v2.RecordLocation getRecordLocation();
  /**
   *
   *
   * <pre>
   * Location within a row or record of a database table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordLocation record_location = 2;</code>
   */
  com.google.privacy.dlp.v2.RecordLocationOrBuilder getRecordLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Location within an image's pixels.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ImageLocation image_location = 3;</code>
   */
  boolean hasImageLocation();
  /**
   *
   *
   * <pre>
   * Location within an image's pixels.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ImageLocation image_location = 3;</code>
   */
  com.google.privacy.dlp.v2.ImageLocation getImageLocation();
  /**
   *
   *
   * <pre>
   * Location within an image's pixels.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ImageLocation image_location = 3;</code>
   */
  com.google.privacy.dlp.v2.ImageLocationOrBuilder getImageLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Location data for document files.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DocumentLocation document_location = 5;</code>
   */
  boolean hasDocumentLocation();
  /**
   *
   *
   * <pre>
   * Location data for document files.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DocumentLocation document_location = 5;</code>
   */
  com.google.privacy.dlp.v2.DocumentLocation getDocumentLocation();
  /**
   *
   *
   * <pre>
   * Location data for document files.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DocumentLocation document_location = 5;</code>
   */
  com.google.privacy.dlp.v2.DocumentLocationOrBuilder getDocumentLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable.
   * For Google Cloud Storage contains last file modification timestamp.
   * For BigQuery table contains last_modified_time property.
   * For Datastore - not populated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp container_timestamp = 6;</code>
   */
  boolean hasContainerTimestamp();
  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable.
   * For Google Cloud Storage contains last file modification timestamp.
   * For BigQuery table contains last_modified_time property.
   * For Datastore - not populated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp container_timestamp = 6;</code>
   */
  com.google.protobuf.Timestamp getContainerTimestamp();
  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable.
   * For Google Cloud Storage contains last file modification timestamp.
   * For BigQuery table contains last_modified_time property.
   * For Datastore - not populated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp container_timestamp = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getContainerTimestampOrBuilder();

  /**
   *
   *
   * <pre>
   * Findings container version, if available
   * ("generation" for Google Cloud Storage).
   * </pre>
   *
   * <code>string container_version = 7;</code>
   */
  java.lang.String getContainerVersion();
  /**
   *
   *
   * <pre>
   * Findings container version, if available
   * ("generation" for Google Cloud Storage).
   * </pre>
   *
   * <code>string container_version = 7;</code>
   */
  com.google.protobuf.ByteString getContainerVersionBytes();

  public com.google.privacy.dlp.v2.ContentLocation.LocationCase getLocationCase();
}
