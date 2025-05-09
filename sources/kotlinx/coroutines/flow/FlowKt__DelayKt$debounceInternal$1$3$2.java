package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.e;
import tb.ar4;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/channels/e;", "", "value", "Ltb/xhv;", "<anonymous>", "(Lkotlinx/coroutines/channels/e;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {242}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements u1a<e<? extends Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ sp9<Object> $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref$ObjectRef<Object> ref$ObjectRef, sp9<Object> sp9Var, ar4<? super FlowKt__DelayKt$debounceInternal$1$3$2> ar4Var) {
        super(2, ar4Var);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = sp9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, ar4Var);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ Object invoke(e<? extends Object> eVar, ar4<? super xhv> ar4Var) {
        return m1119invokeWpGqRn0(eVar.j(), ar4Var);
    }

    /* renamed from: invoke-WpGqRn0  reason: not valid java name */
    public final Object m1119invokeWpGqRn0(Object obj, ar4<? super xhv> ar4Var) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(e.a(obj), ar4Var)).invokeSuspend(xhv.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [T, tb.u1r] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
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
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.lang.Object r0 = r6.L$1
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.b.b(r7)
            goto L_0x004f
        L_0x0013:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001b:
            kotlin.b.b(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.e) r7
            java.lang.Object r7 = r7.j()
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r6.$lastValue
            boolean r3 = r7 instanceof kotlinx.coroutines.channels.e.c
            if (r3 != 0) goto L_0x002e
            r1.element = r7
        L_0x002e:
            tb.sp9<java.lang.Object> r4 = r6.$downstream
            if (r3 == 0) goto L_0x0056
            java.lang.Throwable r3 = kotlinx.coroutines.channels.e.c(r7)
            if (r3 != 0) goto L_0x0055
            T r3 = r1.element
            if (r3 == 0) goto L_0x0050
            tb.u1r r5 = tb.iak.NULL
            if (r3 != r5) goto L_0x0041
            r3 = 0
        L_0x0041:
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = r4.emit(r3, r6)
            if (r7 != r0) goto L_0x004e
            return r0
        L_0x004e:
            r0 = r1
        L_0x004f:
            r1 = r0
        L_0x0050:
            tb.u1r r7 = tb.iak.DONE
            r1.element = r7
            goto L_0x0056
        L_0x0055:
            throw r3
        L_0x0056:
            tb.xhv r7 = tb.xhv.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
