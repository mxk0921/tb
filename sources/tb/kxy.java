package tb;

import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class kxy extends mx6 implements w0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337554);
        t2o.a(525337169);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(kxy kxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/TinyAppUserActiveAddIconEventsImpl");
    }

    @Override // tb.w0e
    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66e10e2", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onAddIcon"));
        }
    }
}
