package com.huawei.hms.hatool;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class z {
    public static String a(String str, String str2) {
        j0 c = c(str, str2);
        if (c != null) {
            return c.a();
        }
        return "";
    }

    public static boolean b(String str, String str2) {
        j0 c = c(str, str2);
        if (c == null || !c.e()) {
            return false;
        }
        return true;
    }

    private static j0 c(String str, String str2) {
        s0 a2;
        l1 a3 = s.c().a(str);
        if (a3 == null || (a2 = a3.a(str2)) == null) {
            return null;
        }
        return a2.j();
    }

    public static String d(String str, String str2) {
        j0 c = c(str, str2);
        if (c != null) {
            return c.b();
        }
        return "";
    }

    public static boolean e(String str, String str2) {
        j0 c = c(str, str2);
        if (c == null || !c.f()) {
            return false;
        }
        return true;
    }

    public static boolean f(String str, String str2) {
        s0 a2;
        l1 a3 = s.c().a(str);
        if (a3 == null || (a2 = a3.a(str2)) == null) {
            return false;
        }
        return a2.c();
    }

    public static String g(String str, String str2) {
        j0 c = c(str, str2);
        if (c != null) {
            return c.d();
        }
        return "";
    }

    public static boolean h(String str, String str2) {
        j0 c = c(str, str2);
        if (c == null || !c.g()) {
            return false;
        }
        return true;
    }

    public static boolean i(String str, String str2) {
        s0 a2;
        l1 a3 = s.c().a(str);
        if (a3 == null || (a2 = a3.a(str2)) == null) {
            return false;
        }
        return a2.e();
    }

    public static String j(String str, String str2) {
        j0 c = c(str, str2);
        if (c != null) {
            return c.c();
        }
        return "";
    }

    public static boolean k(String str, String str2) {
        j0 c = c(str, str2);
        if (c == null || !c.h()) {
            return false;
        }
        return true;
    }
}
