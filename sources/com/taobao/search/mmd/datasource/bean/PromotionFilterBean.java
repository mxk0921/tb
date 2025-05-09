package com.taobao.search.mmd.datasource.bean;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.mf6;
import tb.srl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PromotionFilterBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MULTI = "multi";
    public static final String SINGLE = "single";
    public List<a> buttons = new ArrayList(2);
    public String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11548a = false;
        public String b;
        public String c;
        public b d;
        public b e;
        public String f;

        static {
            t2o.a(815792503);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f11549a;
        public String b;
        public String c = "";
        public int d = 0;
        public int e = 0;
        public int f = 0;
        public int g = 0;
        public int h = 0;
        public int i = 0;
        public int j = 0;
        public int k = 0;

        static {
            t2o.a(815792504);
        }
    }

    static {
        t2o.a(815792502);
    }

    public static PromotionFilterBean parse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PromotionFilterBean) ipChange.ipc$dispatch("d734633e", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return parsePromotionFilter(jSONObject.optJSONObject("newPromotion"));
    }

    private static a parseButton(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("51c54e4b", new Object[]{jSONObject});
        }
        a aVar = new a();
        jSONObject.optString("trace");
        aVar.b = jSONObject.optString("paramKey");
        aVar.c = jSONObject.optString("paramValue");
        aVar.f = jSONObject.optString("actionType");
        aVar.d = parseStyle(jSONObject.optJSONObject("normal"));
        aVar.e = parseStyle(jSONObject.optJSONObject(mf6.TYPE_SELECTED));
        aVar.f11548a = TextUtils.equals(jSONObject.optString("status"), ThemisConfig.SCENE_SELECT);
        return aVar;
    }

    private static b parseStyle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fac15ee3", new Object[]{jSONObject});
        }
        b bVar = new b();
        if (jSONObject == null) {
            return bVar;
        }
        bVar.d = srl.c(jSONObject.optString("backgroundColor"), 0);
        bVar.e = srl.c(jSONObject.optString("borderColor"), 0);
        bVar.f = srl.c(jSONObject.optString("textColor"), 0);
        bVar.g = srl.c(jSONObject.optString("replaceColor"), 0);
        bVar.h = srl.c(jSONObject.optString("startColor"), 0);
        bVar.i = srl.c(jSONObject.optString("endColor"), 0);
        bVar.c = jSONObject.optString("img");
        bVar.j = jSONObject.optInt("imgWidth");
        bVar.k = jSONObject.optInt("imgHeight");
        bVar.f11549a = jSONObject.optString("title");
        bVar.b = jSONObject.optString("replaceText");
        return bVar;
    }

    public static PromotionFilterBean parsePromotionFilter(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PromotionFilterBean) ipChange.ipc$dispatch("986fcd09", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        PromotionFilterBean promotionFilterBean = new PromotionFilterBean();
        promotionFilterBean.type = jSONObject.optString("selectType");
        JSONArray optJSONArray = jSONObject.optJSONArray("filters");
        if (optJSONArray == null) {
            return promotionFilterBean;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                promotionFilterBean.buttons.add(parseButton(optJSONObject));
            }
        }
        return promotionFilterBean;
    }
}
