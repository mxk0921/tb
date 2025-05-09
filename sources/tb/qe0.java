package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qe0 extends i24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465747);
    }

    public static /* synthetic */ Object ipc$super(qe0 qe0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/AddCartSubscriberV2");
    }

    @Override // tb.i24
    public JSONObject K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d13c9e0", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "mtopV2");
        jSONObject2.put("fields", (Object) axf.b(jSONObject));
        if (jSONObject.get("successUrl") instanceof String) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", (Object) jSONObject.getString("successUrl"));
            J(jSONObject2, "success", gd3.TAG, null);
            J(jSONObject2, "success", "openUrlV2", jSONObject3);
        }
        if (jSONObject.get("failUrl") instanceof String) {
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("errorMsg", (Object) "@data{ret[0]}");
            jSONObject4.put("queryParams", (Object) jSONObject5);
            jSONObject4.put("url", (Object) jSONObject.getString("failUrl"));
            J(jSONObject2, "fail", "weexPopV2", jSONObject4);
        }
        return jSONObject2;
    }
}
