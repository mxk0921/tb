package kotlin.sequences;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ar4;
import tb.sbp;
import tb.u1a;
import tb.vbp;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ltb/vbp;", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2339, 2344}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, s = {"L$0", "L$0", "L$1", "I$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements u1a<vbp<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ Object $initial;
    final /* synthetic */ w1a<Integer, Object, Object, Object> $operation;
    final /* synthetic */ sbp<Object> $this_runningFoldIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningFoldIndexed$1(Object obj, sbp<Object> sbpVar, w1a<? super Integer, Object, Object, Object> w1aVar, ar4<? super SequencesKt___SequencesKt$runningFoldIndexed$1> ar4Var) {
        super(2, ar4Var);
        this.$initial = obj;
        this.$this_runningFoldIndexed = sbpVar;
        this.$operation = w1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, ar4Var);
        sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r8.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0030
            if (r1 == r2) goto L_0x0028
            if (r1 != r3) goto L_0x0020
            int r1 = r8.I$0
            java.lang.Object r2 = r8.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r8.L$1
            java.lang.Object r5 = r8.L$0
            tb.vbp r5 = (tb.vbp) r5
            kotlin.b.b(r9)
            r9 = r4
            r4 = r1
            goto L_0x004f
        L_0x0020:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0028:
            java.lang.Object r1 = r8.L$0
            tb.vbp r1 = (tb.vbp) r1
            kotlin.b.b(r9)
            goto L_0x0045
        L_0x0030:
            kotlin.b.b(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            tb.vbp r1 = (tb.vbp) r1
            java.lang.Object r9 = r8.$initial
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r9 = r1.a(r9, r8)
            if (r9 != r0) goto L_0x0045
            return r0
        L_0x0045:
            java.lang.Object r9 = r8.$initial
            tb.sbp<java.lang.Object> r2 = r8.$this_runningFoldIndexed
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
            r5 = r1
        L_0x004f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r2.next()
            tb.w1a<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object> r6 = r8.$operation
            int r7 = r4 + 1
            if (r4 < 0) goto L_0x007b
            java.lang.Integer r4 = tb.gk2.b(r4)
            java.lang.Object r4 = r6.invoke(r4, r9, r1)
            r8.L$0 = r5
            r8.L$1 = r4
            r8.L$2 = r2
            r8.I$0 = r7
            r8.label = r3
            java.lang.Object r9 = r5.a(r4, r8)
            if (r9 != r0) goto L_0x0078
            return r0
        L_0x0078:
            r9 = r4
            r4 = r7
            goto L_0x004f
        L_0x007b:
            tb.yz3.p()
            r9 = 0
            throw r9
        L_0x0080:
            tb.xhv r9 = tb.xhv.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(vbp<Object> vbpVar, ar4<? super xhv> ar4Var) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
