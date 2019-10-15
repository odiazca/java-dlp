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

public interface CharsToIgnoreOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CharsToIgnore)
    com.google.protobuf.MessageOrBuilder {

  /** <code>string characters_to_skip = 1;</code> */
  java.lang.String getCharactersToSkip();
  /** <code>string characters_to_skip = 1;</code> */
  com.google.protobuf.ByteString getCharactersToSkipBytes();

  /**
   * <code>.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;
   * </code>
   */
  int getCommonCharactersToIgnoreValue();
  /**
   * <code>.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;
   * </code>
   */
  com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore getCommonCharactersToIgnore();

  public com.google.privacy.dlp.v2.CharsToIgnore.CharactersCase getCharactersCase();
}
