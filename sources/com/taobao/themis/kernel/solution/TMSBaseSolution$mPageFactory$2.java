package com.taobao.themis.kernel.solution;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.bbs;
import tb.d1a;
import tb.rwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSBaseSolution$mPageFactory$2 extends Lambda implements d1a<rwd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ bbs $instance;
    public final /* synthetic */ TMSBaseSolution this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSBaseSolution$mPageFactory$2(TMSBaseSolution tMSBaseSolution, bbs bbsVar) {
        super(0);
        this.this$0 = tMSBaseSolution;
        this.$instance = bbsVar;
    }

    public static /* synthetic */ Object ipc$super(TMSBaseSolution$mPageFactory$2 tMSBaseSolution$mPageFactory$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/solution/TMSBaseSolution$mPageFactory$2");
    }

    @Override // tb.d1a
    public final rwd invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rwd) ipChange.ipc$dispatch("d0c6a04a", new Object[]{this}) : this.this$0.createPageFactory(this.$instance);
    }
}
