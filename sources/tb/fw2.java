package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.basic.TMSLogger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fw2 extends g11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909442);
    }

    public fw2(f11 f11Var) {
        super(f11Var);
    }

    public static /* synthetic */ Object ipc$super(fw2 fw2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/ability/invoker/CallbackMiddleware");
    }

    @Override // tb.e11
    public Object a(ApiContext apiContext, Object[] objArr, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dc3d69ec", new Object[]{this, apiContext, objArr, uqVar});
        }
        Object a2 = this.b.a(apiContext, objArr, uqVar);
        if (this.f18200a.d) {
            TMSLogger.a("CallbackMiddleware", "generate auto callback for method:" + this.f18200a.c.getName());
            ey6 ey6Var = new ey6(uqVar, false);
            if (a2 == null || (a2 instanceof BridgeResponse)) {
                ey6Var.sendBridgeResponse((BridgeResponse) a2);
            } else if (a2 instanceof JSONObject) {
                ey6Var.sendJSONResponse((JSONObject) a2);
            } else {
                TMSLogger.b("CallbackMiddleware", "return type not recognized:".concat(a2.getClass().getName()));
                new ey6(uqVar, false).sendBridgeResponse(new BridgeResponse.Error(2, "method " + this.f18200a.c.getName() + " return type not recognized " + a2.getClass().getName()));
            }
        }
        return a2;
    }
}
