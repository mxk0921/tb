package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ut6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static List<vnf> a(JSONObject jSONObject, JSONObject jSONObject2) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4eb551c3", new Object[]{jSONObject, jSONObject2});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        try {
            size = jSONObject.size();
        } catch (Throwable th) {
            v1.c("DataUtil", "parseData", th);
        }
        if (size <= 1) {
            return arrayList;
        }
        for (int i = 1; i < size; i++) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(String.valueOf(i));
            vnf vnfVar = new vnf();
            JSONObject jSONObject4 = jSONObject3.getJSONObject("content");
            if (jSONObject4 != null) {
                vnfVar.f30125a = jSONObject4.getString("act_pic");
                vnfVar.b = jSONObject3.getString("targetUrl");
                if (jSONObject3.getJSONObject("clickParam") != null) {
                    JSONObject jSONObject5 = new JSONObject();
                    if (jSONObject2 != null) {
                        jSONObject2.remove("utLogMapEdge");
                        jSONObject5.putAll(jSONObject2);
                    }
                    jSONObject5.putAll(jSONObject3.getJSONObject("clickParam").getJSONObject("args"));
                    v1.b("DataUtil", "clickParamArgsJson=" + jSONObject5.keySet());
                    vnfVar.c = jSONObject5;
                }
                arrayList.add(vnfVar);
            }
        }
        return arrayList;
    }
}
