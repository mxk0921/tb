package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x5g extends OutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f31156a;

    static {
        t2o.a(407896086);
    }

    public x5g(OutputStream outputStream) {
        this.f31156a = outputStream;
    }

    public static /* synthetic */ Object ipc$super(x5g x5gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/boutique/fastsp/kv/KvOutputStream");
    }

    public void a(byte b, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a211fe8b", new Object[]{this, new Byte(b), new Integer(i)});
            return;
        }
        b(b);
        c(i);
    }

    public void b(byte b) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250e675a", new Object[]{this, new Byte(b)});
        } else {
            this.f31156a.write(b);
        }
    }

    public void c(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2d0b7e", new Object[]{this, new Integer(i)});
            return;
        }
        b((byte) (i >> 24));
        b((byte) (i >> 16));
        b((byte) (i >> 8));
        b((byte) i);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f31156a.close();
        }
    }

    public void e(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310071bb", new Object[]{this, new Long(j)});
            return;
        }
        b((byte) (j >> 56));
        b((byte) (j >> 48));
        b((byte) (j >> 40));
        b((byte) (j >> 32));
        b((byte) (j >> 24));
        b((byte) (j >> 16));
        b((byte) (j >> 8));
        b((byte) j);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            this.f31156a.flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10cfa82d", new Object[]{this, bArr});
        } else {
            this.f31156a.write(bArr);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        } else {
            this.f31156a.write(bArr, i, i2);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
        } else {
            this.f31156a.write(i);
        }
    }
}
