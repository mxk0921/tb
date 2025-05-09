package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UmiPrivatePublishChangeCoverSucceedResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class uxy extends mx6 implements w5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337615);
        t2o.a(525337183);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(uxy uxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UmiPrivatePublishChangeCoverEventsImpl");
    }

    @Override // tb.w5e
    public void t(UmiPrivatePublishChangeCoverSucceedResult umiPrivatePublishChangeCoverSucceedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d40041b", new Object[]{this, umiPrivatePublishChangeCoverSucceedResult});
            return;
        }
        ckf.g(umiPrivatePublishChangeCoverSucceedResult, "result");
        Object json = JSON.toJSON(umiPrivatePublishChangeCoverSucceedResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
