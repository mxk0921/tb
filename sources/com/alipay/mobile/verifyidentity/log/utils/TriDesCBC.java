package com.alipay.mobile.verifyidentity.log.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TriDesCBC {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String decrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24104ef8", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        byte[] decrypt = decrypt(str, Base64.decode(str2, 2));
        if (decrypt != null) {
            return new String(decrypt);
        }
        return null;
    }

    public static String encrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("327cf920", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        byte[] encrypt = encrypt(str, str2.getBytes());
        if (encrypt != null) {
            return new String(Base64.encode(encrypt, 2));
        }
        return null;
    }

    public static byte[] decrypt(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ec6423d8", new Object[]{str, bArr});
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
            Cipher instance = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            VerifyLogCat.w("TriDesCBC", e);
            return null;
        }
    }

    public static byte[] encrypt(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("30c36e00", new Object[]{str, bArr});
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
            Cipher instance = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            VerifyLogCat.w("TriDesCBC", e);
            return null;
        }
    }
}
