// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldPlayerDieNotify.proto

package emu.grasscutter.net.proto;

public final class WorldPlayerDieNotifyOuterClass {
  private WorldPlayerDieNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldPlayerDieNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldPlayerDieNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PlayerDieType die_type = 3;</code>
     * @return The enum numeric value on the wire for dieType.
     */
    int getDieTypeValue();
    /**
     * <code>.PlayerDieType die_type = 3;</code>
     * @return The dieType.
     */
    emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType getDieType();

    /**
     * <code>uint32 murderer_entity_id = 6;</code>
     * @return The murdererEntityId.
     */
    int getMurdererEntityId();

    /**
     * <code>uint32 CMFMJLIALCD = 15;</code>
     * @return The cMFMJLIALCD.
     */
    int getCMFMJLIALCD();

    /**
     * <code>uint32 monster_id = 13;</code>
     * @return Whether the monsterId field is set.
     */
    boolean hasMonsterId();
    /**
     * <code>uint32 monster_id = 13;</code>
     * @return The monsterId.
     */
    int getMonsterId();

    /**
     * <code>uint32 gadget_id = 1;</code>
     * @return Whether the gadgetId field is set.
     */
    boolean hasGadgetId();
    /**
     * <code>uint32 gadget_id = 1;</code>
     * @return The gadgetId.
     */
    int getGadgetId();

