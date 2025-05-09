package com.taobao.themis.kernel.solution;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.twd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSBaseSolution$mRenderFactory$2 extends Lambda implements d1a<twd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSBaseSolution this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSBaseSolution$mRenderFactory$2(TMSBaseSolution tMSBaseSolution) {
        super(0);
        this.this$0 = tMSBaseSolution;
    }

    public static /* synthetic */ Object ipc$super(TMSBaseSolution$mRenderFactory$2 tMSBaseSolution$mRenderFactory$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/solution/TMSBaseSolution$mRenderFactory$2");
    }

    @Override // tb.d1a
    public final twd invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (twd) ipChange.ipc$dispatch("6264ac7f", new Object[]{this}) : this.this$0.createRenderFactory();
    }
}
