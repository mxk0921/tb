package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class k81 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final k81 c = new k81();

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f22459a;
    public final Application.ActivityLifecycleCallbacks b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(467664938);
        }

        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                k81.this.f22459a = new WeakReference<>(activity);
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

    static {
        t2o.a(467664936);
    }

    public static k81 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k81) ipChange.ipc$dispatch("58dc0fe", new Object[0]);
        }
        return c;
    }

    public Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
        }
        try {
            WeakReference<Activity> weakReference = this.f22459a;
            if (!(weakReference == null || weakReference.get() == null)) {
                return this.f22459a.get();
            }
        } catch (Exception e) {
            vp9.b("linkx", "AppRuntimeManager === getCurrentActivity == error");
            ah0.d(ah0.AFC_LINK_CRASH_MESSAGE, "AppRuntimeManager", e.getMessage(), null);
        }
        return null;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f54effc", new Object[]{this});
        }
        try {
            WeakReference<Activity> weakReference = this.f22459a;
            if (weakReference == null || weakReference.get() == null) {
                return "";
            }
            return this.f22459a.get().getComponentName().getClassName();
        } catch (Exception unused) {
            vp9.b("linkx", "AppRuntimeManager === getCurrentActivityName == error");
            return "";
        }
    }

    public void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
        } else {
            e(application);
        }
    }

    public final void e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc44075", new Object[]{this, application});
        } else if (application != null) {
            application.registerActivityLifecycleCallbacks(this.b);
        }
    }
}
