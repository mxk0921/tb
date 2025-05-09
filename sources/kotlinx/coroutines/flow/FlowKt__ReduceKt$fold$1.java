package kotlinx.coroutines.flow;

import com.taobao.artc.internal.ArtcParams;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import tb.ar4;
import tb.ytc;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = ytc.TYPE_FOLD, n = {"accumulator"}, s = {"L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__ReduceKt$fold$1<T, R> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ReduceKt$fold$1(ar4<? super FlowKt__ReduceKt$fold$1> ar4Var) {
        super(ar4Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.e(null, null, null, this);
    }
}
