package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UmiPrivatePublishSubmitSucceedResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class byy extends mx6 implements e6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337643);
        t2o.a(525337197);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(byy byyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UmiPrivatePublishSubmitEventsImpl");
    }

    @Override // tb.e6e
    public void F(UmiPrivatePublishSubmitSucceedResult umiPrivatePublishSubmitSucceedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b9f016", new Object[]{this, umiPrivatePublishSubmitSucceedResult});
            return;
        }
        ckf.g(umiPrivatePublishSubmitSucceedResult, "result");
        Object json = JSON.toJSON(umiPrivatePublishSubmitSucceedResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
