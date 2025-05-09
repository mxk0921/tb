package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class beh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f16345a;
    public Boolean b;
    public String c;
    public String d;
    public Map<String, lfo> e;
    public Map<String, fhh> f;

    static {
        t2o.a(856686623);
    }

    public final Map<String, lfo> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7c819457", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObject2 = (JSONObject) entry.getValue();
            lfo lfoVar = new lfo();
            if (jSONObject2 != null) {
                if (jSONObject2.containsKey("fileName")) {
                    jSONObject2.getString("fileName");
                }
                if (jSONObject2.containsKey("filePattern")) {
                    jSONObject2.getString("filePattern");
                }
                if (jSONObject2.containsKey(m09.TASK_TYPE_LEVEL)) {
                    jSONObject2.getString(m09.TASK_TYPE_LEVEL);
                }
                if (jSONObject2.containsKey("name")) {
                    jSONObject2.getString("name");
                }
                if (jSONObject2.containsKey("pattern")) {
                    jSONObject2.getString("pattern");
                }
                if (jSONObject2.containsKey("rollingPolicy")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("rollingPolicy");
                    if (jSONObject3.containsKey("maxHistory")) {
                        jSONObject3.getInteger("maxHistory").intValue();
                    }
                    if (jSONObject3.containsKey("totalSizeCap")) {
                        jSONObject3.getString("totalSizeCap");
                    }
                }
                hashMap.put(key, lfoVar);
            }
        }
        return hashMap;
    }

    public final Map<String, fhh> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dbbd01db", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObject2 = (JSONObject) entry.getValue();
            fhh fhhVar = new fhh();
            if (jSONObject2 != null) {
                if (jSONObject2.containsKey("appender")) {
                    jSONObject2.getString("appender");
                }
                if (jSONObject2.containsKey(m09.TASK_TYPE_LEVEL)) {
                    jSONObject2.getString(m09.TASK_TYPE_LEVEL);
                }
                if (jSONObject2.containsKey("module")) {
                    jSONObject2.getString("module");
                }
                if (jSONObject2.containsKey("tag")) {
                    jSONObject2.getString("tag");
                }
            }
            hashMap.put(key, fhhVar);
        }
        return hashMap;
    }

    public void c(JSON json, z24 z24Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a399adc", new Object[]{this, json, z24Var});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        if (jSONObject.containsKey("enable")) {
            this.f16345a = jSONObject.getBoolean("enable");
        }
        if (jSONObject.containsKey("destroy")) {
            this.b = jSONObject.getBoolean("destroy");
        }
        if (jSONObject.containsKey(m09.TASK_TYPE_LEVEL)) {
            this.c = jSONObject.getString(m09.TASK_TYPE_LEVEL);
        }
        if (jSONObject.containsKey("module")) {
            this.d = jSONObject.getString("module");
        }
        if (jSONObject.containsKey("appenders")) {
            this.e = a(jSONObject.getJSONObject("appenders"));
        }
        if (jSONObject.containsKey("loggers")) {
            this.f = b(jSONObject.getJSONObject("loggers"));
        }
    }
}
