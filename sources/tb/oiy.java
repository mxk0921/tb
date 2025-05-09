package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FileCommonResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class oiy extends mx6 implements p6c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336919);
        t2o.a(525337045);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oiy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(oiy oiyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/FileCommonEventsImpl");
    }

    @Override // tb.p6c
    public void s1(FileCommonResult fileCommonResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fedb21", new Object[]{this, fileCommonResult});
            return;
        }
        ckf.g(fileCommonResult, "result");
        Object json = JSON.toJSON(fileCommonResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onData"));
    }
}
