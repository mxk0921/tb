package com.alibaba.ability.impl.audio.floatwindow;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AudioFloatWindow$initLayout$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ AudioFloatWindow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioFloatWindow$initLayout$1(AudioFloatWindow audioFloatWindow) {
        super(0);
        this.this$0 = audioFloatWindow;
    }

    public static /* synthetic */ Object ipc$super(AudioFloatWindow$initLayout$1 audioFloatWindow$initLayout$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/floatwindow/AudioFloatWindow$initLayout$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            AudioFloatWindow.access$expand(this.this$0);
        }
    }
}
