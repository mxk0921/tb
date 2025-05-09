package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AccelerometerShakeRet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hey extends mx6 implements rdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336670);
        t2o.a(525336989);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hey(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(hey heyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AccelerometerShakeListenerEventsImpl");
    }

    @Override // tb.rdb
    public void U(AccelerometerShakeRet accelerometerShakeRet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7753e0a3", new Object[]{this, accelerometerShakeRet});
            return;
        }
        ckf.g(accelerometerShakeRet, "result");
        Object json = JSON.toJSON(accelerometerShakeRet);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onShake"));
    }
}
