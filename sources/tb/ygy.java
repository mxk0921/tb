package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ContainerSwiperSwitchDetail;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ygy extends mx6 implements xqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336824);
        t2o.a(525337023);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ygy ygyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContainerSwiperSwitchEventsImpl");
    }

    @Override // tb.xqb
    public void b0(ContainerSwiperSwitchDetail containerSwiperSwitchDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f3bee3", new Object[]{this, containerSwiperSwitchDetail});
            return;
        }
        ckf.g(containerSwiperSwitchDetail, "result");
        Object json = JSON.toJSON(containerSwiperSwitchDetail);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSwitch"));
    }
}
