package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.DetailError;
import com.taobao.android.abilityidl.ability.DetailResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qhy extends mx6 implements zyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336856);
        t2o.a(525337031);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(qhy qhyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/DetailEventsImpl");
    }

    @Override // tb.zyb
    public void F0(DetailResult detailResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d38512", new Object[]{this, detailResult});
            return;
        }
        ckf.g(detailResult, "result");
        Object json = JSON.toJSON(detailResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }

    @Override // tb.zyb
    public void V0(DetailError detailError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b0ce81", new Object[]{this, detailError});
            return;
        }
        ckf.g(detailError, "result");
        Object json = JSON.toJSON(detailError);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFailed"));
    }
}
