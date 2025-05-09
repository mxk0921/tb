package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PhotoSuccessResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gty extends mx6 implements u8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337387);
        t2o.a(525337103);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gty(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(gty gtyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PhotoCompeletedEventsImpl");
    }

    @Override // tb.u8d
    public void A0(PhotoSuccessResult photoSuccessResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b499c1f2", new Object[]{this, photoSuccessResult});
            return;
        }
        ckf.g(photoSuccessResult, "result");
        Object json = JSON.toJSON(photoSuccessResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
