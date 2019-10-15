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

public interface CharacterMaskConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CharacterMaskConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Character to mask the sensitive values&amp;mdash;for example, "*" for an
   * alphabetic string such as name, or "0" for a numeric string such as ZIP
   * code or credit card number. String must have length 1. If not supplied, we
   * will default to "*" for strings, 0 for digits.
   * </pre>
   *
   * <code>string masking_character = 1;</code>
   */
  java.lang.String getMaskingCharacter();
  /**
   *
   *
   * <pre>
   * Character to mask the sensitive values&amp;mdash;for example, "*" for an
   * alphabetic string such as name, or "0" for a numeric string such as ZIP
   * code or credit card number. String must have length 1. If not supplied, we
   * will default to "*" for strings, 0 for digits.
   * </pre>
   *
   * <code>string masking_character = 1;</code>
   */
  com.google.protobuf.ByteString getMaskingCharacterBytes();

  /**
   *
   *
   * <pre>
   * Number of characters to mask. If not set, all matching chars will be
   * masked. Skipped characters do not count towards this tally.
   * </pre>
   *
   * <code>int32 number_to_mask = 2;</code>
   */
  int getNumberToMask();

  /**
   *
   *
   * <pre>
   * Mask characters in reverse order. For example, if `masking_character` is
   * '0', number_to_mask is 14, and `reverse_order` is false, then
   * 1234-5678-9012-3456 -&gt; 00000000000000-3456
   * If `masking_character` is '*', `number_to_mask` is 3, and `reverse_order`
   * is true, then 12345 -&gt; 12***
   * </pre>
   *
   * <code>bool reverse_order = 3;</code>
   */
  boolean getReverseOrder();

  /**
   *
   *
   * <pre>
   * When masking a string, items in this list will be skipped when replacing.
   * For example, if your string is 555-555-5555 and you ask us to skip `-` and
   * mask 5 chars with * we would produce ***-*55-5555.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CharsToIgnore characters_to_ignore = 4;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.CharsToIgnore> getCharactersToIgnoreList();
  /**
   *
   *
   * <pre>
   * When masking a string, items in this list will be skipped when replacing.
   * For example, if your string is 555-555-5555 and you ask us to skip `-` and
   * mask 5 chars with * we would produce ***-*55-5555.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CharsToIgnore characters_to_ignore = 4;</code>
   */
  com.google.privacy.dlp.v2.CharsToIgnore getCharactersToIgnore(int index);
  /**
   *
   *
   * <pre>
   * When masking a string, items in this list will be skipped when replacing.
   * For example, if your string is 555-555-5555 and you ask us to skip `-` and
   * mask 5 chars with * we would produce ***-*55-5555.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CharsToIgnore characters_to_ignore = 4;</code>
   */
  int getCharactersToIgnoreCount();
  /**
   *
   *
   * <pre>
   * When masking a string, items in this list will be skipped when replacing.
   * For example, if your string is 555-555-5555 and you ask us to skip `-` and
   * mask 5 chars with * we would produce ***-*55-5555.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CharsToIgnore characters_to_ignore = 4;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.CharsToIgnoreOrBuilder>
      getCharactersToIgnoreOrBuilderList();
  /**
   *
   *
   * <pre>
   * When masking a string, items in this list will be skipped when replacing.
   * For example, if your string is 555-555-5555 and you ask us to skip `-` and
   * mask 5 chars with * we would produce ***-*55-5555.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CharsToIgnore characters_to_ignore = 4;</code>
   */
  com.google.privacy.dlp.v2.CharsToIgnoreOrBuilder getCharactersToIgnoreOrBuilder(int index);
}
