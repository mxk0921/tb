package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AccsConnectCommonResult;
import com.taobao.android.abilityidl.ability.AccsConnectFailResult;
import com.taobao.android.abilityidl.ability.AccsListenerKeyResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jey extends mx6 implements vdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336677);
        t2o.a(525336993);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jey(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(jey jeyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AccsConnEventsImpl");
    }

    @Override // tb.vdb
    public void C0(AccsListenerKeyResult accsListenerKeyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62aa1e92", new Object[]{this, accsListenerKeyResult});
            return;
        }
        ckf.g(accsListenerKeyResult, "result");
        Object json = JSON.toJSON(accsListenerKeyResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onListenerKey"));
    }

    @Override // tb.vdb
    public void R(AccsConnectCommonResult accsConnectCommonResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee54581a", new Object[]{this, accsConnectCommonResult});
            return;
        }
        ckf.g(accsConnectCommonResult, "result");
        Object json = JSON.toJSON(accsConnectCommonResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onDisconnected"));
    }

    @Override // tb.vdb
    public void f0(AccsConnectCommonResult accsConnectCommonResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35ff3ea", new Object[]{this, accsConnectCommonResult});
            return;
        }
        ckf.g(accsConnectCommonResult, "result");
        Object json = JSON.toJSON(accsConnectCommonResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onConnected"));
    }

    @Override // tb.vdb
    public void y(AccsConnectFailResult accsConnectFailResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9463c698", new Object[]{this, accsConnectFailResult});
            return;
        }
        ckf.g(accsConnectFailResult, "result");
        Object json = JSON.toJSON(accsConnectFailResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onConnectFail"));
    }
}
