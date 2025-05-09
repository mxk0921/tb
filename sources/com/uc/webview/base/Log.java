package com.uc.webview.base;

import com.uc.webview.base.klog.KLogHandler;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class Log {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f14253a;
    private static volatile a b = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final Method[] f14255a = null;

        public static void a(com.uc.webview.base.klog.a aVar) {
            String str = aVar.g;
            android.util.Log.e(str, "[InfoLevelMessage] " + aVar.h, aVar.i);
        }

        public static void a(String str, String str2, Throwable th) {
            android.util.Log.e("ucbs.".concat(String.valueOf(str)), "[InfoLevelMessage] ".concat(String.valueOf(str2)), th);
        }
    }

    public static boolean a() {
        return KLogHandler.a();
    }

    public static void d(String str, String str2) {
        d(str, str2, null);
    }

    public static void e(String str, String str2) {
        e(str, str2, null);
    }

    public static void i(String str, String str2) {
        i(str, str2, null);
    }

    public static void rInfo(String str, String str2) {
        rInfo(str, str2, null);
    }

    public static void w(String str, String str2) {
        w(str, str2, null);
    }

    private static void a(int i, String str, String str2, Throwable th) {
        com.uc.webview.base.klog.a aVar = new com.uc.webview.base.klog.a(i, "ucbs.".concat(String.valueOf(str)), str2, th);
        if (b != null) {
            b.a(aVar);
        }
        if (f14253a != null) {
            b.a(aVar);
        }
        KLogHandler.a(aVar);
    }

    public static void d(String str, String str2, Throwable th) {
        a(1, str, str2, th);
    }

    public static void e(String str, String str2, Throwable th) {
        a(3, str, str2, th);
    }

    public static void i(String str, String str2, Throwable th) {
        a(1, str, str2, th);
    }

    public static void rInfo(String str, String str2, Throwable th) {
        a(1, str, str2, th);
        b.a(str, str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        a(2, str, str2, th);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private LinkedList<com.uc.webview.base.klog.a> f14254a = new LinkedList<>();

        private void b() {
            while (this.f14254a.size() > 460) {
                this.f14254a.pop();
            }
        }

        public final void a(com.uc.webview.base.klog.a aVar) {
            synchronized (this) {
                try {
                    LinkedList<com.uc.webview.base.klog.a> linkedList = this.f14254a;
                    if (linkedList != null) {
                        if (linkedList.size() > 512) {
                            b();
                        }
                        this.f14254a.add(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final LinkedList<com.uc.webview.base.klog.a> a() {
            LinkedList<com.uc.webview.base.klog.a> linkedList;
            synchronized (this) {
                linkedList = this.f14254a;
                this.f14254a = null;
            }
            return linkedList;
        }
    }

    public static String a(long j) {
        return com.uc.webview.base.klog.a.a(j);
    }

    public static String a(Throwable th) {
        return com.uc.webview.base.klog.a.a(th);
    }

    public static void a(StringBuilder sb) {
        synchronized (Log.class) {
            try {
                if (b != null) {
                    LinkedList<com.uc.webview.base.klog.a> a2 = b.a();
                    if (a2 != null) {
                        Iterator<com.uc.webview.base.klog.a> it = a2.iterator();
                        while (it.hasNext()) {
                            sb.append(it.next().toString());
                            sb.append("\n");
                        }
                    }
                    b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(boolean z) {
        if (z && f14253a == null) {
            f14253a = new b();
        } else if (!z && f14253a != null) {
            f14253a = null;
        }
    }

    public static String a(String str) {
        if (str == null || str.length() <= 6) {
            return str;
        }
        return str.substring(0, 6) + "...";
    }

    public static void b() {
    }
}
