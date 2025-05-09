package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AccsBindResult;
import com.taobao.android.abilityidl.ability.AccsReceivedResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class iey extends mx6 implements udb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336674);
        t2o.a(525336991);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iey(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(iey ieyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AccsBindEventsImpl");
    }

    @Override // tb.udb
    public void A(AccsBindResult accsBindResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf19c14c", new Object[]{this, accsBindResult});
            return;
        }
        ckf.g(accsBindResult, "result");
        Object json = JSON.toJSON(accsBindResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onBind"));
    }

    @Override // tb.udb
    public void e1(AccsReceivedResult accsReceivedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e32c8ba", new Object[]{this, accsReceivedResult});
            return;
        }
        ckf.g(accsReceivedResult, "result");
        Object json = JSON.toJSON(accsReceivedResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onReceiveData"));
    }
}
