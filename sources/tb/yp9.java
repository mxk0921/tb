package tb;

import java.util.Collection;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import kotlinx.coroutines.flow.FlowKt__CountKt;
import kotlinx.coroutines.flow.FlowKt__DelayKt;
import kotlinx.coroutines.flow.FlowKt__DistinctKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class yp9 {
    public static final String DEFAULT_CONCURRENCY_PROPERTY_NAME = "kotlinx.coroutines.flow.defaultConcurrency";

    public static final <T, R> qp9<R> A(qp9<? extends T> qp9Var, u1a<? super T, ? super ar4<? super R>, ? extends Object> u1aVar) {
        return FlowKt__MergeKt.a(qp9Var, u1aVar);
    }

    public static final <T> ReceiveChannel<T> B(qp9<? extends T> qp9Var, uu4 uu4Var) {
        return FlowKt__ChannelsKt.d(qp9Var, uu4Var);
    }

    public static final <S, T extends S> Object C(qp9<? extends T> qp9Var, w1a<? super S, ? super T, ? super ar4<? super S>, ? extends Object> w1aVar, ar4<? super S> ar4Var) {
        return FlowKt__ReduceKt.h(qp9Var, w1aVar, ar4Var);
    }

    public static final <T> Object D(qp9<? extends T> qp9Var, ar4<? super T> ar4Var) {
        return FlowKt__ReduceKt.i(qp9Var, ar4Var);
    }

    public static final <T> Object E(qp9<? extends T> qp9Var, ar4<? super T> ar4Var) {
        return FlowKt__ReduceKt.j(qp9Var, ar4Var);
    }

    public static final <T, C extends Collection<? super T>> Object F(qp9<? extends T> qp9Var, C c, ar4<? super C> ar4Var) {
        return FlowKt__CollectionKt.a(qp9Var, c, ar4Var);
    }

    public static final <T, R> qp9<R> G(qp9<? extends T> qp9Var, w1a<? super sp9<? super R>, ? super T, ? super ar4<? super xhv>, ? extends Object> w1aVar) {
        return FlowKt__MergeKt.b(qp9Var, w1aVar);
    }

    public static final <T> ajq<T> a(hfj<T> hfjVar) {
        return e.a(hfjVar);
    }

    public static final <T> qp9<T> b(qp9<? extends T> qp9Var, int i, BufferOverflow bufferOverflow) {
        return cq9.a(qp9Var, i, bufferOverflow);
    }

    public static final <T> qp9<T> d(u1a<? super ozm<? super T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        return b.a(u1aVar);
    }

    public static final <T> Object e(qp9<? extends T> qp9Var, sp9<? super T> sp9Var, ar4<? super Throwable> ar4Var) {
        return FlowKt__ErrorsKt.a(qp9Var, sp9Var, ar4Var);
    }

    public static final Object f(qp9<?> qp9Var, ar4<? super xhv> ar4Var) {
        return bq9.a(qp9Var, ar4Var);
    }

    public static final <T> Object g(qp9<? extends T> qp9Var, u1a<? super T, ? super ar4<? super xhv>, ? extends Object> u1aVar, ar4<? super xhv> ar4Var) {
        return bq9.b(qp9Var, u1aVar, ar4Var);
    }

    public static final <T> qp9<T> h(qp9<? extends T> qp9Var) {
        return cq9.d(qp9Var);
    }

    public static final <T> Object i(qp9<? extends T> qp9Var, ar4<? super Integer> ar4Var) {
        return FlowKt__CountKt.a(qp9Var, ar4Var);
    }

    public static final <T> Object j(qp9<? extends T> qp9Var, u1a<? super T, ? super ar4<? super Boolean>, ? extends Object> u1aVar, ar4<? super Integer> ar4Var) {
        return FlowKt__CountKt.b(qp9Var, u1aVar, ar4Var);
    }

    public static final <T> qp9<T> k(qp9<? extends T> qp9Var) {
        return FlowKt__DistinctKt.a(qp9Var);
    }

    public static final <T> qp9<T> l(qp9<? extends T> qp9Var, u1a<? super T, ? super ar4<? super Boolean>, ? extends Object> u1aVar) {
        return FlowKt__LimitKt.c(qp9Var, u1aVar);
    }

    public static final <T> Object m(sp9<? super T> sp9Var, ReceiveChannel<? extends T> receiveChannel, ar4<? super xhv> ar4Var) {
        return FlowKt__ChannelsKt.b(sp9Var, receiveChannel, ar4Var);
    }

    public static final <T> Object n(sp9<? super T> sp9Var, qp9<? extends T> qp9Var, ar4<? super xhv> ar4Var) {
        return bq9.c(sp9Var, qp9Var, ar4Var);
    }

    public static final void o(sp9<?> sp9Var) {
        FlowKt__EmittersKt.b(sp9Var);
    }

    public static final <T> Object p(qp9<? extends T> qp9Var, ar4<? super T> ar4Var) {
        return FlowKt__ReduceKt.a(qp9Var, ar4Var);
    }

    public static final <T> Object q(qp9<? extends T> qp9Var, u1a<? super T, ? super ar4<? super Boolean>, ? extends Object> u1aVar, ar4<? super T> ar4Var) {
        return FlowKt__ReduceKt.b(qp9Var, u1aVar, ar4Var);
    }

    public static final <T> Object r(qp9<? extends T> qp9Var, ar4<? super T> ar4Var) {
        return FlowKt__ReduceKt.c(qp9Var, ar4Var);
    }

    public static final <T> Object s(qp9<? extends T> qp9Var, u1a<? super T, ? super ar4<? super Boolean>, ? extends Object> u1aVar, ar4<? super T> ar4Var) {
        return FlowKt__ReduceKt.d(qp9Var, u1aVar, ar4Var);
    }

    public static final ReceiveChannel<xhv> t(uu4 uu4Var, long j, long j2) {
        return FlowKt__DelayKt.a(uu4Var, j, j2);
    }

    public static final <T> qp9<T> v(u1a<? super sp9<? super T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        return b.b(u1aVar);
    }

    public static final <T> qp9<T> w(T t) {
        return b.c(t);
    }

    public static final <T> qp9<T> x(qp9<? extends T> qp9Var, d dVar) {
        return cq9.e(qp9Var, dVar);
    }

    public static final <T> Object y(qp9<? extends T> qp9Var, ar4<? super T> ar4Var) {
        return FlowKt__ReduceKt.f(qp9Var, ar4Var);
    }

    public static final <T> Object z(qp9<? extends T> qp9Var, ar4<? super T> ar4Var) {
        return FlowKt__ReduceKt.g(qp9Var, ar4Var);
    }
}
