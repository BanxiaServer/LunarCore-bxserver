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
import us.hebi.quickbuf.Utf8String;

public final class AnnounceDataOuterClass {
    public AnnounceDataOuterClass() {
    }

    public static final class AnnounceData extends ProtoMessage<AnnounceData> implements Cloneable {
        private static final long serialVersionUID = 0L;
        private long beginTime;
        private long endTime;
        private int countDownFrequency;
        private int configId;
        private int centerSystemFrequency;
        private boolean unkbool;
        private final Utf8String text = Utf8String.newEmptyInstance();
        private final Utf8String text1 = Utf8String.newEmptyInstance();
        private final Utf8String text2 = Utf8String.newEmptyInstance();

        private AnnounceData() {
        }

        public static AnnounceData newInstance() {
            return new AnnounceData();
        }

        public boolean hasBeginTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public AnnounceData clearBeginTime() {
            this.bitField0_ &= -2;
            this.beginTime = 0L;
            return this;
        }

        public long getBeginTime() {
            return this.beginTime;
        }

        public AnnounceData setBeginTime(long value) {
            this.bitField0_ |= 1;
            this.beginTime = value;
            return this;
        }

        public boolean hasEndTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public AnnounceData clearEndTime() {
            this.bitField0_ &= -3;
            this.endTime = 0L;
            return this;
        }

        public long getEndTime() {
            return this.endTime;
        }

        public AnnounceData setEndTime(long value) {
            this.bitField0_ |= 2;
            this.endTime = value;
            return this;
        }

        public boolean hasCountDownFrequency() {
            return (this.bitField0_ & 4) != 0;
        }

        public AnnounceData clearCountDownFrequency() {
            this.bitField0_ &= -5;
            this.countDownFrequency = 0;
            return this;
        }

        public int getCountDownFrequency() {
            return this.countDownFrequency;
        }

        public AnnounceData setCountDownFrequency(int value) {
            this.bitField0_ |= 4;
            this.countDownFrequency = value;
            return this;
        }

        public boolean hasConfigId() {
            return (this.bitField0_ & 8) != 0;
        }

        public AnnounceData clearConfigId() {
            this.bitField0_ &= -9;
            this.configId = 0;
            return this;
        }

        public int getConfigId() {
            return this.configId;
        }

        public AnnounceData setConfigId(int value) {
            this.bitField0_ |= 8;
            this.configId = value;
            return this;
        }

        public boolean hasCenterSystemFrequency() {
            return (this.bitField0_ & 16) != 0;
        }

        public AnnounceData clearCenterSystemFrequency() {
            this.bitField0_ &= -17;
            this.centerSystemFrequency = 0;
            return this;
        }

        public int getCenterSystemFrequency() {
            return this.centerSystemFrequency;
        }

        public AnnounceData setCenterSystemFrequency(int value) {
            this.bitField0_ |= 16;
            this.centerSystemFrequency = value;
            return this;
        }

        public boolean hasUnkbool() {
            return (this.bitField0_ & 32) != 0;
        }

        public AnnounceData clearUnkbool() {
            this.bitField0_ &= -33;
            this.unkbool = false;
            return this;
        }

        public boolean getUnkbool() {
            return this.unkbool;
        }

        public AnnounceData setUnkbool(boolean value) {
            this.bitField0_ |= 32;
            this.unkbool = value;
            return this;
        }

        public boolean hasText() {
            return (this.bitField0_ & 64) != 0;
        }

        public AnnounceData clearText() {
            this.bitField0_ &= -65;
            this.text.clear();
            return this;
        }

        public String getText() {
            return this.text.getString();
        }

        public Utf8String getTextBytes() {
            return this.text;
        }

        public Utf8String getMutableTextBytes() {
            this.bitField0_ |= 64;
            return this.text;
        }

        public AnnounceData setText(CharSequence value) {
            this.bitField0_ |= 64;
            this.text.copyFrom(value);
            return this;
        }

