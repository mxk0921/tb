package com.taobao.android.turbo.core.service.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import kotlin.Metadata;
import tb.a07;
import tb.b7d;
import tb.ckf;
import tb.o2c;
import tb.plk;
import tb.q2c;
import tb.q8u;
import tb.qpu;
import tb.t2o;
import tb.tpu;
import tb.zrt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class EngineLifecycleService implements q2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f9746a;
    public final plk<o2c> b = new plk<>();
    public EngineState c = EngineState.INIT;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601289);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                EngineLifecycleService.this.onStateChanged(EngineState.INTERACTIVE);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                EngineLifecycleService.this.onStateChanged(EngineState.IDLE);
            }
        }
    }

    static {
        t2o.a(919601288);
        t2o.a(919601297);
    }

    @Override // tb.q2c
    public boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16c183e9", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f9746a = qpuVar;
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
        } else {
            ckf.g(qpuVar, "context");
        }
    }

    @Override // tb.o2c
    public void onReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1a118b", new Object[]{this});
            return;
        }
        this.d = true;
        this.b.d(EngineLifecycleService$onReady$1.INSTANCE);
    }

    @Override // tb.o2c
    public void onStateChanged(EngineState engineState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a0b34", new Object[]{this, engineState});
            return;
        }
        ckf.g(engineState, "state");
        q8u.a aVar = q8u.Companion;
        aVar.a("onStateChanged " + engineState);
        qpu qpuVar = this.f9746a;
        if (qpuVar != null) {
            int pageState = ((b7d) qpuVar.getService(b7d.class)).getPageState();
            if (this.c.compareTo(engineState) >= 0 || pageState == 5) {
                tpu.a.b(tpu.Companion, "EngineLifecycleService", "engine already onIdle or pageState is destroyed", null, 4, null);
            } else {
                tpu.a aVar2 = tpu.Companion;
                tpu.a.b(aVar2, "EngineLifecycleService", "engine onStateChanged: " + engineState, null, 4, null);
                this.c = engineState;
                this.b.d(new EngineLifecycleService$onStateChanged$1(engineState));
                if (engineState == EngineState.VISIBLE) {
                    zrt.Companion.d(new b(), 1000L);
                } else if (engineState == EngineState.INTERACTIVE) {
                    zrt.Companion.d(new c(), 2000L);
                }
            }
            aVar.c();
            return;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.p2c
    public void r(o2c o2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff865887", new Object[]{this, o2cVar});
            return;
        }
        ckf.g(o2cVar, DataReceiveMonitor.CB_LISTENER);
        this.b.a(o2cVar);
    }

    @Override // tb.q2c
    public EngineState t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EngineState) ipChange.ipc$dispatch("60e7fead", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.p2c
    public void x(o2c o2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e6ff84", new Object[]{this, o2cVar});
            return;
        }
        ckf.g(o2cVar, DataReceiveMonitor.CB_LISTENER);
        this.b.c(o2cVar);
    }
}
