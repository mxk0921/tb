package com.alipay.android.msp.framework.encrypt;

import android.text.TextUtils;
import android.util.Base64;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Des {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(int i, String str, String str2, String str3) {
        SecretKeySpec secretKeySpec;
        Cipher cipher;
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c667908", new Object[]{new Integer(i), str, str2, str3});
        }
        try {
            if (TextUtils.equals(str3, "AES")) {
                secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES/CBC/PKCS5PADDING");
                cipher = Cipher.getInstance("AES");
            } else {
                secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
                cipher = Cipher.getInstance("DES");
            }
            cipher.init(i, secretKeySpec);
            if (i == 2) {
                bArr = Base64.decode(str, 2);
            } else {
                bArr = str.getBytes("UTF-8");
            }
            byte[] doFinal = cipher.doFinal(bArr);
            if (i == 2) {
                return new String(doFinal);
            }
            return Base64.encodeToString(doFinal, 2);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    public static String decrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24104ef8", new Object[]{str, str2});
        }
        return a(2, str, str2, "DES");
    }

    public static String decryptAES(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("941e5e23", new Object[]{str, str2});
        }
        return a(2, str, str2, "AES");
    }

    public static String encrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("327cf920", new Object[]{str, str2});
        }
        return a(1, str, str2, "DES");
    }

    public static String encryptAES(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b8ba2fb", new Object[]{str, str2});
        }
        return a(1, str, str2, "AES");
    }
}
