package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UmiPrivatePublishAppendMediaSucceedResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class txy extends mx6 implements v5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337611);
        t2o.a(525337181);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(txy txyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UmiPrivatePublishAppendMediaEventsImpl");
    }

    @Override // tb.v5e
    public void p(UmiPrivatePublishAppendMediaSucceedResult umiPrivatePublishAppendMediaSucceedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb0911e", new Object[]{this, umiPrivatePublishAppendMediaSucceedResult});
            return;
        }
        ckf.g(umiPrivatePublishAppendMediaSucceedResult, "result");
        Object json = JSON.toJSON(umiPrivatePublishAppendMediaSucceedResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
