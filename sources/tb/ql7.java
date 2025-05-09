package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ql7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856429);
    }

    public static String a(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a947884", new Object[]{bArr, str});
        }
        return tva.a(b(bArr, str));
    }

    public static byte[] b(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ceff31cf", new Object[]{bArr, str});
        }
        try {
            return MessageDigest.getInstance(str).digest(bArr);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("Security exception", e);
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("453b582d", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return a(str.getBytes("utf-8"), "MD5");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9954bdf9", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        return a(bArr, "SHA-256");
    }
}
