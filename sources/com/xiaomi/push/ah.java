package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ah {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ah f14750a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f719a;

    /* renamed from: a  reason: collision with other field name */
    private ScheduledThreadPoolExecutor f722a = new ScheduledThreadPoolExecutor(1);

    /* renamed from: a  reason: collision with other field name */
    private Map<String, ScheduledFuture> f721a = new HashMap();

    /* renamed from: a  reason: collision with other field name */
    private Object f720a = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class a implements Runnable {
        /* renamed from: a */
        public abstract String mo607a();
    }

    private ah(Context context) {
        this.f719a = context.getSharedPreferences("mipush_extra", 0);
    }

    public boolean b(a aVar, int i) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> schedule = this.f722a.schedule(new aj(this, aVar), i, TimeUnit.SECONDS);
        synchronized (this.f720a) {
            this.f721a.put(aVar.mo607a(), schedule);
        }
        return true;
    }

    public static ah a(Context context) {
        if (f14750a == null) {
            synchronized (ah.class) {
                try {
                    if (f14750a == null) {
                        f14750a = new ah(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14750a;
    }

    private static String a(String str) {
        return "last_job_time" + str;
    }

    private ScheduledFuture a(a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f720a) {
            scheduledFuture = this.f721a.get(aVar.mo607a());
        }
        return scheduledFuture;
    }

    public void a(Runnable runnable) {
        a(runnable, 0);
    }

    public void a(Runnable runnable, int i) {
        this.f722a.schedule(runnable, i, TimeUnit.SECONDS);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m482a(a aVar) {
        return b(aVar, 0);
    }

    public boolean a(a aVar, int i) {
        return a(aVar, i, 0);
    }

    public boolean a(a aVar, int i, int i2) {
        return a(aVar, i, i2, false);
    }

    public boolean a(a aVar, int i, int i2, boolean z) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        String a2 = a(aVar.mo607a());
        ai aiVar = new ai(this, aVar, z, a2);
        if (!z) {
            long abs = Math.abs(System.currentTimeMillis() - this.f719a.getLong(a2, 0L)) / 1000;
            if (abs < i - i2) {
                i2 = (int) (i - abs);
            }
        }
        try {
            ScheduledFuture<?> scheduleAtFixedRate = this.f722a.scheduleAtFixedRate(aiVar, i2, i, TimeUnit.SECONDS);
            synchronized (this.f720a) {
                this.f721a.put(aVar.mo607a(), scheduleAtFixedRate);
            }
            return true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return true;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m483a(String str) {
        synchronized (this.f720a) {
            try {
                ScheduledFuture scheduledFuture = this.f721a.get(str);
                if (scheduledFuture == null) {
                    return false;
                }
                this.f721a.remove(str);
                return scheduledFuture.cancel(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        a f14751a;

        public b(a aVar) {
            this.f14751a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
            this.f14751a.run();
            b();
        }

        public void a() {
        }

        public void b() {
        }
    }
}
