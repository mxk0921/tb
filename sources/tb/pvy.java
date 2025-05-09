package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class pvy extends mx6 implements ppd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337503);
        t2o.a(525337149);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(pvy pvyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/SharePannelOpenEventImpl");
    }

    @Override // tb.ppd
    public void onCancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44139f0a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "result");
        b().c(new FinishResult(new JSONObject(a.k(jpu.a("result", str))), "onCancel"));
    }

    @Override // tb.ppd
    public void onFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            return;
        }
        ckf.g(str, "result");
        b().c(new FinishResult(new JSONObject(a.k(jpu.a("result", str))), "onFail"));
    }

    @Override // tb.ppd
    public void onSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            return;
        }
        ckf.g(str, "result");
        b().c(new FinishResult(new JSONObject(a.k(jpu.a("result", str))), "onSuccess"));
    }
}
