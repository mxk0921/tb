package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PopCenterCloseSuccessResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class auy extends mx6 implements lad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337415);
        t2o.a(525337113);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(auy auyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PopCenterCloseEventsImpl");
    }

    @Override // tb.lad
    public void E(PopCenterCloseSuccessResult popCenterCloseSuccessResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec6c0a2", new Object[]{this, popCenterCloseSuccessResult});
            return;
        }
        ckf.g(popCenterCloseSuccessResult, "result");
        Object json = JSON.toJSON(popCenterCloseSuccessResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
