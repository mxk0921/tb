package tb;

import com.alibaba.ability.impl.file.ByteArrayPool;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class aam extends ByteArrayOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ByteArrayPool f15629a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(106954775);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(106954774);
    }

    public /* synthetic */ aam(ByteArrayPool byteArrayPool, int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? k2d.INSTANCE.c() : byteArrayPool, (i2 & 2) != 0 ? 1024 : i);
    }

    public static /* synthetic */ Object ipc$super(aam aamVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -683656483) {
            super.write(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == -483678593) {
            super.close();
            return null;
        } else if (hashCode == 462729549) {
            super.write((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/ability/impl/file/PoolingByteArrayOutputStream");
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e317b102", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i > ((ByteArrayOutputStream) this).buf.length) {
            byte[] d = this.f15629a.d((i2 + i) * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, d, 0, ((ByteArrayOutputStream) this).count);
            this.f15629a.e(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = d;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        this.f15629a.e(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            this.f15629a.e(((ByteArrayOutputStream) this).buf);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(bArr, pg1.ATOM_EXT_buffer);
        a(i2);
        super.write(bArr, i, i2);
    }

    public aam(ByteArrayPool byteArrayPool, int i) {
        ckf.g(byteArrayPool, "pool");
        this.f15629a = byteArrayPool;
        ((ByteArrayOutputStream) this).buf = byteArrayPool.d(hfn.c(i, 1024));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
            return;
        }
        a(1);
        super.write(i);
    }
}
