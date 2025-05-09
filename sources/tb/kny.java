package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class kny extends mx6 implements vyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337291);
        t2o.a(525337077);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kny(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(kny knyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/NavBarSetShareConfigEventsImpl");
    }

    @Override // tb.vyc
    public void onResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b609d1", new Object[]{this, new Boolean(z)});
        } else {
            b().c(new FinishResult(new JSONObject(a.k(jpu.a("result", Boolean.valueOf(z)))), "onResult"));
        }
    }
}
