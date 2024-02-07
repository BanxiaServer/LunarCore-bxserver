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
import us.hebi.quickbuf.RepeatedMessage;

public final class SelectRogueDialogueEventScRspOuterClass {
  /**
   * Protobuf type {@code SelectRogueDialogueEventScRsp}
   */
  public static final class SelectRogueDialogueEventScRsp extends ProtoMessage<SelectRogueDialogueEventScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 dialogue_event_id = 9;</code>
     */
    private int dialogueEventId;

    /**
     * <code>optional uint32 retcode = 15;</code>
     */
    private int retcode;

    /**
     * <code>optional .RogueDialogueEvent event_data = 14;</code>
     */
    private final RogueDialogueEventOuterClass.RogueDialogueEvent eventData = RogueDialogueEventOuterClass.RogueDialogueEvent.newInstance();

    /**
     * <code>repeated .DialogueResult dialogue_result = 6;</code>
     */
    private final RepeatedMessage<DialogueResultOuterClass.DialogueResult> dialogueResult = RepeatedMessage.newEmptyInstance(DialogueResultOuterClass.DialogueResult.getFactory());

    private SelectRogueDialogueEventScRsp() {
    }

    /**
     * @return a new empty instance of {@code SelectRogueDialogueEventScRsp}
     */
    public static SelectRogueDialogueEventScRsp newInstance() {
      return new SelectRogueDialogueEventScRsp();
    }

    /**
     * <code>optional uint32 dialogue_event_id = 9;</code>
     * @return whether the dialogueEventId field is set
     */
    public boolean hasDialogueEventId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 dialogue_event_id = 9;</code>
     * @return this
     */
    public SelectRogueDialogueEventScRsp clearDialogueEventId() {
      bitField0_ &= ~0x00000001;
      dialogueEventId = 0;
      return this;
    }

    /**
     * <code>optional uint32 dialogue_event_id = 9;</code>
     * @return the dialogueEventId
     */
    public int getDialogueEventId() {
      return dialogueEventId;
    }

    /**
     * <code>optional uint32 dialogue_event_id = 9;</code>
     * @param value the dialogueEventId to set
     * @return this
     */
    public SelectRogueDialogueEventScRsp setDialogueEventId(final int value) {
      bitField0_ |= 0x00000001;
      dialogueEventId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return this
     */
    public SelectRogueDialogueEventScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @param value the retcode to set
     * @return this
     */
    public SelectRogueDialogueEventScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .RogueDialogueEvent event_data = 14;</code>
     * @return whether the eventData field is set
     */
    public boolean hasEventData() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RogueDialogueEvent event_data = 14;</code>
     * @return this
     */
    public SelectRogueDialogueEventScRsp clearEventData() {
      bitField0_ &= ~0x00000004;
      eventData.clear();
      return this;
    }

    /**
     * <code>optional .RogueDialogueEvent event_data = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEventData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueDialogueEventOuterClass.RogueDialogueEvent getEventData() {
      return eventData;
    }

    /**
     * <code>optional .RogueDialogueEvent event_data = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueDialogueEventOuterClass.RogueDialogueEvent getMutableEventData() {
      bitField0_ |= 0x00000004;
      return eventData;
    }

    /**
     * <code>optional .RogueDialogueEvent event_data = 14;</code>
     * @param value the eventData to set
     * @return this
     */
    public SelectRogueDialogueEventScRsp setEventData(
        final RogueDialogueEventOuterClass.RogueDialogueEvent value) {
      bitField0_ |= 0x00000004;
      eventData.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated .DialogueResult dialogue_result = 6;</code>
     * @return whether the dialogueResult field is set
     */
    public boolean hasDialogueResult() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .DialogueResult dialogue_result = 6;</code>
     * @return this
     */
    public SelectRogueDialogueEventScRsp clearDialogueResult() {
      bitField0_ &= ~0x00000008;
      dialogueResult.clear();
      return this;
    }

    /**
     * <code>repeated .DialogueResult dialogue_result = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDialogueResult()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<DialogueResultOuterClass.DialogueResult> getDialogueResult() {
      return dialogueResult;
    }

    /**
     * <code>repeated .DialogueResult dialogue_result = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<DialogueResultOuterClass.DialogueResult> getMutableDialogueResult() {
      bitField0_ |= 0x00000008;
      return dialogueResult;
    }

    /**
     * <code>repeated .DialogueResult dialogue_result = 6;</code>
     * @param value the dialogueResult to add
     * @return this
     */
    public SelectRogueDialogueEventScRsp addDialogueResult(
        final DialogueResultOuterClass.DialogueResult value) {
      bitField0_ |= 0x00000008;
      dialogueResult.add(value);
      return this;
    }

    /**
     * <code>repeated .DialogueResult dialogue_result = 6;</code>
     * @param values the dialogueResult to add
     * @return this
     */
    public SelectRogueDialogueEventScRsp addAllDialogueResult(
        final DialogueResultOuterClass.DialogueResult... values) {
      bitField0_ |= 0x00000008;
      dialogueResult.addAll(values);
      return this;
    }

    @Override
    public SelectRogueDialogueEventScRsp copyFrom(final SelectRogueDialogueEventScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        dialogueEventId = other.dialogueEventId;
        retcode = other.retcode;
        eventData.copyFrom(other.eventData);
        dialogueResult.copyFrom(other.dialogueResult);
      }
      return this;
    }

    @Override
    public SelectRogueDialogueEventScRsp mergeFrom(final SelectRogueDialogueEventScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDialogueEventId()) {
        setDialogueEventId(other.dialogueEventId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasEventData()) {
        getMutableEventData().mergeFrom(other.eventData);
      }
      if (other.hasDialogueResult()) {
        getMutableDialogueResult().addAll(other.dialogueResult);
      }
      return this;
    }

    @Override
    public SelectRogueDialogueEventScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dialogueEventId = 0;
      retcode = 0;
      eventData.clear();
      dialogueResult.clear();
      return this;
    }

