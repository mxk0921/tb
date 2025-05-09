package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UmiPrivatePublishGetParamsSucceedResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wxy extends mx6 implements y5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337624);
        t2o.a(525337187);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(wxy wxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UmiPrivatePublishGetParamsEventsImpl");
    }

    @Override // tb.y5e
    public void y0(UmiPrivatePublishGetParamsSucceedResult umiPrivatePublishGetParamsSucceedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a2e770", new Object[]{this, umiPrivatePublishGetParamsSucceedResult});
            return;
        }
        ckf.g(umiPrivatePublishGetParamsSucceedResult, "result");
        Object json = JSON.toJSON(umiPrivatePublishGetParamsSucceedResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
