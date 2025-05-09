package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ThemeTypeResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hxy extends mx6 implements g0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337544);
        t2o.a(525337165);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(hxy hxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ThemeRequestThemeTypeEventsImpl");
    }

    @Override // tb.g0e
    public void D(ThemeTypeResult themeTypeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c67630", new Object[]{this, themeTypeResult});
            return;
        }
        ckf.g(themeTypeResult, "result");
        Object json = JSON.toJSON(themeTypeResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onCallback"));
    }
}
