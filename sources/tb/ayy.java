package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UmiPrivatePublishSaveDraftSucceedResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ayy extends mx6 implements d6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337638);
        t2o.a(525337195);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ayy ayyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UmiPrivatePublishSaveDraftEventsImpl");
    }

    @Override // tb.d6e
    public void c0(UmiPrivatePublishSaveDraftSucceedResult umiPrivatePublishSaveDraftSucceedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2994a918", new Object[]{this, umiPrivatePublishSaveDraftSucceedResult});
            return;
        }
        ckf.g(umiPrivatePublishSaveDraftSucceedResult, "result");
        Object json = JSON.toJSON(umiPrivatePublishSaveDraftSucceedResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
