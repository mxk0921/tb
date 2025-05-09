package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.utils.io.ByteArrayPool;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a2d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IO_BUFFER_SIZE = 2048;
    public static final a2d INSTANCE = new a2d();

    /* renamed from: a  reason: collision with root package name */
    public static final ByteArrayPool f15505a = new ByteArrayPool(20480);

    static {
        t2o.a(849346592);
    }

    @JvmStatic
    public static final void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d37bb", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @JvmStatic
    public static final byte[] b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a0197a7e", new Object[]{new Integer(i)});
        }
        return f15505a.d(i);
    }

    @JvmStatic
    public static final byte[] d(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2f0d8a3e", new Object[]{inputStream});
        }
        if (inputStream == null) {
            return null;
        }
        bam bamVar = new bam(null, 0, 3, null);
        byte[] b = b(2048);
        while (true) {
            try {
                int read = inputStream.read(b, 0, b.length);
                if (read < 0) {
                    return bamVar.toByteArray();
                }
                bamVar.write(b, 0, read);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            } finally {
                e(b);
                a(inputStream);
            }
        }
    }

    @JvmStatic
    public static final void e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15524871", new Object[]{bArr});
        } else {
            f15505a.e(bArr);
        }
    }

    public final ByteArrayPool c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayPool) ipChange.ipc$dispatch("f076f5af", new Object[]{this});
        }
        return f15505a;
    }
}
