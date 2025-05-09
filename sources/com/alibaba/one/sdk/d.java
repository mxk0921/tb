package com.alibaba.one.sdk;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f2505a;

    private d() {
    }

    public static d a() {
        if (f2505a == null) {
            f2505a = new d();
        }
        return f2505a;
    }

    public static String a(String str) {
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
}
