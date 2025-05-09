package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import tb.ar4;
import tb.bmv;
import tb.ckf;
import tb.dkf;
import tb.gbp;
import tb.ozm;
import tb.qp9;
import tb.sp9;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", ExifInterface.LATITUDE_SOUTH, "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ltb/qp9;", "flow", "Lkotlin/coroutines/d;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Ltb/qp9;Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Ltb/sp9;", "collector", "newContext", "Ltb/xhv;", "r", "(Ltb/sp9;Lkotlin/coroutines/d;Ltb/ar4;)Ljava/lang/Object;", "s", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "Ltb/ozm;", Constants.Name.SCOPE, bmv.MSGTYPE_INTERVAL, "(Ltb/ozm;Ltb/ar4;)Ljava/lang/Object;", "a", "", "toString", "()Ljava/lang/String;", "d", "Ltb/qp9;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    protected final qp9<S> d;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(qp9<? extends S> qp9Var, d dVar, int i, BufferOverflow bufferOverflow) {
        super(dVar, i, bufferOverflow);
        this.d = qp9Var;
    }

    public static /* synthetic */ <S, T> Object p(ChannelFlowOperator<S, T> channelFlowOperator, sp9<? super T> sp9Var, ar4<? super xhv> ar4Var) {
        if (channelFlowOperator.b == -3) {
            d context = ar4Var.getContext();
            d d = CoroutineContextKt.d(context, channelFlowOperator.f15364a);
            if (ckf.b(d, context)) {
                Object s = channelFlowOperator.s(sp9Var, ar4Var);
                if (s == dkf.d()) {
                    return s;
                }
                return xhv.INSTANCE;
            }
            c.b bVar = c.Key;
            if (ckf.b(d.get(bVar), context.get(bVar))) {
                Object r = channelFlowOperator.r(sp9Var, d, ar4Var);
                if (r == dkf.d()) {
                    return r;
                }
                return xhv.INSTANCE;
            }
        }
        Object a2 = super.a(sp9Var, ar4Var);
        if (a2 == dkf.d()) {
            return a2;
        }
        return xhv.INSTANCE;
    }

    public static /* synthetic */ <S, T> Object q(ChannelFlowOperator<S, T> channelFlowOperator, ozm<? super T> ozmVar, ar4<? super xhv> ar4Var) {
        Object s = channelFlowOperator.s(new gbp(ozmVar), ar4Var);
        if (s == dkf.d()) {
            return s;
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(sp9<? super T> sp9Var, d dVar, ar4<? super xhv> ar4Var) {
        Object d = a.d(dVar, a.a(sp9Var, ar4Var.getContext()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), ar4Var, 4, null);
        if (d == dkf.d()) {
            return d;
        }
        return xhv.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, tb.o2a, tb.qp9, tb.t23
    public Object a(sp9<? super T> sp9Var, ar4<? super xhv> ar4Var) {
        return p(this, sp9Var, ar4Var);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object i(ozm<? super T> ozmVar, ar4<? super xhv> ar4Var) {
        return q(this, ozmVar, ar4Var);
    }

    public abstract Object s(sp9<? super T> sp9Var, ar4<? super xhv> ar4Var);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.d + " -> " + super.toString();
    }
}
