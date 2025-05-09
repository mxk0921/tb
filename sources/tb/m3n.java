package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class m3n extends g11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(844103717);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3n(f11 f11Var) {
        super(f11Var);
        ckf.g(f11Var, "meta");
    }

    public static /* synthetic */ Object ipc$super(m3n m3nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/task/PubPermissionMiddleware");
    }

    @Override // tb.e11
    public Object a(ApiContext apiContext, Object[] objArr, uq uqVar) {
        o2n o2nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dc3d69ec", new Object[]{this, apiContext, objArr, uqVar});
        }
        ckf.g(apiContext, "context");
        ckf.g(objArr, "args");
        ckf.g(uqVar, "callback");
        String str = this.f18200a.f18931a;
        if (str == null || str.length() == 0) {
            uqVar.a(jr.e("2", "invalid parameter!"), false);
            return null;
        } else if (!q9s.n2()) {
            return this.b.a(apiContext, objArr, uqVar);
        } else {
            if (!q9s.f(str)) {
                return this.b.a(apiContext, objArr, uqVar);
            }
            bbs b = apiContext.b();
            if (b != null && (o2nVar = (o2n) b.g(o2n.class)) != null && o2nVar.b(str)) {
                return this.b.a(apiContext, objArr, uqVar);
            }
            uqVar.a(jr.e("4", BridgeResponse.ERROR_MSG_FORBIDDEN_ERROR), false);
            return null;
        }
    }
}
