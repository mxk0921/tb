package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class igy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static JSONObject a(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("363b85f3", new Object[]{map});
        }
        if (map == null || (str = map.get("option")) == null) {
            return null;
        }
        return cf3.a(str);
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("292f7221", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getString("paymentType");
        }
        return "未知";
    }
}
