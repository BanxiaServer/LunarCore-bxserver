package emu.lunarcore.proto;

import emu.lunarcore.proto.AnnounceDataOuterClass.AnnounceData;
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

public final class ServerAnnounceNotifyOuterClass {
    public ServerAnnounceNotifyOuterClass() {
    }

    public static final class ServerAnnounceNotify extends ProtoMessage<ServerAnnounceNotify> implements Cloneable {
        private static final long serialVersionUID = 0L;
        private final RepeatedMessage<AnnounceDataOuterClass.AnnounceData> announceDataList = RepeatedMessage.newEmptyInstance(AnnounceData.getFactory());

        private ServerAnnounceNotify() {
        }

        public static ServerAnnounceNotify newInstance() {
            return new ServerAnnounceNotify();
        }

        public boolean hasAnnounceDataList() {
            return (this.bitField0_ & 1) != 0;
        }

        public ServerAnnounceNotify clearAnnounceDataList() {
            this.bitField0_ &= -2;
            this.announceDataList.clear();
            return this;
        }

        public RepeatedMessage<AnnounceDataOuterClass.AnnounceData> getAnnounceDataList() {
            return this.announceDataList;
        }

        public RepeatedMessage<AnnounceDataOuterClass.AnnounceData> getMutableAnnounceDataList() {
            this.bitField0_ |= 1;
            return this.announceDataList;
        }

        public ServerAnnounceNotify addAnnounceDataList(AnnounceDataOuterClass.AnnounceData value) {
            this.bitField0_ |= 1;
            this.announceDataList.add(value);
            return this;
        }

        public ServerAnnounceNotify addAllAnnounceDataList(AnnounceDataOuterClass.AnnounceData... values) {
            this.bitField0_ |= 1;
            this.announceDataList.addAll(values);
            return this;
        }

        public ServerAnnounceNotify copyFrom(ServerAnnounceNotify other) {
            this.cachedSize = other.cachedSize;
            if ((this.bitField0_ | other.bitField0_) != 0) {
                this.bitField0_ = other.bitField0_;
                this.announceDataList.copyFrom(other.announceDataList);
            }

            return this;
        }

        public ServerAnnounceNotify mergeFrom(ServerAnnounceNotify other) {
            if (other.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                if (other.hasAnnounceDataList()) {
                    this.getMutableAnnounceDataList().addAll(other.announceDataList);
                }

                return this;
            }
        }

        public ServerAnnounceNotify clear() {
            if (this.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                this.bitField0_ = 0;
                this.announceDataList.clear();
                return this;
            }
        }

        public ServerAnnounceNotify clearQuick() {
            if (this.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                this.bitField0_ = 0;
                this.announceDataList.clearQuick();
                return this;
            }
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof ServerAnnounceNotify)) {
                return false;
            } else {
                ServerAnnounceNotify other = (ServerAnnounceNotify)o;
                return this.bitField0_ == other.bitField0_ && (!this.hasAnnounceDataList() || this.announceDataList.equals(other.announceDataList));
            }
        }

        public void writeTo(ProtoSink output) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                for(int i = 0; i < this.announceDataList.length(); ++i) {
                    output.writeRawByte((byte)122);
                    output.writeMessageNoTag((ProtoMessage)this.announceDataList.get(i));
                }
            }

        }

        protected int computeSerializedSize() {
            int size = 0;
            if ((this.bitField0_ & 1) != 0) {
                size += 1 * this.announceDataList.length() + ProtoSink.computeRepeatedMessageSizeNoTag(this.announceDataList);
            }

            return size;
        }

        public ServerAnnounceNotify mergeFrom(ProtoSource input) throws IOException {
            int tag = input.readTag();

            while(true) {
                switch (tag) {
                    case 0:
                        return this;
                    case 122:
                        tag = input.readRepeatedMessage(this.announceDataList, tag);
                        this.bitField0_ |= 1;
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
                output.writeRepeatedMessage(ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.FieldNames.announceDataList, this.announceDataList);
            }

            output.endObject();
        }

        public ServerAnnounceNotify mergeFrom(JsonSource input) throws IOException {
            if (!input.beginObject()) {
                return this;
            } else {
                while(!input.isAtEnd()) {
                    switch (input.readFieldHash()) {
                        case 121672637:
                        case 1895739121:
                            if (input.isAtField(ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.FieldNames.announceDataList)) {
                                if (!input.trySkipNullValue()) {
                                    input.readRepeatedMessage(this.announceDataList);
                                    this.bitField0_ |= 1;
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

        public ServerAnnounceNotify clone() {
            return (new ServerAnnounceNotify()).copyFrom(this);
        }

        public boolean isEmpty() {
            return this.bitField0_ == 0;
        }

        public static ServerAnnounceNotify parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ServerAnnounceNotify)((ServerAnnounceNotify)ProtoMessage.mergeFrom(new ServerAnnounceNotify(), data)).checkInitialized();
        }

        public static ServerAnnounceNotify parseFrom(ProtoSource input) throws IOException {
            return (ServerAnnounceNotify)((ServerAnnounceNotify)ProtoMessage.mergeFrom(new ServerAnnounceNotify(), input)).checkInitialized();
        }

        public static ServerAnnounceNotify parseFrom(JsonSource input) throws IOException {
            return (ServerAnnounceNotify)((ServerAnnounceNotify)ProtoMessage.mergeFrom(new ServerAnnounceNotify(), input)).checkInitialized();
        }

        public static MessageFactory<ServerAnnounceNotify> getFactory() {
            return ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.ServerAnnounceNotifyFactory.INSTANCE;
        }

        static class FieldNames {
            static final FieldName announceDataList = FieldName.forField("announceDataList", "announce_data_list");

            FieldNames() {
            }
        }

        private static enum ServerAnnounceNotifyFactory implements MessageFactory<ServerAnnounceNotify> {
            INSTANCE;

            private ServerAnnounceNotifyFactory() {
            }

            public ServerAnnounceNotify create() {
                return ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.newInstance();
            }
        }
    }
}
