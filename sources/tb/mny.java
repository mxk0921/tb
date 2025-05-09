package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.NavigatorFailureResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mny extends mx6 implements jzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337308);
        t2o.a(525337081);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mny(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(mny mnyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/NavigatorOpenExternalURLEventsImpl");
    }

    @Override // tb.jzc
    public void f1(NavigatorFailureResult navigatorFailureResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd956237", new Object[]{this, navigatorFailureResult});
            return;
        }
        ckf.g(navigatorFailureResult, "result");
        Object json = JSON.toJSON(navigatorFailureResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFailure"));
    }

    @Override // tb.jzc
    public void onSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onSuccess"));
        }
    }
}
