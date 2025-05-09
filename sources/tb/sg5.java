package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dressup.common.model.CardModel;
import com.taobao.android.turbo.core.component.BaseComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import tb.rwb;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sg5 extends fwa<CardModel, View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public DXRootView e;
    public FrameLayout f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552614);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements rwb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rwb.a
        public void onFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
            } else {
                sg5.t(sg5.this, false);
            }
        }

        @Override // tb.rwb.a
        public void a(DXRootView dXRootView, DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1818eac", new Object[]{this, dXRootView, dXTemplateItem});
                return;
            }
            ckf.g(dXRootView, "dxRootView");
            ckf.g(dXTemplateItem, "template");
            sg5.t(sg5.this, false);
            if (sg5.this.v() == null) {
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, ug5.TAG, "createDXRootView onCreate callback, template:" + dXTemplateItem, null, 4, null);
                sg5.this.A(dXRootView);
                sg5.s(sg5.this).addView(dXRootView, new FrameLayout.LayoutParams(-2, -2));
                sg5 sg5Var = sg5.this;
                sg5Var.y(dXTemplateItem, (l18) sg5Var.getData());
                return;
            }
            DXRootView v = sg5.this.v();
            ckf.d(v);
            if (v.getDxTemplateItem().b != dXTemplateItem.b) {
                tpu.a aVar2 = tpu.Companion;
                tpu.a.b(aVar2, ug5.TAG, "createDXRootView onCreate callback, version update,  template:" + dXTemplateItem, null, 4, null);
                if (((Boolean) ud0.Companion.b().c("weitao_switch.enableRefreshDX", Boolean.TRUE)).booleanValue()) {
                    sg5 sg5Var2 = sg5.this;
                    sg5Var2.y(dXTemplateItem, (l18) sg5Var2.getData());
                }
            }
        }
    }

    static {
        t2o.a(918552613);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg5(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(sg5 sg5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -258772824:
                super.onResume((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -128189347:
                super.onCreate(objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
                return null;
            case 916714806:
                super.updateDataImpl(objArr[0]);
                return null;
            case 1484435997:
                super.onPause((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/component/dx/DXComponent");
        }
    }

    public static final /* synthetic */ FrameLayout s(sg5 sg5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("550a8d6e", new Object[]{sg5Var});
        }
        FrameLayout frameLayout = sg5Var.f;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootView");
        throw null;
    }

    public static final /* synthetic */ void t(sg5 sg5Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ae28b6", new Object[]{sg5Var, new Boolean(z)});
        } else {
            sg5Var.g = z;
        }
    }

    public final void A(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808020e5", new Object[]{this, dXRootView});
        } else {
            this.e = dXRootView;
        }
    }

    /* renamed from: C */
    public void updateDataImpl(CardModel cardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e8f88", new Object[]{this, cardModel});
            return;
        }
        ckf.g(cardModel, "data");
        super.updateDataImpl(cardModel);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, ug5.TAG, "updateDataImpl data:" + cardModel, null, 4, null);
        l18 l18Var = (l18) cardModel;
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = l18Var.b();
        dXTemplateItem.b = l18Var.d();
        dXTemplateItem.c = l18Var.c();
        u(dXTemplateItem);
        y(dXTemplateItem, l18Var);
    }

    @Override // tb.fwa
    public String getComponentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5df1a77", new Object[]{this});
        }
        return ug5.TAG;
    }

    @Override // tb.fwa, com.taobao.android.turbo.core.component.BaseComponent
    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onPause(iComponentLifecycle$TriggerType);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, ug5.TAG, "onPause triggerType:" + iComponentLifecycle$TriggerType, null, 4, null);
        DXRootView dXRootView = this.e;
        if (dXRootView != null) {
            ((rwb) o().getService(rwb.class)).d().u0(dXRootView);
        }
    }

    @Override // tb.fwa, com.taobao.android.turbo.core.component.BaseComponent
    public void onResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09370a8", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onResume(iComponentLifecycle$TriggerType);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, ug5.TAG, "onResume triggerType:" + iComponentLifecycle$TriggerType, null, 4, null);
        DXRootView dXRootView = this.e;
        if (dXRootView != null) {
            ((rwb) o().getService(rwb.class)).d().t0(dXRootView);
        }
    }

    public final void u(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a92d87", new Object[]{this, dXTemplateItem});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, ug5.TAG, "createDXRootView template:" + dXTemplateItem, null, 4, null);
        if (this.e == null && !this.g) {
            this.g = true;
            z(dXTemplateItem, new b());
        }
    }

    public final DXRootView v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("f4259b7f", new Object[]{this});
        }
        return this.e;
    }

    public boolean w(CardModel cardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebff6457", new Object[]{this, cardModel})).booleanValue();
        }
        ckf.g(cardModel, "data");
        return true;
    }

    /* renamed from: x */
    public void onCreate(CardModel cardModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c2b11b", new Object[]{this, cardModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onCreate(cardModel, iComponentLifecycle$TriggerType);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, ug5.TAG, "onCreate data:" + cardModel + " triggerType:" + iComponentLifecycle$TriggerType, null, 4, null);
        this.f = new FrameLayout(getContext());
        if (!(cardModel instanceof l18)) {
            cardModel = null;
        }
        l18 l18Var = (l18) cardModel;
        if (l18Var != null) {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f7343a = l18Var.b();
            dXTemplateItem.b = l18Var.d();
            dXTemplateItem.c = l18Var.c();
            u(dXTemplateItem);
        }
    }

    public void y(DXTemplateItem dXTemplateItem, l18 l18Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2863c7e2", new Object[]{this, dXTemplateItem, l18Var});
            return;
        }
        ckf.g(dXTemplateItem, "template");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, ug5.TAG, "renderDXTemplate template:" + dXTemplateItem + " data:" + l18Var, null, 4, null);
        rwb rwbVar = (rwb) o().getService(rwb.class);
        DXRootView dXRootView = this.e;
        if (dXRootView != null) {
            rwbVar.R0(dXRootView, dXTemplateItem, l18Var);
            if (getState() == BaseComponent.State.RESUME) {
                rwbVar.d().t0(dXRootView);
            }
        }
    }

    public void z(DXTemplateItem dXTemplateItem, rwb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc8d7b0", new Object[]{this, dXTemplateItem, aVar});
            return;
        }
        ckf.g(dXTemplateItem, "template");
        ckf.g(aVar, "callback");
        ((rwb) o().getService(rwb.class)).o1(dXTemplateItem, aVar);
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootView");
        throw null;
    }
}
