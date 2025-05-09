package com.taobao.android.abilitykit.mega;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.yji;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MegaHubBuilder$wrapper$2 extends Lambda implements d1a<yji> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MegaHubBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MegaHubBuilder$wrapper$2(MegaHubBuilder megaHubBuilder) {
        super(0);
        this.this$0 = megaHubBuilder;
    }

    public static /* synthetic */ Object ipc$super(MegaHubBuilder$wrapper$2 megaHubBuilder$wrapper$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/mega/MegaHubBuilder$wrapper$2");
    }

    @Override // tb.d1a
    public final yji invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (yji) ipChange.ipc$dispatch("3a278c12", new Object[]{this}) : new yji(null, MegaHubBuilder.c(this.this$0), MegaHubBuilder.b(this.this$0), MegaHubBuilder.a(this.this$0));
    }
}
