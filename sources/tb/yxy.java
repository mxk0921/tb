package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.UmiPrivatePublishQueryDraftsSizeSucceedResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class yxy extends mx6 implements b6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337632);
        t2o.a(525337191);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(yxy yxyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/UmiPrivatePublishQueryDraftsSizeEventsImpl");
    }

    @Override // tb.b6e
    public void h1(UmiPrivatePublishQueryDraftsSizeSucceedResult umiPrivatePublishQueryDraftsSizeSucceedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f99d1af", new Object[]{this, umiPrivatePublishQueryDraftsSizeSucceedResult});
            return;
        }
        ckf.g(umiPrivatePublishQueryDraftsSizeSucceedResult, "result");
        Object json = JSON.toJSON(umiPrivatePublishQueryDraftsSizeSucceedResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
