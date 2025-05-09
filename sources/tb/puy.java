package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PowerMsgStreamCommonResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class puy extends mx6 implements ubd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337449);
        t2o.a(525337135);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(puy puyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PowerMsgStreamSendEventsImpl");
    }

    @Override // tb.ubd
    public void r0(PowerMsgStreamCommonResult powerMsgStreamCommonResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c394467e", new Object[]{this, powerMsgStreamCommonResult});
            return;
        }
        ckf.g(powerMsgStreamCommonResult, "result");
        Object json = JSON.toJSON(powerMsgStreamCommonResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSended"));
    }
}
