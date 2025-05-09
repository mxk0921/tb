package tb;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import tb.fwa;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class tw1<COMPONENT extends fwa<DATA, FrameLayout>, DATA> implements iae<DATA>, vjc<DATA, COMPONENT>, p6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f28993a;
    public COMPONENT b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552768);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552767);
        t2o.a(919601254);
        t2o.a(918552769);
        t2o.a(919601322);
    }

    @Override // tb.iae
    public void H0(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c112a576", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BaseLayoutService", "onPauseService triggerType:" + iComponentLifecycle$TriggerType, null, 4, null);
        COMPONENT component = this.b;
        ckf.d(component);
        component.onPause(iComponentLifecycle$TriggerType);
    }

    @Override // tb.iae
    public void H1(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9ca3a0", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BaseLayoutService", "onStopService triggerType:" + iComponentLifecycle$TriggerType, null, 4, null);
        COMPONENT component = this.b;
        ckf.d(component);
        component.onStop(iComponentLifecycle$TriggerType);
    }

    @Override // tb.vjc
    public COMPONENT I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (COMPONENT) ((fwa) ipChange.ipc$dispatch("afa100bb", new Object[]{this}));
        }
        tpu.a.b(tpu.Companion, "BaseLayoutService", "getLayoutComponent", null, 4, null);
        if (this.b == null) {
            qpu qpuVar = this.f28993a;
            if (qpuVar != null) {
                this.b = (COMPONENT) ((ttg) this).r(qpuVar);
            } else {
                ckf.y("context");
                throw null;
            }
        }
        COMPONENT component = this.b;
        ckf.d(component);
        return component;
    }

    @Override // tb.iae
    public void I0(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48b848b", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BaseLayoutService", "onResumeService triggerType:" + iComponentLifecycle$TriggerType, null, 4, null);
        COMPONENT component = this.b;
        ckf.d(component);
        component.onResume(iComponentLifecycle$TriggerType);
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "BaseLayoutService", "onCreateService", null, 4, null);
        this.f28993a = qpuVar;
        ((b7d) qpuVar.getService(b7d.class)).e1(this);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "BaseLayoutService", "onDestroyService", null, 4, null);
        ((b7d) qpuVar.getService(b7d.class)).T0(this);
    }

    @Override // tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
        } else {
            tpu.a.b(tpu.Companion, "BaseLayoutService", "onPageCreate", null, 4, null);
        }
    }

    @Override // tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "BaseLayoutService", "onPageDestroy", null, 4, null);
        COMPONENT component = this.b;
        ckf.d(component);
        component.onDestroy(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
    }

    @Override // tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "BaseLayoutService", "onPagePause", null, 4, null);
        H0(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
    }

    @Override // tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "BaseLayoutService", "onPageResume", null, 4, null);
        I0(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
    }

    @Override // tb.p6d
    public void onPageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
        } else {
            r1(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
        }
    }

    @Override // tb.p6d
    public void onPageStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d0eb7", new Object[]{this});
        } else {
            H1(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
        }
    }

    @Override // tb.iae
    public void r1(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a79875e2", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BaseLayoutService", "onStartService triggerType:" + iComponentLifecycle$TriggerType, null, 4, null);
        COMPONENT component = this.b;
        ckf.d(component);
        component.onStart(iComponentLifecycle$TriggerType);
    }
}
