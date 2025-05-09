package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.TinyAppCheckAddIconButtonResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jxy extends mx6 implements u0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337549);
        t2o.a(525337167);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(jxy jxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/TinyAppCheckAddIconButtonEventsImpl");
    }

    @Override // tb.u0e
    public void x0(TinyAppCheckAddIconButtonResult tinyAppCheckAddIconButtonResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51314a7a", new Object[]{this, tinyAppCheckAddIconButtonResult});
            return;
        }
        ckf.g(tinyAppCheckAddIconButtonResult, "result");
        Object json = JSON.toJSON(tinyAppCheckAddIconButtonResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onReuslt"));
    }
}
