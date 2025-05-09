package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class al0 extends h24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237856);
    }

    public static /* synthetic */ Object ipc$super(al0 al0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/combine/AlertWithMtopWithAlipayV3Subscriber");
    }

    @Override // tb.h24
    public JSONObject H(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d13c9e0", new Object[]{this, jSONObject});
        }
        if (!(jSONObject.get("alert") instanceof JSONObject)) {
            tj8.b(al0.class.getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "没有alert");
            return null;
        }
        JSONObject G = yk0.G(twf.b(jSONObject));
        if (G == null) {
            tj8.b(al0.class.getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "构建alert事件失败");
            return null;
        }
        JSONObject b = twf.b(jSONObject);
        b.remove("alert");
        G(G(G, "confirm", "mtopV3", b), "success", "alipayV3", twf.b(jSONObject));
        return G;
    }
}
