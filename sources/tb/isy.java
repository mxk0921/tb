package tb;

import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class isy extends mx6 implements n3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337338);
        t2o.a(525337087);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(isy isyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/OpenCallbackImpl");
    }

    @Override // tb.n3d
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
