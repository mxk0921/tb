package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.security.realidentity.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class hxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713753);
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d48b553", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject2 == null) {
            ir9.b(b.f2661a, "按照某些特定字段复制JSON对象，target或source为空");
        } else {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object obj = jSONObject2.get(entry.getKey());
                if (!(entry.getValue() instanceof JSONObject) || !(obj instanceof JSONObject)) {
                    entry.setValue(obj);
                } else {
                    a((JSONObject) entry.getValue(), (JSONObject) obj);
                }
            }
        }
    }

    public static JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8405fbe3", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable th) {
            ir9.c(b.f2661a, "fromJson error", th);
            return null;
        }
    }

    public static String d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d0dc6fa", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        return JSON.toJSONString(obj);
    }

    public static <T> T c(String str, TypeReference<T> typeReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("63a63d67", new Object[]{str, typeReference});
        }
        if (str == null) {
            return null;
        }
        try {
            return (T) JSON.parseObject(str, typeReference, new Feature[0]);
        } catch (Throwable th) {
            ir9.c(b.f2661a, "romJson error", th);
            return null;
        }
    }
}
