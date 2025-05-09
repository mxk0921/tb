package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eau implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static eau d;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f18431a;
    public final String b;
    public final String c;

    static {
        t2o.a(779092396);
    }

    public eau(Activity activity, String str, String str2) {
        this.f18431a = new WeakReference<>(activity);
        this.b = str;
        this.c = str2;
        gq0.g().getApplication().registerActivityLifecycleCallbacks(this);
    }

    public static void d(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30df5d73", new Object[]{activity, str, str2});
            return;
        }
        e();
        if (activity != null && !activity.isDestroyed()) {
            d = new eau(activity, str, str2);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadd7ed", new Object[0]);
            return;
        }
        eau eauVar = d;
        if (eauVar != null) {
            eauVar.c();
        }
    }

    public final boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("363d1a14", new Object[]{this, activity})).booleanValue();
        }
        if (!b() || !this.f18431a.get().equals(activity)) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57920314", new Object[]{this})).booleanValue();
        }
        WeakReference<Activity> weakReference = this.f18431a;
        if (weakReference != null && weakReference.get() != null && !this.f18431a.get().isDestroyed()) {
            return true;
        }
        c();
        return false;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        gq0.g().getApplication().unregisterActivityLifecycleCallbacks(this);
        this.f18431a = null;
        d = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else if (a(activity)) {
            c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else if (a(activity)) {
            rbu.E(null, this.f18431a.get());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else if (a(activity)) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.f18431a.get());
            Map map = !TextUtils.isEmpty(this.c) ? (Map) fkx.f(this.c, Map.class) : null;
            if (map == null) {
                map = new HashMap();
            }
            if (!pvs.M0() || !up6.r0(vx9.d())) {
                map.put("spm-url", "a2141.8001249");
            } else {
                map.put("spm-url", "a2141.23201685");
            }
            rbu.m0(null, this.f18431a.get(), this.b);
            rbu.n0(this.f18431a.get(), map);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }
}
