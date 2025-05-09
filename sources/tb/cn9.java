package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.search.mmd.datasource.bean.ReviewBean;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cn9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793586);
    }

    public static bn9 a(JSONObject jSONObject, boolean z, CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bn9) ipChange.ipc$dispatch("a2284756", new Object[]{jSONObject, new Boolean(z), commonSearchResult});
        }
        bn9 bn9Var = new bn9();
        bn9Var.f16490a = e(jSONObject.getJSONObject("newReview"));
        o5n c = c(jSONObject.getJSONObject("pushButton"));
        bn9Var.b = c;
        if (c == null || z) {
            bn9Var.c = d(jSONObject);
        }
        BaseTypedBean b = b(jSONObject.getJSONObject("bottomBar"), commonSearchResult, jSONObject.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO));
        bn9Var.d = b;
        if (b != null) {
            commonSearchResult.addUsedTemplate(b.type);
        }
        return bn9Var;
    }

    public static BaseTypedBean b(JSONObject jSONObject, CommonSearchResult commonSearchResult, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseTypedBean) ipChange.ipc$dispatch("f2617ce0", new Object[]{jSONObject, commonSearchResult, jSONObject2});
        }
        if (jSONObject == null) {
            return null;
        }
        return yak.f31939a.n().d(jSONObject, commonSearchResult, jSONObject2);
    }

    public static ReviewBean e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReviewBean) ipChange.ipc$dispatch("f8eb4bfb", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        ReviewBean reviewBean = new ReviewBean();
        reviewBean.show = jSONObject.getBooleanValue("show");
        int intValue = jSONObject.getIntValue("itemTotalPage");
        reviewBean.totalPage = intValue;
        if (intValue > 2) {
            reviewBean.totalPage = 2;
        }
        reviewBean.h5Url = jSONObject.getString("h5Url");
        reviewBean.iconUrl = jSONObject.getString("iconUrl");
        if (reviewBean.totalPage <= 0 || TextUtils.isEmpty(reviewBean.h5Url)) {
            return null;
        }
        return reviewBean;
    }

    public static o5n c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o5n) ipChange.ipc$dispatch("10b8b7fb", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        o5n o5nVar = new o5n();
        o5nVar.f25151a = jSONObject.getString("text");
        o5nVar.b = jSONObject.getString("normalPic");
        o5nVar.c = jSONObject.getString("highlightPic");
        o5nVar.e = jSONObject.getString("rightPic");
        o5nVar.d = jSONObject.getString("hintText");
        o5nVar.g = jSONObject.getIntValue("hintStayTimeInterval");
        int intValue = jSONObject.getIntValue("hintAppearPage");
        o5nVar.f = intValue;
        if (intValue < 1) {
            o5nVar.f = 1;
        }
        if (o5nVar.g <= 0) {
            o5nVar.g = 3;
        }
        o5nVar.h = srl.c(jSONObject.getString("hintTextColor"), -1);
        o5nVar.i = srl.c(jSONObject.getString("hintStartColor"), -24771);
        o5nVar.j = srl.c(jSONObject.getString("hintEndColor"), -761329);
        o5nVar.k = jSONObject.getString("strategy");
        String string = jSONObject.getString("mode");
        o5nVar.l = string;
        if (TextUtils.isEmpty(string)) {
            o5nVar.l = "normal";
        }
        o5nVar.m = jSONObject.getIntValue("appearPage");
        int intValue2 = jSONObject.getIntValue("disappearPage");
        o5nVar.n = intValue2;
        if (intValue2 < 1) {
            o5nVar.n = Integer.MAX_VALUE;
        }
        o5nVar.o = jSONObject.getString("url");
        o5nVar.p = jSONObject.getString("type");
        o5nVar.q = jSONObject.getString("action");
        long longValue = jSONObject.getLongValue("timeInterval");
        o5nVar.r = longValue;
        if (longValue < 0) {
            o5nVar.r = 86400000L;
        } else {
            o5nVar.r = longValue * 1000;
        }
        return o5nVar;
    }

    public static List<o5n> d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8fa2e69b", new Object[]{jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray c = h19.c(jSONObject, "pushButtonList");
        if (c != null) {
            for (int i = 0; i < c.size(); i++) {
                o5n c2 = c(c.getJSONObject(i));
                if (c2 != null) {
                    arrayList.add(c2);
                }
            }
        }
        return arrayList;
    }
}
