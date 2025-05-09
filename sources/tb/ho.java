package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789205);
    }

    public static JSONObject a(UltronProtocol ultronProtocol) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("346f08c", new Object[]{ultronProtocol});
        }
        Object linkage = ultronProtocol.getLinkage();
        if (!(linkage instanceof JSONObject) || (jSONObject = ((JSONObject) linkage).getJSONObject("features")) == null || (jSONObject2 = jSONObject.getJSONObject(ro.SIMPLIFY_RULES)) == null) {
            return null;
        }
        return jSONObject2.getJSONObject("data");
    }

    public static void b(UltronProtocol ultronProtocol, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c5ebae6", new Object[]{ultronProtocol, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            if (ultronProtocol == null) {
                ck.g().f("GlobalData中没有对应的数据：global_data_linkage_protocol", ck.b.b().l("AURAUltronProtocolCropperDelegate").a());
                return;
            }
            JSONObject a2 = a(ultronProtocol);
            if (a2 == null) {
                ck.g().e("没有配置simplifyRules", ck.b.b().l("AURAUltronProtocolCropperDelegate").a());
                return;
            }
            String string = jSONObject.getString(x96.PATH_OPERATOR);
            String string2 = jSONObject.getString("operatorEvent");
            if (!(string == null || string2 == null)) {
                for (String str : jSONObject2.keySet()) {
                    Object obj = jSONObject2.get(str);
                    if (!(obj instanceof Component)) {
                        th.a("componentObj必须是Component类型");
                    } else {
                        Object json = JSON.toJSON((Component) obj);
                        if (json instanceof JSONObject) {
                            jSONObject2.put(str, (Object) ro.c(str, string, string2, a2, (JSONObject) json));
                        }
                    }
                }
            }
        }
    }
}
