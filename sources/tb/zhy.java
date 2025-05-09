package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.EdlpOnResultData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zhy extends mx6 implements v1c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336876);
        t2o.a(525337035);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(zhy zhyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/EdlpResultListenerEventsImpl");
    }

    @Override // tb.v1c
    public void j(EdlpOnResultData edlpOnResultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0b720f", new Object[]{this, edlpOnResultData});
            return;
        }
        ckf.g(edlpOnResultData, "result");
        Object json = JSON.toJSON(edlpOnResultData);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onResult"));
    }
}
