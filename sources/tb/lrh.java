package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.refactor.MSChildPageWidget;
import com.taobao.search.refactor.MSController;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.util.MultiValueParamArrayMap;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.gy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class lrh extends nxp<jrh, frh, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public JSONArray f23530a;
    public MSController b;
    public List<SearchBarTagBean> c;
    public xfn d;
    public boolean f;
    public final hrh e = new hrh(this);
    public final klf g = new klf(true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792878);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final String a(frh frhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e785a5da", new Object[]{this, frhVar});
            }
            ckf.g(frhVar, "combo");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            ArrayList<BaseCellBean> arrayList = new ArrayList<>();
            frhVar.E0(arrayList);
            StringBuilder sb3 = new StringBuilder();
            for (BaseCellBean baseCellBean : pba.INSTANCE.b()) {
                if (baseCellBean.isP4p) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(baseCellBean.itemId);
                } else {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(baseCellBean.itemId);
                }
                arrayList.add(baseCellBean);
            }
            if (sb.length() > 0) {
                sb3.append("main#" + ((Object) sb));
            }
            if (sb2.length() > 0) {
                if (sb3.length() > 0) {
                    sb3.append(";");
                }
                sb3.append("p4p#" + ((Object) sb2));
            }
            String sb4 = sb3.toString();
            ckf.f(sb4, "toString(...)");
            return sb4;
        }

        public a() {
        }
    }

    static {
        t2o.a(815792877);
    }

    public static /* synthetic */ Object ipc$super(lrh lrhVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1140413633) {
            super.m((com.taobao.android.meta.data.a) objArr[0], (asi) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1738526754) {
            super.b((com.taobao.android.meta.data.a) objArr[0], (asi) objArr[1], ((Boolean) objArr[2]).booleanValue(), (Map) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/refactor/MSFlow");
        }
    }

    public final void A(jrh jrhVar) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420a760f", new Object[]{this, jrhVar});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getLastSearchResult();
        if (commonSearchResult != null && (map = commonSearchResult.updateParams) != null && !map.isEmpty()) {
            T(map.get("q"));
            jrhVar.setParams(map);
        }
    }

    /* renamed from: B */
    public void n(jrh jrhVar, frh frhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ba56ac", new Object[]{this, jrhVar, frhVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "combo");
        jrhVar.doLoadMore(frhVar, null);
    }

    /* renamed from: C */
    public void m(jrh jrhVar, frh frhVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d437f1c1", new Object[]{this, jrhVar, frhVar, new Integer(i)});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "combo");
        super.m(jrhVar, frhVar, i);
        frhVar.r0(i);
    }

    /* renamed from: F */
    public void o(jrh jrhVar, MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463d149b", new Object[]{this, jrhVar, metaChildPageWidget});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(metaChildPageWidget, "childPage");
        ((juc) v().w().t2()).j().unfold();
        nde w = v().w();
        ckf.e(w, "null cannot be cast to non-null type com.taobao.search.refactor.MSPageWidget");
        ((bsh) w).x3(jrhVar);
    }

    /* renamed from: H */
    public void l(jrh jrhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4469299e", new Object[]{this, jrhVar, new Boolean(z)});
            return;
        }
        ckf.g(jrhVar, "initDataSource");
        if (z) {
            A(jrhVar);
            x(jrhVar);
            R(jrhVar);
            jrhVar.T(jrhVar.getUIListStyle());
        }
    }

    public final void L(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342768a1", new Object[]{this, jSONArray});
        } else {
            this.f23530a = jSONArray;
        }
    }

    public final void N(MSController mSController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318fd741", new Object[]{this, mSController});
            return;
        }
        ckf.g(mSController, "<set-?>");
        this.b = mSController;
    }

    public final void P(xfn xfnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca30364", new Object[]{this, xfnVar});
        } else {
            this.d = xfnVar;
        }
    }

    public final void Q(List<SearchBarTagBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6edab93", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }

    public final void R(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b403ac2", new Object[]{this, jrhVar});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (commonSearchResult != null && jrhVar.z()) {
            HashMap hashMap = new HashMap();
            hashMap.put("isJiaGou", "true");
            hashMap.put("query", jrhVar.getKeyword());
            hashMap.put("bucket_id", commonSearchResult.getMainInfo().abtest);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
        }
    }

    public final void S(MSController mSController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad132fa", new Object[]{this, mSController});
            return;
        }
        ckf.g(mSController, "controller");
        N(mSController);
        this.g.K(mSController);
    }

    public final void T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab320b71", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            CommonSearchContext m0 = v().m0();
            if (TextUtils.isEmpty(m0.getKeyword())) {
                m0.setParam("q", str);
            }
        }
    }

    public final void g(grh grhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224fe275", new Object[]{this, grhVar});
        }
    }

    /* renamed from: s */
    public void e(CommonSearchResult commonSearchResult, JSONObject jSONObject, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf635c5", new Object[]{this, commonSearchResult, jSONObject, ykoVar});
            return;
        }
        ckf.g(commonSearchResult, "result");
        this.e.e((MSearchResult) commonSearchResult, jSONObject, ykoVar);
    }

    public final int t(frh frhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef704ef2", new Object[]{this, frhVar})).intValue();
        }
        for (hte hteVar : i04.q0(i04.H0(frhVar.j()))) {
            int a2 = hteVar.a();
            if (((BaseCellBean) hteVar.b()).isExposed) {
                return a2 + 1;
            }
        }
        return 0;
    }

    public final JSONArray u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7265ff99", new Object[]{this});
        }
        return this.f23530a;
    }

    public final MSController v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MSController) ipChange.ipc$dispatch("44eed38f", new Object[]{this});
        }
        MSController mSController = this.b;
        if (mSController != null) {
            return mSController;
        }
        ckf.y("controller");
        throw null;
    }

    public final int w(osi<frh> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0ab5c29", new Object[]{this, osiVar})).intValue();
        }
        Map<String, String> n = osiVar.n();
        if (n == null) {
            return -1;
        }
        Integer f = qrl.f(n.get("refreshFrom"), -1);
        ckf.f(f, "parseInteger(...)");
        return f.intValue();
    }

    public final void x(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac987bee", new Object[]{this, jrhVar});
            return;
        }
        jrhVar.N();
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (commonSearchResult != null && !TextUtils.isEmpty(commonSearchResult.poplayerUrl)) {
            wlo.a(v().w().getActivity(), v().m0(), commonSearchResult.poplayerUrl);
        }
    }

    /* renamed from: y */
    public boolean a(int i, jrh jrhVar) {
        MSearchResult U0;
        List<TabBean> tabs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2660e020", new Object[]{this, new Integer(i), jrhVar})).booleanValue();
        }
        ckf.g(jrhVar, "initDataSource");
        if (!(this.f || (U0 = jrhVar.U0()) == null || (tabs = U0.getTabs()) == null)) {
            TabBean tabBean = tabs.get(i);
            String tab = jrhVar.getTab();
            if (tabBean.isSelected && (tabs.size() <= 1 || TextUtils.isEmpty(tab) || TextUtils.equals(tab, tabBean.param))) {
                this.f = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public acx<jrh> c(int i, TabBean tabBean, jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("42c7a42", new Object[]{this, new Integer(i), tabBean, jrhVar});
        }
        ckf.g(tabBean, "tab");
        ckf.g(jrhVar, "initDataSource");
        jrh a2 = gu6.a(false, v().m0(), v());
        Map<String, String> tabParams = v().m0().getTabParams(tabBean.param);
        if (tabParams != null) {
            for (Map.Entry<String, String> entry : tabParams.entrySet()) {
                a2.setParam(entry.getKey(), entry.getValue());
            }
        }
        a2.setParam(r4p.VALUE_BIZ_TYPE_NEW_SEARCH, "false");
        a2.setParam("guideSearch", "false");
        List<SearchBarTagBean> list = this.c;
        if (list != null && !list.isEmpty()) {
            MultiValueParamArrayMap multiValueParamArrayMap = new MultiValueParamArrayMap();
            for (SearchBarTagBean searchBarTagBean : list) {
                Map<String, String> params = searchBarTagBean.getParams();
                if (params != null) {
                    multiValueParamArrayMap.putAll(params);
                }
            }
            a2.setParams(multiValueParamArrayMap);
        }
        a2.setParam("tab", tabBean.param);
        cvr cvrVar = cvr.INSTANCE;
        a2.setParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN, String.valueOf(cvrVar.f()));
        a2.setParam(r4p.KEY_GRAY_HAIR, String.valueOf(cvrVar.f()));
        a2.x(jrhVar.j(), false);
        tnl<D> v = v().v();
        ckf.e(v, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.PageModel<com.taobao.search.sf.datasource.CommonBaseDatasource>");
        return new b64(v, a2, this.d);
    }

    /* renamed from: E */
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
        int w = w(osiVar);
        if (w >= 0) {
            frhVar.B0(1 + w);
            frhVar.C(frhVar2, w);
        } else {
            frhVar.B0(frhVar.t().size());
            frhVar.x(frhVar2);
        }
        frhVar.p0();
    }

    /* renamed from: I */
    public void f(jrh jrhVar, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616e1d7f", new Object[]{this, jrhVar, new Boolean(z)});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        if (z) {
            A(jrhVar);
            jrhVar.T(jrhVar.getUIListStyle());
        }
        if (z) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
            ResultMainInfoBean resultMainInfoBean = null;
            frh combo = commonSearchResult != null ? commonSearchResult.getCombo(0) : null;
            if ((combo != null ? combo.h0() : null) == null) {
                if (combo != null) {
                    resultMainInfoBean = combo.T();
                }
                ckf.d(resultMainInfoBean);
                i = resultMainInfoBean.totalResult;
            }
        }
        v().x0(i);
    }

    /* renamed from: J */
    public void b(jrh jrhVar, frh frhVar, boolean z, Map<String, String> map) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1457222", new Object[]{this, jrhVar, frhVar, new Boolean(z), map});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        if (frhVar != null && !frhVar.c0() && (commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult()) != null && commonSearchResult.isPullRefreshEnabled) {
            MetaChildPageWidget q = v().q(jrhVar);
            ckf.e(q, "null cannot be cast to non-null type com.taobao.search.refactor.MSChildPageWidget");
            ((MSChildPageWidget) q).A3();
        }
        super.b(jrhVar, frhVar, z, map);
    }

    /* renamed from: K */
    public void i(jrh jrhVar, frh frhVar, frh frhVar2, osi<frh> osiVar) {
        String str;
        CommonSearchResult commonSearchResult;
        SearchParamImpl r;
        CommonSearchResult commonSearchResult2;
        ResultMainInfoBean mainInfo;
        ListStyle listStyle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67032f4", new Object[]{this, jrhVar, frhVar, frhVar2, osiVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "src");
        ckf.g(frhVar2, "incoming");
        ckf.g(osiVar, "config");
        frhVar.C0(frhVar2.l0());
        Map<String, String> n = osiVar.n();
        SearchParamImpl searchParamImpl = null;
        if (!(!TextUtils.equals(n != null ? n.get("searchType") : null, "auction") || (commonSearchResult2 = (CommonSearchResult) jrhVar.getTotalSearchResult()) == null || (mainInfo = commonSearchResult2.getMainInfo()) == null || (listStyle = mainInfo.style) == null)) {
            frhVar2.T().style = listStyle;
        }
        CommonSearchResult commonSearchResult3 = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (commonSearchResult3 != null) {
            commonSearchResult3.setMainInfo(frhVar2.T());
        }
        Map<String, String> n2 = osiVar.n();
        if (!(n2 == null || (str = n2.get("searchType")) == null)) {
            if (ckf.b(str, "all")) {
                CommonSearchResult commonSearchResult4 = (CommonSearchResult) jrhVar.getTotalSearchResult();
                if (!(commonSearchResult4 == null || (commonSearchResult = (CommonSearchResult) jrhVar.getLastSearchResult()) == null)) {
                    jrhVar.setTotalResult(commonSearchResult);
                    frh combo = commonSearchResult.getCombo(0);
                    if (!(combo == null || (r = combo.r()) == null)) {
                        frh combo2 = commonSearchResult4.getCombo(0);
                        if (combo2 != null) {
                            searchParamImpl = combo2.r();
                        }
                        r.copy(searchParamImpl);
                    }
                    if (jrhVar.getUserListStyle() != null) {
                        commonSearchResult.getMainInfo().style = frhVar.p();
                        frhVar2.N(frhVar.p());
                    }
                    frhVar.X(frhVar2.T());
                }
            } else {
                frhVar.R(frhVar2);
            }
        }
        frhVar.B0(0);
    }

    /* renamed from: O */
    public boolean p(jrh jrhVar, frh frhVar, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfab792c", new Object[]{this, jrhVar, frhVar, listStyle})).booleanValue();
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "combo");
        ckf.g(listStyle, "newStyle");
        jrhVar.T(listStyle);
        return false;
    }

    /* renamed from: q */
    public void d(Map<String, String> map, frh frhVar, jrh jrhVar, osi<frh> osiVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a23098b", new Object[]{this, map, frhVar, jrhVar, osiVar});
            return;
        }
        ckf.g(map, "map");
        ckf.g(frhVar, "combo");
        ckf.g(jrhVar, "scopeDataSource");
        if (jrhVar.M0()) {
            this.g.d(map, frhVar, jrhVar, osiVar);
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.isPullRefreshEnabled) {
            ResultMainInfoBean m0 = frhVar.m0();
            if (m0 == null || (str = m0.rn) == null) {
                str = "";
            }
            map.put("refresh_first_rn", str);
            if (frhVar.c0()) {
                map.put("refresh_count", String.valueOf(frhVar.k0() + 1));
                map.put("pull_refresh", "true");
            } else {
                map.put("refresh_count", String.valueOf(frhVar.k0()));
            }
        }
        if (osiVar != null) {
            map.put("exposure_ids", Companion.a(frhVar));
        }
    }

    /* renamed from: G */
    public void k(jrh jrhVar, frh frhVar, boolean z, boolean z2, osi<frh> osiVar) {
        Map<String, String> n;
        String str;
        ArrayList<BaseCellBean> n0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62df980e", new Object[]{this, jrhVar, frhVar, new Boolean(z), new Boolean(z2), osiVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(osiVar, "config");
        if (!(!z2 || frhVar == null || (n0 = frhVar.n0()) == null)) {
            pba.INSTANCE.c(n0);
            frhVar.E0(null);
        }
        if (z2) {
            A(jrhVar);
        }
        if (!z2) {
            return;
        }
        if (z) {
            MetaChildPageWidget F2 = v().w().F2(jrhVar.getIndex());
            if (F2 != null) {
                F2.f3(false);
            }
            tt3.d().g(jrhVar.getTab(), jrhVar.getKeyword(), jrhVar.getCurrentPage(), false);
            return;
        }
        jrhVar.B0();
        if (((CommonSearchResult) jrhVar.getLastSearchResult()) != null && (n = osiVar.n()) != null && (str = n.get("searchType")) != null) {
            if (ckf.b(str, "all")) {
                MetaChildPageWidget F22 = v().w().F2(jrhVar.getIndex());
                if (F22 != null) {
                    if (((acx) F22.getModel()).g()) {
                        ((juc) v().w().t2()).j().unfold();
                    }
                    ((stc) F22.t2()).j().unfold();
                    F22.f3(true);
                    F22.x();
                }
                tt3.d().g(jrhVar.getTab(), jrhVar.getKeyword(), jrhVar.getCurrentPage(), true);
            } else if (ckf.b(str, "auction")) {
                MetaChildPageWidget F23 = v().w().F2(jrhVar.getIndex());
                if (F23 != null) {
                    F23.f3(true);
                    F23.x();
                }
                tt3.d().g(jrhVar.getTab(), jrhVar.getKeyword(), jrhVar.getCurrentPage(), true);
            } else {
                MetaChildPageWidget F24 = v().w().F2(jrhVar.getIndex());
                if (F24 != null) {
                    F24.f3(false);
                }
            }
        }
    }

    public final boolean z(gy.c cVar) {
        Map<String, String> n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39995282", new Object[]{this, cVar})).booleanValue();
        }
        osi osiVar = cVar instanceof osi ? (osi) cVar : null;
        if (osiVar == null || (n = osiVar.n()) == null) {
            return false;
        }
        return !TextUtils.isEmpty(n.get("refreshFrom"));
    }

    public final void r(Map<String, String> map, frh frhVar, gy.c cVar) {
        int i;
        StringBuilder sb;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1802aa", new Object[]{this, map, frhVar, cVar});
            return;
        }
        ckf.g(map, "map");
        ckf.g(frhVar, "combo");
        if (frhVar.U() > 1) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder();
            StringBuilder sb6 = new StringBuilder();
            StringBuilder sb7 = new StringBuilder();
            if (z(cVar)) {
                i = t(frhVar);
            } else {
                i = frhVar.j().size();
            }
            int j0 = frhVar.j0();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (j0 < i) {
                BaseCellBean baseCellBean = frhVar.j().get(j0);
                sb7.append(baseCellBean.exposeInfo);
                sb7.append(",");
                if (!TextUtils.equals(baseCellBean.cardType, "item")) {
                    if (TextUtils.equals(baseCellBean.cardType, "multi_item")) {
                        String[] strArr = baseCellBean.curItemIds;
                        if (strArr != null) {
                            int i6 = 0;
                            for (int length = strArr.length; i6 < length; length = length) {
                                String str = strArr[i6];
                                sb6.append("m,");
                                sb2.append(str);
                                sb2.append(',');
                                i4++;
                                i6++;
                            }
                        }
                        String[] strArr2 = baseCellBean.curP4pIds;
                        if (strArr2 != null) {
                            for (String str2 : strArr2) {
                                sb6.append("p,");
                                sb3.append(str2);
                                sb3.append(',');
                                i3++;
                            }
                        }
                    } else if (!TextUtils.isEmpty(baseCellBean.cardType) && !TextUtils.isEmpty(baseCellBean.bizItemId)) {
                        sb4.append(baseCellBean.cardType);
                        sb4.append(":");
                        sb4.append(baseCellBean.bizItemId);
                        sb4.append(",");
                    }
                    i2 = 1;
                } else if (baseCellBean.isP4p) {
                    sb6.append("p,");
                    sb3.append(baseCellBean.itemId);
                    sb3.append(',');
                    i2 = 1;
                    i3++;
                    if (baseCellBean.isDynamicLandP4p) {
                        sb5.append(baseCellBean.itemId);
                        sb5.append(',');
                        i5++;
                    }
                } else {
                    i2 = 1;
                    sb6.append("m,");
                    sb2.append(baseCellBean.itemId);
                    sb2.append(',');
                    i4++;
                }
                j0 += i2;
                i = i;
                sb7 = sb7;
            }
            frhVar.w0(i3);
            frhVar.v0(i4);
            frhVar.u0(i5);
            if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            if (sb3.length() > 0) {
                sb3.deleteCharAt(sb3.length() - 1);
            }
            if (sb5.length() > 0) {
                sb5.deleteCharAt(sb5.length() - 1);
            }
            if (sb6.length() > 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            if (sb4.length() > 0) {
                sb4.deleteCharAt(sb4.length() - 1);
            }
            if (sb7.length() > 0) {
                sb = sb7;
                sb.deleteCharAt(sb7.length() - 1);
            } else {
                sb = sb7;
            }
            map.put(r4p.KEY_ITEM_S, String.valueOf(frhVar.g0() + i4));
            map.put(r4p.KEY_P4P_S, String.valueOf(frhVar.i0() + i3));
            map.put(r4p.KEY_DYNAMIC_P4P_S, String.valueOf(frhVar.b0() + i5));
            map.put("itemIds", sb2.toString());
            map.put(r4p.KEY_P4P_IDS, sb3.toString());
            map.put(r4p.KEY_DYNAMIC_P4P_IDS, sb5.toString());
            map.put(r4p.KEY_EXPOSE_TYPES, sb6.toString());
            map.put(r4p.KEY_EXPOSE_INFO, sb.toString());
            if (sb4.length() > 0) {
                map.put(r4p.KEY_CONTENT_IDS, sb4.toString());
            }
        }
    }
}
