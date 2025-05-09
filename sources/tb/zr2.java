package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.CacheManager;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.ey1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f32963a;
        public final /* synthetic */ long b;

        /* compiled from: Taobao */
        /* renamed from: tb.zr2$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C1118a implements ey1.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1118a() {
            }

            @Override // tb.ey1.a
            public void a(CacheOverviewInfo cacheOverviewInfo, Map<String, Long> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bd39a5f0", new Object[]{this, cacheOverviewInfo, map});
                    return;
                }
                pmh.e().c(a.this.f32963a.getApplicationContext(), cacheOverviewInfo);
                new CacheManager(a.this.f32963a).d(cacheOverviewInfo, map);
                long currentTimeMillis = System.currentTimeMillis() - a.this.b;
                TLog.loge(yr2.MODULE, "CacheCleanerIdleTask", "finish.costTime=" + currentTimeMillis);
                s71.g(currentTimeMillis, hg4.j().v(), hg4.j().d());
            }
        }

        public a(Application application, long j) {
            this.f32963a = application;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!c21.g().getBoolean("isFullNewInstall", false) || new File(ey1.SWITCH_FILE_DIR, "cache_cleaner_monitor_auto_clear_new_install_off").exists()) {
                    new bt2(this.f32963a).d(new C1118a());
                    return;
                }
                jaq.d(this.f32963a, System.currentTimeMillis());
                TLog.loge(yr2.MODULE, "CacheCleanerIdleTask", "run: isFullNewInstall.monitor cancel.");
            } catch (Throwable th) {
                TLog.loge(yr2.MODULE, "CacheCleanerIdleTask", "run: monitor failed with exception" + th);
                s71.i("initExecuteError", th.getMessage());
            }
        }
    }

    static {
        t2o.a(737148997);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        TLog.loge(yr2.MODULE, "CacheCleanerIdleTask", "start");
        long currentTimeMillis = System.currentTimeMillis();
        hg4.j().m();
        s71.l();
        es2.a().execute(new a(application, currentTimeMillis));
    }
}
