package org.android.agoo.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class EncryptUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ALGORITHM_AES = "AES/CBC/PKCS5Padding";
    private static byte[] iv = {82, 22, 50, 44, -16, 124, -40, -114, -87, -40, 37, 23, -56, 23, -33, 75};
    private static ThreadLocal<Cipher> cipherThreadLocal = new ThreadLocal<>();
    private static final AlgorithmParameterSpec algorithmParameterSpec = new IvParameterSpec(iv);

    static {
        t2o.a(343933322);
    }

    public static final byte[] aesDecrypt(byte[] bArr, SecretKeySpec secretKeySpec, byte[] bArr2) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("95b19a6c", new Object[]{bArr, secretKeySpec, bArr2});
        }
        try {
            return initCipher(secretKeySpec, bArr2, 2).doFinal(bArr);
        } catch (BadPaddingException e) {
            throw new IllegalArgumentException("AES decrypt error:" + e.getMessage(), e);
        } catch (IllegalBlockSizeException e2) {
            throw new IllegalArgumentException("AES decrypt error:" + e2.getMessage(), e2);
        }
    }

    private static final Cipher getCipher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cipher) ipChange.ipc$dispatch("8dd0b2b9", new Object[0]);
        }
        Cipher cipher = cipherThreadLocal.get();
        if (cipher == null) {
            try {
                cipher = Cipher.getInstance(ALGORITHM_AES);
                cipherThreadLocal.set(cipher);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("get Chipher error:" + e.getMessage(), e);
            } catch (NoSuchPaddingException e2) {
                throw new RuntimeException("get Chipher error:" + e2.getMessage(), e2);
            }
        }
        return cipher;
    }

    public static byte[] hexStringToByteArray(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f47529e2", new Object[]{str});
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static byte[] hmacSha1(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f9756e9c", new Object[]{bArr, bArr2});
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA1");
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (Throwable th) {
            throw new RuntimeException("HmacSHA1 Throwable", th);
        }
    }

    private static final Cipher initCipher(SecretKeySpec secretKeySpec, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cipher) ipChange.ipc$dispatch("7b0342b9", new Object[]{secretKeySpec, bArr, new Integer(i)});
        }
        Cipher cipher = getCipher();
        try {
            cipher.init(i, secretKeySpec, new IvParameterSpec(bArr));
            return cipher;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("init Chipher error:" + e.getMessage(), e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new RuntimeException("init Chipher error:" + e2.getMessage(), e2);
        } catch (InvalidKeyException e3) {
            throw new RuntimeException("init Chipher error:" + e3.getMessage(), e3);
        }
    }

    public static final byte[] md5(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3a604fd1", new Object[]{bArr});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return instance.digest();
        } catch (Throwable th) {
            throw new RuntimeException("md5 value Throwable", th);
        }
    }
}
