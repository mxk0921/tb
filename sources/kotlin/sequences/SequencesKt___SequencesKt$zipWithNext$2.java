package kotlin.sequences;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ar4;
import tb.pg1;
import tb.sbp;
import tb.u1a;
import tb.vbp;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ltb/vbp;", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2873}, m = "invokeSuspend", n = {"$this$result", pg1.ATOM_EXT_iterator, "next"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements u1a<vbp<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ sbp<Object> $this_zipWithNext;
    final /* synthetic */ u1a<Object, Object, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$zipWithNext$2(sbp<Object> sbpVar, u1a<Object, Object, Object> u1aVar, ar4<? super SequencesKt___SequencesKt$zipWithNext$2> ar4Var) {
        super(2, ar4Var);
        this.$this_zipWithNext = sbpVar;
        this.$transform = u1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, ar4Var);
        sequencesKt___SequencesKt$zipWithNext$2.L$0 = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:6:0x0018). Please submit an issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.Object r1 = r6.L$2
            java.lang.Object r3 = r6.L$1
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r6.L$0
            tb.vbp r4 = (tb.vbp) r4
            kotlin.b.b(r7)
        L_0x0018:
            r7 = r1
            goto L_0x003f
        L_0x001a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0022:
            kotlin.b.b(r7)
            java.lang.Object r7 = r6.L$0
            tb.vbp r7 = (tb.vbp) r7
            tb.sbp<java.lang.Object> r1 = r6.$this_zipWithNext
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L_0x0038
            tb.xhv r7 = tb.xhv.INSTANCE
            return r7
        L_0x0038:
            java.lang.Object r3 = r1.next()
            r4 = r7
            r7 = r3
            r3 = r1
        L_0x003f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r3.next()
            tb.u1a<java.lang.Object, java.lang.Object, java.lang.Object> r5 = r6.$transform
            java.lang.Object r7 = r5.invoke(r7, r1)
            r6.L$0 = r4
            r6.L$1 = r3
            r6.L$2 = r1
            r6.label = r2
            java.lang.Object r7 = r4.a(r7, r6)
            if (r7 != r0) goto L_0x0018
            return r0
        L_0x005e:
            tb.xhv r7 = tb.xhv.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(vbp<Object> vbpVar, ar4<? super xhv> ar4Var) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
