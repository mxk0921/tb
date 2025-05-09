package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539398);
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("152d470d", new Object[]{jSONObject, jSONObject2, str});
        }
        if (jSONObject2 == null) {
            jSONObject3 = null;
        } else {
            jSONObject3 = jSONObject2.getJSONObject(str);
        }
        if (jSONObject3 == null || jSONObject3.isEmpty()) {
            return jSONObject.getJSONObject(str);
        }
        return jSONObject3;
    }

    public static String b(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a57bad2", new Object[]{jSONObject, jSONObject2, str});
        }
        if (jSONObject2 == null) {
            str2 = null;
        } else {
            str2 = jSONObject2.getString(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return jSONObject.getString(str);
    }

    public static Object c(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{obj, str});
        }
        if (obj != null && !TextUtils.isEmpty(str)) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                try {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt < jSONArray.size()) {
                        return jSONArray.get(parseInt);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public static Object d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dc3c19a8", new Object[]{jSONObject, str});
        }
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
        Object obj = jSONObject;
        while (stringTokenizer.hasMoreTokens()) {
            obj = c(obj, stringTokenizer.nextToken());
        }
        return obj;
    }

    public static JSONObject e(String[] strArr, String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("833e5043", new Object[]{strArr, str, jSONObject});
        }
        Object d = d(jSONObject, str);
        if (!(d instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject3 = (JSONObject) d;
        JSONObject jSONObject4 = new JSONObject();
        String str2 = "";
        for (int length = strArr.length - 1; length > 0; length--) {
            Object d2 = d(jSONObject, TextUtils.join(".", Arrays.copyOf(strArr, length)));
            boolean z = d2 instanceof JSONObject;
            if (z) {
                JSONObject jSONObject5 = (JSONObject) d2;
                if (jSONObject5.containsKey("commonArgs") && (jSONObject2 = jSONObject5.getJSONObject("commonArgs")) != null) {
                    jSONObject4.putAll(jSONObject2);
                }
            }
            if (z) {
                JSONObject jSONObject6 = (JSONObject) d2;
                if (jSONObject6.containsKey("realtimeClickParam")) {
                    str2 = jSONObject6.getString("realtimeClickParam");
                }
            }
        }
        JSONObject jSONObject7 = jSONObject3.getJSONObject("args");
        if (jSONObject7 != null) {
            jSONObject4.putAll(jSONObject7);
        }
        jSONObject3.put("args", (Object) jSONObject4);
        jSONObject3.put("realtimeClickParam", (Object) str2);
        return jSONObject3;
    }
}
