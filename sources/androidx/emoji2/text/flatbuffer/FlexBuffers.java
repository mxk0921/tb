package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import tb.tiv;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FlexBuffers {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final ReadBuf EMPTY_BB = new ArrayReadWriteBuf(new byte[]{0}, 1);
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Blob extends Sized {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Blob EMPTY = new Blob(FlexBuffers.access$000(), 1, 1);

        public Blob(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Blob empty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Blob) ipChange.ipc$dispatch("c3ce8f99", new Object[0]);
            }
            return EMPTY;
        }

        public static /* synthetic */ Object ipc$super(Blob blob, String str, Object... objArr) {
            if (str.hashCode() == 845773819) {
                return new Integer(super.size());
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/FlexBuffers$Blob");
        }

        public ByteBuffer data() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteBuffer) ipChange.ipc$dispatch("d4f6f9f2", new Object[]{this});
            }
            ByteBuffer wrap = ByteBuffer.wrap(this.bb.data());
            wrap.position(this.end);
            wrap.limit(this.end + size());
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("72fc15b2", new Object[]{this, new Integer(i)})).byteValue();
            }
            return this.bb.get(this.end + i);
        }

        public byte[] getBytes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("3e6c8fa1", new Object[]{this});
            }
            int size = size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = this.bb.get(this.end + i);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.bb.getString(this.end, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StringBuilder) ipChange.ipc$dispatch("87b29eb3", new Object[]{this, sb});
            }
            sb.append('\"');
            sb.append(this.bb.getString(this.end, size()));
            sb.append('\"');
            return sb;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Key extends Object {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final Key EMPTY = new Key(FlexBuffers.access$000(), 0, 0);

        public Key(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static /* synthetic */ Key access$700() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Key) ipChange.ipc$dispatch("dc38d9eb", new Object[0]);
            }
            return EMPTY;
        }

        public static Key empty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Key) ipChange.ipc$dispatch("e970b01", new Object[0]);
            }
            return EMPTY;
        }

        public static /* synthetic */ Object ipc$super(Key key, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/FlexBuffers$Key");
        }

        public int compareTo(byte[] bArr) {
            byte b;
            byte b2;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a375e5c1", new Object[]{this, bArr})).intValue();
            }
            int i2 = this.end;
            do {
                b = this.bb.get(i2);
                b2 = bArr[i];
                if (b == 0) {
                    return b - b2;
                }
                i2++;
                i++;
                if (i == bArr.length) {
                    return b - b2;
                }
            } while (b == b2);
            return b - b2;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (key.end == this.end && key.byteWidth == this.byteWidth) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.end ^ this.byteWidth;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StringBuilder) ipChange.ipc$dispatch("87b29eb3", new Object[]{this, sb});
            }
            sb.append(toString());
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            int i = this.end;
            while (this.bb.get(i) != 0) {
                i++;
            }
            int i2 = this.end;
            return this.bb.getString(i2, i - i2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class KeyVector {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final TypedVector vec;

        public KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Key) ipChange.ipc$dispatch("aef31973", new Object[]{this, new Integer(i)});
            }
            if (i >= size()) {
                return Key.access$700();
            }
            TypedVector typedVector = this.vec;
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.bb;
            return new Key(readBuf, FlexBuffers.access$200(readBuf, typedVector.end + (i * typedVector.byteWidth), typedVector2.byteWidth), 1);
        }

        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return this.vec.size();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < this.vec.size(); i++) {
                this.vec.get(i).toString(sb);
                if (i != this.vec.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Map extends Vector {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final Map EMPTY_MAP = new Map(FlexBuffers.access$000(), 1, 1);

        public Map(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        private int binarySearch(KeyVector keyVector, byte[] bArr) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7d90f964", new Object[]{this, keyVector, bArr})).intValue();
            }
            int size = keyVector.size() - 1;
            while (i <= size) {
                int i2 = (i + size) >>> 1;
                int compareTo = keyVector.get(i2).compareTo(bArr);
                if (compareTo < 0) {
                    i = i2 + 1;
                } else if (compareTo <= 0) {
                    return i2;
                } else {
                    size = i2 - 1;
                }
            }
            return -(i + 1);
        }

        public static Map empty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("e97e3a4", new Object[0]);
            }
            return EMPTY_MAP;
        }

        public static /* synthetic */ Object ipc$super(Map map, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/FlexBuffers$Map");
        }

        public Reference get(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Reference) ipChange.ipc$dispatch("3f4afda8", new Object[]{this, str}) : get(str.getBytes(StandardCharsets.UTF_8));
        }

        public KeyVector keys() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (KeyVector) ipChange.ipc$dispatch("57ba7765", new Object[]{this});
            }
            int i = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.bb;
            int access$200 = FlexBuffers.access$200(readBuf, i, this.byteWidth);
            ReadBuf readBuf2 = this.bb;
            int i2 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, access$200, FlexBuffers.access$100(readBuf2, i + i2, i2), 4));
        }

        public Vector values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Vector) ipChange.ipc$dispatch("6ef5a47e", new Object[]{this});
            }
            return new Vector(this.bb, this.end, this.byteWidth);
        }

        public Reference get(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Reference) ipChange.ipc$dispatch("e04e62e5", new Object[]{this, bArr});
            }
            KeyVector keys = keys();
            int size = keys.size();
            int binarySearch = binarySearch(keys, bArr);
            if (binarySearch < 0 || binarySearch >= size) {
                return Reference.access$600();
            }
            return get(binarySearch);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StringBuilder) ipChange.ipc$dispatch("87b29eb3", new Object[]{this, sb});
            }
            sb.append("{ ");
            KeyVector keys = keys();
            int size = size();
            Vector values = values();
            for (int i = 0; i < size; i++) {
                sb.append('\"');
                sb.append(keys.get(i).toString());
                sb.append("\" : ");
                sb.append(values.get(i).toString());
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class Object {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ReadBuf bb;
        public int byteWidth;
        public int end;

        public Object(ReadBuf readBuf, int i, int i2) {
            this.bb = readBuf;
            this.end = i;
            this.byteWidth = i2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Reference {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.access$000(), 0, 1, 0);
        private ReadBuf bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        public Reference(ReadBuf readBuf, int i, int i2, int i3) {
            this(readBuf, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public static /* synthetic */ Reference access$600() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Reference) ipChange.ipc$dispatch("3db196be", new Object[0]);
            }
            return NULL_REFERENCE;
        }

        public Blob asBlob() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Blob) ipChange.ipc$dispatch("51d38f37", new Object[]{this});
            }
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            ReadBuf readBuf = this.bb;
            return new Blob(readBuf, FlexBuffers.access$200(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public boolean asBoolean() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ca6b0521", new Object[]{this})).booleanValue();
            }
            if (isBoolean()) {
                if (this.bb.get(this.end) != 0) {
                    return true;
                }
                return false;
            } else if (asUInt() != 0) {
                return true;
            } else {
                return false;
            }
        }

        public double asFloat() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("212cc4bf", new Object[]{this})).doubleValue();
            }
            int i = this.type;
            if (i == 3) {
                return FlexBuffers.access$400(this.bb, this.end, this.parentWidth);
            }
            if (i == 1) {
                return FlexBuffers.access$100(this.bb, this.end, this.parentWidth);
            }
            if (i != 2) {
                if (i == 5) {
                    return Double.parseDouble(asString());
                }
                if (i == 6) {
                    ReadBuf readBuf = this.bb;
                    return FlexBuffers.access$100(readBuf, FlexBuffers.access$200(readBuf, this.end, this.parentWidth), this.byteWidth);
                } else if (i == 7) {
                    ReadBuf readBuf2 = this.bb;
                    return FlexBuffers.access$300(readBuf2, FlexBuffers.access$200(readBuf2, this.end, this.parentWidth), this.byteWidth);
                } else if (i == 8) {
                    ReadBuf readBuf3 = this.bb;
                    return FlexBuffers.access$400(readBuf3, FlexBuffers.access$200(readBuf3, this.end, this.parentWidth), this.byteWidth);
                } else if (i == 10) {
                    return asVector().size();
                } else {
                    if (i != 26) {
                        return vu3.b.GEO_NOT_SUPPORT;
                    }
                }
            }
            return FlexBuffers.access$300(this.bb, this.end, this.parentWidth);
        }

        public int asInt() {
            long access$300;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("afe95c57", new Object[]{this})).intValue();
            }
            int i = this.type;
            if (i == 1) {
                return FlexBuffers.access$100(this.bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                access$300 = FlexBuffers.access$300(this.bb, this.end, this.parentWidth);
            } else if (i == 3) {
                return (int) FlexBuffers.access$400(this.bb, this.end, this.parentWidth);
            } else {
                if (i == 5) {
                    return Integer.parseInt(asString());
                }
                if (i == 6) {
                    ReadBuf readBuf = this.bb;
                    return FlexBuffers.access$100(readBuf, FlexBuffers.access$200(readBuf, this.end, this.parentWidth), this.byteWidth);
                } else if (i == 7) {
                    ReadBuf readBuf2 = this.bb;
                    access$300 = FlexBuffers.access$300(readBuf2, FlexBuffers.access$200(readBuf2, this.end, this.parentWidth), this.parentWidth);
                } else if (i == 8) {
                    ReadBuf readBuf3 = this.bb;
                    return (int) FlexBuffers.access$400(readBuf3, FlexBuffers.access$200(readBuf3, this.end, this.parentWidth), this.byteWidth);
                } else if (i == 10) {
                    return asVector().size();
                } else {
                    if (i != 26) {
                        return 0;
                    }
                    return FlexBuffers.access$100(this.bb, this.end, this.parentWidth);
                }
            }
            return (int) access$300;
        }

        public Key asKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Key) ipChange.ipc$dispatch("fec01a81", new Object[]{this});
            }
            if (!isKey()) {
                return Key.empty();
            }
            ReadBuf readBuf = this.bb;
            return new Key(readBuf, FlexBuffers.access$200(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public long asLong() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b2b4cb49", new Object[]{this})).longValue();
            }
            int i = this.type;
            if (i == 1) {
                return FlexBuffers.access$500(this.bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return FlexBuffers.access$300(this.bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) FlexBuffers.access$400(this.bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            } else if (i == 6) {
                ReadBuf readBuf = this.bb;
                return FlexBuffers.access$500(readBuf, FlexBuffers.access$200(readBuf, this.end, this.parentWidth), this.byteWidth);
            } else if (i == 7) {
                ReadBuf readBuf2 = this.bb;
                return FlexBuffers.access$300(readBuf2, FlexBuffers.access$200(readBuf2, this.end, this.parentWidth), this.parentWidth);
            } else if (i == 8) {
                ReadBuf readBuf3 = this.bb;
                return (long) FlexBuffers.access$400(readBuf3, FlexBuffers.access$200(readBuf3, this.end, this.parentWidth), this.byteWidth);
            } else if (i == 10) {
                return asVector().size();
            } else {
                if (i != 26) {
                    return 0L;
                }
                return FlexBuffers.access$100(this.bb, this.end, this.parentWidth);
            }
        }

        public Map asMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f1eb65a1", new Object[]{this});
            }
            if (!isMap()) {
                return Map.empty();
            }
            ReadBuf readBuf = this.bb;
            return new Map(readBuf, FlexBuffers.access$200(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public String asString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("337cfff6", new Object[]{this});
            }
            if (isString()) {
                int access$200 = FlexBuffers.access$200(this.bb, this.end, this.parentWidth);
                ReadBuf readBuf = this.bb;
                int i = this.byteWidth;
                return this.bb.getString(access$200, (int) FlexBuffers.access$300(readBuf, access$200 - i, i));
            } else if (!isKey()) {
                return "";
            } else {
                int access$2002 = FlexBuffers.access$200(this.bb, this.end, this.byteWidth);
                int i2 = access$2002;
                while (this.bb.get(i2) != 0) {
                    i2++;
                }
                return this.bb.getString(access$2002, i2 - access$2002);
            }
        }

        public long asUInt() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8029c507", new Object[]{this})).longValue();
            }
            int i = this.type;
            if (i == 2) {
                return FlexBuffers.access$300(this.bb, this.end, this.parentWidth);
            }
            if (i == 1) {
                return FlexBuffers.access$500(this.bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) FlexBuffers.access$400(this.bb, this.end, this.parentWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i == 26) {
                return FlexBuffers.access$100(this.bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return Long.parseLong(asString());
            }
            if (i == 6) {
                ReadBuf readBuf = this.bb;
                return FlexBuffers.access$500(readBuf, FlexBuffers.access$200(readBuf, this.end, this.parentWidth), this.byteWidth);
            } else if (i == 7) {
                ReadBuf readBuf2 = this.bb;
                return FlexBuffers.access$300(readBuf2, FlexBuffers.access$200(readBuf2, this.end, this.parentWidth), this.byteWidth);
            } else if (i != 8) {
                return 0L;
            } else {
                ReadBuf readBuf3 = this.bb;
                return (long) FlexBuffers.access$400(readBuf3, FlexBuffers.access$200(readBuf3, this.end, this.parentWidth), this.parentWidth);
            }
        }

        public Vector asVector() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Vector) ipChange.ipc$dispatch("6cfec02b", new Object[]{this});
            }
            if (isVector()) {
                ReadBuf readBuf = this.bb;
                return new Vector(readBuf, FlexBuffers.access$200(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i = this.type;
            if (i == 15) {
                ReadBuf readBuf2 = this.bb;
                return new TypedVector(readBuf2, FlexBuffers.access$200(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            } else if (!FlexBuffers.isTypedVector(i)) {
                return Vector.empty();
            } else {
                ReadBuf readBuf3 = this.bb;
                return new TypedVector(readBuf3, FlexBuffers.access$200(readBuf3, this.end, this.parentWidth), this.byteWidth, FlexBuffers.toTypedVectorElementType(this.type));
            }
        }

        public int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return this.type;
        }

        public boolean isBlob() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8f044f2", new Object[]{this})).booleanValue();
            }
            if (this.type == 25) {
                return true;
            }
            return false;
        }

        public boolean isBoolean() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3e833929", new Object[]{this})).booleanValue();
            }
            if (this.type == 26) {
                return true;
            }
            return false;
        }

        public boolean isFloat() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c8525add", new Object[]{this})).booleanValue();
            }
            int i = this.type;
            if (i == 3 || i == 8) {
                return true;
            }
            return false;
        }

        public boolean isInt() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("520cd470", new Object[]{this})).booleanValue();
            }
            int i = this.type;
            if (i == 1 || i == 6) {
                return true;
            }
            return false;
        }

        public boolean isKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("acc422e0", new Object[]{this})).booleanValue();
            }
            if (this.type == 4) {
                return true;
            }
            return false;
        }

        public boolean isNull() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f04d5dc", new Object[]{this})).booleanValue();
            }
            if (this.type == 0) {
                return true;
            }
            return false;
        }

        public boolean isNumeric() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("afffed8e", new Object[]{this})).booleanValue();
            }
            if (isIntOrUInt() || isFloat()) {
                return true;
            }
            return false;
        }

        public boolean isString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("239570e6", new Object[]{this})).booleanValue();
            }
            if (this.type == 5) {
                return true;
            }
            return false;
        }

        public boolean isTypedVector() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab9db5ce", new Object[]{this})).booleanValue();
            }
            return FlexBuffers.isTypedVector(this.type);
        }

        public boolean isUInt() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22754e0f", new Object[]{this})).booleanValue();
            }
            int i = this.type;
            if (i == 2 || i == 7) {
                return true;
            }
            return false;
        }

        public boolean isVector() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("82720918", new Object[]{this})).booleanValue();
            }
            int i = this.type;
            if (i == 10 || i == 9) {
                return true;
            }
            return false;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : toString(new StringBuilder(128)).toString();
        }

        public Reference(ReadBuf readBuf, int i, int i2, int i3, int i4) {
            this.bb = readBuf;
            this.end = i;
            this.parentWidth = i2;
            this.byteWidth = i3;
            this.type = i4;
        }

        public StringBuilder toString(StringBuilder sb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StringBuilder) ipChange.ipc$dispatch("87b29eb3", new Object[]{this, sb});
            }
            int i = this.type;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(asLong());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(asUInt());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(asFloat());
                        return sb;
                    case 4:
                        Key asKey = asKey();
                        sb.append('\"');
                        StringBuilder key = asKey.toString(sb);
                        key.append('\"');
                        return key;
                    case 5:
                        sb.append('\"');
                        sb.append(asString());
                        sb.append('\"');
                        return sb;
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.type);
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        sb.append(asBoolean());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(asVector());
            return sb;
        }

        public boolean isIntOrUInt() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d9ae720d", new Object[]{this})).booleanValue();
            }
            return isInt() || isUInt();
        }

        public boolean isMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3e635d", new Object[]{this})).booleanValue();
            }
            return this.type == 9;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class Sized extends Object {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int size;

        public Sized(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
            this.size = FlexBuffers.access$100(this.bb, i - i2, i2);
        }

        public static /* synthetic */ Object ipc$super(Sized sized, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/FlexBuffers$Sized");
        }

        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return this.size;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class TypedVector extends Vector {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.access$000(), 1, 1, 1);
        private final int elemType;

        public TypedVector(ReadBuf readBuf, int i, int i2, int i3) {
            super(readBuf, i, i2);
            this.elemType = i3;
        }

        public static TypedVector empty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TypedVector) ipChange.ipc$dispatch("bbb2e3d3", new Object[0]);
            }
            return EMPTY_VECTOR;
        }

        public static /* synthetic */ Object ipc$super(TypedVector typedVector, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/FlexBuffers$TypedVector");
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Reference) ipChange.ipc$dispatch("1a45b0c7", new Object[]{this, new Integer(i)});
            }
            if (i >= size()) {
                return Reference.access$600();
            }
            return new Reference(this.bb, this.end + (i * this.byteWidth), this.byteWidth, 1, this.elemType);
        }

        public int getElemType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("981969d9", new Object[]{this})).intValue();
            }
            return this.elemType;
        }

        public boolean isEmptyVector() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7b8862f1", new Object[]{this})).booleanValue();
            }
            if (this == EMPTY_VECTOR) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Unsigned {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static int byteToUnsignedInt(byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53ca5851", new Object[]{new Byte(b)})).intValue();
            }
            return b & 255;
        }

        public static long intToUnsignedLong(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5e4ad35", new Object[]{new Integer(i)})).longValue() : i & tiv.INT_MASK;
        }

        public static int shortToUnsignedInt(short s) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8ef34696", new Object[]{new Short(s)})).intValue();
            }
            return s & 65535;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Vector extends Sized {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.access$000(), 1, 1);

        public Vector(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Vector empty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Vector) ipChange.ipc$dispatch("1fd3a7f3", new Object[0]);
            }
            return EMPTY_VECTOR;
        }

        public static /* synthetic */ Object ipc$super(Vector vector, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2128160755) {
                return super.toString();
            }
            if (hashCode == 845773819) {
                return new Integer(super.size());
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/emoji2/text/flatbuffer/FlexBuffers$Vector");
        }

        public Reference get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Reference) ipChange.ipc$dispatch("1a45b0c7", new Object[]{this, new Integer(i)});
            }
            long size = size();
            long j = i;
            if (j >= size) {
                return Reference.access$600();
            }
            return new Reference(this.bb, this.end + (i * this.byteWidth), this.byteWidth, Unsigned.byteToUnsignedInt(this.bb.get((int) (this.end + (size * this.byteWidth) + j))));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StringBuilder) ipChange.ipc$dispatch("87b29eb3", new Object[]{this, sb});
            }
            sb.append("[ ");
            int size = size();
            for (int i = 0; i < size; i++) {
                get(i).toString(sb);
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return this == EMPTY_VECTOR;
        }
    }

    public static /* synthetic */ ReadBuf access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReadBuf) ipChange.ipc$dispatch("879edbbc", new Object[0]);
        }
        return EMPTY_BB;
    }

    public static /* synthetic */ int access$100(ReadBuf readBuf, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9803f830", new Object[]{readBuf, new Integer(i), new Integer(i2)})).intValue();
        }
        return readInt(readBuf, i, i2);
    }

    public static /* synthetic */ int access$200(ReadBuf readBuf, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89ad9e4f", new Object[]{readBuf, new Integer(i), new Integer(i2)})).intValue();
        }
        return indirect(readBuf, i, i2);
    }

    public static /* synthetic */ long access$300(ReadBuf readBuf, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b57446f", new Object[]{readBuf, new Integer(i), new Integer(i2)})).longValue();
        }
        return readUInt(readBuf, i, i2);
    }

    public static /* synthetic */ double access$400(ReadBuf readBuf, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d00ea88", new Object[]{readBuf, new Integer(i), new Integer(i2)})).doubleValue();
        }
        return readDouble(readBuf, i, i2);
    }

    public static /* synthetic */ long access$500(ReadBuf readBuf, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eaa90ad", new Object[]{readBuf, new Integer(i), new Integer(i2)})).longValue();
        }
        return readLong(readBuf, i, i2);
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reference) ipChange.ipc$dispatch("cf4c6ed3", new Object[]{byteBuffer});
        }
        return getRoot(byteBuffer.hasArray() ? new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new ByteBufferReadWriteBuf(byteBuffer));
    }

    private static int indirect(ReadBuf readBuf, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a20b03f3", new Object[]{readBuf, new Integer(i), new Integer(i2)})).intValue();
        }
        return (int) (i - readUInt(readBuf, i, i2));
    }

    public static boolean isTypeInline(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9513643", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i <= 3 || i == 26) {
            return true;
        }
        return false;
    }

    public static boolean isTypedVector(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c819767d", new Object[]{new Integer(i)})).booleanValue();
        }
        if ((i < 11 || i > 15) && i != 36) {
            return false;
        }
        return true;
    }

    public static boolean isTypedVectorElementType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c77129ad", new Object[]{new Integer(i)})).booleanValue();
        }
        if ((i < 1 || i > 4) && i != 26) {
            return false;
        }
        return true;
    }

    private static double readDouble(ReadBuf readBuf, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8308df15", new Object[]{readBuf, new Integer(i), new Integer(i2)})).doubleValue();
        }
        if (i2 == 4) {
            return readBuf.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i);
    }

    private static int readInt(ReadBuf readBuf, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1017b768", new Object[]{readBuf, new Integer(i), new Integer(i2)})).intValue();
        }
        return (int) readLong(readBuf, i, i2);
    }

    private static long readLong(ReadBuf readBuf, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13b8ef90", new Object[]{readBuf, new Integer(i), new Integer(i2)})).longValue();
        }
        if (i2 == 1) {
            return readBuf.get(i);
        }
        if (i2 == 2) {
            return readBuf.getShort(i);
        }
        if (i2 == 4) {
            return readBuf.getInt(i);
        }
        if (i2 != 8) {
            return -1L;
        }
        return readBuf.getLong(i);
    }

    private static long readUInt(ReadBuf readBuf, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83b88b12", new Object[]{readBuf, new Integer(i), new Integer(i2)})).longValue();
        }
        if (i2 == 1) {
            return Unsigned.byteToUnsignedInt(readBuf.get(i));
        }
        if (i2 == 2) {
            return Unsigned.shortToUnsignedInt(readBuf.getShort(i));
        }
        if (i2 == 4) {
            return Unsigned.intToUnsignedLong(readBuf.getInt(i));
        }
        if (i2 != 8) {
            return -1L;
        }
        return readBuf.getLong(i);
    }

    public static int toTypedVectorElementType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca9bddab", new Object[]{new Integer(i)})).intValue();
        }
        return i - 10;
    }

    public static Reference getRoot(ReadBuf readBuf) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reference) ipChange.ipc$dispatch("e89092d7", new Object[]{readBuf});
        }
        int limit = readBuf.limit();
        byte b = readBuf.get(limit - 1);
        int i = limit - 2;
        return new Reference(readBuf, i - b, b, Unsigned.byteToUnsignedInt(readBuf.get(i)));
    }

    public static int toTypedVector(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff20766c", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == 0) {
            return i + 10;
        }
        if (i2 == 2) {
            return i + 15;
        }
        if (i2 == 3) {
            return i + 18;
        }
        if (i2 != 4) {
            return 0;
        }
        return i + 21;
    }
}
