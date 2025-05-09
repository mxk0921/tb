package com.taobao.mytaobao.ultron.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.q3g;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SecScreenBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String apiName;
    public String apiVersion;
    public HashMap<String, String> data;
    public boolean unitTrade;

    static {
        t2o.a(745538151);
    }

    public static SecScreenBean readGlobalSecScreenBean(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecScreenBean) ipChange.ipc$dispatch("c061d762", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(q3g.b)) == null) {
            return null;
        }
        try {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(q3g.c);
            if (jSONObject3 == null) {
                return null;
            }
            return (SecScreenBean) JSON.toJavaObject(jSONObject3, SecScreenBean.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
