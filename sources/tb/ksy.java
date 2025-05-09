package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.OpenContainerLoadAppInfoResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ksy extends mx6 implements p3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337347);
        t2o.a(525337091);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ksy ksyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/OpenContainerLoadAppInfoCallbackEventsImpl");
    }

    @Override // tb.p3d
    public void M0(OpenContainerLoadAppInfoResult openContainerLoadAppInfoResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcb5676", new Object[]{this, openContainerLoadAppInfoResult});
            return;
        }
        ckf.g(openContainerLoadAppInfoResult, "result");
        Object json = JSON.toJSON(openContainerLoadAppInfoResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onData"));
    }
}
