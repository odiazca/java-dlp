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

public interface BucketingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.BucketingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Set of buckets. Ranges must be non-overlapping.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BucketingConfig.Bucket buckets = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.BucketingConfig.Bucket> getBucketsList();
  /**
   *
   *
   * <pre>
   * Set of buckets. Ranges must be non-overlapping.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BucketingConfig.Bucket buckets = 1;</code>
   */
  com.google.privacy.dlp.v2.BucketingConfig.Bucket getBuckets(int index);
  /**
   *
   *
   * <pre>
   * Set of buckets. Ranges must be non-overlapping.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BucketingConfig.Bucket buckets = 1;</code>
   */
  int getBucketsCount();
  /**
   *
   *
   * <pre>
   * Set of buckets. Ranges must be non-overlapping.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BucketingConfig.Bucket buckets = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.BucketingConfig.BucketOrBuilder>
      getBucketsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Set of buckets. Ranges must be non-overlapping.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BucketingConfig.Bucket buckets = 1;</code>
   */
  com.google.privacy.dlp.v2.BucketingConfig.BucketOrBuilder getBucketsOrBuilder(int index);
}
