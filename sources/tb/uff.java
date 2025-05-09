package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.TurboEngineConfig;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.model.TabModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class uff implements yfc, o2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f29338a;
    public xey<?> b;
    public final List<BaseOuterComponent.b> c = new ArrayList();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                uff.r(uff.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        static {
            t2o.a(916455547);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455546);
        t2o.a(916455443);
        t2o.a(919601295);
    }

    public static final /* synthetic */ void r(uff uffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6e0019", new Object[]{uffVar});
        } else {
            uffVar.L();
        }
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
        tpu.a.b(aVar, "InteractContainerService", "服务暂停的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        xey<?> xeyVar = this.b;
        if (xeyVar != null) {
            xeyVar.onPause(iComponentLifecycle$TriggerType);
        }
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
        tpu.a.b(aVar, "InteractContainerService", "服务停止的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        xey<?> xeyVar = this.b;
        if (xeyVar != null) {
            xeyVar.onStop(iComponentLifecycle$TriggerType);
        }
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
        tpu.a.b(aVar, "InteractContainerService", "服务恢复的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        xey<?> xeyVar = this.b;
        if (xeyVar != null) {
            xeyVar.onResume(iComponentLifecycle$TriggerType);
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd031a2f", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "InteractContainerService", "引擎可见, 创建互动容器组件", null, 4, null);
        qpu qpuVar = this.f29338a;
        if (qpuVar != null) {
            xey<?> f = f(qpuVar);
            this.b = f;
            if (f != null) {
                f.onCreate(null, IComponentLifecycle$TriggerType.UNSPECIFIED);
            }
            x();
            z0();
            c0();
            return;
        }
        ckf.y("context");
        throw null;
    }

    public final boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35df573b", new Object[]{this})).booleanValue();
        }
        return ((Boolean) ud0.Companion.b().c("weitao_switch.isCancelDelayCreateInteractComponent", Boolean.TRUE)).booleanValue();
    }

    public final xey<?> f(qpu qpuVar) {
        BaseOuterComponent<?, ?> baseOuterComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xey) ipChange.ipc$dispatch("df5c599d", new Object[]{this, qpuVar});
        }
        TurboEngineConfig a2 = qpuVar.a();
        s4d g = a2.g();
        xey<?> xeyVar = null;
        if (g != null) {
            baseOuterComponent = g.getOuterComponentClasses(BaseOuterComponent.OuterComponentType.INTERACT_CONTAINER, BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER, qpuVar.getContext(), a2.f(), a2.n(), qpuVar.getInstanceId(), new dps(qpuVar));
        } else {
            baseOuterComponent = null;
        }
        if (baseOuterComponent instanceof xey) {
            xeyVar = baseOuterComponent;
        }
        return xeyVar;
    }

    @Override // tb.yfc
    public void i(BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be86f4e7", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "InteractContainerService", "处理外部消息，message=" + bVar, null, 4, null);
        xey<?> xeyVar = this.b;
        if (xeyVar == null) {
            ((ArrayList) this.c).add(bVar);
        } else if (xeyVar != null) {
            xeyVar.handleOuterMessage(bVar);
        }
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "InteractContainerService", "服务创建的时机", null, 4, null);
        this.f29338a = qpuVar;
        ((q2c) qpuVar.getService(q2c.class)).r(this);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "InteractContainerService", "服务销毁的时机", null, 4, null);
        xey<?> xeyVar = this.b;
        if (xeyVar != null) {
            xeyVar.onDestroy(IComponentLifecycle$TriggerType.UNSPECIFIED);
        }
        ((q2c) qpuVar.getService(q2c.class)).x(this);
    }

    @Override // tb.o2c
    public void onReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1a118b", new Object[]{this});
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
        if (engineState != EngineState.VISIBLE) {
            return;
        }
        if (!m0() || M()) {
            L();
            return;
        }
        tpu.a.b(tpu.Companion, "InteractContainerService", "引擎可见, 需要delay创建组件", null, 4, null);
        zrt.Companion.d(new a(), 3000L);
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
        tpu.a.b(aVar, "InteractContainerService", "服务启动的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        xey<?> xeyVar = this.b;
        if (xeyVar != null) {
            xeyVar.onStart(iComponentLifecycle$TriggerType);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85985167", new Object[]{this});
            return;
        }
        View z = z();
        z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        qpu qpuVar = this.f29338a;
        if (qpuVar != null) {
            ((b7d) qpuVar.getService(b7d.class)).getView().addView(z);
        } else {
            ckf.y("context");
            throw null;
        }
    }

    @Override // tb.iae
    public View z() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5e7be40a", new Object[]{this});
        }
        tpu.a.b(tpu.Companion, "InteractContainerService", "创建互动容器视图", null, 4, null);
        xey<?> xeyVar = this.b;
        if (xeyVar == null || (view = xeyVar.createView()) == null) {
            qpu qpuVar = this.f29338a;
            if (qpuVar != null) {
                view = new View(qpuVar.getContext());
            } else {
                ckf.y("context");
                throw null;
            }
        }
        return view;
    }

    public final void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6d6640", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            BaseOuterComponent.b bVar = (BaseOuterComponent.b) it.next();
            xey<?> xeyVar = this.b;
            if (xeyVar != null) {
                xeyVar.handleOuterMessage(bVar);
            }
        }
        ((ArrayList) this.c).clear();
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfd2e9c", new Object[]{this});
            return;
        }
        qpu qpuVar = this.f29338a;
        if (qpuVar != null) {
            int pageState = ((b7d) qpuVar.getService(b7d.class)).getPageState();
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "InteractContainerService", "moveInteract2TargetState pageState=" + pageState, null, 4, null);
            if (pageState == 1) {
                xey<?> xeyVar = this.b;
                if (xeyVar != null) {
                    xeyVar.onStart(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                }
            } else if (pageState == 2) {
                xey<?> xeyVar2 = this.b;
                if (xeyVar2 != null) {
                    xeyVar2.onStart(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                }
                xey<?> xeyVar3 = this.b;
                if (xeyVar3 != null) {
                    xeyVar3.onResume(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                }
            } else if (pageState == 3) {
                xey<?> xeyVar4 = this.b;
                if (xeyVar4 != null) {
                    xeyVar4.onStart(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                }
                xey<?> xeyVar5 = this.b;
                if (xeyVar5 != null) {
                    xeyVar5.onResume(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                }
                xey<?> xeyVar6 = this.b;
                if (xeyVar6 != null) {
                    xeyVar6.onPause(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                }
            } else if (pageState == 4) {
                xey<?> xeyVar7 = this.b;
                if (xeyVar7 != null) {
                    xeyVar7.onStart(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                }
                xey<?> xeyVar8 = this.b;
                if (xeyVar8 != null) {
                    xeyVar8.onResume(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                }
                xey<?> xeyVar9 = this.b;
                if (xeyVar9 != null) {
                    xeyVar9.onPause(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                }
                xey<?> xeyVar10 = this.b;
                if (xeyVar10 != null) {
                    xeyVar10.onStop(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                }
            }
        } else {
            ckf.y("context");
            throw null;
        }
    }

    @Override // tb.yfc
    public boolean d(String str, IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("899b9d92", new Object[]{this, str, triggerType})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(triggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "InteractContainerService", "处理返回，tabId=" + str + "，triggerType=" + triggerType, null, 4, null);
        xey<?> xeyVar = this.b;
        if (xeyVar != null) {
            return xeyVar.handleBack(str, triggerType);
        }
        return false;
    }

    public final boolean m0() {
        boolean z;
        qpu qpuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84a108f5", new Object[]{this})).booleanValue();
        }
        qpu qpuVar2 = this.f29338a;
        if (qpuVar2 != null) {
            xwc xwcVar = (xwc) qpuVar2.getService(xwc.class);
            TabModel d0 = xwcVar.d0(xwcVar.getCurrentIndex());
            boolean b2 = ckf.b(d0 != null ? d0.getId() : null, "video");
            try {
                qpuVar = this.f29338a;
            } catch (Throwable unused) {
                z = false;
            }
            if (qpuVar != null) {
                z = s0j.r(qpuVar.getContext());
                return b2 && !z;
            }
            ckf.y("context");
            throw null;
        }
        ckf.y("context");
        throw null;
    }
}
