package tb;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class f55 {
    static {
        t2o.a(612368424);
    }

    public static String a(String str, String str2) throws Exception {
        Cipher instance = Cipher.getInstance("DES");
        instance.init(2, b(str2));
        return new String(instance.doFinal(Base64.decode(str, 0)), Charset.defaultCharset()).trim();
    }

    public static Key b(String str) throws Exception {
        return SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(Base64.decode(str, 0)));
    }
}
