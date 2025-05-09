package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PowerMsgCountMessage;
import com.taobao.android.abilityidl.ability.PowerMsgJoinMessage;
import com.taobao.android.abilityidl.ability.PowerMsgPowerMessage;
import com.taobao.android.abilityidl.ability.PowerMsgSubscribeResult;
import com.taobao.android.abilityidl.ability.PowerMsgTextMessage;
import com.taobao.android.abilityidl.ability.PowerMsgUnSubscribeResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class huy extends mx6 implements lbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337428);
        t2o.a(525337119);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(huy huyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PowerMsgMessageArrivedEventsImpl");
    }

    @Override // tb.lbd
    public void P(PowerMsgUnSubscribeResult powerMsgUnSubscribeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781e1cf0", new Object[]{this, powerMsgUnSubscribeResult});
            return;
        }
        ckf.g(powerMsgUnSubscribeResult, "result");
        Object json = JSON.toJSON(powerMsgUnSubscribeResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onUnSubscribed"));
    }

    @Override // tb.lbd
    public void s0(PowerMsgTextMessage powerMsgTextMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1486424", new Object[]{this, powerMsgTextMessage});
            return;
        }
        ckf.g(powerMsgTextMessage, "result");
        Object json = JSON.toJSON(powerMsgTextMessage);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onTextMessageArrived"));
    }

    @Override // tb.lbd
    public void u0(PowerMsgSubscribeResult powerMsgSubscribeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa51e50", new Object[]{this, powerMsgSubscribeResult});
            return;
        }
        ckf.g(powerMsgSubscribeResult, "result");
        Object json = JSON.toJSON(powerMsgSubscribeResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSubscribed"));
    }

    @Override // tb.lbd
    public void v1(PowerMsgCountMessage powerMsgCountMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1202489e", new Object[]{this, powerMsgCountMessage});
            return;
        }
        ckf.g(powerMsgCountMessage, "result");
        Object json = JSON.toJSON(powerMsgCountMessage);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onCountMessageArrived"));
    }

    @Override // tb.lbd
    public void x(PowerMsgPowerMessage powerMsgPowerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68194643", new Object[]{this, powerMsgPowerMessage});
            return;
        }
        ckf.g(powerMsgPowerMessage, "result");
        Object json = JSON.toJSON(powerMsgPowerMessage);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onMessageArrived"));
    }

    @Override // tb.lbd
    public void z0(PowerMsgJoinMessage powerMsgJoinMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644f5704", new Object[]{this, powerMsgJoinMessage});
            return;
        }
        ckf.g(powerMsgJoinMessage, "result");
        Object json = JSON.toJSON(powerMsgJoinMessage);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onJoinMessageArrived"));
    }
}
