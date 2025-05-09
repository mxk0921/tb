package tb;

import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ivy extends mx6 implements bnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337491);
        t2o.a(525337145);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ivy ivyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ScreenSetCaptureListenerEventsImpl");
    }

    @Override // tb.bnd
    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2632c16e", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onCapture"));
        }
    }
}
