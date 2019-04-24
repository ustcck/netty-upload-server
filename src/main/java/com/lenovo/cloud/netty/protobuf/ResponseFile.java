// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: netty/Response.proto

package com.lenovo.cloud.netty.protobuf;

public final class ResponseFile {
  private ResponseFile() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResponseMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 开始 读取点
     * </pre>
     *
     * <code>int64 start = 1;</code>
     */
    long getStart();

    /**
     * <pre>
     * 文件的 MD5值
     * </pre>
     *
     * <code>string fileName = 2;</code>
     */
    String getFileName();
    /**
     * <pre>
     * 文件的 MD5值
     * </pre>
     *
     * <code>string fileName = 2;</code>
     */
    com.google.protobuf.ByteString
        getFileNameBytes();

    /**
     * <pre>
     * 文件下载地址
     * </pre>
     *
     * <code>string fileUrl = 3;</code>
     */
    String getFileUrl();
    /**
     * <pre>
     * 文件下载地址
     * </pre>
     *
     * <code>string fileUrl = 3;</code>
     */
    com.google.protobuf.ByteString
        getFileUrlBytes();

    /**
     * <pre>
     * 上传是否结束
     * </pre>
     *
     * <code>bool end = 4;</code>
     */
    boolean getEnd();

    /**
     * <pre>
     * 进度
     * </pre>
     *
     * <code>string completedByte = 5;</code>
     */
    String getCompletedByte();
    /**
     * <pre>
     * 进度
     * </pre>
     *
     * <code>string completedByte = 5;</code>
     */
    com.google.protobuf.ByteString
        getCompletedByteBytes();
  }
  /**
   * Protobuf type {@code ResponseMsg}
   */
  public  static final class ResponseMsg extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseMsg)
      ResponseMsgOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseMsg.newBuilder() to construct.
    private ResponseMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseMsg() {
      fileName_ = "";
      fileUrl_ = "";
      completedByte_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseMsg(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              start_ = input.readInt64();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              fileName_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              fileUrl_ = s;
              break;
            }
            case 32: {

              end_ = input.readBool();
              break;
            }
            case 42: {
              String s = input.readStringRequireUtf8();

              completedByte_ = s;
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
      return ResponseFile.internal_static_ResponseMsg_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ResponseFile.internal_static_ResponseMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseMsg.class, Builder.class);
    }

    public static final int START_FIELD_NUMBER = 1;
    private long start_;
    /**
     * <pre>
     * 开始 读取点
     * </pre>
     *
     * <code>int64 start = 1;</code>
     */
    public long getStart() {
      return start_;
    }

    public static final int FILENAME_FIELD_NUMBER = 2;
    private volatile Object fileName_;
    /**
     * <pre>
     * 文件的 MD5值
     * </pre>
     *
     * <code>string fileName = 2;</code>
     */
    public String getFileName() {
      Object ref = fileName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 文件的 MD5值
     * </pre>
     *
     * <code>string fileName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FILEURL_FIELD_NUMBER = 3;
    private volatile Object fileUrl_;
    /**
     * <pre>
     * 文件下载地址
     * </pre>
     *
     * <code>string fileUrl = 3;</code>
     */
    public String getFileUrl() {
      Object ref = fileUrl_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        fileUrl_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 文件下载地址
     * </pre>
     *
     * <code>string fileUrl = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFileUrlBytes() {
      Object ref = fileUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        fileUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int END_FIELD_NUMBER = 4;
    private boolean end_;
    /**
     * <pre>
     * 上传是否结束
     * </pre>
     *
     * <code>bool end = 4;</code>
     */
    public boolean getEnd() {
      return end_;
    }

    public static final int COMPLETEDBYTE_FIELD_NUMBER = 5;
    private volatile Object completedByte_;
    /**
     * <pre>
     * 进度
     * </pre>
     *
     * <code>string completedByte = 5;</code>
     */
    public String getCompletedByte() {
      Object ref = completedByte_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        completedByte_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 进度
     * </pre>
     *
     * <code>string completedByte = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCompletedByteBytes() {
      Object ref = completedByte_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        completedByte_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (start_ != 0L) {
        output.writeInt64(1, start_);
      }
      if (!getFileNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fileName_);
      }
      if (!getFileUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fileUrl_);
      }
      if (end_ != false) {
        output.writeBool(4, end_);
      }
      if (!getCompletedByteBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, completedByte_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (start_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, start_);
      }
      if (!getFileNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fileName_);
      }
      if (!getFileUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fileUrl_);
      }
      if (end_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, end_);
      }
      if (!getCompletedByteBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, completedByte_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseMsg)) {
        return super.equals(obj);
      }
      ResponseMsg other = (ResponseMsg) obj;

      if (getStart()
          != other.getStart()) return false;
      if (!getFileName()
          .equals(other.getFileName())) return false;
      if (!getFileUrl()
          .equals(other.getFileUrl())) return false;
      if (getEnd()
          != other.getEnd()) return false;
      if (!getCompletedByte()
          .equals(other.getCompletedByte())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + START_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStart());
      hash = (37 * hash) + FILENAME_FIELD_NUMBER;
      hash = (53 * hash) + getFileName().hashCode();
      hash = (37 * hash) + FILEURL_FIELD_NUMBER;
      hash = (53 * hash) + getFileUrl().hashCode();
      hash = (37 * hash) + END_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEnd());
      hash = (37 * hash) + COMPLETEDBYTE_FIELD_NUMBER;
      hash = (53 * hash) + getCompletedByte().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseMsg parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseMsg parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseMsg prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseMsg)
        ResponseMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ResponseFile.internal_static_ResponseMsg_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ResponseFile.internal_static_ResponseMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseMsg.class, Builder.class);
      }

      // Construct using com.lenovo.cloud.netty.protobuf.ResponseFile.ResponseMsg.newBuilder()
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
      @Override
      public Builder clear() {
        super.clear();
        start_ = 0L;

        fileName_ = "";

        fileUrl_ = "";

        end_ = false;

        completedByte_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ResponseFile.internal_static_ResponseMsg_descriptor;
      }

      @Override
      public ResponseMsg getDefaultInstanceForType() {
        return ResponseMsg.getDefaultInstance();
      }

      @Override
      public ResponseMsg build() {
        ResponseMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseMsg buildPartial() {
        ResponseMsg result = new ResponseMsg(this);
        result.start_ = start_;
        result.fileName_ = fileName_;
        result.fileUrl_ = fileUrl_;
        result.end_ = end_;
        result.completedByte_ = completedByte_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseMsg) {
          return mergeFrom((ResponseMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseMsg other) {
        if (other == ResponseMsg.getDefaultInstance()) return this;
        if (other.getStart() != 0L) {
          setStart(other.getStart());
        }
        if (!other.getFileName().isEmpty()) {
          fileName_ = other.fileName_;
          onChanged();
        }
        if (!other.getFileUrl().isEmpty()) {
          fileUrl_ = other.fileUrl_;
          onChanged();
        }
        if (other.getEnd() != false) {
          setEnd(other.getEnd());
        }
        if (!other.getCompletedByte().isEmpty()) {
          completedByte_ = other.completedByte_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseMsg) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long start_ ;
      /**
       * <pre>
       * 开始 读取点
       * </pre>
       *
       * <code>int64 start = 1;</code>
       */
      public long getStart() {
        return start_;
      }
      /**
       * <pre>
       * 开始 读取点
       * </pre>
       *
       * <code>int64 start = 1;</code>
       */
      public Builder setStart(long value) {
        
        start_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 开始 读取点
       * </pre>
       *
       * <code>int64 start = 1;</code>
       */
      public Builder clearStart() {
        
        start_ = 0L;
        onChanged();
        return this;
      }

      private Object fileName_ = "";
      /**
       * <pre>
       * 文件的 MD5值
       * </pre>
       *
       * <code>string fileName = 2;</code>
       */
      public String getFileName() {
        Object ref = fileName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          fileName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * 文件的 MD5值
       * </pre>
       *
       * <code>string fileName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFileNameBytes() {
        Object ref = fileName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          fileName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 文件的 MD5值
       * </pre>
       *
       * <code>string fileName = 2;</code>
       */
      public Builder setFileName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        fileName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 文件的 MD5值
       * </pre>
       *
       * <code>string fileName = 2;</code>
       */
      public Builder clearFileName() {
        
        fileName_ = getDefaultInstance().getFileName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 文件的 MD5值
       * </pre>
       *
       * <code>string fileName = 2;</code>
       */
      public Builder setFileNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        fileName_ = value;
        onChanged();
        return this;
      }

      private Object fileUrl_ = "";
      /**
       * <pre>
       * 文件下载地址
       * </pre>
       *
       * <code>string fileUrl = 3;</code>
       */
      public String getFileUrl() {
        Object ref = fileUrl_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          fileUrl_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * 文件下载地址
       * </pre>
       *
       * <code>string fileUrl = 3;</code>
       */
      public com.google.protobuf.ByteString
          getFileUrlBytes() {
        Object ref = fileUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          fileUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 文件下载地址
       * </pre>
       *
       * <code>string fileUrl = 3;</code>
       */
      public Builder setFileUrl(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        fileUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 文件下载地址
       * </pre>
       *
       * <code>string fileUrl = 3;</code>
       */
      public Builder clearFileUrl() {
        
        fileUrl_ = getDefaultInstance().getFileUrl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 文件下载地址
       * </pre>
       *
       * <code>string fileUrl = 3;</code>
       */
      public Builder setFileUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        fileUrl_ = value;
        onChanged();
        return this;
      }

      private boolean end_ ;
      /**
       * <pre>
       * 上传是否结束
       * </pre>
       *
       * <code>bool end = 4;</code>
       */
      public boolean getEnd() {
        return end_;
      }
      /**
       * <pre>
       * 上传是否结束
       * </pre>
       *
       * <code>bool end = 4;</code>
       */
      public Builder setEnd(boolean value) {
        
        end_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 上传是否结束
       * </pre>
       *
       * <code>bool end = 4;</code>
       */
      public Builder clearEnd() {
        
        end_ = false;
        onChanged();
        return this;
      }

      private Object completedByte_ = "";
      /**
       * <pre>
       * 进度
       * </pre>
       *
       * <code>string completedByte = 5;</code>
       */
      public String getCompletedByte() {
        Object ref = completedByte_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          completedByte_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * 进度
       * </pre>
       *
       * <code>string completedByte = 5;</code>
       */
      public com.google.protobuf.ByteString
          getCompletedByteBytes() {
        Object ref = completedByte_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          completedByte_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 进度
       * </pre>
       *
       * <code>string completedByte = 5;</code>
       */
      public Builder setCompletedByte(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        completedByte_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 进度
       * </pre>
       *
       * <code>string completedByte = 5;</code>
       */
      public Builder clearCompletedByte() {
        
        completedByte_ = getDefaultInstance().getCompletedByte();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 进度
       * </pre>
       *
       * <code>string completedByte = 5;</code>
       */
      public Builder setCompletedByteBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        completedByte_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseMsg)
    }

    // @@protoc_insertion_point(class_scope:ResponseMsg)
    private static final ResponseMsg DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseMsg();
    }

    public static ResponseMsg getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseMsg>
        PARSER = new com.google.protobuf.AbstractParser<ResponseMsg>() {
      @Override
      public ResponseMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseMsg(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseMsg> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseMsg> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseMsg getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseMsg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024netty/Response.proto\"c\n\013ResponseMsg\022\r\n" +
      "\005start\030\001 \001(\003\022\020\n\010fileName\030\002 \001(\t\022\017\n\007fileUr" +
      "l\030\003 \001(\t\022\013\n\003end\030\004 \001(\010\022\025\n\rcompletedByte\030\005 " +
      "\001(\tB/\n\037com.lenovo.cloud.netty.protobufB\014" +
      "ResponseFileb\006proto3"
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
    internal_static_ResponseMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResponseMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseMsg_descriptor,
        new String[] { "Start", "FileName", "FileUrl", "End", "CompletedByte", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
