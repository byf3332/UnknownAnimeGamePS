// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InferenceWordInfo.proto

package emu.grasscutter.net.proto;

public final class InferenceWordInfoOuterClass {
  private InferenceWordInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InferenceWordInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InferenceWordInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 word_id = 3;</code>
     * @return The wordId.
     */
    int getWordId();

    /**
     * <code>bool AAOCFCGKKHC = 7;</code>
     * @return The aAOCFCGKKHC.
     */
    boolean getAAOCFCGKKHC();

    /**
     * <code>bool DMBPILCCFNK = 10;</code>
     * @return The dMBPILCCFNK.
     */
    boolean getDMBPILCCFNK();

    /**
     * <code>uint32 unlock_by_word_id = 13;</code>
     * @return The unlockByWordId.
     */
    int getUnlockByWordId();

    /**
     * <code>bool HJLIADLKJOP = 14;</code>
     * @return The hJLIADLKJOP.
     */
    boolean getHJLIADLKJOP();
  }
  /**
   * Protobuf type {@code InferenceWordInfo}
   */
  public static final class InferenceWordInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InferenceWordInfo)
      InferenceWordInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InferenceWordInfo.newBuilder() to construct.
    private InferenceWordInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InferenceWordInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InferenceWordInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InferenceWordInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 24: {

              wordId_ = input.readUInt32();
              break;
            }
            case 56: {

              aAOCFCGKKHC_ = input.readBool();
              break;
            }
            case 80: {

              dMBPILCCFNK_ = input.readBool();
              break;
            }
            case 104: {

              unlockByWordId_ = input.readUInt32();
              break;
            }
            case 112: {

              hJLIADLKJOP_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
      return emu.grasscutter.net.proto.InferenceWordInfoOuterClass.internal_static_InferenceWordInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InferenceWordInfoOuterClass.internal_static_InferenceWordInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo.class, emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo.Builder.class);
    }

    public static final int WORD_ID_FIELD_NUMBER = 3;
    private int wordId_;
    /**
     * <code>uint32 word_id = 3;</code>
     * @return The wordId.
     */
    @java.lang.Override
    public int getWordId() {
      return wordId_;
    }

    public static final int AAOCFCGKKHC_FIELD_NUMBER = 7;
    private boolean aAOCFCGKKHC_;
    /**
     * <code>bool AAOCFCGKKHC = 7;</code>
     * @return The aAOCFCGKKHC.
     */
    @java.lang.Override
    public boolean getAAOCFCGKKHC() {
      return aAOCFCGKKHC_;
    }

    public static final int DMBPILCCFNK_FIELD_NUMBER = 10;
    private boolean dMBPILCCFNK_;
    /**
     * <code>bool DMBPILCCFNK = 10;</code>
     * @return The dMBPILCCFNK.
     */
    @java.lang.Override
    public boolean getDMBPILCCFNK() {
      return dMBPILCCFNK_;
    }

    public static final int UNLOCK_BY_WORD_ID_FIELD_NUMBER = 13;
    private int unlockByWordId_;
    /**
     * <code>uint32 unlock_by_word_id = 13;</code>
     * @return The unlockByWordId.
     */
    @java.lang.Override
    public int getUnlockByWordId() {
      return unlockByWordId_;
    }

    public static final int HJLIADLKJOP_FIELD_NUMBER = 14;
    private boolean hJLIADLKJOP_;
    /**
     * <code>bool HJLIADLKJOP = 14;</code>
     * @return The hJLIADLKJOP.
     */
    @java.lang.Override
    public boolean getHJLIADLKJOP() {
      return hJLIADLKJOP_;
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
      if (wordId_ != 0) {
        output.writeUInt32(3, wordId_);
      }
      if (aAOCFCGKKHC_ != false) {
        output.writeBool(7, aAOCFCGKKHC_);
      }
      if (dMBPILCCFNK_ != false) {
        output.writeBool(10, dMBPILCCFNK_);
      }
      if (unlockByWordId_ != 0) {
        output.writeUInt32(13, unlockByWordId_);
      }
      if (hJLIADLKJOP_ != false) {
        output.writeBool(14, hJLIADLKJOP_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (wordId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, wordId_);
      }
      if (aAOCFCGKKHC_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, aAOCFCGKKHC_);
      }
      if (dMBPILCCFNK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, dMBPILCCFNK_);
      }
      if (unlockByWordId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unlockByWordId_);
      }
      if (hJLIADLKJOP_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, hJLIADLKJOP_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo other = (emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo) obj;

      if (getWordId()
          != other.getWordId()) return false;
      if (getAAOCFCGKKHC()
          != other.getAAOCFCGKKHC()) return false;
      if (getDMBPILCCFNK()
          != other.getDMBPILCCFNK()) return false;
      if (getUnlockByWordId()
          != other.getUnlockByWordId()) return false;
      if (getHJLIADLKJOP()
          != other.getHJLIADLKJOP()) return false;
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
      hash = (37 * hash) + WORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWordId();
      hash = (37 * hash) + AAOCFCGKKHC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAAOCFCGKKHC());
      hash = (37 * hash) + DMBPILCCFNK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getDMBPILCCFNK());
      hash = (37 * hash) + UNLOCK_BY_WORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUnlockByWordId();
      hash = (37 * hash) + HJLIADLKJOP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHJLIADLKJOP());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo prototype) {
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
     * Protobuf type {@code InferenceWordInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InferenceWordInfo)
        emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InferenceWordInfoOuterClass.internal_static_InferenceWordInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InferenceWordInfoOuterClass.internal_static_InferenceWordInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo.class, emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        wordId_ = 0;

        aAOCFCGKKHC_ = false;

        dMBPILCCFNK_ = false;

        unlockByWordId_ = 0;

        hJLIADLKJOP_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InferenceWordInfoOuterClass.internal_static_InferenceWordInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo build() {
        emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo buildPartial() {
        emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo result = new emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo(this);
        result.wordId_ = wordId_;
        result.aAOCFCGKKHC_ = aAOCFCGKKHC_;
        result.dMBPILCCFNK_ = dMBPILCCFNK_;
        result.unlockByWordId_ = unlockByWordId_;
        result.hJLIADLKJOP_ = hJLIADLKJOP_;
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo) {
          return mergeFrom((emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo other) {
        if (other == emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo.getDefaultInstance()) return this;
        if (other.getWordId() != 0) {
          setWordId(other.getWordId());
        }
        if (other.getAAOCFCGKKHC() != false) {
          setAAOCFCGKKHC(other.getAAOCFCGKKHC());
        }
        if (other.getDMBPILCCFNK() != false) {
          setDMBPILCCFNK(other.getDMBPILCCFNK());
        }
        if (other.getUnlockByWordId() != 0) {
          setUnlockByWordId(other.getUnlockByWordId());
        }
        if (other.getHJLIADLKJOP() != false) {
          setHJLIADLKJOP(other.getHJLIADLKJOP());
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
        emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int wordId_ ;
      /**
       * <code>uint32 word_id = 3;</code>
       * @return The wordId.
       */
      @java.lang.Override
      public int getWordId() {
        return wordId_;
      }
      /**
       * <code>uint32 word_id = 3;</code>
       * @param value The wordId to set.
       * @return This builder for chaining.
       */
      public Builder setWordId(int value) {
        
        wordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 word_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearWordId() {
        
        wordId_ = 0;
        onChanged();
        return this;
      }

      private boolean aAOCFCGKKHC_ ;
      /**
       * <code>bool AAOCFCGKKHC = 7;</code>
       * @return The aAOCFCGKKHC.
       */
      @java.lang.Override
      public boolean getAAOCFCGKKHC() {
        return aAOCFCGKKHC_;
      }
      /**
       * <code>bool AAOCFCGKKHC = 7;</code>
       * @param value The aAOCFCGKKHC to set.
       * @return This builder for chaining.
       */
      public Builder setAAOCFCGKKHC(boolean value) {
        
        aAOCFCGKKHC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool AAOCFCGKKHC = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAAOCFCGKKHC() {
        
        aAOCFCGKKHC_ = false;
        onChanged();
        return this;
      }

      private boolean dMBPILCCFNK_ ;
      /**
       * <code>bool DMBPILCCFNK = 10;</code>
       * @return The dMBPILCCFNK.
       */
      @java.lang.Override
      public boolean getDMBPILCCFNK() {
        return dMBPILCCFNK_;
      }
      /**
       * <code>bool DMBPILCCFNK = 10;</code>
       * @param value The dMBPILCCFNK to set.
       * @return This builder for chaining.
       */
      public Builder setDMBPILCCFNK(boolean value) {
        
        dMBPILCCFNK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool DMBPILCCFNK = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDMBPILCCFNK() {
        
        dMBPILCCFNK_ = false;
        onChanged();
        return this;
      }

      private int unlockByWordId_ ;
      /**
       * <code>uint32 unlock_by_word_id = 13;</code>
       * @return The unlockByWordId.
       */
      @java.lang.Override
      public int getUnlockByWordId() {
        return unlockByWordId_;
      }
      /**
       * <code>uint32 unlock_by_word_id = 13;</code>
       * @param value The unlockByWordId to set.
       * @return This builder for chaining.
       */
      public Builder setUnlockByWordId(int value) {
        
        unlockByWordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 unlock_by_word_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnlockByWordId() {
        
        unlockByWordId_ = 0;
        onChanged();
        return this;
      }

      private boolean hJLIADLKJOP_ ;
      /**
       * <code>bool HJLIADLKJOP = 14;</code>
       * @return The hJLIADLKJOP.
       */
      @java.lang.Override
      public boolean getHJLIADLKJOP() {
        return hJLIADLKJOP_;
      }
      /**
       * <code>bool HJLIADLKJOP = 14;</code>
       * @param value The hJLIADLKJOP to set.
       * @return This builder for chaining.
       */
      public Builder setHJLIADLKJOP(boolean value) {
        
        hJLIADLKJOP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool HJLIADLKJOP = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearHJLIADLKJOP() {
        
        hJLIADLKJOP_ = false;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:InferenceWordInfo)
    }

    // @@protoc_insertion_point(class_scope:InferenceWordInfo)
    private static final emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo();
    }

    public static emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InferenceWordInfo>
        PARSER = new com.google.protobuf.AbstractParser<InferenceWordInfo>() {
      @java.lang.Override
      public InferenceWordInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InferenceWordInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InferenceWordInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InferenceWordInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InferenceWordInfoOuterClass.InferenceWordInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InferenceWordInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InferenceWordInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027InferenceWordInfo.proto\"~\n\021InferenceWo" +
      "rdInfo\022\017\n\007word_id\030\003 \001(\r\022\023\n\013AAOCFCGKKHC\030\007" +
      " \001(\010\022\023\n\013DMBPILCCFNK\030\n \001(\010\022\031\n\021unlock_by_w" +
      "ord_id\030\r \001(\r\022\023\n\013HJLIADLKJOP\030\016 \001(\010B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InferenceWordInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InferenceWordInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InferenceWordInfo_descriptor,
        new java.lang.String[] { "WordId", "AAOCFCGKKHC", "DMBPILCCFNK", "UnlockByWordId", "HJLIADLKJOP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
