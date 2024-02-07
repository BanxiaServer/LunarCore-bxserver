// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class InteractPropScRspOuterClass {
  /**
   * Protobuf type {@code InteractPropScRsp}
   */
  public static final class InteractPropScRsp extends ProtoMessage<InteractPropScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 prop_state = 2;</code>
     */
    private int propState;

    /**
     * <code>optional uint32 retcode = 7;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 prop_entity_id = 9;</code>
     */
    private int propEntityId;

    private InteractPropScRsp() {
    }

    /**
     * @return a new empty instance of {@code InteractPropScRsp}
     */
    public static InteractPropScRsp newInstance() {
      return new InteractPropScRsp();
    }

    /**
     * <code>optional uint32 prop_state = 2;</code>
     * @return whether the propState field is set
     */
    public boolean hasPropState() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 prop_state = 2;</code>
     * @return this
     */
    public InteractPropScRsp clearPropState() {
      bitField0_ &= ~0x00000001;
      propState = 0;
      return this;
    }

    /**
     * <code>optional uint32 prop_state = 2;</code>
     * @return the propState
     */
    public int getPropState() {
      return propState;
    }

    /**
     * <code>optional uint32 prop_state = 2;</code>
     * @param value the propState to set
     * @return this
     */
    public InteractPropScRsp setPropState(final int value) {
      bitField0_ |= 0x00000001;
      propState = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return this
     */
    public InteractPropScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @param value the retcode to set
     * @return this
     */
    public InteractPropScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 prop_entity_id = 9;</code>
     * @return whether the propEntityId field is set
     */
    public boolean hasPropEntityId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 prop_entity_id = 9;</code>
     * @return this
     */
    public InteractPropScRsp clearPropEntityId() {
      bitField0_ &= ~0x00000004;
      propEntityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 prop_entity_id = 9;</code>
     * @return the propEntityId
     */
    public int getPropEntityId() {
      return propEntityId;
    }

    /**
     * <code>optional uint32 prop_entity_id = 9;</code>
     * @param value the propEntityId to set
     * @return this
     */
    public InteractPropScRsp setPropEntityId(final int value) {
      bitField0_ |= 0x00000004;
      propEntityId = value;
      return this;
    }

    @Override
    public InteractPropScRsp copyFrom(final InteractPropScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        propState = other.propState;
        retcode = other.retcode;
        propEntityId = other.propEntityId;
      }
      return this;
    }

    @Override
    public InteractPropScRsp mergeFrom(final InteractPropScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPropState()) {
        setPropState(other.propState);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasPropEntityId()) {
        setPropEntityId(other.propEntityId);
      }
      return this;
    }

    @Override
    public InteractPropScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      propState = 0;
      retcode = 0;
      propEntityId = 0;
      return this;
    }

    @Override
    public InteractPropScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof InteractPropScRsp)) {
        return false;
      }
      InteractPropScRsp other = (InteractPropScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasPropState() || propState == other.propState)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasPropEntityId() || propEntityId == other.propEntityId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(propState);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(propEntityId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(propState);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(propEntityId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public InteractPropScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // propState
            propState = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // propEntityId
            propEntityId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.propState, propState);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.propEntityId, propEntityId);
      }
      output.endObject();
    }

    @Override
    public InteractPropScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -739191058:
          case -1096911691: {
            if (input.isAtField(FieldNames.propState)) {
              if (!input.trySkipNullValue()) {
                propState = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -68717343:
          case -57484005: {
            if (input.isAtField(FieldNames.propEntityId)) {
              if (!input.trySkipNullValue()) {
                propEntityId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public InteractPropScRsp clone() {
      return new InteractPropScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static InteractPropScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new InteractPropScRsp(), data).checkInitialized();
    }

    public static InteractPropScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new InteractPropScRsp(), input).checkInitialized();
    }

    public static InteractPropScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new InteractPropScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating InteractPropScRsp messages
     */
    public static MessageFactory<InteractPropScRsp> getFactory() {
      return InteractPropScRspFactory.INSTANCE;
    }

    private enum InteractPropScRspFactory implements MessageFactory<InteractPropScRsp> {
      INSTANCE;

      @Override
      public InteractPropScRsp create() {
        return InteractPropScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName propState = FieldName.forField("propState", "prop_state");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName propEntityId = FieldName.forField("propEntityId", "prop_entity_id");
    }
  }
}
