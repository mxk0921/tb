package com.taobao.wireless.security.adapter.common;

/* renamed from: com.taobao.wireless.security.adapter.common.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0806 {
    /* renamed from: а  reason: contains not printable characters */
    public static String m347(String str) {
        if (str == null || str.length() != 0) {
            return str;
        }
        return null;
    }

    /* renamed from: б  reason: contains not printable characters */
    public static boolean m348(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return (str == null || str2 == null || !str.equals(str2)) ? false : true;
    }

    /* renamed from: в  reason: contains not printable characters */
    public static boolean m349(String... strArr) {
        return !m350(strArr);
    }

    /* renamed from: г  reason: contains not printable characters */
    public static boolean m350(String... strArr) {
        for (String str : strArr) {
            if (str == null || "".equals(str)) {
                return true;
            }
        }
        return false;
    }
}
