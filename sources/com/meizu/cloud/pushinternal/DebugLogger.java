package com.meizu.cloud.pushinternal;

import android.content.Context;
import com.meizu.cloud.pushsdk.d.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DebugLogger {
    public static boolean debug;

    public static void d(String str, String str2) {
        g.c().b(str, str2);
    }

    public static void e(String str, String str2) {
        g.c().a(str, str2);
    }

    public static void flush() {
        g.c().b(false);
    }

    public static void i(String str, String str2) {
        g.c().c(str, str2);
    }

    public static void init(Context context) {
        g.c().a(context);
    }

    public static boolean isDebuggable() {
        return g.c().a();
    }

    public static void switchDebug(boolean z) {
        g.c().a(z);
    }

    public static void w(String str, String str2) {
        g.c().d(str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        g.c().a(str, str2, th);
    }

    public static void init(Context context, String str) {
        g.c().a(context, str);
    }
}
