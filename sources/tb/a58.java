package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a58 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499262);
    }

    public static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("106a3be9", new Object[]{jSONObject});
        }
        JSONObject a2 = a(jSONObject);
        if (a2 == null || a2.isEmpty()) {
            return c(jSONObject);
        }
        return a2;
    }

    public static JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9a72cb94", new Object[]{jSONObject});
        }
        try {
            return JSON.parseObject(jSONObject.getString("mockData"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject d(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4ea2ae1f", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(key);
                    if (jSONObject3 != null) {
                        jSONObject.put(key, (Object) d(jSONObject3, (JSONObject) value));
                    } else {
                        jSONObject.put(key, value);
                    }
                } else {
                    jSONObject.put(key, value);
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("54ad73ed", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || jSONObject2.isEmpty()) {
            return null;
        }
        return g(d(jSONObject2, b(jSONObject2)));
    }

    public static JSONObject f(String str) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("741d80ad", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null && (jSONObject = parseObject.getJSONObject("data")) != null && !jSONObject.isEmpty()) {
            return g(d(jSONObject, b(jSONObject)));
        }
        return null;
    }

    public static JSONObject g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("35ed3339", new Object[]{jSONObject});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            try {
                jSONObject.remove("apiStack");
            } catch (Throwable unused) {
            }
            try {
                jSONObject.remove("mockData");
            } catch (Throwable unused2) {
            }
        }
        return jSONObject;
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e8fe20e5", new Object[]{jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
        if (jSONArray != null) {
            try {
                if (!jSONArray.isEmpty()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("value");
                    String string = jSONObject2.getString("version");
                    if (!"v7-".equals(string)) {
                        if ("v7".equals(string)) {
                        }
                    }
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("bizData");
                    jSONObject2.remove("bizData");
                    return jSONObject3;
                }
            } catch (Throwable th) {
                SkuLogUtils.i("v7-|v7协议数据解析异常： " + th.toString());
            }
        }
        if (jSONArray != null) {
            try {
                if (!jSONArray.isEmpty()) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(0).getJSONObject("value");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("global").getJSONObject("data");
                    jSONObject4.getJSONObject("global").remove("data");
                    return jSONObject5;
                }
            } catch (Throwable th2) {
                SkuLogUtils.i("新奥创动态数据解析异常： " + th2.toString());
            }
        }
        if (jSONArray != null) {
            try {
                if (!jSONArray.isEmpty()) {
                    JSONObject jSONObject6 = jSONArray.getJSONObject(0).getJSONObject("data");
                    JSONObject jSONObject7 = jSONObject6.getJSONObject("global").getJSONObject("data");
                    jSONObject6.getJSONObject("global").remove("data");
                    return jSONObject7;
                }
            } catch (Throwable th3) {
                SkuLogUtils.i("Aura动态数据解析异常： " + th3.toString());
            }
        }
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.isEmpty()) {
                return null;
            }
            JSONObject jSONObject8 = jSONArray.getJSONObject(0).getJSONObject("value");
            jSONArray.getJSONObject(0).remove("value");
            return jSONObject8;
        } catch (Throwable th4) {
            SkuLogUtils.i("tCould动态数据解析异常： " + th4.toString());
            return null;
        }
    }
}
