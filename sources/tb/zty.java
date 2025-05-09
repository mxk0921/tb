package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PopCenterCheckSuccessResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zty extends mx6 implements kad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337412);
        t2o.a(525337111);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zty(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(zty ztyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PopCenterCheckEventsImpl");
    }

    @Override // tb.kad
    public void w1(PopCenterCheckSuccessResult popCenterCheckSuccessResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4274a7b2", new Object[]{this, popCenterCheckSuccessResult});
            return;
        }
        ckf.g(popCenterCheckSuccessResult, "result");
        Object json = JSON.toJSON(popCenterCheckSuccessResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
