package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.NextRPCFinishResult;
import com.taobao.android.abilityidl.ability.NextRPCReceiveDataResult;
import com.taobao.android.abilityidl.ability.NextRPCRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class pny extends mx6 implements n0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337328);
        t2o.a(525337085);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pny(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(pny pnyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/NextRPCRequestNextRPCEventsImpl");
    }

    @Override // tb.n0d
    public void G(NextRPCReceiveDataResult nextRPCReceiveDataResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7721f2cf", new Object[]{this, nextRPCReceiveDataResult});
            return;
        }
        ckf.g(nextRPCReceiveDataResult, "result");
        Object json = JSON.toJSON(nextRPCReceiveDataResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFailure"));
    }

    @Override // tb.n0d
    public void S(NextRPCReceiveDataResult nextRPCReceiveDataResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7bc1472", new Object[]{this, nextRPCReceiveDataResult});
            return;
        }
        ckf.g(nextRPCReceiveDataResult, "result");
        Object json = JSON.toJSON(nextRPCReceiveDataResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onReceiveData"));
    }

    @Override // tb.n0d
    public void a0(NextRPCReceiveDataResult nextRPCReceiveDataResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b1234d", new Object[]{this, nextRPCReceiveDataResult});
            return;
        }
        ckf.g(nextRPCReceiveDataResult, "result");
        Object json = JSON.toJSON(nextRPCReceiveDataResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onReceiveAttachedResponse"));
    }

    @Override // tb.n0d
    public void m0(NextRPCFinishResult nextRPCFinishResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8c8220", new Object[]{this, nextRPCFinishResult});
            return;
        }
        ckf.g(nextRPCFinishResult, "result");
        Object json = JSON.toJSON(nextRPCFinishResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFinish"));
    }

    @Override // tb.n0d
    public void t1(NextRPCRequest nextRPCRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a9a173", new Object[]{this, nextRPCRequest});
            return;
        }
        ckf.g(nextRPCRequest, "result");
        Object json = JSON.toJSON(nextRPCRequest);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onCreateRequest"));
    }
}
