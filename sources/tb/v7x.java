package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v7x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982515914);
    }

    public static JSONObject a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c92391a5", new Object[]{new Integer(i), str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", false);
            jSONObject.put("errorCode", i);
            jSONObject.put("errorMsg", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject b(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("25615ef0", new Object[]{weexInstanceImpl});
        }
        v3x v3xVar = (v3x) weexInstanceImpl.getExtend(v3x.class);
        WMInstanceApm c = v3xVar != null ? v3xVar.c() : null;
        if (c == null) {
            return a(102, "Instance apm not found");
        }
        try {
            try {
                String c2 = c.e().c();
                if (c2 == null) {
                    return a(104, "Procedure data is null");
                }
                JSONObject jSONObject = new JSONObject(c2);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("success", true);
                    jSONObject2.put("result", jSONObject);
                } catch (JSONException unused) {
                }
                return jSONObject2;
            } catch (NoSuchMethodError unused2) {
                return a(103, "Can not get procedure data");
            }
        } catch (JSONException unused3) {
            return a(105, "Procedure data is invalid");
        }
    }
}
