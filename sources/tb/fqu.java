package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700143);
    }

    public static JSONObject b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4bc97254", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (!map.keySet().isEmpty()) {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
        }
        return jSONObject;
    }

    public static String d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a91da2", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (!map.keySet().isEmpty()) {
            for (String str : map.keySet()) {
                jSONObject.put(str, (Object) map.get(str));
            }
        }
        return fkx.i(jSONObject);
    }
}
