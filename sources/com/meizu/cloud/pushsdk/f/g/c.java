package com.meizu.cloud.pushsdk.f.g;

import com.meizu.cloud.pushinternal.DebugLogger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static int f5882a;

    private static String a() {
        return Thread.currentThread().getName();
    }

    public static void b(String str, String str2, Object... objArr) {
        if (f5882a >= b.ERROR.a()) {
            DebugLogger.e(a(str), a(str2, objArr));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        if (f5882a >= b.VERBOSE.a()) {
            DebugLogger.i(a(str), a(str2, objArr));
        }
    }

    private static String a(String str) {
        return "PushTracker->" + str;
    }

    private static String a(String str, Object... objArr) {
        return a() + "|" + String.format(str, objArr);
    }

    public static void a(b bVar) {
        f5882a = bVar.a();
    }

    public static void a(String str, String str2, Object... objArr) {
        if (f5882a >= b.DEBUG.a()) {
            DebugLogger.d(a(str), a(str2, objArr));
        }
    }
}
