package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626501);
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{obj, str});
        }
        if (!(obj == null || str == null)) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                try {
                    return ((JSONArray) obj).get(Integer.parseInt(str));
                } catch (Exception unused) {
                    return null;
                }
            } else if (obj instanceof String) {
                try {
                    try {
                        return JSON.parseObject((String) obj).get(str);
                    } catch (Throwable unused2) {
                        return JSON.parseArray((String) obj).get(Integer.parseInt(str));
                    }
                } catch (Exception unused3) {
                }
            }
        }
        return null;
    }

    public static Object b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("30ea134", new Object[]{jSONObject, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
            Object obj = jSONObject;
            while (stringTokenizer.hasMoreTokens()) {
                obj = a(obj, stringTokenizer.nextToken());
            }
            return obj;
        } catch (Throwable th) {
            wdm.h("JsonPathUtils.parseDataExpression.error.", th);
            return null;
        }
    }

    public static JSONObject c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e82652fc", new Object[]{jSONObject, str});
        }
        Object b = b(jSONObject, str);
        if (b instanceof JSONObject) {
            return (JSONObject) b;
        }
        return null;
    }

    public static String d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6cf442e", new Object[]{jSONObject, str});
        }
        Object b = b(jSONObject, str);
        if (b != null) {
            return String.valueOf(b);
        }
        return "";
    }
}
