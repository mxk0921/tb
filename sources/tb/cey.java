package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.APMProcedureResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cey extends mx6 implements nab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336586);
        t2o.a(525336985);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cey(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(cey ceyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/APMProcedureGetterEventImpl");
    }

    @Override // tb.nab
    public void p1(APMProcedureResult aPMProcedureResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53209d46", new Object[]{this, aPMProcedureResult});
            return;
        }
        ckf.g(aPMProcedureResult, "result");
        Object json = JSON.toJSON(aPMProcedureResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onResult"));
    }
}
