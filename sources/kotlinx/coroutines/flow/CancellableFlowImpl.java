package kotlinx.coroutines.flow;

import kotlin.Metadata;
import tb.ar4;
import tb.dkf;
import tb.qp9;
import tb.sp9;
import tb.t23;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/CancellableFlowImpl;", "T", "Ltb/t23;", "Ltb/qp9;", "flow", "<init>", "(Ltb/qp9;)V", "Ltb/sp9;", "collector", "Ltb/xhv;", "a", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "Ltb/qp9;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class CancellableFlowImpl<T> implements t23<T> {

    /* renamed from: a  reason: collision with root package name */
    private final qp9<T> f15269a;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl(qp9<? extends T> qp9Var) {
        this.f15269a = qp9Var;
    }

    @Override // tb.t23
    public Object a(sp9<? super T> sp9Var, ar4<? super xhv> ar4Var) {
        Object a2 = this.f15269a.a(new CancellableFlowImpl$collect$2(sp9Var), ar4Var);
        if (a2 == dkf.d()) {
            return a2;
        }
        return xhv.INSTANCE;
    }
}
