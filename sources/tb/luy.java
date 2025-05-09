package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PowerMsgSendResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class luy extends mx6 implements pbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337436);
        t2o.a(525337127);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(luy luyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PowerMsgSendEventsImpl");
    }

    @Override // tb.pbd
    public void K(PowerMsgSendResult powerMsgSendResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2e4721", new Object[]{this, powerMsgSendResult});
            return;
        }
        ckf.g(powerMsgSendResult, "result");
        Object json = JSON.toJSON(powerMsgSendResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSended"));
    }
}
