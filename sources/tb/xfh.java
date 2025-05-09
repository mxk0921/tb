package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xfh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f31351a = Boolean.TRUE;
    public neh[] b;
    public String c;

    static {
        t2o.a(856686624);
    }

    public void a(JSON json, z24 z24Var) throws Exception {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a399adc", new Object[]{this, json, z24Var});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        if (jSONObject.containsKey("allowNotWifi")) {
            this.f31351a = jSONObject.getBoolean("allowNotWifi");
        }
        if (jSONObject.containsKey("uploadId")) {
            this.c = jSONObject.getString("uploadId");
        }
        if (jSONObject.containsKey("logFeatures") && (jSONArray = jSONObject.getJSONArray("logFeatures")) != null && jSONArray.size() > 0) {
            this.b = b(jSONArray);
        }
    }

    public final neh[] b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (neh[]) ipChange.ipc$dispatch("c4455f55", new Object[]{this, jSONArray});
        }
        neh[] nehVarArr = new neh[jSONArray.size()];
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            neh nehVar = new neh();
            if (jSONObject.containsKey("appenderName")) {
                nehVar.f24680a = jSONObject.getString("appenderName");
            }
            if (jSONObject.containsKey(Constants.Name.SUFFIX)) {
                jSONObject.getString(Constants.Name.SUFFIX);
            }
            if (jSONObject.containsKey("maxHistory")) {
                nehVar.b = jSONObject.getInteger("maxHistory");
            }
            if (jSONObject.containsKey("startTime")) {
                nehVar.c = jSONObject.getLong("startTime").longValue();
            }
            if (jSONObject.containsKey("endTime")) {
                nehVar.d = jSONObject.getLong("endTime").longValue();
            }
            nehVarArr[i] = nehVar;
        }
        return nehVarArr;
    }
}
