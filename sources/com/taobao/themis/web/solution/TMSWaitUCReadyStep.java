package com.taobao.themis.web.solution;

import android.os.SystemClock;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVCoreSettings;
import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a07;
import tb.a9s;
import tb.au4;
import tb.bbs;
import tb.ckf;
import tb.oba;
import tb.q9s;
import tb.rds;
import tb.t2o;
import tb.yt4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWaitUCReadyStep extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final AtomicBoolean k = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(850395194);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b extends yt4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Runnable b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f13794a;

            public a(Runnable runnable) {
                this.f13794a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f13794a.run();
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.themis.web.solution.TMSWaitUCReadyStep$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class RunnableC0781b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f13795a;

            public RunnableC0781b(Runnable runnable) {
                this.f13795a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f13795a.run();
                }
            }
        }

        public b(Runnable runnable) {
            this.b = runnable;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/solution/TMSWaitUCReadyStep$onExecuting$2");
        }

        @Override // tb.yt4
        public void onUCCoreInitFailed(au4 au4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("764065fe", new Object[]{this, au4Var});
                return;
            }
            TMSLogger.f("TMSWaitUCReadyStep", "onUCCoreInitFailed, ready to start next step");
            TMSWaitUCReadyStep.l(TMSWaitUCReadyStep.this, new a(this.b));
        }

        @Override // tb.zt4
        public void onUCCorePrepared() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e1aa650", new Object[]{this});
                return;
            }
            TMSLogger.f("TMSWaitUCReadyStep", "onUCCorePrepared, ready to start next step");
            TMSWaitUCReadyStep.l(TMSWaitUCReadyStep.this, new RunnableC0781b(this.b));
        }
    }

    static {
        t2o.a(850395193);
    }

    public TMSWaitUCReadyStep(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
    }

    public static /* synthetic */ Object ipc$super(TMSWaitUCReadyStep tMSWaitUCReadyStep, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/solution/TMSWaitUCReadyStep");
    }

    public static final /* synthetic */ void k(TMSWaitUCReadyStep tMSWaitUCReadyStep) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6541905f", new Object[]{tMSWaitUCReadyStep});
        } else {
            tMSWaitUCReadyStep.i();
        }
    }

    public static final /* synthetic */ void l(TMSWaitUCReadyStep tMSWaitUCReadyStep, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7816fbef", new Object[]{tMSWaitUCReadyStep, runnable});
        } else {
            tMSWaitUCReadyStep.m(runnable);
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSWaitUCReadyStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
        }
    }

    public final void m(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e441cad7", new Object[]{this, runnable});
        } else if (oba.g("wvEnablePostAtFrontOfQueue")) {
            CommonExtKt.k(runnable);
        } else {
            CommonExtKt.n(runnable);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ AtomicBoolean b;

        public c(AtomicBoolean atomicBoolean) {
            this.b = atomicBoolean;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Long l = TMSWaitUCReadyStep.this.i;
            ckf.f(l, "mTraceId");
            rds.d("TMSWaitUCReadyStep#initUCCoreAsync", l.longValue(), null, 4, null);
            if (this.b.compareAndSet(false, true)) {
                TMSWaitUCReadyStep.k(TMSWaitUCReadyStep.this);
            }
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        this.b.X().e("TMS_waitUCReadyStep");
        boolean isUCStartInit = WVCore.getInstance().isUCStartInit();
        Long l = this.i;
        ckf.f(l, "mTraceId");
        rds.b("TMSWaitUCReadyStep#initUCCoreAsync", l.longValue(), null, 4, null);
        if (!isUCStartInit && k.compareAndSet(false, true)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            TMSLogger.f("TMSWaitUCReadyStep", " UC init compensation start");
            WVUCWebView.initUCCore();
            TMSLogger.f("TMSWaitUCReadyStep", " UC init compensation end, cost " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms");
            isUCStartInit = WVCore.getInstance().isUCStartInit();
        }
        boolean H2 = q9s.H2();
        long g4 = q9s.g4();
        TMSLogger.f("TMSWaitUCReadyStep", "isUCStartInit: " + isUCStartInit + ", enableAsyncLoad: " + H2 + ", timeout: " + g4);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c cVar = new c(atomicBoolean);
        if (!H2 || !isUCStartInit) {
            cVar.run();
            return;
        }
        WVCoreSettings.getInstance().setCoreEventCallback2(new b(cVar));
        CommonExtKt.q(new TMSWaitUCReadyStep$onExecuting$3(atomicBoolean, cVar), g4);
    }
}
