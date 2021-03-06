package com.bigflag.toolkit.tool.socket.beans.protobuf;
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transfer-msg.proto

public final class MessageEntityProtobuf {
  private MessageEntityProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 msgType = 1;</code>
     */
    boolean hasMsgType();
    /**
     * <code>required int32 msgType = 1;</code>
     */
    int getMsgType();

    /**
     * <code>optional int32 taskType = 2;</code>
     */
    boolean hasTaskType();
    /**
     * <code>optional int32 taskType = 2;</code>
     */
    int getTaskType();

    /**
     * <code>optional int32 actionType = 3;</code>
     */
    boolean hasActionType();
    /**
     * <code>optional int32 actionType = 3;</code>
     */
    int getActionType();

    /**
     * <code>required string senderID = 4;</code>
     */
    boolean hasSenderID();
    /**
     * <code>required string senderID = 4;</code>
     */
    java.lang.String getSenderID();
    /**
     * <code>required string senderID = 4;</code>
     */
    com.google.protobuf.ByteString
        getSenderIDBytes();

    /**
     * <code>optional string receiverID = 5;</code>
     */
    boolean hasReceiverID();
    /**
     * <code>optional string receiverID = 5;</code>
     */
    java.lang.String getReceiverID();
    /**
     * <code>optional string receiverID = 5;</code>
     */
    com.google.protobuf.ByteString
        getReceiverIDBytes();

