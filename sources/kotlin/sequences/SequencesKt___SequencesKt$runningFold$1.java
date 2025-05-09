package kotlin.sequences;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ar4;
import tb.sbp;
import tb.u1a;
import tb.vbp;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ltb/vbp;", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {2311, 2315}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements u1a<vbp<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ Object $initial;
    final /* synthetic */ u1a<Object, Object, Object> $operation;
    final /* synthetic */ sbp<Object> $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFold$1(Object obj, sbp<Object> sbpVar, u1a<Object, Object, Object> u1aVar, ar4<? super SequencesKt___SequencesKt$runningFold$1> ar4Var) {
        super(2, ar4Var);
        this.$initial = obj;
        this.$this_runningFold = sbpVar;
        this.$operation = u1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, ar4Var);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0068 -> B:7:0x001b). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r6.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r6.L$1
            java.lang.Object r4 = r6.L$0
            tb.vbp r4 = (tb.vbp) r4
            kotlin.b.b(r7)
        L_0x001b:
            r7 = r3
            goto L_0x004c
        L_0x001d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0025:
            java.lang.Object r1 = r6.L$0
            tb.vbp r1 = (tb.vbp) r1
            kotlin.b.b(r7)
            goto L_0x0042
        L_0x002d:
            kotlin.b.b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            tb.vbp r1 = (tb.vbp) r1
            java.lang.Object r7 = r6.$initial
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L_0x0042
            return r0
        L_0x0042:
            java.lang.Object r7 = r6.$initial
            tb.sbp<java.lang.Object> r3 = r6.$this_runningFold
            java.util.Iterator r3 = r3.iterator()
            r4 = r1
            r1 = r3
        L_0x004c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r1.next()
            tb.u1a<java.lang.Object, java.lang.Object, java.lang.Object> r5 = r6.$operation
            java.lang.Object r3 = r5.invoke(r7, r3)
            r6.L$0 = r4
            r6.L$1 = r3
            r6.L$2 = r1
            r6.label = r2
            java.lang.Object r7 = r4.a(r3, r6)
            if (r7 != r0) goto L_0x001b
            return r0
        L_0x006b:
            tb.xhv r7 = tb.xhv.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(vbp<Object> vbpVar, ar4<? super xhv> ar4Var) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
