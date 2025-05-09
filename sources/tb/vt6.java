package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class vt6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714309);
        DecimalFormat decimalFormat = new DecimalFormat("####.#亿");
        DecimalFormat decimalFormat2 = new DecimalFormat("####.#万");
        DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance();
        instance.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(instance);
        decimalFormat2.setDecimalFormatSymbols(instance);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc737931", new Object[]{new Integer(i)});
        }
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    public static <T> T b(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a02178fe", new Object[]{list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static JSONArray d(JSONObject jSONObject, String... strArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2655724d", new Object[]{jSONObject, strArr});
        }
        if (jSONObject == null || strArr == null || strArr.length == 0) {
            return null;
        }
        JSONArray jSONArray = null;
        while (i < strArr.length) {
            int i2 = i + 1;
            if (i2 == strArr.length) {
                jSONArray = jSONObject.getJSONArray(strArr[i]);
            } else {
                jSONObject = jSONObject.getJSONObject(strArr[i]);
            }
            if (jSONObject == null) {
                return null;
            }
            i = i2;
        }
        return jSONArray;
    }

    public static Object e(JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ff2a4169", new Object[]{jSONObject, strArr});
        }
        if (jSONObject == null || strArr == null || strArr.length == 0) {
            return null;
        }
        Object obj = null;
        for (int i = 0; i < strArr.length; i++) {
            if (i == strArr.length - 1) {
                obj = jSONObject.get(strArr[i]);
            } else {
                jSONObject = jSONObject.getJSONObject(strArr[i]);
            }
            if (jSONObject == null) {
                return null;
            }
        }
        return obj;
    }

    public static String f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19a07c05", new Object[]{new Integer(i)});
        }
        int i2 = i / 1000;
        return a(i2 / 60) + ":" + a(i2 % 60);
    }

    public static boolean g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b55c8b38", new Object[]{str, str2})).booleanValue();
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean h(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66b3c5f1", new Object[]{strArr})).booleanValue();
        }
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    public static int j(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20b562c9", new Object[]{str, new Integer(i)})).intValue();
        }
        if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
            return Integer.valueOf(str).intValue();
        }
        return i;
    }

    public static boolean c(Map<String, Object> map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d462be2", new Object[]{map, str, new Boolean(z)})).booleanValue();
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return "true".equalsIgnoreCase((String) obj);
        }
        return obj instanceof Integer ? ((Integer) obj).intValue() != 0 : obj instanceof Long ? 0 != ((Long) obj).longValue() : z;
    }

    public static boolean i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cb35cd2", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return TextUtils.isEmpty(str) ? z : TextUtils.isDigitsOnly(str) ? Integer.valueOf(str).intValue() != 0 : TextUtils.isEmpty(str) ? z : "true".equalsIgnoreCase(str);
    }
}