        public AnnounceData setText(Utf8String value) {
            this.bitField0_ |= 64;
            this.text.copyFrom(value);
            return this;
        }

        public boolean hasText1() {
            return (this.bitField0_ & 128) != 0;
        }

        public AnnounceData clearText1() {
            this.bitField0_ &= -129;
            this.text1.clear();
            return this;
        }

        public String getText1() {
            return this.text1.getString();
        }

        public Utf8String getText1Bytes() {
            return this.text1;
        }

        public Utf8String getMutableText1Bytes() {
            this.bitField0_ |= 128;
            return this.text1;
        }

        public AnnounceData setText1(CharSequence value) {
            this.bitField0_ |= 128;
            this.text1.copyFrom(value);
            return this;
        }

        public AnnounceData setText1(Utf8String value) {
            this.bitField0_ |= 128;
            this.text1.copyFrom(value);
            return this;
        }

        public boolean hasText2() {
            return (this.bitField0_ & 256) != 0;
        }

        public AnnounceData clearText2() {
            this.bitField0_ &= -257;
            this.text2.clear();
            return this;
        }

        public String getText2() {
            return this.text2.getString();
        }

        public Utf8String getText2Bytes() {
            return this.text2;
        }

        public Utf8String getMutableText2Bytes() {
            this.bitField0_ |= 256;
            return this.text2;
        }

        public AnnounceData setText2(CharSequence value) {
            this.bitField0_ |= 256;
            this.text2.copyFrom(value);
            return this;
        }

        public AnnounceData setText2(Utf8String value) {
            this.bitField0_ |= 256;
            this.text2.copyFrom(value);
            return this;
        }

        public AnnounceData copyFrom(AnnounceData other) {
            this.cachedSize = other.cachedSize;
            if ((this.bitField0_ | other.bitField0_) != 0) {
                this.bitField0_ = other.bitField0_;
                this.beginTime = other.beginTime;
                this.endTime = other.endTime;
                this.countDownFrequency = other.countDownFrequency;
                this.configId = other.configId;
                this.centerSystemFrequency = other.centerSystemFrequency;
                this.unkbool = other.unkbool;
                this.text.copyFrom(other.text);
                this.text1.copyFrom(other.text1);
                this.text2.copyFrom(other.text2);
            }

            return this;
        }

        public AnnounceData mergeFrom(AnnounceData other) {
            if (other.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                if (other.hasBeginTime()) {
                    this.setBeginTime(other.beginTime);
                }

                if (other.hasEndTime()) {
                    this.setEndTime(other.endTime);
                }

                if (other.hasCountDownFrequency()) {
                    this.setCountDownFrequency(other.countDownFrequency);
                }

                if (other.hasConfigId()) {
                    this.setConfigId(other.configId);
                }

                if (other.hasCenterSystemFrequency()) {
                    this.setCenterSystemFrequency(other.centerSystemFrequency);
                }

                if (other.hasUnkbool()) {
                    this.setUnkbool(other.unkbool);
                }

                if (other.hasText()) {
                    this.getMutableTextBytes().copyFrom(other.text);
                }

                if (other.hasText1()) {
                    this.getMutableText1Bytes().copyFrom(other.text1);
                }

                if (other.hasText2()) {
                    this.getMutableText2Bytes().copyFrom(other.text2);
                }

                return this;
            }
        }

        public AnnounceData clear() {
            if (this.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                this.bitField0_ = 0;
                this.beginTime = 0L;
                this.endTime = 0L;
                this.countDownFrequency = 0;
                this.configId = 0;
                this.centerSystemFrequency = 0;
                this.unkbool = false;
                this.text.clear();
                this.text1.clear();
                this.text2.clear();
                return this;
            }
        }

