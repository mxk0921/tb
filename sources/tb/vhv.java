package tb;

import com.alibaba.android.ultron.event.ext.UltronPopV2Subscriber;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vhv extends i24 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "unionOrderOpV2";

    static {
        t2o.a(614465767);
    }

    public static /* synthetic */ Object ipc$super(vhv vhvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/UnionOrderOpV2Subscriber");
    }

    @Override // tb.i24
    public JSONObject K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d13c9e0", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || !(jSONObject.get(uhv.FIELD_NEXT_EVENTS) instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "mtopV2");
        jSONObject2.put("fields", (Object) axf.b(jSONObject));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(uhv.FIELD_OLD_DATA, "@data{}");
        jSONObject3.put(uhv.FIELD_NEXT_EVENTS, (Object) jSONObject.getJSONObject(uhv.FIELD_NEXT_EVENTS));
        JSONObject J = J(jSONObject2, "success", uhv.SUBSCRIBER_ID, jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(UltronPopV2Subscriber.FIELD_ULTRON_DATA, "@data{}");
        J(J, "finish", "ultronPopV2", jSONObject4);
        return jSONObject2;
    }
}
