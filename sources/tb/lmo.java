package tb;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lmo {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f23424a = {"SHA-256", "SHA-384", "SHA-512"};

    public static boolean a(String str) {
        String[] strArr = f23424a;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        return c(str, "SHA-256");
    }

    public static String c(String str, String str2) {
        byte[] bArr;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            vwx.b("SHA", "content or algorithm is null.");
            return "";
        } else if (!a(str2)) {
            vwx.b("SHA", "algorithm is not safe or legal");
            return "";
        } else {
            try {
                bArr = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                bArr = new byte[0];
                vwx.b("SHA", "Error in generate SHA UnsupportedEncodingException");
            }
            return sva.a(d(bArr, str2));
        }
    }

    public static byte[] d(byte[] bArr, String str) {
        if (bArr == null || TextUtils.isEmpty(str)) {
            vwx.b("SHA", "content or algorithm is null.");
            return new byte[0];
        } else if (!a(str)) {
            vwx.b("SHA", "algorithm is not safe or legal");
            return new byte[0];
        } else {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                instance.update(bArr);
                return instance.digest();
            } catch (NoSuchAlgorithmException unused) {
                vwx.b("SHA", "Error in generate SHA NoSuchAlgorithmException");
                return new byte[0];
            }
        }
    }
}
