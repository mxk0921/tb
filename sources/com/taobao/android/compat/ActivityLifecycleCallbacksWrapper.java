package com.taobao.android.compat;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ActivityLifecycleCallbacksWrapper implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ActLifecycleCallback";
    private Application.ActivityLifecycleCallbacks mCallbacks;

    static {
        t2o.a(670040066);
    }

    public ActivityLifecycleCallbacksWrapper(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.mCallbacks = activityLifecycleCallbacks;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityLifecycleCallbacksWrapper)) {
            return false;
        }
        return this.mCallbacks.equals(((ActivityLifecycleCallbacksWrapper) obj).mCallbacks);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.mCallbacks.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        try {
            this.mCallbacks.onActivityCreated(activity, bundle);
        } catch (Throwable th) {
            new StringBuilder("onActivityCreated: ").append(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        try {
            this.mCallbacks.onActivityDestroyed(activity);
        } catch (Throwable th) {
            new StringBuilder("onActivityDestroyed: ").append(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        try {
            this.mCallbacks.onActivityPaused(activity);
        } catch (Throwable th) {
            new StringBuilder("onActivityPaused: ").append(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        try {
            this.mCallbacks.onActivityResumed(activity);
        } catch (Throwable th) {
            new StringBuilder("onActivityResumed: ").append(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        try {
            this.mCallbacks.onActivitySaveInstanceState(activity, bundle);
        } catch (Throwable th) {
            new StringBuilder("onActivitySaveInstanceState: ").append(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        try {
            this.mCallbacks.onActivityStarted(activity);
        } catch (Throwable th) {
            new StringBuilder("onActivityStarted: ").append(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        try {
            this.mCallbacks.onActivityStopped(activity);
        } catch (Throwable th) {
            new StringBuilder("onActivityStopped: ").append(th);
        }
    }
}
