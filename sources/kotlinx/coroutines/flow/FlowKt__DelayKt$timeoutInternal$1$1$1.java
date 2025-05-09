package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.e;
import tb.ar4;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/e;", "value", "", "<anonymous>", "(Lkotlinx/coroutines/channels/e;)Z"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {404}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements u1a<e<Object>, ar4<? super Boolean>, Object> {
    final /* synthetic */ sp9<Object> $downStream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(sp9<Object> sp9Var, ar4<? super FlowKt__DelayKt$timeoutInternal$1$1$1> ar4Var) {
        super(2, ar4Var);
        this.$downStream = sp9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, ar4Var);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ Object invoke(e<Object> eVar, ar4<? super Boolean> ar4Var) {
        return m1121invokeWpGqRn0(eVar.j(), ar4Var);
    }

    /* renamed from: invoke-WpGqRn0  reason: not valid java name */
    public final Object m1121invokeWpGqRn0(Object obj, ar4<? super Boolean> ar4Var) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(e.a(obj), ar4Var)).invokeSuspend(xhv.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r0 = r4.L$0
            kotlin.b.b(r5)
            goto L_0x0036
        L_0x0011:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0019:
            kotlin.b.b(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.e) r5
            java.lang.Object r5 = r5.j()
            tb.sp9<java.lang.Object> r1 = r4.$downStream
            boolean r3 = r5 instanceof kotlinx.coroutines.channels.e.c
            if (r3 != 0) goto L_0x0037
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r1 = r1.emit(r5, r4)
            if (r1 != r0) goto L_0x0035
            return r0
        L_0x0035:
            r0 = r5
        L_0x0036:
            r5 = r0
        L_0x0037:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.e.a
            if (r0 == 0) goto L_0x0045
            kotlinx.coroutines.channels.e.c(r5)
            r5 = 0
            java.lang.Boolean r5 = tb.gk2.a(r5)
            return r5
        L_0x0045:
            java.lang.Boolean r5 = tb.gk2.a(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
