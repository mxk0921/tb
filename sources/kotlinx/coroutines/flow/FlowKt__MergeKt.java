package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import tb.ar4;
import tb.o3r;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.w1a;
import tb.xhv;
import tb.yp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class FlowKt__MergeKt {
    static {
        o3r.b(yp9.DEFAULT_CONCURRENCY_PROPERTY_NAME, 16, 1, Integer.MAX_VALUE);
    }

    public static final <T, R> qp9<R> a(qp9<? extends T> qp9Var, u1a<? super T, ? super ar4<? super R>, ? extends Object> u1aVar) {
        return yp9.G(qp9Var, new FlowKt__MergeKt$mapLatest$1(u1aVar, null));
    }

    public static final <T, R> qp9<R> b(qp9<? extends T> qp9Var, w1a<? super sp9<? super R>, ? super T, ? super ar4<? super xhv>, ? extends Object> w1aVar) {
        return new ChannelFlowTransformLatest(w1aVar, qp9Var, null, 0, null, 28, null);
    }
}
