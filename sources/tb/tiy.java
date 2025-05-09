package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FileRenameFileResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tiy extends mx6 implements v6c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336944);
        t2o.a(525337055);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(tiy tiyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/FileRenameFileEventsImpl");
    }

    @Override // tb.v6c
    public void v0(FileRenameFileResult fileRenameFileResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a22792", new Object[]{this, fileRenameFileResult});
            return;
        }
        ckf.g(fileRenameFileResult, "result");
        Object json = JSON.toJSON(fileRenameFileResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onData"));
    }
}
