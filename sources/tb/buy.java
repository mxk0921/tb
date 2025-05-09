package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PopCenterTriggerSuccessResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class buy extends mx6 implements nad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337417);
        t2o.a(525337115);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(buy buyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PopCenterTriggerEventsImpl");
    }

    @Override // tb.nad
    public void m(PopCenterTriggerSuccessResult popCenterTriggerSuccessResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0f4fe2", new Object[]{this, popCenterTriggerSuccessResult});
            return;
        }
        ckf.g(popCenterTriggerSuccessResult, "result");
        Object json = JSON.toJSON(popCenterTriggerSuccessResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
