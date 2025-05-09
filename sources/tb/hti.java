package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.MetricKitPlugin;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import tb.eti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hti {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements ydd<String, Integer, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yw4 f20889a;

        public a(yw4 yw4Var) {
            this.f20889a = yw4Var;
        }

        /* renamed from: b */
        public Void a(String str, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("246ee4cb", new Object[]{this, str, num});
            }
            this.f20889a.n(str, num.intValue());
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements ydd<String, String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c0c f20890a;

        public b(Application application) {
            this.f20890a = new gc9(application, "metaData", c0c.LAUNCH_SESSION);
        }

        /* renamed from: b */
        public Void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("1096562e", new Object[]{this, str, str2});
            }
            ((gc9) this.f20890a).c().putString(str, str2).commit();
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements eti.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f20891a;
            public final /* synthetic */ eti.a b;

            public a(int i, eti.a aVar) {
                this.f20891a = i;
                this.b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    EventCenter.f().c(this.f20891a, this.b);
                }
            }
        }

        public void a(int i, eti.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60ac4090", new Object[]{this, new Integer(i), aVar});
            } else {
                mti.c().b().post(new a(i, aVar));
            }
        }
    }

    public static MetricContext b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetricContext) ipChange.ipc$dispatch("25f361f4", new Object[]{application, hashMap});
        }
        return new MetricContext.b().b(application).e(new zfl()).c(EventCenter.f()).d(hashMap.get("launchStartTime")).a();
    }

    public static void c(final Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        l1r.g(application);
        kw4.g(application);
        mti.c().b().post(new Runnable() { // from class: tb.gti
            @Override // java.lang.Runnable
            public final void run() {
                hti.i(application, hashMap);
            }
        });
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a37ee9", new Object[0]);
            return;
        }
        try {
            fsw.i(MetricKitPlugin.NAME, MetricKitPlugin.class, false);
        } catch (Exception e) {
            TLog.loge("MetricKit", "请检查是否缺少WindVane依赖", e);
        }
    }

    public static void e(Application application, MetricContext metricContext, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb9f62a", new Object[]{application, metricContext, new Long(j), new Integer(i)});
            return;
        }
        File file = new File(gc9.n(application) + gc9.m(c0c.SIMPLE_DATE_FORMAT.format(new Date()), j));
        if (Build.VERSION.SDK_INT >= 30 && j != -1 && file.exists()) {
            new y41(metricContext, new gc9(application, "applicationExitMetrics", j), new da1(application, i));
        }
    }

    public static void f(Application application, MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1d6404", new Object[]{application, metricContext});
            return;
        }
        new a51(metricContext, new daq(application, "applicationTimeMetrics"), new i91());
        new dli(metricContext, new daq(application, "memoryMetrics"), new daq(application, "gcMetrics"), new xki(application));
        fjn fjnVar = new fjn(metricContext.getDefaultInnerHandler());
        hjn.a().b(fjnVar);
        new tkg(metricContext, new daq(application, "gcMetrics"), fjnVar);
        yw4 yw4Var = new yw4(application.getPackageName(), metricContext.getDefaultInnerHandler());
        vw4.b(new a(yw4Var));
        new tw4(metricContext, new daq(application, "cpuMetrics"), yw4Var);
        if (l1r.h(l1r.SWITCH_CPU_LOAD_ABNORMAL_METRIC)) {
            new iw4(metricContext, new daq(application, "cpuMetrics"), new gw4(application, metricContext.getDefaultInnerHandler()));
        }
        if (l1r.h(l1r.SWITCH_BLOCK_STACK_METRIC)) {
            new sf2(metricContext, new ny6());
        }
        new njm(metricContext, new daq(application, "batteryMetrics"), new n52(application));
        if (l1r.h(l1r.SWITCH_BATTERY_HARDWARE_STAT_METRIC)) {
            new r52(metricContext, new daq(application, "batteryMetrics"), new ny6());
        }
        new cmm(metricContext, new daq(application, "metaData"), new ny6());
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2a25", new Object[0]);
        } else {
            eti.b(new c());
        }
    }

    public static void h(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c079e050", new Object[]{application});
        } else {
            fti.a(new b(application));
        }
    }

    public static /* synthetic */ void i(Application application, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fc6998", new Object[]{application, hashMap});
            return;
        }
        long f = daq.f(application);
        int g = daq.g(application);
        pua.a(hashMap);
        d();
        MetricContext b2 = b(application, hashMap);
        j(application, f);
        f(application, b2);
        h(application);
        g();
        e(application, b2, f, g);
        el9.b(application, b2, f, g);
        r7o.a(application, null);
        EventCenter.f().k(b2);
    }

    public static void j(Application application, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82784e91", new Object[]{application, new Long(j)});
            return;
        }
        SharedPreferences i = daq.i(application);
        if (j != -1) {
            new gc9(application, gc9.KEY_PATH_SAVE_TYPE, j).c().e(i.getAll()).commit();
        }
        i.edit().clear().commit();
    }
}
