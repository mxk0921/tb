package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sc6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "name";
    public static final String TYPE = "t";
    public static final int TYPE_CONSTANT = 0;
    public static final int TYPE_EXPR = 1;
    public static final String URL = "url";
    public static final String VALUE = "v";
    public static final String VERSION = "version";

    static {
        t2o.a(444597038);
    }

    public static String a(DXRuntimeContext dXRuntimeContext, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9623090a", new Object[]{dXRuntimeContext, str, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        int intValue = jSONObject2.getIntValue("t");
        if (intValue == 0) {
            return jSONObject2.getString("v");
        }
        if (1 != intValue) {
            return null;
        }
        String valueOf = String.valueOf(ps5.d(dXRuntimeContext.W(), jSONObject2.getLong("v").longValue(), str));
        h36.a("DXSlotLoaderUtil evaluateValue 的结果为: ".concat(valueOf));
        return valueOf;
    }

    public static JSONObject b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("54af0d63", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getJSONObject("pTplName").getString("v");
            String string2 = jSONObject2.getJSONObject("bindSlot").getString("v");
            JSONObject jSONObject3 = jSONObject.getJSONObject(string);
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
                jSONObject.put(string, (Object) jSONObject3);
            }
            if (!jSONObject3.containsKey(string2)) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject3.put(string2, (Object) jSONObject4);
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    if (!entry.getKey().equals("pTplName") && !entry.getKey().equals("bindSlot")) {
                        jSONObject4.put(entry.getKey(), ((JSONObject) entry.getValue()).clone());
                    }
                }
            }
        }
        return jSONObject;
    }
}
