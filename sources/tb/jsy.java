package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.OpenCartAddBagResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jsy extends mx6 implements o3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337340);
        t2o.a(525337089);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(jsy jsyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/OpenCartAddBagEventsImpl");
    }

    @Override // tb.o3d
    public void K0(OpenCartAddBagResult openCartAddBagResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d055c92", new Object[]{this, openCartAddBagResult});
            return;
        }
        ckf.g(openCartAddBagResult, "result");
        Object json = JSON.toJSON(openCartAddBagResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }

    @Override // tb.o3d
    public void e0(OpenCartAddBagResult openCartAddBagResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7c9619", new Object[]{this, openCartAddBagResult});
            return;
        }
        ckf.g(openCartAddBagResult, "result");
        Object json = JSON.toJSON(openCartAddBagResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFailure"));
    }
}
