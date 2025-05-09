package com.huawei.hms.hatool;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a1 {
    public static void a(String str, String str2, long j) {
        s0 h = h(str, str2);
        if (h != null) {
            h.a(j);
        }
    }

    public static int b(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.d();
        }
        return 7;
    }

    public static boolean c(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.g();
        }
        return true;
    }

    public static String d(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.f();
        }
        return "";
    }

    public static boolean e(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.i();
        }
        return false;
    }

    public static String f(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.h();
        }
        return "";
    }

    public static String g(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.n();
        }
        return "";
    }

    private static s0 h(String str, String str2) {
        l1 a2 = s.c().a(str);
        if (a2 == null) {
            return null;
        }
        if (!"alltype".equals(str2)) {
            return a2.a(str2);
        }
        s0 a3 = a2.a("oper");
        return a3 == null ? a2.a("maint") : a3;
    }

    public static Map<String, String> i(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.k();
        }
        return null;
    }

    public static long j(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.l();
        }
        return 0L;
    }

    public static int k(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.b();
        }
        return 10;
    }

    public static String l(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.o();
        }
        return "";
    }

    public static String m(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.q();
        }
        return "";
    }

    public static String n(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.m();
        }
        return "";
    }

    public static String o(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.p();
        }
        return "";
    }

    public static boolean a(String str, String str2) {
        s0 h = h(str, str2);
        if (h != null) {
            return h.a();
        }
        return true;
    }
}