    /**
     * <code>required bytes msgContent = 6;</code>
     */
    boolean hasMsgContent();
    /**
     * <code>required bytes msgContent = 6;</code>
     */
    com.google.protobuf.ByteString getMsgContent();
  }
  /**
   * Protobuf type {@code Message}
   */
  public  static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Message)
      MessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      msgType_ = 0;
      taskType_ = 0;
      actionType_ = 0;
      senderID_ = "";
      receiverID_ = "";
      msgContent_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              msgType_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              taskType_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              actionType_ = input.readInt32();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              senderID_ = bs;
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              receiverID_ = bs;
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              msgContent_ = input.readBytes();
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
      return MessageEntityProtobuf.internal_static_Message_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageEntityProtobuf.internal_static_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MessageEntityProtobuf.Message.class, MessageEntityProtobuf.Message.Builder.class);
    }

    private int bitField0_;
    public static final int MSGTYPE_FIELD_NUMBER = 1;
    private int msgType_;
    /**
     * <code>required int32 msgType = 1;</code>
     */
    public boolean hasMsgType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 msgType = 1;</code>
     */
    public int getMsgType() {
      return msgType_;
    }

    public static final int TASKTYPE_FIELD_NUMBER = 2;
    private int taskType_;
    /**
     * <code>optional int32 taskType = 2;</code>
     */
    public boolean hasTaskType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 taskType = 2;</code>
     */
    public int getTaskType() {
      return taskType_;
    }

    public static final int ACTIONTYPE_FIELD_NUMBER = 3;
    private int actionType_;
    /**
     * <code>optional int32 actionType = 3;</code>
     */
    public boolean hasActionType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 actionType = 3;</code>
     */
    public int getActionType() {
      return actionType_;
    }

    public static final int SENDERID_FIELD_NUMBER = 4;
    private volatile java.lang.Object senderID_;
    /**
     * <code>required string senderID = 4;</code>
     */
    public boolean hasSenderID() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string senderID = 4;</code>
     */
    public java.lang.String getSenderID() {
      java.lang.Object ref = senderID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          senderID_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string senderID = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSenderIDBytes() {
      java.lang.Object ref = senderID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECEIVERID_FIELD_NUMBER = 5;
    private volatile java.lang.Object receiverID_;
    /**
     * <code>optional string receiverID = 5;</code>
     */
    public boolean hasReceiverID() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string receiverID = 5;</code>
     */
    public java.lang.String getReceiverID() {
      java.lang.Object ref = receiverID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          receiverID_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string receiverID = 5;</code>
     */
    public com.google.protobuf.ByteString
        getReceiverIDBytes() {
      java.lang.Object ref = receiverID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiverID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MSGCONTENT_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString msgContent_;
    /**
     * <code>required bytes msgContent = 6;</code>
     */
    public boolean hasMsgContent() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required bytes msgContent = 6;</code>
     */
    public com.google.protobuf.ByteString getMsgContent() {
      return msgContent_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMsgType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSenderID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMsgContent()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, msgType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, taskType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, actionType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, senderID_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, receiverID_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, msgContent_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, msgType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, taskType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, actionType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, senderID_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, receiverID_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, msgContent_);
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
      if (!(obj instanceof MessageEntityProtobuf.Message)) {
        return super.equals(obj);
      }
      MessageEntityProtobuf.Message other = (MessageEntityProtobuf.Message) obj;

      boolean result = true;
      result = result && (hasMsgType() == other.hasMsgType());
      if (hasMsgType()) {
        result = result && (getMsgType()
            == other.getMsgType());
      }
      result = result && (hasTaskType() == other.hasTaskType());
      if (hasTaskType()) {
        result = result && (getTaskType()
            == other.getTaskType());
      }
      result = result && (hasActionType() == other.hasActionType());
      if (hasActionType()) {
        result = result && (getActionType()
            == other.getActionType());
      }
      result = result && (hasSenderID() == other.hasSenderID());
      if (hasSenderID()) {
        result = result && getSenderID()
            .equals(other.getSenderID());
      }
      result = result && (hasReceiverID() == other.hasReceiverID());
      if (hasReceiverID()) {
        result = result && getReceiverID()
            .equals(other.getReceiverID());
      }
      result = result && (hasMsgContent() == other.hasMsgContent());
      if (hasMsgContent()) {
        result = result && getMsgContent()
            .equals(other.getMsgContent());
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
      if (hasMsgType()) {
        hash = (37 * hash) + MSGTYPE_FIELD_NUMBER;
        hash = (53 * hash) + getMsgType();
      }
      if (hasTaskType()) {
        hash = (37 * hash) + TASKTYPE_FIELD_NUMBER;
        hash = (53 * hash) + getTaskType();
      }
      if (hasActionType()) {
        hash = (37 * hash) + ACTIONTYPE_FIELD_NUMBER;
        hash = (53 * hash) + getActionType();
      }
      if (hasSenderID()) {
        hash = (37 * hash) + SENDERID_FIELD_NUMBER;
        hash = (53 * hash) + getSenderID().hashCode();
      }
      if (hasReceiverID()) {
        hash = (37 * hash) + RECEIVERID_FIELD_NUMBER;
        hash = (53 * hash) + getReceiverID().hashCode();
      }
      if (hasMsgContent()) {
        hash = (37 * hash) + MSGCONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getMsgContent().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MessageEntityProtobuf.Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessageEntityProtobuf.Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessageEntityProtobuf.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessageEntityProtobuf.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessageEntityProtobuf.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessageEntityProtobuf.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessageEntityProtobuf.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MessageEntityProtobuf.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MessageEntityProtobuf.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MessageEntityProtobuf.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MessageEntityProtobuf.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MessageEntityProtobuf.Message parseFrom(
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
    public static Builder newBuilder(MessageEntityProtobuf.Message prototype) {
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
     * Protobuf type {@code Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Message)
        MessageEntityProtobuf.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MessageEntityProtobuf.internal_static_Message_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MessageEntityProtobuf.internal_static_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MessageEntityProtobuf.Message.class, MessageEntityProtobuf.Message.Builder.class);
      }

      // Construct using MessageEntityProtobuf.Message.newBuilder()
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
        msgType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        taskType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        actionType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        senderID_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        receiverID_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        msgContent_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MessageEntityProtobuf.internal_static_Message_descriptor;
      }

      public MessageEntityProtobuf.Message getDefaultInstanceForType() {
        return MessageEntityProtobuf.Message.getDefaultInstance();
      }

      public MessageEntityProtobuf.Message build() {
        MessageEntityProtobuf.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MessageEntityProtobuf.Message buildPartial() {
        MessageEntityProtobuf.Message result = new MessageEntityProtobuf.Message(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.msgType_ = msgType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.taskType_ = taskType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.actionType_ = actionType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.senderID_ = senderID_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.receiverID_ = receiverID_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.msgContent_ = msgContent_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof MessageEntityProtobuf.Message) {
          return mergeFrom((MessageEntityProtobuf.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MessageEntityProtobuf.Message other) {
        if (other == MessageEntityProtobuf.Message.getDefaultInstance()) return this;
        if (other.hasMsgType()) {
          setMsgType(other.getMsgType());
        }
        if (other.hasTaskType()) {
          setTaskType(other.getTaskType());
        }
        if (other.hasActionType()) {
          setActionType(other.getActionType());
        }
        if (other.hasSenderID()) {
          bitField0_ |= 0x00000008;
          senderID_ = other.senderID_;
          onChanged();
        }
        if (other.hasReceiverID()) {
          bitField0_ |= 0x00000010;
          receiverID_ = other.receiverID_;
          onChanged();
        }
        if (other.hasMsgContent()) {
          setMsgContent(other.getMsgContent());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMsgType()) {
          return false;
        }
        if (!hasSenderID()) {
          return false;
        }
        if (!hasMsgContent()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MessageEntityProtobuf.Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MessageEntityProtobuf.Message) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int msgType_ ;
      /**
       * <code>required int32 msgType = 1;</code>
       */
      public boolean hasMsgType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 msgType = 1;</code>
       */
      public int getMsgType() {
        return msgType_;
      }
      /**
       * <code>required int32 msgType = 1;</code>
       */
      public Builder setMsgType(int value) {
        bitField0_ |= 0x00000001;
        msgType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 msgType = 1;</code>
       */
      public Builder clearMsgType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        msgType_ = 0;
        onChanged();
        return this;
      }

      private int taskType_ ;
      /**
       * <code>optional int32 taskType = 2;</code>
       */
      public boolean hasTaskType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 taskType = 2;</code>
       */
      public int getTaskType() {
        return taskType_;
      }
      /**
       * <code>optional int32 taskType = 2;</code>
       */
      public Builder setTaskType(int value) {
        bitField0_ |= 0x00000002;
        taskType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 taskType = 2;</code>
       */
      public Builder clearTaskType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        taskType_ = 0;
        onChanged();
        return this;
      }

      private int actionType_ ;
      /**
       * <code>optional int32 actionType = 3;</code>
       */
      public boolean hasActionType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 actionType = 3;</code>
       */
      public int getActionType() {
        return actionType_;
      }
      /**
       * <code>optional int32 actionType = 3;</code>
       */
      public Builder setActionType(int value) {
        bitField0_ |= 0x00000004;
        actionType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 actionType = 3;</code>
       */
      public Builder clearActionType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        actionType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object senderID_ = "";
      /**
       * <code>required string senderID = 4;</code>
       */
      public boolean hasSenderID() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string senderID = 4;</code>
       */
      public java.lang.String getSenderID() {
        java.lang.Object ref = senderID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            senderID_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string senderID = 4;</code>
       */
      public com.google.protobuf.ByteString
          getSenderIDBytes() {
        java.lang.Object ref = senderID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          senderID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string senderID = 4;</code>
       */
      public Builder setSenderID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        senderID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string senderID = 4;</code>
       */
      public Builder clearSenderID() {
        bitField0_ = (bitField0_ & ~0x00000008);
        senderID_ = getDefaultInstance().getSenderID();
        onChanged();
        return this;
      }
      /**
       * <code>required string senderID = 4;</code>
       */
      public Builder setSenderIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        senderID_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object receiverID_ = "";
      /**
       * <code>optional string receiverID = 5;</code>
       */
      public boolean hasReceiverID() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string receiverID = 5;</code>
       */
      public java.lang.String getReceiverID() {
        java.lang.Object ref = receiverID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            receiverID_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string receiverID = 5;</code>
       */
      public com.google.protobuf.ByteString
          getReceiverIDBytes() {
        java.lang.Object ref = receiverID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          receiverID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string receiverID = 5;</code>
       */
      public Builder setReceiverID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        receiverID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string receiverID = 5;</code>
       */
      public Builder clearReceiverID() {
        bitField0_ = (bitField0_ & ~0x00000010);
        receiverID_ = getDefaultInstance().getReceiverID();
        onChanged();
        return this;
      }
      /**
       * <code>optional string receiverID = 5;</code>
       */
      public Builder setReceiverIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        receiverID_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString msgContent_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes msgContent = 6;</code>
       */
      public boolean hasMsgContent() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required bytes msgContent = 6;</code>
       */
      public com.google.protobuf.ByteString getMsgContent() {
        return msgContent_;
      }
      /**
       * <code>required bytes msgContent = 6;</code>
       */
      public Builder setMsgContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        msgContent_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes msgContent = 6;</code>
       */
      public Builder clearMsgContent() {
        bitField0_ = (bitField0_ & ~0x00000020);
        msgContent_ = getDefaultInstance().getMsgContent();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Message)
    }

    // @@protoc_insertion_point(class_scope:Message)
    private static final MessageEntityProtobuf.Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MessageEntityProtobuf.Message();
    }

    public static MessageEntityProtobuf.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Message(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    public MessageEntityProtobuf.Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022transfer-msg.proto\"z\n\007Message\022\017\n\007msgTy" +
      "pe\030\001 \002(\005\022\020\n\010taskType\030\002 \001(\005\022\022\n\nactionType" +
      "\030\003 \001(\005\022\020\n\010senderID\030\004 \002(\t\022\022\n\nreceiverID\030\005" +
      " \001(\t\022\022\n\nmsgContent\030\006 \002(\014B\027B\025MessageEntit" +
      "yProtobuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Message_descriptor,
        new java.lang.String[] { "MsgType", "TaskType", "ActionType", "SenderID", "ReceiverID", "MsgContent", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
