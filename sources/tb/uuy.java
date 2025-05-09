package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.RUMResultCallbackParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class uuy extends mx6 implements qgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337469);
        t2o.a(525337139);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(uuy uuyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/RUMResultEventsImpl");
    }

    @Override // tb.qgd
    public void N(RUMResultCallbackParams rUMResultCallbackParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816433a6", new Object[]{this, rUMResultCallbackParams});
            return;
        }
        ckf.g(rUMResultCallbackParams, "result");
        Object json = JSON.toJSON(rUMResultCallbackParams);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onResult"));
    }
}
