package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class i9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886329);
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84aaf891", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return JSON.parseObject(jSONObject.toJSONString());
        } catch (Exception e) {
            hav.a("UltronJsonUtil", "deepCloneJSONObject#" + e.getMessage());
            return null;
        }
    }

    public static double b(JSONObject jSONObject, String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a37bab80", new Object[]{jSONObject, str, new Double(d)})).doubleValue();
        }
        if (!jSONObject.containsKey(str)) {
            return d;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof String) {
            try {
                return Double.parseDouble((String) obj);
            } catch (Exception unused) {
            }
        }
        return d;
    }

    public static float c(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca3fb3e3", new Object[]{jSONObject, str, new Float(f)})).floatValue();
        }
        if (!jSONObject.containsKey(str)) {
            return f;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof String) {
            try {
                return Float.parseFloat((String) obj);
            } catch (Exception unused) {
            }
        }
        return f;
    }
}
