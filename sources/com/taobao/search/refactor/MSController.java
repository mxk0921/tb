package com.taobao.search.refactor;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.mmd.datasource.bean.SFOnesearchBean;
import com.taobao.search.musie.NSMuiseViewHolder;
import com.taobao.search.performance.perf.SFPreloadImpl;
import com.taobao.search.refactor.MSController;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.MainSearchResultActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.a;
import tb.acx;
import tb.asi;
import tb.ay4;
import tb.b64;
import tb.bsh;
import tb.bsi;
import tb.c4o;
import tb.ckf;
import tb.cql;
import tb.d1a;
import tb.f1i;
import tb.f6p;
import tb.frh;
import tb.frk;
import tb.grh;
import tb.gu6;
import tb.gy;
import tb.igw;
import tb.isi;
import tb.jrh;
import tb.kae;
import tb.kld;
import tb.klf;
import tb.kne;
import tb.ksi;
import tb.lml;
import tb.lrh;
import tb.nde;
import tb.njg;
import tb.nxp;
import tb.o4p;
import tb.oeq;
import tb.osi;
import tb.ouc;
import tb.oxb;
import tb.p1p;
import tb.pba;
import tb.q1p;
import tb.r4p;
import tb.rhj;
import tb.sen;
import tb.ssi;
import tb.stc;
import tb.t2o;
import tb.tnd;
import tb.tnl;
import tb.uhj;
import tb.v5p;
import tb.w02;
import tb.whj;
import tb.wnl;
import tb.xfn;
import tb.y64;
import tb.yhj;
import tb.yko;
import tb.ynd;
import tb.yno;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MSController extends oeq<jrh, frh, CommonSearchResult> implements gu6.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final yko f;
    public CommonSearchContext h;
    public BaseResultActivity i;
    public final lrh j;
    public nxp<jrh, frh, CommonSearchResult> l;
    public JSONArray n;
    public xfn o;
    public List<SearchBarTagBean> p;
    public whj q;
    public kld s;
    public final njg g = a.b(new d1a() { // from class: tb.rcz
        @Override // tb.d1a
        public final Object invoke() {
            View o1;
            o1 = MSController.o1(MSController.this);
            return o1;
        }
    });
    public final kne k = new kne();
    public boolean m = true;
    public final SparseArray<Set<ynd>> r = new SparseArray<>();

    static {
        t2o.a(815792872);
        t2o.a(815793398);
    }

    public MSController(yko ykoVar) {
        ckf.g(ykoVar, "core");
        this.f = ykoVar;
        lrh lrhVar = new lrh();
        this.j = lrhVar;
        lrhVar.S(this);
        this.l = lrhVar;
    }

    public static /* synthetic */ Object ipc$super(MSController mSController, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1920681519:
                super.n((ksi) objArr[0]);
                return null;
            case -1900806559:
                mSController.T((com.taobao.android.meta.data.a) objArr[0], (y64) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), (osi) objArr[4]);
                return null;
            case -597016401:
                mSController.U((com.taobao.android.meta.data.a) objArr[0], (y64) objArr[1], ((Boolean) objArr[2]).booleanValue(), (Map) objArr[3]);
                return null;
            case -563373229:
                super.f((com.taobao.android.meta.data.a) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 23369542:
                super.h((com.taobao.android.meta.data.a) objArr[0]);
                return null;
            case 1060958575:
                super.B((com.taobao.android.meta.data.a) objArr[0], (MetaChildPageWidget) objArr[1]);
                return null;
            case 1289253129:
                super.J((com.taobao.android.meta.data.a) objArr[0]);
                return null;
            case 1324855084:
                return new Boolean(super.H((com.taobao.android.meta.data.a) objArr[0], (asi) objArr[1], (ListStyle) objArr[2]));
            case 1957966798:
                super.L((com.taobao.android.meta.data.a) objArr[0], (MetaChildPageWidget) objArr[1]);
                return null;
            case 1991606258:
                super.l((com.taobao.android.meta.data.a) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/MSController");
        }
    }

    public static final void n1(MSController mSController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f8b61f", new Object[]{mSController});
            return;
        }
        ckf.g(mSController, "this$0");
        mSController.k0().setAlpha(1.0f);
    }

    public static final boolean p1(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c00cd42", new Object[]{view, motionEvent})).booleanValue();
        }
        return true;
    }

    public static final void s1(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56f2f83", new Object[]{jrhVar});
            return;
        }
        ckf.g(jrhVar, "$initDataSource");
        jrhVar.resetInit();
        jrhVar.doNewSearch();
    }

    public static final void t1(MSController mSController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d171285a", new Object[]{mSController});
            return;
        }
        ckf.g(mSController, "this$0");
        mSController.w().getActivity().finish();
    }

    public static final void u1(MSController mSController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae8b5f9", new Object[]{mSController});
            return;
        }
        ckf.g(mSController, "this$0");
        mSController.w().getActivity().finish();
    }

    public static final void v1(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14feaa2f", new Object[]{jrhVar});
            return;
        }
        ckf.g(jrhVar, "$initDataSource");
        jrhVar.resetInit();
        jrhVar.doNewSearch();
    }

    public static final WidgetViewHolder w1(w02 w02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("f008e6b3", new Object[]{w02Var});
        }
        return new NSMuiseViewHolder(w02Var.f31046a, w02Var.c, w02Var.b, w02Var.g, w02Var.d, w02Var.f);
    }

    public static final ssi x1(boolean z, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ssi) ipChange.ipc$dispatch("72cbf9be", new Object[]{new Boolean(z), new Integer(i)});
        }
        if (z) {
            i2 = Color.parseColor("#222222");
        } else {
            i2 = -1;
        }
        return new ssi(i2, 0, 0, 0, 0, false, false);
    }

    public static final PartnerRecyclerView y1(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PartnerRecyclerView) ipChange.ipc$dispatch("8518433e", new Object[]{context});
        }
        return new PartnerRecyclerView(context, false);
    }

    /* renamed from: A0 */
    public void m(jrh jrhVar, frh frhVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d437f1c1", new Object[]{this, jrhVar, frhVar, new Integer(i)});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "combo");
        this.l.m(jrhVar, frhVar, i);
    }

    /* renamed from: B0 */
    public acx<jrh> z(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("a9eb2093", new Object[]{this, jrhVar});
        }
        ckf.g(jrhVar, "initDataSource");
        tnl<D> v = v();
        ckf.e(v, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.PageModel<com.taobao.search.sf.datasource.CommonBaseDatasource>");
        return new b64(v, jrhVar, this.o);
    }

    /* renamed from: C0 */
    public acx<jrh> c(int i, TabBean tabBean, jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("42c7a42", new Object[]{this, new Integer(i), tabBean, jrhVar});
        }
        ckf.g(tabBean, "tab");
        ckf.g(jrhVar, "initDataSource");
        return this.l.c(i, tabBean, jrhVar);
    }

    /* renamed from: D0 */
    public void j(jrh jrhVar, frh frhVar, frh frhVar2, osi<frh> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae87a003", new Object[]{this, jrhVar, frhVar, frhVar2, osiVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "src");
        ckf.g(frhVar2, "incoming");
        ckf.g(osiVar, "config");
        this.l.j(jrhVar, frhVar, frhVar2, osiVar);
    }

    /* renamed from: E0 */
    public void B(jrh jrhVar, MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463d149b", new Object[]{this, jrhVar, metaChildPageWidget});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(metaChildPageWidget, "childPage");
        super.B(jrhVar, metaChildPageWidget);
        this.l.o(jrhVar, metaChildPageWidget);
        c1(jrhVar);
        if (o4p.t2()) {
            wnl wnlVar = wnl.INSTANCE;
            Activity activity = w().getActivity();
            ckf.f(activity, "getActivity(...)");
            String tab = jrhVar.getTab();
            if (tab == null) {
                tab = "";
            }
            wnlVar.b(activity, "pageState", "currentTab", tab);
        }
    }

    /* renamed from: F0 */
    public void g(jrh jrhVar, MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca61b0d", new Object[]{this, jrhVar, metaChildPageWidget});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(metaChildPageWidget, "childPage");
    }

    /* renamed from: H0 */
    public void l(final jrh jrhVar, final boolean z) {
        ArrayList<isi> headers;
        ArrayList<BaseCellBean> n0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4469299e", new Object[]{this, jrhVar, new Boolean(z)});
            return;
        }
        ckf.g(jrhVar, "initDataSource");
        c1(jrhVar);
        frh T0 = jrhVar.T0();
        if (!(T0 == null || (n0 = T0.n0()) == null)) {
            pba.INSTANCE.c(n0);
            jrhVar.C0();
        }
        kld kldVar = this.s;
        if (kldVar != null) {
            ((SFPreloadImpl) kldVar).u(jrhVar, z);
        }
        if (z) {
            if (P0(jrhVar)) {
                CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
                if (!(commonSearchResult == null || (headers = commonSearchResult.getHeaders()) == null)) {
                    headers.clear();
                }
                this.m = true;
                return;
            } else if (!M0(jrhVar)) {
                e1(jrhVar);
            } else {
                return;
            }
        }
        this.l.l(jrhVar, z);
        if (jrhVar.R0()) {
            View view = w().getView();
            ckf.d(view);
            ((FrameLayout) view).post(new Runnable() { // from class: tb.vcz
                @Override // java.lang.Runnable
                public final void run() {
                    MSController.q1(MSController.this, jrhVar, z);
                }
            });
        } else {
            super.l(jrhVar, z);
        }
        Y(jrhVar);
    }

    /* renamed from: J0 */
    public void b(jrh jrhVar, frh frhVar, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1457222", new Object[]{this, jrhVar, frhVar, new Boolean(z), map});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        if (z) {
            if (TextUtils.equals(map != null ? map.get("searchType") : null, "preload")) {
                return;
            }
        }
        U(jrhVar, frhVar, z, map);
        this.l.b(jrhVar, frhVar, z, map);
        y0(jrhVar);
    }

    /* renamed from: K0 */
    public void h(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a66cba1a", new Object[]{this, jrhVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        super.h(jrhVar);
        y0(jrhVar);
    }

    /* renamed from: L0 */
    public void i(jrh jrhVar, frh frhVar, frh frhVar2, osi<frh> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67032f4", new Object[]{this, jrhVar, frhVar, frhVar2, osiVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "src");
        ckf.g(frhVar2, "incoming");
        ckf.g(osiVar, "config");
        this.l.i(jrhVar, frhVar, frhVar2, osiVar);
    }

    public final boolean M0(final jrh jrhVar) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47e9fe22", new Object[]{this, jrhVar})).booleanValue();
        }
        if (!(this.l instanceof klf) || (commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult()) == null || commonSearchResult.comboSize() != 0) {
            return false;
        }
        this.l = this.j;
        this.m = true;
        jrhVar.setParam("guideSearch", "false");
        new Handler().post(new Runnable() { // from class: tb.scz
            @Override // java.lang.Runnable
            public final void run() {
                MSController.s1(jrh.this);
            }
        });
        return true;
    }

    public final void N0(CommonBaseDatasource commonBaseDatasource, ynd yndVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d447777", new Object[]{this, commonBaseDatasource, yndVar});
            return;
        }
        ckf.g(commonBaseDatasource, c4o.KEY_DATA_SOURCE);
        ckf.g(yndVar, DataReceiveMonitor.CB_LISTENER);
        Set<ynd> set = this.r.get(commonBaseDatasource.hashCode());
        if (set == null) {
            set = new HashSet<>();
            this.r.put(commonBaseDatasource.hashCode(), set);
        }
        set.add(yndVar);
    }

    public final void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee70124", new Object[]{this});
        } else {
            this.m = true;
        }
    }

    public final void R0(BaseResultActivity baseResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2316bb76", new Object[]{this, baseResultActivity});
        } else {
            this.i = baseResultActivity;
        }
    }

    public final void S0(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342768a1", new Object[]{this, jSONArray});
        } else {
            this.n = jSONArray;
        }
    }

    public final void U0(whj whjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0bbd7c1", new Object[]{this, whjVar});
        } else {
            this.q = whjVar;
        }
    }

    public final void V0(kld kldVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43af62f", new Object[]{this, kldVar});
        } else {
            this.s = kldVar;
        }
    }

    public final void W0(xfn xfnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca30364", new Object[]{this, xfnVar});
        } else {
            this.o = xfnVar;
        }
    }

    public final void X0(CommonSearchContext commonSearchContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27b633a7", new Object[]{this, commonSearchContext});
            return;
        }
        ckf.g(commonSearchContext, "<set-?>");
        this.h = commonSearchContext;
    }

    public final void Y(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d937f1e5", new Object[]{this, jrhVar});
        } else if (TextUtils.equals(jrhVar.getParamValue("addToHistory"), "true")) {
            new com.taobao.search.searchdoor.sf.widgets.activate.a(null, jrhVar.getParamValueIncludingGlobal(r4p.KEY_CHANNEL_HISTORY_KEY)).i(jrhVar.getKeyword());
        }
    }

    public final void Y0(List<SearchBarTagBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6edab93", new Object[]{this, list});
        } else {
            this.p = list;
        }
    }

    public void Z(Map<String, String> map, frh frhVar, jrh jrhVar, osi<frh> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a23098b", new Object[]{this, map, frhVar, jrhVar, osiVar});
            return;
        }
        ckf.g(map, "map");
        ckf.g(frhVar, "combo");
        ckf.g(jrhVar, "scopeDataSource");
        this.l.d(map, frhVar, jrhVar, osiVar);
    }

    /* renamed from: Z0 */
    public void J(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f201ed5d", new Object[]{this, jrhVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        if (jrhVar.P0()) {
            Q(jrhVar);
        } else {
            super.J(jrhVar);
        }
    }

    public final void a0(Map<String, String> map, frh frhVar, gy.c cVar) {
        lrh lrhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5beabbc6", new Object[]{this, map, frhVar, cVar});
            return;
        }
        ckf.g(map, "map");
        ckf.g(frhVar, "combo");
        nxp<jrh, frh, CommonSearchResult> nxpVar = this.l;
        if (nxpVar instanceof lrh) {
            lrhVar = (lrh) nxpVar;
        } else {
            lrhVar = null;
        }
        if (lrhVar != null) {
            lrhVar.r(map, frhVar, cVar);
        }
    }

    public final void a1(jrh jrhVar) {
        MSearchResult U0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7d1fa3", new Object[]{this, jrhVar});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getLastSearchResult();
        if (commonSearchResult != null && (U0 = jrhVar.U0()) != null) {
            frh combo = U0.getCombo(0);
            if (commonSearchResult.isPageTurning && combo != null) {
                ((acx) w().getModel()).c().J0(true);
                if (commonSearchResult.getCells().isEmpty()) {
                    o(jrhVar, combo);
                }
            }
        }
    }

    public final void b1(CommonBaseDatasource commonBaseDatasource, ynd yndVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b32a90", new Object[]{this, commonBaseDatasource, yndVar});
            return;
        }
        ckf.g(commonBaseDatasource, c4o.KEY_DATA_SOURCE);
        ckf.g(yndVar, DataReceiveMonitor.CB_LISTENER);
        Set<ynd> set = this.r.get(commonBaseDatasource.hashCode());
        if (set != null) {
            set.remove(yndVar);
        }
    }

    /* renamed from: c0 */
    public void Q(jrh jrhVar) {
        stc stcVar;
        FrameLayout view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13a412c", new Object[]{this, jrhVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        igw.a(k0());
        MetaChildPageWidget q = q(jrhVar);
        if (!(q == null || (stcVar = (stc) q.t2()) == null || (view = stcVar.getView()) == null)) {
            view.addView(k0());
        }
        int n = o4p.n();
        if (n > 0) {
            k0().setAlpha(0.0f);
            new Handler().postDelayed(new Runnable() { // from class: tb.ucz
                @Override // java.lang.Runnable
                public final void run() {
                    MSController.n1(MSController.this);
                }
            }, n);
        }
    }

    @Override // tb.gu6.a
    public jrh d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrh) ipChange.ipc$dispatch("166fd719", new Object[]{this, new Boolean(z)});
        }
        jrh jrhVar = new jrh(z, this.f, new yno(new v5p("SRPMain")));
        jrhVar.a1(this);
        return jrhVar;
    }

    public final void d0(jrh jrhVar, frh frhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254dafe3", new Object[]{this, jrhVar, frhVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "combo");
        y(jrhVar, frhVar);
        frhVar.P(MetaState.LOADING_MORE);
    }

    public final void d1(frh frhVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e519455a", new Object[]{this, frhVar, new Boolean(z), new Boolean(z2)});
        } else if (frhVar != null) {
            if (z) {
                frhVar.Z(z2);
            }
            frhVar.t0(false);
        }
    }

    /* renamed from: e0 */
    public void L(jrh jrhVar, MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313a5e7a", new Object[]{this, jrhVar, metaChildPageWidget});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(metaChildPageWidget, "childPage");
        if (!jrhVar.isInitDataSource() && o4p.B2()) {
            tnd f = t().f();
            CommonSearchContext commonSearchContext = f instanceof CommonSearchContext ? (CommonSearchContext) f : null;
            if (commonSearchContext != null) {
                jrhVar.setParams(commonSearchContext.getOtherTabParams());
            }
        }
        nxp<jrh, frh, CommonSearchResult> nxpVar = this.l;
        if (nxpVar instanceof lrh) {
            if (TextUtils.isEmpty(jrhVar.getKeyword())) {
                String keyword = m0().getKeyword();
                if (!TextUtils.isEmpty(keyword)) {
                    jrhVar.setParam("q", keyword);
                }
            }
            super.L(jrhVar, metaChildPageWidget);
            return;
        }
        ckf.e(nxpVar, "null cannot be cast to non-null type com.taobao.search.refactor.ns.NSFlow");
        ((uhj) nxpVar).J(jrhVar);
    }

    public final void e1(jrh jrhVar) {
        final boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7487912c", new Object[]{this, jrhVar});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (commonSearchResult != null) {
            bsi c = t().c();
            ckf.e(c, "null cannot be cast to non-null type com.taobao.search.refactor.MSConfig");
            grh grhVar = (grh) c;
            if (commonSearchResult.newSearch) {
                grhVar.D0(true);
                grhVar.K0(new ay4() { // from class: tb.adz
                    @Override // tb.ay4
                    public final Object a(Object obj) {
                        WidgetViewHolder w1;
                        w1 = MSController.w1((w02) obj);
                        return w1;
                    }
                });
                oxb oxbVar = null;
                grhVar.c1(null);
                grhVar.V0(true);
                Activity activity = w().getActivity();
                if (activity instanceof oxb) {
                    oxbVar = (oxb) activity;
                }
                if (oxbVar == null || !oxbVar.E1()) {
                    z = false;
                }
                if (commonSearchResult.similarFold) {
                    grhVar.h0().g(new ouc() { // from class: tb.bdz
                        @Override // tb.ouc
                        public final ssi a(int i) {
                            ssi x1;
                            x1 = MSController.x1(z, i);
                            return x1;
                        }
                    });
                    grhVar.U0(p1p.a(50.0f));
                    grhVar.R0(new ay4() { // from class: tb.cdz
                        @Override // tb.ay4
                        public final Object a(Object obj) {
                            PartnerRecyclerView y1;
                            y1 = MSController.y1((Context) obj);
                            return y1;
                        }
                    });
                } else {
                    grhVar.h0().g(new yhj(z));
                }
                if (commonSearchResult.guideSearch) {
                    grhVar.O().g(Boolean.TRUE);
                }
                grhVar.t1(false);
                return;
            }
            grhVar.w1(true);
            grhVar.Y0(commonSearchResult.isPreciseAppear);
        }
    }

    public final int g0(rhj rhjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9e39140", new Object[]{this, rhjVar})).intValue();
        }
        ckf.g(rhjVar, "combo");
        nxp<jrh, frh, CommonSearchResult> nxpVar = this.l;
        if (!(nxpVar instanceof uhj)) {
            return -1;
        }
        ckf.e(nxpVar, "null cannot be cast to non-null type com.taobao.search.refactor.ns.NSFlow");
        RESULT totalSearchResult = ((jrh) r()).getTotalSearchResult();
        ckf.d(totalSearchResult);
        return ((uhj) nxpVar).t((CommonSearchResult) totalSearchResult, rhjVar);
    }

    public final yko h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        return this.f;
    }

    public final rhj i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rhj) ipChange.ipc$dispatch("d2228e45", new Object[]{this});
        }
        nxp<jrh, frh, CommonSearchResult> nxpVar = this.l;
        if (!(nxpVar instanceof uhj)) {
            return null;
        }
        ckf.e(nxpVar, "null cannot be cast to non-null type com.taobao.search.refactor.ns.NSFlow");
        return ((uhj) nxpVar).v();
    }

    public final int j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ab03e60", new Object[]{this})).intValue();
        }
        nxp<jrh, frh, CommonSearchResult> nxpVar = this.l;
        if (!(nxpVar instanceof uhj)) {
            return 0;
        }
        ckf.e(nxpVar, "null cannot be cast to non-null type com.taobao.search.refactor.ns.NSFlow");
        return ((uhj) nxpVar).w();
    }

    public final View k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dc3c0794", new Object[]{this});
        }
        return (View) this.g.getValue();
    }

    public final xfn l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xfn) ipChange.ipc$dispatch("7f7817da", new Object[]{this});
        }
        return this.o;
    }

    public final CommonSearchContext m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonSearchContext) ipChange.ipc$dispatch("7b0c1d9", new Object[]{this});
        }
        CommonSearchContext commonSearchContext = this.h;
        if (commonSearchContext != null) {
            return commonSearchContext;
        }
        ckf.y("searchContext");
        throw null;
    }

    @Override // tb.z64, com.taobao.android.meta.logic.BaseMetaPageController
    public void n(ksi<jrh, frh, ? extends bsi, CommonSearchResult> ksiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d84b9d1", new Object[]{this, ksiVar});
            return;
        }
        ckf.g(ksiVar, "widget");
        super.n(ksiVar);
        nxp<jrh, frh, CommonSearchResult> nxpVar = this.l;
        if (nxpVar instanceof lrh) {
            ckf.e(nxpVar, "null cannot be cast to non-null type com.taobao.search.refactor.MSFlow");
            bsi c = ((acx) ksiVar.getModel()).c();
            ckf.e(c, "null cannot be cast to non-null type com.taobao.search.refactor.MSConfig");
            ((lrh) nxpVar).g((grh) c);
        }
    }

    public final String n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2478a08", new Object[]{this});
        }
        nxp<jrh, frh, CommonSearchResult> nxpVar = this.l;
        if (!(nxpVar instanceof uhj)) {
            return null;
        }
        ckf.e(nxpVar, "null cannot be cast to non-null type com.taobao.search.refactor.ns.NSFlow");
        return ((uhj) nxpVar).x();
    }

    /* renamed from: p0 */
    public boolean a(int i, jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2660e020", new Object[]{this, new Integer(i), jrhVar})).booleanValue();
        }
        ckf.g(jrhVar, "initDataSource");
        return this.l.a(i, jrhVar);
    }

    public final boolean q0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad3dc01a", new Object[]{this, jSONObject})).booleanValue();
        }
        return !TextUtils.isEmpty(jSONObject.getString(f1i.KEY_GUIDE_SEARCH_URL));
    }

    public final boolean r0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53edc0af", new Object[]{this, jSONObject})).booleanValue();
        }
        return !TextUtils.isEmpty(jSONObject.getString(f1i.KEY_NEW_SEARCH_URL));
    }

    public final boolean s0(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7c6be22", new Object[]{this, jrhVar})).booleanValue();
        }
        if (TextUtils.isEmpty(jrhVar.getParamValueIncludingGlobal("channelSrp")) && TextUtils.isEmpty(jrhVar.getParamValue("m"))) {
            return !w().I2();
        }
        return false;
    }

    public boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd644d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void u0(int i, int i2, int i3, boolean z) {
        MetaChildPageWidget p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b2f124", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        w().T2(i);
        if (i2 > 0) {
            D(i, i2, i3, false);
        }
        if (z && (p = p(i)) != null) {
            ((MSChildPageWidget) p).J3(i3);
        }
    }

    public final void v0(String str, JSONObject jSONObject) {
        acx acxVar;
        com.taobao.android.meta.data.a aVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71305d73", new Object[]{this, str, jSONObject});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((jrh) r()).getTotalSearchResult();
        if (commonSearchResult != null) {
            nxp<jrh, frh, CommonSearchResult> nxpVar = this.l;
            if (nxpVar instanceof klf) {
                ckf.e(nxpVar, "null cannot be cast to non-null type com.taobao.search.refactor.ns.IpGuideFlow");
                ((klf) nxpVar).S(str);
                return;
            }
            List<TabBean> tabs = commonSearchResult.getTabs();
            if (tabs != null) {
                int size = tabs.size();
                for (int i = 0; i < size; i++) {
                    if (TextUtils.equals(tabs.get(i).param, str)) {
                        w().T2(i);
                        MetaChildPageWidget F2 = w().F2(i);
                        if (!(F2 == null || (acxVar = (acx) F2.getModel()) == null || (aVar = (com.taobao.android.meta.data.a) acxVar.e()) == null || jSONObject == null)) {
                            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value != null) {
                                    aVar.setParam(key, value.toString());
                                    z = true;
                                }
                            }
                            if (z) {
                                aVar.doNewSearch(null, true, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: w0 */
    public boolean S(frh frhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e4712ab", new Object[]{this, frhVar})).booleanValue();
        }
        ckf.g(frhVar, "combo");
        return !frhVar.c0();
    }

    @Override // com.taobao.android.meta.logic.BaseMetaPageController
    public tnd x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnd) ipChange.ipc$dispatch("1a30297d", new Object[]{this});
        }
        return m0();
    }

    public final void x0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac0ee4e", new Object[]{this, new Integer(i)});
            return;
        }
        whj whjVar = this.q;
        if (whjVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "totalResults", String.valueOf(i));
            whjVar.d("searchFinish", jSONObject);
        }
    }

    public final void y0(CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8ffd84", new Object[]{this, commonBaseDatasource});
            return;
        }
        Set<ynd> set = this.r.get(commonBaseDatasource.hashCode());
        if (set != null) {
            for (ynd yndVar : set) {
                yndVar.C();
            }
        }
    }

    /* renamed from: z0 */
    public void y(jrh jrhVar, frh frhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ba56ac", new Object[]{this, jrhVar, frhVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "combo");
        this.l.n(jrhVar, frhVar);
    }

    public static final View o1(MSController mSController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("651573ec", new Object[]{mSController});
        }
        ckf.g(mSController, "this$0");
        View inflate = LayoutInflater.from(mSController.w().getActivity()).inflate(R.layout.sf_tbsearch_cover_loading, (ViewGroup) null, false);
        ViewProxy.setOnTouchListener(inflate, new View.OnTouchListener() { // from class: tb.wcz
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean p1;
                p1 = MSController.p1(view, motionEvent);
                return p1;
            }
        });
        return inflate;
    }

    public static final void q1(final MSController mSController, final jrh jrhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208097fc", new Object[]{mSController, jrhVar, new Boolean(z)});
            return;
        }
        ckf.g(mSController, "this$0");
        ckf.g(jrhVar, "$initDataSource");
        super.l(jrhVar, z);
        if (jrhVar.S0() > 0) {
            final int S0 = jrhVar.S0();
            jrhVar.d1(0);
            View view = mSController.w().getView();
            ckf.d(view);
            ((FrameLayout) view).post(new Runnable() { // from class: tb.tcz
                @Override // java.lang.Runnable
                public final void run() {
                    MSController.r1(MSController.this, jrhVar, S0);
                }
            });
        }
    }

    public static final void r1(MSController mSController, jrh jrhVar, int i) {
        stc stcVar;
        MetaLayout j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f74012", new Object[]{mSController, jrhVar, new Integer(i)});
            return;
        }
        ckf.g(mSController, "this$0");
        ckf.g(jrhVar, "$initDataSource");
        MetaChildPageWidget q = mSController.q(jrhVar);
        if (!(q == null || (stcVar = (stc) q.t2()) == null || (j = stcVar.j()) == null)) {
            j.fold();
        }
        mSController.E(jrhVar, i, 0, false);
    }

    /* renamed from: G0 */
    public void k(jrh jrhVar, frh frhVar, boolean z, boolean z2, osi<frh> osiVar) {
        frh combo;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62df980e", new Object[]{this, jrhVar, frhVar, new Boolean(z), new Boolean(z2), osiVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(osiVar, "config");
        ResultMainInfoBean resultMainInfoBean = null;
        if (!z2) {
            MetaChildPageWidget p = p(0);
            MSChildPageWidget mSChildPageWidget = p instanceof MSChildPageWidget ? (MSChildPageWidget) p : null;
            if (mSChildPageWidget != null) {
                mSChildPageWidget.A3();
            }
        }
        d1(frhVar, z2, z);
        if (z) {
            Map<String, String> n = osiVar.n();
            if (TextUtils.equals(n != null ? n.get("searchType") : null, "preload")) {
                return;
            }
        }
        if (((acx) w().getModel()).c().j()) {
            igw.a(k0());
        }
        if (!z) {
            Map<String, String> n2 = osiVar.n();
            if (TextUtils.equals(n2 != null ? n2.get("searchType") : null, "all") && (this.l instanceof lrh)) {
                if (s0(jrhVar)) {
                    c1(jrhVar);
                }
                MSearchResult U0 = jrhVar.U0();
                if (!(U0 == null || (combo = U0.getCombo(0)) == null)) {
                    frhVar = combo;
                }
                nde w = w();
                ckf.e(w, "null cannot be cast to non-null type com.taobao.search.refactor.MSPageWidget");
                ((bsh) w).x3(jrhVar);
            }
        }
        T(jrhVar, frhVar, z, z2, osiVar);
        this.l.k(jrhVar, frhVar, z, z2, osiVar);
        if (!z && this.q != null) {
            if (z2) {
                if ((frhVar != null ? frhVar.h0() : null) == null) {
                    if (frhVar != null) {
                        resultMainInfoBean = frhVar.T();
                    }
                    ckf.d(resultMainInfoBean);
                    i = resultMainInfoBean.totalResult;
                }
            }
            x0(i);
        }
        a1(jrhVar);
    }

    /* renamed from: I0 */
    public void f(jrh jrhVar, boolean z) {
        CommonSearchResult commonSearchResult;
        ResultMainInfoBean mainInfo;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616e1d7f", new Object[]{this, jrhVar, new Boolean(z)});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        this.l.f(jrhVar, z);
        super.f(jrhVar, z);
        if (z && ckf.b(v().e(), jrhVar)) {
            c1(jrhVar);
        }
        igw.a(k0());
        if (this.q != null) {
            if (!(!z || (commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult()) == null || (mainInfo = commonSearchResult.getMainInfo()) == null)) {
                i = mainInfo.totalResult;
            }
            x0(i);
        }
    }

    /* renamed from: Q0 */
    public void C(jrh jrhVar, kae<?, ?> kaeVar, boolean z, frk frkVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9d79e9", new Object[]{this, jrhVar, kaeVar, new Boolean(z), frkVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(kaeVar, "widget");
        MetaChildPageWidget q = q(jrhVar);
        if (q != null) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
            if (commonSearchResult != null) {
                i = commonSearchResult.sceneStickyHeight;
            }
            q.i3(kaeVar, z, frkVar, i);
        }
    }

    /* renamed from: T0 */
    public boolean H(jrh jrhVar, frh frhVar, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfab792c", new Object[]{this, jrhVar, frhVar, listStyle})).booleanValue();
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "combo");
        ckf.g(listStyle, "newStyle");
        if (this.l.p(jrhVar, frhVar, listStyle)) {
            return true;
        }
        return super.H(jrhVar, frhVar, listStyle);
    }

    /* renamed from: b0 */
    public void e(CommonSearchResult commonSearchResult, JSONObject jSONObject, yko ykoVar) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf635c5", new Object[]{this, commonSearchResult, jSONObject, ykoVar});
            return;
        }
        ckf.g(commonSearchResult, "result");
        if (jSONObject != null && this.m) {
            if (r0(jSONObject)) {
                if (!(this.l instanceof uhj)) {
                    uhj uhjVar = new uhj();
                    uhjVar.K(this);
                    this.l = uhjVar;
                }
            } else if (q0(jSONObject)) {
                if (!(this.l instanceof klf)) {
                    klf klfVar = new klf(false);
                    klfVar.K(this);
                    this.l = klfVar;
                }
            } else if (!(this.l instanceof lrh)) {
                lrh lrhVar = this.j;
                lrhVar.S(this);
                lrhVar.Q(this.p);
                lrhVar.P(this.o);
                lrhVar.L(this.n);
                this.l = lrhVar;
            }
            this.m = false;
        }
        this.l.e(commonSearchResult, jSONObject, ykoVar);
        if (t0()) {
            gy.c searchConfig = commonSearchResult.getSearchConfig();
            ckf.e(searchConfig, "null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchConfig<*>");
            Map<String, String> n = ((osi) searchConfig).n();
            String str2 = n != null ? n.get("listStyle") : null;
            ListStyle listStyle = commonSearchResult.getMainInfo().style;
            ckf.f(listStyle, "style");
            if (!TextUtils.isEmpty(str2)) {
                listStyle = ListStyle.fromString(str2);
            }
            kne kneVar = this.k;
            if (kneVar != null) {
                boolean isNew = commonSearchResult.isNew();
                List<BaseCellBean> cells = commonSearchResult.getCells();
                gy.c searchConfig2 = commonSearchResult.getSearchConfig();
                ckf.e(searchConfig2, "null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchConfig<*>");
                Map<String, String> n2 = ((osi) searchConfig2).n();
                if (!(n2 == null || (str = n2.get("listWidth")) == null)) {
                    i = Integer.parseInt(str);
                }
                kneVar.a(isNew, listStyle, cells, i);
            }
        }
    }

    public void c1(jrh jrhVar) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8bcadd9", new Object[]{this, jrhVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.isSuccess()) {
            String str = commonSearchResult.getMainInfo().pageName;
            String str2 = commonSearchResult.getMainInfo().pageTraceName;
            Map<String, String> map2 = commonSearchResult.getMainInfo().pageTraceArgs;
            String str3 = "Page_SearchItemList";
            if (jrhVar.G()) {
                str2 = "Page_SearchSimilar";
            } else if (jrhVar.E()) {
                str2 = "Page_SearchSameStyle";
            } else if (jrhVar.H()) {
                str2 = "Page_SearchSpuItemList";
            } else if (TextUtils.equals(q1p.PAGE_NAME_MAIN_SPU, str)) {
                str2 = "Page_SearchSpuList";
            } else if (TextUtils.equals(q1p.PAGE_NAME_MAIN, str)) {
                str2 = str3;
            } else if (TextUtils.equals(q1p.PAGE_NAME_TMALL, str)) {
                str2 = "Page_SearchTmallList";
            } else if (TextUtils.equals(q1p.PAGE_NAME_TMALL_SPU, str)) {
                str2 = "Page_SearchTmallSpuList";
            } else if (TextUtils.equals(q1p.PAGE_NAME_SHOP, str)) {
                str2 = "Page_SearchShopList";
            } else if (commonSearchResult.newSearch) {
                str2 = commonSearchResult.getMainInfo().pageTraceName;
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = str2;
            }
            HashMap hashMap = new HashMap();
            if (commonSearchResult.newSearch) {
                hashMap.put(r4p.VALUE_BIZ_TYPE_NEW_SEARCH, "true");
            }
            String param = m0().getParam("pageName");
            if (!TextUtils.isEmpty(param)) {
                String param2 = m0().getParam("psqk");
                if (!TextUtils.isEmpty(param2)) {
                    hashMap.put("psqk", param2);
                }
                str3 = param;
            }
            String keyword = jrhVar.getKeyword();
            if (!TextUtils.isEmpty(keyword)) {
                hashMap.put(Constants.KEY_SEARCH_KEYWORD, keyword);
                hashMap.put("keyword", keyword);
            }
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            HashMap hashMap2 = new HashMap();
            SFOnesearchBean onesearch = commonSearchResult.getOnesearch();
            if (!(onesearch == null || (map = onesearch.nextPageTraceMap) == null)) {
                hashMap2.putAll(map);
            }
            if (!TextUtils.isEmpty(keyword)) {
                hashMap2.put(Constants.KEY_SEARCH_KEYWORD, keyword);
                hashMap2.put("keyword", keyword);
            }
            BaseResultActivity baseResultActivity = this.i;
            if (baseResultActivity != null) {
                baseResultActivity.onEventMainThread(lml.a(str3, false, hashMap, hashMap2));
            }
        }
    }

    public final boolean P0(final jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f6065d2", new Object[]{this, jrhVar})).booleanValue();
        }
        RESULT totalSearchResult = jrhVar.getTotalSearchResult();
        MSearchResult mSearchResult = totalSearchResult instanceof MSearchResult ? (MSearchResult) totalSearchResult : null;
        if (mSearchResult == null || !mSearchResult.isRedirectMode() || TextUtils.isEmpty(mSearchResult.getRedirectUrl())) {
            return false;
        }
        SFOnesearchBean onesearch = mSearchResult.getOnesearch();
        if (onesearch != null && !TextUtils.isEmpty(onesearch.utLogMap) && !TextUtils.isEmpty(onesearch.expArg1)) {
            HashMap hashMap = new HashMap();
            hashMap.put("utLogMap", f6p.d(onesearch.utLogMap));
            hashMap.put("spm", "a2141.7631557.0.0");
            sen.l(onesearch.expArg1, hashMap);
        }
        Intent intentForUri = Nav.from(w().getActivity()).intentForUri(mSearchResult.getRedirectUrl());
        if (intentForUri == null || intentForUri.getComponent() == null) {
            Nav.from(w().getActivity()).toUri(mSearchResult.getRedirectUrl());
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.xcz
                @Override // java.lang.Runnable
                public final void run() {
                    MSController.t1(MSController.this);
                }
            });
            return true;
        }
        String canonicalName = MainSearchResultActivity.class.getCanonicalName();
        ComponentName component = intentForUri.getComponent();
        ckf.d(component);
        if (!TextUtils.equals(canonicalName, component.getClassName())) {
            Nav.from(w().getActivity()).toUri(mSearchResult.getRedirectUrl());
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.ycz
                @Override // java.lang.Runnable
                public final void run() {
                    MSController.u1(MSController.this);
                }
            });
            return true;
        } else if (!TextUtils.equals(Uri.parse(mSearchResult.getRedirectUrl()).getQueryParameter("q"), m0().getParam("q"))) {
            return false;
        } else {
            String param = m0().getParam("from");
            m0().updateParams(cql.d(Uri.parse(mSearchResult.getRedirectUrl())));
            if (!TextUtils.isEmpty(param)) {
                m0().setParam("from", param);
            }
            mSearchResult.setRedirectMode(false);
            mSearchResult.setRedirectUrl("");
            mSearchResult.clearCombos();
            jrhVar.setSearchParam(gu6.a(true, m0(), this).getCurrentParam());
            K(jrhVar);
            new Handler().post(new Runnable() { // from class: tb.zcz
                @Override // java.lang.Runnable
                public final void run() {
                    MSController.v1(jrh.this);
                }
            });
            return true;
        }
    }
}
