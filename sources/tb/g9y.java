package tb;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class g9y {
    public static Object a(JSONArray jSONArray, int i) {
        if (jSONArray != null && i < jSONArray.length() && i >= 0) {
            try {
                return jSONArray.get(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String b(JSONObject jSONObject, String str) {
        if (d(jSONObject, str)) {
            try {
                return jSONObject.getString(str);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append(g9y.class.toString());
                sb.append(" get ");
                sb.append(str);
                sb.append(" failed!!");
            }
        }
        return "";
    }

    public static JSONArray c(JSONObject jSONObject, String str) {
        if (d(jSONObject, str)) {
            try {
                return jSONObject.getJSONArray(str);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append(g9y.class.toString());
                sb.append(" get ");
                sb.append(str);
                sb.append(" failed!!");
            }
        }
        return null;
    }

    public static boolean d(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return false;
        }
        return true;
    }
}
