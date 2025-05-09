package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FootprintResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ziy extends mx6 implements z7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336954);
        t2o.a(525337059);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ziy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ziy ziyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/FootprintEventImpl");
    }

    @Override // tb.z7c
    public void s(FootprintResult footprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00f94bc", new Object[]{this, footprintResult});
            return;
        }
        ckf.g(footprintResult, "result");
        Object json = JSON.toJSON(footprintResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onResult"));
    }
}
