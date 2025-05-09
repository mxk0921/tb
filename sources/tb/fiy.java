package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ExecutorBatchExecuteResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fiy extends mx6 implements y3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336896);
        t2o.a(525337039);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fiy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(fiy fiyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ExecutorFinishEventsImpl");
    }

    @Override // tb.y3c
    public void d0(ExecutorBatchExecuteResult executorBatchExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f7c63", new Object[]{this, executorBatchExecuteResult});
            return;
        }
        ckf.g(executorBatchExecuteResult, "result");
        Object json = JSON.toJSON(executorBatchExecuteResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFinish"));
    }
}
