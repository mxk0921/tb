package tb;

import com.alibaba.ability.impl.file.ByteArrayPool;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class k2d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IO_BUFFER_SIZE = 2048;
    public static final k2d INSTANCE = new k2d();

    /* renamed from: a  reason: collision with root package name */
    public static final ByteArrayPool f22363a = new ByteArrayPool(20480);

    static {
        t2o.a(106954772);
    }

    public final void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d37bb", new Object[]{this, closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final byte[] b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a0197a7e", new Object[]{this, new Integer(i)});
        }
        return f22363a.d(i);
    }

    public final ByteArrayPool c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayPool) ipChange.ipc$dispatch("df75862c", new Object[]{this});
        }
        return f22363a;
    }

    public final byte[] d(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2f0d8a3e", new Object[]{this, inputStream});
        }
        if (inputStream == null) {
            return null;
        }
        aam aamVar = new aam(null, 0, 3, null);
        byte[] b = b(2048);
        while (true) {
            try {
                int read = inputStream.read(b, 0, b.length);
                if (read < 0) {
                    return aamVar.toByteArray();
                }
                aamVar.write(b, 0, read);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            } finally {
                e(b);
                a(inputStream);
            }
        }
    }

    public final void e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15524871", new Object[]{this, bArr});
        } else {
            f22363a.e(bArr);
        }
    }
}
