package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.tab2interact.core.layer.h5.H5InteractLayer;
import com.taobao.tab2interact.core.layer.h5.view.H5InteractLayerWebView;
import com.taobao.tab2interact.pageadapter.guangguang.turbo.message.observer.GGPageMessageObserver;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class bpa extends s7<Object> implements H5InteractLayer.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public final c e = new c();
    public final b f = new b();
    public final H5InteractLayer g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963224);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends GGPageMessageObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1412779590) {
                super.G((GGPageMessageObserver.InteractSwitchState) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/pageadapter/guangguang/turbo/layer/h5/H5InteractLayerGGPageAdapter$ggPageMessageObserver$1");
        }

        @Override // com.taobao.tab2interact.pageadapter.guangguang.turbo.message.observer.GGPageMessageObserver
        public void G(GGPageMessageObserver.InteractSwitchState interactSwitchState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54354e46", new Object[]{this, interactSwitchState});
                return;
            }
            ckf.g(interactSwitchState, "interactSwitchState");
            super.G(interactSwitchState);
            bpa.J(bpa.this, interactSwitchState);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c extends xff {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -1899672418) {
                super.i0();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/pageadapter/guangguang/turbo/layer/h5/H5InteractLayerGGPageAdapter$interactMessageObserver$1");
        }

        @Override // tb.xff
        public void i0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ec54c9e", new Object[]{this});
                return;
            }
            super.i0();
            bpa.I(bpa.this);
        }
    }

    static {
        t2o.a(689963223);
        t2o.a(689963121);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpa(jmi jmiVar, vv1 vv1Var, fll fllVar, H5InteractLayer h5InteractLayer) {
        super(jmiVar, vv1Var, fllVar);
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(fllVar, "pageBaseInfoManager");
        ckf.g(h5InteractLayer, "h5InteractLayer");
        this.g = h5InteractLayer;
        h5InteractLayer.S0(this);
    }

    public static final /* synthetic */ void I(bpa bpaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1787bc37", new Object[]{bpaVar});
        } else {
            bpaVar.K();
        }
    }

    public static final /* synthetic */ void J(bpa bpaVar, GGPageMessageObserver.InteractSwitchState interactSwitchState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6979d93d", new Object[]{bpaVar, interactSwitchState});
        } else {
            bpaVar.L(interactSwitchState);
        }
    }

    public static /* synthetic */ Object ipc$super(bpa bpaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -706673279) {
            super.v();
            return null;
        } else if (hashCode == 1350033330) {
            super.w();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/pageadapter/guangguang/turbo/layer/h5/H5InteractLayerGGPageAdapter");
        }
    }

    @Override // tb.u7
    public Object F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9136b232", new Object[]{this});
        }
        return null;
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a18b56", new Object[]{this});
            return;
        }
        vgh.c(this, "H5InteractLayerGGPageAdapter", "在互动开关引导弹窗中按钮点击的时机处理");
        kxd c2 = H().c();
        if (c2 == null) {
            vgh.c(this, "H5InteractLayerGGPageAdapter", "在互动开关引导弹窗中按钮点击的时机处理，serviceDelegate为空");
            return;
        }
        DrawerModel.DrawerGravity E = c2.E("sideProfile");
        if (E == null) {
            vgh.c(this, "H5InteractLayerGGPageAdapter", "在互动开关引导弹窗中按钮点击的时机处理，drawerGravity为空");
            return;
        }
        c2.V(E);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) BaseOuterComponent.b.NAME, a3a.HIGHLIGHT_INTERACT_SWITCH);
        jSONObject.put((JSONObject) "targetType", BaseOuterComponent.OuterComponentType.DRAWER.toString());
        jSONObject.put((JSONObject) "targetId", "sideProfile");
        b3a.INSTANCE.b(jSONObject, H(), null);
    }

    public final void L(GGPageMessageObserver.InteractSwitchState interactSwitchState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f08b4fe", new Object[]{this, interactSwitchState});
            return;
        }
        vgh.c(this, "H5InteractLayerGGPageAdapter", "在互动开关状态发生改变的时机处理，interactSwitchState=" + interactSwitchState);
        this.g.l1();
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d7a400", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a3a.INTERACT_SWITCH_STATE_CHANGE_NAME);
        b3a.INSTANCE.a(G(), arrayList, this.f);
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9acd3b6", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(vff.INTERACT_SWITCH_GUIDE_POP_BUTTON_CLICK_NAME);
        wff.INSTANCE.a(G(), arrayList, this.e);
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96353559", new Object[]{this});
        } else {
            b3a.INSTANCE.e(G(), this.f);
        }
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe43e4f", new Object[]{this});
        } else {
            wff.INSTANCE.e(G(), this.e);
        }
    }

    @Override // com.taobao.tab2interact.core.layer.h5.H5InteractLayer.b
    public void e(H5InteractLayerWebView h5InteractLayerWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd24a08", new Object[]{this, h5InteractLayerWebView});
            return;
        }
        ckf.g(h5InteractLayerWebView, "webView");
        h5InteractLayerWebView.setTag(R.id.h5_interact_layer_page_base_info_manager_tag, H());
    }

    @Override // tb.u7, tb.wx1
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e10581", new Object[]{this});
            return;
        }
        super.v();
        N();
        M();
    }

    @Override // tb.u7, tb.wx1
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5077dfb2", new Object[]{this});
            return;
        }
        super.w();
        P();
        O();
    }
}
