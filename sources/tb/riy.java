package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FilePickerResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class riy extends mx6 implements t6c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336937);
        t2o.a(525337051);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public riy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(riy riyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/FilePickerEventsImpl");
    }

    @Override // tb.t6c
    public void l(FilePickerResult filePickerResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de7f859", new Object[]{this, filePickerResult});
            return;
        }
        ckf.g(filePickerResult, "result");
        Object json = JSON.toJSON(filePickerResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }

    @Override // tb.t6c
    public void onCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d4540", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onCancel"));
        }
    }
}
