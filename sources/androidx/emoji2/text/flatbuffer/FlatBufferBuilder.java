package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FlatBufferBuilder {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ByteBuffer bb;
    public ByteBufferFactory bb_factory;
    public boolean finished;
    public boolean force_defaults;
    public int minalign;
    public boolean nested;
    public int num_vtables;
    public int object_start;
    public int space;
    public final Utf8 utf8;
    public int vector_num_elems;
    public int[] vtable;
    public int vtable_in_use;
    public int[] vtables;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ByteBufferBackedInputStream extends InputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
            this.buf = byteBuffer;
        }

        public static /* synthetic */ Object ipc$super(ByteBufferBackedInputStream byteBufferBackedInputStream, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/FlatBufferBuilder$ByteBufferBackedInputStream");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
            }
            try {
                return this.buf.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class ByteBufferFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract ByteBuffer newByteBuffer(int i);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9472df3b", new Object[]{this, byteBuffer});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        public static /* synthetic */ Object ipc$super(HeapByteBufferFactory heapByteBufferFactory, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/FlatBufferBuilder$HeapByteBufferFactory");
        }

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteBuffer) ipChange.ipc$dispatch("d8724a75", new Object[]{this, new Integer(i)});
            }
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder(int i, ByteBufferFactory byteBufferFactory) {
        this(i, byteBufferFactory, null, Utf8.getDefault());
    }

    @Deprecated
    private int dataStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15687752", new Object[]{this})).intValue();
        }
        finished();
        return this.space;
    }

    public static ByteBuffer growByteBuffer(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("87e680e4", new Object[]{byteBuffer, byteBufferFactory});
        }
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            if (capacity != 0) {
                i = capacity << 1;
            }
            byteBuffer.position(0);
            ByteBuffer newByteBuffer = byteBufferFactory.newByteBuffer(i);
            newByteBuffer.position(newByteBuffer.clear().capacity() - capacity);
            newByteBuffer.put(byteBuffer);
            return newByteBuffer;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    public static boolean isFieldPresent(Table table, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b10dc55", new Object[]{table, new Integer(i)})).booleanValue();
        }
        if (table.__offset(i) != 0) {
            return true;
        }
        return false;
    }

    public void Nested(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f783c8a5", new Object[]{this, new Integer(i)});
        } else if (i != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void addBoolean(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b058f46", new Object[]{this, new Boolean(z)});
            return;
        }
        prep(1, 0);
        putBoolean(z);
    }

    public void addByte(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab0356c", new Object[]{this, new Byte(b)});
            return;
        }
        prep(1, 0);
        putByte(b);
    }

    public void addDouble(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c3dc05", new Object[]{this, new Double(d)});
            return;
        }
        prep(8, 0);
        putDouble(d);
    }

    public void addFloat(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c02abe", new Object[]{this, new Float(f)});
            return;
        }
        prep(4, 0);
        putFloat(f);
    }

    public void addInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c4308e", new Object[]{this, new Integer(i)});
            return;
        }
        prep(4, 0);
        putInt(i);
    }

    public void addLong(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc953680", new Object[]{this, new Long(j)});
            return;
        }
        prep(8, 0);
        putLong(j);
    }

    public void addOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e412f48", new Object[]{this, new Integer(i)});
            return;
        }
        prep(4, 0);
        putInt((offset() - i) + 4);
    }

    public void addShort(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb34d6b", new Object[]{this, new Short(s)});
            return;
        }
        prep(2, 0);
        putShort(s);
    }

    public void addStruct(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3466826", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i2 != i3) {
            Nested(i2);
            slot(i);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.space = this.bb.capacity();
        this.bb.clear();
        this.minalign = 1;
        while (true) {
            int i = this.vtable_in_use;
            if (i > 0) {
                int[] iArr = this.vtable;
                int i2 = i - 1;
                this.vtable_in_use = i2;
                iArr[i2] = 0;
            } else {
                this.vtable_in_use = 0;
                this.nested = false;
                this.finished = false;
                this.object_start = 0;
                this.num_vtables = 0;
                this.vector_num_elems = 0;
                return;
            }
        }
    }

    public int createByteVector(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf346cc8", new Object[]{this, bArr})).intValue();
        }
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.bb;
        int i = this.space - length;
        this.space = i;
        byteBuffer.position(i);
        this.bb.put(bArr);
        return endVector();
    }

    public <T extends Table> int createSortedVectorOfTables(T t, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8779d886", new Object[]{this, t, iArr})).intValue();
        }
        t.sortTables(iArr, this.bb);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff6ecb", new Object[]{this, charSequence})).intValue();
        }
        int encodedLength = this.utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, encodedLength, 1);
        ByteBuffer byteBuffer = this.bb;
        int i = this.space - encodedLength;
        this.space = i;
        byteBuffer.position(i);
        this.utf8.encodeUtf8(charSequence, this.bb);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("d7586c70", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        int i4 = i * i2;
        startVector(i, i2, i3);
        ByteBuffer byteBuffer = this.bb;
        int i5 = this.space - i4;
        this.space = i5;
        byteBuffer.position(i5);
        ByteBuffer order = this.bb.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i4);
        return order;
    }

    public int createVectorOfTables(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3089bf23", new Object[]{this, iArr})).intValue();
        }
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public ByteBuffer dataBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("bfe6f2d2", new Object[]{this});
        }
        finished();
        return this.bb;
    }

    public int endTable() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70e486ad", new Object[]{this})).intValue();
        }
        if (this.vtable == null || !this.nested) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int offset = offset();
        int i3 = this.vtable_in_use - 1;
        while (i3 >= 0 && this.vtable[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = this.vtable[i4];
            if (i5 != 0) {
                i2 = offset - i5;
            } else {
                i2 = 0;
            }
            addShort((short) i2);
        }
        addShort((short) (offset - this.object_start));
        addShort((short) ((i3 + 3) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.num_vtables) {
                i = 0;
                break;
            }
            int capacity = this.bb.capacity() - this.vtables[i6];
            int i7 = this.space;
            short s = this.bb.getShort(capacity);
            if (s == this.bb.getShort(i7)) {
                for (int i8 = 2; i8 < s; i8 += 2) {
                    if (this.bb.getShort(capacity + i8) != this.bb.getShort(i7 + i8)) {
                        break;
                    }
                }
                i = this.vtables[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int capacity2 = this.bb.capacity() - offset;
            this.space = capacity2;
            this.bb.putInt(capacity2, i - offset);
        } else {
            int i9 = this.num_vtables;
            int[] iArr = this.vtables;
            if (i9 == iArr.length) {
                this.vtables = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.vtables;
            int i10 = this.num_vtables;
            this.num_vtables = 1 + i10;
            iArr2[i10] = offset();
            ByteBuffer byteBuffer = this.bb;
            byteBuffer.putInt(byteBuffer.capacity() - offset, offset() - offset);
        }
        this.nested = false;
        return offset;
    }

    public int endVector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9355b78", new Object[]{this})).intValue();
        }
        if (this.nested) {
            this.nested = false;
            putInt(this.vector_num_elems);
            return offset();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public void finish(int i, boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b9b14b", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int i3 = this.minalign;
        if (z) {
            i2 = 4;
        }
        prep(i3, i2 + 4);
        addOffset(i);
        if (z) {
            addInt(this.bb.capacity() - this.space);
        }
        this.bb.position(this.space);
        this.finished = true;
    }

    public void finishSizePrefixed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18bc4877", new Object[]{this, new Integer(i)});
        } else {
            finish(i, true);
        }
    }

    public void finished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d4bbf9", new Object[]{this});
        } else if (!this.finished) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder forceDefaults(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlatBufferBuilder) ipChange.ipc$dispatch("6a7eaed0", new Object[]{this, new Boolean(z)});
        }
        this.force_defaults = z;
        return this;
    }

    public void notNested() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbeed31", new Object[]{this});
        } else if (this.nested) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d912678d", new Object[]{this})).intValue();
        }
        return this.bb.capacity() - this.space;
    }

    public void pad(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0032a9", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.bb;
            int i3 = this.space - 1;
            this.space = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    public void prep(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58006b94", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (i > this.minalign) {
            this.minalign = i;
        }
        int i3 = (i - 1) & ((~((this.bb.capacity() - this.space) + i2)) + 1);
        while (this.space < i3 + i + i2) {
            int capacity = this.bb.capacity();
            ByteBuffer byteBuffer = this.bb;
            ByteBuffer growByteBuffer = growByteBuffer(byteBuffer, this.bb_factory);
            this.bb = growByteBuffer;
            if (byteBuffer != growByteBuffer) {
                this.bb_factory.releaseByteBuffer(byteBuffer);
            }
            this.space += this.bb.capacity() - capacity;
        }
        pad(i3);
    }

    public void putBoolean(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cb94b4", new Object[]{this, new Boolean(z)});
            return;
        }
        ByteBuffer byteBuffer = this.bb;
        int i = this.space - 1;
        this.space = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15dfd6be", new Object[]{this, new Byte(b)});
            return;
        }
        ByteBuffer byteBuffer = this.bb;
        int i = this.space - 1;
        this.space = i;
        byteBuffer.put(i, b);
    }

    public void putDouble(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9070d7", new Object[]{this, new Double(d)});
            return;
        }
        ByteBuffer byteBuffer = this.bb;
        int i = this.space - 8;
        this.space = i;
        byteBuffer.putDouble(i, d);
    }

    public void putFloat(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c84b3ac", new Object[]{this, new Float(f)});
            return;
        }
        ByteBuffer byteBuffer = this.bb;
        int i = this.space - 4;
        this.space = i;
        byteBuffer.putFloat(i, f);
    }

    public void putInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b521cfc", new Object[]{this, new Integer(i)});
            return;
        }
        ByteBuffer byteBuffer = this.bb;
        int i2 = this.space - 4;
        this.space = i2;
        byteBuffer.putInt(i2, i);
    }

    public void putLong(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c4d7d2", new Object[]{this, new Long(j)});
            return;
        }
        ByteBuffer byteBuffer = this.bb;
        int i = this.space - 8;
        this.space = i;
        byteBuffer.putLong(i, j);
    }

    public void putShort(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2677d659", new Object[]{this, new Short(s)});
            return;
        }
        ByteBuffer byteBuffer = this.bb;
        int i = this.space - 2;
        this.space = i;
        byteBuffer.putShort(i, s);
    }

    public void required(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f989786", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int capacity = this.bb.capacity() - i;
        if (this.bb.getShort((capacity - this.bb.getInt(capacity)) + i2) == 0) {
            throw new AssertionError("FlatBuffers: field " + i2 + " must be set");
        }
    }

    public byte[] sizedByteArray(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("eb7e55e8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        finished();
        byte[] bArr = new byte[i2];
        this.bb.position(i);
        this.bb.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("401a6c71", new Object[]{this});
        }
        finished();
        ByteBuffer duplicate = this.bb.duplicate();
        duplicate.position(this.space);
        duplicate.limit(this.bb.capacity());
        return new ByteBufferBackedInputStream(duplicate);
    }

    public void slot(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261e241e", new Object[]{this, new Integer(i)});
        } else {
            this.vtable[i] = offset();
        }
    }

    public void startTable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c28250", new Object[]{this, new Integer(i)});
            return;
        }
        notNested();
        int[] iArr = this.vtable;
        if (iArr == null || iArr.length < i) {
            this.vtable = new int[i];
        }
        this.vtable_in_use = i;
        Arrays.fill(this.vtable, 0, i, 0);
        this.nested = true;
        this.object_start = offset();
    }

    public void startVector(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738750d7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        notNested();
        this.vector_num_elems = i2;
        int i4 = i * i2;
        prep(4, i4);
        prep(i3, i4);
        this.nested = true;
    }

    public FlatBufferBuilder(int i, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        i = i <= 0 ? 1 : i;
        this.bb_factory = byteBufferFactory;
        if (byteBuffer != null) {
            this.bb = byteBuffer;
            byteBuffer.clear();
            this.bb.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.bb = byteBufferFactory.newByteBuffer(i);
        }
        this.utf8 = utf8;
        this.space = this.bb.capacity();
    }

    public void addBoolean(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f05a0b5", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else if (this.force_defaults || z != z2) {
            addBoolean(z);
            slot(i);
        }
    }

    public void addByte(int i, byte b, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe660ba", new Object[]{this, new Integer(i), new Byte(b), new Integer(i2)});
        } else if (this.force_defaults || b != i2) {
            addByte(b);
            slot(i);
        }
    }

    public void addDouble(int i, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608f6c0a", new Object[]{this, new Integer(i), new Double(d), new Double(d2)});
        } else if (this.force_defaults || d != d2) {
            addDouble(d);
            slot(i);
        }
    }

    public void addFloat(int i, float f, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5297aa3f", new Object[]{this, new Integer(i), new Float(f), new Double(d)});
        } else if (this.force_defaults || f != d) {
            addFloat(f);
            slot(i);
        }
    }

    public void addInt(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c488a56e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.force_defaults || i2 != i3) {
            addInt(i2);
            slot(i);
        }
    }

    public void addLong(int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c22577f", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
        } else if (this.force_defaults || j != j2) {
            addLong(j);
            slot(i);
        }
    }

    public void addShort(int i, short s, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b9b9fb7", new Object[]{this, new Integer(i), new Short(s), new Integer(i2)});
        } else if (this.force_defaults || s != i2) {
            addShort(s);
            slot(i);
        }
    }

    public void finishSizePrefixed(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea32e281", new Object[]{this, new Integer(i), str});
        } else {
            finish(i, str, true);
        }
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlatBufferBuilder) ipChange.ipc$dispatch("e3c91778", new Object[]{this, byteBuffer, byteBufferFactory});
        }
        this.bb_factory = byteBufferFactory;
        this.bb = byteBuffer;
        byteBuffer.clear();
        this.bb.order(ByteOrder.LITTLE_ENDIAN);
        this.minalign = 1;
        this.space = this.bb.capacity();
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.object_start = 0;
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        return this;
    }

    public void addOffset(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c0dda8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.force_defaults || i2 != i3) {
            addOffset(i2);
            slot(i);
        }
    }

    public byte[] sizedByteArray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ea220908", new Object[]{this}) : sizedByteArray(this.space, this.bb.capacity() - this.space);
    }

    public int createByteVector(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3daebe8", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        startVector(1, i2, 1);
        ByteBuffer byteBuffer = this.bb;
        int i3 = this.space - i2;
        this.space = i3;
        byteBuffer.position(i3);
        this.bb.put(bArr, i, i2);
        return endVector();
    }

    public void finish(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d81d6a9", new Object[]{this, new Integer(i)});
        } else {
            finish(i, false);
        }
    }

    public int createString(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5bda790", new Object[]{this, byteBuffer})).intValue();
        }
        int remaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.bb;
        int i = this.space - remaining;
        this.space = i;
        byteBuffer2.position(i);
        this.bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i, String str, boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c9b101", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        int i3 = this.minalign;
        if (z) {
            i2 = 4;
        }
        prep(i3, i2 + 8);
        if (str.length() == 4) {
            for (int i4 = 3; i4 >= 0; i4--) {
                addByte((byte) str.charAt(i4));
            }
            finish(i, z);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d28aa676", new Object[]{this, byteBuffer})).intValue();
        }
        int remaining = byteBuffer.remaining();
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.bb;
        int i = this.space - remaining;
        this.space = i;
        byteBuffer2.position(i);
        this.bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5380833", new Object[]{this, new Integer(i), str});
        } else {
            finish(i, str, false);
        }
    }

    public FlatBufferBuilder(int i) {
        this(i, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this(byteBuffer.capacity(), byteBufferFactory, byteBuffer, Utf8.getDefault());
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, new HeapByteBufferFactory());
    }
}
