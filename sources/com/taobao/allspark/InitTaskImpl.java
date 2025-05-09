package com.taobao.allspark;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxPreloadExecutor;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import com.taobao.wetao.home.tnode.GuangGuangBroadcastModule;
import com.taobao.wetao.receiver.LoginBroadcastReceiver;
import tb.akt;
import tb.bax;
import tb.bud;
import tb.d9l;
import tb.fhb;
import tb.lma;
import tb.nwv;
import tb.od0;
import tb.spu;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class InitTaskImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6204a;
    public final Application b;
    public boolean d;
    public boolean c = false;
    public final LoginBroadcastReceiver e = LoginBroadcastReceiver.a();
    public final BroadcastReceiver f = new BroadcastReceiver() { // from class: com.taobao.allspark.InitTaskImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/allspark/InitTaskImpl$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (EVO.ACTION_INITIALIZE_COMPLETE.equals(intent.getAction())) {
                InitTaskImpl.a(InitTaskImpl.this);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class Tab2ChangedBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Tab2ChangedBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(Tab2ChangedBroadcastReceiver tab2ChangedBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/allspark/InitTaskImpl$Tab2ChangedBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            boolean b = InitTaskImpl.b(InitTaskImpl.this);
            InitTaskImpl initTaskImpl = InitTaskImpl.this;
            InitTaskImpl.c(initTaskImpl, InitTaskImpl.d(initTaskImpl));
            if (b != InitTaskImpl.b(InitTaskImpl.this)) {
                InitTaskImpl initTaskImpl2 = InitTaskImpl.this;
                InitTaskImpl.e(initTaskImpl2, InitTaskImpl.b(initTaskImpl2));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.allspark.InitTaskImpl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0324a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f6208a;

            public RunnableC0324a(Activity activity) {
                this.f6208a = activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (od0.D().f().J(this.f6208a)) {
                        InitTaskImpl.i(InitTaskImpl.this);
                    }
                } catch (Throwable th) {
                    tfs.f("onActivityCreated error:" + th.getMessage());
                }
            }
        }

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                nwv.A0(new RunnableC0324a(activity), 200L);
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
                fhb f = od0.D().f();
                if (f != null && f.J(activity)) {
                    InitTaskImpl.j(InitTaskImpl.this, activity, true);
                }
            } catch (Throwable th) {
                tfs.f("onActivityDestroyed error:" + th.getMessage());
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                InitTaskImpl.f(InitTaskImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                InitTaskImpl.a(InitTaskImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DxPreloadExecutor.INSTANCE.a();
            } catch (Throwable th) {
                TLog.loge("GuangGuang", "startDownloadDxTemplate", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f6212a;

        public e(Runnable runnable) {
            this.f6212a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AsyncTask.execute(this.f6212a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                com.taobao.umipublish.ayscpublish.b.a().b();
            } catch (Throwable th) {
                TLog.loge("GuangGuang", "startAsyncPublishTask", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f6214a;

        public g(Runnable runnable) {
            this.f6214a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AsyncTask.execute(this.f6214a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements a.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(InitTaskImpl initTaskImpl) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i extends LoginBroadcastReceiver.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/allspark/InitTaskImpl$9");
        }

        @Override // com.taobao.wetao.receiver.LoginBroadcastReceiver.c, com.taobao.wetao.receiver.LoginBroadcastReceiver.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9512450", new Object[]{this});
            } else {
                InitTaskImpl.h(InitTaskImpl.this);
            }
        }

        @Override // com.taobao.wetao.receiver.LoginBroadcastReceiver.c, com.taobao.wetao.receiver.LoginBroadcastReceiver.b
        public void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbcebe0", new Object[]{this});
            } else if (InitTaskImpl.d(InitTaskImpl.this)) {
                InitTaskImpl.g(InitTaskImpl.this);
            }
        }
    }

    public InitTaskImpl(Application application, boolean z) {
        this.b = application;
        this.f6204a = z;
    }

    public static /* synthetic */ void a(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa71c6f1", new Object[]{initTaskImpl});
        } else {
            initTaskImpl.o();
        }
    }

    public static /* synthetic */ boolean b(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8711f1f6", new Object[]{initTaskImpl})).booleanValue();
        }
        return initTaskImpl.c;
    }

    public static /* synthetic */ boolean c(InitTaskImpl initTaskImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("968e0e4", new Object[]{initTaskImpl, new Boolean(z)})).booleanValue();
        }
        initTaskImpl.c = z;
        return z;
    }

    public static /* synthetic */ boolean d(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13b21cf7", new Object[]{initTaskImpl})).booleanValue();
        }
        return initTaskImpl.m();
    }

    public static /* synthetic */ void e(InitTaskImpl initTaskImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f76960", new Object[]{initTaskImpl, new Boolean(z)});
        } else {
            initTaskImpl.z(z);
        }
    }

    public static /* synthetic */ void f(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf272f5", new Object[]{initTaskImpl});
        } else {
            initTaskImpl.t();
        }
    }

    public static /* synthetic */ void g(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4632c8f7", new Object[]{initTaskImpl});
        } else {
            initTaskImpl.w();
        }
    }

    public static /* synthetic */ void h(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d2f3f8", new Object[]{initTaskImpl});
        } else {
            initTaskImpl.y();
        }
    }

    public static /* synthetic */ void i(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f731ef9", new Object[]{initTaskImpl});
        } else {
            initTaskImpl.A();
        }
    }

    public static /* synthetic */ void j(InitTaskImpl initTaskImpl, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8f4288", new Object[]{initTaskImpl, activity, new Boolean(z)});
        } else {
            initTaskImpl.r(activity, z);
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b455ebcf", new Object[]{this});
        } else if (m()) {
            n();
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2ff517", new Object[]{this});
            return;
        }
        try {
            WXSDKEngine.registerModule("GuangGuangBroadcast", GuangGuangBroadcastModule.class);
        } catch (WXException e2) {
            e2.printStackTrace();
        }
        if (Login.checkSessionValid()) {
            w();
        }
        com.taobao.tao.navigation.a.I(1, new h(this));
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e9cf", new Object[]{this});
            return;
        }
        this.e.b(new i());
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.e);
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39c59a45", new Object[]{this})).booleanValue();
        }
        return TBRevisionSwitchManager.c().d(bud.KEY_NEW_CONTENT_ENABLE);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b349e66d", new Object[]{this});
        } else {
            lma.h(Globals.getApplication(), bax.a());
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d4f96a", new Object[]{this});
        } else if (!this.d) {
            this.d = true;
            n();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if ("true".equals(akt.G2("Tab2.Tab2TaskOpt.enable_quick_launch_tab2task", "false")) == this.f6204a) {
            tfs.f("start Tab2Task, fromQuickLaunch:" + this.f6204a);
            x();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9baa0482", new Object[]{this});
        }
    }

    public final void r(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adaf9f28", new Object[]{this, activity, new Boolean(z)});
            return;
        }
        if (activity != null) {
            FluidSDK.clearPreloadTaskForContext(activity);
        }
        spu.e();
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5bc7268", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.f, new IntentFilter(EVO.ACTION_INITIALIZE_COMPLETE));
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb4c990", new Object[]{this});
        } else {
            ((Application) this.b.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4ac36f", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.b).registerReceiver(new Tab2ChangedBroadcastReceiver(), new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e3631a", new Object[]{this});
        } else if (d9l.e().a()) {
            nwv.A0(new e(new d()), 1000L);
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f00d321", new Object[]{this});
        } else if (d9l.e().c()) {
            f fVar = new f();
            if (d9l.e().b()) {
                nwv.A0(new g(fVar), 2000L);
            } else {
                fVar.run();
            }
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0606c1", new Object[]{this});
        } else if (d9l.e().c()) {
            try {
                com.taobao.android.publisher.service.export.ayscpublish.core.c.t().m();
            } catch (Throwable th) {
                TLog.loge("GuangGuang", "stopAsyncPublishTask", th);
            }
        }
    }

    public final void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19044d3c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            k();
            n();
        } else {
            r(od0.D().f().a(), false);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17818819", new Object[]{this});
            return;
        }
        lma.e(Globals.getApplication());
        l();
        v();
        if (akt.p2("registerTBMainRecycle", true)) {
            nwv.y0(new b());
        }
        if (!TBRevisionSwitchManager.c().p()) {
            u();
            boolean m = m();
            this.c = m;
            if (m) {
                od0.D().f();
                k();
                if (EVO.isInitialized()) {
                    n();
                    return;
                }
                s();
                nwv.A0(new c(), 2000L);
            }
        }
    }
}
