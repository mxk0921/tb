package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import tb.hqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class sqx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1029701687);
    }

    /* JADX WARN: Finally extract failed */
    public static final byte[] a(hqx.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("291f50b6", new Object[]{aVar, str});
        }
        ckf.g(aVar, "<this>");
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            byte[] bytes = str.getBytes(uj3.UTF_8);
            ckf.f(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            xhv xhvVar = xhv.INSTANCE;
            lw3.a(gZIPOutputStream, null);
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                throw th;
            } catch (Throwable th) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Throwable, java.lang.String] */
    public static final String b(hqx.a aVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("248f99d", new Object[]{aVar, bArr});
        }
        ckf.g(aVar, "<this>");
        th = 0;
        if (bArr == null || bArr.length == 0) {
            return th;
        }
        try {
            InputStreamReader gZIPInputStream = new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(bArr)), "UTF-8");
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[1024];
            while (true) {
                int read = gZIPInputStream.read(cArr);
                if (read == -1) {
                    return sb.toString();
                }
                sb.append(cArr, 0, read);
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
