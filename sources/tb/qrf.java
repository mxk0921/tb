package tb;

import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qrf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705605);
    }

    public static JSONArray a(JSONObject jSONObject, String... strArr) {
        JSONObject i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("106fc845", new Object[]{jSONObject, strArr});
        }
        if (strArr == null || (i = i(jSONObject, strArr.length - 1, strArr)) == null) {
            return null;
        }
        return i.getJSONArray(strArr[strArr.length - 1]);
    }

    public static boolean b(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd448a57", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        return l3i.a(jSONObject, str, z);
    }

    public static boolean c(boolean z, JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac21bc92", new Object[]{new Boolean(z), jSONObject, strArr})).booleanValue();
        }
        return krq.c(n(String.valueOf(z), jSONObject, strArr), z);
    }

    public static int d(int i, JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc3ef871", new Object[]{new Integer(i), jSONObject, strArr})).intValue();
        }
        return krq.e(n(String.valueOf(i), jSONObject, strArr), i);
    }

    public static int e(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4980b30", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        try {
            return Color.parseColor(jSONObject.getString(str));
        } catch (Throwable unused) {
            return i;
        }
    }

    public static float f(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca3fb3e3", new Object[]{jSONObject, str, new Float(f)})).floatValue();
        }
        return l3i.b(jSONObject, str, f);
    }

    public static int g(int i, JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4dbfae5", new Object[]{new Integer(i), jSONObject, strArr})).intValue();
        }
        return krq.i(n(String.valueOf(i), jSONObject, strArr), i);
    }

    public static int h(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3d6ea3c", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        return l3i.c(jSONObject, str, i);
    }

    public static JSONObject i(JSONObject jSONObject, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c21d0188", new Object[]{jSONObject, new Integer(i), strArr});
        }
        if (strArr == null || i == 0) {
            return jSONObject;
        }
        if (jSONObject == null || strArr.length == 0 || strArr.length < i) {
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            try {
                jSONObject = jSONObject.getJSONObject(strArr[i2]);
                if (jSONObject == null) {
                    return null;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return jSONObject;
    }

    public static long j(long j, JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29e7500e", new Object[]{new Long(j), jSONObject, strArr})).longValue();
        }
        return krq.k(n(String.valueOf(j), jSONObject, strArr), j);
    }

    public static long k(JSONObject jSONObject, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28dcd537", new Object[]{jSONObject, str, new Long(j)})).longValue();
        }
        return l3i.d(jSONObject, str, j);
    }

    public static JSONObject l(JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e0c58b", new Object[]{jSONObject, strArr});
        }
        if (strArr == null) {
            return jSONObject;
        }
        return i(jSONObject, strArr.length, strArr);
    }

    public static String m(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("197ae2aa", new Object[]{jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return str2;
        }
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string)) {
            return str2;
        }
        return string;
    }

    public static String n(String str, JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0367cf9", new Object[]{str, jSONObject, strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return str;
        }
        JSONObject i = i(jSONObject, strArr.length - 1, strArr);
        if (i == null) {
            return str;
        }
        String string = i.getString(strArr[strArr.length - 1]);
        if (string == null) {
            return str;
        }
        return string;
    }

    public static Map<String, String> o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5551f7cc", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!(entry == null || entry.getKey() == null || entry.getValue() == null)) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    public static JSONObject p(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ff4b42c5", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return JSON.parseObject(jSONObject.toString());
    }

    public static JSONObject q(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dff492b5", new Object[]{intent});
        }
        JSONObject jSONObject = new JSONObject();
        if (!(intent == null || intent.getExtras() == null)) {
            for (String str : intent.getExtras().keySet()) {
                jSONObject.put(str, JSON.toJSON(intent.getExtras().get(str)));
            }
        }
        return jSONObject;
    }

    public static JSONObject r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a66c7754", new Object[]{str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
