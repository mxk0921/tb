package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PowerMsgTopicUsersResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class kuy extends mx6 implements obd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337435);
        t2o.a(525337125);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(kuy kuyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PowerMsgRequestTopicUsersEventsImpl");
    }

    @Override // tb.obd
    public void H(PowerMsgTopicUsersResult powerMsgTopicUsersResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db398a2", new Object[]{this, powerMsgTopicUsersResult});
            return;
        }
        ckf.g(powerMsgTopicUsersResult, "result");
        Object json = JSON.toJSON(powerMsgTopicUsersResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onTopicUsers"));
    }
}
