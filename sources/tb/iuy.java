package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PowerMsgHistoryMessagesResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class iuy extends mx6 implements mbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337433);
        t2o.a(525337121);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(iuy iuyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PowerMsgRequestHistoryMessagesEventsImpl");
    }

    @Override // tb.mbd
    public void m1(PowerMsgHistoryMessagesResult powerMsgHistoryMessagesResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fedc192", new Object[]{this, powerMsgHistoryMessagesResult});
            return;
        }
        ckf.g(powerMsgHistoryMessagesResult, "result");
        Object json = JSON.toJSON(powerMsgHistoryMessagesResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onHistoryMessages"));
    }
}
