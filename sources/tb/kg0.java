package tb;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class kg0 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] c = ce8.c(12);
        return a(c, c(bArr, bArr2, c));
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            vwx.b("GCM", "encrypt 6 content is null");
            return new byte[0];
        } else if (bArr.length == 0) {
            vwx.b("GCM", "encrypt 6 content length is 0");
            return new byte[0];
        } else if (bArr2 == null) {
            vwx.b("GCM", "encrypt 6 key is null");
            return new byte[0];
        } else if (bArr2.length < 16) {
            vwx.b("GCM", "encrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        } else if (bArr3 == null) {
            vwx.b("GCM", "encrypt 6 iv is null");
            return new byte[0];
        } else if (bArr3.length < 12) {
            vwx.b("GCM", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                instance.init(1, secretKeySpec, d(bArr3));
                return instance.doFinal(bArr);
            } catch (NullPointerException e) {
                vwx.b("GCM", "GCM encrypt data error" + e.getMessage());
                return new byte[0];
            } catch (GeneralSecurityException e2) {
                vwx.b("GCM", "GCM encrypt data error" + e2.getMessage());
                return new byte[0];
            }
        }
    }

    public static AlgorithmParameterSpec d(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }
}
