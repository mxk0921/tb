package com.heytap.msp.push.encrypt;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tb.dgh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AESEncrypt {
    private static final String ALGORITHM = "AES";
    private static final String IV_CONNECT = "%IV1%";
    private static final int KEY_BYTE_SIZE = 256;
    public static final String SDK_APP_SECRET = "isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=";
    private static final String TRANSFORMATION = "AES/CTR/NoPadding";

    static {
        t2o.a(612368444);
    }

    public static String decrypt(String str, String str2) throws Exception {
        String[] split = str2.split(IV_CONNECT);
        byte[] decodeBase64 = Base64.decodeBase64(split[0]);
        byte[] decodeBase642 = Base64.decodeBase64(split[1]);
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decodeBase64(str), "AES");
        Cipher instance = Cipher.getInstance(TRANSFORMATION);
        instance.init(2, secretKeySpec, new IvParameterSpec(decodeBase642));
        return new String(instance.doFinal(decodeBase64));
    }

    public static String encrypt(String str) {
        try {
            return encrypt(SDK_APP_SECRET, str);
        } catch (Exception e) {
            dgh.a(e.getLocalizedMessage());
            return "";
        }
    }

    public static String genKey() throws NoSuchAlgorithmException {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        return Base64.encodeBase64String(instance.generateKey().getEncoded());
    }

    public static String encrypt(String str, String str2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decodeBase64(str), "AES");
        Cipher instance = Cipher.getInstance(TRANSFORMATION);
        instance.init(1, secretKeySpec);
        String encodeBase64String = Base64.encodeBase64String(instance.getIV());
        String encodeBase64String2 = Base64.encodeBase64String(instance.doFinal(str2.getBytes()));
        return encodeBase64String2 + IV_CONNECT + encodeBase64String;
    }
}
