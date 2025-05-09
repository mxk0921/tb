package com.taobao.android.compat;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ApplicationCompat extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class AbstractActivityLifecycleCallbacks implements ActivityLifecycleCallbacksCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(670040068);
            t2o.a(670040069);
        }

        @Override // com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ActivityLifecycleCallbacksCompat {
        void onActivityCreated(Activity activity, Bundle bundle);

        void onActivityDestroyed(Activity activity);

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);

        void onActivitySaveInstanceState(Activity activity, Bundle bundle);

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);
    }

    static {
        t2o.a(670040067);
    }

    public static /* synthetic */ Object ipc$super(ApplicationCompat applicationCompat, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1903246064) {
            super.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) objArr[0]);
            return null;
        } else if (hashCode == -878150729) {
            super.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/compat/ApplicationCompat");
        }
    }

    public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacksCompat activityLifecycleCallbacksCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b2e74b", new Object[]{this, activityLifecycleCallbacksCompat});
        } else {
            super.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksCompatWrapper(activityLifecycleCallbacksCompat));
        }
    }

    @Override // android.app.Application
    public void unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8ec510", new Object[]{this, activityLifecycleCallbacks});
        } else {
            super.unregisterActivityLifecycleCallbacks(new ActivityLifecycleCallbacksWrapper(activityLifecycleCallbacks));
        }
    }

    @Override // android.app.Application
    public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba87bb7", new Object[]{this, activityLifecycleCallbacks});
        } else {
            super.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksWrapper(activityLifecycleCallbacks));
        }
    }

    public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacksCompat activityLifecycleCallbacksCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0ec364", new Object[]{this, activityLifecycleCallbacksCompat});
        } else {
            super.unregisterActivityLifecycleCallbacks(new ActivityLifecycleCallbacksCompatWrapper(activityLifecycleCallbacksCompat));
        }
    }
}