    public emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify.EntityCase getEntityCase();
  }
  /**
   * <pre>
   * CmdId: 27386
   * </pre>
   *
   * Protobuf type {@code WorldPlayerDieNotify}
   */
  public static final class WorldPlayerDieNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldPlayerDieNotify)
      WorldPlayerDieNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldPlayerDieNotify.newBuilder() to construct.
    private WorldPlayerDieNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldPlayerDieNotify() {
      dieType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldPlayerDieNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WorldPlayerDieNotify(
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
            case 8: {
              entityCase_ = 1;
              entity_ = input.readUInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              dieType_ = rawValue;
              break;
            }
            case 48: {

              murdererEntityId_ = input.readUInt32();
              break;
            }
            case 104: {
              entityCase_ = 13;
              entity_ = input.readUInt32();
              break;
            }
            case 120: {

              cMFMJLIALCD_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.internal_static_WorldPlayerDieNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.internal_static_WorldPlayerDieNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify.class, emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify.Builder.class);
    }

    private int entityCase_ = 0;
    private java.lang.Object entity_;
    public enum EntityCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      MONSTER_ID(13),
      GADGET_ID(1),
      ENTITY_NOT_SET(0);
      private final int value;
      private EntityCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static EntityCase valueOf(int value) {
        return forNumber(value);
      }

      public static EntityCase forNumber(int value) {
        switch (value) {
          case 13: return MONSTER_ID;
          case 1: return GADGET_ID;
          case 0: return ENTITY_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public EntityCase
    getEntityCase() {
      return EntityCase.forNumber(
          entityCase_);
    }

    public static final int DIE_TYPE_FIELD_NUMBER = 3;
    private int dieType_;
    /**
     * <code>.PlayerDieType die_type = 3;</code>
     * @return The enum numeric value on the wire for dieType.
     */
    @java.lang.Override public int getDieTypeValue() {
      return dieType_;
    }
    /**
     * <code>.PlayerDieType die_type = 3;</code>
     * @return The dieType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType getDieType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType result = emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.valueOf(dieType_);
      return result == null ? emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.UNRECOGNIZED : result;
    }

    public static final int MURDERER_ENTITY_ID_FIELD_NUMBER = 6;
    private int murdererEntityId_;
    /**
     * <code>uint32 murderer_entity_id = 6;</code>
     * @return The murdererEntityId.
     */
    @java.lang.Override
    public int getMurdererEntityId() {
      return murdererEntityId_;
    }

    public static final int CMFMJLIALCD_FIELD_NUMBER = 15;
    private int cMFMJLIALCD_;
    /**
     * <code>uint32 CMFMJLIALCD = 15;</code>
     * @return The cMFMJLIALCD.
     */
    @java.lang.Override
    public int getCMFMJLIALCD() {
      return cMFMJLIALCD_;
    }

    public static final int MONSTER_ID_FIELD_NUMBER = 13;
    /**
     * <code>uint32 monster_id = 13;</code>
     * @return Whether the monsterId field is set.
     */
    @java.lang.Override
    public boolean hasMonsterId() {
      return entityCase_ == 13;
    }
    /**
     * <code>uint32 monster_id = 13;</code>
     * @return The monsterId.
     */
    @java.lang.Override
    public int getMonsterId() {
      if (entityCase_ == 13) {
        return (java.lang.Integer) entity_;
      }
      return 0;
    }

    public static final int GADGET_ID_FIELD_NUMBER = 1;
    /**
     * <code>uint32 gadget_id = 1;</code>
     * @return Whether the gadgetId field is set.
     */
    @java.lang.Override
    public boolean hasGadgetId() {
      return entityCase_ == 1;
    }
    /**
     * <code>uint32 gadget_id = 1;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      if (entityCase_ == 1) {
        return (java.lang.Integer) entity_;
      }
      return 0;
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
      if (entityCase_ == 1) {
        output.writeUInt32(
            1, (int)((java.lang.Integer) entity_));
      }
      if (dieType_ != emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.PLAYER_DIE_TYPE_NONE.getNumber()) {
        output.writeEnum(3, dieType_);
      }
      if (murdererEntityId_ != 0) {
        output.writeUInt32(6, murdererEntityId_);
      }
      if (entityCase_ == 13) {
        output.writeUInt32(
            13, (int)((java.lang.Integer) entity_));
      }
      if (cMFMJLIALCD_ != 0) {
        output.writeUInt32(15, cMFMJLIALCD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              1, (int)((java.lang.Integer) entity_));
      }
      if (dieType_ != emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.PLAYER_DIE_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, dieType_);
      }
      if (murdererEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, murdererEntityId_);
      }
      if (entityCase_ == 13) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              13, (int)((java.lang.Integer) entity_));
      }
      if (cMFMJLIALCD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, cMFMJLIALCD_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify other = (emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify) obj;

      if (dieType_ != other.dieType_) return false;
      if (getMurdererEntityId()
          != other.getMurdererEntityId()) return false;
      if (getCMFMJLIALCD()
          != other.getCMFMJLIALCD()) return false;
      if (!getEntityCase().equals(other.getEntityCase())) return false;
      switch (entityCase_) {
        case 13:
          if (getMonsterId()
              != other.getMonsterId()) return false;
          break;
        case 1:
          if (getGadgetId()
              != other.getGadgetId()) return false;
          break;
        case 0:
        default:
      }
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
      hash = (37 * hash) + DIE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + dieType_;
      hash = (37 * hash) + MURDERER_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMurdererEntityId();
      hash = (37 * hash) + CMFMJLIALCD_FIELD_NUMBER;
      hash = (53 * hash) + getCMFMJLIALCD();
      switch (entityCase_) {
        case 13:
          hash = (37 * hash) + MONSTER_ID_FIELD_NUMBER;
          hash = (53 * hash) + getMonsterId();
          break;
        case 1:
          hash = (37 * hash) + GADGET_ID_FIELD_NUMBER;
          hash = (53 * hash) + getGadgetId();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify prototype) {
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
     * <pre>
     * CmdId: 27386
     * </pre>
     *
     * Protobuf type {@code WorldPlayerDieNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldPlayerDieNotify)
        emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.internal_static_WorldPlayerDieNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.internal_static_WorldPlayerDieNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify.class, emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify.newBuilder()
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
        dieType_ = 0;

        murdererEntityId_ = 0;

        cMFMJLIALCD_ = 0;

        entityCase_ = 0;
        entity_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.internal_static_WorldPlayerDieNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify build() {
        emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify buildPartial() {
        emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify result = new emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify(this);
        result.dieType_ = dieType_;
        result.murdererEntityId_ = murdererEntityId_;
        result.cMFMJLIALCD_ = cMFMJLIALCD_;
        if (entityCase_ == 13) {
          result.entity_ = entity_;
        }
        if (entityCase_ == 1) {
          result.entity_ = entity_;
        }
        result.entityCase_ = entityCase_;
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
        if (other instanceof emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify other) {
        if (other == emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify.getDefaultInstance()) return this;
        if (other.dieType_ != 0) {
          setDieTypeValue(other.getDieTypeValue());
        }
        if (other.getMurdererEntityId() != 0) {
          setMurdererEntityId(other.getMurdererEntityId());
        }
        if (other.getCMFMJLIALCD() != 0) {
          setCMFMJLIALCD(other.getCMFMJLIALCD());
        }
        switch (other.getEntityCase()) {
          case MONSTER_ID: {
            setMonsterId(other.getMonsterId());
            break;
          }
          case GADGET_ID: {
            setGadgetId(other.getGadgetId());
            break;
          }
          case ENTITY_NOT_SET: {
            break;
          }
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
        emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int entityCase_ = 0;
      private java.lang.Object entity_;
      public EntityCase
          getEntityCase() {
        return EntityCase.forNumber(
            entityCase_);
      }

      public Builder clearEntity() {
        entityCase_ = 0;
        entity_ = null;
        onChanged();
        return this;
      }


      private int dieType_ = 0;
      /**
       * <code>.PlayerDieType die_type = 3;</code>
       * @return The enum numeric value on the wire for dieType.
       */
      @java.lang.Override public int getDieTypeValue() {
        return dieType_;
      }
      /**
       * <code>.PlayerDieType die_type = 3;</code>
       * @param value The enum numeric value on the wire for dieType to set.
       * @return This builder for chaining.
       */
      public Builder setDieTypeValue(int value) {
        
        dieType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerDieType die_type = 3;</code>
       * @return The dieType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType getDieType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType result = emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.valueOf(dieType_);
        return result == null ? emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.UNRECOGNIZED : result;
      }
      /**
       * <code>.PlayerDieType die_type = 3;</code>
       * @param value The dieType to set.
       * @return This builder for chaining.
       */
      public Builder setDieType(emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dieType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerDieType die_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDieType() {
        
        dieType_ = 0;
        onChanged();
        return this;
      }

      private int murdererEntityId_ ;
      /**
       * <code>uint32 murderer_entity_id = 6;</code>
       * @return The murdererEntityId.
       */
      @java.lang.Override
      public int getMurdererEntityId() {
        return murdererEntityId_;
      }
      /**
       * <code>uint32 murderer_entity_id = 6;</code>
       * @param value The murdererEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setMurdererEntityId(int value) {
        
        murdererEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 murderer_entity_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearMurdererEntityId() {
        
        murdererEntityId_ = 0;
        onChanged();
        return this;
      }

      private int cMFMJLIALCD_ ;
      /**
       * <code>uint32 CMFMJLIALCD = 15;</code>
       * @return The cMFMJLIALCD.
       */
      @java.lang.Override
      public int getCMFMJLIALCD() {
        return cMFMJLIALCD_;
      }
      /**
       * <code>uint32 CMFMJLIALCD = 15;</code>
       * @param value The cMFMJLIALCD to set.
       * @return This builder for chaining.
       */
      public Builder setCMFMJLIALCD(int value) {
        
        cMFMJLIALCD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CMFMJLIALCD = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCMFMJLIALCD() {
        
        cMFMJLIALCD_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>uint32 monster_id = 13;</code>
       * @return Whether the monsterId field is set.
       */
      public boolean hasMonsterId() {
        return entityCase_ == 13;
      }
      /**
       * <code>uint32 monster_id = 13;</code>
       * @return The monsterId.
       */
      public int getMonsterId() {
        if (entityCase_ == 13) {
          return (java.lang.Integer) entity_;
        }
        return 0;
      }
      /**
       * <code>uint32 monster_id = 13;</code>
       * @param value The monsterId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterId(int value) {
        entityCase_ = 13;
        entity_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterId() {
        if (entityCase_ == 13) {
          entityCase_ = 0;
          entity_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>uint32 gadget_id = 1;</code>
       * @return Whether the gadgetId field is set.
       */
      public boolean hasGadgetId() {
        return entityCase_ == 1;
      }
      /**
       * <code>uint32 gadget_id = 1;</code>
       * @return The gadgetId.
       */
      public int getGadgetId() {
        if (entityCase_ == 1) {
          return (java.lang.Integer) entity_;
        }
        return 0;
      }
      /**
       * <code>uint32 gadget_id = 1;</code>
       * @param value The gadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetId(int value) {
        entityCase_ = 1;
        entity_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetId() {
        if (entityCase_ == 1) {
          entityCase_ = 0;
          entity_ = null;
          onChanged();
        }
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


      // @@protoc_insertion_point(builder_scope:WorldPlayerDieNotify)
    }

    // @@protoc_insertion_point(class_scope:WorldPlayerDieNotify)
    private static final emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify();
    }

    public static emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldPlayerDieNotify>
        PARSER = new com.google.protobuf.AbstractParser<WorldPlayerDieNotify>() {
      @java.lang.Override
      public WorldPlayerDieNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorldPlayerDieNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WorldPlayerDieNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldPlayerDieNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldPlayerDieNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldPlayerDieNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032WorldPlayerDieNotify.proto\032\023PlayerDieT" +
      "ype.proto\"\236\001\n\024WorldPlayerDieNotify\022 \n\010di" +
      "e_type\030\003 \001(\0162\016.PlayerDieType\022\032\n\022murderer" +
      "_entity_id\030\006 \001(\r\022\023\n\013CMFMJLIALCD\030\017 \001(\r\022\024\n" +
      "\nmonster_id\030\r \001(\rH\000\022\023\n\tgadget_id\030\001 \001(\rH\000" +
      "B\010\n\006entityB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlayerDieTypeOuterClass.getDescriptor(),
        });
    internal_static_WorldPlayerDieNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldPlayerDieNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldPlayerDieNotify_descriptor,
        new java.lang.String[] { "DieType", "MurdererEntityId", "CMFMJLIALCD", "MonsterId", "GadgetId", "Entity", });
    emu.grasscutter.net.proto.PlayerDieTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
