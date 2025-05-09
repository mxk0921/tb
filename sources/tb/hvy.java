package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ScreenSetBrightnessParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hvy extends mx6 implements zmd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337481);
        t2o.a(525337143);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(hvy hvyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ScreenBrightnessRequestEventsImpl");
    }

    @Override // tb.zmd
    public void U0(ScreenSetBrightnessParams screenSetBrightnessParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3323e", new Object[]{this, screenSetBrightnessParams});
            return;
        }
        ckf.g(screenSetBrightnessParams, "result");
        Object json = JSON.toJSON(screenSetBrightnessParams);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onData"));
    }
}
