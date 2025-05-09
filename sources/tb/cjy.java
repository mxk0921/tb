package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.HTTPRequestFailResult;
import com.taobao.android.abilityidl.ability.HTTPRequestResponseResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cjy extends mx6 implements xbc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336983);
        t2o.a(525337065);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(cjy cjyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/HTTPRequestRequestEventsImpl");
    }

    @Override // tb.xbc
    public void H0(HTTPRequestResponseResult hTTPRequestResponseResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab41a2b", new Object[]{this, hTTPRequestResponseResult});
            return;
        }
        ckf.g(hTTPRequestResponseResult, "result");
        Object json = JSON.toJSON(hTTPRequestResponseResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }

    @Override // tb.xbc
    public void d1(HTTPRequestFailResult hTTPRequestFailResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f729f15", new Object[]{this, hTTPRequestFailResult});
            return;
        }
        ckf.g(hTTPRequestFailResult, "result");
        Object json = JSON.toJSON(hTTPRequestFailResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFail"));
    }

    @Override // tb.xbc
    public void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onClose"));
        }
    }
}
