package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UserLoginResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hyy extends mx6 implements j7e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337662);
        t2o.a(525337201);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(hyy hyyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UserLoginEventsImpl");
    }

    @Override // tb.j7e
    public void v(UserLoginResult userLoginResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33840f5", new Object[]{this, userLoginResult});
            return;
        }
        ckf.g(userLoginResult, "result");
        Object json = JSON.toJSON(userLoginResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
