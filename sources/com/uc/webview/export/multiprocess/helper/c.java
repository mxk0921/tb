package com.uc.webview.export.multiprocess.helper;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14334a = false;
    private static String b = "u4proc";
    private static int c = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Method f14335a;

        static {
            try {
                f14335a = Class.forName("android.util.Log").getDeclaredMethod("println", Integer.TYPE, String.class, String.class);
            } catch (Throwable unused) {
            }
        }

        public static void a(int i, String str, String str2) {
            String str3;
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
                i = 6;
            }
            Method method = f14335a;
            if (method != null) {
                try {
                    method.invoke(null, Integer.valueOf(i), sb2, str2);
                    return;
                } catch (Throwable unused) {
                    f14335a = null;
                }
            }
            Log.println(i, sb2, str2);
        }
    }

    public static void a(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append(str.startsWith("Render") ? Integer.valueOf(i) : "");
        sb.append("]");
        sb.append(b);
        b = sb.toString();
        c = i2;
    }

    public static void b(String str, String str2) {
        a(5, str, str2, null);
    }

    public static void c(String str, String str2) {
        a(6, str, str2, null);
    }

    public static void b(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    public static void c(String str, String str2, Object... objArr) {
        if (!a(6)) {
            String a2 = a(str2, objArr);
            Throwable a3 = a(objArr);
            if (a3 != null) {
                b(str, a2, a3);
            } else {
                c(str, a2);
            }
        }
    }

    private static String a(String str, Object... objArr) {
        if (objArr == null) {
            return str;
        }
        try {
            return objArr.length != 0 ? String.format(Locale.getDefault(), str, objArr) : str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static void b(String str, String str2, Object... objArr) {
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

    private static Throwable a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (!(obj instanceof Throwable)) {
            return null;
        }
        return (Throwable) obj;
    }

    private static boolean a(int i) {
        return !f14334a && i <= 3;
    }

    private static void a(int i, String str, String str2, Throwable th) {
        if (!a(i)) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
            if (c > 0) {
                sb.append('[');
                sb.append(c);
                sb.append("] ");
            }
            sb.append(str);
            sb.append(' ');
            sb.append(str2);
            a.a(i, b, sb.toString());
            if (th != null) {
                a.a(i, b, Log.getStackTraceString(th));
            }
        }
    }

    public static void a(String str, String str2) {
        a(4, str, str2, null);
    }

    public static void a(String str, String str2, Throwable th) {
        a(5, str, str2, th);
    }

    public static void a(String str, String str2, Object... objArr) {
        if (!a(2)) {
            String a2 = a(str2, objArr);
            Throwable a3 = a(objArr);
            if (a3 != null) {
                a(2, str, a2, a3);
            } else {
                a(2, str, a2, null);
            }
        }
    }
}
