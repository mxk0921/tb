package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import tb.ar4;
import tb.dkf;
import tb.g1a;
import tb.s08;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements g1a<ar4<?>, Object> {
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j, ar4<? super FlowKt__DelayKt$timeoutInternal$1$1$2> ar4Var) {
        super(1, ar4Var);
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(ar4<?> ar4Var) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.$timeout, ar4Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dkf.d();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) s08.h0(this.$timeout)));
    }

    public final Object invoke(ar4<?> ar4Var) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
