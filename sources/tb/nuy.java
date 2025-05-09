package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PowerMsgStreamCommonResult;
import com.taobao.android.abilityidl.ability.PowerMsgStreamMessagesResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nuy extends mx6 implements sbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337444);
        t2o.a(525337131);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(nuy nuyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PowerMsgStreamMessagesEventsImpl");
    }

    @Override // tb.sbd
    public void T(PowerMsgStreamMessagesResult powerMsgStreamMessagesResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c176ab82", new Object[]{this, powerMsgStreamMessagesResult});
            return;
        }
        ckf.g(powerMsgStreamMessagesResult, "result");
        Object json = JSON.toJSON(powerMsgStreamMessagesResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onStreamMessages"));
    }

    @Override // tb.sbd
    public void i0(PowerMsgStreamCommonResult powerMsgStreamCommonResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203356f1", new Object[]{this, powerMsgStreamCommonResult});
            return;
        }
        ckf.g(powerMsgStreamCommonResult, "result");
        Object json = JSON.toJSON(powerMsgStreamCommonResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSubscribed"));
    }
}
