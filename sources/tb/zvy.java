package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.SpeechRecognitionResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zvy extends mx6 implements prd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337519);
        t2o.a(525337155);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(zvy zvyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/SpeechRecognitionShowPanelEventsImpl");
    }

    @Override // tb.prd
    public void n0(SpeechRecognitionResult speechRecognitionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ebe499", new Object[]{this, speechRecognitionResult});
            return;
        }
        ckf.g(speechRecognitionResult, "result");
        Object json = JSON.toJSON(speechRecognitionResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onData"));
    }
}
