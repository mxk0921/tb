package com.meizu.cloud.pushsdk.e.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d {
    public static boolean a(String str) {
        if (b(str) || "OPTIONS".equals(str) || "DELETE".equals(str) || "PROPFIND".equals(str) || "MKCOL".equals(str) || "LOCK".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        if ("POST".equals(str) || "PUT".equals(str) || "PATCH".equals(str) || "PROPPATCH".equals(str) || "REPORT".equals(str)) {
            return true;
        }
        return false;
    }
}
