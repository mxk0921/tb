package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699173);
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8b08e3c1", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject == null || jSONObject2 == null) {
            return jSONObject;
        }
        return (JSONObject) aq8.a(jSONObject2, jSONObject, true);
    }
}
