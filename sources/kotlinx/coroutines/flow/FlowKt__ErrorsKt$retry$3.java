package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.sp9;
import tb.u1a;
import tb.xhv;
import tb.y1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Ltb/sp9;", "", "cause", "", "attempt", "", "<anonymous>", "(Ltb/sp9;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FlowKt__ErrorsKt$retry$3 extends SuspendLambda implements y1a<sp9<Object>, Throwable, Long, ar4<? super Boolean>, Object> {
    final /* synthetic */ u1a<Throwable, ar4<? super Boolean>, Object> $predicate;
    final /* synthetic */ long $retries;
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ErrorsKt$retry$3(long j, u1a<? super Throwable, ? super ar4<? super Boolean>, ? extends Object> u1aVar, ar4<? super FlowKt__ErrorsKt$retry$3> ar4Var) {
        super(4, ar4Var);
        this.$retries = j;
        this.$predicate = u1aVar;
    }

    @Override // tb.y1a
    public /* bridge */ /* synthetic */ Object invoke(sp9<Object> sp9Var, Throwable th, Long l, ar4<? super Boolean> ar4Var) {
        return invoke(sp9Var, th, l.longValue(), ar4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L_0x003b;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r2) goto L_0x000f
            kotlin.b.b(r8)
            goto L_0x0031
        L_0x000f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0017:
            kotlin.b.b(r8)
            java.lang.Object r8 = r7.L$0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            long r3 = r7.J$0
            long r5 = r7.$retries
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x003a
            tb.u1a<java.lang.Throwable, tb.ar4<? super java.lang.Boolean>, java.lang.Object> r1 = r7.$predicate
            r7.label = r2
            java.lang.Object r8 = r1.invoke(r8, r7)
            if (r8 != r0) goto L_0x0031
            return r0
        L_0x0031:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            java.lang.Boolean r8 = tb.gk2.a(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(sp9<Object> sp9Var, Throwable th, long j, ar4<? super Boolean> ar4Var) {
        FlowKt__ErrorsKt$retry$3 flowKt__ErrorsKt$retry$3 = new FlowKt__ErrorsKt$retry$3(this.$retries, this.$predicate, ar4Var);
        flowKt__ErrorsKt$retry$3.L$0 = th;
        flowKt__ErrorsKt$retry$3.J$0 = j;
        return flowKt__ErrorsKt$retry$3.invokeSuspend(xhv.INSTANCE);
    }
}
