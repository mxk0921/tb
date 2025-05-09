package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f2d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933237);
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f5fa8c", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("89d61821", new Object[]{inputStream});
        }
        if (inputStream == null) {
            return null;
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = gZIPInputStream.read(bArr);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        a(gZIPInputStream);
                        a(byteArrayOutputStream);
                        return byteArray;
                    }
                }
            } catch (Exception e) {
                ALog.e(vas.TAG, "gzipInputStream err", e, new Object[0]);
                a(gZIPInputStream);
                a(byteArrayOutputStream);
                return null;
            }
        } catch (Throwable th) {
            a(gZIPInputStream);
            a(byteArrayOutputStream);
            throw th;
        }
    }
}
