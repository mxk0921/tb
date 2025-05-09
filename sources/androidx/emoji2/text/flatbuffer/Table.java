package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Table {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ByteBuffer bb;
    public int bb_pos;
    public Utf8 utf8 = Utf8.getDefault();
    private int vtable_size;
    private int vtable_start;

    public static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5000a6a", new Object[]{byteBuffer, str})).booleanValue();
        }
        if (str.length() == 4) {
            for (int i = 0; i < 4; i++) {
                if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public static int compareStrings(int i, int i2, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0daf080", new Object[]{new Integer(i), new Integer(i2), byteBuffer})).intValue();
        }
        int i3 = i + byteBuffer.getInt(i);
        int i4 = i2 + byteBuffer.getInt(i2);
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = i3 + 4;
        int i8 = i4 + 4;
        int min = Math.min(i5, i6);
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = i9 + i7;
            int i11 = i9 + i8;
            if (byteBuffer.get(i10) != byteBuffer.get(i11)) {
                return byteBuffer.get(i10) - byteBuffer.get(i11);
            }
        }
        return i5 - i6;
    }

    public int __indirect(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e728e6e1", new Object[]{this, new Integer(i)})).intValue() : i + this.bb.getInt(i);
    }

    public int __offset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6c6c6bc", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < this.vtable_size) {
            return this.bb.getShort(this.vtable_start + i);
        }
        return 0;
    }

    public void __reset(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d015824", new Object[]{this, new Integer(i), byteBuffer});
            return;
        }
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i;
            int i2 = i - byteBuffer.getInt(i);
            this.vtable_start = i2;
            this.vtable_size = this.bb.getShort(i2);
            return;
        }
        this.bb_pos = 0;
        this.vtable_start = 0;
        this.vtable_size = 0;
    }

    public String __string(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c2ba1f5", new Object[]{this, new Integer(i)}) : __string(i, this.bb, this.utf8);
    }

    public Table __union(Table table, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Table) ipChange.ipc$dispatch("71ee9129", new Object[]{this, table, new Integer(i)}) : __union(table, i, this.bb);
    }

    public int __vector(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d66b80c", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = i + this.bb_pos;
        return i2 + this.bb.getInt(i2) + 4;
    }

    public ByteBuffer __vector_as_bytebuffer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("ca650901", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        int __offset = __offset(i);
        if (__offset == 0) {
            return null;
        }
        ByteBuffer order = this.bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int __vector = __vector(__offset);
        order.position(__vector);
        order.limit(__vector + (__vector_len(__offset) * i2));
        return order;
    }

    public ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("7a538c05", new Object[]{this, byteBuffer, new Integer(i), new Integer(i2)});
        }
        int __offset = __offset(i);
        if (__offset == 0) {
            return null;
        }
        int __vector = __vector(__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(__offset) * i2) + __vector);
        byteBuffer.position(__vector);
        return byteBuffer;
    }

    public int __vector_len(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b260a5f6", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = i + this.bb_pos;
        return this.bb.getInt(i2 + this.bb.getInt(i2));
    }

    public ByteBuffer getByteBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("2139e1a6", new Object[]{this});
        }
        return this.bb;
    }

    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3830b4c", new Object[]{this, num, num2, byteBuffer})).intValue();
        }
        return 0;
    }

    public void sortTables(int[] iArr, final ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6d5f19", new Object[]{this, iArr, byteBuffer});
            return;
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new Comparator<Integer>() { // from class: androidx.emoji2.text.flatbuffer.Table.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public int compare(Integer num, Integer num2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("dc099c7f", new Object[]{this, num, num2})).intValue() : Table.this.keysCompare(num, num2, byteBuffer);
            }
        });
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }

    public static int __indirect(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e183f16", new Object[]{new Integer(i), byteBuffer})).intValue() : i + byteBuffer.getInt(i);
    }

    public static int __offset(int i, int i2, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38681c2a", new Object[]{new Integer(i), new Integer(i2), byteBuffer})).intValue();
        }
        int capacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    public static String __string(int i, ByteBuffer byteBuffer, Utf8 utf8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe6cb98d", new Object[]{new Integer(i), byteBuffer, utf8});
        }
        int i2 = i + byteBuffer.getInt(i);
        return utf8.decodeUtf8(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    public static Table __union(Table table, int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Table) ipChange.ipc$dispatch("11415730", new Object[]{table, new Integer(i), byteBuffer});
        }
        table.__reset(__indirect(i, byteBuffer), byteBuffer);
        return table;
    }

    public static int compareStrings(int i, byte[] bArr, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c8b605e", new Object[]{new Integer(i), bArr, byteBuffer})).intValue();
        }
        int i2 = i + byteBuffer.getInt(i);
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int min = Math.min(i3, length);
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    public void __reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60adb276", new Object[]{this});
        } else {
            __reset(0, null);
        }
    }
}
