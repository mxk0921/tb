package com.taobao.metrickit.context;

import android.app.Application;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.event.EventCenter;
import java.io.File;
import java.io.Serializable;
import tb.c21;
import tb.kw4;
import tb.mti;
import tb.rrl;
import tb.zfl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MetricContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String launchSession = String.valueOf(SystemClock.uptimeMillis());
    private static long processStartTime = -1;
    private Application application;
    private final Handler defaultInnerThreadHandler;
    private EventCenter eventCenter;
    private long launcherStartTime;
    private zfl outerCallbackDispatcher;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final MetricContext f11036a = new MetricContext();

        public MetricContext a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MetricContext) ipChange.ipc$dispatch("2165792d", new Object[]{this});
            }
            return this.f11036a;
        }

        public b b(Application application) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3d57c1a1", new Object[]{this, application});
            }
            MetricContext.access$102(this.f11036a, application);
            return this;
        }

        public b c(EventCenter eventCenter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b76f0d26", new Object[]{this, eventCenter});
            }
            MetricContext.access$302(this.f11036a, eventCenter);
            return this;
        }

        public b d(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4afaa81b", new Object[]{this, obj});
            }
            MetricContext.access$402(this.f11036a, rrl.f(obj, System.currentTimeMillis()) - (System.currentTimeMillis() - SystemClock.uptimeMillis()));
            return this;
        }

        public b e(zfl zflVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cd6dfc63", new Object[]{this, zflVar});
            }
            MetricContext.access$202(this.f11036a, zflVar);
            return this;
        }
    }

    public static /* synthetic */ Application access$102(MetricContext metricContext, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("77ca8d08", new Object[]{metricContext, application});
        }
        metricContext.application = application;
        return application;
    }

    public static /* synthetic */ zfl access$202(MetricContext metricContext, zfl zflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zfl) ipChange.ipc$dispatch("de8128cf", new Object[]{metricContext, zflVar});
        }
        metricContext.outerCallbackDispatcher = zflVar;
        return zflVar;
    }

    public static /* synthetic */ EventCenter access$302(MetricContext metricContext, EventCenter eventCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventCenter) ipChange.ipc$dispatch("90fa9d4e", new Object[]{metricContext, eventCenter});
        }
        metricContext.eventCenter = eventCenter;
        return eventCenter;
    }

    public static /* synthetic */ long access$402(MetricContext metricContext, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ad4c12f", new Object[]{metricContext, new Long(j)})).longValue();
        }
        metricContext.launcherStartTime = j;
        return j;
    }

    public static String getLaunchSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d23796c", new Object[0]);
        }
        return launchSession;
    }

    public Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return this.application;
    }

    public String getCurrActivityName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea92bb37", new Object[]{this});
        }
        return c21.g().getString("currActivityName", null);
    }

    public String getCurrActivitySimpleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee8902e5", new Object[]{this});
        }
        return c21.g().getString("currActivitySimpleName", null);
    }

    public String getCurrFragmentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33c4c716", new Object[]{this});
        }
        return c21.g().getString("currFragmentName", null);
    }

    public Handler getDefaultInnerHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("88478e40", new Object[]{this});
        }
        return this.defaultInnerThreadHandler;
    }

    public EventCenter getEventCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventCenter) ipChange.ipc$dispatch("9c50d627", new Object[]{this});
        }
        return this.eventCenter;
    }

    public long getLauncherStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ea9a5d4", new Object[]{this})).longValue();
        }
        return this.launcherStartTime;
    }

    public zfl getOuterCallbackScheduler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zfl) ipChange.ipc$dispatch("282bcc42", new Object[]{this});
        }
        return this.outerCallbackDispatcher;
    }

    public long getProcessStartTime() {
        long startUptimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[]{this})).longValue();
        }
        long j = processStartTime;
        if (j > 0) {
            return j;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            startUptimeMillis = Process.getStartUptimeMillis();
            processStartTime = startUptimeMillis;
            return startUptimeMillis;
        }
        File file = new File("/proc/" + kw4.pid + "/comm");
        if (!file.exists()) {
            return -1L;
        }
        long lastModified = file.lastModified();
        processStartTime = lastModified;
        return lastModified;
    }

    public String getSchemaUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("883e5ca1", new Object[]{this});
        }
        return c21.g().getString("currActivitySchemaUrl", null);
    }

    private MetricContext() {
        this.defaultInnerThreadHandler = mti.c().b();
    }

    public boolean isInBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e44ec488", new Object[]{this})).booleanValue();
        }
        return c21.g().getBoolean("isInBackground", false);
    }

    public boolean isCharging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f0538c6", new Object[]{this})).booleanValue();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            int intExtra = getApplication().registerReceiver(null, intentFilter).getIntExtra("plugged", -1);
            return (intExtra == 1) || (intExtra == 2) || (intExtra == 4);
        } catch (Exception unused) {
            return false;
        }
    }
}
