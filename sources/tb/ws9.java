package tb;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.autosize.orientation.FoldPosture;
import com.taobao.application.common.IApmEventListener;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ws9 implements FoldPosture.d, IApmEventListener, Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ws9 g;

    /* renamed from: a  reason: collision with root package name */
    public final Application f30889a;
    public volatile int d;
    public boolean f;
    public final Object b = new Object();
    public volatile long c = -1;
    public final Map<String, Object> e = new HashMap();

    public ws9(Application application) {
        this.f = false;
        this.f30889a = application;
        this.d = TBDeviceUtils.a(application);
        this.f = TBDeviceUtils.D(TBAutoSizeConfig.x().y());
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[0]);
        } else if (g != null) {
            DimensionSet create = DimensionSet.create();
            create.addDimension("ues_type");
            create.addDimension("cost");
            create.addDimension("isInMagicWindowMode");
            AppMonitor.register("auto_size", "auto_size_device_fold_use_stat", MeasureSet.create(), create);
            for (Map.Entry entry : ((HashMap) g.e).entrySet()) {
                if (!"isInMagicWindowMode".equals(entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getKey()) && entry.getValue() != null) {
                    DimensionValueSet create2 = DimensionValueSet.create();
                    create2.setValue("ues_type", (String) entry.getKey());
                    create2.setValue("cost", String.valueOf(entry.getValue()));
                    create2.setValue("isInMagicWindowMode", String.valueOf(((HashMap) g.e).get("isInMagicWindowMode")));
                    AppMonitor.Stat.commit("auto_size", "auto_size_device_fold_use_stat", create2, MeasureValueSet.create());
                }
            }
        }
    }

    public static void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        ws9 ws9Var = new ws9(application);
        c21.c(ws9Var);
        FoldPosture.c(application, ws9Var);
        application.registerActivityLifecycleCallbacks(ws9Var);
        g = ws9Var;
        ws9Var.f();
    }

    @Override // com.taobao.android.autosize.orientation.FoldPosture.d
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8040ae11", new Object[]{this, str});
        } else {
            c(str);
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14177dda", new Object[]{this, str});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("foldStatus");
        create.addDimension("isInMagicWindowMode");
        AppMonitor.register("auto_size", "auto_size_status_changed", MeasureSet.create(), create);
        DimensionValueSet create2 = DimensionValueSet.create();
        create2.setValue("foldStatus", str);
        create2.setValue("isInMagicWindowMode", String.valueOf(this.f));
        AppMonitor.Stat.commit("auto_size", "auto_size_status_changed", create2, MeasureValueSet.create());
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("foldStatus", str);
        TLog.loge("TBAutoSize.FoldStatusStat", "commitStatus foldStatus=" + str + " isInMagicWindowMode=" + this.f);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d5b70c", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            try {
                if (this.c > 0) {
                    SharedPreferences sharedPreferences = this.f30889a.getSharedPreferences("AutoSizeFoldStatusStat", 0);
                    String f = FoldPosture.f(this.d);
                    sharedPreferences.edit().putLong(f, (SystemClock.uptimeMillis() - this.c) + sharedPreferences.getLong(f, 0L)).apply();
                    TLog.loge("TBAutoSize.FoldStatusStat", "increase use time, " + f + "=" + (SystemClock.uptimeMillis() - this.c) + "ms isInMagicWindowMode=" + sharedPreferences.getString("isInMagicWindowMode", "false"));
                    this.c = -1L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d1cea6b", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.f30889a.getSharedPreferences("AutoSizeFoldStatusStat", 0);
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null) {
            ((HashMap) this.e).putAll(all);
        }
        sharedPreferences.edit().clear().apply();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2327922", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            this.d = TBDeviceUtils.a(this.f30889a);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b57854", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            this.c = SystemClock.uptimeMillis();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        boolean D = TBDeviceUtils.D(activity);
        if (!this.f && D) {
            this.f = true;
        }
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("isInMagicWindowMode", String.valueOf(this.f));
        String f = FoldPosture.f(TBDeviceUtils.a(activity));
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("foldStatus", f);
        TLog.loge("TBAutoSize.FoldStatusStat", "onActivityCreated foldStatus=" + f + " isInMagicWindowMode=" + this.f);
    }

    @Override // com.taobao.android.autosize.orientation.FoldPosture.d
    public void onChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f89f76", new Object[]{this});
            return;
        }
        e();
        h();
        g();
    }

    @Override // com.taobao.application.common.IApmEventListener
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (2 == i) {
            h();
            g();
        } else if (1 == i) {
            e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        SharedPreferences sharedPreferences = this.f30889a.getSharedPreferences("AutoSizeFoldStatusStat", 0);
        boolean D = TBDeviceUtils.D(activity);
        String string = sharedPreferences.getString("isInMagicWindowMode", "false");
        if ("false".equals(string) && D) {
            string = "true";
        }
        sharedPreferences.edit().putString("isInMagicWindowMode", string).apply();
        try {
            this.f = Boolean.parseBoolean(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String f = FoldPosture.f(TBDeviceUtils.a(activity));
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("isInMagicWindowMode", string);
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("foldStatus", f);
        TLog.loge("TBAutoSize.FoldStatusStat", "onActivityResumed foldStatus=" + f + " isInMagicWindowMode=" + string);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
