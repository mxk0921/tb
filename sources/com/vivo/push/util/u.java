package com.vivo.push.util;

import android.content.Context;
import com.alipay.mobile.common.logging.util.perf.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final t f14673a = new s();
    private static boolean b;
    private static boolean c;

    static {
        c();
    }

    public static boolean a() {
        return b;
    }

    public static boolean b() {
        return b && c;
    }

    private static void c() {
        b = ag.b("persist.sys.log.ctrl", "no").equals(Constants.VAL_YES);
    }

    public static int d(String str, String str2) {
        return f14673a.d(str, str2);
    }

    public static int e(String str, String str2) {
        return f14673a.e(str, str2);
    }

    public static void a(boolean z) {
        c();
        c = z;
    }

    public static int c(String str, String str2) {
        return f14673a.c(str, str2);
    }

    public static int b(String str, String str2) {
        return f14673a.b(str, str2);
    }

    public static void c(Context context, String str) {
        f14673a.c(context, str);
    }

    public static int a(String str, String str2) {
        return f14673a.a(str, str2);
    }

    public static int b(String str, String str2, Throwable th) {
        return f14673a.b(str, str2, th);
    }

    public static int a(String str, Throwable th) {
        return f14673a.a(str, th);
    }

    public static void b(Context context, String str) {
        f14673a.b(context, str);
    }

    public static int a(String str, String str2, Throwable th) {
        return f14673a.a(str, str2, th);
    }

    public static void b(String str) {
        if (b) {
            f14673a.c("VIVO.PUSH.PROFILE.SYNC", str);
        }
    }

    public static String a(Throwable th) {
        return f14673a.a(th);
    }

    public static void a(Context context, String str) {
        f14673a.a(context, str);
    }

    public static void a(String str) {
        if (b) {
            f14673a.c("VIVO.PUSH.MSG_NODE", str);
        }
    }

    public static void a(int i, String str) {
        a("RunTimeException", "code: " + i + ", exceptionMsg: " + str);
    }
}
