package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.autosize.lifecycle.TBAutoSizeFragmentLifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e7r implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeakReference<Activity> b = null;
    public final List<Activity> c = new ArrayList();
    public volatile boolean d = false;
    public boolean e = true;

    /* renamed from: a  reason: collision with root package name */
    public final TBAutoSizeFragmentLifecycleCallback f18345a = new TBAutoSizeFragmentLifecycleCallback();

    public Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("323f0ab1", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        if (TBAutoSizeConfig.x().r() == null || !TBAutoSizeConfig.x().r().contains(activity.getClass().getName())) {
            d7r.j(activity, TBAutoSizeConfig.x().t(), (int) (activity.getResources().getDisplayMetrics().widthPixels / TBAutoSizeConfig.x().t()));
        } else {
            if (activity instanceof FragmentActivity) {
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.f18345a, true);
            }
            d7r.b(activity, TBAutoSizeConfig.x().s(), true);
        }
        if (this.e) {
            this.e = false;
            TBDeviceUtils.p(activity);
            TBDeviceUtils.m(activity);
            TBDeviceUtils.P(activity);
        }
        if (TBDeviceUtils.P(activity)) {
            hl1 c = hl1.c(activity);
            if (c != null) {
                c.e();
            }
            d7r.a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        hl1 c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else if (TBDeviceUtils.P(activity) && (c = hl1.c(activity)) != null) {
            c.f();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            ((ArrayList) this.c).remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        WeakReference<Activity> weakReference = this.b;
        if (weakReference == null || weakReference.get() != activity) {
            this.b = new WeakReference<>(activity);
        }
        if (TBAutoSizeConfig.x().r() == null || !TBAutoSizeConfig.x().r().contains(activity.getClass().getName())) {
            d7r.j(activity, TBAutoSizeConfig.x().t(), (int) (activity.getResources().getDisplayMetrics().widthPixels / TBAutoSizeConfig.x().t()));
        } else {
            d7r.b(activity, TBAutoSizeConfig.x().s(), false);
        }
        ((ArrayList) this.c).add(activity);
        if (!this.d && ((ArrayList) this.c).size() > 1) {
            this.d = true;
        }
        f8k.a(activity, true);
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
