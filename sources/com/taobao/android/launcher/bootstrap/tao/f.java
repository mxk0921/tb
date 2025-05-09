package com.taobao.android.launcher.bootstrap.tao;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.LoginBroadcastRegister;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.b;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.lifecycle.PanguApplication;
import tb.aft;
import tb.b8l;
import tb.bhg;
import tb.chg;
import tb.fhj;
import tb.h7n;
import tb.igg;
import tb.ihj;
import tb.iqk;
import tb.j6a;
import tb.k6a;
import tb.muo;
import tb.qfu;
import tb.r41;
import tb.sgg;
import tb.t5r;
import tb.tt;
import tb.tu;
import tb.va7;
import tb.vh4;
import tb.w35;
import tb.whh;
import tb.wrg;
import tb.xet;
import tb.xhq;
import tb.xq7;
import tb.zg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f implements r41, zg1, igg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.launcher.bootstrap.tao.a f8162a;
    public LoginBroadcastRegister b;
    public sgg c;
    public Application d;
    public b8l e;
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends tt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(f fVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/TaoNGAppDelegate$1");
        }

        @Override // tb.tt, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            whh.a("TaoNGAppDelegate", "onActivityCreated, activity: " + activity.getLocalClassName());
        }

        @Override // tb.tt, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            whh.a("TaoNGAppDelegate", "onActivityDestroyed, activity: " + activity.getLocalClassName());
        }

        @Override // tb.tt, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            whh.a("TaoNGAppDelegate", "onActivityPaused, activity: " + activity.getLocalClassName());
        }

        @Override // tb.tt, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            whh.a("TaoNGAppDelegate", "onActivityResumed, activity: " + activity.getLocalClassName());
        }

        @Override // tb.tt, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            whh.a("TaoNGAppDelegate", "onActivityStarted, activity: " + activity.getLocalClassName());
        }

        @Override // tb.tt, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            whh.a("TaoNGAppDelegate", "onActivityStopped, activity: " + activity.getLocalClassName());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PanguApplication f8163a;

        public b(PanguApplication panguApplication) {
            this.f8163a = panguApplication;
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.b.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6cb28c7", new Object[]{this});
                return;
            }
            iqk d = f.c(f.this).d();
            if (d != null) {
                d.r();
            }
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.b.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec79c00", new Object[]{this});
                return;
            }
            w35.a("onLaunchCompleted");
            ihj.g(this.f8163a, f.c(f.this)).e();
            f.c(f.this).y().k();
            w35.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends tu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PanguApplication f8164a;

        public c(PanguApplication panguApplication) {
            this.f8164a = panguApplication;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/TaoNGAppDelegate$3");
        }

        @Override // tb.tu, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
                return;
            }
            f.d(f.this).b(true, this.f8164a);
            f.g(f.this).e();
            this.f8164a.unregisterCrossActivityLifecycleCallback(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements LoginBroadcastRegister.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.LoginBroadcastRegister.b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f752460", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                f.c(f.this).y().f();
            } else if (i == 2) {
                f.c(f.this).y().l();
            } else if (i == 3) {
                f.c(f.this).y().a();
            }
        }
    }

    public static /* synthetic */ sgg c(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgg) ipChange.ipc$dispatch("9f594fb6", new Object[]{fVar});
        }
        return fVar.c;
    }

    public static /* synthetic */ LoginBroadcastRegister d(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginBroadcastRegister) ipChange.ipc$dispatch("64b7ed6e", new Object[]{fVar});
        }
        return fVar.b;
    }

    public static /* synthetic */ com.taobao.android.launcher.bootstrap.tao.a g(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.launcher.bootstrap.tao.a) ipChange.ipc$dispatch("4b17016e", new Object[]{fVar});
        }
        return fVar.f8162a;
    }

    public static Pair<sgg, com.taobao.android.launcher.bootstrap.tao.a> k(Application application, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d9218dea", new Object[]{application, b8lVar});
        }
        chg chgVar = new chg();
        Pair<j6a<String>, aft<String, Void>> a2 = k6a.a(application, b8lVar.b);
        bhg bhgVar = new bhg();
        muo muoVar = new muo();
        muoVar.d(h7n.q("NGAppDelegateQoSchedule"));
        vh4 b2 = new vh4.b(chgVar, (aft) a2.second, (j6a) a2.first).a("default").d(bhgVar).c(muoVar).b();
        sgg z = sgg.z(b8lVar.b, b2);
        com.taobao.android.launcher.bootstrap.tao.a aVar = new com.taobao.android.launcher.bootstrap.tao.a(z);
        LauncherRuntime.i = z.y();
        LauncherRuntime.j = b2;
        LauncherRuntime.g(application, b8lVar);
        return Pair.create(z, aVar);
    }

    @Override // tb.zg1
    public void a(sgg sggVar, com.taobao.android.launcher.bootstrap.tao.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2579e34", new Object[]{this, sggVar, aVar});
            return;
        }
        this.c = sggVar;
        this.f8162a = aVar;
        whh.a("TaoNGAppDelegate", "ng runtime attached");
    }

    @Override // tb.igg
    public b8l b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8l) ipChange.ipc$dispatch("e4aa763f", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.q41
    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        va7.e();
        xet.a(h7n.q("QoScheduleTask"));
        if (!TextUtils.isEmpty(this.e.b) && this.e.b.endsWith(":channel")) {
            Process.setThreadPriority(5);
        }
        Application application = this.d;
        if (application instanceof PanguApplication) {
            i((PanguApplication) application);
        }
    }

    @Override // tb.r41
    public void f(Application application, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2236238c", new Object[]{this, application, b8lVar});
            return;
        }
        this.d = application;
        this.e = b8lVar;
        m();
        t5r.b("ngApp", Boolean.TRUE);
        if (!BootstrapMode.d(512) && !BootstrapMode.d(1024)) {
            fhj.l(application, this);
        }
        if (this.c == null || this.f8162a == null) {
            Pair<sgg, com.taobao.android.launcher.bootstrap.tao.a> k = k(application, b8lVar);
            this.c = (sgg) k.first;
            this.f8162a = (com.taobao.android.launcher.bootstrap.tao.a) k.second;
        }
        LauncherRuntime.g(application, b8lVar);
        wrg.n(application, b8lVar, this.c);
        wrg.e(this.f8162a);
        qfu.b(application, this.f8162a);
        this.b = new LoginBroadcastRegister(this.f8162a);
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

    public final void i(PanguApplication panguApplication) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ae3887", new Object[]{this, panguApplication});
            return;
        }
        this.f8162a.j(panguApplication, this.e, new b(panguApplication));
        panguApplication.registerCrossActivityLifecycleCallback(new c(panguApplication));
        this.b.c = new d();
    }

    @Override // tb.igg
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("601e7b1d", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    @Override // tb.igg
    public void l(xhq xhqVar, xq7 xq7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac715fb", new Object[]{this, xhqVar, xq7Var});
        } else {
            this.f = true;
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193363ce", new Object[]{this});
        } else {
            this.d.registerActivityLifecycleCallbacks(new a(this));
        }
    }

    @Override // tb.q41
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (BootstrapMode.d(1024)) {
            this.c.d().p();
        }
    }
}
