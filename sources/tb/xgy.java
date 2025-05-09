package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ContainerPosition;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xgy extends mx6 implements tqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336801);
        t2o.a(525337021);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(xgy xgyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContainerPositionEventsImpl");
    }

    @Override // tb.tqb
    public void C(ContainerPosition containerPosition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5008d92e", new Object[]{this, containerPosition});
            return;
        }
        ckf.g(containerPosition, "result");
        Object json = JSON.toJSON(containerPosition);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onResult"));
    }
}
