package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class igr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final igr INSTANCE = new igr();

    static {
        t2o.a(804257849);
    }

    public final void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f483e0a", new Object[]{this, closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                wfr.INSTANCE.c("DIIOUtils", "close io error", th);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final String b(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6dc3e3b", new Object[]{this, inputStream});
        }
        ckf.g(inputStream, "inputStream");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[2048];
            for (int i = 0; i < 2048; i++) {
                bArr[i] = 0;
            }
            int read = inputStream.read(bArr);
            while (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ckf.f(byteArray, "baos.toByteArray()");
            String str = new String(byteArray, uj3.UTF_8);
            a(byteArrayOutputStream);
            return str;
        } catch (Throwable th) {
            try {
                wfr.INSTANCE.c("DIIOUtils", "close io error", th);
                a(byteArrayOutputStream);
                return null;
            } catch (Throwable th2) {
                a(byteArrayOutputStream);
                throw th2;
            }
        }
    }
}
