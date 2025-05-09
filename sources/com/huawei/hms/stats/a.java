package com.huawei.hms.stats;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    private static final a f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Object f5467a = new Object();
    private boolean b = false;
    private final List<Runnable> c = new ArrayList();
    private final Handler d = new Handler(Looper.getMainLooper());
    private final Runnable e = new RunnableC0269a();

    /* compiled from: Taobao */
    /* renamed from: com.huawei.hms.stats.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class RunnableC0269a implements Runnable {
        public RunnableC0269a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AnalyticsCacheManager", "Timeout execCacheBi.");
            if (!HiAnalyticsUtils.getInstance().getInitFlag()) {
                a.this.a();
            } else {
                a.this.b();
            }
        }
    }

    private a() {
    }

    public static a c() {
        return f;
    }

    public void a(Runnable runnable) {
        synchronized (this.f5467a) {
            try {
                if (runnable != null) {
                    if (!this.b) {
                        if (this.c.size() < 60) {
                            this.c.add(runnable);
                            this.d.removeCallbacks(this.e);
                            this.d.postDelayed(this.e, 10000L);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.f5467a) {
            HMSLog.i("AnalyticsCacheManager", "execCacheBi: cache size: " + this.c.size());
            this.b = true;
            Iterator<Runnable> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().run();
                it.remove();
            }
            this.b = false;
        }
    }

    public void a() {
        synchronized (this.f5467a) {
            HMSLog.i("AnalyticsCacheManager", "clear AnalyticsCache.");
            this.c.clear();
        }
    }
}
