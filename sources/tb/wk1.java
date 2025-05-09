package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wk1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(473956378);
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fba5b971", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("trackParam");
        if (jSONObject2 == null || jSONObject2.isEmpty() || jSONObject2.getJSONObject("clickParam") == null || jSONObject2.getJSONObject("clickParam").isEmpty()) {
            return jSONObject.getJSONObject("clickParam");
        }
        return b(jSONObject2.getJSONObject("clickParam"), jSONObject2.getJSONObject("args"));
    }

    public static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba9c6d45", new Object[]{jSONObject, jSONObject2});
        }
        if (!(jSONObject2 == null || jSONObject2.isEmpty() || jSONObject == null)) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("args");
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                    jSONObject.put("args", (Object) jSONObject3);
                }
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    jSONObject3.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                bqa.c("AutoExposureUtils", th, new String[0]);
            }
        }
        return jSONObject;
    }
}
