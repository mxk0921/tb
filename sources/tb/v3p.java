package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class v3p implements ehc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792297);
        t2o.a(995098641);
    }

    @Override // tb.ehc
    public Map<String, Object> a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a8925cde", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null && !jSONObject.isEmpty() && (jSONObject2 = jSONObject.getJSONObject("jarvisData")) != null && !jSONObject2.isEmpty()) {
            hashMap.putAll(jSONObject2.getInnerMap());
        }
        return hashMap;
    }
}
