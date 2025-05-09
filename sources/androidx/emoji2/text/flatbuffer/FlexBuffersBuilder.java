package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FlexBuffersBuilder {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private static final int WIDTH_16 = 1;
    private static final int WIDTH_32 = 2;
    private static final int WIDTH_64 = 3;
    private static final int WIDTH_8 = 0;
    private final ReadWriteBuf bb;
    private boolean finished;
    private final int flags;
    private Comparator<Value> keyComparator;
    private final HashMap<String, Integer> keyPool;
    private final ArrayList<Value> stack;
    private final HashMap<String, Integer> stringPool;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Value {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final double dValue;
        public long iValue;
        public int key;
        public final int minBitWidth;
        public final int type;

        public Value(int i, int i2, int i3, long j) {
            this.key = i;
            this.type = i2;
            this.minBitWidth = i3;
            this.iValue = j;
            this.dValue = Double.MIN_VALUE;
        }

        public static /* synthetic */ int access$100(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("73c4d50b", new Object[]{new Integer(i), new Integer(i2)})).intValue();
            }
            return paddingBytes(i, i2);
        }

        public static /* synthetic */ int access$200(Value value, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d94b62bc", new Object[]{value, new Integer(i), new Integer(i2)})).intValue();
            }
            return value.elemWidth(i, i2);
        }

        public static /* synthetic */ byte access$300(Value value) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c3fc0096", new Object[]{value})).byteValue();
            }
            return value.storedPackedType();
        }

        public static /* synthetic */ byte access$400(Value value, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("25b40fa4", new Object[]{value, new Integer(i)})).byteValue();
            }
            return value.storedPackedType(i);
        }

        public static /* synthetic */ int access$500(int i, int i2, long j, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("472cbf7b", new Object[]{new Integer(i), new Integer(i2), new Long(j), new Integer(i3), new Integer(i4)})).intValue();
            }
            return elemWidth(i, i2, j, i3, i4);
        }

        public static Value blob(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("126b9562", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            return new Value(i, i3, i4, i2);
        }

        public static Value bool(int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("d7d67924", new Object[]{new Integer(i), new Boolean(z)});
            }
            return new Value(i, 26, 0, z ? 1L : 0L);
        }

        private int elemWidth(int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b46fbd51", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : elemWidth(this.type, this.minBitWidth, this.iValue, i, i2);
        }

        public static Value float32(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("75b38c7", new Object[]{new Integer(i), new Float(f)});
            }
            return new Value(i, 3, 2, f);
        }

        public static Value float64(int i, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("e15411ca", new Object[]{new Integer(i), new Double(d)});
            }
            return new Value(i, 3, 3, d);
        }

        public static Value int16(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("7ddc0f2b", new Object[]{new Integer(i), new Integer(i2)});
            }
            return new Value(i, 1, 1, i2);
        }

        public static Value int32(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("1fd6efb1", new Object[]{new Integer(i), new Integer(i2)});
            }
            return new Value(i, 1, 2, i2);
        }

        public static Value int64(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("bdb2ad1", new Object[]{new Integer(i), new Long(j)});
            }
            return new Value(i, 1, 3, j);
        }

        public static Value int8(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("e2b960b6", new Object[]{new Integer(i), new Integer(i2)});
            }
            return new Value(i, 1, 0, i2);
        }

        private static int paddingBytes(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("18654a74", new Object[]{new Integer(i), new Integer(i2)})).intValue();
            }
            return ((~i) + 1) & (i2 - 1);
        }

        private byte storedPackedType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf7af5c8", new Object[]{this})).byteValue() : storedPackedType(0);
        }

        private int storedWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("79450d4c", new Object[]{this, new Integer(i)})).intValue();
            }
            if (FlexBuffers.isTypeInline(this.type)) {
                return Math.max(this.minBitWidth, i);
            }
            return this.minBitWidth;
        }

        public static Value uInt16(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("3a631940", new Object[]{new Integer(i), new Integer(i2)});
            }
            return new Value(i, 2, 1, i2);
        }

        public static Value uInt32(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("dc5df9c6", new Object[]{new Integer(i), new Integer(i2)});
            }
            return new Value(i, 2, 2, i2);
        }

        public static Value uInt64(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("c86234e6", new Object[]{new Integer(i), new Long(j)});
            }
            return new Value(i, 2, 3, j);
        }

        public static Value uInt8(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Value) ipChange.ipc$dispatch("e8ce4001", new Object[]{new Integer(i), new Integer(i2)});
            }
            return new Value(i, 2, 0, i2);
        }

        private static int elemWidth(int i, int i2, long j, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("991213f9", new Object[]{new Integer(i), new Integer(i2), new Long(j), new Integer(i3), new Integer(i4)})).intValue();
            }
            if (FlexBuffers.isTypeInline(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int widthUInBits = FlexBuffersBuilder.widthUInBits((int) (((paddingBytes(i3, i5) + i3) + (i4 * i5)) - j));
                if ((1 << widthUInBits) == i5) {
                    return widthUInBits;
                }
            }
            return 3;
        }

        private static byte packedType(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d6888d65", new Object[]{new Integer(i), new Integer(i2)})).byteValue();
            }
            return (byte) (i | (i2 << 2));
        }

        private byte storedPackedType(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1fe43893", new Object[]{this, new Integer(i)})).byteValue() : packedType(storedWidth(i), this.type);
        }

        public Value(int i, int i2, int i3, double d) {
            this.key = i;
            this.type = i2;
            this.minBitWidth = i3;
            this.dValue = d;
            this.iValue = Long.MIN_VALUE;
        }
    }

    public FlexBuffersBuilder(int i) {
        this(new ArrayReadWriteBuf(i), 1);
    }

    public static /* synthetic */ ReadWriteBuf access$000(FlexBuffersBuilder flexBuffersBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReadWriteBuf) ipChange.ipc$dispatch("7c94c7b6", new Object[]{flexBuffersBuilder});
        }
        return flexBuffersBuilder.bb;
    }

    private int align(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf00836a", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = 1 << i;
        int access$100 = Value.access$100(this.bb.writePosition(), i2);
        while (true) {
            int i3 = access$100 - 1;
            if (access$100 == 0) {
                return i2;
            }
            this.bb.put((byte) 0);
            access$100 = i3;
        }
    }

    private Value createKeyVector(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Value) ipChange.ipc$dispatch("16059", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        int i3 = i;
        long j = i2;
        int max = Math.max(0, widthUInBits(j));
        int i4 = i3;
        while (i4 < this.stack.size()) {
            i4++;
            max = Math.max(max, Value.access$500(4, 0, this.stack.get(i4).key, this.bb.writePosition(), i4));
        }
        int align = align(max);
        writeInt(j, align);
        int writePosition = this.bb.writePosition();
        while (i3 < this.stack.size()) {
            int i5 = this.stack.get(i3).key;
            writeOffset(this.stack.get(i3).key, align);
            i3++;
        }
        return new Value(-1, FlexBuffers.toTypedVector(4, 0), max, writePosition);
    }

    private int putKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("730a2354", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        int writePosition = this.bb.writePosition();
        if ((1 & this.flags) != 0) {
            Integer num = this.keyPool.get(str);
            if (num != null) {
                return num.intValue();
            }
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.bb.put(bytes, 0, bytes.length);
            this.bb.put((byte) 0);
            this.keyPool.put(str, Integer.valueOf(writePosition));
            return writePosition;
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.bb.put(bytes2, 0, bytes2.length);
        this.bb.put((byte) 0);
        this.keyPool.put(str, Integer.valueOf(writePosition));
        return writePosition;
    }

    private void writeAny(Value value, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ee60ff", new Object[]{this, value, new Integer(i)});
            return;
        }
        int i2 = value.type;
        if (!(i2 == 0 || i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                writeDouble(value.dValue, i);
                return;
            } else if (i2 != 26) {
                writeOffset(value.iValue, i);
                return;
            }
        }
        writeInt(value.iValue, i);
    }

    private Value writeBlob(int i, byte[] bArr, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Value) ipChange.ipc$dispatch("4f28cc4e", new Object[]{this, new Integer(i), bArr, new Integer(i2), new Boolean(z)});
        }
        int widthUInBits = widthUInBits(bArr.length);
        writeInt(bArr.length, align(widthUInBits));
        int writePosition = this.bb.writePosition();
        this.bb.put(bArr, 0, bArr.length);
        if (z) {
            this.bb.put((byte) 0);
        }
        return Value.blob(i, writePosition, i2, widthUInBits);
    }

    private void writeDouble(double d, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43de09dc", new Object[]{this, new Double(d), new Integer(i)});
        } else if (i == 4) {
            this.bb.putFloat((float) d);
        } else if (i == 8) {
            this.bb.putDouble(d);
        }
    }

    private void writeInt(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68562f16", new Object[]{this, new Long(j), new Integer(i)});
        } else if (i == 1) {
            this.bb.put((byte) j);
        } else if (i == 2) {
            this.bb.putShort((short) j);
        } else if (i == 4) {
            this.bb.putInt((int) j);
        } else if (i == 8) {
            this.bb.putLong(j);
        }
    }

    private void writeOffset(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270b9358", new Object[]{this, new Long(j), new Integer(i)});
        } else {
            writeInt((int) (this.bb.writePosition() - j), i);
        }
    }

    private Value writeString(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Value) ipChange.ipc$dispatch("6ac8e6b0", new Object[]{this, new Integer(i), str});
        }
        return writeBlob(i, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public int endMap(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13e716e4", new Object[]{this, str, new Integer(i)})).intValue();
        }
        int putKey = putKey(str);
        ArrayList<Value> arrayList = this.stack;
        Collections.sort(arrayList.subList(i, arrayList.size()), this.keyComparator);
        Value createVector = createVector(putKey, i, this.stack.size() - i, false, false, createKeyVector(i, this.stack.size() - i));
        while (this.stack.size() > i) {
            ArrayList<Value> arrayList2 = this.stack;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.stack.add(createVector);
        return (int) createVector.iValue;
    }

    public int endVector(String str, int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("869b9c47", new Object[]{this, str, new Integer(i), new Boolean(z), new Boolean(z2)})).intValue();
        }
        Value createVector = createVector(putKey(str), i, this.stack.size() - i, z, z2, null);
        while (this.stack.size() > i) {
            ArrayList<Value> arrayList = this.stack;
            arrayList.remove(arrayList.size() - 1);
        }
        this.stack.add(createVector);
        return (int) createVector.iValue;
    }

    public ReadWriteBuf getBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReadWriteBuf) ipChange.ipc$dispatch("5e78560d", new Object[]{this});
        }
        return this.bb;
    }

    public int putBlob(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("789481cd", new Object[]{this, bArr})).intValue() : putBlob(null, bArr);
    }

    public void putBoolean(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cb94b4", new Object[]{this, new Boolean(z)});
        } else {
            putBoolean(null, z);
        }
    }

    public void putFloat(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c84b3ac", new Object[]{this, new Float(f)});
        } else {
            putFloat((String) null, f);
        }
    }

    public void putInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b521cfc", new Object[]{this, new Integer(i)});
        } else {
            putInt((String) null, i);
        }
    }

    public int putString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d887284", new Object[]{this, str})).intValue() : putString(null, str);
    }

    public void putUInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ef1213", new Object[]{this, new Integer(i)});
        } else {
            putUInt(null, i);
        }
    }

    public void putUInt64(BigInteger bigInteger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca87ea5", new Object[]{this, bigInteger});
        } else {
            putUInt64(null, bigInteger.longValue());
        }
    }

    public int startMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29c99d14", new Object[]{this})).intValue();
        }
        return this.stack.size();
    }

    public int startVector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("724b1a3f", new Object[]{this})).intValue();
        }
        return this.stack.size();
    }

    public FlexBuffersBuilder() {
        this(256);
    }

    private void putUInt64(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633be30c", new Object[]{this, str, new Long(j)});
        } else {
            this.stack.add(Value.uInt64(putKey(str), j));
        }
    }

    public int putBlob(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d26257", new Object[]{this, str, bArr})).intValue();
        }
        Value writeBlob = writeBlob(putKey(str), bArr, 25, false);
        this.stack.add(writeBlob);
        return (int) writeBlob.iValue;
    }

    public void putBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932aec2a", new Object[]{this, str, new Boolean(z)});
        } else {
            this.stack.add(Value.bool(putKey(str), z));
        }
    }

    public void putFloat(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d1a2022", new Object[]{this, str, new Float(f)});
        } else {
            this.stack.add(Value.float32(putKey(str), f));
        }
    }

    public void putInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4330032", new Object[]{this, str, new Integer(i)});
        } else {
            putInt(str, i);
        }
    }

    public int putString(String str, String str2) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb567a0e", new Object[]{this, str, str2})).intValue();
        }
        int putKey = putKey(str);
        if ((2 & this.flags) != 0) {
            Integer num = this.stringPool.get(str2);
            if (num == null) {
                Value writeString = writeString(putKey, str2);
                this.stringPool.put(str2, Integer.valueOf((int) writeString.iValue));
                this.stack.add(writeString);
                j = writeString.iValue;
            } else {
                this.stack.add(Value.blob(putKey, num.intValue(), 5, widthUInBits(str2.length())));
                return num.intValue();
            }
        } else {
            Value writeString2 = writeString(putKey, str2);
            this.stack.add(writeString2);
            j = writeString2.iValue;
        }
        return (int) j;
    }

    public void putUInt(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ef15d4", new Object[]{this, new Long(j)});
        } else {
            putUInt(null, j);
        }
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer, int i) {
        this(new ArrayReadWriteBuf(byteBuffer.array()), i);
    }

    private void putUInt(String str, long j) {
        Value value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcab814a", new Object[]{this, str, new Long(j)});
            return;
        }
        int putKey = putKey(str);
        int widthUInBits = widthUInBits(j);
        if (widthUInBits == 0) {
            value = Value.uInt8(putKey, (int) j);
        } else if (widthUInBits == 1) {
            value = Value.uInt16(putKey, (int) j);
        } else if (widthUInBits == 2) {
            value = Value.uInt32(putKey, (int) j);
        } else {
            value = Value.uInt64(putKey, j);
        }
        this.stack.add(value);
    }

    public static int widthUInBits(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea26e356", new Object[]{new Long(j)})).intValue();
        }
        if (j <= FlexBuffers.Unsigned.byteToUnsignedInt((byte) -1)) {
            return 0;
        }
        if (j <= FlexBuffers.Unsigned.shortToUnsignedInt((short) -1)) {
            return 1;
        }
        return j <= FlexBuffers.Unsigned.intToUnsignedLong(-1) ? 2 : 3;
    }

    public ByteBuffer finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("d9b3abdb", new Object[]{this});
        }
        int align = align(Value.access$200(this.stack.get(0), this.bb.writePosition(), 0));
        writeAny(this.stack.get(0), align);
        this.bb.put(Value.access$300(this.stack.get(0)));
        this.bb.put((byte) align);
        this.finished = true;
        return ByteBuffer.wrap(this.bb.data(), 0, this.bb.writePosition());
    }

    public void putFloat(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c84ac2a", new Object[]{this, new Double(d)});
        } else {
            putFloat((String) null, d);
        }
    }

    public void putInt(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43303f3", new Object[]{this, str, new Long(j)});
            return;
        }
        int putKey = putKey(str);
        if (-128 <= j && j <= 127) {
            this.stack.add(Value.int8(putKey, (int) j));
        } else if (-32768 <= j && j <= 32767) {
            this.stack.add(Value.int16(putKey, (int) j));
        } else if (-2147483648L > j || j > 2147483647L) {
            this.stack.add(Value.int64(putKey, j));
        } else {
            this.stack.add(Value.int32(putKey, (int) j));
        }
    }

    public FlexBuffersBuilder(ReadWriteBuf readWriteBuf, int i) {
        this.stack = new ArrayList<>();
        this.keyPool = new HashMap<>();
        this.stringPool = new HashMap<>();
        this.finished = false;
        this.keyComparator = new Comparator<Value>() { // from class: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public int compare(Value value, Value value2) {
                byte b;
                byte b2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("f88784bf", new Object[]{this, value, value2})).intValue();
                }
                int i2 = value.key;
                int i3 = value2.key;
                do {
                    b = FlexBuffersBuilder.access$000(FlexBuffersBuilder.this).get(i2);
                    b2 = FlexBuffersBuilder.access$000(FlexBuffersBuilder.this).get(i3);
                    if (b == 0) {
                        return b - b2;
                    }
                    i2++;
                    i3++;
                } while (b == b2);
                return b - b2;
            }
        };
        this.bb = readWriteBuf;
        this.flags = i;
    }

    public void putFloat(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d1a18a0", new Object[]{this, str, new Double(d)});
        } else {
            this.stack.add(Value.float64(putKey(str), d));
        }
    }

    public void putInt(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5220bd", new Object[]{this, new Long(j)});
        } else {
            putInt((String) null, j);
        }
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }

    private Value createVector(int i, int i2, int i3, boolean z, boolean z2, Value value) {
        int i4;
        int i5 = i2;
        int i6 = i3;
        int i7 = 4;
        int i8 = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Value) ipChange.ipc$dispatch("de569e79", new Object[]{this, new Integer(i), new Integer(i5), new Integer(i6), new Boolean(z), new Boolean(z2), value});
        }
        long j = i6;
        int max = Math.max(0, widthUInBits(j));
        if (value != null) {
            max = Math.max(max, Value.access$200(value, this.bb.writePosition(), 0));
        } else {
            i8 = 1;
        }
        for (int i9 = i5; i9 < this.stack.size(); i9++) {
            max = Math.max(max, Value.access$200(this.stack.get(i9), this.bb.writePosition(), i9 + i8));
            if (z && i9 == i5) {
                i7 = this.stack.get(i9).type;
                if (!FlexBuffers.isTypedVectorElementType(i7)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int align = align(max);
        if (value != null) {
            writeOffset(value.iValue, align);
            writeInt(1 << value.minBitWidth, align);
        }
        if (!z2) {
            writeInt(j, align);
        }
        int writePosition = this.bb.writePosition();
        for (int i10 = i5; i10 < this.stack.size(); i10++) {
            writeAny(this.stack.get(i10), align);
        }
        if (!z) {
            while (i5 < this.stack.size()) {
                this.bb.put(Value.access$400(this.stack.get(i5), max));
                i5++;
            }
        }
        if (value != null) {
            i4 = 9;
        } else if (z) {
            if (!z2) {
                i6 = 0;
            }
            i4 = FlexBuffers.toTypedVector(i7, i6);
        } else {
            i4 = 10;
        }
        return new Value(i, i4, max, writePosition);
    }
}
