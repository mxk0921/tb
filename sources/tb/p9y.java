package tb;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p9y {
    public static SecretKey a(p3y p3yVar) throws NoSuchAlgorithmException, InvalidKeySpecException {
        if (p3yVar == null || !p3yVar.a()) {
            throw new IllegalArgumentException("invalid data for generating the key.");
        }
        return new SecretKeySpec(SecretKeyFactory.getInstance(p3yVar.f()).generateSecret(new PBEKeySpec(lva.c(e(lva.b(p3yVar.b()), lva.b(p3yVar.c()), lva.b(p3yVar.d()))).toCharArray(), lva.b(p3yVar.e()), p3yVar.g(), p3yVar.h() * 8)).getEncoded(), "AES");
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr) throws GeneralSecurityException {
        if (secretKey == null || bArr == null) {
            throw new NullPointerException("key or cipherText must not be null.");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKey, new IvParameterSpec(copyOfRange));
        return instance.doFinal(bArr, copyOfRange.length + 1, (bArr.length - copyOfRange.length) - 1);
    }

    public static byte[] c(byte[] bArr, int i) {
        if (bArr != null) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                if (i < 0) {
                    bArr[i2] = (byte) (bArr[i2] << (-i));
                } else {
                    bArr[i2] = (byte) (bArr[i2] >> i);
                }
            }
            return bArr;
        }
        throw new NullPointerException("bytes must not be null.");
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException("left or right must not be null.");
        } else if (bArr.length == bArr2.length) {
            byte[] bArr3 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
            return bArr3;
        } else {
            throw new IllegalArgumentException("left and right must be the same length.");
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        c(bArr, -4);
        byte[] d = d(bArr, bArr2);
        c(d, 6);
        return d(d, bArr3);
    }
}
