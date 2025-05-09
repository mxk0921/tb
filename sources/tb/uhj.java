package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.refactor.MSController;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uhj extends nxp<jrh, frh, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MSController f29387a;
    public rhj e;
    public String f;
    public final shj b = new shj();
    public final SparseArray<rhj> c = new SparseArray<>();
    public int d = -1;
    public boolean g = true;

    static {
        t2o.a(815792904);
    }

    public static /* synthetic */ Object ipc$super(uhj uhjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/ns/NSFlow");
    }

    /* renamed from: A */
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

    /* renamed from: D */
    public void j(jrh jrhVar, frh frhVar, frh frhVar2, osi<frh> osiVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae87a003", new Object[]{this, jrhVar, frhVar, frhVar2, osiVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "src");
        ckf.g(frhVar2, "incoming");
        ckf.g(osiVar, "config");
        rhj rhjVar = (rhj) frhVar;
        Map<String, String> n = osiVar.n();
        if (n == null || (str = n.get("searchType")) == null) {
            if (rhjVar.K0()) {
                rhjVar.x(frhVar2);
            }
        } else if (TextUtils.equals(str, "preload")) {
            rhjVar.u1((rhj) frhVar2);
        }
    }

    /* renamed from: G */
    public void l(jrh jrhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4469299e", new Object[]{this, jrhVar, new Boolean(z)});
            return;
        }
        ckf.g(jrhVar, "initDataSource");
        if (z) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
            if (commonSearchResult != null) {
                bn9 bn9Var = commonSearchResult.floatBarBean;
                if (bn9Var != null) {
                    bn9Var.b = null;
                }
                int comboSize = commonSearchResult.comboSize();
                for (int i = 0; i < comboSize; i++) {
                    frh combo = commonSearchResult.getCombo(i);
                    if (combo != null) {
                        rhj rhjVar = (rhj) combo;
                        rhjVar.y1(t(commonSearchResult, rhjVar));
                    }
                }
            }
            Q(jrhVar);
        }
    }

    /* renamed from: I */
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
        rhj rhjVar = (rhj) frhVar;
        Map<String, String> n = osiVar.n();
        if (n != null && TextUtils.equals(n.get("searchType"), "all")) {
            rhjVar.h1((rhj) frhVar2);
        }
        rhjVar.R(frhVar2);
    }

    public final void K(MSController mSController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318fd741", new Object[]{this, mSController});
            return;
        }
        ckf.g(mSController, "<set-?>");
        this.f29387a = mSController;
    }

    public final void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ecdfe9", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final void P(CommonSearchResult commonSearchResult) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2ea6fd", new Object[]{this, commonSearchResult});
        } else if (this.d == -1) {
            if (commonSearchResult.getTabs() != null) {
                List<TabBean> tabs = commonSearchResult.getTabs();
                ckf.d(tabs);
                if (tabs.size() != 1) {
                    int comboSize = commonSearchResult.comboSize();
                    while (true) {
                        if (i >= comboSize) {
                            break;
                        }
                        frh combo = commonSearchResult.getCombo(i);
                        ckf.e(combo, "null cannot be cast to non-null type com.taobao.search.refactor.ns.NSCombo");
                        rhj rhjVar = (rhj) combo;
                        if (rhjVar.Q0()) {
                            this.e = rhjVar;
                            break;
                        }
                        i++;
                    }
                    rhj rhjVar2 = this.e;
                    if (rhjVar2 != null) {
                        this.d = t(commonSearchResult, rhjVar2);
                        return;
                    }
                    return;
                }
            }
            this.d = 0;
        }
    }

    public final void Q(jrh jrhVar) {
        oxb oxbVar;
        int i;
        w7p w7pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1859fd", new Object[]{this, jrhVar});
            return;
        }
        ckf.g(jrhVar, "initDataSource");
        Activity activity = u().w().getActivity();
        if (activity instanceof oxb) {
            oxbVar = (oxb) activity;
        } else {
            oxbVar = null;
        }
        if (oxbVar != null && oxbVar.E1()) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
            if (commonSearchResult != null) {
                i = commonSearchResult.comboSize();
            } else {
                i = 0;
            }
            for (int i2 = 0; i2 < i; i2++) {
                RESULT totalSearchResult = jrhVar.getTotalSearchResult();
                ckf.d(totalSearchResult);
                frh combo = ((CommonSearchResult) totalSearchResult).getCombo(i2);
                if (combo != null) {
                    for (BaseCellBean baseCellBean : combo.t()) {
                        if (baseCellBean.isSection && (w7pVar = baseCellBean.ownedSectionStyle) != null) {
                            w7pVar.j(0);
                        }
                    }
                }
            }
        }
    }

    public final void R(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab0f828", new Object[]{this, commonSearchResult});
        } else if (this.f == null) {
            List<TabBean> tabs = commonSearchResult.getTabs();
            if (tabs != null) {
                StringBuilder sb = new StringBuilder();
                int size = tabs.size();
                for (int i = 0; i < size; i++) {
                    sb.append(tabs.get(i).bizName);
                    if (i < tabs.size() - 1) {
                        sb.append(",");
                    }
                }
                this.f = sb.toString();
                return;
            }
            this.f = "";
        }
    }

    /* renamed from: q */
    public void d(Map<String, String> map, frh frhVar, jrh jrhVar, osi<frh> osiVar) {
        Map<String, String> n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a23098b", new Object[]{this, map, frhVar, jrhVar, osiVar});
            return;
        }
        ckf.g(map, "map");
        ckf.g(frhVar, "combo");
        ckf.g(jrhVar, "scopeDataSource");
        rhj rhjVar = (rhj) frhVar;
        if (!rhjVar.Q0()) {
            map.put("m", "combo");
            String J0 = rhjVar.J0();
            if (J0 == null) {
                J0 = "";
            }
            map.put("comboBizType", J0);
        } else {
            map.put("comboBizType", "item");
        }
        map.put(r4p.KEY_NEED_TABS, "false");
        map.put(r4p.VALUE_BIZ_TYPE_NEW_SEARCH, "true");
        map.put("bizName", "all");
        map.putAll(frhVar.o0());
        if (TextUtils.isEmpty(map.get("n"))) {
            map.put("n", "10");
        }
        map.put(r4p.KEY_P4P_S, String.valueOf(rhjVar.W0()));
        map.put(r4p.KEY_ITEM_S, String.valueOf(rhjVar.S0()));
        String X0 = rhjVar.X0();
        if (X0 != null) {
            map.put(r4p.KEY_P4P_IDS, X0);
        }
        String T0 = rhjVar.T0();
        if (T0 != null) {
            map.put("itemIds", T0);
        }
        if (rhjVar.Z0() == null) {
            if (!TextUtils.equals("preload", (osiVar == null || (n = osiVar.n()) == null) ? null : n.get("searchType"))) {
                return;
            }
        }
        map.put("isNewSearchSubTab", "true");
    }

    public final void r(rhj rhjVar, jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1febc6", new Object[]{this, rhjVar, jrhVar});
            return;
        }
        rhjVar.B1();
        z(jrhVar, (jrh) u().r());
        MetaChildPageWidget q = u().q(jrhVar);
        if (q != null) {
            q.f3(true);
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
        this.b.e((MSearchResult) commonSearchResult, jSONObject, ykoVar);
        P(commonSearchResult);
        R(commonSearchResult);
    }

    public final MSController u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MSController) ipChange.ipc$dispatch("44eed38f", new Object[]{this});
        }
        MSController mSController = this.f29387a;
        if (mSController != null) {
            return mSController;
        }
        ckf.y("controller");
        throw null;
    }

    public final rhj v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rhj) ipChange.ipc$dispatch("d2228e45", new Object[]{this});
        }
        return this.e;
    }

    public final int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ab03e60", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2478a08", new Object[]{this});
        }
        return this.f;
    }

    /* renamed from: y */
    public boolean a(int i, jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2660e020", new Object[]{this, new Integer(i), jrhVar})).booleanValue();
        }
        ckf.g(jrhVar, "initDataSource");
        if (i == 0) {
            return true;
        }
        return false;
    }

    public final void z(jrh jrhVar, jrh jrhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc6c88", new Object[]{this, jrhVar, jrhVar2});
            return;
        }
        jrhVar.getTemplateFiles().putAll(jrhVar2.getTemplateFiles());
        jrhVar.mergeTemplates(jrhVar2.getAllTemplates());
    }

    /* renamed from: B */
    public void m(jrh jrhVar, frh frhVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d437f1c1", new Object[]{this, jrhVar, frhVar, new Integer(i)});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "combo");
        rhj rhjVar = (rhj) frhVar;
        if (this.g && rhjVar.Z0() == null && rhjVar.L0() && rhjVar.w() && rhjVar.d1() > 0 && rhjVar.u()) {
            rhjVar.l1(false);
            jrhVar.doLoadMore(frhVar, v3i.f(new Pair("searchType", "preload")));
        }
    }

    /* renamed from: H */
    public void b(jrh jrhVar, frh frhVar, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1457222", new Object[]{this, jrhVar, frhVar, new Boolean(z), map});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        if (frhVar != null) {
            rhj rhjVar = (rhj) frhVar;
            if (!z) {
                rhjVar.u1(null);
            }
            if (rhjVar.Z0() != null) {
                if (rhjVar.e1()) {
                    rhjVar.z1(false);
                }
                rhj Z0 = rhjVar.Z0();
                ckf.d(Z0);
                Z0.w1(false);
            }
        }
    }

    public final void J(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c5f96f", new Object[]{this, jrhVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        MetaChildPageWidget F2 = u().w().F2(jrhVar.getIndex());
        if (F2 != null) {
            F2.f3(true);
        }
    }

    /* renamed from: N */
    public boolean p(jrh jrhVar, frh frhVar, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfab792c", new Object[]{this, jrhVar, frhVar, listStyle})).booleanValue();
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "combo");
        ckf.g(listStyle, "newStyle");
        frhVar.N(listStyle);
        MetaChildPageWidget q = u().q(jrhVar);
        if (q != null) {
            q.d3();
        }
        return true;
    }

    /* renamed from: C */
    public acx<jrh> c(int i, TabBean tabBean, jrh jrhVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("42c7a42", new Object[]{this, new Integer(i), tabBean, jrhVar});
        }
        ckf.g(tabBean, "tab");
        ckf.g(jrhVar, "initDataSource");
        bn9 bn9Var = null;
        jrh jrhVar2 = new jrh(false, u().h0(), null);
        jrhVar2.setParams(jrhVar.getParamsSnapShot());
        z(jrhVar2, jrhVar);
        MSearchResult mSearchResult = new MSearchResult(u().h0(), true);
        mSearchResult.setHasSections(true);
        mSearchResult.newSearch = true;
        jrhVar2.setTotalResult(mSearchResult);
        jrhVar2.setLastResult(mSearchResult);
        mSearchResult.setSuccess(true);
        jrhVar2.setUserListStyle(ListStyle.WATERFALL);
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (commonSearchResult != null) {
            bn9Var = commonSearchResult.floatBarBean;
        }
        mSearchResult.floatBarBean = bn9Var;
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (commonSearchResult2 != null) {
            mSearchResult.isAddCartSupported = commonSearchResult2.isAddCartSupported;
            int comboSize = commonSearchResult2.comboSize();
            while (true) {
                if (i2 >= comboSize) {
                    break;
                }
                frh combo = commonSearchResult2.getCombo(i2);
                if (combo != null) {
                    rhj rhjVar = (rhj) combo;
                    if (TextUtils.equals(rhjVar.J0(), tabBean.bizName)) {
                        rhj G0 = rhjVar.G0();
                        mSearchResult.addCombo(G0);
                        mSearchResult.pageInfo = G0.Y0();
                        mSearchResult.setMainInfo(G0.T());
                        this.c.put(i, G0);
                        break;
                    }
                }
                i2++;
            }
        }
        jrhVar2.a1(u());
        tnl<D> v = u().v();
        ckf.e(v, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.PageModel<com.taobao.search.sf.datasource.CommonBaseDatasource>");
        return new b64(v, jrhVar2, u().l0());
    }

    /* renamed from: E */
    public void o(jrh jrhVar, MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463d149b", new Object[]{this, jrhVar, metaChildPageWidget});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(metaChildPageWidget, "childPage");
        rhj rhjVar = this.c.get(jrhVar.getIndex());
        if (rhjVar != null) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
            if (commonSearchResult != null) {
                commonSearchResult.setMainInfo(rhjVar.T());
            }
            rhj Z0 = rhjVar.Z0();
            if (Z0 != null) {
                boolean K0 = Z0.K0();
                if (Z0.K0()) {
                    Z0.I0();
                    MetaChildPageWidget q = u().q(u().r());
                    if (q != null) {
                        q.e3(true);
                        q.q3();
                    }
                }
                if (K0 || (Z0.g1() && Z0.s() != MetaState.UPDATING)) {
                    Z0.w1(false);
                    r(rhjVar, jrhVar);
                }
            }
        }
    }

    /* renamed from: F */
    public void k(jrh jrhVar, frh frhVar, boolean z, boolean z2, osi<frh> osiVar) {
        acx acxVar;
        a aVar;
        MetaChildPageWidget F2;
        bn9 bn9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62df980e", new Object[]{this, jrhVar, frhVar, new Boolean(z), new Boolean(z2), osiVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(osiVar, "config");
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getLastSearchResult();
        rhj rhjVar = null;
        if (!(commonSearchResult == null || (bn9Var = commonSearchResult.floatBarBean) == null)) {
            bn9Var.b = null;
        }
        if (z2 && (F2 = u().w().F2(jrhVar.getIndex())) != null) {
            F2.f3(false);
        }
        rhj rhjVar2 = frhVar instanceof rhj ? (rhj) frhVar : null;
        if (rhjVar2 != null) {
            if (!z) {
                rhjVar2.l1(true);
                rhjVar2.w1(true);
            }
            if (jrhVar.isInitDataSource() && !z) {
                MSController u = u();
                RESULT totalSearchResult = jrhVar.getTotalSearchResult();
                ckf.d(totalSearchResult);
                MetaChildPageWidget p = u.p(t((CommonSearchResult) totalSearchResult, rhjVar2));
                if (p != null && (acxVar = (acx) p.getModel()) != null && (aVar = (a) acxVar.e()) != null) {
                    MetaResult metaResult = (MetaResult) aVar.getTotalSearchResult();
                    asi combo = metaResult != null ? metaResult.getCombo(0) : null;
                    if (combo instanceof rhj) {
                        rhjVar = (rhj) combo;
                    }
                    if (rhjVar != null && rhjVar.e1()) {
                        r(rhjVar, (jrh) aVar);
                    }
                }
            }
        }
    }

    public final int t(CommonSearchResult commonSearchResult, rhj rhjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef72b83", new Object[]{this, commonSearchResult, rhjVar})).intValue();
        }
        ckf.g(commonSearchResult, "result");
        ckf.g(rhjVar, "combo");
        if (commonSearchResult.getTabs() != null) {
            List<TabBean> tabs = commonSearchResult.getTabs();
            ckf.d(tabs);
            if (tabs.size() != 1) {
                List<TabBean> tabs2 = commonSearchResult.getTabs();
                ckf.d(tabs2);
                int size = tabs2.size();
                for (int i = 0; i < size; i++) {
                    List<TabBean> tabs3 = commonSearchResult.getTabs();
                    ckf.d(tabs3);
                    if (TextUtils.equals(tabs3.get(i).bizName, rhjVar.J0())) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
