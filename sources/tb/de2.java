package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class de2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, lr1> f17753a;
    public static final JSONObject b;

    static {
        t2o.a(491782794);
        try {
            b = JSON.parseObject(f4b.h("bizparamsChannelConfig", "{\"UT\":{\"length\":200,\"key\":{\"_afc_id\":\"\"}},\"homepage_common\":{\"length\":800,\"key\":{\"tb_homepage_clientCache_lbs\":\"TB,SG_TMCS_FRESH_MARKET,SG_TMCS_1H_DS\"}}}"));
        } catch (Exception unused) {
            TLog.loge("BizParamsCenter", "JSONConfig Error");
            b = JSON.parseObject("{\"UT\":{\"length\":200,\"key\":{\"_afc_id\":\"\"}},\"homepage_common\":{\"length\":800,\"key\":{\"tb_homepage_clientCache_lbs\":\"TB,SG_TMCS_FRESH_MARKET,SG_TMCS_1H_DS\"}}}");
        }
        HashMap<String, lr1> hashMap = new HashMap<>(4);
        f17753a = hashMap;
        JSONObject jSONObject = b;
        hashMap.put("UT", new c0v("UT", jSONObject.getJSONObject("UT")));
        hashMap.put("homepage_common", new d5b("homepage_common", jSONObject.getJSONObject("homepage_common")));
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afad300d", new Object[]{jSONObject});
            return;
        }
        JSONObject jSONObject2 = b;
        if (!(jSONObject2 == null || jSONObject == null)) {
            for (String str : jSONObject2.keySet()) {
                lr1 lr1Var = f17753a.get(str);
                if (lr1Var != null) {
                    lr1Var.a(jSONObject);
                }
            }
        }
    }
}
