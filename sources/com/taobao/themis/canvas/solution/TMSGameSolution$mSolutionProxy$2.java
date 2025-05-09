package com.taobao.themis.canvas.solution;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.h9s;
import tb.pes;
import tb.v8c;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/v8c;", "invoke", "()Ltb/v8c;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSGameSolution$mSolutionProxy$2 extends Lambda implements d1a<v8c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSGameSolution this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSGameSolution$mSolutionProxy$2(TMSGameSolution tMSGameSolution) {
        super(0);
        this.this$0 = tMSGameSolution;
    }

    public static /* synthetic */ Object ipc$super(TMSGameSolution$mSolutionProxy$2 tMSGameSolution$mSolutionProxy$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/solution/TMSGameSolution$mSolutionProxy$2");
    }

    @Override // tb.d1a
    public final v8c invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v8c) ipChange.ipc$dispatch("b7d76a37", new Object[]{this});
        }
        if (TMSGameSolution.access$enableHighPerformanceMode(this.this$0)) {
            return new pes(TMSGameSolution.access$getMInstance$p(this.this$0));
        }
        return new h9s(TMSGameSolution.access$getMInstance$p(this.this$0));
    }
}
