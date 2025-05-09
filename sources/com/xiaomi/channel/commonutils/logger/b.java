package com.xiaomi.channel.commonutils.logger;

import android.content.Context;
import android.os.Process;
import com.xiaomi.push.j;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static int f14680a = 2;

    /* renamed from: a  reason: collision with other field name */
    private static Context f632a;

    /* renamed from: a  reason: collision with other field name */
    private static boolean f638a;

    /* renamed from: b  reason: collision with other field name */
    private static boolean f639b;

    /* renamed from: a  reason: collision with other field name */
    private static String f635a = "XMPush-" + Process.myPid();

    /* renamed from: a  reason: collision with other field name */
    private static LoggerInterface f633a = new a();

    /* renamed from: a  reason: collision with other field name */
    private static final HashMap<Integer, Long> f636a = new HashMap<>();
    private static final HashMap<Integer, String> b = new HashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private static final Integer f634a = -1;

    /* renamed from: a  reason: collision with other field name */
    private static AtomicInteger f637a = new AtomicInteger(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements LoggerInterface {

        /* renamed from: a  reason: collision with root package name */
        private String f14681a = b.f635a;

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str) {
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void setTag(String str) {
            this.f14681a = str;
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str, Throwable th) {
        }
    }

    public static int a() {
        return f14680a;
    }

    private static String b() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    public static void c(String str) {
        if (m415a(0)) {
            a(1, m409a(str));
        }
    }

    public static void d(String str) {
        if (m415a(4)) {
            a(4, m409a(str));
        }
    }

    public static void e(String str) {
        if (!f638a) {
            m409a(str);
            if (f639b) {
                return;
            }
        }
        m410a(str);
    }

    public static Integer a(String str) {
        if (f14680a > 1) {
            return f634a;
        }
        Integer valueOf = Integer.valueOf(f637a.incrementAndGet());
        f636a.put(valueOf, Long.valueOf(System.currentTimeMillis()));
        b.put(valueOf, str);
        LoggerInterface loggerInterface = f633a;
        loggerInterface.log(str + " starts");
        return valueOf;
    }

    private static String b(String str, String str2) {
        return b() + a(str, str2);
    }

    public static void c(String str, String str2) {
        if (!f638a) {
            b(str, str2);
            if (f639b) {
                return;
            }
        }
        m411a(str, str2);
    }

    public static void b(String str) {
        if (m415a(0)) {
            a(0, m409a(str));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static String m409a(String str) {
        return b() + str;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static void m416b(String str, String str2) {
        if (m415a(1)) {
            a(1, b(str, str2));
        }
    }

    public static String a(String str, String str2) {
        return "[" + str + "] " + str2;
    }

    public static void b(String str, Object... objArr) {
        if (m415a(1)) {
            a(1, a(str, objArr));
        }
    }

    private static String a(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder("[Tid:");
        sb.append(Thread.currentThread().getId());
        sb.append("] [");
        sb.append(str);
        sb.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    private static String a(Object... objArr) {
        StringBuilder sb = new StringBuilder("[Tid:");
        sb.append(Thread.currentThread().getId());
        sb.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static void a(int i) {
        if (i < 0 || i > 5) {
            a(2, "set log level as " + i);
        }
        f14680a = i;
    }

    public static void a(int i, String str) {
        if (i >= f14680a) {
            f633a.log(str);
        } else if (m414a()) {
            StringBuilder sb = new StringBuilder("-->log(");
            sb.append(i);
            sb.append("): ");
            sb.append(str);
        }
    }

    public static void a(int i, String str, Throwable th) {
        if (i >= f14680a) {
            f633a.log(str, th);
        } else if (m414a()) {
            StringBuilder sb = new StringBuilder("-->log(");
            sb.append(i);
            sb.append("): ");
            sb.append(str);
        }
    }

    public static void a(int i, Throwable th) {
        if (i >= f14680a) {
            f633a.log("", th);
        } else if (m414a()) {
            StringBuilder sb = new StringBuilder("-->log(");
            sb.append(i);
            sb.append("): ");
        }
    }

    public static void a(Context context) {
        f632a = context;
        if (j.m869a(context)) {
            f638a = true;
        }
        if (j.m868a()) {
            f639b = true;
        }
    }

    public static void a(LoggerInterface loggerInterface) {
        f633a = loggerInterface;
    }

    public static void a(Integer num) {
        if (f14680a <= 1) {
            HashMap<Integer, Long> hashMap = f636a;
            if (hashMap.containsKey(num)) {
                long currentTimeMillis = System.currentTimeMillis() - hashMap.remove(num).longValue();
                LoggerInterface loggerInterface = f633a;
                loggerInterface.log(b.remove(num) + " ends in " + currentTimeMillis + " ms");
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m410a(String str) {
        if (m415a(2)) {
            a(2, m409a(str));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m411a(String str, String str2) {
        if (m415a(2)) {
            a(2, b(str, str2));
        }
    }

    public static void a(String str, Throwable th) {
        if (m415a(4)) {
            a(4, m409a(str), th);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m412a(String str, Object... objArr) {
        if (m415a(2)) {
            a(2, a(str, objArr));
        }
    }

    public static void a(Throwable th) {
        if (m415a(4)) {
            a(4, th);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m413a(Object... objArr) {
        if (m415a(4)) {
            a(4, a(objArr));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m414a() {
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m415a(int i) {
        return i >= f14680a || m414a();
    }
}
