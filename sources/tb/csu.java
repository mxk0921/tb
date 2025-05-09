package tb;

import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.a;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class csu implements w80 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "UCPJSNotificationAction";
    public static final String NAME_OLD = "WindvaneMsg";

    static {
        t2o.a(404750357);
        t2o.a(404750351);
    }

    @Override // tb.w80
    public void a(kq4 kq4Var, JSONObject jSONObject) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef6cfb6", new Object[]{this, kq4Var, jSONObject});
        } else if (jSONObject != null && kq4Var != null) {
            jSONObject.put(wdm.CATEGORY_TRIGGER_EVENT, (Object) kq4Var.b());
            jSONObject.put("triggerConfig", (Object) kq4Var.a());
            String jSONString = jSONObject.toJSONString();
            WVStandardEventCenter.postNotificationToJS("br_msgChannel", jSONString);
            JSONObject jSONObject2 = jSONObject.getJSONObject("schemeMap");
            if (jSONObject2 != null) {
                if (jSONObject2.size() <= 1) {
                    z = false;
                }
                if (z) {
                    jSONObject = (JSONObject) jSONObject.clone();
                }
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    String key = entry.getKey();
                    if (z) {
                        jSONObject.put("schemeMap", (Object) a.b(key, entry.getValue()));
                        str = jSONObject.toJSONString();
                    } else {
                        str = jSONString;
                    }
                    WVStandardEventCenter.postNotificationToJS("br_msgChannel." + key, str);
                }
            }
        }
    }
}
