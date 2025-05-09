package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.Zstd;
import com.android.taobao.zstd.ZstdException;
import com.android.taobao.zstd.ZstdStreamInflater;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class crx extends FilterInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ZstdStreamInflater f17273a;
    public final byte[] b;
    public boolean c;
    public final byte[] d;
    public final byte[] e;

    public crx(InputStream inputStream, ZstdStreamInflater zstdStreamInflater, int i) {
        super(inputStream);
        this.c = false;
        this.d = new byte[1];
        this.e = new byte[512];
        Zstd.a();
        if (inputStream == null || zstdStreamInflater == null) {
            throw null;
        } else if (i > 0) {
            this.f17273a = zstdStreamInflater;
            this.b = new byte[i];
        } else {
            throw new IllegalArgumentException("buffer size <= 0");
        }
    }

    public static /* synthetic */ Object ipc$super(crx crxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/android/taobao/zstd/ZstdInputStream");
    }

    public synchronized void a(boolean z) throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8249dc35", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.c) {
            this.f17273a.close();
            if (z) {
                ((FilterInputStream) this).in.close();
            }
            this.c = true;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f9282c3", new Object[]{this})).intValue();
        }
        e();
        if (((FilterInputStream) this).in.available() > 0) {
            return 1;
        }
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            a(true);
        }
    }

    public final void e() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4788582f", new Object[]{this});
        } else if (this.c) {
            throw new IOException("Zstd Stream closed");
        }
    }

    public void g() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d479008a", new Object[]{this});
            return;
        }
        e();
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.b;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f17273a.setInput(this.b, 0, read);
            return;
        }
        throw new EOFException("Unexpected end of ZSTD input stream");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52db0af", new Object[]{this, new Integer(i)});
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f11b06c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        e();
        if (read(this.d, 0, 1) == -1) {
            return -1;
        }
        return this.d[0] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            throw new IOException("mark/reset not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a0434f2", new Object[]{this, new Long(j)})).longValue();
        }
        if (j >= 0) {
            e();
            int min = (int) Math.min(j, 2147483647L);
            int i = 0;
            while (i < min) {
                int i2 = min - i;
                byte[] bArr = this.e;
                if (i2 > bArr.length) {
                    i2 = bArr.length;
                }
                int read = read(bArr, 0, i2);
                if (read == -1) {
                    break;
                }
                i += read;
            }
            return i;
        }
        throw new IllegalArgumentException("negative skip length");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue() : read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws NullPointerException, IndexOutOfBoundsException, IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        e();
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            while (true) {
                int decompress = this.f17273a.decompress(bArr, i, i2);
                if (decompress != 0) {
                    return decompress;
                }
                if (this.f17273a.frameFinished()) {
                    if (available() <= 0) {
                        return -1;
                    }
                    g();
                } else if (this.f17273a.allInputDecompressed()) {
                    g();
                }
            }
        }
    }

    public crx(InputStream inputStream, ZstdStreamInflater zstdStreamInflater) {
        this(inputStream, zstdStreamInflater, 16384);
    }

    public crx(InputStream inputStream) {
        this(inputStream, new ZstdStreamInflater());
    }
}
