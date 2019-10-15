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

/**
 *
 *
 * <pre>
 * Request message for CreateStoredInfoType.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.CreateStoredInfoTypeRequest}
 */
public final class CreateStoredInfoTypeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.CreateStoredInfoTypeRequest)
    CreateStoredInfoTypeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateStoredInfoTypeRequest.newBuilder() to construct.
  private CreateStoredInfoTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateStoredInfoTypeRequest() {
    parent_ = "";
    storedInfoTypeId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateStoredInfoTypeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder subBuilder = null;
              if (config_ != null) {
                subBuilder = config_.toBuilder();
              }
              config_ =
                  input.readMessage(
                      com.google.privacy.dlp.v2.StoredInfoTypeConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(config_);
                config_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              storedInfoTypeId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_CreateStoredInfoTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_CreateStoredInfoTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest.class,
            com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
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
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
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
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIG_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.StoredInfoTypeConfig config_;
  /**
   *
   *
   * <pre>
   * Configuration of the storedInfoType to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
   */
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   *
   *
   * <pre>
   * Configuration of the storedInfoType to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
   */
  public com.google.privacy.dlp.v2.StoredInfoTypeConfig getConfig() {
    return config_ == null
        ? com.google.privacy.dlp.v2.StoredInfoTypeConfig.getDefaultInstance()
        : config_;
  }
  /**
   *
   *
   * <pre>
   * Configuration of the storedInfoType to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
   */
  public com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder getConfigOrBuilder() {
    return getConfig();
  }

  public static final int STORED_INFO_TYPE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object storedInfoTypeId_;
  /**
   *
   *
   * <pre>
   * The storedInfoType ID can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string stored_info_type_id = 3;</code>
   */
  public java.lang.String getStoredInfoTypeId() {
    java.lang.Object ref = storedInfoTypeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storedInfoTypeId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The storedInfoType ID can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string stored_info_type_id = 3;</code>
   */
  public com.google.protobuf.ByteString getStoredInfoTypeIdBytes() {
    java.lang.Object ref = storedInfoTypeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      storedInfoTypeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (config_ != null) {
      output.writeMessage(2, getConfig());
    }
    if (!getStoredInfoTypeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, storedInfoTypeId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getConfig());
    }
    if (!getStoredInfoTypeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, storedInfoTypeId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest other =
        (com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig().equals(other.getConfig())) return false;
    }
    if (!getStoredInfoTypeId().equals(other.getStoredInfoTypeId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (37 * hash) + STORED_INFO_TYPE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStoredInfoTypeId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for CreateStoredInfoType.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.CreateStoredInfoTypeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.CreateStoredInfoTypeRequest)
      com.google.privacy.dlp.v2.CreateStoredInfoTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_CreateStoredInfoTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_CreateStoredInfoTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest.class,
              com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
      storedInfoTypeId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_CreateStoredInfoTypeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest build() {
      com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest buildPartial() {
      com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest result =
          new com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest(this);
      result.parent_ = parent_;
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
      }
      result.storedInfoTypeId_ = storedInfoTypeId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest) {
        return mergeFrom((com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest other) {
      if (other == com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      if (!other.getStoredInfoTypeId().isEmpty()) {
        storedInfoTypeId_ = other.storedInfoTypeId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
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
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
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
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
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
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
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
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
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
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.privacy.dlp.v2.StoredInfoTypeConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.StoredInfoTypeConfig,
            com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder,
            com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder>
        configBuilder_;
    /**
     *
     *
     * <pre>
     * Configuration of the storedInfoType to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     *
     *
     * <pre>
     * Configuration of the storedInfoType to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public com.google.privacy.dlp.v2.StoredInfoTypeConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null
            ? com.google.privacy.dlp.v2.StoredInfoTypeConfig.getDefaultInstance()
            : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Configuration of the storedInfoType to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public Builder setConfig(com.google.privacy.dlp.v2.StoredInfoTypeConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration of the storedInfoType to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public Builder setConfig(
        com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration of the storedInfoType to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public Builder mergeConfig(com.google.privacy.dlp.v2.StoredInfoTypeConfig value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
              com.google.privacy.dlp.v2.StoredInfoTypeConfig.newBuilder(config_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration of the storedInfoType to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration of the storedInfoType to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder getConfigBuilder() {

      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Configuration of the storedInfoType to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null
            ? com.google.privacy.dlp.v2.StoredInfoTypeConfig.getDefaultInstance()
            : config_;
      }
    }
    /**
     *
     *
     * <pre>
     * Configuration of the storedInfoType to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.StoredInfoTypeConfig,
            com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder,
            com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder>
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.StoredInfoTypeConfig,
                com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder,
                com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder>(
                getConfig(), getParentForChildren(), isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    private java.lang.Object storedInfoTypeId_ = "";
    /**
     *
     *
     * <pre>
     * The storedInfoType ID can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string stored_info_type_id = 3;</code>
     */
    public java.lang.String getStoredInfoTypeId() {
      java.lang.Object ref = storedInfoTypeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storedInfoTypeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The storedInfoType ID can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string stored_info_type_id = 3;</code>
     */
    public com.google.protobuf.ByteString getStoredInfoTypeIdBytes() {
      java.lang.Object ref = storedInfoTypeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        storedInfoTypeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The storedInfoType ID can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string stored_info_type_id = 3;</code>
     */
    public Builder setStoredInfoTypeId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      storedInfoTypeId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The storedInfoType ID can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string stored_info_type_id = 3;</code>
     */
    public Builder clearStoredInfoTypeId() {

      storedInfoTypeId_ = getDefaultInstance().getStoredInfoTypeId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The storedInfoType ID can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string stored_info_type_id = 3;</code>
     */
    public Builder setStoredInfoTypeIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      storedInfoTypeId_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.CreateStoredInfoTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.CreateStoredInfoTypeRequest)
  private static final com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest();
  }

  public static com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateStoredInfoTypeRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateStoredInfoTypeRequest>() {
        @java.lang.Override
        public CreateStoredInfoTypeRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateStoredInfoTypeRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateStoredInfoTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateStoredInfoTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
