package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.Zstd;
import com.android.taobao.zstd.ZstdException;
import com.android.taobao.zstd.ZstdStreamDeflater;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class frx extends FilterOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ZstdStreamDeflater f19494a;
    public final byte[] b;
    public final boolean c;
    public boolean d;

    public frx(OutputStream outputStream, ZstdStreamDeflater zstdStreamDeflater, int i, boolean z) {
        super(outputStream);
        this.d = false;
        Zstd.a();
        if (outputStream == null || zstdStreamDeflater == null) {
            throw null;
        } else if (i > 0) {
            this.f19494a = zstdStreamDeflater;
            this.b = new byte[i];
            this.c = z;
        } else {
            throw new IllegalArgumentException("buffer size <= 0");
        }
    }

    public static /* synthetic */ Object ipc$super(frx frxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/android/taobao/zstd/ZstdOutputStream");
    }

    public synchronized void a(boolean z) throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8249dc35", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.d) {
            g();
            if (z) {
                ((FilterOutputStream) this).out.close();
            }
            this.d = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            a(true);
        }
    }

    public void e() throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d4eee9", new Object[]{this});
            return;
        }
        ZstdStreamDeflater zstdStreamDeflater = this.f19494a;
        byte[] bArr = this.b;
        int compress = zstdStreamDeflater.compress(bArr, 0, bArr.length);
        if (compress > 0) {
            ((FilterOutputStream) this).out.write(this.b, 0, compress);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else if (this.c) {
            do {
                ZstdStreamDeflater zstdStreamDeflater = this.f19494a;
                byte[] bArr = this.b;
                int flush = zstdStreamDeflater.flush(bArr, 0, bArr.length);
                if (flush > 0) {
                    ((FilterOutputStream) this).out.write(this.b, 0, flush);
                }
            } while (this.f19494a.remainCompressedData());
            ((FilterOutputStream) this).out.flush();
        } else {
            ((FilterOutputStream) this).out.flush();
        }
    }

    public synchronized void g() throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        do {
            ZstdStreamDeflater zstdStreamDeflater = this.f19494a;
            byte[] bArr = this.b;
            int finish = zstdStreamDeflater.finish(bArr, 0, bArr.length);
            if (finish > 0) {
                ((FilterOutputStream) this).out.write(this.b, 0, finish);
            }
        } while (this.f19494a.remainCompressedData());
        this.f19494a.reset();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
        } else {
            write(new byte[]{(byte) (i & 255)}, 0, 1);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10cfa82d", new Object[]{this, bArr});
        } else {
            write(bArr, 0, bArr.length);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IndexOutOfBoundsException, IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = i + i2;
        if ((i | i2 | i3 | (bArr.length - i3)) < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 != 0) {
            if (this.f19494a.allInputCompressed()) {
                this.f19494a.setInput(bArr, i, i2);
                while (!this.f19494a.allInputCompressed()) {
                    e();
                }
            }
        }
    }

    public frx(OutputStream outputStream, ZstdStreamDeflater zstdStreamDeflater, boolean z) {
        this(outputStream, zstdStreamDeflater, 16384, z);
    }

    public frx(OutputStream outputStream, ZstdStreamDeflater zstdStreamDeflater) {
        this(outputStream, zstdStreamDeflater, 16384, false);
    }
}
