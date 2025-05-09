package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UmiPrivatePublishVideoSucceedResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cyy extends mx6 implements f6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337646);
        t2o.a(525337199);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(cyy cyyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UmiPrivatePublishVideoEventsImpl");
    }

    @Override // tb.f6e
    public void Y(UmiPrivatePublishVideoSucceedResult umiPrivatePublishVideoSucceedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a26eef", new Object[]{this, umiPrivatePublishVideoSucceedResult});
            return;
        }
        ckf.g(umiPrivatePublishVideoSucceedResult, "result");
        Object json = JSON.toJSON(umiPrivatePublishVideoSucceedResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
