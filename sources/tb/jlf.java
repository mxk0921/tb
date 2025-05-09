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
import java.util.Arrays;
import java.util.Map;
import tb.r5j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jlf implements utc<frh, MSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792897);
        t2o.a(993001494);
    }

    private void A(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460905de", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("switches");
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            mSearchResult.switches = jSONObject2;
            mSearchResult.similarFold = jSONObject2.getBooleanValue("sameFold");
        }
    }

    private void B(MSearchResult mSearchResult, JSONObject jSONObject, boolean z) {
        BaseTypedBean d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a09eb10", new Object[]{this, mSearchResult, jSONObject, new Boolean(z)});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("tabHeader");
        if (jSONObject2 != null && !jSONObject2.isEmpty() && (d = mSearchResult.c().n().d(jSONObject2, mSearchResult, mSearchResult.pageInfo)) != null) {
            if (z) {
                mSearchResult.addHeader(new isi("sticky", d, ""));
            } else {
                mSearchResult.setTabHeader(d);
            }
        }
    }

    private void C(MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("878ee46e", new Object[]{this, mSearchResult});
            return;
        }
        TabBean tabBean = new TabBean();
        tabBean.isSelected = true;
        tabBean.param = "ns_all";
        tabBean.showText = Localization.q(R.string.app_all);
        mSearchResult.setTabs(Arrays.asList(tabBean));
    }

    private void E(MSearchResult mSearchResult, JSONObject jSONObject, frh frhVar) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e081191", new Object[]{this, mSearchResult, jSONObject, frhVar});
        } else if (mSearchResult.isNew() && (d = h19.d(jSONObject, "updateParams")) != null && !d.isEmpty()) {
            for (Map.Entry<String, Object> entry : d.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                    mSearchResult.updateParams.put(entry.getKey(), entry.getValue().toString());
                    frhVar.o0().put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
    }

    private void F(BaseCellBean baseCellBean, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8108c740", new Object[]{this, baseCellBean, str, obj});
        } else if (baseCellBean instanceof MuiseCellBean) {
            ((MuiseCellBean) baseCellBean).mExtraObj.put(str, obj);
        } else if (baseCellBean instanceof WeexCellBean) {
            ((WeexCellBean) baseCellBean).mExtraObj.put(str, obj);
        }
    }

    private void d(rhj rhjVar, JSONObject jSONObject, BaseCellBean baseCellBean) {
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

    private JSONObject n(JSONObject jSONObject, MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8a615c12", new Object[]{this, jSONObject, mSearchResult});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("sticky", (Object) "false");
        jSONObject2.put("backgroundColor", (Object) why.DEFAULT_MASK_BACKGROUND_COLOR);
        jSONObject2.put("xsearchSection", (Object) "true");
        if (mSearchResult.similarFold) {
            jSONObject2.put("forceShowClipOverlay", (Object) "true");
        }
        jSONObject.put("xsearchSectionStyle", (Object) jSONObject2);
        jSONObject.put("xsearchSection", "true");
        return jSONObject2;
    }

    private void p(ResultMainInfoBean resultMainInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2afe8a6f", new Object[]{this, resultMainInfoBean});
            return;
        }
        resultMainInfoBean.page = Math.max(1, resultMainInfoBean.page);
        resultMainInfoBean.pageSize = Math.max(resultMainInfoBean.pageSize, 1);
    }

    private void q(rhj rhjVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d3b075", new Object[]{this, rhjVar, jSONObject});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("mtopApi");
        if (jSONObject3 != null) {
            str2 = jSONObject3.getString("api");
            str = jSONObject3.getString("v");
            jSONObject2 = jSONObject3.getJSONObject("params");
        } else {
            str2 = null;
            jSONObject2 = null;
            str = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = f1p.WSEARCH_TPP_API_NAME_VALUE;
        }
        if (TextUtils.isEmpty(str)) {
            str = "1.0";
        }
        rhjVar.E(new r5j.a(str2, str, "wsearch"));
        rhjVar.F(jSONObject2);
    }

    private void r(rhj rhjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec29bbf", new Object[]{this, rhjVar, jSONObject});
        } else {
            rhjVar.j1((int) jSONObject.getFloatValue("autoPage"));
        }
    }

    private void v(MSearchResult mSearchResult, JSONObject jSONObject, BaseCellBean baseCellBean, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2470a07", new Object[]{this, mSearchResult, jSONObject, baseCellBean, jSONObject2});
        } else if ((baseCellBean instanceof MuiseCellBean) && (jSONObject3 = jSONObject.getJSONObject(r4p.VALUE_MODULE_DYNAMIC_CARD)) != null) {
            jSONObject.remove(r4p.VALUE_MODULE_DYNAMIC_CARD);
            DynamicCardBean dynamicCardBean = new DynamicCardBean();
            dynamicCardBean.mOriginData = jSONObject3;
            BaseCellBean b = mSearchResult.c().b().b(jSONObject3, mSearchResult, jSONObject2);
            dynamicCardBean.mDynamicCellBean = b;
            if (b != null) {
                mSearchResult.addUsedTemplate(b.type);
            }
            F(baseCellBean, "dynamicCardBean", dynamicCardBean);
        }
    }

    private void w(MSearchResult mSearchResult, JSONObject jSONObject, yko ykoVar) {
        JSONObject jSONObject2;
        BaseTypedBean d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bda182", new Object[]{this, mSearchResult, jSONObject, ykoVar});
            return;
        }
        Object obj = jSONObject.get("halfStickyHeader");
        if (obj instanceof JSONObject) {
            jSONObject2 = (JSONObject) obj;
        } else {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.size() > 0) {
                    jSONObject2 = jSONArray.getJSONObject(0);
                }
            }
            jSONObject2 = null;
        }
        if (jSONObject2 != null && (d = ykoVar.n().d(jSONObject2, mSearchResult, mSearchResult.pageInfo)) != null) {
            mSearchResult.addHeader(new isi(ytc.TYPE_HALF_STICKY, d, ""));
        }
    }

    private int x(rhj rhjVar, JSONObject jSONObject, MSearchResult mSearchResult) {
        int i;
        JSONArray jSONArray;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aac42523", new Object[]{this, rhjVar, jSONObject, mSearchResult})).intValue();
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(HorizontalXslComponent.ATTR_ITEMS_ARRAY);
        JSONArray jSONArray3 = jSONObject.getJSONArray("itemIds");
        if (jSONArray3 != null && jSONArray3.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < jSONArray3.size(); i3++) {
                String string = jSONArray3.getString(i3);
                if (!TextUtils.isEmpty(string)) {
                    sb.append(string);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                rhjVar.q1(sb.substring(0, sb.length() - 1));
                rhjVar.p1(jSONArray3.size());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        JSONObject jSONObject2 = jSONObject.getJSONObject("negFeedbackActions");
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < jSONArray2.size()) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(i4);
            if (jSONObject3 == null || jSONObject3.isEmpty()) {
                jSONArray = jSONArray2;
            } else {
                BaseCellBean b = mSearchResult.c().b().b(jSONObject3, mSearchResult, rhjVar.Y0());
                if (b == null) {
                    jSONArray = jSONArray2;
                } else {
                    i6++;
                    jSONArray = jSONArray2;
                    F(b, "iconStyle", rhjVar.R0());
                    if (jSONObject3.getBooleanValue("isFilterBar")) {
                        rhjVar.N0().add(b);
                        b.comboType = "header";
                    } else {
                        rhjVar.V0().add(b);
                        F(b, "negFeedbackActions", jSONObject2);
                        b.comboType = "item";
                        v(mSearchResult, jSONObject3, b, rhjVar.Y0());
                        if (TextUtils.equals(jSONObject3.getString(q0j.BIZ_CONTEXT_KEY_CARD_TYPE), "item")) {
                            String string2 = jSONObject3.getString("item_id");
                            if (jSONObject3.getBooleanValue(mh1.PRD_IS_P4P)) {
                                i2 = 1;
                                i7++;
                                sb3.append(string2);
                                sb3.append(",");
                            } else {
                                i2 = 1;
                                i5++;
                                sb2.append(string2);
                                sb2.append(",");
                            }
                        }
                    }
                }
                i2 = 1;
            }
            i4 += i2;
            jSONArray2 = jSONArray;
        }
        if (!TextUtils.isEmpty(rhjVar.T0())) {
            return i6;
        }
        if (i5 > 0) {
            i = 0;
            rhjVar.q1(sb2.substring(0, sb2.length() - i2));
            rhjVar.p1(i5);
        } else {
            i = 0;
        }
        if (i7 > 0) {
            rhjVar.s1(sb3.substring(i, sb3.length() - i2));
            rhjVar.r1(i7);
        }
        return i6;
    }

    private void z(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c167ca0e", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        ResultMainInfoBean resultMainInfoBean = new ResultMainInfoBean();
        ResultMainInfoBean.parseBaseInfo(resultMainInfoBean, jSONObject);
        mSearchResult.setMainInfo(resultMainInfoBean);
    }

    /* renamed from: o */
    public void e(MSearchResult mSearchResult, JSONObject jSONObject, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409d9c6c", new Object[]{this, mSearchResult, jSONObject, ykoVar});
            return;
        }
        mSearchResult.newSearch = true;
        mSearchResult.guideSearch = true;
        irh.d(mSearchResult, jSONObject);
        z(mSearchResult, jSONObject);
        irh.f(mSearchResult, jSONObject);
        boolean D = D(mSearchResult, jSONObject, ykoVar);
        mSearchResult.hasGuideSearchTopHeader = D;
        if (mSearchResult.isNew()) {
            C(mSearchResult);
            irh.e(mSearchResult, jSONObject);
            B(mSearchResult, jSONObject, D);
        }
        A(mSearchResult, jSONObject);
        s(mSearchResult, jSONObject);
        mSearchResult.getMainInfo().style = ListStyle.WATERFALL;
        if (!D) {
            y(mSearchResult, jSONObject, ykoVar);
            w(mSearchResult, jSONObject, ykoVar);
        }
        mSearchResult.collectCellTemplates();
    }

    private void y(MSearchResult mSearchResult, JSONObject jSONObject, yko ykoVar) {
        JSONObject jSONObject2;
        BaseTypedBean d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d03a1b8", new Object[]{this, mSearchResult, jSONObject, ykoVar});
            return;
        }
        Object obj = jSONObject.get("sceneHeader");
        if (obj instanceof JSONObject) {
            jSONObject2 = (JSONObject) obj;
        } else {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.size() > 0) {
                    jSONObject2 = jSONArray.getJSONObject(0);
                }
            }
            jSONObject2 = null;
        }
        if (jSONObject2 != null && (d = ykoVar.n().d(jSONObject2, mSearchResult, mSearchResult.pageInfo)) != null) {
            mSearchResult.addHeader(new isi("sceneHeader", d, ""));
        }
    }

    private boolean D(MSearchResult mSearchResult, JSONObject jSONObject, yko ykoVar) {
        JSONObject jSONObject2;
        BaseTypedBean d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a890493", new Object[]{this, mSearchResult, jSONObject, ykoVar})).booleanValue();
        }
        Object obj = jSONObject.get("topHeader");
        if (obj instanceof JSONObject) {
            jSONObject2 = (JSONObject) obj;
        } else {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.size() > 0) {
                    jSONObject2 = jSONArray.getJSONObject(0);
                }
            }
            jSONObject2 = null;
        }
        if (jSONObject2 == null || (d = ykoVar.n().d(jSONObject2, mSearchResult, mSearchResult.pageInfo)) == null) {
            return false;
        }
        mSearchResult.addHeader(new isi("topHeader", d, ""));
        return true;
    }

    private void s(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af963138", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ComboArray");
        JSONObject jSONObject2 = jSONObject.getJSONObject("singleCombo");
        if (jSONArray == null || jSONArray.isEmpty()) {
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                rhj rhjVar = new rhj();
                rhjVar.J(Boolean.TRUE);
                mSearchResult.addCombo(rhjVar);
                return;
            }
            jSONArray = new JSONArray();
            jSONArray.add(jSONObject2);
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            rhj rhjVar2 = new rhj();
            rhjVar2.E1(true);
            E(mSearchResult, jSONObject, rhjVar2);
            Boolean bool = jSONObject3.getBoolean("finished");
            rhjVar2.x1(bool);
            rhjVar2.J(bool);
            r(rhjVar2, jSONObject3);
            q(rhjVar2, jSONObject3);
            rhjVar2.t1(jSONObject3.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO));
            ResultMainInfoBean.parseBaseInfo(rhjVar2.T(), jSONObject3);
            if (jSONObject3.containsKey("n")) {
                rhjVar2.T().pageSize = jSONObject3.getIntValue("n");
            }
            p(rhjVar2.T());
            rhjVar2.o1(jSONObject3.getJSONObject("iconStyle"));
            rhjVar2.N(rhjVar2.T().style);
            rhjVar2.k1(jSONObject3.getString("bizType"));
            u(rhjVar2, jSONObject3, mSearchResult);
            int x = x(rhjVar2, jSONObject3, mSearchResult);
            t(rhjVar2, jSONObject3, mSearchResult);
            rhjVar2.F0();
            if (jSONObject3.getBooleanValue("isAi")) {
                if (x != 0) {
                    rhjVar2.i1(true);
                }
            }
            mSearchResult.addCombo(rhjVar2);
        }
    }

    private void t(rhj rhjVar, JSONObject jSONObject, MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e047443a", new Object[]{this, rhjVar, jSONObject, mSearchResult});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("comboFooter");
        if (!(jSONArray == null || jSONArray.isEmpty())) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    JSONObject n = n(jSONObject2, mSearchResult);
                    if (rhjVar.c1() == null || !rhjVar.c1().booleanValue()) {
                        n.put("sectionClip", "true");
                    }
                    BaseCellBean b = mSearchResult.c().b().b(jSONObject2, mSearchResult, rhjVar.Y0());
                    if (b != null) {
                        rhjVar.O0().add(b);
                        b.comboType = "footer";
                    }
                }
            }
        }
    }

    private void u(rhj rhjVar, JSONObject jSONObject, MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a877ac", new Object[]{this, rhjVar, jSONObject, mSearchResult});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("comboHeader");
        if (!(jSONArray == null || jSONArray.isEmpty())) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    JSONObject n = n(jSONObject2, mSearchResult);
                    if (i > 0) {
                        n.put("sticky", "true");
                        n.put("halfStickyOffset", (Object) jSONObject2.getString("halfStickyOffset"));
                    }
                    BaseCellBean b = mSearchResult.c().b().b(jSONObject2, mSearchResult, rhjVar.Y0());
                    if (b != null) {
                        d(rhjVar, jSONObject2, b);
                    }
                }
            }
        }
    }
}
