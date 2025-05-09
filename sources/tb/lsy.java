package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.OpenLoadSubPackageResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lsy extends mx6 implements t3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337353);
        t2o.a(525337093);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(lsy lsyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/OpenLoadSubPackageCallbackEventsImpl");
    }

    @Override // tb.t3d
    public void k(OpenLoadSubPackageResult openLoadSubPackageResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3afddd32", new Object[]{this, openLoadSubPackageResult});
            return;
        }
        ckf.g(openLoadSubPackageResult, "result");
        Object json = JSON.toJSON(openLoadSubPackageResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onData"));
    }
}
