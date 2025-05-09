package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.requests.NlsSpeechClient;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorder;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorderCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.SearchSdk;
import com.taobao.speech.util.NlsSpeechTokenResult;
import com.taobao.speech.util.NlsVoiceContentBean;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.TypeCastException;
import org.json.JSONTokener;
import tb.i5p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class w3k extends jy1 implements SpeechRecognizerWithRecorderCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public or7 c;
    public SpeechRecognizerWithRecorder d;
    public NlsSpeechClient i;
    public final AtomicBoolean e = new AtomicBoolean();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicInteger g = new AtomicInteger();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final int j = 3;

    public w3k() {
        SearchSdk.Companion.b();
    }

    public static final /* synthetic */ void f(w3k w3kVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd4ee30", new Object[]{w3kVar, str});
        } else {
            w3kVar.n(str);
        }
    }

    public static final /* synthetic */ AtomicBoolean g(w3k w3kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ad7dbabe", new Object[]{w3kVar});
        }
        return w3kVar.h;
    }

    public static final /* synthetic */ void h(w3k w3kVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba945fa", new Object[]{w3kVar, str, new Integer(i)});
        } else {
            w3kVar.r(str, i);
        }
    }

    public static /* synthetic */ Object ipc$super(w3k w3kVar, String str, Object... objArr) {
        if (str.hashCode() == 117275476) {
            super.c((WVCallBackContext) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/speech/util/NlsWvClientImplV2");
    }

    @Override // tb.jy1
    public void c(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd7b54", new Object[]{this, wVCallBackContext});
            return;
        }
        super.c(wVCallBackContext);
        String l = l();
        if (l == null) {
            q();
        } else {
            n(l);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.f22277a = false;
        if (this.f.get()) {
            u();
            this.f.set(false);
            SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.d;
            if (speechRecognizerWithRecorder != null) {
                speechRecognizerWithRecorder.cancel();
            }
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985c25cc", new Object[]{this});
        } else {
            v4p.e("nls_speech_token_v2", "");
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f.set(false);
        this.d = null;
        u();
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b69af29a", new Object[]{this});
        }
        String e = v4p.e("nls_speech_token_v2", "");
        if (!(e == null || e.length() == 0)) {
            try {
                try {
                    NlsSpeechTokenResult nlsSpeechTokenResult = (NlsSpeechTokenResult) JSON.parseObject(e, NlsSpeechTokenResult.class);
                    if (nlsSpeechTokenResult.getExpire() - (System.currentTimeMillis() / 1000) > m(43200L)) {
                        return nlsSpeechTokenResult.getToken();
                    }
                    return null;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final long m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ace0643", new Object[]{this, new Long(j)})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig(o4p.SEARCH_BIZ_NAME, "maxNlsSpeechExpire", "");
        return TextUtils.isEmpty(config) ? j : srl.g(config, j);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onChannelClosed(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c4a3e2", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.f.set(false);
        if ((!this.h.get() || this.g.get() >= this.j) && !this.e.compareAndSet(false, true)) {
            this.e.set(false);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedCompleted(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f88dc", new Object[]{this, str, new Integer(i)});
            return;
        }
        StringBuilder sb = new StringBuilder("onRecognizedResultCompleted:");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        if (this.e.compareAndSet(false, true) && this.f22277a) {
            d(i, p(str).getPayload());
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedResultChanged(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a218b750", new Object[]{this, str, new Integer(i)});
            return;
        }
        StringBuilder sb = new StringBuilder("onRecognizedResultChanged:");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        d(i, p(str).getPayload());
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a57473", new Object[]{this});
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onTaskFailed(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea2f011", new Object[]{this, str, new Integer(i)});
        } else if (i == 1002 && str != null && wsq.O(str, "403", false, 2, null)) {
            r(str, i);
        } else {
            a(i);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallback
    public void onVoiceData(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc515b8", new Object[]{this, bArr, new Integer(i)});
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallback
    public void onVoiceVolume(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78c1fef", new Object[]{this, new Integer(i)});
            return;
        }
        new StringBuilder("Callback not implement; onVoiceVolume ").append(i);
        HashMap hashMap = new HashMap();
        hashMap.put(Constant.PROP_TTS_VOLUME, String.valueOf(i) + "");
        hashMap.put("status", "1");
        hashMap.put("message", "On VoiceVolume");
        b("TBNlsVoiceRecognizer.Event.onVoiceVolume", JSON.toJSONString(hashMap));
    }

    public final NlsVoiceContentBean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NlsVoiceContentBean) ipChange.ipc$dispatch("e5eefac7", new Object[]{this, str});
        }
        NlsVoiceContentBean nlsVoiceContentBean = new NlsVoiceContentBean();
        if (str != null) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                Object obj = parseObject.get("header");
                Object obj2 = null;
                if (!(obj instanceof JSONObject)) {
                    obj = null;
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    String string = jSONObject.getString("task_id");
                    String str2 = "";
                    if (string == null) {
                        string = str2;
                    }
                    nlsVoiceContentBean.setTaskId(string);
                    String string2 = jSONObject.getString(Constant.PROP_MESSAGE_ID);
                    if (string2 == null) {
                        string2 = str2;
                    }
                    nlsVoiceContentBean.setMessageId(string2);
                    nlsVoiceContentBean.setStatus(jSONObject.getLongValue("status"));
                    String string3 = jSONObject.getString("namespace");
                    if (string3 != null) {
                        str2 = string3;
                    }
                    nlsVoiceContentBean.setNamespace(str2);
                    Object obj3 = parseObject.get("payload");
                    if (obj3 instanceof JSONObject) {
                        obj2 = obj3;
                    }
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    if (jSONObject2 != null) {
                        String string4 = jSONObject2.getString("result");
                        ckf.c(string4, "payload.getString(\"result\")");
                        nlsVoiceContentBean.setResult(string4);
                        String json = jSONObject2.toString();
                        ckf.c(json, "payload.toString()");
                        nlsVoiceContentBean.setPayload(json);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return nlsVoiceContentBean;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("650f8cf8", new Object[]{this});
            return;
        }
        u();
        this.c = new i5p.c().c(new n8u("30830", "nls_speech_token")).b(new p3k()).a().e().j().n(new u3k(this), new v3k(this, "speechToken"));
    }

    public final void r(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b15d341", new Object[]{this, str, new Integer(i)});
        } else if (this.h.compareAndSet(false, true)) {
            j();
            if (this.g.get() >= this.j) {
                this.h.set(false);
                a(i);
                return;
            }
            this.g.incrementAndGet();
            q();
        }
    }

    public boolean s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a37a977", new Object[]{this, str})).booleanValue();
        }
        this.f22277a = true;
        o(this.d, str);
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.d;
        if (speechRecognizerWithRecorder != null && this.f.compareAndSet(false, true)) {
            this.e.getAndSet(false);
            speechRecognizerWithRecorder.start();
        }
        return true;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.f.get()) {
            this.f.set(false);
            u();
            SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.d;
            if (speechRecognizerWithRecorder != null) {
                speechRecognizerWithRecorder.stop();
            }
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d19c978", new Object[]{this});
            return;
        }
        or7 or7Var = this.c;
        if (or7Var != null && !or7Var.isDisposed()) {
            or7Var.dispose();
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aced4c9", new Object[]{this, str});
            return;
        }
        if (this.i == null) {
            this.i = NlsSpeechClient.getInstance("wss://nls-gateway.cn-shanghai.aliyuncs.com/ws/v1", str);
        }
        NlsSpeechClient nlsSpeechClient = this.i;
        if (nlsSpeechClient != null) {
            nlsSpeechClient.setToken(str);
        }
        NlsSpeechClient nlsSpeechClient2 = this.i;
        SpeechRecognizerWithRecorder createRecognizerWithRecorder = nlsSpeechClient2 != null ? nlsSpeechClient2.createRecognizerWithRecorder(this) : null;
        this.d = createRecognizerWithRecorder;
        if (createRecognizerWithRecorder != null) {
            createRecognizerWithRecorder.setAppKey("3qjVsFYlHINwVNll");
            createRecognizerWithRecorder.setSampleRate(16000);
            createRecognizerWithRecorder.enableIntermediateResult(true);
            createRecognizerWithRecorder.enableVoiceDetection(false);
            createRecognizerWithRecorder.setFormat("opu");
            createRecognizerWithRecorder.setInverseTextNormalization(false);
            createRecognizerWithRecorder.setMaxStartSilence(3000);
            createRecognizerWithRecorder.setMaxEndSilence(3000);
            this.h.set(false);
        }
    }

    public final void o(SpeechRecognizerWithRecorder speechRecognizerWithRecorder, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a351bdb7", new Object[]{this, speechRecognizerWithRecorder, str});
        } else if (speechRecognizerWithRecorder != null) {
            try {
                Object nextValue = new JSONTokener(str).nextValue();
                if (nextValue != null) {
                    org.json.JSONObject jSONObject = (org.json.JSONObject) nextValue;
                    speechRecognizerWithRecorder.enableIntermediateResult(ckf.b(jSONObject.optString("enableIntermediateResult"), "true"));
                    if (!ckf.b(jSONObject.optString("enableVoiceDetection"), "true") && !jSONObject.optBoolean("recordAutoStop", false)) {
                        z = false;
                    }
                    speechRecognizerWithRecorder.enableVoiceDetection(z);
                    speechRecognizerWithRecorder.setVocabularyId(jSONObject.optString("asrVocabularyId", null));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type org.json.JSONObject");
            } catch (Throwable unused) {
            }
        }
    }
}
