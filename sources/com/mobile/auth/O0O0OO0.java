package com.mobile.auth;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0O0OO0 {
    public static String O000000o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return O000000o(str.getBytes("utf-8"));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static String O000000o(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return OO0oO.O000000o(instance.digest());
        } catch (Exception unused) {
            return "";
        }
    }
}
