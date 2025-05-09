package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.DownloaderCompleteResult;
import com.taobao.android.abilityidl.ability.DownloaderProgressResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class uhy extends mx6 implements n0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336865);
        t2o.a(525337033);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(uhy uhyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/DownloaderEventsImpl");
    }

    @Override // tb.n0c
    public void N0(DownloaderCompleteResult downloaderCompleteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fcad389", new Object[]{this, downloaderCompleteResult});
            return;
        }
        ckf.g(downloaderCompleteResult, "result");
        Object json = JSON.toJSON(downloaderCompleteResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onComplete"));
    }

    @Override // tb.n0c
    public void onCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d4540", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onCancel"));
        }
    }

    @Override // tb.n0c
    public void w0(DownloaderProgressResult downloaderProgressResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51416c09", new Object[]{this, downloaderProgressResult});
            return;
        }
        ckf.g(downloaderProgressResult, "result");
        Object json = JSON.toJSON(downloaderProgressResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onProgress"));
    }
}
