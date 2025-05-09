package com.uc.crashsdk.a;

import com.uc.crashsdk.JNIBridge;
import com.uc.crashsdk.b;
import com.uc.crashsdk.g;
import tb.bmv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class a {
    public static void a(String str) {
        if (g.M()) {
            a(1, "crashsdk", str, null);
        }
    }

    public static void b(String str) {
        if (g.M()) {
            a(3, "crashsdk", str, null);
        }
    }

    public static void c(String str, String str2) {
        if (b.d) {
            JNIBridge.nativeLog(5, str, str2);
        } else {
            a(3, str, str2, null);
        }
    }

    public static void d(String str, String str2) {
        if (b.d) {
            JNIBridge.nativeLog(6, str, str2);
        } else {
            a(4, str, str2, null);
        }
    }

    public static void a(String str, String str2) {
        if (g.M()) {
            a(2, str, str2, null);
        }
    }

    public static void b(String str, String str2) {
        if (b.d) {
            JNIBridge.nativeLog(4, str, str2);
        } else {
            a(2, str, str2, null);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (g.M()) {
            a(4, str, str2, th);
        }
    }

    public static void a(int i, String str, String str2, Throwable th) {
        if (i < 0) {
            i = 0;
        }
        if (i > 4) {
            i = 4;
        }
        try {
            Class<?> cls = Class.forName("android.util.Log");
            String[] strArr = {"v", "d", bmv.MSGTYPE_INTERVAL, "w", "e"};
            if (th != null) {
                cls.getDeclaredMethod(strArr[i], String.class, String.class, Throwable.class).invoke(null, str, str2, th);
            } else {
                cls.getDeclaredMethod(strArr[i], String.class, String.class).invoke(null, str, str2);
            }
        } catch (Throwable unused) {
        }
    }
}
