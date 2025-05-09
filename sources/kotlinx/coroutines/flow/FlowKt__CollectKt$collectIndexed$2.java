package kotlinx.coroutines.flow;

import com.taobao.artc.internal.ArtcParams;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import tb.ar4;
import tb.dkf;
import tb.gk2;
import tb.sp9;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2", "Ltb/sp9;", "value", "Ltb/xhv;", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "", "a", TLogTracker.LEVEL_INFO, "index", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__CollectKt$collectIndexed$2 implements sp9<Object> {

    /* renamed from: a  reason: collision with root package name */
    private int f15284a;
    final /* synthetic */ w1a<Integer, Object, ar4<? super xhv>, Object> b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collectIndexed$2(w1a<? super Integer, Object, ? super ar4<? super xhv>, ? extends Object> w1aVar) {
        this.b = w1aVar;
    }

    public Object a(Object obj, final ar4<? super xhv> ar4Var) {
        new ContinuationImpl(ar4Var) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj2) {
                this.result = obj2;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__CollectKt$collectIndexed$2.this.emit(null, this);
            }
        };
        w1a<Integer, Object, ar4<? super xhv>, Object> w1aVar = this.b;
        int i = this.f15284a;
        this.f15284a = i + 1;
        if (i >= 0) {
            w1aVar.invoke(Integer.valueOf(i), obj, ar4Var);
            return xhv.INSTANCE;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    @Override // tb.sp9
    public Object emit(Object obj, ar4<? super xhv> ar4Var) {
        w1a<Integer, Object, ar4<? super xhv>, Object> w1aVar = this.b;
        int i = this.f15284a;
        this.f15284a = i + 1;
        if (i >= 0) {
            Object invoke = w1aVar.invoke(gk2.b(i), obj, ar4Var);
            if (invoke == dkf.d()) {
                return invoke;
            }
            return xhv.INSTANCE;
        }
        throw new ArithmeticException("Index overflow has happened");
    }
}
