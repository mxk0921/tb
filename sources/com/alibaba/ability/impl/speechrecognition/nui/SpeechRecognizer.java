package com.alibaba.ability.impl.speechrecognition.nui;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.NlsSpeechClient;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorder;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorderCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import kotlin.Result;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.f0m;
import tb.f7l;
import tb.iih;
import tb.sm8;
import tb.t2o;
import tb.xhv;
import tb.zf4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SpeechRecognizer implements SpeechRecognizerWithRecorderCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f2042a;
    public NlsSpeechClient b;
    public SpeechRecognizerWithRecorder c;
    public final Context d;
    public final String e;
    public final b f;
    public final c g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum SpeechRecognizerError {
        GET_TOKEN_ERROR,
        SPEECH_RECOGNIZER_ERROR,
        NO_AUDIO_PERMISSION;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SpeechRecognizerError speechRecognizerError, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/speechrecognition/nui/SpeechRecognizer$SpeechRecognizerError");
        }

        public static SpeechRecognizerError valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("9ae1c7d6", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(SpeechRecognizerError.class, str);
            }
            return (SpeechRecognizerError) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(133169165);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f2043a;
        public Boolean b;
        public final Integer c;
        public final Integer d;
        public Boolean e;

        static {
            t2o.a(133169166);
        }

        public b() {
            this(null, null, null, null, null, 31, null);
        }

        public final Integer a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("2386e102", new Object[]{this});
            }
            return this.d;
        }

        public final Integer b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("31baab5b", new Object[]{this});
            }
            return this.c;
        }

        public final Boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("ce04ff68", new Object[]{this});
            }
            return this.e;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0d3462", new Object[]{this});
            }
            return this.f2043a;
        }

        public final Boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("73ac8bed", new Object[]{this});
            }
            return this.b;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (!ckf.b(this.f2043a, bVar.f2043a) || !ckf.b(this.b, bVar.b) || !ckf.b(this.c, bVar.c) || !ckf.b(this.d, bVar.d) || !ckf.b(this.e, bVar.e)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final void f(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("850f88ce", new Object[]{this, bool});
            } else {
                this.e = bool;
            }
        }

        public final void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2537cc54", new Object[]{this, str});
            } else {
                this.f2043a = str;
            }
        }

        public final void h(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bde2ed51", new Object[]{this, bool});
            } else {
                this.b = bool;
            }
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f2043a;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = i * 31;
            Boolean bool = this.b;
            if (bool != null) {
                i2 = bool.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            Integer num = this.c;
            if (num != null) {
                i3 = num.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            Integer num2 = this.d;
            if (num2 != null) {
                i4 = num2.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            Boolean bool2 = this.e;
            if (bool2 != null) {
                i5 = bool2.hashCode();
            }
            return i9 + i5;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Param(vocabularyID=" + this.f2043a + ", voiceDetection=" + this.b + ", maxStartSilence=" + this.c + ", maxEndSilence=" + this.d + ", punctuation=" + this.e + f7l.BRACKET_END_STR;
        }

        public b(String str, Boolean bool, Integer num, Integer num2, Boolean bool2) {
            this.f2043a = str;
            this.b = bool;
            this.c = num;
            this.d = num2;
            this.e = bool2;
        }

        public /* synthetic */ b(String str, Boolean bool, Integer num, Integer num2, Boolean bool2, int i, a07 a07Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : bool2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(133169169);
            }

            public static /* synthetic */ void a(c cVar, String str, boolean z, int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("195deeac", new Object[]{cVar, str, new Boolean(z), new Integer(i), obj});
                } else if (obj == null) {
                    if ((i & 2) != 0) {
                        z = false;
                    }
                    cVar.b(str, z);
                } else {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onText");
                }
            }
        }

        void a(SpeechRecognizerError speechRecognizerError, String str);

        void b(String str, boolean z);

        void onEnd();

        void onStart();

        void onVoiceVolume(int i);
    }

    static {
        t2o.a(133169164);
        t2o.a(199229474);
    }

    public SpeechRecognizer(Context context, String str, b bVar, c cVar) {
        ckf.g(context, "context");
        ckf.g(str, "bizId");
        ckf.g(cVar, DataReceiveMonitor.CB_LISTENER);
        this.d = context;
        this.e = str;
        this.f = bVar;
        this.g = cVar;
    }

    public static final /* synthetic */ c a(SpeechRecognizer speechRecognizer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("738a0d0f", new Object[]{speechRecognizer});
        }
        return speechRecognizer.g;
    }

    public static final /* synthetic */ SpeechRecognizerWithRecorder b(SpeechRecognizer speechRecognizer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpeechRecognizerWithRecorder) ipChange.ipc$dispatch("1987f2e", new Object[]{speechRecognizer});
        }
        return speechRecognizer.c;
    }

    public static final /* synthetic */ boolean c(SpeechRecognizer speechRecognizer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("201daf11", new Object[]{speechRecognizer})).booleanValue();
        }
        return speechRecognizer.f2042a;
    }

    public static final /* synthetic */ String d(SpeechRecognizer speechRecognizer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fc166b5", new Object[]{speechRecognizer, str});
        }
        return speechRecognizer.h(str);
    }

    public static final /* synthetic */ void e(SpeechRecognizer speechRecognizer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c24cbe", new Object[]{speechRecognizer, str});
        } else {
            speechRecognizer.i(str);
        }
    }

    public static final /* synthetic */ void f(SpeechRecognizer speechRecognizer, d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f41ffc0", new Object[]{speechRecognizer, d1aVar});
        } else {
            speechRecognizer.j(d1aVar);
        }
    }

    public static final /* synthetic */ void g(SpeechRecognizer speechRecognizer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e9dedb", new Object[]{speechRecognizer, new Boolean(z)});
        } else {
            speechRecognizer.f2042a = z;
        }
    }

    public final String h(String str) {
        Object obj;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("844d1f2c", new Object[]{this, str});
        }
        String str2 = null;
        try {
            JSONObject parseObject = JSON.parseObject(str);
            obj = Result.m1108constructorimpl((parseObject == null || (jSONObject = parseObject.getJSONObject("payload")) == null) ? null : jSONObject.getString("result"));
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            iih.INSTANCE.a("MegaSpeechRecognizer", "get text result error: ".concat(sm8.b(th2)));
        }
        if (!Result.m1114isFailureimpl(obj)) {
            str2 = obj;
        }
        return str2;
    }

    public final synchronized void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
            return;
        }
        NlsSpeechClient instance = NlsSpeechClient.getInstance("wss://nls-gateway.cn-shanghai.aliyuncs.com/ws/v1", str);
        this.b = instance;
        this.c = instance != null ? instance.createRecognizerWithRecorder(this) : null;
        m(str);
    }

    public final void j(d1a<xhv> d1aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ac77f9", new Object[]{this, d1aVar});
            return;
        }
        try {
            d1aVar.invoke();
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            iih.INSTANCE.a("MegaSpeechRecognizer", "call error: ".concat(sm8.b(th2)));
        }
    }

    public final synchronized void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.c;
        if (speechRecognizerWithRecorder != null) {
            speechRecognizerWithRecorder.stop();
        }
        this.b = null;
        this.c = null;
        this.f2042a = false;
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onChannelClosed(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c4a3e2", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.f2042a = false;
        l();
        j(new SpeechRecognizer$onChannelClosed$1(this));
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedCompleted(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f88dc", new Object[]{this, str, new Integer(i)});
        } else {
            j(new SpeechRecognizer$onRecognizedCompleted$1(this, str));
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedResultChanged(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a218b750", new Object[]{this, str, new Integer(i)});
        } else {
            j(new SpeechRecognizer$onRecognizedResultChanged$1(this, str));
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a57473", new Object[]{this});
        } else {
            j(new SpeechRecognizer$onRecognizedStarted$1(this));
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
        } else {
            j(new SpeechRecognizer$onVoiceVolume$1(this, i));
        }
    }

    public final synchronized void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!f0m.INSTANCE.a(this.d, "android.permission.RECORD_AUDIO")) {
            iih.INSTANCE.a("MegaSpeechRecognizer", "permission android.permission.RECORD_AUDIO required");
            j(new SpeechRecognizer$start$1(this));
        } else if (!this.f2042a) {
            this.f2042a = true;
            zf4.INSTANCE.c(this.d, this.e, new SpeechRecognizer$start$2(this), new SpeechRecognizer$start$3(this));
        }
    }

    public final void m(String str) {
        Integer a2;
        Integer b2;
        Boolean e;
        Boolean c2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca5b5bc", new Object[]{this, str});
            return;
        }
        NlsSpeechClient nlsSpeechClient = this.b;
        if (nlsSpeechClient != null) {
            nlsSpeechClient.setToken(str);
        }
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.c;
        if (speechRecognizerWithRecorder != null) {
            speechRecognizerWithRecorder.setAppKey(zf4.APP_KEY);
            speechRecognizerWithRecorder.setSampleRate(16000);
            speechRecognizerWithRecorder.enableIntermediateResult(true);
            speechRecognizerWithRecorder.setFormat("opu");
            speechRecognizerWithRecorder.setInverseTextNormalization(true);
            b bVar = this.f;
            speechRecognizerWithRecorder.enablePunctuation((bVar == null || (c2 = bVar.c()) == null) ? true : c2.booleanValue());
            b bVar2 = this.f;
            if (!(bVar2 == null || (e = bVar2.e()) == null)) {
                z = e.booleanValue();
            }
            speechRecognizerWithRecorder.enableVoiceDetection(z);
            b bVar3 = this.f;
            speechRecognizerWithRecorder.setMaxStartSilence((bVar3 == null || (b2 = bVar3.b()) == null) ? 3000 : b2.intValue());
            b bVar4 = this.f;
            speechRecognizerWithRecorder.setMaxEndSilence((bVar4 == null || (a2 = bVar4.a()) == null) ? 800 : a2.intValue());
            b bVar5 = this.f;
            if (bVar5 != null) {
                String d = bVar5.d();
                d = null;
                if (d == null || d.length() <= 0) {
                }
                speechRecognizerWithRecorder.setVocabularyId(d);
            }
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onTaskFailed(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea2f011", new Object[]{this, str, new Integer(i)});
            return;
        }
        iih iihVar = iih.INSTANCE;
        iihVar.a("MegaSpeechRecognizer", "onTaskFailed: code: " + i + ", msg: " + str);
        this.f2042a = false;
        l();
        zf4.INSTANCE.b(this.d);
        j(new SpeechRecognizer$onTaskFailed$1(this, i, str));
    }
}
