package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FileInfoResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qiy extends mx6 implements s6c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336929);
        t2o.a(525337049);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qiy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(qiy qiyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/FileInfoEventsImpl");
    }

    @Override // tb.s6c
    public void u(FileInfoResult fileInfoResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3540e7fe", new Object[]{this, fileInfoResult});
            return;
        }
        ckf.g(fileInfoResult, "result");
        Object json = JSON.toJSON(fileInfoResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onData"));
    }
}
