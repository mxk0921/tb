package kotlinx.coroutines.flow.internal;

import com.loc.at;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import tb.a07;
import tb.ar4;
import tb.bmv;
import tb.gbp;
import tb.nn2;
import tb.ozm;
import tb.qp9;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "", "Ltb/qp9;", "flows", "Lkotlin/coroutines/d;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)V", at.j, "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ltb/uu4;", Constants.Name.SCOPE, "Lkotlinx/coroutines/channels/ReceiveChannel;", "n", "(Ltb/uu4;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Ltb/ozm;", "Ltb/xhv;", bmv.MSGTYPE_INTERVAL, "(Ltb/ozm;Ltb/ar4;)Ljava/lang/Object;", "d", "Ljava/lang/Iterable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {
    private final Iterable<qp9<T>> d;

    public /* synthetic */ ChannelLimitedFlowMerge(Iterable iterable, d dVar, int i, BufferOverflow bufferOverflow, int i2, a07 a07Var) {
        this(iterable, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object i(ozm<? super T> ozmVar, ar4<? super xhv> ar4Var) {
        gbp gbpVar = new gbp(ozmVar);
        for (qp9<T> qp9Var : this.d) {
            nn2.b(ozmVar, null, null, new ChannelLimitedFlowMerge$collectTo$2$1(qp9Var, gbpVar, null), 3, null);
        }
        return xhv.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> j(d dVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.d, dVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> n(uu4 uu4Var) {
        return ProduceKt.c(uu4Var, this.f15364a, this.b, l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelLimitedFlowMerge(Iterable<? extends qp9<? extends T>> iterable, d dVar, int i, BufferOverflow bufferOverflow) {
        super(dVar, i, bufferOverflow);
        this.d = iterable;
    }
}
