package com.taobao.wireless.security.adapter.datacollection;

import java.io.PrintStream;
import java.security.MessageDigest;

/* renamed from: com.taobao.wireless.security.adapter.datacollection.в  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0813 {

    /* renamed from: а  reason: contains not printable characters */
    private static C0813 f592;

    private C0813() {
    }

    /* renamed from: а  reason: contains not printable characters */
    public static C0813 m377() {
        if (f592 == null) {
            f592 = new C0813();
        }
        return f592;
    }

    /* renamed from: в  reason: contains not printable characters */
    public static String m378(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("SHA-1");
                    instance.update(str.getBytes("UTF-8"));
                    byte[] digest = instance.digest();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < digest.length; i++) {
                        sb.append(String.format("%02x", Byte.valueOf(digest[i])));
                    }
                    return sb.toString();
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: б  reason: contains not printable characters */
    public byte[] m379(String str, String str2) {
        if ("MD2、MD5、SHA1、SHA256、SHA384、SHA512".contains(str2)) {
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return instance.digest();
        }
        PrintStream printStream = System.out;
        printStream.println("not support " + str2);
        return null;
    }
}
