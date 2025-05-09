package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.utils.io.TMSByteArrayPool;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vas {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAP_FILE_THRESHOLD_MIN = 65536;
    public static final int MAP_FILE_THRESHOOLD_MAX = 5242880;
    public static final String TAG = "IOUtils";

    /* renamed from: a  reason: collision with root package name */
    public static final TMSByteArrayPool f29899a = new TMSByteArrayPool(20480);

    static {
        t2o.a(849346601);
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d37bb", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e(TAG, "close stream exception", e);
            }
        }
    }

    public static byte[] c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a0197a7e", new Object[]{new Integer(i)});
        }
        return d().c(i);
    }

    public static TMSByteArrayPool d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSByteArrayPool) ipChange.ipc$dispatch("a00f1247", new Object[0]);
        }
        return f29899a;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258c3c62", new Object[0])).booleanValue();
        }
        return true;
    }

    public static String f(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b2827ca", new Object[]{inputStream});
        }
        if (inputStream == null) {
            return null;
        }
        return new String(g(inputStream));
    }

    public static void h(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15524871", new Object[]{bArr});
        } else {
            d().d(bArr);
        }
    }

    public static byte[] g(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e0ed5c0a", new Object[]{inputStream});
        }
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 2048);
                if (read < 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Exception e) {
                Log.e(TAG, "read exception", e);
                return null;
            } finally {
                a(inputStream);
            }
        }
    }

    public static void b(MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer != null) {
            try {
                Method declaredMethod = Class.forName("java.nio.NioUtils").getDeclaredMethod("freeDirectBuffer", ByteBuffer.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, mappedByteBuffer);
            } catch (Throwable th) {
                Log.e(TAG, "freeMappedBuffer Exception!", th);
            }
        }
    }
}
