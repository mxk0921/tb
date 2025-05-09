package com.alibaba.ability.impl.speechrecognition.nui;

import com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.iih;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SpeechRecognizer$start$3 extends Lambda implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ SpeechRecognizer this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer$start$3$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String $it;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$it = str;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/speechrecognition/nui/SpeechRecognizer$start$3$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                SpeechRecognizer.a(SpeechRecognizer$start$3.this.this$0).a(SpeechRecognizer.SpeechRecognizerError.GET_TOKEN_ERROR, this.$it);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeechRecognizer$start$3(SpeechRecognizer speechRecognizer) {
        super(1);
        this.this$0 = speechRecognizer;
    }

    public static /* synthetic */ Object ipc$super(SpeechRecognizer$start$3 speechRecognizer$start$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/speechrecognition/nui/SpeechRecognizer$start$3");
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
        ckf.g(str, AdvanceSetting.NETWORK_TYPE);
        SpeechRecognizer.g(this.this$0, false);
        iih.INSTANCE.a("MegaSpeechRecognizer", "get token fail, msg: ".concat(str));
        SpeechRecognizer.f(this.this$0, new AnonymousClass1(str));
    }
}
