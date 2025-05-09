package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ContainerTabSwitchDetail;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zgy extends mx6 implements yqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336829);
        t2o.a(525337025);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(zgy zgyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContainerTabBarClickInterceptEventsImpl");
    }

    @Override // tb.yqb
    public void D0(ContainerTabSwitchDetail containerTabSwitchDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98db922c", new Object[]{this, containerTabSwitchDetail});
            return;
        }
        ckf.g(containerTabSwitchDetail, "result");
        Object json = JSON.toJSON(containerTabSwitchDetail);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onClick"));
    }
}
