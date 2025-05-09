package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b2n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b8t extends tt implements r41, b2n.b, igg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Application f16254a;
    public b8l b;
    public boolean c = false;
    public Pair<Activity, Bundle> d = null;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final List<Application.ActivityLifecycleCallbacks> f = new ArrayList();

    public static /* synthetic */ Object ipc$super(b8t b8tVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/TaoNGAppPrivacyDelegate");
    }

    @Override // tb.igg
    public b8l b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8l) ipChange.ipc$dispatch("e4aa763f", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.q41
    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        String str = this.b.f16248a;
        ppo.b().h(xhq.b(str, str, true, null, this.f16254a.getPackageManager().getLaunchIntentForPackage(str), false, null));
        BootstrapMode.h(this.f16254a, BootstrapMode.b() | 1024);
        this.f16254a.registerActivityLifecycleCallbacks(this);
    }

    @Override // tb.r41
    public void f(Application application, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2236238c", new Object[]{this, application, b8lVar});
            return;
        }
        this.f16254a = application;
        this.b = b8lVar;
        LauncherRuntime.g(application, b8lVar);
        b2n.d(application, this);
        lc0.d(application, b8lVar);
    }

    @Override // tb.igg
    public void h(xhq xhqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444c2ad9", new Object[]{this, xhqVar});
        } else {
            l(xhqVar, null);
        }
    }

    @Override // tb.igg
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("601e7b1d", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.igg
    public void l(xhq xhqVar, xq7 xq7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac715fb", new Object[]{this, xhqVar, xq7Var});
            return;
        }
        this.c = true;
        w35.a("TaoNGAppPrivacyDelegate#launch");
        r41 d = va7.d(this.f16254a);
        p();
        d.f(this.f16254a, this.b);
        d.e(this.f16254a);
        d.onCreate();
        r();
        w35.c();
    }

    @Override // tb.tt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            this.d = Pair.create(activity, bundle);
        }
    }

    @Override // tb.q41
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21916664", new Object[]{this});
            return;
        }
        this.f16254a.unregisterActivityLifecycleCallbacks(this);
        List<Application.ActivityLifecycleCallbacks> e = kb0.e(this.f16254a);
        synchronized (e) {
            ((ArrayList) this.f).addAll(e);
            e.clear();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb85edc", new Object[]{this});
        } else if (this.e.compareAndSet(false, true)) {
            l(null, null);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fc3c9e3", new Object[]{this});
            return;
        }
        Pair<Activity, Bundle> pair = this.d;
        if (pair != null) {
            Activity activity = (Activity) pair.first;
            if (activity != null) {
                kb0.d(activity);
                kb0.a(this.f16254a, "dispatchActivityCreated", new Class[]{Activity.class, Bundle.class}, new Object[]{activity, this.d.second});
                kb0.a(this.f16254a, "dispatchActivityStarted", new Class[]{Activity.class}, new Object[]{activity});
                kb0.a(this.f16254a, "dispatchActivityResumed", new Class[]{Activity.class}, new Object[]{activity});
                kb0.g(activity);
                List<Application.ActivityLifecycleCallbacks> e = kb0.e(this.f16254a);
                synchronized (e) {
                    e.addAll(0, this.f);
                }
                ((ArrayList) this.f).clear();
                this.d = null;
                return;
            }
            throw new IllegalStateException("something went wrong, activity is null");
        }
    }
}
