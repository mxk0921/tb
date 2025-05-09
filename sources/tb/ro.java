package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Map;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ro {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SIMPLIFY_RULES = "simplifyRules";

    static {
        t2o.a(81789206);
    }

    public static Object a(JSONObject jSONObject, Map.Entry<String, Object> entry) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("633f7698", new Object[]{jSONObject, entry});
        }
        Object value = entry.getValue();
        if (!(value instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject3 = (JSONObject) value;
        if (!jSONObject3.getBooleanValue(jwi.MATCH_IGNORE) && (jSONObject2 = jSONObject3.getJSONObject("template")) != null) {
            return zr8.a(jSONObject, JSON.parseObject(jSONObject2.toJSONString()));
        }
        return null;
    }

    public static Object b(String str, String str2, String str3, JSONObject jSONObject, Object obj, Map.Entry<String, Object> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("59649bb3", new Object[]{str, str2, str3, jSONObject, obj, entry});
        }
        if (!"events".equals(entry.getKey())) {
            return obj;
        }
        if (!str.equals(str3)) {
            return obj;
        }
        if (TextUtils.isEmpty(str2)) {
            return obj;
        }
        String[] split = str2.split("\\.");
        if (split != null && split.length >= 1) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events");
            if (jSONObject2 == null) {
                return obj;
            }
            String str4 = split[0];
            Object obj2 = jSONObject2.get(str4);
            if (obj2 == null) {
                return obj;
            }
            if (obj == null) {
                obj = new JSONObject();
            }
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).put(str4, obj2);
            }
        }
        return obj;
    }

    public static JSONObject c(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cd8d4a4d", new Object[]{str, str2, str3, jSONObject, jSONObject2});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return jSONObject2;
            }
            String[] split = str.split("_");
            if (split.length < 1) {
                ck.g().e("cropProtocolOfComponentData#无法找到组件对应的block名称", ck.b.b().l("AURAUtronDataProtocolCropper").g("componentKey", str).a());
                return jSONObject2;
            }
            String str4 = split[0];
            if (TextUtils.isEmpty(str4)) {
                return jSONObject2;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject(str4);
            if (jSONObject3 == null) {
                return jSONObject2;
            }
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                if (jSONObject3.get(key) == null) {
                    jSONObject4.put(key, entry.getValue());
                }
            }
            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                Object a2 = a(jSONObject2, entry2);
                String key2 = entry2.getKey();
                Object b = b(str2, str3, str, jSONObject2, a2, entry2);
                if (b != null) {
                    jSONObject4.put(key2, b);
                }
            }
            return jSONObject4;
        } catch (Exception e) {
            UnifyLog.e("AliUltronDataProtocolCropper#exception", e.getMessage());
            return jSONObject2;
        }
    }
}
