package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UBFResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qxy extends mx6 implements i3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337583);
        t2o.a(525337175);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(qxy qxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UBFResultEventImpl");
    }

    @Override // tb.i3e
    public void I0(UBFResult uBFResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b498cd82", new Object[]{this, uBFResult});
            return;
        }
        ckf.g(uBFResult, "result");
        Object json = JSON.toJSON(uBFResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onResult"));
    }
}
