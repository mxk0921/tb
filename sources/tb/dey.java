package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dey extends mx6 implements oab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336588);
        t2o.a(525336987);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dey(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(dey deyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/APMResultEventsImpl");
    }

    @Override // tb.oab
    public void onResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b609d1", new Object[]{this, new Boolean(z)});
        } else {
            b().c(new FinishResult(new JSONObject(a.k(jpu.a("result", Boolean.valueOf(z)))), "onResult"));
        }
    }
}
