package com.uc.webview.base.timing;

import com.uc.webview.base.Log;
import com.uc.webview.base.f;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a implements ITimingTracer {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14293a = true;
    public static boolean b;
    private final ConcurrentHashMap<Integer, Object> c;

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.base.timing.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0834a {

        /* renamed from: a  reason: collision with root package name */
        static final a f14294a = new a((byte) 0);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public C0835a f14296a;
        public C0835a b;

        /* compiled from: Taobao */
        /* renamed from: com.uc.webview.base.timing.a$c$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C0835a {

            /* renamed from: a  reason: collision with root package name */
            public final long f14297a = System.currentTimeMillis();

            public C0835a() {
            }
        }

        public final synchronized c a() {
            if (this.f14296a == null) {
                this.f14296a = new C0835a();
            }
            return this;
        }

        public final synchronized c b() {
            if (this.b == null) {
                this.b = new C0835a();
            }
            return this;
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public static Object a(int i) {
        if (f14293a) {
            return C0834a.f14294a.c.get(Integer.valueOf(i));
        }
        return null;
    }

    public static boolean b(int i) {
        return a(i) != null;
    }

    public static void c(int i) {
        if (f14293a) {
            b().mark(i);
        }
    }

    @Override // com.uc.webview.base.timing.ITimingTracer
    public final void mark(int i) {
        ConcurrentHashMap<Integer, Object> concurrentHashMap;
        if (f14293a && (concurrentHashMap = this.c) != null && !concurrentHashMap.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i), new c().a());
        }
    }

    @Override // com.uc.webview.base.timing.ITimingTracer
    public final void markBegin(int i) {
        if (f14293a) {
            mark(i);
        }
    }

    @Override // com.uc.webview.base.timing.ITimingTracer
    public final void markEnd(int i) {
        ConcurrentHashMap<Integer, Object> concurrentHashMap;
        c cVar;
        if (f14293a && (concurrentHashMap = this.c) != null && (cVar = (c) concurrentHashMap.get(Integer.valueOf(i))) != null) {
            cVar.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static Method f14295a;
        private static Method b;

        public static void a(String str) {
            if (a.b) {
                try {
                    Method method = f14295a;
                    if (method != null) {
                        method.invoke(null, 1L, str);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        static {
            boolean z = a.b;
            if (z && z) {
                try {
                    Class<?> cls = Class.forName("android.os.Trace");
                    Class cls2 = Long.TYPE;
                    f14295a = f.a(cls, "traceBegin", cls2, String.class);
                    b = f.a(cls, "traceEnd", cls2);
                } catch (Throwable th) {
                    Log.e("Timing", "initTraceMethod falied", th);
                }
            }
        }

        public static void a() {
            if (a.b) {
                try {
                    Method method = b;
                    if (method != null) {
                        method.invoke(null, 1L);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private a() {
        this.c = f14293a ? new ConcurrentHashMap<>() : null;
        if (f14293a) {
            mark(StartupTimingKeys.START);
        }
    }

    public static void a(c cVar) {
        ConcurrentHashMap<Integer, Object> concurrentHashMap;
        if (f14293a) {
            a b2 = b();
            if (f14293a && (concurrentHashMap = b2.c) != null && !concurrentHashMap.containsKey(Integer.valueOf((int) StartupTimingKeys.FIRST_EXPORT_WEBVIEW))) {
                b2.c.put(Integer.valueOf((int) StartupTimingKeys.FIRST_EXPORT_WEBVIEW), cVar);
            }
        }
    }

    public static a b() {
        if (!f14293a) {
            return null;
        }
        return C0834a.f14294a;
    }

    @Override // com.uc.webview.base.timing.ITimingTracer
    public final void mark(int i, String str) {
        ConcurrentHashMap<Integer, Object> concurrentHashMap;
        if (f14293a && (concurrentHashMap = this.c) != null && str != null && !concurrentHashMap.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i), str);
        }
    }

    public static void a(int i, long j) {
        if (f14293a) {
            b().mark(i, String.valueOf(j));
        }
    }

    public static void a(int i, String str) {
        if (f14293a) {
            b().mark(i, str);
        }
    }

    public static void a(String str) {
        if (b) {
            b.a(str);
        }
    }

    public static void a() {
        if (b) {
            b.a();
        }
    }
}
