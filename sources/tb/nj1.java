package tb;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;
import kotlin.TypeCastException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nj1 implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_AURA_EVENT_BRIDGE = "auraEventBridge";
    public static final String AURA_EVENT_BRIDGE = "1383713017440984839";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(350224397);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(350224396);
        t2o.a(144703491);
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.h(str, "api");
        ckf.h(kdbVar, "context");
        ckf.h(map, "params");
        ckf.h(vqVar, "callback");
        if (!(kdbVar.getUserContext() instanceof tk6)) {
            return ErrorResult.a.Companion.g("AbilityContext invalid");
        }
        Object userContext = kdbVar.getUserContext();
        if (userContext != null) {
            tk6 tk6Var = (tk6) userContext;
            DXRuntimeContext p = tk6Var.p();
            if (!((p != null ? p.q() : null) instanceof qh)) {
                return ErrorResult.a.Companion.g("dxUserContext invalid");
            }
            DXRuntimeContext p2 = tk6Var.p();
            ckf.c(p2, "akDxCtx.dxRootViewRuntimeContext");
            Object q = p2.q();
            if (q != null) {
                qh qhVar = (qh) q;
                qi qiVar = new qi();
                qiVar.t(qhVar.b);
                qiVar.k(qi.EXT_KEY_DX_RUNTIME_CONTEXT, tk6Var.p());
                Object obj = map.get("eventType");
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                Object obj2 = map.get("eventFields");
                if (!(obj2 instanceof JSONObject)) {
                    obj2 = null;
                }
                qiVar.n((JSONObject) obj2);
                qiVar.l(qhVar.f());
                if (xk.a("ignoreDxEvent", false)) {
                    qiVar.m(qhVar.g());
                }
                if (str2 != null) {
                    qiVar.o(str2);
                    lo loVar = qhVar.f26744a;
                    ckf.c(loVar, "auraUserCtx.mUserContext");
                    pi.b(loVar.c(), str2, qiVar);
                    Util.m("exposure_AuraEventBridge", Util.c("AuraEventBridge", "AuraEventBridge", tk6Var.p()));
                }
                return new FinishResult(null, null, 3, null);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.android.aura.service.event.dx.AURADXUserContext");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.dinamicx.eventchain.DXUIAbilityRuntimeContext");
    }
}
