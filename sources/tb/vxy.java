package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UmiPrivatePublishFetchDraftListSucceedResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vxy extends mx6 implements x5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337621);
        t2o.a(525337185);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(vxy vxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UmiPrivatePublishFetchDraftListEventsImpl");
    }

    @Override // tb.x5e
    public void Q0(UmiPrivatePublishFetchDraftListSucceedResult umiPrivatePublishFetchDraftListSucceedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d56143", new Object[]{this, umiPrivatePublishFetchDraftListSucceedResult});
            return;
        }
        ckf.g(umiPrivatePublishFetchDraftListSucceedResult, "result");
        Object json = JSON.toJSON(umiPrivatePublishFetchDraftListSucceedResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
