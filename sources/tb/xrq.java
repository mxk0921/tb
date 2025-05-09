package tb;

import java.io.UnsupportedEncodingException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class xrq {
    public static byte[] a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            throw c(str2, e);
        }
    }

    public static byte[] b(String str) {
        return a(str, "UTF-8");
    }

    public static IllegalStateException c(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(str + ": " + unsupportedEncodingException);
    }

    public static String d(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw c(str, e);
        }
    }

    public static String e(byte[] bArr) {
        return d(bArr, "UTF-8");
    }
}
