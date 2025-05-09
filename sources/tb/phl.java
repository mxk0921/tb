package tb;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class phl {
    public static byte[] a(char[] cArr, byte[] bArr, int i, int i2, boolean z) {
        Throwable e;
        SecretKeyFactory secretKeyFactory;
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr, bArr, i, i2);
            if (z) {
                secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            } else {
                secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            }
            return secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            vwx.b("PBKDF2", "pbkdf exception : " + e.getMessage());
            return new byte[0];
        } catch (InvalidKeySpecException e3) {
            e = e3;
            vwx.b("PBKDF2", "pbkdf exception : " + e.getMessage());
            return new byte[0];
        }
    }

    public static byte[] b(char[] cArr, byte[] bArr, int i, int i2) {
        return a(cArr, bArr, i, i2, false);
    }

    public static byte[] c(char[] cArr, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[0];
        if (Build.VERSION.SDK_INT >= 26) {
            return a(cArr, bArr, i, i2, true);
        }
        vwx.b("PBKDF2", "system version not high than 26");
        return bArr2;
    }
}
