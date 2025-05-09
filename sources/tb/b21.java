package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.application.common.IAppLaunchListener;
import com.taobao.application.common.IPageListener;
import com.taobao.application.common.IScrollListener;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b21 implements jhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ykb<Application.ActivityLifecycleCallbacks> f16133a;
    public final ykb<Application.ActivityLifecycleCallbacks> b;
    public final skc<IPageListener> c;
    public final skc<IAppLaunchListener> d;
    public final skc<IApmEventListener> e;
    public final skc<ijb> f;
    public final skc<IScrollListener> g;
    public volatile Handler h;
    public final Object i;
    public volatile Activity j;
    public final ConcurrentHashMap<Application.ActivityLifecycleCallbacks, Boolean> k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static final b21 INSTANCE = new b21();
    }

    public static b21 s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b21) ipChange.ipc$dispatch("91f83068", new Object[0]);
        }
        return b.INSTANCE;
    }

    public void A(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a19eebdb", new Object[]{this, activity});
        } else {
            this.j = activity;
        }
    }

    public void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f95ef9", new Object[]{this, activityLifecycleCallbacks, new Boolean(z)});
        } else if (activityLifecycleCallbacks == null) {
            throw new IllegalArgumentException();
        } else if (this.k.put(activityLifecycleCallbacks, Boolean.valueOf(z)) != null) {
            throw new IllegalArgumentException();
        } else if (z) {
            ((uyh) this.f16133a).c(activityLifecycleCallbacks);
        } else {
            ((z91) this.b).c(activityLifecycleCallbacks);
        }
    }

    public void b(ijb ijbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f41b30", new Object[]{this, ijbVar});
        } else {
            ((zw1) this.f).b(ijbVar);
        }
    }

    public void c(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caaeece2", new Object[]{this, iApmEventListener});
        } else {
            ((y11) this.e).c(iApmEventListener);
        }
    }

    public void d(IAppLaunchListener iAppLaunchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9c452c", new Object[]{this, iAppLaunchListener});
        } else {
            ((y51) this.d).c(iAppLaunchListener);
        }
    }

    public void e(IPageListener iPageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8bbc7fc", new Object[]{this, iPageListener});
        } else {
            ((onl) this.c).c(iPageListener);
        }
    }

    public void f(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d38080", new Object[]{this, iScrollListener});
        } else {
            ((jyo) this.g).b(iScrollListener);
        }
    }

    public final <T> T g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("aaabdd56", new Object[]{this, obj});
        }
        return obj;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc65808", new Object[]{this});
        } else if (this.h == null) {
            synchronized (this.i) {
                try {
                    if (this.h == null) {
                        HandlerThread a2 = cst.a("Apm-Sec");
                        a2.start();
                        this.h = new Handler(a2.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ijb i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijb) ipChange.ipc$dispatch("998e214e", new Object[]{this});
        }
        return (ijb) g(this.f);
    }

    public IApmEventListener j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IApmEventListener) ipChange.ipc$dispatch("847ec0a", new Object[]{this});
        }
        return (IApmEventListener) g(this.e);
    }

    public chb k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (chb) ipChange.ipc$dispatch("78a245d7", new Object[]{this});
        }
        return e81.b();
    }

    public Application.ActivityLifecycleCallbacks l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("e134a955", new Object[]{this});
        }
        return (Application.ActivityLifecycleCallbacks) g(this.b);
    }

    public Handler m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4e5fe2bb", new Object[]{this});
        }
        h();
        return this.h;
    }

    public IAppLaunchListener n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAppLaunchListener) ipChange.ipc$dispatch("7246adab", new Object[]{this});
        }
        return (IAppLaunchListener) g(this.d);
    }

    public IPageListener o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPageListener) ipChange.ipc$dispatch("bb1fe4", new Object[]{this});
        }
        return (IPageListener) g(this.c);
    }

    public IScrollListener p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IScrollListener) ipChange.ipc$dispatch("3d627e8", new Object[]{this});
        }
        return (IScrollListener) g(this.g);
    }

    public Activity q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1d7099f3", new Object[]{this});
        }
        return this.j;
    }

    public Application.ActivityLifecycleCallbacks r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("cd7b19", new Object[]{this});
        }
        return (Application.ActivityLifecycleCallbacks) g(this.f16133a);
    }

    public void t(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("367902b8", new Object[]{this, activityLifecycleCallbacks});
        } else if (activityLifecycleCallbacks != null) {
            Boolean bool = this.k.get(activityLifecycleCallbacks);
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                this.k.remove(activityLifecycleCallbacks);
                if (booleanValue) {
                    ((uyh) this.f16133a).e(activityLifecycleCallbacks);
                } else {
                    ((z91) this.b).f(activityLifecycleCallbacks);
                }
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void u(ijb ijbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29653", new Object[]{this, ijbVar});
        } else {
            ((zw1) this.f).d(ijbVar);
        }
    }

    public void v(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eea7adf", new Object[]{this, iApmEventListener});
        } else {
            ((y11) this.e).f(iApmEventListener);
        }
    }

    public void w(IAppLaunchListener iAppLaunchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2c47e9", new Object[]{this, iAppLaunchListener});
        } else {
            ((y51) this.d).g(iAppLaunchListener);
        }
    }

    public void x(IPageListener iPageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cfa2f9", new Object[]{this, iPageListener});
        } else {
            ((onl) this.c).f(iPageListener);
        }
    }

    public void y(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95794fd", new Object[]{this, iScrollListener});
        } else {
            ((jyo) this.g).d(iScrollListener);
        }
    }

    public void z(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea2703e", new Object[]{this, runnable});
            return;
        }
        h();
        this.h.post(runnable);
    }

    public b21() {
        this.f16133a = new uyh();
        this.b = new z91();
        this.c = new onl();
        this.d = new y51();
        this.e = new y11();
        this.f = new pf2();
        this.g = new jyo();
        this.i = new Object();
        this.k = new ConcurrentHashMap<>();
    }
}
