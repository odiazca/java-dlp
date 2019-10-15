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

public interface ListStoredInfoTypesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListStoredInfoTypesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional page token to continue retrieval. Comes from previous call
   * to `ListStoredInfoTypes`.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional page token to continue retrieval. Comes from previous call
   * to `ListStoredInfoTypes`.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional size of the page, can be limited by server. If zero server returns
   * a page of max size 100.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional comma separated list of fields to order by,
   * followed by `asc` or `desc` postfix. This list is case-insensitive,
   * default sorting order is ascending, redundant space characters are
   * insignificant.
   * Example: `name asc, display_name, create_time desc`
   * Supported fields are:
   * - `create_time`: corresponds to time the most recent version of the
   * resource was created.
   * - `state`: corresponds to the state of the resource.
   * - `name`: corresponds to resource name.
   * - `display_name`: corresponds to info type's display name.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional comma separated list of fields to order by,
   * followed by `asc` or `desc` postfix. This list is case-insensitive,
   * default sorting order is ascending, redundant space characters are
   * insignificant.
   * Example: `name asc, display_name, create_time desc`
   * Supported fields are:
   * - `create_time`: corresponds to time the most recent version of the
   * resource was created.
   * - `state`: corresponds to the state of the resource.
   * - `name`: corresponds to resource name.
   * - `display_name`: corresponds to info type's display name.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
