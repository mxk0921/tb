package com.taobao.android.turbo.core.service.app;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.lifecycle.PanguApplication;
import tb.a07;
import tb.ckf;
import tb.l91;
import tb.plk;
import tb.qgb;
import tb.qpu;
import tb.spu;
import tb.t2o;
import tb.tgb;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class AppLifecycleService implements tgb, PanguApplication.CrossActivityLifecycleCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final plk<qgb> f9740a = new plk<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601259);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601258);
        t2o.a(919601264);
        t2o.a(670040081);
    }

    public AppLifecycleService() {
        l91.Companion.b(spu.Companion.d());
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        Context applicationContext = qpuVar.getContext().getApplicationContext();
        if (applicationContext != null) {
            ((PanguApplication) applicationContext).registerCrossActivityLifecycleCallback(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.lifecycle.PanguApplication");
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onCreated(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
        }
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        Context applicationContext = qpuVar.getContext().getApplicationContext();
        if (applicationContext != null) {
            ((PanguApplication) applicationContext).unregisterCrossActivityLifecycleCallback(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.lifecycle.PanguApplication");
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
            return;
        }
        tpu.a.b(tpu.Companion, "AppLifecycleService", "应用进入前台", null, 4, null);
        this.f9740a.d(AppLifecycleService$onStarted$1.INSTANCE);
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
            return;
        }
        tpu.a.b(tpu.Companion, "AppLifecycleService", "应用进入后台", null, 4, null);
        this.f9740a.d(AppLifecycleService$onStopped$1.INSTANCE);
    }

    @Override // tb.rgb
    public void r(qgb qgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b714a3ea", new Object[]{this, qgbVar});
            return;
        }
        ckf.g(qgbVar, DataReceiveMonitor.CB_LISTENER);
        this.f9740a.a(qgbVar);
    }

    @Override // tb.rgb
    public void x(qgb qgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c010fde7", new Object[]{this, qgbVar});
            return;
        }
        ckf.g(qgbVar, DataReceiveMonitor.CB_LISTENER);
        this.f9740a.c(qgbVar);
    }
}
