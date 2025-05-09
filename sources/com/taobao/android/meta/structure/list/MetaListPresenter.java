package com.taobao.android.meta.structure.list;

import android.app.Activity;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.logic.BaseMetaPageController;
import com.taobao.android.meta.structure.list.MetaListPresenter;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.meta.datasource.ComboOp;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashSet;
import java.util.List;
import kotlin.a;
import tb.acx;
import tb.asi;
import tb.bom;
import tb.bsi;
import tb.ckf;
import tb.com;
import tb.cuc;
import tb.d1a;
import tb.e64;
import tb.euc;
import tb.g1a;
import tb.njg;
import tb.o02;
import tb.og3;
import tb.ouc;
import tb.pg3;
import tb.rtg;
import tb.sg3;
import tb.ssi;
import tb.t2o;
import tb.tg3;
import tb.upk;
import tb.v7p;
import tb.xhv;
import tb.xw1;
import tb.xxo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MetaListPresenter extends xw1<euc, MetaListWidget> implements cuc, tg3.c, upk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final bsi j;
    public int k;
    public rtg n;
    public BaseSearchResult r;
    public og3 s;
    public boolean l = true;
    public final njg m = a.b(new d1a() { // from class: tb.mez
        @Override // tb.d1a
        public final Object invoke() {
            tg3 j;
            j = MetaListPresenter.j(MetaListPresenter.this);
            return j;
        }
    });
    public final SparseArrayCompat<Long> o = new SparseArrayCompat<>();
    public final SparseArrayCompat<Boolean> p = new SparseArrayCompat<>();
    public final SparseArrayCompat<Boolean> q = new SparseArrayCompat<>();

    static {
        t2o.a(993001529);
        t2o.a(993001524);
        t2o.a(993002094);
        t2o.a(993001847);
    }

    public MetaListPresenter(bsi bsiVar) {
        ckf.g(bsiVar, "metaConfig");
        this.j = bsiVar;
    }

    public static final xhv i(MetaListPresenter metaListPresenter, ouc oucVar) {
        ssi a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("72ebbb59", new Object[]{metaListPresenter, oucVar});
        }
        ckf.g(metaListPresenter, "this$0");
        o02 e = ((acx) ((MetaListWidget) metaListPresenter.getWidget()).getModel()).e();
        rtg rtgVar = null;
        com.taobao.android.meta.data.a aVar = e instanceof com.taobao.android.meta.data.a ? (com.taobao.android.meta.data.a) e : null;
        if (aVar != null) {
            int index = aVar.getIndex();
            if (!(oucVar == null || (a2 = oucVar.a(index)) == null)) {
                rtgVar = new rtg(a2.d(), a2.b(), a2.a(), a2.c(), a2.e(), a2.f());
            }
            metaListPresenter.n = rtgVar;
        }
        return xhv.INSTANCE;
    }

    public static /* synthetic */ Object ipc$super(MetaListPresenter metaListPresenter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 267248023:
                super.init();
                return null;
            case 1112026201:
                super.I0((e64) objArr[0]);
                return null;
            case 1622038160:
                super.O0(((Number) objArr[0]).intValue());
                return null;
            case 1624798049:
                super.B0(((Number) objArr[0]).intValue());
                return null;
            case 1727106610:
                super.m0();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/list/MetaListPresenter");
        }
    }

    public static final tg3 j(MetaListPresenter metaListPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg3) ipChange.ipc$dispatch("c10875b", new Object[]{metaListPresenter});
        }
        ckf.g(metaListPresenter, "this$0");
        return new tg3(metaListPresenter, metaListPresenter.c().f().d(), (acx) ((MetaListWidget) metaListPresenter.getWidget()).getModel());
    }

    public static final void m(MetaListPresenter metaListPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f3aca57", new Object[]{metaListPresenter});
            return;
        }
        ckf.g(metaListPresenter, "this$0");
        ((euc) metaListPresenter.getIView()).p();
    }

    @Override // tb.xw1, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void B0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d87361", new Object[]{this, new Integer(i)});
            return;
        }
        super.B0(i);
        this.k = i;
    }

    @Override // tb.u7p
    public void D(int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78f517e", new Object[]{this, new Integer(i), new Integer(i2), new Long(j)});
        } else {
            S0(new v7p(i, i2, j));
        }
    }

    @Override // tb.xw1
    public float G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8878651", new Object[]{this})).floatValue();
        }
        return this.j.m0();
    }

    @Override // tb.xw1
    public void I0(e64 e64Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42482c59", new Object[]{this, e64Var});
            return;
        }
        ckf.g(e64Var, "event");
        BaseMetaPageController<com.taobao.android.meta.data.a<asi, MetaResult<asi>>, asi, MetaResult<asi>> R2 = ((MetaListWidget) getWidget()).R2();
        asi asiVar = e64Var.b;
        if (asiVar != null) {
            o02 e = ((acx) ((MetaListWidget) getWidget()).getModel()).e();
            ckf.e(e, "null cannot be cast to non-null type com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>");
            ListStyle listStyle = e64Var.f18311a;
            ckf.f(listStyle, "toStyle");
            if (R2.H((com.taobao.android.meta.data.a) e, asiVar, listStyle)) {
                return;
            }
        }
        super.I0(e64Var);
    }

    @Override // tb.cuc
    public void J0(boolean z) {
        asi asiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d7ebe7", new Object[]{this, new Boolean(z)});
            return;
        }
        o02 e = ((acx) ((MetaListWidget) getWidget()).getModel()).e();
        ckf.f(e, "getScopeDatasource(...)");
        BaseSearchResult baseSearchResult = (BaseSearchResult) e.getTotalSearchResult();
        if (baseSearchResult != null && this.k <= baseSearchResult.getCellsCount() && baseSearchResult.getCellsCount() != 0 && (asiVar = baseSearchResult.getCell(Math.max(this.k - 1, 0)).combo) != null) {
            if (z) {
                asiVar.P(MetaState.DEFAULT);
            }
            BaseMetaPageController<com.taobao.android.meta.data.a<asi, MetaResult<asi>>, asi, MetaResult<asi>> R2 = ((MetaListWidget) getWidget()).R2();
            o02 e2 = ((acx) ((MetaListWidget) getWidget()).getModel()).e();
            ckf.e(e2, "null cannot be cast to non-null type com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>");
            if (R2.o((com.taobao.android.meta.data.a) e2, asiVar)) {
                ((MetaListWidget) getWidget()).q1();
            }
        }
    }

    @Override // tb.xw1
    public void O0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ae5690", new Object[]{this, new Integer(i)});
        } else if (((acx) ((MetaListWidget) getWidget()).getModel()).c().J()) {
            t0(i);
        } else {
            super.O0(i);
        }
    }

    @Override // tb.cuc
    public void P0(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969949a3", new Object[]{this, new Boolean(z)});
            return;
        }
        this.k = 0;
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) ((MetaListWidget) getWidget()).getModel()).e().getTotalSearchResult();
        if (baseSearchResult != null) {
            boolean z3 = this.l;
            if (z3) {
                n0();
                this.l = false;
            } else {
                g1();
            }
            MetaResult metaResult = (MetaResult) baseSearchResult;
            List<ComboOp> updateItems = metaResult.updateItems();
            if (!updateItems.isEmpty() && !z) {
                if (this.j.N()) {
                    getAdapter().notifyDataSetChanged();
                } else {
                    RecyclerView recyclerView = ((euc) getIView()).getRecyclerView();
                    ckf.e(recyclerView, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
                    int headerViewsCount = ((PartnerRecyclerView) recyclerView).getHeaderViewsCount();
                    for (ComboOp comboOp : updateItems) {
                        comboOp.a(headerViewsCount, getAdapter());
                    }
                    RecyclerView.Adapter adapter = getAdapter();
                    ckf.e(adapter, "null cannot be cast to non-null type com.taobao.android.meta.structure.list.MetaListAdapter");
                    ((MetaListAdapter) adapter).p0();
                }
                if (this.j.s()) {
                    RecyclerView.LayoutManager layoutManager = ((euc) getIView()).getRecyclerView().getLayoutManager();
                    ckf.e(layoutManager, "null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager");
                    ((StaggeredGridLayoutManager) layoutManager).invalidateSpanAssignments();
                }
            } else if (!z3) {
                getAdapter().notifyDataSetChanged();
            }
            i1();
            ((HashSet) this.i).clear();
            euc eucVar = (euc) getIView();
            if (metaResult.getBarrierBean() != null) {
                z2 = false;
            }
            eucVar.M(z2);
        }
    }

    @Override // tb.upk
    public void T(BaseCellBean baseCellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc5bcd", new Object[]{this, baseCellBean, new Integer(i)});
            return;
        }
        ckf.g(baseCellBean, "cellBean");
        asi asiVar = baseCellBean.combo;
        if (asiVar != null) {
            BaseMetaPageController<com.taobao.android.meta.data.a<asi, MetaResult<asi>>, asi, MetaResult<asi>> R2 = ((MetaListWidget) getWidget()).R2();
            o02 e = ((acx) ((MetaListWidget) getWidget()).getModel()).e();
            ckf.e(e, "null cannot be cast to non-null type com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>");
            R2.m((com.taobao.android.meta.data.a) e, asiVar, i);
        }
    }

    @Override // tb.xw1
    public void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f412b3", new Object[]{this});
        }
    }

    @Override // tb.xw1, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92702da1", new Object[]{this, new Integer(i)});
            return;
        }
        ((MetaListWidget) getWidget()).postScopeEvent(xxo.a(i), "childPageWidget");
        ((MetaListWidget) getWidget()).U(i);
    }

    public final void X0(BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f82b59", new Object[]{this, baseSearchResult});
            return;
        }
        BaseSearchResult baseSearchResult2 = this.r;
        if (!ckf.b(baseSearchResult, baseSearchResult2)) {
            this.r = baseSearchResult;
            long currentTimeMillis = System.currentTimeMillis();
            int size = this.o.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.o.keyAt(i);
                Long l = this.o.get(keyAt);
                ckf.f(l, "get(...)");
                long longValue = currentTimeMillis - l.longValue();
                if (baseSearchResult2 != null && keyAt < baseSearchResult2.getCellsCount()) {
                    e1(keyAt, baseSearchResult2.getCell(keyAt), longValue, baseSearchResult2);
                }
            }
            this.o.clear();
        }
    }

    public void Y0(SparseArrayCompat<Boolean> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51997c3d", new Object[]{this, sparseArrayCompat});
        } else {
            ((euc) getIView()).G(((euc) getIView()).getRecyclerView().getHeight(), sparseArrayCompat);
        }
    }

    @Override // tb.t7p.a
    public rtg Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rtg) ipChange.ipc$dispatch("fa02add4", new Object[]{this});
        }
        return this.n;
    }

    public final tg3 Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg3) ipChange.ipc$dispatch("3e8ae036", new Object[]{this});
        }
        return (tg3) this.m.getValue();
    }

    public final void a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfd79d8", new Object[]{this});
        } else {
            this.j.h0().d(new g1a() { // from class: tb.kez
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv i;
                    i = MetaListPresenter.i(MetaListPresenter.this, (ouc) obj);
                    return i;
                }
            });
        }
    }

    @Override // tb.cuc
    public void appear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aff7f9c", new Object[]{this});
            return;
        }
        l();
        v0();
    }

    /* renamed from: b1 */
    public BaseListAdapter<? extends acx<?>> Q0(MetaListWidget metaListWidget, int i, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ListStyle listStyle, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseListAdapter) ipChange.ipc$dispatch("82cfcd15", new Object[]{this, metaListWidget, new Integer(i), acxVar, listStyle, activity});
        }
        ckf.g(metaListWidget, "widget");
        ckf.g(listStyle, "uiStyle");
        ckf.g(activity, "activity");
        ckf.e(acxVar, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<out com.taobao.android.meta.data.MetaDataSource<out com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<out com.taobao.android.meta.data.MetaCombo>>>");
        MetaListAdapter metaListAdapter = new MetaListAdapter(listStyle, activity, metaListWidget, acxVar, i, this.j);
        metaListAdapter.s0(this);
        return metaListAdapter;
    }

    public void d1(int i, BaseCellBean baseCellBean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09a763d", new Object[]{this, new Integer(i), baseCellBean, baseSearchResult});
            return;
        }
        og3 og3Var = this.s;
        if (og3Var != null) {
            og3Var.n1(i, baseCellBean, baseSearchResult, X());
        }
        RecyclerView recyclerView = ((euc) getIView()).getRecyclerView();
        ckf.e(recyclerView, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) recyclerView;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = partnerRecyclerView.findViewHolderForAdapterPosition(partnerRecyclerView.getHeaderViewsCount() + i);
        if (findViewHolderForAdapterPosition instanceof bom) {
            WIDGET widget = getWidget();
            ckf.e(widget, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.PreciseCellExposeableList");
            ((bom) findViewHolderForAdapterPosition).V((com) widget);
        }
    }

    @Override // tb.cuc
    public void disappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c72aaa", new Object[]{this});
            return;
        }
        l();
        f1();
    }

    public void e1(int i, BaseCellBean baseCellBean, long j, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f251413d", new Object[]{this, new Integer(i), baseCellBean, new Long(j), baseSearchResult});
            return;
        }
        og3 og3Var = this.s;
        if (og3Var != null) {
            og3Var.u0(i, baseCellBean, j, baseSearchResult, X());
        }
        RecyclerView recyclerView = ((euc) getIView()).getRecyclerView();
        ckf.e(recyclerView, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) recyclerView;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = partnerRecyclerView.findViewHolderForAdapterPosition(partnerRecyclerView.getHeaderViewsCount() + i);
        if (findViewHolderForAdapterPosition instanceof bom) {
            WIDGET widget = getWidget();
            ckf.e(widget, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.PreciseCellExposeableList");
            ((bom) findViewHolderForAdapterPosition).g((com) widget);
        }
    }

    public final void f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e83341e", new Object[]{this});
            return;
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) X().getTotalSearchResult();
        if (baseSearchResult != null) {
            X0(baseSearchResult);
            long currentTimeMillis = System.currentTimeMillis();
            int size = this.o.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.o.keyAt(i);
                Long l = this.o.get(keyAt);
                ckf.f(l, "get(...)");
                long longValue = currentTimeMillis - l.longValue();
                if (keyAt < baseSearchResult.getCellsCount()) {
                    e1(keyAt, baseSearchResult.getCell(keyAt), longValue, baseSearchResult);
                }
            }
            this.o.clear();
        }
    }

    public final void g1() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1406fb9f", new Object[]{this});
            return;
        }
        o02 e = ((acx) ((MetaListWidget) getWidget()).getModel()).e();
        ckf.f(e, "getScopeDatasource(...)");
        BaseSearchResult baseSearchResult = (BaseSearchResult) e.getTotalSearchResult();
        ListStyle uIListStyle = e.getUIListStyle();
        ckf.f(uIListStyle, "getUIListStyle(...)");
        if (uIListStyle != this.f31634a.g()) {
            if (baseSearchResult == null || baseSearchResult.getMainInfo().wfgap < 0.0f) {
                f = G0();
            } else {
                f = baseSearchResult.getMainInfo().wfgap;
            }
            int b = b(f);
            this.f31634a.i0(b);
            ((euc) getIView()).J(uIListStyle);
            ((euc) getIView()).A(b);
            this.f31634a.j0(uIListStyle);
        }
    }

    public final void i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9fed08f", new Object[]{this});
            return;
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) ((MetaListWidget) getWidget()).getModel()).e().getTotalSearchResult();
        if (baseSearchResult != null && baseSearchResult.hasSectionClip()) {
            Z0().i(((MetaResult) baseSearchResult).getValidCells());
        }
    }

    @Override // tb.xw1, tb.ddd
    public void init() {
        og3 og3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        ((MetaListWidget) getWidget()).P2();
        P0(false);
        U0(this.j.k0());
        pg3 b = this.j.b();
        if (b != null) {
            og3Var = b.a(((acx) ((MetaListWidget) getWidget()).getModel()).e(), (acx) ((MetaListWidget) getWidget()).getModel());
        } else {
            og3Var = null;
        }
        this.s = og3Var;
        a1();
    }

    public final void j1() {
        BaseSearchResult baseSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80d0899", new Object[]{this});
        } else if (L0() && (baseSearchResult = (BaseSearchResult) X().getTotalSearchResult()) != null) {
            X0(baseSearchResult);
            this.q.clear();
            int size = this.o.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.o.keyAt(i);
                if (this.p.get(keyAt) == null) {
                    this.q.append(keyAt, Boolean.TRUE);
                } else {
                    this.p.remove(keyAt);
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = this.p.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.o.append(this.p.keyAt(i2), Long.valueOf(currentTimeMillis));
            }
            int size3 = this.q.size();
            for (int i3 = 0; i3 < size3; i3++) {
                int keyAt2 = this.q.keyAt(i3);
                Long l = this.o.get(keyAt2);
                ckf.f(l, "get(...)");
                long longValue = currentTimeMillis - l.longValue();
                if (keyAt2 < baseSearchResult.getCellsCount()) {
                    e1(keyAt2, baseSearchResult.getCell(keyAt2), longValue, baseSearchResult);
                }
                this.o.remove(keyAt2);
            }
            int size4 = this.o.size();
            for (int i4 = 0; i4 < size4; i4++) {
                int keyAt3 = this.o.keyAt(i4);
                if (keyAt3 < baseSearchResult.getCellsCount()) {
                    d1(keyAt3, baseSearchResult.getCell(keyAt3), baseSearchResult);
                }
            }
        }
    }

    @Override // tb.xw1, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f18e32", new Object[]{this});
            return;
        }
        super.m0();
        v0();
    }

    public void onEventMainThread(sg3 sg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce150caf", new Object[]{this, sg3Var});
            return;
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) ((MetaListWidget) getWidget()).getModel()).e().getTotalSearchResult();
        if (baseSearchResult != null && baseSearchResult.hasSectionClip()) {
            Z0().h();
        }
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b3f7ae", new Object[]{this});
        } else {
            J0(false);
        }
    }

    @Override // tb.tg3.c
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e073ff", new Object[]{this});
        } else {
            ((MetaListWidget) getWidget()).getActivity().runOnUiThread(new Runnable() { // from class: tb.lez
                @Override // java.lang.Runnable
                public final void run() {
                    MetaListPresenter.m(MetaListPresenter.this);
                }
            });
        }
    }

    @Override // tb.cuc
    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f3d300", new Object[]{this});
        } else if (this.j.j0()) {
            Y0(this.p);
            j1();
        }
    }

    @Override // tb.xw1
    public int w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40d052f7", new Object[]{this})).intValue();
        }
        return this.j.l0();
    }
}
