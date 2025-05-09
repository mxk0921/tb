package com.alibaba.ability.impl.speechrecognition;

import android.content.Context;
import com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.SpeechRecognitionBoxResult;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.ckf;
import tb.g1a;
import tb.gbq;
import tb.jbq;
import tb.qrd;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SpeechRecognitionAbility$start$1 extends Lambda implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $bizID;
    public final /* synthetic */ qrd $callback;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ jbq $params;
    public final /* synthetic */ SpeechRecognitionAbility this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeechRecognitionAbility$start$1(SpeechRecognitionAbility speechRecognitionAbility, Context context, String str, jbq jbqVar, qrd qrdVar) {
        super(1);
        this.this$0 = speechRecognitionAbility;
        this.$context = context;
        this.$bizID = str;
        this.$params = jbqVar;
        this.$callback = qrdVar;
    }

    public static /* synthetic */ Object ipc$super(SpeechRecognitionAbility$start$1 speechRecognitionAbility$start$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/speechrecognition/SpeechRecognitionAbility$start$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
        } else if (z) {
            SpeechRecognizer access$getSpeechRecognizer$p = SpeechRecognitionAbility.access$getSpeechRecognizer$p(this.this$0);
            if (access$getSpeechRecognizer$p != null) {
                access$getSpeechRecognizer$p.l();
            }
            SpeechRecognitionAbility speechRecognitionAbility = this.this$0;
            Context context = this.$context;
            String str = this.$bizID;
            SpeechRecognizer.b bVar = new SpeechRecognizer.b(null, null, null, null, null, 31, null);
            bVar.g(this.$params.b);
            xhv xhvVar = xhv.INSTANCE;
            SpeechRecognizer speechRecognizer = new SpeechRecognizer(context, str, bVar, new a());
            speechRecognizer.k();
            SpeechRecognitionAbility.access$setSpeechRecognizer$p(speechRecognitionAbility, speechRecognizer);
        } else {
            this.$callback.O(new ErrorResult("NO_MIC_PERMISSION", "Permission AUDIO Required", (Map) null, 4, (a07) null));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements SpeechRecognizer.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer.c
        public void b(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18b22937", new Object[]{this, str, new Boolean(z)});
                return;
            }
            SpeechRecognitionAbility$start$1 speechRecognitionAbility$start$1 = SpeechRecognitionAbility$start$1.this;
            if (speechRecognitionAbility$start$1.$params.f21905a || z) {
                qrd qrdVar = speechRecognitionAbility$start$1.$callback;
                SpeechRecognitionBoxResult speechRecognitionBoxResult = new SpeechRecognitionBoxResult();
                speechRecognitionBoxResult.text = str;
                speechRecognitionBoxResult.isFinal = Boolean.valueOf(z);
                xhv xhvVar = xhv.INSTANCE;
                qrdVar.o(speechRecognitionBoxResult);
            }
        }

        @Override // com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer.c
        public void onEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efc72903", new Object[]{this});
            } else {
                SpeechRecognitionAbility$start$1.this.$callback.onEnd();
            }
        }

        @Override // com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer.c
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else {
                SpeechRecognitionAbility$start$1.this.$callback.onStart();
            }
        }

        @Override // com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer.c
        public void onVoiceVolume(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b78c1fef", new Object[]{this, new Integer(i)});
            } else {
                SpeechRecognitionAbility$start$1.this.$callback.I(i);
            }
        }

        @Override // com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer.c
        public void a(SpeechRecognizer.SpeechRecognizerError speechRecognizerError, String str) {
            ErrorResult errorResult;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98963c47", new Object[]{this, speechRecognizerError, str});
                return;
            }
            ckf.g(speechRecognizerError, "type");
            qrd qrdVar = SpeechRecognitionAbility$start$1.this.$callback;
            int i = gbq.$EnumSwitchMapping$0[speechRecognizerError.ordinal()];
            if (i == 1) {
                errorResult = new ErrorResult("NO_MIC_PERMISSION", "Permission AUDIO Required", (Map) null, 4, (a07) null);
            } else if (i != 2) {
                errorResult = new ErrorResult("TASK_EXCEPTION", "Voice Processing Task Error. Code: " + speechRecognizerError + ", Msg: " + str, (Map) null, 4, (a07) null);
            } else {
                errorResult = new ErrorResult("CAN_NOT_GET_TOKEN", "Token Acquisition Failed", (Map) null, 4, (a07) null);
            }
            qrdVar.O(errorResult);
        }
    }
}
