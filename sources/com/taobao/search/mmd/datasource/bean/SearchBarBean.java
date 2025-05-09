package com.taobao.search.mmd.datasource.bean;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import java.io.Serializable;
import tb.qrl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchBarBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_SEARCH = "search";
    public static final String TYPE_TITLE = "title";
    public MuiseBean dynamicBean;
    public String icon;
    public String info;
    public String suffixIcon;
    public float suffixIconRatio;
    public String text;
    public String type;

    static {
        t2o.a(815792511);
    }

    public static SearchBarBean createDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarBean) ipChange.ipc$dispatch("92c373d6", new Object[0]);
        }
        SearchBarBean searchBarBean = new SearchBarBean();
        searchBarBean.type = "search";
        return searchBarBean;
    }

    public static SearchBarBean fromJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarBean) ipChange.ipc$dispatch("60c97781", new Object[]{jSONObject});
        }
        SearchBarBean searchBarBean = new SearchBarBean();
        searchBarBean.type = jSONObject.getString("searchType");
        searchBarBean.text = jSONObject.getString("text");
        searchBarBean.icon = jSONObject.getString("icon");
        searchBarBean.info = jSONObject.getString("info");
        String string = jSONObject.getString("suffixIcon");
        searchBarBean.suffixIcon = string;
        if (!TextUtils.isEmpty(string)) {
            int e = qrl.e(jSONObject.getString("width"), 0);
            int e2 = qrl.e(jSONObject.getString("height"), 0);
            if (!(e == 0 || e2 == 0)) {
                searchBarBean.suffixIconRatio = (e * 1.0f) / e2;
            }
        }
        return searchBarBean;
    }
}
