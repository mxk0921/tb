package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.d1a;
import tb.dkf;
import tb.u1a;
import tb.ujf;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Ltb/uu4;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements u1a<uu4, ar4<Object>, Object> {
    final /* synthetic */ d1a<Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(d1a<Object> d1aVar, ar4<? super InterruptibleKt$runInterruptible$2> ar4Var) {
        super(2, ar4Var);
        this.$block = d1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.$block, ar4Var);
        interruptibleKt$runInterruptible$2.L$0 = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        dkf.d();
        if (this.label == 0) {
            b.b(obj);
            b = ujf.b(((uu4) this.L$0).getCoroutineContext(), this.$block);
            return b;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(uu4 uu4Var, ar4<Object> ar4Var) {
        return ((InterruptibleKt$runInterruptible$2) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
