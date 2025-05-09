package com.taobao.android.meta.structure.list;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.logic.BaseMetaPageController;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder;
import com.taobao.android.xsearchplugin.muise.MusTrimMemoryManager;
import java.util.ArrayList;
import java.util.Iterator;
import tb.acx;
import tb.asi;
import tb.ay4;
import tb.bsi;
import tb.buc;
import tb.bxc;
import tb.ckf;
import tb.com;
import tb.cuc;
import tb.d1a;
import tb.dsi;
import tb.euc;
import tb.fuc;
import tb.hsi;
import tb.k4k;
import tb.kae;
import tb.nde;
import tb.njg;
import tb.o02;
import tb.og3;
import tb.qg3;
import tb.t2o;
import tb.tsi;
import tb.ude;
import tb.vfw;
import tb.wtc;
import tb.x02;
import tb.yw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MetaListWidget extends yw1<FrameLayout, euc, cuc, acx<? extends com.taobao.android.meta.data.a<? extends asi, ? extends MetaResult<? extends asi>>>> implements buc, PartnerRecyclerView.a, qg3, com, og3, bxc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final BaseMetaPageController<com.taobao.android.meta.data.a<asi, MetaResult<asi>>, asi, MetaResult<asi>> i;
    public final MusTrimMemoryManager j;
    public bsi l;
    public hsi n;
    public final njg k = kotlin.a.b(new d1a() { // from class: tb.ffz
        @Override // tb.d1a
        public final Object invoke() {
            dsi f;
            f = MetaListWidget.f(MetaListWidget.this);
            return f;
        }
    });
    public final ArrayList<og3> m = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements fuc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.fuc
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eea3d88d", new Object[]{this});
            } else {
                ((cuc) MetaListWidget.this.u2()).J0(true);
            }
        }
    }

    static {
        t2o.a(993001536);
        t2o.a(993001526);
        t2o.a(993001850);
        t2o.a(993002139);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListWidget(Activity activity, ude udeVar, acx<? extends com.taobao.android.meta.data.a<? extends asi, ? extends MetaResult<? extends asi>>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        Object h = acxVar.d().h("controller");
        ckf.e(h, "null cannot be cast to non-null type com.taobao.android.meta.logic.BaseMetaPageController<com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>, com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>");
        this.i = (BaseMetaPageController) h;
        this.j = new MusTrimMemoryManager(activity, acxVar);
    }

    public static final void e(MetaListWidget metaListWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c681653", new Object[]{metaListWidget});
            return;
        }
        ckf.g(metaListWidget, "this$0");
        ((cuc) metaListWidget.u2()).v0();
        hsi hsiVar = metaListWidget.n;
        if (hsiVar != null) {
            hsiVar.f();
        }
    }

    public static final dsi f(MetaListWidget metaListWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dsi) ipChange.ipc$dispatch("f4110a19", new Object[]{metaListWidget});
        }
        ckf.g(metaListWidget, "this$0");
        return metaListWidget.M2();
    }

    public static /* synthetic */ Object ipc$super(MetaListWidget metaListWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1867253842:
                super.q1();
                return null;
            case -980867139:
                super.a();
                return null;
            case -466054859:
                super.r();
                return null;
            case -211767613:
                super.onComponentDestroy();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            case 1727106610:
                super.m0();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/list/MetaListWidget");
        }
    }

    @Override // tb.yw1
    public nde C2(x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nde) ipChange.ipc$dispatch("231ccd8", new Object[]{this, x02Var});
        }
        return null;
    }

    @Override // tb.com
    public boolean D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e4d0d60", new Object[]{this})).booleanValue();
        }
        return Q2().j0();
    }

    @Override // tb.yw1
    public nde D2(x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nde) ipChange.ipc$dispatch("7818344f", new Object[]{this, x02Var});
        }
        return null;
    }

    @Override // tb.yw1
    public nde E2(x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nde) ipChange.ipc$dispatch("a5bf6e9d", new Object[]{this, x02Var});
        }
        return null;
    }

    @Override // tb.yw1
    public nde F2(x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nde) ipChange.ipc$dispatch("5bed4364", new Object[]{this, x02Var});
        }
        return null;
    }

    public void J2(kae<BaseTypedBean, ?> kaeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51262cc9", new Object[]{this, kaeVar});
            return;
        }
        ckf.g(kaeVar, "widget");
        View view = kaeVar.getView();
        ckf.d(view);
        ((euc) t2()).f(view);
    }

    public void K2(kae<BaseTypedBean, ?> kaeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671ac097", new Object[]{this, kaeVar});
            return;
        }
        ckf.g(kaeVar, "widget");
        RecyclerView recyclerView = ((euc) t2()).getRecyclerView();
        ckf.e(recyclerView, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        ((PartnerRecyclerView) recyclerView).addHeaderFrame();
        View view = kaeVar.getView();
        ckf.d(view);
        ((euc) t2()).v(view);
    }

    public void L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3189632", new Object[]{this});
        } else {
            ((euc) t2()).c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    public final dsi M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dsi) ipChange.ipc$dispatch("db623378", new Object[]{this});
        }
        x02 v2 = v2();
        ckf.f(v2, "getCreatorParam(...)");
        v2.e = new k4k();
        Activity activity = v2.f31046a;
        ckf.f(activity, "activity");
        ude udeVar = v2.b;
        ckf.f(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        acx<? extends o02<? extends BaseSearchResult, ?>> acxVar = v2.c;
        ckf.e(acxVar, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<out com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
        dsi dsiVar = new dsi(activity, udeVar, acxVar, v2.d, v2.e);
        ((wtc) dsiVar.u2()).k0(new a());
        dsiVar.attachToContainer();
        ((euc) t2()).addFooterView(dsiVar.getView());
        return dsiVar;
    }

    /* renamed from: N2 */
    public cuc q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cuc) ipChange.ipc$dispatch("630e76f9", new Object[]{this});
        }
        Object a2 = Q2().F().a(this.l);
        ckf.f(a2, "create(...)");
        return (cuc) a2;
    }

    /* renamed from: O2 */
    public euc s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euc) ipChange.ipc$dispatch("708a5139", new Object[]{this});
        }
        Object a2 = Q2().H().a(this.l);
        ckf.f(a2, "create(...)");
        return (euc) a2;
    }

    public final void P2() {
        hsi hsiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ebc0594", new Object[]{this});
            return;
        }
        ay4<MetaListWidget, ? extends hsi> E = Q2().E();
        if (E != null) {
            hsiVar = (hsi) E.a(this);
        } else {
            hsiVar = null;
        }
        this.n = hsiVar;
    }

    public final bsi Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsi) ipChange.ipc$dispatch("1ffd1048", new Object[]{this});
        }
        bsi bsiVar = this.l;
        if (bsiVar == null) {
            bsiVar = ((acx) getModel()).c();
            ckf.e(bsiVar, "null cannot be cast to non-null type com.taobao.android.meta.MetaConfig");
        }
        this.l = bsiVar;
        return bsiVar;
    }

    @Override // tb.qg3
    public void R0(og3 og3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1168839", new Object[]{this, og3Var});
        } else if (og3Var != null) {
            this.m.add(og3Var);
        }
    }

    public final BaseMetaPageController<com.taobao.android.meta.data.a<asi, MetaResult<asi>>, asi, MetaResult<asi>> R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseMetaPageController) ipChange.ipc$dispatch("45eb52c3", new Object[]{this});
        }
        return this.i;
    }

    public ViewGroup S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9f5e88ee", new Object[]{this});
        }
        ViewGroup B = ((euc) t2()).B();
        ckf.f(B, "getHeaderContainer(...)");
        return B;
    }

    public final dsi T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dsi) ipChange.ipc$dispatch("1cc106a0", new Object[]{this});
        }
        return (dsi) this.k.getValue();
    }

    public void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e6da2", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = ((euc) t2()).getRecyclerView();
        ckf.e(recyclerView, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        ((PartnerRecyclerView) recyclerView).invalidateScrollOffset();
    }

    public final boolean V2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1069cfe3", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        if (view.getPaddingTop() == 0 && view.getPaddingBottom() == 0) {
            return false;
        }
        return true;
    }

    public void W2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c280b57", new Object[]{this, new Boolean(z)});
            return;
        }
        ((cuc) u2()).P0(z);
        Z2();
        hsi hsiVar = this.n;
        if (hsiVar != null) {
            hsiVar.e();
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null) {
            frameLayout.post(new Runnable() { // from class: tb.efz
                @Override // java.lang.Runnable
                public final void run() {
                    MetaListWidget.e(MetaListWidget.this);
                }
            });
        }
    }

    public void X2(int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972967c9", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else {
            ((euc) t2()).n(i, i2, z, i3);
        }
    }

    @Override // tb.buc
    public int Y() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue();
        }
        ViewParent parent = ((euc) t2()).getView().getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        if (view == null) {
            return 0;
        }
        return tsi.a(view);
    }

    public void Y2(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959cc9a0", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        } else {
            ((euc) t2()).e(i, z, i2);
        }
    }

    public void Z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96950d81", new Object[]{this});
        } else {
            T2().z2();
        }
    }

    @Override // tb.yw1, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58927bd", new Object[]{this});
            return;
        }
        super.a();
        hsi hsiVar = this.n;
        if (hsiVar != null) {
            hsiVar.g();
        }
    }

    public void appear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aff7f9c", new Object[]{this});
            return;
        }
        ((cuc) u2()).appear();
        hsi hsiVar = this.n;
        if (hsiVar != null) {
            hsiVar.b();
        }
        this.j.d();
    }

    public void disappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c72aaa", new Object[]{this});
            return;
        }
        ((cuc) u2()).disappear();
        hsi hsiVar = this.n;
        if (hsiVar != null) {
            hsiVar.d();
        }
        this.j.e();
    }

    @Override // tb.yw1, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f18e32", new Object[]{this});
            return;
        }
        super.m0();
        hsi hsiVar = this.n;
        if (hsiVar != null) {
            hsiVar.i();
        }
    }

    @Override // tb.og3
    public void n1(int i, BaseTypedBean baseTypedBean, BaseSearchResult baseSearchResult, o02<?, ?> o02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783354d9", new Object[]{this, new Integer(i), baseTypedBean, baseSearchResult, o02Var});
            return;
        }
        Iterator<og3> it = this.m.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            og3 next = it.next();
            ckf.f(next, "next(...)");
            next.n1(i, baseTypedBean, baseSearchResult, o02Var);
        }
    }

    @Override // tb.sxh, tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        hsi hsiVar = this.n;
        if (hsiVar != null) {
            hsiVar.c();
        }
        this.j.c();
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        destroyComponent();
        hsi hsiVar = this.n;
        if (hsiVar != null) {
            hsiVar.c();
        }
        this.j.c();
    }

    @Override // tb.buc
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return ((euc) t2()).getRecyclerView().onInterceptTouchEvent(motionEvent);
    }

    @Override // tb.buc
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return ((euc) t2()).getRecyclerView().onTouchEvent(motionEvent);
    }

    @Override // tb.yw1, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b3f7ae", new Object[]{this});
            return;
        }
        super.q1();
        T2().z2();
    }

    @Override // tb.yw1, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4389135", new Object[]{this});
            return;
        }
        super.r();
        hsi hsiVar = this.n;
        if (hsiVar != null) {
            hsiVar.h();
        }
    }

    public void r0(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ee5655", new Object[]{this, listStyle});
            return;
        }
        ckf.g(listStyle, "style");
        ((cuc) u2()).r0(listStyle);
        hsi hsiVar = this.n;
        if (hsiVar != null) {
            hsiVar.j(listStyle);
        }
    }

    @Override // tb.buc
    public void stopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
        } else if (((euc) t2()).getRecyclerView().getScrollState() != 0) {
            ((euc) t2()).getRecyclerView().stopScroll();
        }
    }

    @Override // tb.og3
    public void u0(int i, BaseTypedBean baseTypedBean, long j, BaseSearchResult baseSearchResult, o02<?, ?> o02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52748deb", new Object[]{this, new Integer(i), baseTypedBean, new Long(j), baseSearchResult, o02Var});
            return;
        }
        Iterator<og3> it = this.m.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            og3 next = it.next();
            ckf.f(next, "next(...)");
            next.u0(i, baseTypedBean, j, baseSearchResult, o02Var);
        }
    }

    @Override // tb.buc
    public int v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b356df52", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = ((euc) t2()).getRecyclerView();
        ckf.e(recyclerView, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        return ((PartnerRecyclerView) recyclerView).getTotalScrollOffset();
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b832b080", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = ((euc) t2()).getRecyclerView();
        ckf.e(recyclerView, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) recyclerView;
        ((euc) t2()).z();
        try {
            if (!Q2().V() && !V2(partnerRecyclerView.getHeaderFrame())) {
                partnerRecyclerView.removeHeaderFrame();
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.bxc
    public void V1(AbsMuiseViewHolder<?, ?> absMuiseViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56008163", new Object[]{this, absMuiseViewHolder});
            return;
        }
        ckf.g(absMuiseViewHolder, "musCell");
        if (((acx) getModel()).d().i("trimMemory", false)) {
            this.j.b(absMuiseViewHolder);
        }
    }
}
