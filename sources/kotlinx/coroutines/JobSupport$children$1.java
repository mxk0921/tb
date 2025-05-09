package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ar4;
import tb.u1a;
import tb.vbp;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/vbp;", "Lkotlinx/coroutines/m;", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {956, 958}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements u1a<vbp<? super m>, ar4<? super xhv>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JobSupport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, ar4<? super JobSupport$children$1> ar4Var) {
        super(2, ar4Var);
        this.this$0 = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, ar4Var);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:27:0x0082). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:27:0x0082). Please submit an issue!!! */
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
            if (r1 == 0) goto L_0x002a
            if (r1 == r3) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r6.L$1
            kotlinx.coroutines.internal.a r3 = (kotlinx.coroutines.internal.a) r3
            java.lang.Object r4 = r6.L$0
            tb.vbp r4 = (tb.vbp) r4
            kotlin.b.b(r7)
            goto L_0x0082
        L_0x001e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0026:
            kotlin.b.b(r7)
            goto L_0x0087
        L_0x002a:
            kotlin.b.b(r7)
            java.lang.Object r7 = r6.L$0
            tb.vbp r7 = (tb.vbp) r7
            kotlinx.coroutines.JobSupport r1 = r6.this$0
            java.lang.Object r1 = r1.v0()
            boolean r4 = r1 instanceof tb.ir3
            if (r4 == 0) goto L_0x0048
            tb.ir3 r1 = (tb.ir3) r1
            tb.jr3 r1 = r1.h
            r6.label = r3
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L_0x0087
            return r0
        L_0x0048:
            boolean r3 = r1 instanceof tb.yse
            if (r3 == 0) goto L_0x0087
            tb.yse r1 = (tb.yse) r1
            tb.f5k r1 = r1.getList()
            if (r1 == 0) goto L_0x0087
            java.lang.Object r3 = r1.h()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            tb.ckf.e(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L_0x0064:
            boolean r7 = tb.ckf.b(r1, r3)
            if (r7 != 0) goto L_0x0087
            boolean r7 = r1 instanceof tb.ir3
            if (r7 == 0) goto L_0x0082
            r7 = r1
            tb.ir3 r7 = (tb.ir3) r7
            r6.L$0 = r4
            r6.L$1 = r3
            r6.L$2 = r1
            r6.label = r2
            tb.jr3 r7 = r7.h
            java.lang.Object r7 = r4.a(r7, r6)
            if (r7 != r0) goto L_0x0082
            return r0
        L_0x0082:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.i()
            goto L_0x0064
        L_0x0087:
            tb.xhv r7 = tb.xhv.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(vbp<? super m> vbpVar, ar4<? super xhv> ar4Var) {
        return ((JobSupport$children$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
