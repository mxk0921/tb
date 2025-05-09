package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h19 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001964);
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c96ec3f6", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.getInnerMap().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    hashMap.put(key, value);
                }
            }
        }
        return hashMap;
    }

    public static Map<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c6f48", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.getInnerMap().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    hashMap.put(key, value.toString());
                }
            }
        }
        return hashMap;
    }

    public static JSONArray c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d22b0989", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        return null;
    }

    public static JSONObject d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c3944979", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return null;
    }

    public static boolean e(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da87075a", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        if (jSONObject == null) {
            return z;
        }
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        try {
            return jSONObject.getBoolean(str).booleanValue();
        } catch (Exception unused) {
            return z;
        }
    }

    public static float f(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4f395a6", new Object[]{jSONObject, str, new Float(f)})).floatValue();
        }
        if (jSONObject == null) {
            return f;
        }
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        try {
            return jSONObject.getFloatValue(str);
        } catch (Exception unused) {
            return f;
        }
    }

    public static int g(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e8e60bf", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject == null) {
            return i;
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return jSONObject.getIntValue(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static long h(JSONObject jSONObject, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5142f14", new Object[]{jSONObject, str, new Long(j)})).longValue();
        }
        if (jSONObject == null) {
            return j;
        }
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return jSONObject.getLongValue(str);
        } catch (Exception unused) {
            return j;
        }
    }

    public static String i(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("669b5207", new Object[]{jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return str2;
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            String string = jSONObject.getString(str);
            if (TextUtils.isEmpty(string)) {
                return str2;
            }
            return string;
        } catch (Exception unused) {
            return str2;
        }
    }
}
