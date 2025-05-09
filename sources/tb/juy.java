package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PowerMsgTopicStatusResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class juy extends mx6 implements nbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337434);
        t2o.a(525337123);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(juy juyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PowerMsgRequestTopicStatusEventsImpl");
    }

    @Override // tb.nbd
    public void w(PowerMsgTopicStatusResult powerMsgTopicStatusResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb076e50", new Object[]{this, powerMsgTopicStatusResult});
            return;
        }
        ckf.g(powerMsgTopicStatusResult, "result");
        Object json = JSON.toJSON(powerMsgTopicStatusResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onTopicStatus"));
    }
}
