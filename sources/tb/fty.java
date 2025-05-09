package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PermissionRequestPermissionEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fty extends mx6 implements p8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337375);
        t2o.a(525337101);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fty(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(fty ftyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PermissionRequestPermissionEventsImpl");
    }

    @Override // tb.p8d
    public void q1(PermissionRequestPermissionEvent permissionRequestPermissionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c690e395", new Object[]{this, permissionRequestPermissionEvent});
            return;
        }
        ckf.g(permissionRequestPermissionEvent, "result");
        Object json = JSON.toJSON(permissionRequestPermissionEvent);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
