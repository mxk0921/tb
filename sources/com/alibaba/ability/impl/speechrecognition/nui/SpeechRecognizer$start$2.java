package com.alibaba.ability.impl.speechrecognition.nui;

import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.iih;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SpeechRecognizer$start$2 extends Lambda implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ SpeechRecognizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeechRecognizer$start$2(SpeechRecognizer speechRecognizer) {
        super(1);
        this.this$0 = speechRecognizer;
    }

    public static /* synthetic */ Object ipc$super(SpeechRecognizer$start$2 speechRecognizer$start$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/speechrecognition/nui/SpeechRecognizer$start$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(String str) {
        invoke2(str);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, str});
            return;
        }
        ckf.g(str, "token");
        if (SpeechRecognizer.c(this.this$0)) {
            SpeechRecognizer.e(this.this$0, str);
            SpeechRecognizerWithRecorder b = SpeechRecognizer.b(this.this$0);
            if (b != null) {
                b.start();
                return;
            }
            return;
        }
        iih.INSTANCE.a("MegaSpeechRecognizer", "get token success, but cancelled or stopped");
    }
}
