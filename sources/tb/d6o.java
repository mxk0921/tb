package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d6o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAMS_GLOBAL = "global";
    public static final String PARAMS_GLOBAL_PARAM_REQ = "paramRequest";

    static {
        t2o.a(745538159);
    }

    public static Map<String, String> a(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fb2b59f3", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        String b = n6g.b(Globals.getApplication().getApplicationContext());
        if (!TextUtils.isEmpty(b)) {
            hashMap.put("shopInfo", b);
        }
        if (TextUtils.equals(str, "mtop.taobao.volvo.mytaobao")) {
            jSONObject = ish.g().m();
        } else {
            jSONObject = ish.g().k();
        }
        String str2 = null;
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("data");
        JSONObject jSONObject3 = jSONObject2 == null ? null : jSONObject2.getJSONObject("global");
        if (jSONObject3 != null) {
            str2 = jSONObject3.getString(PARAMS_GLOBAL_PARAM_REQ);
        }
        if (str2 != null) {
            hashMap.put(PARAMS_GLOBAL_PARAM_REQ, str2);
        }
        return hashMap;
    }

    public static w55 b(Context context, String str, String str2, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("efe44b82", new Object[]{context, str, str2, map, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Map<String, String> a2 = a("mtop.taobao.reborn.mclaren");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    a2.put(key, value);
                }
            }
        }
        w55 l0 = new w55(context).b(str).z0(str2).p0(a2).d("mytaobao").q0(true).n0(true).l0(true);
        if (z) {
            l0.v0("UNIT_TRADE");
        }
        return l0;
    }
}
