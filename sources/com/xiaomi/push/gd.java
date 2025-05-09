package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.fz;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;
import java.util.Hashtable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gd {

    /* renamed from: a  reason: collision with root package name */
    private static final int f14898a = ft.PING_RTT.a();

    /* renamed from: a  reason: collision with other field name */
    private static long f1030a = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static Hashtable<Integer, Long> f14899a = new Hashtable<>();
    }

    public static void a() {
        if (f1030a == 0 || SystemClock.elapsedRealtime() - f1030a > 7200000) {
            f1030a = SystemClock.elapsedRealtime();
            a(0, f14898a);
        }
    }

    public static void b() {
        a(0, f14898a, null, -1);
    }

    public static void a(int i) {
        fu a2 = gb.m710a().m712a();
        a2.a(ft.CHANNEL_STATS_COUNTER.a());
        a2.c(i);
        gb.m710a().a(a2);
    }

    public static void b(String str, Exception exc) {
        try {
            fz.a d = fz.d(exc);
            fu a2 = gb.m710a().m712a();
            a2.a(d.f14891a.a());
            a2.c(d.f1017a);
            a2.b(str);
            if (!(gb.a() == null || gb.a().f1022a == null)) {
                a2.c(bg.c(gb.a().f1022a) ? 1 : 0);
            }
            gb.m710a().a(a2);
        } catch (NullPointerException unused) {
        }
    }

    public static synchronized void a(int i, int i2) {
        synchronized (gd.class) {
            try {
                if (i2 < 16777215) {
                    a.f14899a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
                } else {
                    b.d("stats key should less than 16777215");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(int i, int i2, int i3, String str, int i4) {
        fu a2 = gb.m710a().m712a();
        a2.a((byte) i);
        a2.a(i2);
        a2.b(i3);
        a2.b(str);
        a2.c(i4);
        gb.m710a().a(a2);
    }

    public static synchronized void a(int i, int i2, String str, int i3) {
        synchronized (gd.class) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                int i4 = (i << 24) | i2;
                if (a.f14899a.containsKey(Integer.valueOf(i4))) {
                    fu a2 = gb.m710a().m712a();
                    a2.a(i2);
                    a2.b((int) (currentTimeMillis - a.f14899a.get(Integer.valueOf(i4)).longValue()));
                    a2.b(str);
                    if (i3 > -1) {
                        a2.c(i3);
                    }
                    gb.m710a().a(a2);
                    a.f14899a.remove(Integer.valueOf(i2));
                } else {
                    b.d("stats key not found");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(XMPushService xMPushService, bf.b bVar) {
        new fw(xMPushService, bVar).a();
    }

    public static void a(String str, int i, Exception exc) {
        fu a2 = gb.m710a().m712a();
        if (!(gb.a() == null || gb.a().f1022a == null)) {
            a2.c(bg.c(gb.a().f1022a) ? 1 : 0);
        }
        if (i > 0) {
            a2.a(ft.GSLB_REQUEST_SUCCESS.a());
            a2.b(str);
            a2.b(i);
            gb.m710a().a(a2);
            return;
        }
        try {
            fz.a a3 = fz.a(exc);
            a2.a(a3.f14891a.a());
            a2.c(a3.f1017a);
            a2.b(str);
            gb.m710a().a(a2);
        } catch (NullPointerException unused) {
        }
    }

    public static void a(String str, Exception exc) {
        try {
            fz.a b = fz.b(exc);
            fu a2 = gb.m710a().m712a();
            a2.a(b.f14891a.a());
            a2.c(b.f1017a);
            a2.b(str);
            if (!(gb.a() == null || gb.a().f1022a == null)) {
                a2.c(bg.c(gb.a().f1022a) ? 1 : 0);
            }
            gb.m710a().a(a2);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static byte[] m716a() {
        fv a2 = gb.m710a().m713a();
        if (a2 != null) {
            return jm.a(a2);
        }
        return null;
    }
}
