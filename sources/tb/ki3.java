package tb;

import com.alibaba.security.realidentity.o;
import com.loc.at;
import com.taobao.weex.common.Constants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u000b\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Ltb/ki3;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "channel", "", "consume", "Lkotlin/coroutines/d;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Ltb/xhv;", o.b, "()V", at.j, "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ltb/qp9;", at.k, "()Ltb/qp9;", "Ltb/ozm;", Constants.Name.SCOPE, bmv.MSGTYPE_INTERVAL, "(Ltb/ozm;Ltb/ar4;)Ljava/lang/Object;", "Ltb/uu4;", "n", "(Ltb/uu4;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Ltb/sp9;", "collector", "a", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "", at.f, "()Ljava/lang/String;", "d", "Lkotlinx/coroutines/channels/ReceiveChannel;", "e", "Z", "Ltb/qg1;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ki3<T> extends ChannelFlow<T> {
    private static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(ki3.class, "f");
    private final ReceiveChannel<T> d;
    private final boolean e;
    @Volatile
    private volatile int f;

    public /* synthetic */ ki3(ReceiveChannel receiveChannel, boolean z, d dVar, int i, BufferOverflow bufferOverflow, int i2, a07 a07Var) {
        this(receiveChannel, z, (i2 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    private final void o() {
        if (this.e && g.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, tb.o2a, tb.qp9, tb.t23
    public Object a(sp9<? super T> sp9Var, ar4<? super xhv> ar4Var) {
        Object c;
        if (this.b == -3) {
            o();
            c = FlowKt__ChannelsKt.c(sp9Var, this.d, this.e, ar4Var);
            if (c == dkf.d()) {
                return c;
            }
            return xhv.INSTANCE;
        }
        Object a2 = super.a(sp9Var, ar4Var);
        if (a2 == dkf.d()) {
            return a2;
        }
        return xhv.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String g() {
        return z9u.ARG_CHANNEL + this.d;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object i(ozm<? super T> ozmVar, ar4<? super xhv> ar4Var) {
        Object c;
        c = FlowKt__ChannelsKt.c(new gbp(ozmVar), this.d, this.e, ar4Var);
        if (c == dkf.d()) {
            return c;
        }
        return xhv.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> j(d dVar, int i, BufferOverflow bufferOverflow) {
        return new ki3(this.d, this.e, dVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public qp9<T> k() {
        return new ki3(this.d, this.e, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> n(uu4 uu4Var) {
        o();
        if (this.b == -3) {
            return this.d;
        }
        return super.n(uu4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ki3(ReceiveChannel<? extends T> receiveChannel, boolean z, d dVar, int i, BufferOverflow bufferOverflow) {
        super(dVar, i, bufferOverflow);
        this.d = receiveChannel;
        this.e = z;
        this.f = 0;
    }
}
