package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ContentCommissionCommitSuccResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bhy extends mx6 implements drb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336842);
        t2o.a(525337029);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(bhy bhyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContentCommissionCommitEventsImpl");
    }

    @Override // tb.drb
    public void T0(ContentCommissionCommitSuccResult contentCommissionCommitSuccResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff3eb6", new Object[]{this, contentCommissionCommitSuccResult});
            return;
        }
        ckf.g(contentCommissionCommitSuccResult, "result");
        Object json = JSON.toJSON(contentCommissionCommitSuccResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
