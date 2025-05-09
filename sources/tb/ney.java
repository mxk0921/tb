package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AliUploadServiceCompleteResult;
import com.taobao.android.abilityidl.ability.AliUploadServiceProgressResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ney extends mx6 implements jfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336707);
        t2o.a(525337001);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ney(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ney neyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AliUploadServiceUploaderEventsImpl");
    }

    @Override // tb.jfb
    public void X(AliUploadServiceProgressResult aliUploadServiceProgressResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db51ce8", new Object[]{this, aliUploadServiceProgressResult});
            return;
        }
        ckf.g(aliUploadServiceProgressResult, "result");
        Object json = JSON.toJSON(aliUploadServiceProgressResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onProgress"));
    }

    @Override // tb.jfb
    public void g0(AliUploadServiceCompleteResult aliUploadServiceCompleteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be68b68", new Object[]{this, aliUploadServiceCompleteResult});
            return;
        }
        ckf.g(aliUploadServiceCompleteResult, "result");
        Object json = JSON.toJSON(aliUploadServiceCompleteResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onComplete"));
    }

    @Override // tb.jfb
    public void onCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d4540", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onCancel"));
        }
    }
}
