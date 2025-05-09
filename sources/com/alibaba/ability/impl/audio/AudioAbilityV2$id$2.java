package com.alibaba.ability.impl.audio;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AudioAbilityV2$id$2 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ AudioAbilityV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioAbilityV2$id$2(AudioAbilityV2 audioAbilityV2) {
        super(0);
        this.this$0 = audioAbilityV2;
    }

    public static /* synthetic */ Object ipc$super(AudioAbilityV2$id$2 audioAbilityV2$id$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/AudioAbilityV2$id$2");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this}) : String.valueOf(this.this$0.hashCode());
    }
}
