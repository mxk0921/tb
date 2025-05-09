package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ojp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797241);
    }

    public static /* synthetic */ String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("711c1367", new Object[]{jSONObject});
        }
        return b(jSONObject);
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("431e09", new Object[]{jSONObject});
        }
        try {
            return jSONObject.getJSONObject("data").getString("enable");
        } catch (Throwable unused) {
            return null;
        }
    }
}
