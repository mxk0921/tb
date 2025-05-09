package com.taobao.android.detail.ttdetail.skeleton.recommend;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import java.util.HashMap;
import java.util.Map;
import tb.jnn;
import tb.pr6;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RecommendDataEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, pr6> f6946a;

    static {
        t2o.a(912262635);
    }

    public RecommendDataEngine(Context context, ze7 ze7Var) {
        HashMap hashMap = new HashMap();
        this.f6946a = hashMap;
        hashMap.put(jnn.PARSER_ID, new jnn(context, ze7Var));
    }

    public Map<String, ComponentViewMeta> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("14ac976d", new Object[]{this, jSONObject});
        }
        HashMap hashMap = null;
        if (jSONObject == null) {
            return null;
        }
        for (String str : jSONObject.keySet()) {
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str, new ComponentViewMeta(jSONObject.getJSONObject(str)));
        }
        return hashMap;
    }

    public <O> O c(String str, JSONObject jSONObject) {
        pr6 pr6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (O) ipChange.ipc$dispatch("320e3aba", new Object[]{this, str, jSONObject});
        }
        if (TextUtils.isEmpty(str) || jSONObject == null || (pr6Var = (pr6) ((HashMap) this.f6946a).get(str)) == null) {
            return null;
        }
        return (O) pr6Var.a(jSONObject);
    }

    public JSONObject a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c6f6f4a0", new Object[]{this, jSONArray});
        }
        JSONObject jSONObject = new JSONObject();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            JSONArray jSONArray2 = jSONObject2.getJSONArray("type");
            if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                int size2 = jSONArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String string = jSONObject2.getString("name");
                    String string2 = jSONObject2.getString("containerType");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        jSONObject.put(jSONArray2.getString(i2), (Object) new JSONObject(string, string2, jSONObject2) { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.RecommendDataEngine.1
                            public final /* synthetic */ JSONObject val$component;
                            public final /* synthetic */ String val$ultronContainerName;
                            public final /* synthetic */ String val$ultronContainerType;

                            {
                                this.val$ultronContainerName = string;
                                this.val$ultronContainerType = string2;
                                this.val$component = jSONObject2;
                                put("name", (Object) string);
                                put("type", (Object) string2);
                                put("version", (Object) jSONObject2.getString("version"));
                                put("url", (Object) jSONObject2.getString("url"));
                            }
                        });
                    }
                }
            }
        }
        return jSONObject;
    }
}
