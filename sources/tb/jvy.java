package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ScreenOrientationChangeResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jvy extends mx6 implements cnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337492);
        t2o.a(525337147);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(jvy jvyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ScreenSetOrientationListenerEventsImpl");
    }

    @Override // tb.cnd
    public void Y0(ScreenOrientationChangeResult screenOrientationChangeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0d2694", new Object[]{this, screenOrientationChangeResult});
            return;
        }
        ckf.g(screenOrientationChangeResult, "result");
        Object json = JSON.toJSON(screenOrientationChangeResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onChange"));
    }
}
