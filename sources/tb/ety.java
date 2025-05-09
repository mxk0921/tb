package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PermissionResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ety extends mx6 implements o8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337372);
        t2o.a(525337099);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ety(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ety etyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PermissionRequestEventsImpl");
    }

    @Override // tb.o8d
    public void b(PermissionResult permissionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967ff954", new Object[]{this, permissionResult});
            return;
        }
        ckf.g(permissionResult, "result");
        Object json = JSON.toJSON(permissionResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
