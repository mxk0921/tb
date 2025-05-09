package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UmiPrivatePublishRecommendResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zxy extends mx6 implements c6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337635);
        t2o.a(525337193);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(zxy zxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UmiPrivatePublishRecommendEventsImpl");
    }

    @Override // tb.c6e
    public void P0(UmiPrivatePublishRecommendResult umiPrivatePublishRecommendResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77f7524", new Object[]{this, umiPrivatePublishRecommendResult});
            return;
        }
        ckf.g(umiPrivatePublishRecommendResult, "result");
        Object json = JSON.toJSON(umiPrivatePublishRecommendResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
