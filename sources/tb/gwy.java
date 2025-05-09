package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.SystemNotificationStatusResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gwy extends mx6 implements hud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337535);
        t2o.a(525337161);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(gwy gwyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/SystemNotificationEventsImpl");
    }

    @Override // tb.hud
    public void J0(SystemNotificationStatusResult systemNotificationStatusResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bc902f", new Object[]{this, systemNotificationStatusResult});
            return;
        }
        ckf.g(systemNotificationStatusResult, "result");
        Object json = JSON.toJSON(systemNotificationStatusResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onResult"));
    }
}
