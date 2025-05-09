package tb;

import android.app.Activity;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uhl implements i5d, t11 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_ACTIVITY_NAME = "UNKNOWN";
    public static final String DEFAULT_URL = "UNKNOWN";
    public static final String TAG = "PGLifeCycleContextImpl";

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f29388a;
    public WeakReference<Activity> b;

    static {
        t2o.a(757071891);
        t2o.a(757071888);
    }

    public uhl(List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.f29388a = arrayList;
        arrayList.addAll(list);
        c21.a(this, true);
    }

    public String a() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98ff90a5", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.b;
        if (weakReference == null || (activity = weakReference.get()) == null || activity.getIntent() == null || activity.getIntent().getData() == null) {
            return "UNKNOWN";
        }
        return activity.getIntent().getData().toString();
    }

    public String b() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3e102a0", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.b;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return "UNKNOWN";
        }
        return activity.getLocalClassName();
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
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else if (activity != null) {
            if (((ArrayList) this.f29388a).isEmpty() || !((ArrayList) this.f29388a).contains(activity.getLocalClassName())) {
                this.b = new WeakReference<>(activity);
            }
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
