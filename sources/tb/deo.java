package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.entity.RewindableStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class deo extends RewindableStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f17760a;
    public int b;
    public int c;
    public int d;
    public byte[] e;
    public final boolean f;
    public boolean g;
    public boolean h;

    static {
        t2o.a(618659880);
    }

    public deo(InputStream inputStream, int i) {
        this(3, inputStream, i);
    }

    public static /* synthetic */ Object ipc$super(deo deoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/pexode/entity/RewindableInputStream");
    }

    public final int b(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3476aa4", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int min = Math.min(i2, this.b - this.c);
        int i3 = this.c + min;
        byte[] bArr2 = this.e;
        if (bArr2 == null || i3 > bArr2.length) {
            byte[] g = ow6.f().g(Math.min(i3 + min, this.b));
            byte[] bArr3 = this.e;
            if (bArr3 != null) {
                System.arraycopy(bArr3, 0, g, 0, this.c);
                ow6.f().k(this.e);
            }
            this.e = g;
        }
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int i6 = this.d;
            int read = this.f17760a.read(this.e, i6, min - i5);
            if (read >= 0) {
                if (read > 0) {
                    int i7 = this.c + read;
                    this.c = i7;
                    this.d = i7;
                    System.arraycopy(this.e, i6, bArr, i + i5, read);
                }
                i5 += read;
                i4 = i5;
                if (i5 == min) {
                    break;
                }
            } else {
                this.g = true;
                xv8.a(p0m.TAG, "bufferAndWriteTo() read stream end -1 now", new Object[0]);
                break;
            }
        }
        return i4;
    }

    public final int c(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d2f1e37", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int read = this.f17760a.read(bArr, i, i2);
        if (read < 0) {
            this.g = true;
            return -1;
        }
        if (read > 0) {
            this.d += read;
            ow6.f().k(this.e);
            this.e = null;
        }
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        this.f17760a.close();
        this.h = true;
    }

    public final int e(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ce14b21", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int min = Math.min(i2, this.c - this.d);
        System.arraycopy(this.e, this.d, bArr, i, min);
        this.d += min;
        return min;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb836d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        if (this.f) {
            this.f17760a.mark(i);
        }
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public byte[] getBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("99e867c0", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public int getBufferLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c696436", new Object[]{this})).intValue();
        }
        int i = this.c;
        if (i > 0) {
            return i;
        }
        return this.b;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public int getBufferOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c05bef63", new Object[]{this})).intValue();
        }
        return 0;
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
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int c;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (bArr == null || i < 0 || i2 <= 0) {
            throw new IOException("read parameters illegal");
        }
        int i4 = -1;
        if (this.g) {
            return -1;
        }
        if (!this.f) {
            if (this.d < this.c) {
                i4 = e(bArr, i, i2);
                i3 = i2 - i4;
            } else {
                i3 = i2;
            }
            if (i3 > 0 && this.c < this.b && (b = b(bArr, (i + i2) - i3, i3)) >= 0) {
                i3 -= b;
                i4 = i4 < 0 ? b : i4 + b;
            }
        } else {
            i3 = i2;
        }
        return (this.g || i3 <= 0 || (c = c(bArr, (i + i2) - i3, i3)) < 0) ? i4 : i4 < 0 ? c : i4 + c;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public void rewind() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a1bc2", new Object[]{this});
            return;
        }
        if (this.f) {
            this.f17760a.reset();
        } else if (this.d > this.c) {
            throw new IOException("cannot rewind cause input stream offset too far");
        }
        this.d = 0;
        this.g = false;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public void rewindAndSetBufferSize(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e5fb15", new Object[]{this, new Integer(i)});
            return;
        }
        rewind();
        g(i);
    }

    public deo(int i, InputStream inputStream, int i2) {
        super(i);
        this.f17760a = inputStream;
        this.f = inputStream.markSupported();
        g(i2);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) > 0) {
            return bArr[0];
        }
        return -1;
    }
}
