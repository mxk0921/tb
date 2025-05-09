package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.service.drawer.component.DrawerContainerComponent;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ky7 implements c1c, umd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f23000a;
    public DrawerContainerComponent b;
    public final iy7 c = new iy7();
    public boolean d = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455525);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455524);
        t2o.a(916455441);
        t2o.a(919601330);
    }

    @Override // tb.c1c
    public boolean D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("374b4114", new Object[]{this})).booleanValue();
        }
        tpu.a.b(tpu.Companion, "DrawerContainerService", "关闭抽屉", null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            return drawerContainerComponent.m();
        }
        ckf.y("drawerContainerComponent");
        throw null;
    }

    @Override // tb.c1c
    public DrawerModel.DrawerGravity E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel.DrawerGravity) ipChange.ipc$dispatch("1e2cde54", new Object[]{this, str});
        }
        ckf.g(str, "drawerId");
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            return drawerContainerComponent.p(str);
        }
        ckf.y("drawerContainerComponent");
        throw null;
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
        tpu.a.b(aVar, "DrawerContainerService", "服务暂停的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            drawerContainerComponent.onPause(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("drawerContainerComponent");
            throw null;
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
        tpu.a.b(aVar, "DrawerContainerService", "服务停止的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            drawerContainerComponent.onStop(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("drawerContainerComponent");
            throw null;
        }
    }

    @Override // tb.c1c
    public boolean K(IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fa1481c", new Object[]{this, triggerType})).booleanValue();
        }
        ckf.g(triggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerService", "处理返回，triggerType=" + triggerType, null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            return drawerContainerComponent.handleBack(triggerType);
        }
        ckf.y("drawerContainerComponent");
        throw null;
    }

    @Override // tb.c1c
    public boolean S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4840fd3", new Object[]{this})).booleanValue();
        }
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            return drawerContainerComponent.s();
        }
        ckf.y("drawerContainerComponent");
        throw null;
    }

    @Override // tb.c1c
    public boolean V(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("634db84e", new Object[]{this, drawerGravity})).booleanValue();
        }
        ckf.g(drawerGravity, "drawerGravity");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerService", "打开指定抽屉，drawerGravity=" + drawerGravity, null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            return drawerContainerComponent.w(drawerGravity);
        }
        ckf.y("drawerContainerComponent");
        throw null;
    }

    @Override // tb.c1c
    public void V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd7f4cd", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "DrawerContainerService", "恢复清除所有视图（抽屉和多Tab除外）", null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            drawerContainerComponent.y();
        } else {
            ckf.y("drawerContainerComponent");
            throw null;
        }
    }

    @Override // tb.c1c
    public b1c Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b1c) ipChange.ipc$dispatch("a3fbc31d", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.c1c
    public void i(BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be86f4e7", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerService", "处理外部消息，message=" + bVar, null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            drawerContainerComponent.handleOuterMessage(bVar);
        } else {
            ckf.y("drawerContainerComponent");
            throw null;
        }
    }

    @Override // tb.c1c
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594a6bb", new Object[]{this, new Boolean(z)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerService", "设置是否可以滚动，enableScroll=" + z, null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            drawerContainerComponent.A(z);
        } else {
            ckf.y("drawerContainerComponent");
            throw null;
        }
    }

    @Override // tb.c1c
    public boolean n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83327583", new Object[]{this})).booleanValue();
        }
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            if (!drawerContainerComponent.t(DrawerModel.DrawerGravity.LEFT)) {
                DrawerContainerComponent drawerContainerComponent2 = this.b;
                if (drawerContainerComponent2 == null) {
                    ckf.y("drawerContainerComponent");
                    throw null;
                } else if (!drawerContainerComponent2.t(DrawerModel.DrawerGravity.RIGHT)) {
                    return false;
                }
            }
            return true;
        }
        ckf.y("drawerContainerComponent");
        throw null;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "DrawerContainerService", "服务创建的时机", null, 4, null);
        this.f23000a = qpuVar;
        DrawerContainerComponent drawerContainerComponent = new DrawerContainerComponent(qpuVar, this.c);
        this.b = drawerContainerComponent;
        drawerContainerComponent.onCreate(null, IComponentLifecycle$TriggerType.UNSPECIFIED);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "DrawerContainerService", "服务销毁的时机", null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            drawerContainerComponent.onDestroy(IComponentLifecycle$TriggerType.UNSPECIFIED);
            qpu qpuVar2 = this.f23000a;
            if (qpuVar2 != null) {
                ((vmd) qpuVar2.getService(vmd.class)).B(this);
            } else {
                ckf.y("turboEngineContext");
                throw null;
            }
        } else {
            ckf.y("drawerContainerComponent");
            throw null;
        }
    }

    /* renamed from: r */
    public void Z0(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778f7a72", new Object[]{this, pageModel});
            return;
        }
        ckf.g(pageModel, "data");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerService", "设置抽屉容器数据，data=" + pageModel, null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            drawerContainerComponent.updateData(pageModel);
        } else {
            ckf.y("drawerContainerComponent");
            throw null;
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
        tpu.a.b(aVar, "DrawerContainerService", "服务启动的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            drawerContainerComponent.onStart(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("drawerContainerComponent");
            throw null;
        }
    }

    @Override // tb.c1c
    public DrawerModel.DrawerGravity w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel.DrawerGravity) ipChange.ipc$dispatch("5b35cf3d", new Object[]{this});
        }
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            return drawerContainerComponent.n();
        }
        ckf.y("drawerContainerComponent");
        throw null;
    }

    @Override // tb.c1c
    public DrawerModel y0(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel) ipChange.ipc$dispatch("ab7c2d57", new Object[]{this, drawerGravity});
        }
        ckf.g(drawerGravity, "drawerGravity");
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            return drawerContainerComponent.o(drawerGravity);
        }
        ckf.y("drawerContainerComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    @Override // tb.iae
    public View z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5e7be40a", new Object[]{this});
        }
        tpu.a.b(tpu.Companion, "DrawerContainerService", "创建抽屉容器视图", null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            return drawerContainerComponent.createView();
        }
        ckf.y("drawerContainerComponent");
        throw null;
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
        tpu.a.b(aVar, "DrawerContainerService", "服务恢复的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        DrawerContainerComponent drawerContainerComponent = this.b;
        if (drawerContainerComponent != null) {
            drawerContainerComponent.onResume(iComponentLifecycle$TriggerType);
            if (this.d) {
                this.d = false;
                qpu qpuVar = this.f23000a;
                if (qpuVar != null) {
                    vmd vmdVar = (vmd) qpuVar.getService(vmd.class);
                    vmdVar.d1(nuo.MSG_CLOSE_DRAWER);
                    vmdVar.r(this);
                    return;
                }
                ckf.y("turboEngineContext");
                throw null;
            }
            return;
        }
        ckf.y("drawerContainerComponent");
        throw null;
    }

    @Override // tb.umd
    public boolean x(nuo nuoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a060199f", new Object[]{this, nuoVar})).booleanValue();
        }
        ckf.g(nuoVar, "schedulerMessage");
        if (!ckf.b(nuoVar.c(), nuo.MSG_CLOSE_DRAWER)) {
            return false;
        }
        D1();
        return true;
    }
}
