package tb;

import com.alibaba.android.ultron.event.ext.UltronPopV2Subscriber;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gzn extends i24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465580);
    }

    public static /* synthetic */ Object ipc$super(gzn gznVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/combine/RemoteUltronPopV2Subscriber");
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
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(UltronPopV2Subscriber.FIELD_ULTRON_DATA, "@data{}");
        J(jSONObject2, "success", "ultronPopV2", jSONObject3);
        return jSONObject2;
    }
}
