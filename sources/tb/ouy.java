package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PowerMsgStreamCommonResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ouy extends mx6 implements tbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337447);
        t2o.a(525337133);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ouy ouyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PowerMsgStreamRemoveEventsImpl");
    }

    @Override // tb.tbd
    public void B0(PowerMsgStreamCommonResult powerMsgStreamCommonResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91200bea", new Object[]{this, powerMsgStreamCommonResult});
            return;
        }
        ckf.g(powerMsgStreamCommonResult, "result");
        Object json = JSON.toJSON(powerMsgStreamCommonResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onUnSubscribed"));
    }
}
