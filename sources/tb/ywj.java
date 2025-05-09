package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ywj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321702);
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return (str == null || str.isEmpty()) ? z : "true".equals(str);
    }

    public static double c(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da222914", new Object[]{str, new Double(d)})).doubleValue();
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                return Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                txj.e("NDBaseTypeUtils", "getDouble error. 格式转换出错. doubleStr = ".concat(str));
            } catch (Throwable th) {
                txj.f(txj.TAG_RIGHT_NAV_RECYCLER_LAYER, "getDouble error. 未知异常 .doubleStr = ".concat(str), th);
            }
        }
        return d;
    }

    public static JSONObject d(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ac20f10", new Object[]{jSONArray});
        }
        if (jSONArray == null || jSONArray.isEmpty() || !(jSONArray.get(0) instanceof JSONObject)) {
            return null;
        }
        return jSONArray.getJSONObject(0);
    }

    public static float e(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{str, new Float(f)})).floatValue();
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException unused) {
                txj.e("NDBaseTypeUtils", "getFloat error. 格式转换出错. floatStr = ".concat(str));
            } catch (Throwable th) {
                txj.f(txj.TAG_RIGHT_NAV_RECYCLER_LAYER, "getFloat error. 未知异常 .floatStr = ".concat(str), th);
            }
        }
        return f;
    }

    public static int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c755427d", new Object[]{str})).intValue();
        }
        return g(str, 0);
    }

    public static int g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str != null && !str.isEmpty()) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                txj.e("NDBaseTypeUtils", "getInt error. 格式转换出错. intStr = ".concat(str));
            } catch (Throwable th) {
                txj.f(txj.TAG_RIGHT_NAV_RECYCLER_LAYER, "getInt error. 未知异常 .intStr = ".concat(str), th);
            }
        }
        return i;
    }

    public static JSONArray h(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("8bd16c86", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || str == null || !jSONObject.containsKey(str)) {
            return null;
        }
        return jSONObject.getJSONArray(str);
    }

    public static JSONObject i(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ad2de136", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || str == null || !jSONObject.containsKey(str)) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public static String j(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b40fbc34", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || str == null || !jSONObject.containsKey(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static boolean a(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27f4332e", new Object[]{map, str})).booleanValue();
        }
        if (!(map == null || str == null)) {
            Object obj = map.get(str);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof String) {
                return "true".equalsIgnoreCase((String) obj);
            }
            if (obj instanceof Integer) {
                return 1 == ((Integer) obj).intValue();
            }
        }
        txj.e("NDBaseTypeUtils", "getBoolean error. return false. key = " + str);
        return false;
    }
}
