package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PowerMsgSendResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class guy extends mx6 implements jbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337424);
        t2o.a(525337117);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public guy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(guy guyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PowerMsgCountValueEventsImpl");
    }

    @Override // tb.jbd
    public void Z0(PowerMsgSendResult powerMsgSendResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9912c1dc", new Object[]{this, powerMsgSendResult});
            return;
        }
        ckf.g(powerMsgSendResult, "result");
        Object json = JSON.toJSON(powerMsgSendResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onCountValue"));
    }
}
