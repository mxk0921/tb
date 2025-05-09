package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class el0 extends i24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465575);
    }

    public static /* synthetic */ Object ipc$super(el0 el0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/combine/AlertWithOpenUrlV2Subscriber");
    }

    @Override // tb.i24
    public JSONObject K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d13c9e0", new Object[]{this, jSONObject});
        }
        if (!(jSONObject.get("alert") instanceof JSONObject)) {
            uj8.b(el0.class.getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "没有alert");
            return null;
        }
        JSONObject J = zk0.J(axf.b(jSONObject));
        if (J == null) {
            uj8.b(el0.class.getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "构建alert事件失败");
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        axf.c(jSONObject2, jSONObject);
        jSONObject2.remove("alert");
        J(J, "confirm", "openUrlV2", jSONObject2);
        return J;
    }
}
