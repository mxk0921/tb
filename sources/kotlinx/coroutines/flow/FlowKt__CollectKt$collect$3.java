package kotlinx.coroutines.flow;

import com.taobao.artc.internal.ArtcParams;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import tb.ar4;
import tb.dkf;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Ltb/sp9;", "value", "Ltb/xhv;", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__CollectKt$collect$3 implements sp9<Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u1a<Object, ar4<? super xhv>, Object> f15283a;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collect$3(u1a<Object, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        this.f15283a = u1aVar;
    }

    public Object a(Object obj, final ar4<? super xhv> ar4Var) {
        new ContinuationImpl(ar4Var) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj2) {
                this.result = obj2;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__CollectKt$collect$3.this.emit(null, this);
            }
        };
        this.f15283a.invoke(obj, ar4Var);
        return xhv.INSTANCE;
    }

    @Override // tb.sp9
    public Object emit(Object obj, ar4<? super xhv> ar4Var) {
        Object invoke = this.f15283a.invoke(obj, ar4Var);
        if (invoke == dkf.d()) {
            return invoke;
        }
        return xhv.INSTANCE;
    }
}
