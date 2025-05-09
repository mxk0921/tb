package com.mobile.auth;

import android.util.Base64;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0O00o {
    public static String O000000o(byte[] bArr, String str, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            return Base64.encodeToString(instance.doFinal(str.getBytes("utf-8")), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] O000000o() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static String O00000Oo(byte[] bArr, String str, byte[] bArr2) {
        try {
            byte[] decode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return new String(instance.doFinal(decode), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
