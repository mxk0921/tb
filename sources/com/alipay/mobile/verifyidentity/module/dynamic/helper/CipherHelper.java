package com.alipay.mobile.verifyidentity.module.dynamic.helper;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CipherHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String bytes2Hex(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a5323de", new Object[]{bArr});
        }
        String str = "";
        if (bArr == null) {
            return str;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                str = str + "0";
            }
            str = str + hexString;
        }
        return str;
    }

    public static byte[] encrypt_SHA(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8c49eab0", new Object[]{str, str2});
        }
        byte[] bytes = str.getBytes();
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = "SHA-256";
            }
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(bytes);
            return instance.digest();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
