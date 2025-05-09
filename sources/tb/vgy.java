package tb;

import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vgy extends mx6 implements rqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336793);
        t2o.a(525337017);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(vgy vgyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContainerPageCloseEventsImpl");
    }

    @Override // tb.rqb
    public void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onClose"));
        }
    }
}
