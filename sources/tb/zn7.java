package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.core.subservice.base.item.itemrenderservice.dinamic.utils.RecyclerViewScrollEventPost;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.taobao.R;
import tb.t56;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HAS_ENQUEUE_KEY = "enqueued";

    /* renamed from: a  reason: collision with root package name */
    public final cfc f32886a;
    public final DinamicXEngine b;
    public final IMainLifecycleService c;
    public final ICacheService d;
    public final IPullSecondFloorService e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends DXRootView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRootView f32887a;

        public a(DXRootView dXRootView) {
            this.f32887a = dXRootView;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/DinamicX3Render$1");
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void d(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0378a16", new Object[]{this, dXRootView});
                return;
            }
            zn7 zn7Var = zn7.this;
            DXRootView dXRootView2 = this.f32887a;
            zn7Var.r(dXRootView2, dXRootView2.getData());
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void f(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ba36c13", new Object[]{this, dXRootView});
                return;
            }
            zn7 zn7Var = zn7.this;
            DXRootView dXRootView2 = this.f32887a;
            zn7.b(zn7Var, dXRootView2, dXRootView2.getData());
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void k(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            } else if (i != 0) {
                zn7 zn7Var = zn7.this;
                DXRootView dXRootView = this.f32887a;
                zn7.b(zn7Var, dXRootView, dXRootView.getData());
            } else if (!zn7.a(zn7.this)) {
                zn7 zn7Var2 = zn7.this;
                DXRootView dXRootView2 = this.f32887a;
                zn7Var2.r(dXRootView2, dXRootView2.getData());
            }
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void m(DXRootView dXRootView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67771788", new Object[]{this, dXRootView, new Integer(i)});
            } else if (i != 0) {
                zn7 zn7Var = zn7.this;
                DXRootView dXRootView2 = this.f32887a;
                zn7.b(zn7Var, dXRootView2, dXRootView2.getData());
            } else if (!zn7.a(zn7.this)) {
                zn7 zn7Var2 = zn7.this;
                DXRootView dXRootView3 = this.f32887a;
                zn7Var2.r(dXRootView3, dXRootView3.getData());
            }
        }
    }

    static {
        t2o.a(486539336);
    }

    public zn7(cfc cfcVar, DinamicXEngine dinamicXEngine, wve wveVar) {
        this.f32886a = cfcVar;
        this.b = dinamicXEngine;
        this.c = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        this.d = (ICacheService) cfcVar.a(ICacheService.class);
        this.e = (IPullSecondFloorService) cfcVar.a(IPullSecondFloorService.class);
    }

    public static /* synthetic */ boolean a(zn7 zn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a11eafc0", new Object[]{zn7Var})).booleanValue();
        }
        return zn7Var.i();
    }

    public static /* synthetic */ void b(zn7 zn7Var, DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf978494", new Object[]{zn7Var, dXRootView, jSONObject});
        } else {
            zn7Var.s(dXRootView, jSONObject);
        }
    }

    public void c(View view, BaseSectionModel<?> baseSectionModel, fl6 fl6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed63bfd8", new Object[]{this, view, baseSectionModel, fl6Var});
        } else if (view instanceof DXRootView) {
            o((DXRootView) view, baseSectionModel, fl6Var);
        }
    }

    public View d(Context context, ViewGroup viewGroup, DXTemplateItem dXTemplateItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("874e28d4", new Object[]{this, context, viewGroup, dXTemplateItem, new Integer(i)});
        }
        DXTemplateItem u = this.b.u(dXTemplateItem);
        DXResult<DXRootView> dXResult = new DXResult<>();
        if (u != null) {
            fve.e("DinamicX3Render", "preCreateView name: " + u.f7343a + "version: " + u.b);
            dXResult = this.b.z0(context, u);
            fve.e("DinamicX3Render", "dxResult name:" + u.f7343a + " , hitStatus: " + dXResult.c());
        }
        DXRootView dXRootView = dXResult.f7291a;
        if (dXRootView != null) {
            n(dXRootView);
            dXResult.f7291a.setTag(R.id.item_hit_status, Integer.valueOf(dXResult.c()));
        }
        if (viewGroup == null) {
            fve.e("DinamicX3Render", "createDinamicView parent is null");
        }
        return dXResult.f7291a;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2514b82", new Object[]{this})).booleanValue();
        }
        return mve.a("enableChangeViewAppearFilterFlag", true);
    }

    public final RecyclerViewScrollEventPost f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewScrollEventPost) ipChange.ipc$dispatch("d468f38b", new Object[]{this});
        }
        ICacheService iCacheService = this.d;
        if (iCacheService != null) {
            return (RecyclerViewScrollEventPost) iCacheService.getCacheObject(RecyclerViewScrollEventPost.KEY_INFO_FLOW_SCROLL_EVENT_POST, RecyclerViewScrollEventPost.class);
        }
        fve.e("DinamicX3Render", "getRecyclerViewScrollEventPost mCacheService is null");
        return null;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("420e5a75", new Object[]{this})).booleanValue();
        }
        return h();
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb3b69b1", new Object[]{this})).booleanValue();
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService != null) {
            return iMainLifecycleService.isSelect();
        }
        fve.e("DinamicX3Render", "isCurrentTab sceneService == null");
        return true;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dde0d015", new Object[]{this})).booleanValue();
        }
        IPullSecondFloorService iPullSecondFloorService = this.e;
        if (iPullSecondFloorService == null || !iPullSecondFloorService.isOnPullSecondFloor()) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("817f864e", new Object[]{this})).booleanValue();
        }
        if (mve.a("enableFixInfoFlowUnselectStartSlider", true) || h()) {
            return false;
        }
        return true;
    }

    public void l(Context context, DXTemplateItem dXTemplateItem, BaseSectionModel<?> baseSectionModel, boolean z, int i, InfoFlowDxUserContext infoFlowDxUserContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13e1045", new Object[]{this, context, dXTemplateItem, baseSectionModel, new Boolean(z), new Integer(i), infoFlowDxUserContext});
        } else if (bve.m()) {
            m(context, dXTemplateItem, baseSectionModel, infoFlowDxUserContext);
        } else {
            k(context, dXTemplateItem, baseSectionModel, infoFlowDxUserContext);
        }
    }

    public final void n(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c8bcfb", new Object[]{this, dXRootView});
        } else {
            this.b.U0(dXRootView, new a(dXRootView));
        }
    }

    public final void p(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355de021", new Object[]{this, dXRootView});
            return;
        }
        RecyclerViewScrollEventPost f = f();
        if (f != null && f.o(f.b())) {
            f.p(dXRootView, true);
        }
    }

    public final void q(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd1568a7", new Object[]{this, dXRootView});
            return;
        }
        RecyclerViewScrollEventPost f = f();
        if (f != null) {
            f.p(dXRootView, false);
        }
    }

    public void r(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51dcca8e", new Object[]{this, dXRootView, jSONObject});
        } else if (!j() && dXRootView != null && jSONObject != null && TextUtils.isEmpty(jSONObject.getString("enqueued"))) {
            if (!e()) {
                jSONObject.put("enqueued", "y");
            }
            if (!g()) {
                fve.b("DinamicX3Render", "viewAppear: 不通知 appear");
                return;
            }
            if (e()) {
                jSONObject.put("enqueued", "y");
            }
            this.b.t0(dXRootView);
            p(dXRootView);
        }
    }

    public final void s(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a69832a", new Object[]{this, dXRootView, jSONObject});
        } else if (dXRootView != null && jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("enqueued"))) {
            fve.b("DinamicX3Render", "viewDisappear:", this.f32886a.getContainerType().getContainerId(), ", section:", e83.h(jSONObject));
            q(dXRootView);
            this.b.u0(dXRootView);
            jSONObject.remove("enqueued");
        }
    }

    public final void k(Context context, DXTemplateItem dXTemplateItem, BaseSectionModel<?> baseSectionModel, InfoFlowDxUserContext infoFlowDxUserContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac5e14", new Object[]{this, context, dXTemplateItem, baseSectionModel, infoFlowDxUserContext});
            return;
        }
        DXRenderOptions q = new DXRenderOptions.b().E(infoFlowDxUserContext).q();
        if (!mve.a("enableFetchTemplateBeforePreRender", true)) {
            this.b.B0(context, dXTemplateItem, baseSectionModel, -1, q);
            return;
        }
        DXTemplateItem u = this.b.u(dXTemplateItem);
        if (u == null) {
            fve.e("DinamicX3Render", "availableTemplate == null");
            return;
        }
        fve.e("DinamicX3Render", "preRender，当前的模版名称是:" + u.f7343a + "版本号是:" + u.b);
        this.b.B0(context, u, baseSectionModel, -1, q);
    }

    public final void m(Context context, DXTemplateItem dXTemplateItem, BaseSectionModel<?> baseSectionModel, InfoFlowDxUserContext infoFlowDxUserContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e919da", new Object[]{this, context, dXTemplateItem, baseSectionModel, infoFlowDxUserContext});
            return;
        }
        DXRenderOptions q = new DXRenderOptions.b().E(infoFlowDxUserContext).q();
        if (!mve.a("enableFetchTemplateBeforePreRender", true)) {
            this.b.C0(context, dXTemplateItem, baseSectionModel, -1, q);
            return;
        }
        DXTemplateItem u = this.b.u(dXTemplateItem);
        if (u == null) {
            fve.e("DinamicX3Render", "availableTemplate == null");
            return;
        }
        fve.e("DinamicX3Render", "preRenderX，当前的模版名称是:" + u.f7343a + "版本号是:" + u.b);
        this.b.C0(context, u, baseSectionModel, -1, q);
    }

    public final void o(DXRootView dXRootView, JSONObject jSONObject, fl6 fl6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80be8065", new Object[]{this, dXRootView, jSONObject, fl6Var});
            return;
        }
        DXRenderOptions.b D = new DXRenderOptions.b().G(pb6.j()).t(pb6.i()).E(fl6Var).D(true);
        DXTemplateItem dxTemplateItem = dXRootView.getDxTemplateItem();
        if (dxTemplateItem != null) {
            fve.e("DinamicX3Render", "rendTemplate name：" + dxTemplateItem.f7343a + " version: " + dxTemplateItem.b);
        }
        t56 t56Var = new t56();
        t56.a aVar = new t56.a();
        if (k38.e(jSONObject) >= 0) {
            if (bve.f()) {
                aVar.e(true);
                aVar.f(false);
            } else if (mve.a("enablePullRefreshOptimize", true)) {
                aVar.f(false);
                aVar.d(false);
            }
        }
        t56Var.b(aVar);
        D.w(t56Var);
        DXResult<DXRootView> i1 = this.b.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, D.q());
        if (dxTemplateItem != null) {
            fve.e("DinamicX3Render", "rendTemplate name：" + dxTemplateItem.f7343a + " version: " + dxTemplateItem.b + " , hitStatus: " + i1.c());
        }
        DXRootView dXRootView2 = i1.f7291a;
        if (dXRootView2 != null) {
            dXRootView2.setTag(R.id.item_hit_status, Integer.valueOf(i1.c()));
        }
        if (i1.d()) {
            ive.a(new zue(this.f32886a.getContainerType().getContainerId(), "dx3Render", 3002, "dx3 renderTemplate error", i1.a().toString()));
            fve.e("DinamicX3Render", i1.a().toString());
        }
    }
}
