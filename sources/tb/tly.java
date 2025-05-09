package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.LifeCyclePageLifeCycleEventParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tly extends mx6 implements akc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337244);
        t2o.a(525337069);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tly(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(tly tlyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/LifeCyclePageLifeCycleEventsImpl");
    }

    @Override // tb.akc
    public void G0(LifeCyclePageLifeCycleEventParams lifeCyclePageLifeCycleEventParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159e3770", new Object[]{this, lifeCyclePageLifeCycleEventParams});
            return;
        }
        ckf.g(lifeCyclePageLifeCycleEventParams, "result");
        Object json = JSON.toJSON(lifeCyclePageLifeCycleEventParams);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onPageDisappear"));
    }

    @Override // tb.akc
    public void X0(LifeCyclePageLifeCycleEventParams lifeCyclePageLifeCycleEventParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42a1c22", new Object[]{this, lifeCyclePageLifeCycleEventParams});
            return;
        }
        ckf.g(lifeCyclePageLifeCycleEventParams, "result");
        Object json = JSON.toJSON(lifeCyclePageLifeCycleEventParams);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onPageAppear"));
    }
}
