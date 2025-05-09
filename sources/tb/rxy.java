package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UTResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rxy extends mx6 implements y4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337595);
        t2o.a(525337177);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(rxy rxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UTResultEventsImpl");
    }

    @Override // tb.y4e
    public void k0(UTResult uTResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("815d405c", new Object[]{this, uTResult});
            return;
        }
        ckf.g(uTResult, "result");
        Object json = JSON.toJSON(uTResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onResult"));
    }
}
