package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sm1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(736100462);
    }

    public static JSONObject a(JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ff5560c8", new Object[]{jSONObject, strArr});
        }
        for (String str : strArr) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.getJSONObject(str);
        }
        return jSONObject;
    }
}
