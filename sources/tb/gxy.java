package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ThemeInfoResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gxy extends mx6 implements f0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337542);
        t2o.a(525337163);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(gxy gxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ThemeRequestThemeInfoEventsImpl");
    }

    @Override // tb.f0e
    public void t0(ThemeInfoResult themeInfoResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d72833c", new Object[]{this, themeInfoResult});
            return;
        }
        ckf.g(themeInfoResult, "result");
        Object json = JSON.toJSON(themeInfoResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onCallback"));
    }
}
