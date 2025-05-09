package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uyh implements Application.ActivityLifecycleCallbacks, ykb<Application.ActivityLifecycleCallbacks> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Application.ActivityLifecycleCallbacks> f29674a = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application.ActivityLifecycleCallbacks f29675a;

        public a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            this.f29675a = activityLifecycleCallbacks;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!uyh.a(uyh.this).contains(this.f29675a)) {
                uyh.a(uyh.this).add(this.f29675a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application.ActivityLifecycleCallbacks f29676a;

        public b(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            this.f29676a = activityLifecycleCallbacks;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                uyh.a(uyh.this).remove(this.f29676a);
            }
        }
    }

    public static /* synthetic */ ArrayList a(uyh uyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d86c2e44", new Object[]{uyhVar});
        }
        return uyhVar.f29674a;
    }

    /* renamed from: b */
    public void c(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02d60c7", new Object[]{this, activityLifecycleCallbacks});
        } else if (activityLifecycleCallbacks != null) {
            w9a.g().i().post(new a(activityLifecycleCallbacks));
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public void e(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc648aa", new Object[]{this, activityLifecycleCallbacks});
        } else if (activityLifecycleCallbacks != null) {
            w9a.g().i().post(new b(activityLifecycleCallbacks));
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f29674a.iterator();
        while (it.hasNext()) {
            it.next().onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f29674a.iterator();
        while (it.hasNext()) {
            it.next().onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f29674a.iterator();
        while (it.hasNext()) {
            it.next().onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f29674a.iterator();
        while (it.hasNext()) {
            it.next().onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f29674a.iterator();
        while (it.hasNext()) {
            it.next().onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f29674a.iterator();
        while (it.hasNext()) {
            it.next().onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f29674a.iterator();
        while (it.hasNext()) {
            it.next().onActivityStopped(activity);
        }
    }
}
