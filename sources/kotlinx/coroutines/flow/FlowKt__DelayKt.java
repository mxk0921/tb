package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import tb.uu4;
import tb.xhv;
import tb.yp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class FlowKt__DelayKt {
    public static final ReceiveChannel<xhv> a(uu4 uu4Var, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
        } else if (j2 >= 0) {
            return ProduceKt.e(uu4Var, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$3(j2, j, null), 1, null);
        } else {
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
        }
    }

    public static /* synthetic */ ReceiveChannel b(uu4 uu4Var, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        return yp9.t(uu4Var, j, j2);
    }
}
