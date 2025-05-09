package kotlinx.coroutines.flow;

import tb.ajq;
import tb.g1a;
import tb.qp9;
import tb.u1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class FlowKt__DistinctKt {

    /* renamed from: a  reason: collision with root package name */
    public static final g1a<Object, Object> f15290a = FlowKt__DistinctKt$defaultKeySelector$1.INSTANCE;
    public static final u1a<Object, Object, Boolean> b = FlowKt__DistinctKt$defaultAreEquivalent$1.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> qp9<T> a(qp9<? extends T> qp9Var) {
        if (qp9Var instanceof ajq) {
            return qp9Var;
        }
        return b(qp9Var, f15290a, b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> qp9<T> b(qp9<? extends T> qp9Var, g1a<? super T, ? extends Object> g1aVar, u1a<Object, Object, Boolean> u1aVar) {
        if (qp9Var instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) qp9Var;
            if (distinctFlowImpl.b == g1aVar && distinctFlowImpl.c == u1aVar) {
                return qp9Var;
            }
        }
        return new DistinctFlowImpl(qp9Var, g1aVar, u1aVar);
    }
}
