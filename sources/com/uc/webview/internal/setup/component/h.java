package com.uc.webview.internal.setup.component;

import android.os.Process;
import android.util.Log;
import com.uc.webview.base.klog.KLogHandler;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f14407a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Method f14408a;

        static {
            try {
                f14408a = Class.forName("android.util.Log").getDeclaredMethod("println", Integer.TYPE, String.class, String.class);
            } catch (Throwable unused) {
            }
        }

        public static void a(int i, String str, String str2) {
            String str3;
            int i2;
            StringBuilder sb = new StringBuilder();
            if (i == 4) {
                str3 = "I ";
            } else if (i == 5) {
                str3 = "W ";
            } else {
                str3 = "  ";
            }
            sb.append(str3);
            sb.append(str);
            String sb2 = sb.toString();
            if (i == 4 || i == 5) {
                i2 = 6;
            } else {
                i2 = i;
            }
            Method method = f14408a;
            if (method != null) {
                try {
                    method.invoke(null, Integer.valueOf(i2), sb2, str2);
                    return;
                } catch (Throwable unused) {
                    f14408a = null;
                }
            }
            Log.println(i, sb2, str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final int[] f14409a = {0, 0, 0, 0, 1, 2, 3, 3, 3};
    }

    public static boolean a(int i) {
        return !f14407a && i <= 3;
    }

    public static void a(String str, String str2, Object... objArr) {
        if (!a(4)) {
            String a2 = a(str2, objArr);
            Throwable a3 = a(objArr);
            if (a3 != null) {
                a(4, str, a2, a3);
            } else {
                a(4, str, a2, null);
            }
        }
    }

    public static void a(int i, String str, String str2, Throwable th) {
        if (!a(i)) {
            if (i != 99) {
                int i2 = i == 99 ? 2 : i;
                a.a(i2, str, str2);
                if (th != null) {
                    a.a(i2, str, Log.getStackTraceString(th));
                }
            }
            if (KLogHandler.a()) {
                if (i == 99) {
                    i = 4;
                }
                KLogHandler.postLogMessage(System.currentTimeMillis(), Process.myPid(), Process.myTid(), b.f14409a[i], str, str2, th);
            }
        }
    }

    public static String a(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : String.format(Locale.getDefault(), str, objArr);
    }

    public static Throwable a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (!(obj instanceof Throwable)) {
            return null;
        }
        return (Throwable) obj;
    }
}
