package tb;

import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rvy extends mx6 implements rpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337508);
        t2o.a(525337153);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(rvy rvyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/SharePannelSaveImageEventsImpl");
    }

    @Override // tb.rpd
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onFinish"));
        }
    }
}
