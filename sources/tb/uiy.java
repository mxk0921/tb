package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FileUnzipResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class uiy extends mx6 implements w6c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336950);
        t2o.a(525337057);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uiy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(uiy uiyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/FileUnzipEventsImpl");
    }

    @Override // tb.w6c
    public void M(FileUnzipResult fileUnzipResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc356922", new Object[]{this, fileUnzipResult});
            return;
        }
        ckf.g(fileUnzipResult, "result");
        Object json = JSON.toJSON(fileUnzipResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onData"));
    }
}
