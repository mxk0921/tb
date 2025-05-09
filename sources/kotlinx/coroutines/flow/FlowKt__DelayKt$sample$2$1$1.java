package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.e;
import tb.ar4;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/channels/e;", "", "result", "Ltb/xhv;", "<anonymous>", "(Lkotlinx/coroutines/channels/e;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements u1a<e<? extends Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    final /* synthetic */ ReceiveChannel<xhv> $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef<Object> ref$ObjectRef, ReceiveChannel<xhv> receiveChannel, ar4<? super FlowKt__DelayKt$sample$2$1$1> ar4Var) {
        super(2, ar4Var);
        this.$lastValue = ref$ObjectRef;
        this.$ticker = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, ar4Var);
        flowKt__DelayKt$sample$2$1$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ Object invoke(e<? extends Object> eVar, ar4<? super xhv> ar4Var) {
        return m1120invokeWpGqRn0(eVar.j(), ar4Var);
    }

    /* renamed from: invoke-WpGqRn0  reason: not valid java name */
    public final Object m1120invokeWpGqRn0(Object obj, ar4<? super xhv> ar4Var) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(e.a(obj), ar4Var)).invokeSuspend(xhv.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, tb.u1r] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            tb.dkf.d()
            int r0 = r3.label
            if (r0 != 0) goto L_0x0035
            kotlin.b.b(r4)
            java.lang.Object r4 = r3.L$0
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.e) r4
            java.lang.Object r4 = r4.j()
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r0 = r3.$lastValue
            boolean r1 = r4 instanceof kotlinx.coroutines.channels.e.c
            if (r1 != 0) goto L_0x001a
            r0.element = r4
        L_0x001a:
            kotlinx.coroutines.channels.ReceiveChannel<tb.xhv> r2 = r3.$ticker
            if (r1 == 0) goto L_0x0032
            java.lang.Throwable r4 = kotlinx.coroutines.channels.e.c(r4)
            if (r4 != 0) goto L_0x0031
            kotlinx.coroutines.flow.internal.ChildCancelledException r4 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r4.<init>()
            r2.a(r4)
            tb.u1r r4 = tb.iak.DONE
            r0.element = r4
            goto L_0x0032
        L_0x0031:
            throw r4
        L_0x0032:
            tb.xhv r4 = tb.xhv.INSTANCE
            return r4
        L_0x0035:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
