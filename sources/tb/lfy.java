package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lfy extends mx6 implements ekb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336741);
        t2o.a(525337005);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(lfy lfyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/BroadcastEventsImpl");
    }

    @Override // tb.ekb
    public void n1(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70116a6f", new Object[]{this, broadcastAddListenerEventResult});
            return;
        }
        ckf.g(broadcastAddListenerEventResult, "result");
        Object json = JSON.toJSON(broadcastAddListenerEventResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onAdd"));
    }

    @Override // tb.ekb
    public void onEvent(BroadcastEventResult broadcastEventResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
            return;
        }
        ckf.g(broadcastEventResult, "result");
        Object json = JSON.toJSON(broadcastEventResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT));
    }
}
