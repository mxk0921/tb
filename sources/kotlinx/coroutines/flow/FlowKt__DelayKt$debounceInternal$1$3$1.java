package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ar4;
import tb.dkf;
import tb.g1a;
import tb.iak;
import tb.sp9;
import tb.u1r;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ltb/xhv;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements g1a<ar4<? super xhv>, Object> {
    final /* synthetic */ sp9<Object> $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(sp9<Object> sp9Var, Ref$ObjectRef<Object> ref$ObjectRef, ar4<? super FlowKt__DelayKt$debounceInternal$1$3$1> ar4Var) {
        super(1, ar4Var);
        this.$downstream = sp9Var;
        this.$lastValue = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(ar4<?> ar4Var) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.$downstream, this.$lastValue, ar4Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            sp9<Object> sp9Var = this.$downstream;
            u1r u1rVar = iak.NULL;
            Object obj2 = this.$lastValue.element;
            if (obj2 == u1rVar) {
                obj2 = null;
            }
            this.label = 1;
            if (sp9Var.emit(obj2, this) == d) {
                return d;
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$lastValue.element = null;
        return xhv.INSTANCE;
    }

    public final Object invoke(ar4<? super xhv> ar4Var) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create(ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
