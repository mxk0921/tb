package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.entity.RewindableStream;
import java.io.FileDescriptor;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class beo extends RewindableStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f16347a;
    public int b;
    public int c;
    public final int d;
    public final int e;

    static {
        t2o.a(618659878);
    }

    public beo(byte[] bArr, int i, int i2) {
        super(1);
        this.f16347a = bArr;
        this.b = i;
        this.c = i;
        int i3 = i2 + i;
        this.d = i3 > bArr.length ? bArr.length : i3;
        this.e = i;
    }

    public static /* synthetic */ Object ipc$super(beo beoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/pexode/entity/RewindableByteArrayStream");
    }

    @Override // java.io.InputStream
    public synchronized int available() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f9282c3", new Object[]{this})).intValue();
        }
        return this.d - this.b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public byte[] getBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("99e867c0", new Object[]{this});
        }
        return this.f16347a;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public int getBufferLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c696436", new Object[]{this})).intValue();
        }
        return this.d;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public int getBufferOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c05bef63", new Object[]{this})).intValue();
        }
        return this.e;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public FileDescriptor getFD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileDescriptor) ipChange.ipc$dispatch("141de563", new Object[]{this});
        }
        return null;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52db0af", new Object[]{this, new Integer(i)});
        } else {
            this.c = this.b;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        int i2 = this.b;
        if (i2 < this.d) {
            byte[] bArr = this.f16347a;
            this.b = 1 + i2;
            i = bArr[i2] & 255;
        } else {
            i = -1;
        }
        return i;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.b = this.c;
        }
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public void rewind() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a1bc2", new Object[]{this});
        } else {
            this.b = this.e;
        }
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public void rewindAndSetBufferSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e5fb15", new Object[]{this, new Integer(i)});
        } else {
            rewind();
        }
    }

    @Override // java.io.InputStream
    public synchronized long skip(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a0434f2", new Object[]{this, new Long(j)})).longValue();
        } else if (j <= 0) {
            return 0L;
        } else {
            int i = this.b;
            int i2 = this.d;
            if (i2 - i >= j) {
                i2 = (int) (i + j);
            }
            this.b = i2;
            return i2 - i;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = this.b;
        int i4 = this.d;
        if (i3 >= i4) {
            return -1;
        }
        if (i2 == 0) {
            return 0;
        }
        if (i4 - i3 < i2) {
            i2 = i4 - i3;
        }
        System.arraycopy(this.f16347a, i3, bArr, i, i2);
        this.b += i2;
        return i2;
    }
}