    @Override
    public SelectRogueDialogueEventScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      eventData.clearQuick();
      dialogueResult.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SelectRogueDialogueEventScRsp)) {
        return false;
      }
      SelectRogueDialogueEventScRsp other = (SelectRogueDialogueEventScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasDialogueEventId() || dialogueEventId == other.dialogueEventId)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasEventData() || eventData.equals(other.eventData))
        && (!hasDialogueResult() || dialogueResult.equals(other.dialogueResult));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(dialogueEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(eventData);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < dialogueResult.length(); i++) {
          output.writeRawByte((byte) 50);
          output.writeMessageNoTag(dialogueResult.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dialogueEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(eventData);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * dialogueResult.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(dialogueResult);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SelectRogueDialogueEventScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // dialogueEventId
            dialogueEventId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // eventData
            input.readMessage(eventData);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // dialogueResult
            tag = input.readRepeatedMessage(dialogueResult, tag);
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.dialogueEventId, dialogueEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.eventData, eventData);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.dialogueResult, dialogueResult);
      }
      output.endObject();
    }

    @Override
    public SelectRogueDialogueEventScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 88389725:
          case 1671736167: {
            if (input.isAtField(FieldNames.dialogueEventId)) {
              if (!input.trySkipNullValue()) {
                dialogueEventId = input.readUInt32();
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
          case 30931300:
          case 983877167: {
            if (input.isAtField(FieldNames.eventData)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(eventData);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1191037973:
          case 1574283364: {
            if (input.isAtField(FieldNames.dialogueResult)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(dialogueResult);
                bitField0_ |= 0x00000008;
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
    public SelectRogueDialogueEventScRsp clone() {
      return new SelectRogueDialogueEventScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SelectRogueDialogueEventScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SelectRogueDialogueEventScRsp(), data).checkInitialized();
    }

    public static SelectRogueDialogueEventScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SelectRogueDialogueEventScRsp(), input).checkInitialized();
    }

    public static SelectRogueDialogueEventScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SelectRogueDialogueEventScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SelectRogueDialogueEventScRsp messages
     */
    public static MessageFactory<SelectRogueDialogueEventScRsp> getFactory() {
      return SelectRogueDialogueEventScRspFactory.INSTANCE;
    }

    private enum SelectRogueDialogueEventScRspFactory implements MessageFactory<SelectRogueDialogueEventScRsp> {
      INSTANCE;

      @Override
      public SelectRogueDialogueEventScRsp create() {
        return SelectRogueDialogueEventScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName dialogueEventId = FieldName.forField("dialogueEventId", "dialogue_event_id");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName eventData = FieldName.forField("eventData", "event_data");

      static final FieldName dialogueResult = FieldName.forField("dialogueResult", "dialogue_result");
    }
  }
}
