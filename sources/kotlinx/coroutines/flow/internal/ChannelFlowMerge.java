package kotlinx.coroutines.flow.internal;

import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.m;
import kotlinx.coroutines.sync.SemaphoreKt;
import tb.a07;
import tb.ar4;
import tb.bmv;
import tb.dkf;
import tb.gbp;
import tb.ozm;
import tb.qp9;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ltb/qp9;", "flow", "", "concurrency", "Lkotlin/coroutines/d;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Ltb/qp9;ILkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)V", at.j, "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ltb/uu4;", Constants.Name.SCOPE, "Lkotlinx/coroutines/channels/ReceiveChannel;", "n", "(Ltb/uu4;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Ltb/ozm;", "Ltb/xhv;", bmv.MSGTYPE_INTERVAL, "(Ltb/ozm;Ltb/ar4;)Ljava/lang/Object;", "", at.f, "()Ljava/lang/String;", "d", "Ltb/qp9;", "e", TLogTracker.LEVEL_INFO, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {
    private final qp9<qp9<T>> d;
    private final int e;

    public /* synthetic */ ChannelFlowMerge(qp9 qp9Var, int i, d dVar, int i2, BufferOverflow bufferOverflow, int i3, a07 a07Var) {
        this(qp9Var, i, (i3 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String g() {
        return "concurrency=" + this.e;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object i(ozm<? super T> ozmVar, ar4<? super xhv> ar4Var) {
        Object a2 = this.d.a(new ChannelFlowMerge$collectTo$2((m) ar4Var.getContext().get(m.Key), SemaphoreKt.b(this.e, 0, 2, null), ozmVar, new gbp(ozmVar)), ar4Var);
        if (a2 == dkf.d()) {
            return a2;
        }
        return xhv.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> j(d dVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.d, this.e, dVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> n(uu4 uu4Var) {
        return ProduceKt.c(uu4Var, this.f15364a, this.b, l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge(qp9<? extends qp9<? extends T>> qp9Var, int i, d dVar, int i2, BufferOverflow bufferOverflow) {
        super(dVar, i2, bufferOverflow);
        this.d = qp9Var;
        this.e = i;
    }
}
