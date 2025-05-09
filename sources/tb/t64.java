package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.datasource.CommonSearchResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t64 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final t64 INSTANCE = new t64();

    static {
        t2o.a(815793407);
    }

    public void a(MSearchResult mSearchResult, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4587269f", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        mSearchResult.pageData = jSONObject.getJSONObject("pageData");
        JSONObject d = h19.d(jSONObject, "iconStyle");
        if (d != null) {
            mSearchResult.domIcons = q1p.f(d);
        } else if (mSearchResult.getMainInfo() != null) {
            mSearchResult.domIcons = q1p.e(mSearchResult.getMainInfo().pageName);
        }
        String a2 = q1p.a(q1p.PAGE_NAME_NX);
        if (a2 == null) {
            a2 = "";
        }
        mSearchResult.nxRawIcon = a2;
        JSONObject d2 = h19.d(jSONObject, "negFeedbackActions");
        if (d2 != null) {
            mSearchResult.negFeedbackActions = d2;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("noResultMod");
        if (jSONObject3 != null) {
            l4k l4kVar = new l4k();
            l4kVar.f23107a = jSONObject3.getString("firstTitle");
            l4kVar.b = jSONObject3.getString("secondTitle");
            l4kVar.c = jSONObject3.getString("imageUrl");
            l4kVar.d = jSONObject3.getBooleanValue("showRetry");
            mSearchResult.noResultMod = l4kVar;
        }
        if (mSearchResult.isNew() && (jSONObject2 = jSONObject.getJSONObject("tabAtmosphere")) != null) {
            mSearchResult.tabPromotionBean = hrs.a(jSONObject2);
        }
    }

    public void b(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fac29b8", new Object[]{this, commonSearchResult, jSONObject});
            return;
        }
        commonSearchResult.pageData = jSONObject.getJSONObject("pageData");
        JSONObject d = h19.d(jSONObject, "iconStyle");
        if (d != null) {
            commonSearchResult.domIcons = q1p.f(d);
        } else if (commonSearchResult.getMainInfo() != null) {
            commonSearchResult.domIcons = q1p.e(commonSearchResult.getMainInfo().pageName);
            b4p.a("CommonResultPreParser", "parseDomBeans: " + commonSearchResult.domIcons);
        }
        String a2 = q1p.a(q1p.PAGE_NAME_NX);
        if (a2 == null) {
            a2 = "";
        }
        commonSearchResult.nxRawIcon = a2;
        JSONObject d2 = h19.d(jSONObject, "negFeedbackActions");
        if (d2 != null) {
            commonSearchResult.negFeedbackActions = d2;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("noResultMod");
        if (jSONObject3 != null) {
            l4k l4kVar = new l4k();
            l4kVar.f23107a = jSONObject3.getString("firstTitle");
            l4kVar.b = jSONObject3.getString("secondTitle");
            l4kVar.c = jSONObject3.getString("imageUrl");
            l4kVar.d = jSONObject3.getBooleanValue("showRetry");
            commonSearchResult.noResultMod = l4kVar;
        }
        if (commonSearchResult.isNew() && (jSONObject2 = jSONObject.getJSONObject("tabAtmosphere")) != null) {
            commonSearchResult.tabPromotionBean = hrs.a(jSONObject2);
        }
    }
}
