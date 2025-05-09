package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ScanCodeSuccessResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fvy extends mx6 implements mmd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337474);
        t2o.a(525337141);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(fvy fvyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ScanCodeCompletedEventsImpl");
    }

    @Override // tb.mmd
    public void i1(ScanCodeSuccessResult scanCodeSuccessResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1817d91a", new Object[]{this, scanCodeSuccessResult});
            return;
        }
        ckf.g(scanCodeSuccessResult, "result");
        Object json = JSON.toJSON(scanCodeSuccessResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
