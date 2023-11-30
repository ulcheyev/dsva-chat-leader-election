// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatService.proto

// Protobuf Java Version: 3.25.0
package generated;

/**
 * Protobuf type {@code generated.RemoteResponse}
 */
public final class RemoteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:generated.RemoteResponse)
    RemoteResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoteResponse.newBuilder() to construct.
  private RemoteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoteResponse() {
    remotes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoteResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.ChatServiceOuterClass.internal_static_generated_RemoteResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.ChatServiceOuterClass.internal_static_generated_RemoteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.RemoteResponse.class, generated.RemoteResponse.Builder.class);
  }

  public static final int ADDED_FIELD_NUMBER = 1;
  private boolean added_ = false;
  /**
   * <code>bool added = 1;</code>
   * @return The added.
   */
  @java.lang.Override
  public boolean getAdded() {
    return added_;
  }

  public static final int REMOTES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<generated.Remote> remotes_;
  /**
   * <code>repeated .generated.Remote remotes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<generated.Remote> getRemotesList() {
    return remotes_;
  }
  /**
   * <code>repeated .generated.Remote remotes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends generated.RemoteOrBuilder> 
      getRemotesOrBuilderList() {
    return remotes_;
  }
  /**
   * <code>repeated .generated.Remote remotes = 2;</code>
   */
  @java.lang.Override
  public int getRemotesCount() {
    return remotes_.size();
  }
  /**
   * <code>repeated .generated.Remote remotes = 2;</code>
   */
  @java.lang.Override
  public generated.Remote getRemotes(int index) {
    return remotes_.get(index);
  }
  /**
   * <code>repeated .generated.Remote remotes = 2;</code>
   */
  @java.lang.Override
  public generated.RemoteOrBuilder getRemotesOrBuilder(
      int index) {
    return remotes_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (added_ != false) {
      output.writeBool(1, added_);
    }
    for (int i = 0; i < remotes_.size(); i++) {
      output.writeMessage(2, remotes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (added_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, added_);
    }
    for (int i = 0; i < remotes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, remotes_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.RemoteResponse)) {
      return super.equals(obj);
    }
    generated.RemoteResponse other = (generated.RemoteResponse) obj;

    if (getAdded()
        != other.getAdded()) return false;
    if (!getRemotesList()
        .equals(other.getRemotesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ADDED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAdded());
    if (getRemotesCount() > 0) {
      hash = (37 * hash) + REMOTES_FIELD_NUMBER;
      hash = (53 * hash) + getRemotesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.RemoteResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.RemoteResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.RemoteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.RemoteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.RemoteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.RemoteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.RemoteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.RemoteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static generated.RemoteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static generated.RemoteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.RemoteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.RemoteResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.RemoteResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code generated.RemoteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:generated.RemoteResponse)
      generated.RemoteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.ChatServiceOuterClass.internal_static_generated_RemoteResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.ChatServiceOuterClass.internal_static_generated_RemoteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.RemoteResponse.class, generated.RemoteResponse.Builder.class);
    }

    // Construct using generated.RemoteResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      added_ = false;
      if (remotesBuilder_ == null) {
        remotes_ = java.util.Collections.emptyList();
      } else {
        remotes_ = null;
        remotesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.ChatServiceOuterClass.internal_static_generated_RemoteResponse_descriptor;
    }

    @java.lang.Override
    public generated.RemoteResponse getDefaultInstanceForType() {
      return generated.RemoteResponse.getDefaultInstance();
    }

    @java.lang.Override
    public generated.RemoteResponse build() {
      generated.RemoteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.RemoteResponse buildPartial() {
      generated.RemoteResponse result = new generated.RemoteResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(generated.RemoteResponse result) {
      if (remotesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          remotes_ = java.util.Collections.unmodifiableList(remotes_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.remotes_ = remotes_;
      } else {
        result.remotes_ = remotesBuilder_.build();
      }
    }

    private void buildPartial0(generated.RemoteResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.added_ = added_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.RemoteResponse) {
        return mergeFrom((generated.RemoteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.RemoteResponse other) {
      if (other == generated.RemoteResponse.getDefaultInstance()) return this;
      if (other.getAdded() != false) {
        setAdded(other.getAdded());
      }
      if (remotesBuilder_ == null) {
        if (!other.remotes_.isEmpty()) {
          if (remotes_.isEmpty()) {
            remotes_ = other.remotes_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRemotesIsMutable();
            remotes_.addAll(other.remotes_);
          }
          onChanged();
        }
      } else {
        if (!other.remotes_.isEmpty()) {
          if (remotesBuilder_.isEmpty()) {
            remotesBuilder_.dispose();
            remotesBuilder_ = null;
            remotes_ = other.remotes_;
            bitField0_ = (bitField0_ & ~0x00000002);
            remotesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRemotesFieldBuilder() : null;
          } else {
            remotesBuilder_.addAllMessages(other.remotes_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              added_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              generated.Remote m =
                  input.readMessage(
                      generated.Remote.parser(),
                      extensionRegistry);
              if (remotesBuilder_ == null) {
                ensureRemotesIsMutable();
                remotes_.add(m);
              } else {
                remotesBuilder_.addMessage(m);
              }
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private boolean added_ ;
    /**
     * <code>bool added = 1;</code>
     * @return The added.
     */
    @java.lang.Override
    public boolean getAdded() {
      return added_;
    }
    /**
     * <code>bool added = 1;</code>
     * @param value The added to set.
     * @return This builder for chaining.
     */
    public Builder setAdded(boolean value) {

      added_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool added = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdded() {
      bitField0_ = (bitField0_ & ~0x00000001);
      added_ = false;
      onChanged();
      return this;
    }

    private java.util.List<generated.Remote> remotes_ =
      java.util.Collections.emptyList();
    private void ensureRemotesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        remotes_ = new java.util.ArrayList<generated.Remote>(remotes_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        generated.Remote, generated.Remote.Builder, generated.RemoteOrBuilder> remotesBuilder_;

    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public java.util.List<generated.Remote> getRemotesList() {
      if (remotesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(remotes_);
      } else {
        return remotesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public int getRemotesCount() {
      if (remotesBuilder_ == null) {
        return remotes_.size();
      } else {
        return remotesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public generated.Remote getRemotes(int index) {
      if (remotesBuilder_ == null) {
        return remotes_.get(index);
      } else {
        return remotesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public Builder setRemotes(
        int index, generated.Remote value) {
      if (remotesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRemotesIsMutable();
        remotes_.set(index, value);
        onChanged();
      } else {
        remotesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public Builder setRemotes(
        int index, generated.Remote.Builder builderForValue) {
      if (remotesBuilder_ == null) {
        ensureRemotesIsMutable();
        remotes_.set(index, builderForValue.build());
        onChanged();
      } else {
        remotesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public Builder addRemotes(generated.Remote value) {
      if (remotesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRemotesIsMutable();
        remotes_.add(value);
        onChanged();
      } else {
        remotesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public Builder addRemotes(
        int index, generated.Remote value) {
      if (remotesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRemotesIsMutable();
        remotes_.add(index, value);
        onChanged();
      } else {
        remotesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public Builder addRemotes(
        generated.Remote.Builder builderForValue) {
      if (remotesBuilder_ == null) {
        ensureRemotesIsMutable();
        remotes_.add(builderForValue.build());
        onChanged();
      } else {
        remotesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public Builder addRemotes(
        int index, generated.Remote.Builder builderForValue) {
      if (remotesBuilder_ == null) {
        ensureRemotesIsMutable();
        remotes_.add(index, builderForValue.build());
        onChanged();
      } else {
        remotesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public Builder addAllRemotes(
        java.lang.Iterable<? extends generated.Remote> values) {
      if (remotesBuilder_ == null) {
        ensureRemotesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, remotes_);
        onChanged();
      } else {
        remotesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public Builder clearRemotes() {
      if (remotesBuilder_ == null) {
        remotes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        remotesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public Builder removeRemotes(int index) {
      if (remotesBuilder_ == null) {
        ensureRemotesIsMutable();
        remotes_.remove(index);
        onChanged();
      } else {
        remotesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public generated.Remote.Builder getRemotesBuilder(
        int index) {
      return getRemotesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public generated.RemoteOrBuilder getRemotesOrBuilder(
        int index) {
      if (remotesBuilder_ == null) {
        return remotes_.get(index);  } else {
        return remotesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public java.util.List<? extends generated.RemoteOrBuilder> 
         getRemotesOrBuilderList() {
      if (remotesBuilder_ != null) {
        return remotesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(remotes_);
      }
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public generated.Remote.Builder addRemotesBuilder() {
      return getRemotesFieldBuilder().addBuilder(
          generated.Remote.getDefaultInstance());
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public generated.Remote.Builder addRemotesBuilder(
        int index) {
      return getRemotesFieldBuilder().addBuilder(
          index, generated.Remote.getDefaultInstance());
    }
    /**
     * <code>repeated .generated.Remote remotes = 2;</code>
     */
    public java.util.List<generated.Remote.Builder> 
         getRemotesBuilderList() {
      return getRemotesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        generated.Remote, generated.Remote.Builder, generated.RemoteOrBuilder> 
        getRemotesFieldBuilder() {
      if (remotesBuilder_ == null) {
        remotesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            generated.Remote, generated.Remote.Builder, generated.RemoteOrBuilder>(
                remotes_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        remotes_ = null;
      }
      return remotesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:generated.RemoteResponse)
  }

  // @@protoc_insertion_point(class_scope:generated.RemoteResponse)
  private static final generated.RemoteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.RemoteResponse();
  }

  public static generated.RemoteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoteResponse>
      PARSER = new com.google.protobuf.AbstractParser<RemoteResponse>() {
    @java.lang.Override
    public RemoteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RemoteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoteResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.RemoteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

