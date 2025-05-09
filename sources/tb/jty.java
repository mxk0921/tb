package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PhotoTakeFromScreenSuccessResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jty extends mx6 implements x8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337405);
        t2o.a(525337109);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jty(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(jty jtyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PhotoTakeFromScreenCompeletedEventsImpl");
    }

    @Override // tb.x8d
    public void a1(PhotoTakeFromScreenSuccessResult photoTakeFromScreenSuccessResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b300b2f", new Object[]{this, photoTakeFromScreenSuccessResult});
            return;
        }
        ckf.g(photoTakeFromScreenSuccessResult, "result");
        Object json = JSON.toJSON(photoTakeFromScreenSuccessResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
