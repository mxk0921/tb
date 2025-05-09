package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.TradeHybridFailureResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class oxy extends mx6 implements k2e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337565);
        t2o.a(525337171);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(oxy oxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/TradeHybridPreBindEventsImpl");
    }

    @Override // tb.k2e
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
}
