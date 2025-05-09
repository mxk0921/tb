package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchContext;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import com.taobao.android.searchbaseframe.xsl.refact.XslDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class cox extends z64<XslDataSource, y64, XslSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final dox f = new dox();
    public XslModule g;
    public boolean h;

    static {
        t2o.a(993002079);
    }

    public static /* synthetic */ Object ipc$super(cox coxVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -563373229:
                super.f((a) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 1060958575:
                super.B((a) objArr[0], (MetaChildPageWidget) objArr[1]);
                return null;
            case 1068314382:
                super.k((a) objArr[0], (asi) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), (osi) objArr[4]);
                return null;
            case 1682157574:
                super.i((a) objArr[0], (y64) objArr[1], (y64) objArr[2], (osi) objArr[3]);
                return null;
            case 1957966798:
                super.L((a) objArr[0], (MetaChildPageWidget) objArr[1]);
                return null;
            case 1991606258:
                super.l((a) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 2105919916:
                super.y((a) objArr[0], (asi) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/refact/XslController");
        }
    }

    /* renamed from: P */
    public void e(XslSearchResult xslSearchResult, JSONObject jSONObject, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422509b2", new Object[]{this, xslSearchResult, jSONObject, ykoVar});
            return;
        }
        ckf.g(xslSearchResult, "result");
        this.f.e(xslSearchResult, jSONObject, ykoVar);
    }

    public final XslModule R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslModule) ipChange.ipc$dispatch("e4cc44d4", new Object[]{this});
        }
        XslModule xslModule = this.g;
        if (xslModule != null) {
            return xslModule;
        }
        ckf.y("module");
        throw null;
    }

    public final boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98aef25b", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e506656c", new Object[]{this})).booleanValue();
        }
        return ((acx) w().getModel()).d().i("XslPageConfig_PreventRequest", false);
    }

    /* renamed from: V */
    public void g(XslDataSource xslDataSource, MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785d601b", new Object[]{this, xslDataSource, metaChildPageWidget});
            return;
        }
        ckf.g(xslDataSource, "scopeDataSource");
        ckf.g(metaChildPageWidget, "childPage");
    }

    /* renamed from: W */
    public acx<XslDataSource> c(int i, TabBean tabBean, XslDataSource xslDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("1676a5f4", new Object[]{this, new Integer(i), tabBean, xslDataSource});
        }
        ckf.g(tabBean, "tab");
        ckf.g(xslDataSource, "initDataSource");
        XslDatasource l = R().l(i);
        ckf.e(l, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.refact.XslDataSource");
        XslDataSource xslDataSource2 = (XslDataSource) l;
        xslDataSource2.setMetaMode();
        xslDataSource2.setController(this);
        return new acx<>(v(), xslDataSource2);
    }

    /* renamed from: X */
    public void B(XslDataSource xslDataSource, MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9606a9", new Object[]{this, xslDataSource, metaChildPageWidget});
            return;
        }
        ckf.g(xslDataSource, "scopeDataSource");
        ckf.g(metaChildPageWidget, "childPage");
        super.B(xslDataSource, metaChildPageWidget);
        XslModule.f fVar = R().d;
        if (fVar != null) {
            fVar.onTabChanged(xslDataSource.getIndex());
        }
    }

    /* renamed from: a0 */
    public void l(XslDataSource xslDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccad4b2c", new Object[]{this, xslDataSource, new Boolean(z)});
            return;
        }
        ckf.g(xslDataSource, "initDataSource");
        R().d.onDataLoadedMeta(xslDataSource);
        super.l(xslDataSource, z);
        this.h = true;
        if (z) {
            c0(xslDataSource);
        }
    }

    /* renamed from: b0 */
    public void f(XslDataSource xslDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832a848d", new Object[]{this, xslDataSource, new Boolean(z)});
            return;
        }
        ckf.g(xslDataSource, "scopeDataSource");
        R().d.onDataLoadedMeta(xslDataSource);
        super.f(xslDataSource, z);
    }

    public final void c0(XslDataSource xslDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef43e072", new Object[]{this, xslDataSource});
            return;
        }
        XslSearchResult xslSearchResult = (XslSearchResult) xslDataSource.getTotalSearchResult();
        if (xslSearchResult != null && ckf.b(xslDataSource, r())) {
            R().F0(xslSearchResult);
            ((XslDataSource) r()).setCurrentTabIndex(xslSearchResult.getDefaultTabIndex());
        }
    }

    /* renamed from: d */
    public void m(XslDataSource xslDataSource, y64 y64Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4bb5ce", new Object[]{this, xslDataSource, y64Var, new Integer(i)});
            return;
        }
        ckf.g(xslDataSource, "scopeDataSource");
        ckf.g(y64Var, "combo");
    }

    public final Map<Long, BaseCellBean> f0(y64 y64Var, boolean z, int i, int i2) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c01bee5b", new Object[]{this, y64Var, new Boolean(z), new Integer(i), new Integer(i2)});
        }
        if (z) {
            hashMap = new HashMap();
        } else {
            hashMap = null;
        }
        if (i2 <= i) {
            while (true) {
                if (i < y64Var.t().size()) {
                    BaseCellBean remove = y64Var.t().remove(i);
                    if (z) {
                        long j = remove.id;
                        if (j > 0 && hashMap != null) {
                            BaseCellBean baseCellBean = (BaseCellBean) hashMap.put(Long.valueOf(j), remove);
                        }
                    }
                }
                if (i == i2) {
                    break;
                }
                i--;
            }
        }
        return hashMap;
    }

    public final void g0(XslModule xslModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc97bda6", new Object[]{this, xslModule});
            return;
        }
        ckf.g(xslModule, "<set-?>");
        this.g = xslModule;
    }

    public final void h0(XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db212", new Object[]{this, xslSearchResult, xslSearchResult2});
            return;
        }
        xslSearchResult.setAtmosphereUrl(xslSearchResult2.getAtmosphereUrl());
        xslSearchResult.setAtmosphereType(xslSearchResult2.getAtmosphereType());
        xslSearchResult.setAtmosphereAnim(xslSearchResult2.isAtmosphereAnim());
        xslSearchResult.setAtmosphereListBgColor(xslSearchResult2.getAtmosphereListBgColor());
    }

    public final void j0(y64 y64Var, y64 y64Var2, Map<Long, ? extends BaseCellBean> map, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458156a8", new Object[]{this, y64Var, y64Var2, map, new Integer(i), new Boolean(z)});
        } else if (map == null || map.isEmpty()) {
            try {
                y64Var.b(hfn.f(i, y64Var.t().size()), y64Var2.t());
            } catch (Exception e) {
                c4p.o("XslSearchResult.addNewCells", "from " + i + " size " + y64Var.t().size(), e);
            }
        } else {
            int size = y64Var2.t().size();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                BaseCellBean baseCellBean = y64Var2.t().get(i2);
                if (baseCellBean != null) {
                    BaseCellBean baseCellBean2 = (BaseCellBean) map.get(Long.valueOf(baseCellBean.id));
                    if (baseCellBean2 != null) {
                        baseCellBean2.copyCellData(baseCellBean);
                    }
                    if (!z) {
                        y64Var.a(baseCellBean);
                    } else {
                        arrayList.add(baseCellBean);
                    }
                }
            }
            if (z) {
                y64Var.b(hfn.f(i, y64Var.t().size()), arrayList);
            }
        }
    }

    public final void l0(Set<String> set, String str, String str2, XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599838b4", new Object[]{this, set, str, str2, xslSearchResult, xslSearchResult2});
        } else if (set.contains(str)) {
            xslSearchResult.getHeaders().removeAll(xslSearchResult.getHeadersByType(str2));
            xslSearchResult.addHeaders(xslSearchResult2.getHeadersByType(str2));
            xslSearchResult.setHeaderPartialRefresh(true);
        }
    }

    public final void m0(XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eee70e3", new Object[]{this, xslSearchResult, xslSearchResult2});
            return;
        }
        if (xslSearchResult2.hasBarrier() || xslSearchResult.hasBarrier()) {
            z = true;
        } else {
            z = false;
        }
        xslSearchResult.setHasBarrier(z);
        if (xslSearchResult2.hasSectionClip() || xslSearchResult.hasSectionClip()) {
            z2 = true;
        } else {
            z2 = false;
        }
        xslSearchResult.setHasSectionClip(z2);
        if (!xslSearchResult2.hasSections() && !xslSearchResult.hasSections()) {
            z3 = false;
        }
        xslSearchResult.setHasSections(z3);
    }

    @Override // tb.z64, com.taobao.android.meta.logic.BaseMetaPageController
    public void n(ksi<XslDataSource, y64, ? extends bsi, XslSearchResult> ksiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d84b9d1", new Object[]{this, ksiVar});
            return;
        }
        ckf.g(ksiVar, "widget");
        I(ksiVar);
        ((XslDataSource) r()).setFlow(this);
        M().add(r());
    }

    @Override // com.taobao.android.meta.logic.BaseMetaPageController
    public tnd x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnd) ipChange.ipc$dispatch("1a30297d", new Object[]{this});
        }
        return new XslSearchContext();
    }

    /* renamed from: Q */
    public void L(XslDataSource xslDataSource, MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1052ab08", new Object[]{this, xslDataSource, metaChildPageWidget});
            return;
        }
        ckf.g(xslDataSource, "scopeDataSource");
        ckf.g(metaChildPageWidget, "childPage");
        if (T()) {
            h(xslDataSource);
            ((XslMUSLayout.c) R().c).a(xslDataSource.getCurrentTabIndex(), 1);
        } else if (xslDataSource.isJsParamReady()) {
            super.L(xslDataSource, metaChildPageWidget);
        } else {
            XslModule.h hVar = R().c;
            if (hVar != null) {
                ((XslMUSLayout.c) hVar).b(xslDataSource.getCurrentTabIndex());
            }
        }
    }

    /* renamed from: U */
    public void y(XslDataSource xslDataSource, y64 y64Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abad927f", new Object[]{this, xslDataSource, y64Var});
            return;
        }
        ckf.g(xslDataSource, "scopeDataSource");
        ckf.g(y64Var, "combo");
        b(xslDataSource, y64Var, true, null);
        if (T()) {
            ((XslMUSLayout.c) R().c).a(xslDataSource.getCurrentTabIndex(), y64Var.U());
        } else {
            super.y(xslDataSource, y64Var);
        }
    }

    /* renamed from: Z */
    public void k(XslDataSource xslDataSource, y64 y64Var, boolean z, boolean z2, osi<y64> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0cf6b1b", new Object[]{this, xslDataSource, y64Var, new Boolean(z), new Boolean(z2), osiVar});
            return;
        }
        ckf.g(xslDataSource, "scopeDataSource");
        ckf.g(osiVar, "config");
        R().d.onDataLoadedMeta(xslDataSource);
        super.k(xslDataSource, y64Var, z, z2, osiVar);
        MetaChildPageWidget F2 = w().F2(xslDataSource.getIndex());
        if (F2 != null) {
            F2.f3(false);
            Map<String, String> n = osiVar.n();
            if (TextUtils.equals(n != null ? n.get("searchType") : null, "allSearch")) {
                F2.x();
                c0(xslDataSource);
            }
        }
    }

    /* renamed from: d0 */
    public void i(XslDataSource xslDataSource, y64 y64Var, y64 y64Var2, osi<y64> osiVar) {
        String str;
        XslSearchResult xslSearchResult;
        SearchParamImpl r;
        XslSearchResult xslSearchResult2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde034c0", new Object[]{this, xslDataSource, y64Var, y64Var2, osiVar});
            return;
        }
        ckf.g(xslDataSource, "scopeDataSource");
        ckf.g(y64Var, "src");
        ckf.g(y64Var2, "incoming");
        ckf.g(osiVar, "config");
        Map<String, String> n = osiVar.n();
        if (!(n == null || (str = n.get("searchType")) == null)) {
            int hashCode = str.hashCode();
            if (hashCode != -954593327) {
                if (hashCode != -445821271) {
                    if (hashCode == 1403336329 && str.equals("partialSearch")) {
                        XslSearchResult xslSearchResult3 = (XslSearchResult) xslDataSource.getTotalSearchResult();
                        if (xslSearchResult3 != null && (xslSearchResult2 = (XslSearchResult) xslDataSource.getLastSearchResult()) != null) {
                            h0(xslSearchResult3, xslSearchResult2);
                            xslSearchResult3.setMainInfo(xslSearchResult2.getMainInfo());
                            y64 combo = xslSearchResult3.getCombo(0);
                            if (combo != null) {
                                combo.X(xslSearchResult2.getMainInfo());
                            }
                            Map<String, String> n2 = osiVar.n();
                            if (n2 != null && (str2 = n2.get("updateConfig")) != null) {
                                Object parseObject = JSON.parseObject(str2, Set.class);
                                ckf.e(parseObject, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                                Set<String> set = (Set) parseObject;
                                i0(set, xslSearchResult3, xslSearchResult2);
                                o0(set, xslSearchResult3, xslSearchResult2);
                                n0(set, xslSearchResult3, xslSearchResult2);
                                l0(set, "foldHeader", ytc.TYPE_FOLD, xslSearchResult3, xslSearchResult2);
                                l0(set, "stickyHeader", "sticky", xslSearchResult3, xslSearchResult2);
                                l0(set, "listHeader", "list", xslSearchResult3, xslSearchResult2);
                                k0(set, xslSearchResult3, xslSearchResult2);
                                m0(xslSearchResult3, xslSearchResult2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else if (str.equals("allSearch")) {
                    XslSearchResult xslSearchResult4 = (XslSearchResult) xslDataSource.getTotalSearchResult();
                    if (xslSearchResult4 != null && (xslSearchResult = (XslSearchResult) xslDataSource.getLastSearchResult()) != null) {
                        xslDataSource.setTotalResult(xslSearchResult);
                        y64 combo2 = xslSearchResult.getCombo(0);
                        if (combo2 != null && (r = combo2.r()) != null) {
                            y64 combo3 = xslSearchResult4.getCombo(0);
                            r.copy(combo3 != null ? combo3.r() : null);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (str.equals("updateSearch")) {
                Map<String, String> n3 = osiVar.n();
                ckf.d(n3);
                e0(y64Var, y64Var2, n3);
                return;
            }
        }
        super.i(xslDataSource, y64Var, y64Var2, osiVar);
    }

    public final void i0(Set<String> set, XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        y64 combo;
        y64 combo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d042610", new Object[]{this, set, xslSearchResult, xslSearchResult2});
        } else if (set.contains("listItems") && (combo = xslSearchResult.getCombo(0)) != null && (combo2 = xslSearchResult2.getCombo(0)) != null) {
            combo.f();
            combo.c(combo2.t());
        }
    }

    public final void k0(Set<String> set, XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edae7d6", new Object[]{this, set, xslSearchResult, xslSearchResult2});
        } else if (set.contains("listFooter")) {
            xslSearchResult.getFooters().clear();
            xslSearchResult.getFooters().addAll(xslSearchResult2.getFooters());
            xslSearchResult.setFooterChanged(true);
        }
    }

    public final void n0(Set<String> set, XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a4fa7f", new Object[]{this, set, xslSearchResult, xslSearchResult2});
        } else if (set.contains("tab")) {
            xslSearchResult.tabHeaders.clear();
            xslSearchResult.tabHeaders.addAll(xslSearchResult2.tabHeaders);
            xslSearchResult.setHeaderChange(true);
        }
    }

    public final void o0(Set<String> set, XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cbb00bf", new Object[]{this, set, xslSearchResult, xslSearchResult2});
        } else if (set.contains("topHeader")) {
            xslSearchResult.topHeaders.clear();
            xslSearchResult.topHeaders.addAll(xslSearchResult2.topHeaders);
            xslSearchResult.setHeaderChange(true);
        }
    }

    public final void e0(y64 y64Var, y64 y64Var2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a8232cc", new Object[]{this, y64Var, y64Var2, map});
            return;
        }
        String str = map.get("from");
        if (str != null) {
            int c = hfn.c(0, Integer.parseInt(str));
            if (c < 0) {
                y64Var.R(y64Var2);
                return;
            }
            String str2 = map.get(pg1.ATOM_length);
            if (str2 != null) {
                int parseInt = Integer.parseInt(str2);
                String str3 = map.get("reserveCell");
                if (str3 != null) {
                    boolean parseBoolean = Boolean.parseBoolean(str3);
                    String str4 = map.get("addFromPosition");
                    if (str4 != null) {
                        boolean parseBoolean2 = Boolean.parseBoolean(str4);
                        if (parseInt > 0) {
                            j0(y64Var, y64Var2, f0(y64Var, parseBoolean, hfn.f((parseInt + c) - 1, y64Var.j().size()), c), c, parseBoolean2);
                        } else {
                            j0(y64Var, y64Var2, f0(y64Var, parseBoolean, y64Var.t().size() - 1, c), c, parseBoolean2);
                        }
                    }
                }
            }
        }
    }
}
