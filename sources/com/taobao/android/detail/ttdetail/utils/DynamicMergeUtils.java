package com.taobao.android.detail.ttdetail.utils;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.d1i;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DynamicMergeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262783);
    }

    public static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fe16fdb", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("components");
        JSONObject jSONObject3 = jSONObject.getJSONObject(d1i.KEY_LAYOUT_INFO);
        JSONObject jSONObject4 = jSONObject.getJSONObject("model");
        JSONObject jSONObject5 = jSONObject.getJSONObject("meta");
        if (jSONObject2 == null || jSONObject4 == null) {
            return null;
        }
        return new JSONObject(jSONObject3, jSONObject4, jSONObject5) { // from class: com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils.1
            public final /* synthetic */ JSONObject val$layoutInfo;
            public final /* synthetic */ JSONObject val$meta;
            public final /* synthetic */ JSONObject val$model;

            {
                this.val$layoutInfo = jSONObject3;
                this.val$model = jSONObject4;
                this.val$meta = jSONObject5;
                put("components", (Object) JSONObject.this);
                put(d1i.KEY_LAYOUT_INFO, (Object) jSONObject3);
                put("model", (Object) jSONObject4);
                put("meta", (Object) jSONObject5);
            }
        };
    }

    public static JSONObject c(JSONObject jSONObject) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7aa72151", new Object[]{jSONObject});
        }
        JSONObject f = f(jSONObject);
        if (f == null || (b = b(f)) == null) {
            return null;
        }
        return b;
    }

    public static JSONObject d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4ceb9990", new Object[]{jSONObject});
        }
        return g(f(jSONObject));
    }

    public static JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("44e10a21", new Object[]{jSONObject});
        }
        return d(jSONObject);
    }

    public static JSONObject g(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c5e55806", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            string = jSONObject.getString("version");
        } catch (Throwable th) {
            tgh.a("v7-|v7协议数据解析异常： " + Log.getStackTraceString(th));
        }
        if (!"v7-".equals(string)) {
            if ("v7".equals(string)) {
            }
            try {
                return jSONObject.getJSONObject("global").getJSONObject("data");
            } catch (Throwable th2) {
                tgh.a("新奥创动态数据解析异常： " + Log.getStackTraceString(th2));
                tgh.a("extractApiStackData 命中 tcloud 数据");
                return jSONObject;
            }
        }
        return jSONObject.getJSONObject("bizData");
    }

    public static JSONObject h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dc424e4f", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return c(jSONObject);
    }

    public static JSONObject i(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4ea2ae1f", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(key);
                if (jSONObject3 != null) {
                    jSONObject.put(key, (Object) i(jSONObject3, (JSONObject) value));
                } else {
                    jSONObject.put(key, value);
                }
            } else {
                jSONObject.put(key, value);
            }
        }
        return jSONObject;
    }

    public static JSONObject j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4a651055", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
            return null;
        }
        return k(jSONObject2, e(jSONObject2));
    }

    public static JSONObject k(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("115ab65e", new Object[]{jSONObject, jSONObject2});
        }
        if (!TextUtils.isEmpty(jSONObject.getString("_mergedFlag_"))) {
            return jSONObject;
        }
        jSONObject.put("_mergedFlag_", (Object) Long.valueOf(System.currentTimeMillis()));
        return i(jSONObject, jSONObject2);
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("61a9de70", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("data");
        if (!(jSONObject4 == null || (jSONArray = jSONObject4.getJSONArray("apiStack")) == null || jSONArray.isEmpty() || (jSONObject2 = jSONArray.getJSONObject(0)) == null || (jSONObject3 = jSONObject2.getJSONObject("value")) == null)) {
            jSONObject2.remove("value");
            jSONObject2.put("value", (Object) jSONObject3);
        }
        return jSONObject;
    }

    public static JSONObject f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("93684472", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
        if (jSONArray != null) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("value");
                if (jSONObject3 != null) {
                    jSONObject2.remove("value");
                    jSONObject2.put("value", (Object) jSONObject3);
                    return jSONObject3;
                }
            } catch (Throwable th) {
                tgh.a("新奥创协议esi解析异常： " + Log.getStackTraceString(th));
            }
        }
        if (jSONArray != null) {
            try {
                JSONObject jSONObject4 = jSONArray.getJSONObject(0);
                JSONObject jSONObject5 = jSONObject4.getJSONObject("data");
                if (jSONObject5 != null) {
                    jSONObject4.remove("data");
                    jSONObject4.put("data", (Object) jSONObject5);
                    return jSONObject5;
                }
            } catch (Throwable th2) {
                tgh.a("Aura协议esi解析异常： " + Log.getStackTraceString(th2));
            }
        }
        return null;
    }
}
