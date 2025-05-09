package tb;

import android.text.TextUtils;
import com.heytap.msp.push.encrypt.AESEncrypt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ty4 {
    public static final String DES_KEY_BASE64 = "Y29tLm5lYXJtZS5tY3M=";

    /* renamed from: a  reason: collision with root package name */
    public static String f29029a;
    public static String b = "";

    static {
        t2o.a(612368423);
    }

    public static String a(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        boolean z = false;
        try {
            str2 = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
            dgh.a("sdkDecrypt aesDecrypt aes data " + str2);
            z = true;
        } catch (Exception e) {
            dgh.a("sdkDecrypt AES excepiton " + e.toString());
            z = false;
        }
        if (!TextUtils.isEmpty(str2)) {
        }
        if (z) {
            return str2;
        }
        try {
            str2 = f55.a(str, c());
            f29029a = "DES";
            plp.b().f(f29029a);
            dgh.a("sdkDecrypt aesDecrypt des data " + str2);
            return str2;
        } catch (Exception e2) {
            dgh.a("sdkDecrypt DES excepiton " + e2.toString());
            return str2;
        }
    }

    public static String b(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        boolean z = false;
        try {
            str2 = f55.a(str, c());
            dgh.a("sdkDecrypt desDecrypt des data " + str2);
            z = true;
        } catch (Exception e) {
            dgh.a("sdkDecrypt DES excepiton " + e.toString());
            z = false;
        }
        if (!TextUtils.isEmpty(str2)) {
        }
        if (z) {
            return str2;
        }
        try {
            str2 = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
            f29029a = "AES";
            plp.b().f(f29029a);
            dgh.a("sdkDecrypt desDecrypt aes data " + str2);
            return str2;
        } catch (Exception e2) {
            dgh.a("sdkDecrypt AES excepiton " + e2.toString());
            return str2;
        }
    }

    public static String c() {
        if (TextUtils.isEmpty(b)) {
            b = new String(vp1.k(DES_KEY_BASE64));
        }
        byte[] d = d(b);
        f(d);
        return new String(d, Charset.forName("UTF-8"));
    }

    public static byte[] d(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    public static String e(String str) {
        dgh.a("sdkDecrypt start data " + str);
        if (TextUtils.isEmpty(f29029a)) {
            f29029a = plp.b().a();
        }
        if ("DES".equals(f29029a)) {
            dgh.a("sdkDecrypt start DES");
            return b(str);
        }
        dgh.a("sdkDecrypt start AES");
        return a(str);
    }

    public static byte[] f(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }
}
