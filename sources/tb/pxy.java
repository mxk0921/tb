package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.TradeHybridFailureResult;
import com.taobao.android.abilityidl.ability.TradeHybridSuccessResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class pxy extends mx6 implements m2e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337571);
        t2o.a(525337173);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(pxy pxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/TradeHybridUnexpectedReachEventsImpl");
    }

    @Override // tb.m2e
    public void e(TradeHybridFailureResult tradeHybridFailureResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a283ea0", new Object[]{this, tradeHybridFailureResult});
            return;
        }
        ckf.g(tradeHybridFailureResult, "result");
        Object json = JSON.toJSON(tradeHybridFailureResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFailure"));
    }

    @Override // tb.m2e
    public void h(TradeHybridSuccessResult tradeHybridSuccessResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36144a40", new Object[]{this, tradeHybridSuccessResult});
            return;
        }
        ckf.g(tradeHybridSuccessResult, "result");
        Object json = JSON.toJSON(tradeHybridSuccessResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
