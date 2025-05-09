package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.SharePannelQRResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qvy extends mx6 implements qpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337507);
        t2o.a(525337151);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(qvy qvyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/SharePannelRequestQREventsImpl");
    }

    @Override // tb.qpd
    public void l1(SharePannelQRResult sharePannelQRResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7779439b", new Object[]{this, sharePannelQRResult});
            return;
        }
        ckf.g(sharePannelQRResult, "result");
        Object json = JSON.toJSON(sharePannelQRResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
