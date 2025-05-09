package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.tmall.android.dai.DAI;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bm8 implements adt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944710);
        t2o.a(1034944593);
    }

    @Override // tb.adt
    public Map<String, String> a(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        String str2 = map.get(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        String str3 = map.get("type");
        String str4 = map.get("value");
        String str5 = map.get("traceBack");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", str4);
            jSONObject.put("traceback", str5 + "");
            jSONObject.put("model_name", str2);
            h45 registeredModel = DAI.getRegisteredModel(str2);
            if (registeredModel != null) {
                jSONObject.put("extend_arg1", registeredModel.d() + "");
                if (registeredModel.b() == null) {
                    str = "";
                } else {
                    str = registeredModel.b();
                }
                jSONObject.put("cid", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        xqh.g("0", str2 + "" + str3, jSONObject);
        HashMap hashMap = new HashMap();
        hashMap.put("success", "1");
        return hashMap;
    }
}
