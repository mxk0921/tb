package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nr6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static JSONObject a(k8 k8Var) {
        JSONObject data;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ad50634c", new Object[]{k8Var});
        }
        try {
            if (k8Var instanceof tk6) {
                tk6 tk6Var = (tk6) k8Var;
                if (tk6Var.o() == null || (data = tk6Var.o().getData()) == null || (jSONObject = data.getJSONObject("item")) == null) {
                    return null;
                }
                return jSONObject.getJSONObject("0");
            }
        } catch (Exception e) {
            v1.b("DataParseUtils", "getItem0 fail, and error: " + e.getMessage());
        }
        return null;
    }

    public static String b(k8 k8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f318215", new Object[]{k8Var});
        }
        try {
            JSONObject a2 = a(k8Var);
            if (a2 == null) {
                return "";
            }
            return a2.getString("targetUrl");
        } catch (Exception e) {
            v1.b("DataParseUtils", "getTargetUrl fail, and error: " + e.getMessage());
            return "";
        }
    }
}
