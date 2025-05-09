package com.taobao.themis.kernel.solution;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.a9s;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSBaseSolution$mLauncher$2 extends Lambda implements d1a<a9s> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSBaseSolution this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSBaseSolution$mLauncher$2(TMSBaseSolution tMSBaseSolution) {
        super(0);
        this.this$0 = tMSBaseSolution;
    }

    public static /* synthetic */ Object ipc$super(TMSBaseSolution$mLauncher$2 tMSBaseSolution$mLauncher$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/solution/TMSBaseSolution$mLauncher$2");
    }

    @Override // tb.d1a
    public final a9s invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a9s) ipChange.ipc$dispatch("3f96df8", new Object[]{this}) : this.this$0.createLauncher();
    }
}
