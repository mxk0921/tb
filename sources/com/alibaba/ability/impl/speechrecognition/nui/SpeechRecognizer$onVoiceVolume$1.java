package com.alibaba.ability.impl.speechrecognition.nui;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SpeechRecognizer$onVoiceVolume$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $volume;
    public final /* synthetic */ SpeechRecognizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeechRecognizer$onVoiceVolume$1(SpeechRecognizer speechRecognizer, int i) {
        super(0);
        this.this$0 = speechRecognizer;
        this.$volume = i;
    }

    public static /* synthetic */ Object ipc$super(SpeechRecognizer$onVoiceVolume$1 speechRecognizer$onVoiceVolume$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/speechrecognition/nui/SpeechRecognizer$onVoiceVolume$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            SpeechRecognizer.a(this.this$0).onVoiceVolume(this.$volume);
        }
    }
}
