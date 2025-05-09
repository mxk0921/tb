package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.NavigatorActionResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lny extends mx6 implements izc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337302);
        t2o.a(525337079);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lny(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(lny lnyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/NavigatorActionEventsImpl");
    }

    @Override // tb.izc
    public void E0(NavigatorActionResult navigatorActionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c600600e", new Object[]{this, navigatorActionResult});
            return;
        }
        ckf.g(navigatorActionResult, "result");
        Object json = JSON.toJSON(navigatorActionResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onResult"));
    }
}
