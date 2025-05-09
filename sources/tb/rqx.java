package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class rqx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(952107031);
    }

    public static void a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4400379", new Object[]{byteBuffer});
        } else if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int b(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e60cd4aa", new Object[]{byteBuffer})).intValue();
        }
        a(byteBuffer);
        int capacity = byteBuffer.capacity();
        if (capacity < 22) {
            return -1;
        }
        int i = capacity - 22;
        int min = Math.min(i, 65535);
        for (int i2 = 0; i2 <= min; i2++) {
            int i3 = i - i2;
            if (byteBuffer.getInt(i3) == 101010256 && d(byteBuffer, i3 + 20) == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static Pair<ByteBuffer, Long> c(RandomAccessFile randomAccessFile, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("35f51703", new Object[]{randomAccessFile, new Integer(i)});
        }
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("maxCommentSize: " + i);
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, length - 22)) + 22);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        allocate.order(byteOrder);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        int b = b(allocate);
        if (b == -1) {
            return null;
        }
        allocate.position(b);
        ByteBuffer slice = allocate.slice();
        slice.order(byteOrder);
        return Pair.create(slice, Long.valueOf(capacity + b));
    }

    public static int d(ByteBuffer byteBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ccf7075", new Object[]{byteBuffer, new Integer(i)})).intValue();
        }
        return byteBuffer.getShort(i) & 65535;
    }

    public static long e(ByteBuffer byteBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("692d3c30", new Object[]{byteBuffer, new Integer(i)})).longValue();
        }
        return byteBuffer.getInt(i) & tiv.INT_MASK;
    }

    public static void f(ByteBuffer byteBuffer, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8bf314", new Object[]{byteBuffer, new Integer(i), new Long(j)});
        } else if (j < 0 || j > tiv.INT_MASK) {
            throw new IllegalArgumentException("uint32 value of out range: " + j);
        } else {
            byteBuffer.putInt(byteBuffer.position() + i, (int) j);
        }
    }

    public static Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord(RandomAccessFile randomAccessFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ef393f14", new Object[]{randomAccessFile});
        }
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> c = c(randomAccessFile, 0);
        if (c != null) {
            return c;
        }
        return c(randomAccessFile, 65535);
    }

    public static long getZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("360ec25d", new Object[]{byteBuffer})).longValue();
        }
        a(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 16);
    }

    public static long getZipEocdCentralDirectorySizeBytes(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9156afc2", new Object[]{byteBuffer})).longValue();
        }
        a(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 12);
    }

    public static final boolean isZip64EndOfCentralDirectoryLocatorPresent(RandomAccessFile randomAccessFile, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be05b9f7", new Object[]{randomAccessFile, new Long(j)})).booleanValue();
        }
        long j2 = j - 20;
        if (j2 < 0) {
            return false;
        }
        randomAccessFile.seek(j2);
        if (randomAccessFile.readInt() == 1347094023) {
            return true;
        }
        return false;
    }

    public static void setZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26e716ef", new Object[]{byteBuffer, new Long(j)});
            return;
        }
        a(byteBuffer);
        f(byteBuffer, byteBuffer.position() + 16, j);
    }
}
