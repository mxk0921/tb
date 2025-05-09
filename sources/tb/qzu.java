package tb;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qzu implements tzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qzu b = new qzu();

    /* renamed from: a  reason: collision with root package name */
    public long f27026a = 0;

    static {
        t2o.a(962593304);
        t2o.a(962593305);
    }

    public static qzu getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzu) ipChange.ipc$dispatch("35b10743", new Object[0]);
        }
        return b;
    }

    @Override // tb.tzu
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.tzu
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.tzu
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
        } else {
            this.f27026a = SystemClock.elapsedRealtime();
        }
    }

    @Override // tb.tzu
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            return;
        }
        if (0 != this.f27026a && SystemClock.elapsedRealtime() - this.f27026a > m.CONFIG_TRACK_1022_INTERVAL_TIME) {
            nhh.f("", "sessionTimeout");
            UTAnalytics.getInstance().sessionTimeout();
        }
        this.f27026a = 0L;
    }
}
