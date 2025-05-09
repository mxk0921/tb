package tb;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p1v implements uzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final p1v c = new p1v();

    /* renamed from: a  reason: collision with root package name */
    public long f25822a = 0;
    public long b = 0;

    static {
        t2o.a(962593164);
        t2o.a(962593306);
    }

    public static p1v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1v) ipChange.ipc$dispatch("ca414d28", new Object[0]);
        }
        return c;
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b25fef", new Object[]{this, new Long(j)});
        } else if (!wu3.c().f()) {
            long j2 = 0;
            if (j > 0) {
                if (0 != this.b) {
                    j2 = SystemClock.elapsedRealtime() - this.b;
                }
                szu szuVar = new szu("UT", 1010, String.valueOf(j), String.valueOf(j2), null, null);
                szuVar.setProperty("_priority", "5");
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                if (defaultTracker != null) {
                    defaultTracker.send(szuVar.build());
                } else {
                    nhh.f("Record app display event error", "Fatal Error,must call setRequestAuthentication method first.");
                }
            }
        }
    }

    @Override // tb.uzu, tb.tzu
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.uzu, tb.tzu
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            c2v.getInstance().pageDestroyed(activity);
        }
    }

    @Override // tb.uzu, tb.tzu
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            c2v.getInstance().pageDisAppearByAuto(activity);
        }
    }

    @Override // tb.uzu, tb.tzu
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            c2v.getInstance().pageAppearByAuto(activity);
        }
    }

    @Override // tb.uzu, tb.tzu
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.uzu, tb.tzu
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // tb.uzu, tb.tzu
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // tb.uzu, tb.tzu
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
        } else {
            c2v.getInstance().pageSwitchBackground();
        }
    }

    @Override // tb.uzu
    public void onSwitchBackgroundDelay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a081a09", new Object[]{this});
            return;
        }
        a(SystemClock.elapsedRealtime() - this.f25822a);
        this.b = SystemClock.elapsedRealtime();
        AnalyticsMgr.I();
        AnalyticsMgr.S();
    }

    @Override // tb.uzu, tb.tzu
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            return;
        }
        this.f25822a = SystemClock.elapsedRealtime();
        AnalyticsMgr.T();
    }
}