        public AnnounceData clearQuick() {
            if (this.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                this.bitField0_ = 0;
                this.text.clear();
                this.text1.clear();
                this.text2.clear();
                return this;
            }
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof AnnounceData)) {
                return false;
            } else {
                AnnounceData other = (AnnounceData)o;
                return this.bitField0_ == other.bitField0_ && (!this.hasBeginTime() || this.beginTime == other.beginTime) && (!this.hasEndTime() || this.endTime == other.endTime) && (!this.hasCountDownFrequency() || this.countDownFrequency == other.countDownFrequency) && (!this.hasConfigId() || this.configId == other.configId) && (!this.hasCenterSystemFrequency() || this.centerSystemFrequency == other.centerSystemFrequency) && (!this.hasUnkbool() || this.unkbool == other.unkbool) && (!this.hasText() || this.text.equals(other.text)) && (!this.hasText1() || this.text1.equals(other.text1)) && (!this.hasText2() || this.text2.equals(other.text2));
            }
        }

        public void writeTo(ProtoSink output) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                output.writeRawByte((byte)8);
                output.writeInt64NoTag(this.beginTime);
            }

            if ((this.bitField0_ & 2) != 0) {
                output.writeRawByte((byte)88);
                output.writeInt64NoTag(this.endTime);
            }

            if ((this.bitField0_ & 4) != 0) {
                output.writeRawByte((byte)16);
                output.writeUInt32NoTag(this.countDownFrequency);
            }

            if ((this.bitField0_ & 8) != 0) {
                output.writeRawByte((byte)48);
                output.writeUInt32NoTag(this.configId);
            }

            if ((this.bitField0_ & 16) != 0) {
                output.writeRawByte((byte)64);
                output.writeUInt32NoTag(this.centerSystemFrequency);
            }

            if ((this.bitField0_ & 32) != 0) {
                output.writeRawByte((byte)72);
                output.writeBoolNoTag(this.unkbool);
            }

            if ((this.bitField0_ & 64) != 0) {
                output.writeRawByte((byte)42);
                output.writeStringNoTag(this.text);
            }

            if ((this.bitField0_ & 128) != 0) {
                output.writeRawByte((byte)98);
                output.writeStringNoTag(this.text1);
            }

            if ((this.bitField0_ & 256) != 0) {
                output.writeRawByte((byte)106);
                output.writeStringNoTag(this.text2);
            }

        }

        protected int computeSerializedSize() {
            int size = 0;
            if ((this.bitField0_ & 1) != 0) {
                size += 1 + ProtoSink.computeInt64SizeNoTag(this.beginTime);
            }

            if ((this.bitField0_ & 2) != 0) {
                size += 1 + ProtoSink.computeInt64SizeNoTag(this.endTime);
            }

            if ((this.bitField0_ & 4) != 0) {
                size += 1 + ProtoSink.computeUInt32SizeNoTag(this.countDownFrequency);
            }

            if ((this.bitField0_ & 8) != 0) {
                size += 1 + ProtoSink.computeUInt32SizeNoTag(this.configId);
            }

            if ((this.bitField0_ & 16) != 0) {
                size += 1 + ProtoSink.computeUInt32SizeNoTag(this.centerSystemFrequency);
            }

            if ((this.bitField0_ & 32) != 0) {
                size += 2;
            }

            if ((this.bitField0_ & 64) != 0) {
                size += 1 + ProtoSink.computeStringSizeNoTag(this.text);
            }

            if ((this.bitField0_ & 128) != 0) {
                size += 1 + ProtoSink.computeStringSizeNoTag(this.text1);
            }

            if ((this.bitField0_ & 256) != 0) {
                size += 1 + ProtoSink.computeStringSizeNoTag(this.text2);
            }

            return size;
        }

        public AnnounceData mergeFrom(ProtoSource input) throws IOException {
            int tag = input.readTag();

            while(true) {
                switch (tag) {
                    case 0:
                        return this;
                    case 8:
                        this.beginTime = input.readInt64();
                        this.bitField0_ |= 1;
                        tag = input.readTag();
                        if (tag != 88) {
                            break;
                        }
                    case 88:
                        this.endTime = input.readInt64();
                        this.bitField0_ |= 2;
                        tag = input.readTag();
                        if (tag != 16) {
                            break;
                        }
                    case 16:
                        this.countDownFrequency = input.readUInt32();
                        this.bitField0_ |= 4;
                        tag = input.readTag();
                        if (tag != 48) {
                            break;
                        }
                    case 48:
                        this.configId = input.readUInt32();
                        this.bitField0_ |= 8;
                        tag = input.readTag();
                        if (tag != 64) {
                            break;
                        }
                    case 64:
                        this.centerSystemFrequency = input.readUInt32();
                        this.bitField0_ |= 16;
                        tag = input.readTag();
                        if (tag != 72) {
                            break;
                        }
                    case 72:
                        this.unkbool = input.readBool();
                        this.bitField0_ |= 32;
                        tag = input.readTag();
                        if (tag != 42) {
                            break;
                        }
                    case 42:
                        input.readString(this.text);
                        this.bitField0_ |= 64;
                        tag = input.readTag();
                        if (tag != 98) {
                            break;
                        }
                    case 98:
                        input.readString(this.text1);
                        this.bitField0_ |= 128;
                        tag = input.readTag();
                        if (tag != 106) {
                            break;
                        }
                    case 106:
                        input.readString(this.text2);
                        this.bitField0_ |= 256;
                        tag = input.readTag();
                        if (tag != 0) {
                            break;
                        }

                        return this;
                    default:
                        if (!input.skipField(tag)) {
                            return this;
                        }

                        tag = input.readTag();
                }
            }
        }

        public void writeTo(JsonSink output) throws IOException {
            output.beginObject();
            if ((this.bitField0_ & 1) != 0) {
                output.writeInt64(AnnounceDataOuterClass.AnnounceData.FieldNames.beginTime, this.beginTime);
            }

            if ((this.bitField0_ & 2) != 0) {
                output.writeInt64(AnnounceDataOuterClass.AnnounceData.FieldNames.endTime, this.endTime);
            }

            if ((this.bitField0_ & 4) != 0) {
                output.writeUInt32(AnnounceDataOuterClass.AnnounceData.FieldNames.countDownFrequency, this.countDownFrequency);
            }

            if ((this.bitField0_ & 8) != 0) {
                output.writeUInt32(AnnounceDataOuterClass.AnnounceData.FieldNames.configId, this.configId);
            }

            if ((this.bitField0_ & 16) != 0) {
                output.writeUInt32(AnnounceDataOuterClass.AnnounceData.FieldNames.centerSystemFrequency, this.centerSystemFrequency);
            }

            if ((this.bitField0_ & 32) != 0) {
                output.writeBool(AnnounceDataOuterClass.AnnounceData.FieldNames.unkbool, this.unkbool);
            }

            if ((this.bitField0_ & 64) != 0) {
                output.writeString(AnnounceDataOuterClass.AnnounceData.FieldNames.text, this.text);
            }

            if ((this.bitField0_ & 128) != 0) {
                output.writeString(AnnounceDataOuterClass.AnnounceData.FieldNames.text1, this.text1);
            }

            if ((this.bitField0_ & 256) != 0) {
                output.writeString(AnnounceDataOuterClass.AnnounceData.FieldNames.text2, this.text2);
            }

            output.endObject();
        }

        public AnnounceData mergeFrom(JsonSource input) throws IOException {
            if (!input.beginObject()) {
                return this;
            } else {
                while(!input.isAtEnd()) {
                    switch (input.readFieldHash()) {
                        case -1607243192:
                        case 1725551537:
                            if (input.isAtField(AnnounceDataOuterClass.AnnounceData.FieldNames.endTime)) {
                                if (!input.trySkipNullValue()) {
                                    this.endTime = input.readInt64();
                                    this.bitField0_ |= 2;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        case -1526415569:
                        case 1551558155:
                            if (input.isAtField(AnnounceDataOuterClass.AnnounceData.FieldNames.countDownFrequency)) {
                                if (!input.trySkipNullValue()) {
                                    this.countDownFrequency = input.readUInt32();
                                    this.bitField0_ |= 4;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        case -1285402920:
                        case 671051254:
                            if (input.isAtField(AnnounceDataOuterClass.AnnounceData.FieldNames.centerSystemFrequency)) {
                                if (!input.trySkipNullValue()) {
                                    this.centerSystemFrequency = input.readUInt32();
                                    this.bitField0_ |= 16;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        case -1072839914:
                        case 1112183971:
                            if (input.isAtField(AnnounceDataOuterClass.AnnounceData.FieldNames.beginTime)) {
                                if (!input.trySkipNullValue()) {
                                    this.beginTime = input.readInt64();
                                    this.bitField0_ |= 1;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        case -804450504:
                        case -580140035:
                            if (input.isAtField(AnnounceDataOuterClass.AnnounceData.FieldNames.configId)) {
                                if (!input.trySkipNullValue()) {
                                    this.configId = input.readUInt32();
                                    this.bitField0_ |= 8;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        case -285198628:
                            if (input.isAtField(AnnounceDataOuterClass.AnnounceData.FieldNames.unkbool)) {
                                if (!input.trySkipNullValue()) {
                                    this.unkbool = input.readBool();
                                    this.bitField0_ |= 32;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        case 3556653:
                            if (input.isAtField(AnnounceDataOuterClass.AnnounceData.FieldNames.text)) {
                                if (!input.trySkipNullValue()) {
                                    input.readString(this.text);
                                    this.bitField0_ |= 64;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        case 110256292:
                            if (input.isAtField(AnnounceDataOuterClass.AnnounceData.FieldNames.text1)) {
                                if (!input.trySkipNullValue()) {
                                    input.readString(this.text1);
                                    this.bitField0_ |= 128;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        case 110256293:
                            if (input.isAtField(AnnounceDataOuterClass.AnnounceData.FieldNames.text2)) {
                                if (!input.trySkipNullValue()) {
                                    input.readString(this.text2);
                                    this.bitField0_ |= 256;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        default:
                            input.skipUnknownField();
                    }
                }

                input.endObject();
                return this;
            }
        }

        public AnnounceData clone() {
            return (new AnnounceData()).copyFrom(this);
        }

        public boolean isEmpty() {
            return this.bitField0_ == 0;
        }

        public static AnnounceData parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (AnnounceData)((AnnounceData)ProtoMessage.mergeFrom(new AnnounceData(), data)).checkInitialized();
        }

        public static AnnounceData parseFrom(ProtoSource input) throws IOException {
            return (AnnounceData)((AnnounceData)ProtoMessage.mergeFrom(new AnnounceData(), input)).checkInitialized();
        }

        public static AnnounceData parseFrom(JsonSource input) throws IOException {
            return (AnnounceData)((AnnounceData)ProtoMessage.mergeFrom(new AnnounceData(), input)).checkInitialized();
        }

        public static MessageFactory<AnnounceData> getFactory() {
            return AnnounceDataOuterClass.AnnounceData.AnnounceDataFactory.INSTANCE;
        }

        static class FieldNames {
            static final FieldName beginTime = FieldName.forField("beginTime", "begin_time");
            static final FieldName endTime = FieldName.forField("endTime", "end_time");
            static final FieldName countDownFrequency = FieldName.forField("countDownFrequency", "count_down_frequency");
            static final FieldName configId = FieldName.forField("configId", "config_id");
            static final FieldName centerSystemFrequency = FieldName.forField("centerSystemFrequency", "center_system_frequency");
            static final FieldName unkbool = FieldName.forField("unkbool");
            static final FieldName text = FieldName.forField("text");
            static final FieldName text1 = FieldName.forField("text1");
            static final FieldName text2 = FieldName.forField("text2");

            FieldNames() {
            }
        }

        private static enum AnnounceDataFactory implements MessageFactory<AnnounceData> {
            INSTANCE;

            private AnnounceDataFactory() {
            }

            public AnnounceData create() {
                return AnnounceDataOuterClass.AnnounceData.newInstance();
            }
        }
    }
}
