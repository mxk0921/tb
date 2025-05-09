package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.a;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t8k implements w80 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "NotificationAction";

    static {
        t2o.a(404750353);
        t2o.a(404750351);
    }

    @Override // tb.w80
    public void a(kq4 kq4Var, JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef6cfb6", new Object[]{this, kq4Var, jSONObject});
        } else if (jSONObject != null) {
            km1.b(jSONObject.getInnerMap());
            JSONObject jSONObject2 = jSONObject.getJSONObject("schemeMap");
            if (jSONObject2 != null) {
                if (jSONObject2.size() <= 1) {
                    z = false;
                }
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    String key = entry.getKey();
                    if (z) {
                        jSONObject = (JSONObject) jSONObject.clone();
                        jSONObject.put("schemeMap", (Object) a.b(key, entry.getValue()));
                    }
                    Map<String, Object> innerMap = jSONObject.getInnerMap();
                    km1.c(innerMap, "BHRNotificationName." + key);
                }
            }
        }
    }
}
