package tb;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class erv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18785a;
    public String b;
    public Map<String, String> c;

    static {
        t2o.a(856686626);
    }

    public void a(JSON json, z24 z24Var) throws Exception {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a399adc", new Object[]{this, json, z24Var});
            return;
        }
        JSONObject jSONObject2 = (JSONObject) json;
        if (jSONObject2.containsKey("bizType")) {
            this.f18785a = jSONObject2.getString("bizType");
        }
        if (jSONObject2.containsKey("bizCode")) {
            this.b = jSONObject2.getString("bizCode");
        }
        if (jSONObject2.containsKey("extraInfo") && (jSONObject = jSONObject2.getJSONObject("extraInfo")) != null) {
            try {
                if (jSONObject.size() > 0) {
                    this.c = new HashMap();
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        this.c.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Exception e) {
                Log.e("TLOG.Protocol.UserDefineUploadRequest", "user define upload error", e);
            }
        }
    }
}
