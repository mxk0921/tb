package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class v32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537577);
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("363ddd74", new Object[]{this, str});
        }
        ckf.h(str, pl4.KEY_NODE_ID);
        try {
            JSONObject jSONObject5 = ish.g().f21548a;
            if (jSONObject5 == null || (jSONObject = jSONObject5.getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject("global")) == null || (jSONObject3 = jSONObject2.getJSONObject("secScreenFragment")) == null || (jSONObject4 = jSONObject3.getJSONObject("bizParams")) == null || (string = jSONObject4.getString("tab")) == null) {
                return null;
            }
            JSONArray parseArray = JSON.parseArray(URLDecoder.decode(string));
            String str2 = "column_" + parseArray.size();
            JSONObject parseObject = JSON.parseObject(ih4.f("mtbTabInfoV2", "{\"column_1\":[{\"x\":89,\"y\":59}],\"column_2\":[{\"x\":89,\"y\":59},{\"x\":228,\"y\":59}],\"column_3\":[{\"x\":89,\"y\":59},{\"x\":228,\"y\":59},{\"x\":361,\"y\":59}]}"));
            int indexOf = parseArray.indexOf(str);
            JSONArray jSONArray = parseObject.getJSONArray(str2);
            if (jSONArray != null) {
                return jSONArray.getJSONObject(indexOf);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
