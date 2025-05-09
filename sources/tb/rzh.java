package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.service.drawer.adapter.DrawerContainerAdapter;
import com.taobao.android.turbo.service.drawer.view.DrawerContainerView;
import java.util.LinkedHashSet;
import java.util.Set;
import tb.tjb;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class rzh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public DrawerContainerView f27695a;
    public DrawerContainerAdapter b;
    public final qpu c;
    public final xyh d;
    public final cy7 e;
    public final iy7 f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455540);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455539);
    }

    public rzh(qpu qpuVar, xyh xyhVar, cy7 cy7Var, iy7 iy7Var) {
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(xyhVar, "mainContainerComponent");
        ckf.g(cy7Var, "drawerComponentManager");
        ckf.g(iy7Var, "drawerContainerRegistry");
        this.c = qpuVar;
        this.d = xyhVar;
        this.e = cy7Var;
        this.f = iy7Var;
    }

    public final DrawerModel.DrawerGravity a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel.DrawerGravity) ipChange.ipc$dispatch("479a7989", new Object[]{this, new Integer(i)});
        }
        DrawerContainerAdapter drawerContainerAdapter = this.b;
        if (drawerContainerAdapter != null) {
            return drawerContainerAdapter.j(i);
        }
        return null;
    }

    public final String b(DrawerModel.DrawerGravity drawerGravity) {
        DrawerModel drawerModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d72f", new Object[]{this, drawerGravity});
        }
        DrawerContainerAdapter drawerContainerAdapter = this.b;
        if (drawerContainerAdapter != null) {
            drawerModel = drawerContainerAdapter.h(drawerGravity);
        } else {
            drawerModel = null;
        }
        if (drawerModel != null) {
            return drawerModel.getId();
        }
        return null;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f132d55", new Object[]{this})).intValue();
        }
        DrawerContainerAdapter drawerContainerAdapter = this.b;
        if (drawerContainerAdapter != null) {
            return drawerContainerAdapter.n();
        }
        return -1;
    }

    public final boolean d(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c438caf", new Object[]{this, drawerGravity})).booleanValue();
        }
        DrawerContainerAdapter drawerContainerAdapter = this.b;
        if (drawerContainerAdapter != null) {
            return drawerContainerAdapter.q(drawerGravity);
        }
        return false;
    }

    public final void e(boolean z, DrawerModel.DrawerGravity drawerGravity, BaseComponent.State state, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bbe996", new Object[]{this, new Boolean(z), drawerGravity, state, iComponentLifecycle$TriggerType});
        } else if (z) {
            BaseComponent.State.a aVar = BaseComponent.State.Companion;
            if (aVar.a(state)) {
                i(drawerGravity, iComponentLifecycle$TriggerType);
                x();
            }
            if (aVar.d(state)) {
                l(drawerGravity, iComponentLifecycle$TriggerType);
            }
        } else {
            BaseComponent.State.a aVar2 = BaseComponent.State.Companion;
            if (aVar2.c(state)) {
                k(drawerGravity, iComponentLifecycle$TriggerType);
            }
            if (aVar2.b(state)) {
                u();
                y(iComponentLifecycle$TriggerType);
                j(drawerGravity, iComponentLifecycle$TriggerType);
            }
        }
    }

    public final void f(boolean z, DrawerModel.DrawerGravity drawerGravity, BaseComponent.State state, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91f158e", new Object[]{this, new Boolean(z), drawerGravity, state, iComponentLifecycle$TriggerType});
        } else if (z) {
            BaseComponent.State.a aVar = BaseComponent.State.Companion;
            if (aVar.a(state)) {
                this.d.onPause(iComponentLifecycle$TriggerType);
            }
            if (!aVar.d(state)) {
                return;
            }
            if (drawerGravity == null || d(drawerGravity)) {
                this.d.onStop(iComponentLifecycle$TriggerType);
            }
        } else {
            BaseComponent.State.a aVar2 = BaseComponent.State.Companion;
            if (aVar2.c(state) && (drawerGravity == null || d(drawerGravity))) {
                this.d.onStart(iComponentLifecycle$TriggerType);
            }
            if (aVar2.b(state)) {
                this.d.onResume(iComponentLifecycle$TriggerType);
            }
        }
    }

    public final void g(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bb9944", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        this.e.g(iComponentLifecycle$TriggerType);
        DrawerContainerAdapter drawerContainerAdapter = this.b;
        Set<DrawerModel.DrawerGravity> i = drawerContainerAdapter != null ? drawerContainerAdapter.i() : null;
        if (i != null) {
            for (DrawerModel.DrawerGravity drawerGravity : i) {
                String b = b(drawerGravity);
                if (b != null) {
                    this.f.c(b, iComponentLifecycle$TriggerType);
                }
            }
        }
    }

    public final void h(DrawerModel.DrawerGravity drawerGravity, DrawerModel drawerModel, BaseSubPageComponent<DrawerModel, ?> baseSubPageComponent, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fc305b2", new Object[]{this, drawerGravity, drawerModel, baseSubPageComponent, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(drawerModel, "drawerData");
        ckf.g(baseSubPageComponent, "drawerComponent");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        this.e.h(drawerGravity, drawerModel, baseSubPageComponent, iComponentLifecycle$TriggerType);
        this.f.b(drawerModel, iComponentLifecycle$TriggerType);
    }

    public final void i(DrawerModel.DrawerGravity drawerGravity, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb089ef", new Object[]{this, drawerGravity, iComponentLifecycle$TriggerType});
            return;
        }
        this.e.j(drawerGravity, iComponentLifecycle$TriggerType);
        String b = b(drawerGravity);
        if (b != null) {
            this.f.g(b, iComponentLifecycle$TriggerType);
        }
    }

    public final void j(DrawerModel.DrawerGravity drawerGravity, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c4d2186", new Object[]{this, drawerGravity, iComponentLifecycle$TriggerType});
            return;
        }
        this.e.l(drawerGravity, iComponentLifecycle$TriggerType);
        String b = b(drawerGravity);
        if (b != null) {
            this.f.h(b, iComponentLifecycle$TriggerType);
        }
    }

    public final void k(DrawerModel.DrawerGravity drawerGravity, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d9da03", new Object[]{this, drawerGravity, iComponentLifecycle$TriggerType});
            return;
        }
        this.e.m(drawerGravity, iComponentLifecycle$TriggerType);
        String b = b(drawerGravity);
        if (b != null) {
            this.f.i(b, iComponentLifecycle$TriggerType);
        }
    }

    public final void l(DrawerModel.DrawerGravity drawerGravity, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d115d1", new Object[]{this, drawerGravity, iComponentLifecycle$TriggerType});
            return;
        }
        this.e.n(drawerGravity, iComponentLifecycle$TriggerType);
        String b = b(drawerGravity);
        if (b != null) {
            this.f.j(b, iComponentLifecycle$TriggerType);
        }
    }

    public final void n(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        Set<DrawerModel.DrawerGravity> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44fc1b48", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        DrawerContainerAdapter drawerContainerAdapter = this.b;
        if (drawerContainerAdapter == null || (set = drawerContainerAdapter.i()) == null) {
            set = new LinkedHashSet<>();
        }
        for (DrawerModel.DrawerGravity drawerGravity : this.e.k(set, iComponentLifecycle$TriggerType)) {
            String b = b(drawerGravity);
            if (b != null) {
                this.f.c(b, iComponentLifecycle$TriggerType);
            }
        }
    }

    public final void o(PageModel pageModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c188", new Object[]{this, pageModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        this.d.onCreate(pageModel, IComponentLifecycle$TriggerType.UNSPECIFIED);
    }

    public final void p(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149b2ab", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        this.d.onDestroy(iComponentLifecycle$TriggerType);
        g(iComponentLifecycle$TriggerType);
    }

    public final void q(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca866f", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        DrawerContainerView drawerContainerView = this.f27695a;
        int currentItem = drawerContainerView != null ? drawerContainerView.getCurrentItem() : -1;
        if (currentItem == c()) {
            this.d.onPause(iComponentLifecycle$TriggerType);
            return;
        }
        DrawerModel.DrawerGravity a2 = a(currentItem);
        if (a2 != null) {
            i(a2, iComponentLifecycle$TriggerType);
            x();
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerMainLifecycleNotifier", "抽屉容器暂停的时机，未知的位置，currentItem=" + currentItem, null, 4, null);
    }

    public final void r(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233e2696", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        DrawerContainerView drawerContainerView = this.f27695a;
        int currentItem = drawerContainerView != null ? drawerContainerView.getCurrentItem() : -1;
        if (currentItem == c()) {
            this.d.onResume(iComponentLifecycle$TriggerType);
            return;
        }
        DrawerModel.DrawerGravity a2 = a(currentItem);
        if (a2 != null) {
            u();
            y(iComponentLifecycle$TriggerType);
            j(a2, iComponentLifecycle$TriggerType);
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerMainLifecycleNotifier", "抽屉容器恢复的时机，未知的位置，currentItem=" + currentItem, null, 4, null);
    }

    public final void s(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc71783", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        DrawerContainerView drawerContainerView = this.f27695a;
        int currentItem = drawerContainerView != null ? drawerContainerView.getCurrentItem() : -1;
        if (currentItem == c()) {
            this.d.onStart(iComponentLifecycle$TriggerType);
            return;
        }
        DrawerModel.DrawerGravity a2 = a(currentItem);
        if (a2 != null) {
            k(a2, iComponentLifecycle$TriggerType);
            if (!d(a2)) {
                this.d.onStart(iComponentLifecycle$TriggerType);
                return;
            }
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerMainLifecycleNotifier", "抽屉容器启动的时机，未知的位置，currentItem=" + currentItem, null, 4, null);
    }

    public final void t(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def748a1", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        DrawerContainerView drawerContainerView = this.f27695a;
        int currentItem = drawerContainerView != null ? drawerContainerView.getCurrentItem() : -1;
        if (currentItem == c()) {
            this.d.onStop(iComponentLifecycle$TriggerType);
            return;
        }
        DrawerModel.DrawerGravity a2 = a(currentItem);
        if (a2 != null) {
            l(a2, iComponentLifecycle$TriggerType);
            if (!d(a2)) {
                this.d.onStop(iComponentLifecycle$TriggerType);
                return;
            }
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerMainLifecycleNotifier", "抽屉容器停止的时机，未知的位置，currentItem=" + currentItem, null, 4, null);
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7e01b3", new Object[]{this});
            return;
        }
        c1c c1cVar = (c1c) this.c.getService(c1c.class);
        tjb tjbVar = (tjb) this.c.getService(tjb.class);
        c1cVar.k(true);
        c1cVar.V0();
        if (!this.c.a().r()) {
            tjb.a.a(tjbVar, false, false, 2, null);
        }
    }

    public final void v(DrawerContainerAdapter drawerContainerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e562e58", new Object[]{this, drawerContainerAdapter});
        } else {
            this.b = drawerContainerAdapter;
        }
    }

    public final void w(DrawerContainerView drawerContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c759f3e", new Object[]{this, drawerContainerView});
        } else {
            this.f27695a = drawerContainerView;
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0263a2", new Object[]{this});
        } else {
            ((f2e) this.c.getService(f2e.class)).q0();
        }
    }

    public final void y(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0472ec", new Object[]{this, iComponentLifecycle$TriggerType});
        } else {
            ((f2e) this.c.getService(f2e.class)).f1(null, iComponentLifecycle$TriggerType);
        }
    }

    public final void m(boolean z, DrawerModel.DrawerGravity drawerGravity, boolean z2, DrawerModel.DrawerGravity drawerGravity2, BaseComponent.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959e91b2", new Object[]{this, new Boolean(z), drawerGravity, new Boolean(z2), drawerGravity2, state});
            return;
        }
        ckf.g(state, "parentState");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerMainLifecycleNotifier", "在主容器或抽屉选中时通知，isLastMain=" + z + "，lastDrawerGravity=" + drawerGravity + "，isCurrentMain=" + z2 + "，currentDrawerGravity=" + drawerGravity2 + "，parentState=" + state, null, 4, null);
        IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.DRAWER_OPEN_CLOSE;
        if (z != z2 || drawerGravity != drawerGravity2) {
            if (z && drawerGravity == null) {
                f(true, drawerGravity2, state, iComponentLifecycle$TriggerType);
            } else if (!z && drawerGravity != null) {
                e(true, drawerGravity, state, iComponentLifecycle$TriggerType);
            }
            if (z2 && drawerGravity2 == null) {
                f(false, drawerGravity, state, iComponentLifecycle$TriggerType);
            } else if (!z2 && drawerGravity2 != null) {
                e(false, drawerGravity2, state, iComponentLifecycle$TriggerType);
            }
        }
    }
}
