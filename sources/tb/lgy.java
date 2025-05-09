package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ClientPrerenderPrerenderAttachDetail;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lgy extends mx6 implements nnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336768);
        t2o.a(525337011);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(lgy lgyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ClientPrerenderAddPrerenderAttachEventsImpl");
    }

    @Override // tb.nnb
    public void Q(ClientPrerenderPrerenderAttachDetail clientPrerenderPrerenderAttachDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("195ed8da", new Object[]{this, clientPrerenderPrerenderAttachDetail});
            return;
        }
        ckf.g(clientPrerenderPrerenderAttachDetail, "result");
        Object json = JSON.toJSON(clientPrerenderPrerenderAttachDetail);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onPrerenderAttach"));
    }
}
