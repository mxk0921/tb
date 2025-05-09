package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AddressParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ley extends mx6 implements peb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336690);
        t2o.a(525336997);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ley(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ley leyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AddressOpenAddressEventsImpl");
    }

    @Override // tb.peb
    public void d(AddressParams addressParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa579bd", new Object[]{this, addressParams});
            return;
        }
        ckf.g(addressParams, "result");
        Object json = JSON.toJSON(addressParams);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFail"));
    }

    @Override // tb.peb
    public void f(AddressParams addressParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a19c16", new Object[]{this, addressParams});
            return;
        }
        ckf.g(addressParams, "result");
        Object json = JSON.toJSON(addressParams);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
