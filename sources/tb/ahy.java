package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ContainerTabSwitchDetail;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ahy extends mx6 implements zqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336834);
        t2o.a(525337027);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ahy ahyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContainerTabSwitchEventsImpl");
    }

    @Override // tb.zqb
    public void x1(ContainerTabSwitchDetail containerTabSwitchDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19c6a036", new Object[]{this, containerTabSwitchDetail});
            return;
        }
        ckf.g(containerTabSwitchDetail, "result");
        Object json = JSON.toJSON(containerTabSwitchDetail);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSwitch"));
    }
}
