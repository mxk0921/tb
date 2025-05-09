package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UmiPrivatePublishImageSucceedResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xxy extends mx6 implements z5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337627);
        t2o.a(525337189);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(xxy xxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UmiPrivatePublishImageEventsImpl");
    }

    @Override // tb.z5e
    public void j0(UmiPrivatePublishImageSucceedResult umiPrivatePublishImageSucceedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e743cf", new Object[]{this, umiPrivatePublishImageSucceedResult});
            return;
        }
        ckf.g(umiPrivatePublishImageSucceedResult, "result");
        Object json = JSON.toJSON(umiPrivatePublishImageSucceedResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
