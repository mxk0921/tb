package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.knife.perf.PerfKnife;
import com.taobao.android.launcher.bootstrap.tao.ScheduleComposer;
import com.taobao.android.launcher.bootstrap.tao.a;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.lifecycle.PanguApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ghj extends tt implements Runnable, ScheduleComposer, dft {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String o = "NGNextScheduleComposer";
    private final sgg b;
    private Application c;
    private fd4 m;
    private hhj n;
    private int d = -1;
    private int e = -1;
    private int f = 0;
    private final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean h = new AtomicBoolean(false);
    private Pair<Activity, Bundle> i = null;
    private Pair<Activity, Bundle> j = null;
    private final List<Application.ActivityLifecycleCallbacks> k = new ArrayList();
    private final List<FragmentManager.FragmentLifecycleCallbacks> l = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    private final Handler f20004a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ghj.p(ghj.this) != null) {
                ghj.p(ghj.this).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            whh.a(ghj.o, "reached first frame");
            w35.a("LAUNCH_POST_SYNC_BARRIER");
            ghj.q(ghj.this);
            ghj.r(ghj.this);
            ghj.s(ghj.this, sto.c());
            ghj.t(ghj.this, 4);
            ghj.u(ghj.this).postAtFrontOfQueue(ghj.this);
            w35.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends tu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/perf/NGNextScheduleComposer$3");
        }

        @Override // tb.tu, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
            } else {
                ghj.v(ghj.this).y().j(activity);
            }
        }

        @Override // tb.tu, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
            } else {
                ghj.v(ghj.this).y().u(activity);
            }
        }
    }

    public ghj(sgg sggVar) {
        this.b = sggVar;
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21916664", new Object[]{this});
            return;
        }
        Application application = this.c;
        if (application != null) {
            List<Application.ActivityLifecycleCallbacks> e = kb0.e(application);
            synchronized (e) {
                this.k.addAll(e);
                e.clear();
            }
        }
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c500fe5", new Object[]{this});
            return;
        }
        Pair<Activity, Bundle> pair = this.i;
        if (pair != null) {
            Activity activity = (Activity) pair.first;
            if (activity instanceof FragmentActivity) {
                this.l.addAll(kb0.f(((FragmentActivity) activity).getSupportFragmentManager()));
            }
        }
    }

    private void F() {
        Pair<Activity, Bundle> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17537724", new Object[]{this});
        } else if (this.d >= 3 && (pair = this.i) != null) {
            Activity activity = (Activity) pair.first;
            if (activity instanceof FragmentActivity) {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                whh.a(o, "onFragmentResumed");
                kb0.b(supportFragmentManager, "onFragmentResumed", this.l);
            }
        }
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8bfa6d", new Object[]{this});
            return;
        }
        Application application = this.c;
        if (application instanceof PanguApplication) {
            ((PanguApplication) application).registerCrossActivityLifecycleCallback(new c());
        }
    }

    private void H(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7568d7", new Object[]{this, activity});
            return;
        }
        Intent intent = activity.getIntent();
        if (intent != null && intent.getBooleanExtra(ScheduleComposer.PARCEL_KEY_BOOT_IMAGE_AD, false)) {
            BootstrapMode.i(256);
            whh.a(o, "awaitLoadedLocked for boot image");
            hhj hhjVar = this.n;
            if (hhjVar != null) {
                hhjVar.b();
            }
            whh.a(o, "awaitLoadedLocked for boot image finished");
            hhj hhjVar2 = this.n;
            if (hhjVar2 != null) {
                hhjVar2.a();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(ghj ghjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/perf/NGNextScheduleComposer");
    }

    public static /* synthetic */ hhj p(ghj ghjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhj) ipChange.ipc$dispatch("f7de5f28", new Object[]{ghjVar});
        }
        return ghjVar.n;
    }

    public static /* synthetic */ void q(ghj ghjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9982bea", new Object[]{ghjVar});
        } else {
            ghjVar.A();
        }
    }

    public static /* synthetic */ void r(ghj ghjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22997d89", new Object[]{ghjVar});
        } else {
            ghjVar.B();
        }
    }

    public static /* synthetic */ int s(ghj ghjVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("395c85d0", new Object[]{ghjVar, new Integer(i)})).intValue();
        }
        ghjVar.e = i;
        return i;
    }

    public static /* synthetic */ int t(ghj ghjVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40856811", new Object[]{ghjVar, new Integer(i)})).intValue();
        }
        ghjVar.d = i;
        return i;
    }

    public static /* synthetic */ Handler u(ghj ghjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4c0866a0", new Object[]{ghjVar});
        }
        return ghjVar.f20004a;
    }

    public static /* synthetic */ sgg v(ghj ghjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgg) ipChange.ipc$dispatch("9aa471aa", new Object[]{ghjVar});
        }
        return ghjVar.b;
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb26bf5", new Object[]{this});
            return;
        }
        hhj hhjVar = this.n;
        if (hhjVar != null) {
            hhjVar.b();
        }
        if (this.d < 4) {
            A();
            B();
        }
        if (this.d < 6) {
            this.b.Q();
        }
        if (this.d < 7) {
            this.b.y().h(this.c);
        }
        if (this.d < 8) {
            this.b.y().d(this.c);
        }
        E(Arrays.asList(this.j, this.i));
        this.b.d().o();
        int i = this.e;
        if (i >= 0) {
            sto.f(i);
        }
    }

    private void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c95caa", new Object[]{this, str});
            return;
        }
        whh.a(o, "continueComposed due to " + str);
        w();
        y();
    }

    private void y() {
        fd4 fd4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf811e33", new Object[]{this});
        } else if (this.h.compareAndSet(false, true) && (fd4Var = this.m) != null) {
            ((a.C0431a) fd4Var).d();
        }
    }

    private boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a93d63d", new Object[]{this})).booleanValue();
        }
        hhj hhjVar = this.n;
        if (hhjVar == null) {
            return false;
        }
        hhjVar.c();
        this.n.f();
        return false;
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea116c9d", new Object[]{this})).booleanValue();
        }
        return this.h.get();
    }

    @Override // tb.dft
    public void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ed9868", new Object[]{this, runnable});
        } else {
            this.f20004a.postAtFrontOfQueue(runnable);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public boolean g(String str, Intent intent, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee91958f", new Object[]{this, str, intent, runnable})).booleanValue();
        }
        whh.a(o, "onActivityArrived with action, className=" + str + ", currentState=" + this.d);
        if (this.m == null) {
            return c(str, intent);
        }
        Dispatchers.a("onActivityArrived", "{ cls=" + str + ", intent=" + intent + " }");
        whh.a(o, "onActivityArrived, add current action to pending list");
        return ((a.C0431a) this.m).e(runnable);
    }

    @Override // tb.dft
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.dft
    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.d;
    }

    @Override // tb.dft
    public Runnable i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("4cd44778", new Object[]{this});
        }
        return new a();
    }

    @Override // tb.dft
    public void k(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2e79d3", new Object[]{this, runnable, new Long(j)});
        } else {
            this.f20004a.postDelayed(runnable, j);
        }
    }

    @Override // tb.dft
    public Runnable m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("9b3f9a3b", new Object[]{this});
        }
        return new b();
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void n(Application application, fd4 fd4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dceb26", new Object[]{this, application, fd4Var});
            return;
        }
        this.c = application;
        this.m = fd4Var;
        application.registerActivityLifecycleCallbacks(this);
        PerfKnife.load();
        int b2 = BootstrapMode.b();
        this.f = b2;
        hhj h = ihj.h(application, this.b, b2);
        this.n = h;
        h.d();
    }

    @Override // tb.dft
    public void o(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438bee7b", new Object[]{this, runnable});
        } else {
            this.f20004a.post(runnable);
        }
    }

    @Override // tb.tt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else if (kb0.c(activity)) {
            whh.a(o, "onActivityCreated, isLifeCycleCompact, ignore it");
            this.j = Pair.create(activity, bundle);
        } else if (this.d == -1) {
            this.i = Pair.create(activity, bundle);
            this.d = 1;
        } else {
            sto.d(activity.getClass().getName(), "onActivityCreated", this.d);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks, com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cb46a1", new Object[]{this, activity, bundle});
        } else if (this.h.get()) {
            whh.a(o, "already done, no need to worry about the state");
        } else if (bundle != null) {
            whh.a(o, "onActivityPostCreated, className=" + activity.getClass().getName() + ", currentState=" + this.d);
            if (this.g.get() <= 1) {
                whh.a(o, "onActivityPostCreated, re-handle the saved instance state before");
                bundle.remove(ScheduleComposer.PARCEL_KEY_STATE_REWROTE);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks, com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebc4708", new Object[]{this, activity, bundle});
        } else if (this.h.get()) {
            whh.a(o, "already done, no need to worry about the state");
        } else if (bundle != null) {
            whh.a(o, "onActivityPreCreated, className=" + activity.getClass().getName() + ", currentState=" + this.d);
            if (this.g.get() <= 1) {
                whh.a(o, "onActivityPreCreated, handle the saved instance state before");
                bundle.clear();
                bundle.putBoolean(ScheduleComposer.PARCEL_KEY_STATE_REWROTE, true);
                BootstrapMode.i(128);
            }
        }
    }

    @Override // tb.tt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else if (kb0.c(activity)) {
            whh.a(o, "onActivityResumed, isLifeCycleCompact, ignore it");
        } else {
            Application application = this.c;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
                if (this.d == 2) {
                    H(activity);
                    npi.a(this, this.f).a();
                    this.d = 3;
                    return;
                }
                sto.d(activity.getClass().getName(), "onActivityResumed", this.d);
                return;
            }
            throw new IllegalStateException("application is null");
        }
    }

    private void E(List<Pair<Activity, Bundle>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3882f90", new Object[]{this, list});
        } else if (this.c == null) {
            throw new IllegalStateException("something went wrong, application is null");
        } else if (this.i == null) {
            sto.d("NONE", "onRecoverComponentState", this.d);
        } else {
            if (!this.k.isEmpty()) {
                int i = 0;
                for (Pair<Activity, Bundle> pair : list) {
                    if (pair != null) {
                        i++;
                        D(i, pair);
                    }
                }
                List<Application.ActivityLifecycleCallbacks> e = kb0.e(this.c);
                synchronized (e) {
                    e.addAll(0, this.k);
                }
                this.k.clear();
                F();
                this.l.clear();
            } else if (!this.l.isEmpty()) {
                F();
                this.l.clear();
            }
            G();
            this.i = null;
        }
    }

    @Override // tb.tt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else if (kb0.c(activity)) {
            whh.a(o, "onActivityStarted, isLifeCycleCompact, ignore it");
        } else if (this.d == 1) {
            this.d = 2;
        } else {
            sto.d(activity.getClass().getName(), "onActivityStarted", this.d);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        int i = this.d;
        if (i == 10) {
            whh.a(o, "interrupted before, do nothing here");
        } else if (i == 4) {
            whh.a(o, "reached second message loop");
            this.b.Q();
            this.d = 6;
            this.f20004a.postAtFrontOfQueue(this);
        } else if (i == 6) {
            whh.a(o, "reached third message loop");
            this.b.y().h(this.c);
            this.d = 7;
            this.f20004a.postAtFrontOfQueue(this);
        } else if (i == 7) {
            whh.a(o, "reached fourth message loop");
            this.b.y().d(this.c);
            this.d = 8;
            this.f20004a.postAtFrontOfQueue(this);
        } else if (i == 8) {
            whh.a(o, "reached fifth message loop");
            E(Arrays.asList(this.j, this.i));
            this.b.d().o();
            sto.f(this.e);
            this.d = 9;
            y();
        }
    }

    private void D(int i, Pair<Activity, Bundle> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212b1c16", new Object[]{this, new Integer(i), pair});
            return;
        }
        Activity activity = (Activity) pair.first;
        if (activity != null) {
            if (this.d >= 1) {
                whh.a(o, "dispatchActivityCreated");
                kb0.a(this.c, "dispatchActivityCreated", new Class[]{Activity.class, Bundle.class}, new Object[]{activity, pair.second});
                if (i == 0) {
                    this.b.y().s(activity);
                    og0.f(activity);
                }
            }
            if (this.d >= 2) {
                whh.a(o, "dispatchActivityStarted");
                kb0.a(this.c, "dispatchActivityStarted", new Class[]{Activity.class}, new Object[]{activity});
            }
            if (this.d >= 3) {
                whh.a(o, "dispatchActivityResumed");
                kb0.a(this.c, "dispatchActivityResumed", new Class[]{Activity.class}, new Object[]{activity});
                return;
            }
            return;
        }
        throw new IllegalStateException("something went wrong, activity is null");
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public boolean c(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7daf391", new Object[]{this, str, intent})).booleanValue();
        }
        whh.a(o, "onActivityArrived, className=" + str + ", currentState=" + this.d);
        if (this.h.get()) {
            whh.a(o, "already done, no need to worry about it");
            return false;
        } else if (this.g.getAndIncrement() < 1) {
            return z();
        } else {
            sto.d(str, "onActivityArrived, intent=" + intent, this.d);
            Dispatchers.a("onActivityArrived", "{ cls=" + str + ", intent=" + intent + " }");
            whh.a(o, "now we should interrupt current process and ensure everything is ok");
            Application application = this.c;
            if (application == null) {
                return false;
            }
            int i = this.d;
            if (i == 1) {
                application.unregisterActivityLifecycleCallbacks(this);
                x("STATE_ACTIVITY_CREATED");
            } else if (i == 2) {
                application.unregisterActivityLifecycleCallbacks(this);
                x("STATE_ACTIVITY_STARTED");
            } else if (i == 3) {
                application.unregisterActivityLifecycleCallbacks(this);
                x("STATE_ACTIVITY_RESUMED");
            } else {
                x("STATE_WITH_STATE_" + this.d);
            }
            this.d = 10;
            return false;
        }
    }
}
