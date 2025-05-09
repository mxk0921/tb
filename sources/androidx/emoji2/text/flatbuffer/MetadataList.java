package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.MetadataItem;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MetadataList extends Table {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Vector extends BaseVector {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Vector vector, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/MetadataList$Vector");
        }

        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Vector) ipChange.ipc$dispatch("8c32c3", new Object[]{this, new Integer(i), new Integer(i2), byteBuffer});
            }
            __reset(i, i2, byteBuffer);
            return this;
        }

        public MetadataList get(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MetadataList) ipChange.ipc$dispatch("9b5b6561", new Object[]{this, new Integer(i)}) : get(new MetadataList(), i);
        }

        public MetadataList get(MetadataList metadataList, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MetadataList) ipChange.ipc$dispatch("2092c832", new Object[]{this, metadataList, new Integer(i)}) : metadataList.__assign(MetadataList.access$000(__element(i), this.bb), this.bb);
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

    public static void addList(FlatBufferBuilder flatBufferBuilder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2fa6f9", new Object[]{flatBufferBuilder, new Integer(i)});
        } else {
            flatBufferBuilder.addOffset(1, i, 0);
        }
    }

    public static void addSourceSha(FlatBufferBuilder flatBufferBuilder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace3ca0a", new Object[]{flatBufferBuilder, new Integer(i)});
        } else {
            flatBufferBuilder.addOffset(2, i, 0);
        }
    }

    public static void addVersion(FlatBufferBuilder flatBufferBuilder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acc8f11", new Object[]{flatBufferBuilder, new Integer(i)});
        } else {
            flatBufferBuilder.addInt(0, i, 0);
        }
    }

    public static int createListVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86dd66cd", new Object[]{flatBufferBuilder, iArr})).intValue();
        }
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int endMetadataList(FlatBufferBuilder flatBufferBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1de714", new Object[]{flatBufferBuilder})).intValue();
        }
        return flatBufferBuilder.endTable();
    }

    public static void finishMetadataListBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ad001a", new Object[]{flatBufferBuilder, new Integer(i)});
        } else {
            flatBufferBuilder.finish(i);
        }
    }

    public static void finishSizePrefixedMetadataListBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6ef0c", new Object[]{flatBufferBuilder, new Integer(i)});
        } else {
            flatBufferBuilder.finishSizePrefixed(i);
        }
    }

    public static MetadataList getRootAsMetadataList(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetadataList) ipChange.ipc$dispatch("534af674", new Object[]{byteBuffer}) : getRootAsMetadataList(byteBuffer, new MetadataList());
    }

    public static /* synthetic */ Object ipc$super(MetadataList metadataList, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/MetadataList");
    }

    public static void startListVector(FlatBufferBuilder flatBufferBuilder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8141239d", new Object[]{flatBufferBuilder, new Integer(i)});
        } else {
            flatBufferBuilder.startVector(4, i, 4);
        }
    }

    public static void startMetadataList(FlatBufferBuilder flatBufferBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1ee23a", new Object[]{flatBufferBuilder});
        } else {
            flatBufferBuilder.startTable(3);
        }
    }

    public MetadataList __assign(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetadataList) ipChange.ipc$dispatch("a933b063", new Object[]{this, new Integer(i), byteBuffer});
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

    public MetadataItem list(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetadataItem) ipChange.ipc$dispatch("3b1d28d4", new Object[]{this, new Integer(i)}) : list(new MetadataItem(), i);
    }

    public int listLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5aebb9e", new Object[]{this})).intValue();
        }
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public MetadataItem.Vector listVector() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetadataItem.Vector) ipChange.ipc$dispatch("328a30e5", new Object[]{this}) : listVector(new MetadataItem.Vector());
    }

    public String sourceSha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("338f0108", new Object[]{this});
        }
        int __offset = __offset(8);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer sourceShaAsByteBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("6de109b3", new Object[]{this});
        }
        return __vector_as_bytebuffer(8, 1);
    }

    public int version() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29007552", new Object[]{this})).intValue();
        }
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public static int createMetadataList(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3660b36", new Object[]{flatBufferBuilder, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        flatBufferBuilder.startTable(3);
        addSourceSha(flatBufferBuilder, i3);
        addList(flatBufferBuilder, i2);
        addVersion(flatBufferBuilder, i);
        return endMetadataList(flatBufferBuilder);
    }

    public static MetadataList getRootAsMetadataList(ByteBuffer byteBuffer, MetadataList metadataList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetadataList) ipChange.ipc$dispatch("25f82403", new Object[]{byteBuffer, metadataList});
        }
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return metadataList.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public MetadataItem list(MetadataItem metadataItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetadataItem) ipChange.ipc$dispatch("21386fd0", new Object[]{this, metadataItem, new Integer(i)});
        }
        int __offset = __offset(6);
        if (__offset != 0) {
            return metadataItem.__assign(__indirect(__vector(__offset) + (i * 4)), this.bb);
        }
        return null;
    }

    public MetadataItem.Vector listVector(MetadataItem.Vector vector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetadataItem.Vector) ipChange.ipc$dispatch("2b6608c2", new Object[]{this, vector});
        }
        int __offset = __offset(6);
        if (__offset != 0) {
            return vector.__assign(__vector(__offset), 4, this.bb);
        }
        return null;
    }

    public ByteBuffer sourceShaInByteBuffer(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("f2e3288d", new Object[]{this, byteBuffer});
        }
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }
}
