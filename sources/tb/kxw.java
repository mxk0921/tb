package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kxw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CODE = "code";
    public static final String KEY_ERROR = "error";
    public static final String KEY_ERROR_MSG = "msg";
    public static final String KEY_RESULT = "result";

    static {
        t2o.a(404750436);
    }

    public static void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ee7be", new Object[]{jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("result")) != null) {
            jSONObject.put("result", (Object) jSONObject2.getJSONObject("result"));
        }
    }

    public static int b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d456a452", new Object[]{map})).intValue();
        }
        if (map == null || !(map.get("error") instanceof Map)) {
            return -1;
        }
        return new JSONObject((Map) map.get("error")).getIntValue("code");
    }

    public static String c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6d81e91", new Object[]{map});
        }
        if (map == null || !(map.get("error") instanceof Map)) {
            return "";
        }
        return new JSONObject((Map) map.get("error")).getString("msg");
    }

    public static boolean d(Map<String, Object> map) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d944409", new Object[]{map})).booleanValue();
        }
        return map != null && (map.get("success") instanceof Boolean) && (bool = (Boolean) map.get("success")) != null && bool.booleanValue();
    }
}
