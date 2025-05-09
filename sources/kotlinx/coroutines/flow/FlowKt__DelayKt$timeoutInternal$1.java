package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.pg1;
import tb.qp9;
import tb.sp9;
import tb.uu4;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ltb/uu4;", "Ltb/sp9;", "downStream", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;Ltb/sp9;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {TypedValues.CycleType.TYPE_WAVE_OFFSET}, m = "invokeSuspend", n = {"downStream", pg1.ATOM_values}, s = {"L$0", "L$1"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FlowKt__DelayKt$timeoutInternal$1 extends SuspendLambda implements w1a<uu4, sp9<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ qp9<Object> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1(long j, qp9<Object> qp9Var, ar4<? super FlowKt__DelayKt$timeoutInternal$1> ar4Var) {
        super(3, ar4Var);
        this.$timeout = j;
        this.$this_timeoutInternal = qp9Var;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0074 -> B:14:0x0077). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r9.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            long r4 = r9.J$0
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r6 = r9.L$0
            tb.sp9 r6 = (tb.sp9) r6
            kotlin.b.b(r10)
            goto L_0x0077
        L_0x001a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0022:
            kotlin.b.b(r10)
            java.lang.Object r10 = r9.L$0
            tb.uu4 r10 = (tb.uu4) r10
            java.lang.Object r1 = r9.L$1
            tb.sp9 r1 = (tb.sp9) r1
            long r4 = r9.$timeout
            tb.s08$a r6 = tb.s08.Companion
            long r6 = r6.c()
            int r4 = tb.s08.i(r4, r6)
            if (r4 <= 0) goto L_0x0082
            tb.qp9<java.lang.Object> r4 = r9.$this_timeoutInternal
            r5 = 0
            r6 = 2
            tb.qp9 r4 = tb.yp9.c(r4, r5, r3, r6, r3)
            kotlinx.coroutines.channels.ReceiveChannel r10 = tb.yp9.B(r4, r10)
            long r4 = r9.$timeout
            r6 = r1
            r1 = r10
        L_0x004b:
            kotlinx.coroutines.selects.SelectImplementation r10 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.d r7 = r9.getContext()
            r10.<init>(r7)
            tb.f9p r7 = r1.n()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r8.<init>(r6, r3)
            r10.s(r7, r8)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r7 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r7.<init>(r4, r3)
            tb.nvk.b(r10, r4, r7)
            r9.L$0 = r6
            r9.L$1 = r1
            r9.J$0 = r4
            r9.label = r2
            java.lang.Object r10 = r10.o(r9)
            if (r10 != r0) goto L_0x0077
            return r0
        L_0x0077:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x004b
            tb.xhv r10 = tb.xhv.INSTANCE
            return r10
        L_0x0082:
            kotlinx.coroutines.TimeoutCancellationException r10 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r0 = "Timed out immediately"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(uu4 uu4Var, sp9<Object> sp9Var, ar4<? super xhv> ar4Var) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.$timeout, this.$this_timeoutInternal, ar4Var);
        flowKt__DelayKt$timeoutInternal$1.L$0 = uu4Var;
        flowKt__DelayKt$timeoutInternal$1.L$1 = sp9Var;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(xhv.INSTANCE);
    }
}
