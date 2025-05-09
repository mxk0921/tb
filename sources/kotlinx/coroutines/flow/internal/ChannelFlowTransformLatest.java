package kotlinx.coroutines.flow.internal;

import com.loc.at;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.f;
import tb.a07;
import tb.ar4;
import tb.dkf;
import tb.dv6;
import tb.qp9;
import tb.sp9;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bz\u0012B\u0010\r\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0002\b\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dRS\u0010\r\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0002\b\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest;", "T", "R", "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "Lkotlin/Function3;", "Ltb/sp9;", "Lkotlin/ParameterName;", "name", "value", "Ltb/ar4;", "Ltb/xhv;", "", "Lkotlin/ExtensionFunctionType;", "transform", "Ltb/qp9;", "flow", "Lkotlin/coroutines/d;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Ltb/w1a;Ltb/qp9;Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", at.j, "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "collector", "s", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "e", "Ltb/w1a;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {
    private final w1a<sp9<? super R>, T, ar4<? super xhv>, Object> e;

    public /* synthetic */ ChannelFlowTransformLatest(w1a w1aVar, qp9 qp9Var, d dVar, int i, BufferOverflow bufferOverflow, int i2, a07 a07Var) {
        this(w1aVar, qp9Var, (i2 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<R> j(d dVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.e, this.d, dVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object s(sp9<? super R> sp9Var, ar4<? super xhv> ar4Var) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        Object b = f.b(new ChannelFlowTransformLatest$flowCollect$3(this, sp9Var, null), ar4Var);
        if (b == dkf.d()) {
            return b;
        }
        return xhv.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(w1a<? super sp9<? super R>, ? super T, ? super ar4<? super xhv>, ? extends Object> w1aVar, qp9<? extends T> qp9Var, d dVar, int i, BufferOverflow bufferOverflow) {
        super(qp9Var, dVar, i, bufferOverflow);
        this.e = w1aVar;
    }
}
