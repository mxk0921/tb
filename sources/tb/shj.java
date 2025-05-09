package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.taobao.R;
import java.util.Collection;
import java.util.Map;
import tb.r5j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class shj implements utc<frh, MSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792902);
        t2o.a(993001494);
    }

    private final void B(MSearchResult mSearchResult, JSONObject jSONObject, yko ykoVar) {
        BaseTypedBean d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d03a1b8", new Object[]{this, mSearchResult, jSONObject, ykoVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sceneHeader");
        if (jSONObject2 != null && (d = ykoVar.n().d(jSONObject2, mSearchResult, mSearchResult.pageInfo)) != null) {
            mSearchResult.addHeader(new isi("sceneHeader", d, ""));
        }
    }

    private final void C(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c167ca0e", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        ResultMainInfoBean resultMainInfoBean = new ResultMainInfoBean();
        ResultMainInfoBean.parseBaseInfo(resultMainInfoBean, jSONObject);
        mSearchResult.setMainInfo(resultMainInfoBean);
    }

    private final void E(rhj rhjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae05f90", new Object[]{this, rhjVar, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                ckf.f(entry, "next(...)");
                Map.Entry<String, Object> entry2 = entry;
                String key = entry2.getKey();
                Object value = entry2.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    rhjVar.o0().put(key, value.toString());
                }
            }
        }
    }

    private final void F(BaseCellBean baseCellBean, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8108c740", new Object[]{this, baseCellBean, str, obj});
        } else if (baseCellBean instanceof MuiseCellBean) {
            Map<String, Object> map = ((MuiseCellBean) baseCellBean).mExtraObj;
            ckf.f(map, "mExtraObj");
            map.put(str, obj);
        } else if (baseCellBean instanceof WeexCellBean) {
            Map<String, Object> map2 = ((WeexCellBean) baseCellBean).mExtraObj;
            ckf.f(map2, "mExtraObj");
            map2.put(str, obj);
        }
    }

    private final void G(JSONObject jSONObject, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781290d7", new Object[]{this, jSONObject, str, obj});
            return;
        }
        Object obj2 = jSONObject.get(str);
        if (obj2 != null) {
            obj = obj2;
        }
        jSONObject.put((JSONObject) str, (String) obj);
    }

    private final void d(rhj rhjVar, JSONObject jSONObject, BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd577dee", new Object[]{this, rhjVar, jSONObject, baseCellBean});
            return;
        }
        if (jSONObject.getBooleanValue("isFilterBar")) {
            rhjVar.N0().add(baseCellBean);
        } else {
            rhjVar.P0().add(baseCellBean);
        }
        baseCellBean.comboType = "header";
    }

    private final JSONObject n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eaa8597c", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "sticky", "false");
        jSONObject2.put((JSONObject) "backgroundColor", why.DEFAULT_MASK_BACKGROUND_COLOR);
        jSONObject.put((JSONObject) "xsearchSection", "true");
        jSONObject.put((JSONObject) "xsearchSectionStyle", (String) jSONObject2);
        return jSONObject2;
    }

    private final void p(ResultMainInfoBean resultMainInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2afe8a6f", new Object[]{this, resultMainInfoBean});
            return;
        }
        resultMainInfoBean.page = hfn.c(1, resultMainInfoBean.page);
        resultMainInfoBean.pageSize = hfn.c(10, resultMainInfoBean.pageSize);
    }

    private final boolean q(Collection<?> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b35377f", new Object[]{this, collection})).booleanValue();
        }
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    private final void r(rhj rhjVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d3b075", new Object[]{this, rhjVar, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("mtopApi")) == null) {
            JSONObject jSONObject3 = new JSONObject();
            rhjVar.E(new r5j.a(f1p.WSEARCH_TPP_API_NAME_VALUE, "1.0", "wsearch"));
            jSONObject3.put((JSONObject) "appId", r4p.VALUE_TPP_NEW_SEARCH_APP_ID);
            rhjVar.F(jSONObject3);
        } else {
            rhjVar.E(new r5j.a(jSONObject2.getString("api"), jSONObject2.getString("v"), "wsearch"));
            rhjVar.F(jSONObject2.getJSONObject("params"));
        }
    }

    private final void s(rhj rhjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec29bbf", new Object[]{this, rhjVar, jSONObject});
            return;
        }
        Float f = jSONObject.getFloat("autoPage");
        if (f != null) {
            rhjVar.j1((int) f.floatValue());
        }
    }

    private final void t(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af963138", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        if (mSearchResult.isNew()) {
            A(mSearchResult, jSONObject.getJSONObject("updateParams"), jSONObject.getJSONArray("newSearchHeader"));
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("singleCombo");
        if (jSONObject2 != null) {
            jSONObject2.put((JSONObject) "totalResults", (String) jSONObject.get("totalResults"));
            jSONObject2.put((JSONObject) "totalPage", (String) jSONObject.get("totalPage"));
            if (jSONObject2.get("RN") == null) {
                jSONObject2.put((JSONObject) "RN", (String) jSONObject.get("RN"));
            }
        } else {
            jSONObject2 = jSONObject;
        }
        w(mSearchResult, jSONObject2);
        if (mSearchResult.isNew()) {
            A(mSearchResult, jSONObject.getJSONObject("updateParams"), jSONObject.getJSONArray("newSearchFooter"));
        }
    }

    private final void u(MSearchResult mSearchResult, JSONObject jSONObject, BaseCellBean baseCellBean, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2470a07", new Object[]{this, mSearchResult, jSONObject, baseCellBean, jSONObject2});
        } else if ((baseCellBean instanceof MuiseCellBean) && (jSONObject3 = jSONObject.getJSONObject(r4p.VALUE_MODULE_DYNAMIC_CARD)) != null) {
            jSONObject.remove(r4p.VALUE_MODULE_DYNAMIC_CARD);
            DynamicCardBean dynamicCardBean = new DynamicCardBean();
            F(baseCellBean, "dynamicCardBean", jSONObject3);
            dynamicCardBean.mOriginData = jSONObject3;
            BaseCellBean b = mSearchResult.c().b().b(jSONObject3, mSearchResult, jSONObject2);
            dynamicCardBean.mDynamicCellBean = b;
            if (b != null) {
                str = b.type;
            } else {
                str = null;
            }
            mSearchResult.addUsedTemplate(str);
            F(baseCellBean, "dynamicCardBean", dynamicCardBean);
        }
    }

    private final void y(MSearchResult mSearchResult, JSONArray jSONArray, rhj rhjVar, JSONObject jSONObject) {
        int i;
        int i2;
        BaseCellBean b;
        JSONArray jSONArray2 = jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db738d99", new Object[]{this, mSearchResult, jSONArray2, rhjVar, jSONObject});
        } else if (q(jSONArray2)) {
            rhjVar.J(Boolean.TRUE);
        } else {
            JSONArray jSONArray3 = jSONObject.getJSONArray("itemIds");
            if (jSONArray3 != null && !jSONArray3.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                int size = jSONArray3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb.append(jSONArray3.getString(i3));
                    sb.append(",");
                }
                if (sb.length() > 0) {
                    rhjVar.q1(sb.substring(0, sb.length() - 1));
                }
                rhjVar.p1(jSONArray3.size());
            }
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            JSONObject jSONObject2 = jSONObject.getJSONObject("negFeedbackActions");
            ckf.d(jSONArray);
            int size2 = jSONArray.size();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < size2) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i4);
                if (!(jSONObject3 == null || (b = mSearchResult.c().b().b(jSONObject3, mSearchResult, rhjVar.Y0())) == null)) {
                    F(b, "iconStyle", rhjVar.R0());
                    if (jSONObject3.getBooleanValue("isFilterBar")) {
                        rhjVar.N0().add(b);
                        b.comboType = "header";
                    } else {
                        rhjVar.V0().add(b);
                        F(b, "negFeedbackActions", jSONObject2);
                        b.comboType = "item";
                        u(mSearchResult, jSONObject3, b, rhjVar.Y0());
                        if (TextUtils.equals(jSONObject3.getString(q0j.BIZ_CONTEXT_KEY_CARD_TYPE), "item")) {
                            String string = jSONObject3.getString("item_id");
                            if (jSONObject3.getBooleanValue(mh1.PRD_IS_P4P)) {
                                i2 = 1;
                                i6++;
                                sb3.append(string);
                                sb3.append(",");
                            } else {
                                i2 = 1;
                                i5++;
                                sb2.append(string);
                                sb2.append(",");
                            }
                            i4 += i2;
                            jSONArray2 = jSONArray;
                        }
                    }
                }
                i2 = 1;
                i4 += i2;
                jSONArray2 = jSONArray;
            }
            if (TextUtils.isEmpty(rhjVar.T0())) {
                if (i5 > 0) {
                    i = 0;
                    rhjVar.q1(sb2.substring(0, sb2.length() - 1));
                    rhjVar.p1(i5);
                } else {
                    i = 0;
                }
                if (i6 > 0) {
                    rhjVar.s1(sb3.substring(i, sb3.length() - 1));
                    rhjVar.r1(i6);
                }
            }
        }
    }

    private final void z(MSearchResult mSearchResult, JSONObject jSONObject, yko ykoVar) {
        BaseTypedBean d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff99a757", new Object[]{this, mSearchResult, jSONObject, ykoVar});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("listFooter");
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (!(jSONObject2 == null || (d = ykoVar.n().d(jSONObject2, mSearchResult, mSearchResult.pageInfo)) == null)) {
                    mSearchResult.addFooter(d);
                }
            }
        }
    }

    private final void D(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f321c42", new Object[]{this, mSearchResult, jSONObject});
        } else if (q(jSONObject.getJSONArray("tabs"))) {
            TabBean tabBean = new TabBean();
            tabBean.isSelected = true;
            tabBean.param = "ns_all";
            tabBean.showText = Localization.q(R.string.app_all);
            mSearchResult.setTabs(xz3.e(tabBean));
        } else {
            mSearchResult.setTabs(TabBean.parseBean(jSONObject));
        }
    }

    private final void v(MSearchResult mSearchResult, JSONArray jSONArray, rhj rhjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae75d76", new Object[]{this, mSearchResult, jSONArray, rhjVar});
        } else if (!q(jSONArray)) {
            ckf.d(jSONArray);
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    n(jSONObject).put((JSONObject) "sectionClip", "true");
                    BaseCellBean b = mSearchResult.c().b().b(jSONObject, mSearchResult, rhjVar.Y0());
                    if (b != null) {
                        rhjVar.O0().add(b);
                        b.comboType = "footer";
                    }
                }
            }
        }
    }

    private final void w(MSearchResult mSearchResult, JSONObject jSONObject) {
        BaseCellBean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b22e8", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("listComboHeader");
        JSONArray jSONArray2 = jSONObject.getJSONArray("listComboFooter");
        rhj rhjVar = new rhj();
        rhjVar.k1("all");
        rhjVar.m1(true);
        rhjVar.o1(jSONObject.getJSONObject("iconStyle"));
        ResultMainInfoBean.parseBaseInfo(rhjVar.T(), jSONObject);
        rhjVar.N(rhjVar.T().style);
        p(rhjVar.T());
        rhjVar.J(jSONObject.getBoolean("finished"));
        E(rhjVar, jSONObject.getJSONObject("updateParams"));
        r(rhjVar, null);
        JSONObject jSONObject2 = jSONObject.getJSONObject("comboExtra");
        if (jSONObject2 != null) {
            s(rhjVar, jSONObject2);
            JSONObject jSONObject3 = jSONObject2.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO);
            if (jSONObject3 != null) {
                rhjVar.t1(jSONObject3);
            }
            JSONArray jSONArray3 = jSONObject2.getJSONArray("pageTraceArgs");
            if (jSONArray3 != null) {
                rhjVar.T().pageTraceArgs = ResultMainInfoBean.parseTraceArgs(jSONArray3);
            }
            String string = jSONObject2.getString("pageTraceName");
            if (string != null) {
                rhjVar.T().pageTraceName = string;
            }
        }
        x(mSearchResult, jSONArray, rhjVar);
        v(mSearchResult, jSONArray2, rhjVar);
        JSONArray jSONArray4 = jSONObject.getJSONArray(HorizontalXslComponent.ATTR_ITEMS_ARRAY);
        if (jSONArray4 == null) {
            jSONArray4 = jSONObject.getJSONArray("shopArray");
        }
        y(mSearchResult, jSONArray4, rhjVar, jSONObject);
        JSONArray jSONArray5 = jSONObject.getJSONArray("listHeader");
        if (!q(jSONArray5)) {
            ckf.d(jSONArray5);
            int size = jSONArray5.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject4 = jSONArray5.getJSONObject(i);
                if (!jSONObject4.getBooleanValue("preNav") && (b = mSearchResult.c().b().b(jSONObject4, mSearchResult, rhjVar.Y0())) != null) {
                    rhjVar.U0().add(b);
                    b.comboFullSpan = true;
                    b.comboType = "header";
                }
            }
        }
        mSearchResult.addCombo(rhjVar);
        rhjVar.F0();
    }

    private final void x(MSearchResult mSearchResult, JSONArray jSONArray, rhj rhjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8f3c4", new Object[]{this, mSearchResult, jSONArray, rhjVar});
        } else if (!q(jSONArray)) {
            ckf.d(jSONArray);
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    n(jSONObject);
                    if (jSONObject.getBooleanValue("isFilterBar")) {
                        Object obj = jSONObject.get("xsearchSectionStyle");
                        ckf.e(obj, "null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        ((JSONObject) obj).put((JSONObject) "sticky", "true");
                    }
                    BaseCellBean b = mSearchResult.c().b().b(jSONObject, mSearchResult, rhjVar.Y0());
                    if (b != null) {
                        d(rhjVar, jSONObject, b);
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public void e(MSearchResult mSearchResult, JSONObject jSONObject, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409d9c6c", new Object[]{this, mSearchResult, jSONObject, ykoVar});
            return;
        }
        ckf.g(mSearchResult, "result");
        ckf.d(jSONObject);
        mSearchResult.newSearch = true;
        irh.d(mSearchResult, jSONObject);
        C(mSearchResult, jSONObject);
        irh.f(mSearchResult, jSONObject);
        t(mSearchResult, jSONObject);
        if (mSearchResult.isNew()) {
            D(mSearchResult, jSONObject);
            irh.e(mSearchResult, jSONObject);
            irh.b(mSearchResult, jSONObject);
            jSONObject.put((JSONObject) slo.KEY_IS_FULL, "false");
            irh.c(mSearchResult, jSONObject, false);
            ckf.d(ykoVar);
            B(mSearchResult, jSONObject, ykoVar);
            z(mSearchResult, jSONObject, ykoVar);
        }
        mSearchResult.getMainInfo().style = ListStyle.WATERFALL;
        mSearchResult.collectCellTemplates();
    }

    private final void A(MSearchResult mSearchResult, JSONObject jSONObject, JSONArray jSONArray) {
        BaseCellBean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b2eaca", new Object[]{this, mSearchResult, jSONObject, jSONArray});
        } else if (!q(jSONArray)) {
            ckf.d(jSONArray);
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    rhj rhjVar = new rhj();
                    E(rhjVar, jSONObject);
                    mSearchResult.addCombo(rhjVar);
                    rhjVar.J(jSONObject2.getBoolean("finished"));
                    s(rhjVar, jSONObject2);
                    r(rhjVar, jSONObject2);
                    G(jSONObject2, HorizontalXslComponent.ATTR_PAGE_INFO, mSearchResult.pageInfo);
                    G(jSONObject2, "pageTraceArgs", mSearchResult.getMainInfo().originalPageTraceArgs);
                    G(jSONObject2, "pageTraceName", mSearchResult.getMainInfo().pageTraceName);
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO);
                    rhjVar.t1(jSONObject3);
                    ResultMainInfoBean.parseBaseInfo(rhjVar.T(), jSONObject2);
                    rhjVar.T().rn = mSearchResult.getMainInfo().rn;
                    p(rhjVar.T());
                    rhjVar.o1(jSONObject2.getJSONObject("iconStyle"));
                    rhjVar.N(rhjVar.T().style);
                    rhjVar.k1(jSONObject2.getString("bizType"));
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("comboHeader");
                    if (jSONArray2 != null) {
                        int size2 = jSONArray2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                            if (jSONObject4 != null) {
                                JSONObject n = n(jSONObject4);
                                if (i2 > 0) {
                                    n.put((JSONObject) "sticky", "true");
                                    n.put((JSONObject) "halfStickyOffset", (String) jSONObject4.get("halfStickyOffset"));
                                }
                                Boolean bool = jSONObject4.getBoolean("visibility");
                                if ((bool == null || bool.booleanValue()) && (b = mSearchResult.c().b().b(jSONObject4, mSearchResult, jSONObject3)) != null) {
                                    d(rhjVar, jSONObject4, b);
                                }
                            }
                        }
                    }
                    v(mSearchResult, jSONObject2.getJSONArray("comboFooter"), rhjVar);
                    y(mSearchResult, jSONObject2.getJSONArray(HorizontalXslComponent.ATTR_ITEMS_ARRAY), rhjVar, jSONObject2);
                    rhjVar.F0();
                }
            }
        }
    }
}
