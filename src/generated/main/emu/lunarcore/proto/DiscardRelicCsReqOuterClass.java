// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DiscardRelicCsReq.proto
// Protobuf Java Version: 4.26.0-rc1

package emu.lunarcore.proto;

public final class DiscardRelicCsReqOuterClass {
  private DiscardRelicCsReqOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "-rc1",
      DiscardRelicCsReqOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DiscardRelicCsReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DiscardRelicCsReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 relic_unique_id = 13;</code>
     * @return The relicUniqueId.
     */
    int getRelicUniqueId();

    /**
     * <code>bool is_discard = 1;</code>
     * @return The isDiscard.
     */
    boolean getIsDiscard();
  }
  /**
   * Protobuf type {@code DiscardRelicCsReq}
   */
  public static final class DiscardRelicCsReq extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:DiscardRelicCsReq)
      DiscardRelicCsReqOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 26,
        /* patch= */ 0,
        /* suffix= */ "-rc1",
        DiscardRelicCsReq.class.getName());
    }
    // Use DiscardRelicCsReq.newBuilder() to construct.
    private DiscardRelicCsReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private DiscardRelicCsReq() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.lunarcore.proto.DiscardRelicCsReqOuterClass.internal_static_DiscardRelicCsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.lunarcore.proto.DiscardRelicCsReqOuterClass.internal_static_DiscardRelicCsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq.class, emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq.Builder.class);
    }

    public static final int RELIC_UNIQUE_ID_FIELD_NUMBER = 13;
    private int relicUniqueId_ = 0;
    /**
     * <code>uint32 relic_unique_id = 13;</code>
     * @return The relicUniqueId.
     */
    @java.lang.Override
    public int getRelicUniqueId() {
      return relicUniqueId_;
    }

    public static final int IS_DISCARD_FIELD_NUMBER = 1;
    private boolean isDiscard_ = false;
    /**
     * <code>bool is_discard = 1;</code>
     * @return The isDiscard.
     */
    @java.lang.Override
    public boolean getIsDiscard() {
      return isDiscard_;
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
      if (isDiscard_ != false) {
        output.writeBool(1, isDiscard_);
      }
      if (relicUniqueId_ != 0) {
        output.writeUInt32(13, relicUniqueId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isDiscard_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isDiscard_);
      }
      if (relicUniqueId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, relicUniqueId_);
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
      if (!(obj instanceof emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq)) {
        return super.equals(obj);
      }
      emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq other = (emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq) obj;

      if (getRelicUniqueId()
          != other.getRelicUniqueId()) return false;
      if (getIsDiscard()
          != other.getIsDiscard()) return false;
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
      hash = (37 * hash) + RELIC_UNIQUE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRelicUniqueId();
      hash = (37 * hash) + IS_DISCARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDiscard());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code DiscardRelicCsReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DiscardRelicCsReq)
        emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.lunarcore.proto.DiscardRelicCsReqOuterClass.internal_static_DiscardRelicCsReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.lunarcore.proto.DiscardRelicCsReqOuterClass.internal_static_DiscardRelicCsReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq.class, emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq.Builder.class);
      }

      // Construct using emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        relicUniqueId_ = 0;
        isDiscard_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.lunarcore.proto.DiscardRelicCsReqOuterClass.internal_static_DiscardRelicCsReq_descriptor;
      }

      @java.lang.Override
      public emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq getDefaultInstanceForType() {
        return emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq build() {
        emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq buildPartial() {
        emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq result = new emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.relicUniqueId_ = relicUniqueId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isDiscard_ = isDiscard_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq) {
          return mergeFrom((emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq other) {
        if (other == emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq.getDefaultInstance()) return this;
        if (other.getRelicUniqueId() != 0) {
          setRelicUniqueId(other.getRelicUniqueId());
        }
        if (other.getIsDiscard() != false) {
          setIsDiscard(other.getIsDiscard());
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
                isDiscard_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 104: {
                relicUniqueId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
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

      private int relicUniqueId_ ;
      /**
       * <code>uint32 relic_unique_id = 13;</code>
       * @return The relicUniqueId.
       */
      @java.lang.Override
      public int getRelicUniqueId() {
        return relicUniqueId_;
      }
      /**
       * <code>uint32 relic_unique_id = 13;</code>
       * @param value The relicUniqueId to set.
       * @return This builder for chaining.
       */
      public Builder setRelicUniqueId(int value) {

        relicUniqueId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 relic_unique_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRelicUniqueId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        relicUniqueId_ = 0;
        onChanged();
        return this;
      }

      private boolean isDiscard_ ;
      /**
       * <code>bool is_discard = 1;</code>
       * @return The isDiscard.
       */
      @java.lang.Override
      public boolean getIsDiscard() {
        return isDiscard_;
      }
      /**
       * <code>bool is_discard = 1;</code>
       * @param value The isDiscard to set.
       * @return This builder for chaining.
       */
      public Builder setIsDiscard(boolean value) {

        isDiscard_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_discard = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDiscard() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isDiscard_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:DiscardRelicCsReq)
    }

    // @@protoc_insertion_point(class_scope:DiscardRelicCsReq)
    private static final emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq();
    }

    public static emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DiscardRelicCsReq>
        PARSER = new com.google.protobuf.AbstractParser<DiscardRelicCsReq>() {
      @java.lang.Override
      public DiscardRelicCsReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<DiscardRelicCsReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DiscardRelicCsReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.lunarcore.proto.DiscardRelicCsReqOuterClass.DiscardRelicCsReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DiscardRelicCsReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DiscardRelicCsReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027DiscardRelicCsReq.proto\"@\n\021DiscardReli" +
      "cCsReq\022\027\n\017relic_unique_id\030\r \001(\r\022\022\n\nis_di" +
      "scard\030\001 \001(\010B\025\n\023emu.lunarcore.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DiscardRelicCsReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DiscardRelicCsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DiscardRelicCsReq_descriptor,
        new java.lang.String[] { "RelicUniqueId", "IsDiscard", });
    descriptor.resolveAllFeatures();
  }

  // @@protoc_insertion_point(outer_class_scope)
}