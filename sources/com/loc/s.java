package com.loc;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class s {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return x.e(c(str));
    }

    public static String b(String str) {
        return x.f(d(str));
    }

    private static byte[] c(String str) {
        try {
            return e(str);
        } catch (Throwable th) {
            as.a(th, "MD5", "gmb");
            return new byte[0];
        }
    }

    private static byte[] d(String str) {
        try {
            return e(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return new byte[0];
        }
    }

    private static byte[] e(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        MessageDigest instance = MessageDigest.getInstance(x.c("ETUQ1"));
        instance.update(x.a(str));
        return instance.digest();
    }

    public static String a(byte[] bArr) {
        return x.e(a(bArr, x.c("ETUQ1")));
    }

    public static byte[] a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return instance.digest();
        } catch (Throwable th) {
            as.a(th, "MD5", "gmb");
            return null;
        }
    }
}
