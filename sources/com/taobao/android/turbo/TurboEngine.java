package com.taobao.android.turbo;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import kotlin.Metadata;
import tb.b7d;
import tb.byb;
import tb.ckf;
import tb.kgc;
import tb.o2c;
import tb.p6d;
import tb.q2c;
import tb.rpu;
import tb.t2o;
import tb.ykf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\tJ\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010\u0006J'\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010!*\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/taobao/android/turbo/TurboEngine;", "Ltb/o2c;", "Ltb/p6d;", "Lcom/taobao/android/turbo/TurboEngineConfig;", "config", "<init>", "(Lcom/taobao/android/turbo/TurboEngineConfig;)V", "Ltb/xhv;", "onReady", "()V", "Lcom/taobao/android/turbo/core/service/lifecycle/EngineState;", "state", "onStateChanged", "(Lcom/taobao/android/turbo/core/service/lifecycle/EngineState;)V", "onPageCreate", "onPageStart", "onPageResume", "onPagePause", "onPageStop", "onPageDestroy", "Landroid/view/ViewGroup;", "getView", "()Landroid/view/ViewGroup;", "", "getPageState", "()I", "", "getPageData", "()Ljava/lang/Object;", "getTurboEngineConfig", "()Lcom/taobao/android/turbo/TurboEngineConfig;", "updateTurboEngineConfig", "Ltb/kgc;", "T", "Ljava/lang/Class;", "serviceClass", "getInvoker", "(Ljava/lang/Class;)Ltb/kgc;", "", "getInstanceId", "()Ljava/lang/String;", "Ltb/rpu;", "context", "Ltb/rpu;", "Ltb/ykf;", "invokerManager", "Ltb/ykf;", "Ltb/q2c;", "lifecycleService", "Ltb/q2c;", "Ltb/b7d;", "pageService", "Ltb/b7d;", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TurboEngine implements o2c, p6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final rpu context;
    private final ykf invokerManager;
    private final q2c lifecycleService;
    private final b7d pageService;

    static {
        t2o.a(919601154);
        t2o.a(919601295);
        t2o.a(919601322);
    }

    public TurboEngine(TurboEngineConfig turboEngineConfig) {
        ckf.g(turboEngineConfig, "config");
        rpu rpuVar = new rpu(turboEngineConfig);
        this.context = rpuVar;
        this.invokerManager = new ykf(rpuVar);
        this.lifecycleService = (q2c) rpuVar.getService(q2c.class);
        this.pageService = (b7d) rpuVar.getService(b7d.class);
    }

    public final String getInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.context.getInstanceId();
    }

    public final <T extends kgc> T getInvoker(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((kgc) ipChange.ipc$dispatch("b5905479", new Object[]{this, cls}));
        }
        ckf.g(cls, "serviceClass");
        return (T) this.invokerManager.a(cls);
    }

    public final Object getPageData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("411e449c", new Object[]{this});
        }
        return ((byb) this.context.getService(byb.class)).s();
    }

    public final int getPageState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("450b8306", new Object[]{this})).intValue();
        }
        return this.pageService.getPageState();
    }

    public final TurboEngineConfig getTurboEngineConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngineConfig) ipChange.ipc$dispatch("9bcea9d4", new Object[]{this});
        }
        return this.context.a();
    }

    public final ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        return this.pageService.getView();
    }

    @Override // tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
        } else {
            this.pageService.onPageCreate();
        }
    }

    @Override // tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
            return;
        }
        this.pageService.onPageDestroy();
        this.context.b();
    }

    @Override // tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        } else {
            this.pageService.onPagePause();
        }
    }

    @Override // tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
        } else {
            this.pageService.onPageResume();
        }
    }

    @Override // tb.p6d
    public void onPageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
        } else {
            this.pageService.onPageStart();
        }
    }

    @Override // tb.p6d
    public void onPageStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d0eb7", new Object[]{this});
        } else {
            this.pageService.onPageStop();
        }
    }

    @Override // tb.o2c
    public void onReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1a118b", new Object[]{this});
        } else {
            this.lifecycleService.onReady();
        }
    }

    @Override // tb.o2c
    public void onStateChanged(EngineState engineState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a0b34", new Object[]{this, engineState});
            return;
        }
        ckf.g(engineState, "state");
        this.lifecycleService.onStateChanged(engineState);
    }

    public final void updateTurboEngineConfig(TurboEngineConfig turboEngineConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19333b1", new Object[]{this, turboEngineConfig});
            return;
        }
        ckf.g(turboEngineConfig, "config");
        this.context.c(turboEngineConfig);
    }
}
