package tb;

import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hgy extends mx6 implements fmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336759);
        t2o.a(525337009);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(hgy hgyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/CartCallNativeEventsImpl");
    }

    @Override // tb.fmb
    public void onSuccess(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            return;
        }
        ckf.g(map, "result");
        b().c(new FinishResult(map, "onSuccess"));
    }
}
