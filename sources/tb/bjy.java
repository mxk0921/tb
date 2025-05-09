package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.GlobalMenuMenuClickResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bjy extends mx6 implements aac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336967);
        t2o.a(525337063);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(bjy bjyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/GlobalMenuEventsImpl");
    }

    @Override // tb.aac
    public void k1(GlobalMenuMenuClickResult globalMenuMenuClickResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d69b2d4", new Object[]{this, globalMenuMenuClickResult});
            return;
        }
        ckf.g(globalMenuMenuClickResult, "result");
        Object json = JSON.toJSON(globalMenuMenuClickResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onResult"));
    }
}
