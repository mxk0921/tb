package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PrivacyComplianceMinorsStatusResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class suy extends mx6 implements ldd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337463);
        t2o.a(525337137);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(suy suyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PrivacyComplianceMinorsStatusEventImpl");
    }

    @Override // tb.ldd
    public void g1(PrivacyComplianceMinorsStatusResult privacyComplianceMinorsStatusResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec33b4fb", new Object[]{this, privacyComplianceMinorsStatusResult});
            return;
        }
        ckf.g(privacyComplianceMinorsStatusResult, "result");
        Object json = JSON.toJSON(privacyComplianceMinorsStatusResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onData"));
    }
}
