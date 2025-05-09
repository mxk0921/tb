package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.SpeechRecognitionBoxResult;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class awy extends mx6 implements qrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337521);
        t2o.a(525337157);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(awy awyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/SpeechRecognitionStartEventsImpl");
    }

    @Override // tb.qrd
    public void o(SpeechRecognitionBoxResult speechRecognitionBoxResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e75969b", new Object[]{this, speechRecognitionBoxResult});
            return;
        }
        ckf.g(speechRecognitionBoxResult, "result");
        Object json = JSON.toJSON(speechRecognitionBoxResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onRecognizedResult"));
    }

    @Override // tb.qrd
    public void onEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onEnd"));
        }
    }

    @Override // tb.qrd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onStart"));
        }
    }

    @Override // tb.qrd
    public void I(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a43213", new Object[]{this, new Integer(i)});
        } else {
            b().c(new FinishResult(new JSONObject(a.k(jpu.a("result", Integer.valueOf(i)))), "onVolumeChange"));
        }
    }
}
