package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(336593081);
    }

    public static <T> T a(Class<T> cls, JSONObject jSONObject, String str, T t) {
        T t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("624cdbdc", new Object[]{cls, jSONObject, str, t});
        }
        if (jSONObject == null || jSONObject.get(str) == null) {
            return t;
        }
        try {
            if (cls == String.class) {
                t2 = (T) jSONObject.getString(str);
            } else {
                t2 = (T) jSONObject.getObject(str, cls);
            }
        } catch (Exception unused) {
            t2 = null;
        }
        return t2 != null ? t2 : t;
    }

    public static boolean b(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd448a57", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        return ((Boolean) a(Boolean.class, jSONObject, str, Boolean.valueOf(z))).booleanValue();
    }

    public static float c(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca3fb3e3", new Object[]{jSONObject, str, new Float(f)})).floatValue();
        }
        return ((Float) a(Float.class, jSONObject, str, Float.valueOf(f))).floatValue();
    }

    public static int d(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3d6ea3c", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        return ((Integer) a(Integer.class, jSONObject, str, Integer.valueOf(i))).intValue();
    }

    public static JSONArray e(JSONObject jSONObject, String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d3874e5e", new Object[]{jSONObject, str, jSONArray});
        }
        return (JSONArray) a(JSONArray.class, jSONObject, str, jSONArray);
    }

    public static JSONObject f(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e2cf8aba", new Object[]{jSONObject, str, jSONObject2});
        }
        return (JSONObject) a(JSONObject.class, jSONObject, str, jSONObject2);
    }

    public static String g(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("197ae2aa", new Object[]{jSONObject, str, str2});
        }
        return (String) a(String.class, jSONObject, str, str2);
    }
}
