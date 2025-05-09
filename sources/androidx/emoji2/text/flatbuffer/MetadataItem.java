package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MetadataItem extends Table {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Vector extends BaseVector {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Vector vector, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/MetadataItem$Vector");
        }

        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Vector) ipChange.ipc$dispatch("e567b838", new Object[]{this, new Integer(i), new Integer(i2), byteBuffer});
            }
            __reset(i, i2, byteBuffer);
            return this;
        }

        public MetadataItem get(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MetadataItem) ipChange.ipc$dispatch("9b35e98c", new Object[]{this, new Integer(i)}) : get(new MetadataItem(), i);
        }

        public MetadataItem get(MetadataItem metadataItem, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MetadataItem) ipChange.ipc$dispatch("23ccae88", new Object[]{this, metadataItem, new Integer(i)}) : metadataItem.__assign(MetadataItem.access$000(__element(i), this.bb), this.bb);
        }
    }

    public static void ValidateVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f6249", new Object[0]);
        } else {
            Constants.FLATBUFFERS_1_12_0();
        }
    }

    public static /* synthetic */ int access$000(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d3d8658", new Object[]{new Integer(i), byteBuffer})).intValue();
        }
        return Table.__indirect(i, byteBuffer);
    }

    public static void addCodepoints(FlatBufferBuilder flatBufferBuilder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8a68ab", new Object[]{flatBufferBuilder, new Integer(i)});
        } else {
            flatBufferBuilder.addOffset(6, i, 0);
        }
    }

    public static void addCompatAdded(FlatBufferBuilder flatBufferBuilder, short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a684e1", new Object[]{flatBufferBuilder, new Short(s)});
        } else {
            flatBufferBuilder.addShort(3, s, 0);
        }
    }

    public static void addEmojiStyle(FlatBufferBuilder flatBufferBuilder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46493f77", new Object[]{flatBufferBuilder, new Boolean(z)});
        } else {
            flatBufferBuilder.addBoolean(1, z, false);
        }
    }

    public static void addId(FlatBufferBuilder flatBufferBuilder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b1c4b6", new Object[]{flatBufferBuilder, new Integer(i)});
        } else {
            flatBufferBuilder.addInt(0, i, 0);
        }
    }

    public static void addWidth(FlatBufferBuilder flatBufferBuilder, short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7855f49", new Object[]{flatBufferBuilder, new Short(s)});
        } else {
            flatBufferBuilder.addShort(4, s, 0);
        }
    }

    public static int createCodepointsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a36911b", new Object[]{flatBufferBuilder, iArr})).intValue();
        }
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createMetadataItem(FlatBufferBuilder flatBufferBuilder, int i, boolean z, short s, short s2, short s3, short s4, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2423ce7a", new Object[]{flatBufferBuilder, new Integer(i), new Boolean(z), new Short(s), new Short(s2), new Short(s3), new Short(s4), new Integer(i2)})).intValue();
        }
        flatBufferBuilder.startTable(7);
        addCodepoints(flatBufferBuilder, i2);
        addId(flatBufferBuilder, i);
        addHeight(flatBufferBuilder, s4);
        addWidth(flatBufferBuilder, s3);
        addCompatAdded(flatBufferBuilder, s2);
        addSdkAdded(flatBufferBuilder, s);
        addEmojiStyle(flatBufferBuilder, z);
        return endMetadataItem(flatBufferBuilder);
    }

    public static int endMetadataItem(FlatBufferBuilder flatBufferBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d197bcff", new Object[]{flatBufferBuilder})).intValue();
        }
        return flatBufferBuilder.endTable();
    }

    public static MetadataItem getRootAsMetadataItem(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetadataItem) ipChange.ipc$dispatch("3b0db154", new Object[]{byteBuffer}) : getRootAsMetadataItem(byteBuffer, new MetadataItem());
    }

    public static /* synthetic */ Object ipc$super(MetadataItem metadataItem, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/MetadataItem");
    }

    public static void startCodepointsVector(FlatBufferBuilder flatBufferBuilder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a2f30f", new Object[]{flatBufferBuilder, new Integer(i)});
        } else {
            flatBufferBuilder.startVector(4, i, 4);
        }
    }

    public static void startMetadataItem(FlatBufferBuilder flatBufferBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f198b825", new Object[]{flatBufferBuilder});
        } else {
            flatBufferBuilder.startTable(7);
        }
    }

    public MetadataItem __assign(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetadataItem) ipChange.ipc$dispatch("a90e348e", new Object[]{this, new Integer(i), byteBuffer});
        }
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44130c65", new Object[]{this, new Integer(i), byteBuffer});
        } else {
            __reset(i, byteBuffer);
        }
    }

    public int codepoints(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("252e043f", new Object[]{this, new Integer(i)})).intValue();
        }
        int __offset = __offset(16);
        if (__offset != 0) {
            return this.bb.getInt(__vector(__offset) + (i * 4));
        }
        return 0;
    }

    public ByteBuffer codepointsAsByteBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("124ff8b2", new Object[]{this});
        }
        return __vector_as_bytebuffer(16, 4);
    }

    public ByteBuffer codepointsInByteBuffer(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("51e9deee", new Object[]{this, byteBuffer});
        }
        return __vector_in_bytebuffer(byteBuffer, 16, 4);
    }

    public int codepointsLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ddcc990", new Object[]{this})).intValue();
        }
        int __offset = __offset(16);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public IntVector codepointsVector() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntVector) ipChange.ipc$dispatch("162fc40a", new Object[]{this}) : codepointsVector(new IntVector());
    }

    public short compatAdded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4baaa422", new Object[]{this})).shortValue();
        }
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public boolean emojiStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc1cf016", new Object[]{this})).booleanValue();
        }
        int __offset = __offset(6);
        if (__offset == 0 || this.bb.get(__offset + this.bb_pos) == 0) {
            return false;
        }
        return true;
    }

    public short height() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58c32a2b", new Object[]{this})).shortValue();
        }
        int __offset = __offset(14);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public int id() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8c38c15", new Object[]{this})).intValue();
        }
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public short sdkAdded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e0a6a6a", new Object[]{this})).shortValue();
        }
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public static void addHeight(FlatBufferBuilder flatBufferBuilder, short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc431cc", new Object[]{flatBufferBuilder, new Short(s)});
        } else {
            flatBufferBuilder.addShort(5, s, 0);
        }
    }

    public static MetadataItem getRootAsMetadataItem(ByteBuffer byteBuffer, MetadataItem metadataItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetadataItem) ipChange.ipc$dispatch("748f9698", new Object[]{byteBuffer, metadataItem});
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return metadataItem.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public IntVector codepointsVector(IntVector intVector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntVector) ipChange.ipc$dispatch("4fa950f6", new Object[]{this, intVector});
        }
        int __offset = __offset(16);
        if (__offset != 0) {
            return intVector.__assign(__vector(__offset), this.bb);
        }
        return null;
    }

    public short width() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcdb5f4a", new Object[]{this})).shortValue();
        }
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public static void addSdkAdded(FlatBufferBuilder flatBufferBuilder, short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34e44b", new Object[]{flatBufferBuilder, new Short(s)});
        } else {
            flatBufferBuilder.addShort(2, s, 0);
        }
    }
}
