// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Replace each input value with a given `Value`.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ReplaceValueConfig}
 */
public  final class ReplaceValueConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ReplaceValueConfig)
    ReplaceValueConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReplaceValueConfig.newBuilder() to construct.
  private ReplaceValueConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReplaceValueConfig() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReplaceValueConfig(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.privacy.dlp.v2.Value.Builder subBuilder = null;
            if (newValue_ != null) {
              subBuilder = newValue_.toBuilder();
            }
            newValue_ = input.readMessage(com.google.privacy.dlp.v2.Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(newValue_);
              newValue_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ReplaceValueConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ReplaceValueConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ReplaceValueConfig.class, com.google.privacy.dlp.v2.ReplaceValueConfig.Builder.class);
  }

  public static final int NEW_VALUE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.Value newValue_;
  /**
   * <pre>
   * Value to replace it with.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
   */
  public boolean hasNewValue() {
    return newValue_ != null;
  }
  /**
   * <pre>
   * Value to replace it with.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
   */
  public com.google.privacy.dlp.v2.Value getNewValue() {
    return newValue_ == null ? com.google.privacy.dlp.v2.Value.getDefaultInstance() : newValue_;
  }
  /**
   * <pre>
   * Value to replace it with.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
   */
  public com.google.privacy.dlp.v2.ValueOrBuilder getNewValueOrBuilder() {
    return getNewValue();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (newValue_ != null) {
      output.writeMessage(1, getNewValue());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (newValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNewValue());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ReplaceValueConfig)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ReplaceValueConfig other = (com.google.privacy.dlp.v2.ReplaceValueConfig) obj;

    boolean result = true;
    result = result && (hasNewValue() == other.hasNewValue());
    if (hasNewValue()) {
      result = result && getNewValue()
          .equals(other.getNewValue());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasNewValue()) {
      hash = (37 * hash) + NEW_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getNewValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.privacy.dlp.v2.ReplaceValueConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Replace each input value with a given `Value`.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ReplaceValueConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ReplaceValueConfig)
      com.google.privacy.dlp.v2.ReplaceValueConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ReplaceValueConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ReplaceValueConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ReplaceValueConfig.class, com.google.privacy.dlp.v2.ReplaceValueConfig.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ReplaceValueConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (newValueBuilder_ == null) {
        newValue_ = null;
      } else {
        newValue_ = null;
        newValueBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ReplaceValueConfig_descriptor;
    }

    public com.google.privacy.dlp.v2.ReplaceValueConfig getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ReplaceValueConfig.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2.ReplaceValueConfig build() {
      com.google.privacy.dlp.v2.ReplaceValueConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2.ReplaceValueConfig buildPartial() {
      com.google.privacy.dlp.v2.ReplaceValueConfig result = new com.google.privacy.dlp.v2.ReplaceValueConfig(this);
      if (newValueBuilder_ == null) {
        result.newValue_ = newValue_;
      } else {
        result.newValue_ = newValueBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2.ReplaceValueConfig) {
        return mergeFrom((com.google.privacy.dlp.v2.ReplaceValueConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ReplaceValueConfig other) {
      if (other == com.google.privacy.dlp.v2.ReplaceValueConfig.getDefaultInstance()) return this;
      if (other.hasNewValue()) {
        mergeNewValue(other.getNewValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2.ReplaceValueConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.ReplaceValueConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2.Value newValue_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.Value, com.google.privacy.dlp.v2.Value.Builder, com.google.privacy.dlp.v2.ValueOrBuilder> newValueBuilder_;
    /**
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public boolean hasNewValue() {
      return newValueBuilder_ != null || newValue_ != null;
    }
    /**
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public com.google.privacy.dlp.v2.Value getNewValue() {
      if (newValueBuilder_ == null) {
        return newValue_ == null ? com.google.privacy.dlp.v2.Value.getDefaultInstance() : newValue_;
      } else {
        return newValueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public Builder setNewValue(com.google.privacy.dlp.v2.Value value) {
      if (newValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newValue_ = value;
        onChanged();
      } else {
        newValueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public Builder setNewValue(
        com.google.privacy.dlp.v2.Value.Builder builderForValue) {
      if (newValueBuilder_ == null) {
        newValue_ = builderForValue.build();
        onChanged();
      } else {
        newValueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public Builder mergeNewValue(com.google.privacy.dlp.v2.Value value) {
      if (newValueBuilder_ == null) {
        if (newValue_ != null) {
          newValue_ =
            com.google.privacy.dlp.v2.Value.newBuilder(newValue_).mergeFrom(value).buildPartial();
        } else {
          newValue_ = value;
        }
        onChanged();
      } else {
        newValueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public Builder clearNewValue() {
      if (newValueBuilder_ == null) {
        newValue_ = null;
        onChanged();
      } else {
        newValue_ = null;
        newValueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public com.google.privacy.dlp.v2.Value.Builder getNewValueBuilder() {
      
      onChanged();
      return getNewValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public com.google.privacy.dlp.v2.ValueOrBuilder getNewValueOrBuilder() {
      if (newValueBuilder_ != null) {
        return newValueBuilder_.getMessageOrBuilder();
      } else {
        return newValue_ == null ?
            com.google.privacy.dlp.v2.Value.getDefaultInstance() : newValue_;
      }
    }
    /**
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.Value, com.google.privacy.dlp.v2.Value.Builder, com.google.privacy.dlp.v2.ValueOrBuilder> 
        getNewValueFieldBuilder() {
      if (newValueBuilder_ == null) {
        newValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.Value, com.google.privacy.dlp.v2.Value.Builder, com.google.privacy.dlp.v2.ValueOrBuilder>(
                getNewValue(),
                getParentForChildren(),
                isClean());
        newValue_ = null;
      }
      return newValueBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ReplaceValueConfig)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ReplaceValueConfig)
  private static final com.google.privacy.dlp.v2.ReplaceValueConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ReplaceValueConfig();
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplaceValueConfig>
      PARSER = new com.google.protobuf.AbstractParser<ReplaceValueConfig>() {
    public ReplaceValueConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReplaceValueConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReplaceValueConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplaceValueConfig> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2.ReplaceValueConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

