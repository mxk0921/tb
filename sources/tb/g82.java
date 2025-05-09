package tb;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g82 implements h82 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static g82 b = null;

    /* renamed from: a  reason: collision with root package name */
    public long f19781a = 0;

    static {
        t2o.a(404750620);
        t2o.a(404750621);
    }

    public static synchronized g82 a() {
        synchronized (g82.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g82) ipChange.ipc$dispatch("3e3d3626", new Object[0]);
            }
            if (b == null) {
                b = new g82();
            }
            return b;
        }
    }

    @Override // tb.h82
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.h82
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // tb.h82
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // tb.h82
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // tb.h82
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.h82
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
            return;
        }
        this.f19781a = SystemClock.elapsedRealtime();
        cqv.h(f82.c(), f82.d());
    }

    @Override // tb.h82
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            return;
        }
        if (0 != this.f19781a && SystemClock.elapsedRealtime() - this.f19781a > m.CONFIG_TRACK_1022_INTERVAL_TIME) {
            uep.c();
        }
        cqv.g(f82.c(), f82.d());
        this.f19781a = 0L;
    }
}
