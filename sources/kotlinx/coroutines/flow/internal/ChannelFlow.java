package kotlinx.coroutines.flow.internal;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.f;
import tb.ar4;
import tb.bmv;
import tb.ckf;
import tb.dkf;
import tb.dv6;
import tb.i04;
import tb.o2a;
import tb.ov6;
import tb.ozm;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R9\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)\u0012\u0006\u0012\u0004\u0018\u00010*0(8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", "T", "Ltb/o2a;", "Lkotlin/coroutines/d;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Ltb/qp9;", at.k, "()Ltb/qp9;", "f", "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Ltb/qp9;", at.j, "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ltb/ozm;", Constants.Name.SCOPE, "Ltb/xhv;", bmv.MSGTYPE_INTERVAL, "(Ltb/ozm;Ltb/ar4;)Ljava/lang/Object;", "Ltb/uu4;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "n", "(Ltb/uu4;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Ltb/sp9;", "collector", "a", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "", at.f, "()Ljava/lang/String;", "toString", "Lkotlin/coroutines/d;", TplMsg.VALUE_T_NATIVE_RETURN, TLogTracker.LEVEL_INFO, "c", "Lkotlinx/coroutines/channels/BufferOverflow;", "Lkotlin/Function2;", "Ltb/ar4;", "", "l", "()Ltb/u1a;", "collectToFun", "m", "()I", "produceCapacity", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class ChannelFlow<T> implements o2a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d f15364a;
    public final int b;
    public final BufferOverflow c;

    public ChannelFlow(d dVar, int i, BufferOverflow bufferOverflow) {
        this.f15364a = dVar;
        this.b = i;
        this.c = bufferOverflow;
        String str = dv6.DEBUG_PROPERTY_NAME;
    }

    public static /* synthetic */ <T> Object h(ChannelFlow<T> channelFlow, sp9<? super T> sp9Var, ar4<? super xhv> ar4Var) {
        Object b = f.b(new ChannelFlow$collect$2(sp9Var, channelFlow, null), ar4Var);
        if (b == dkf.d()) {
            return b;
        }
        return xhv.INSTANCE;
    }

    @Override // tb.o2a, tb.qp9, tb.t23
    public Object a(sp9<? super T> sp9Var, ar4<? super xhv> ar4Var) {
        return h(this, sp9Var, ar4Var);
    }

    @Override // tb.o2a
    public qp9<T> f(d dVar, int i, BufferOverflow bufferOverflow) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        d plus = dVar.plus(this.f15364a);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i2 = this.b;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            bufferOverflow = this.c;
        }
        if (ckf.b(plus, this.f15364a) && i == this.b && bufferOverflow == this.c) {
            return this;
        }
        return j(plus, i, bufferOverflow);
    }

    public String g() {
        return null;
    }

    public abstract Object i(ozm<? super T> ozmVar, ar4<? super xhv> ar4Var);

    public abstract ChannelFlow<T> j(d dVar, int i, BufferOverflow bufferOverflow);

    public qp9<T> k() {
        return null;
    }

    public final u1a<ozm<? super T>, ar4<? super xhv>, Object> l() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    public final int m() {
        int i = this.b;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    public ReceiveChannel<T> n(uu4 uu4Var) {
        return ProduceKt.d(uu4Var, this.f15364a, m(), this.c, CoroutineStart.ATOMIC, null, l(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String g = g();
        if (g != null) {
            arrayList.add(g);
        }
        if (this.f15364a != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.f15364a);
        }
        if (this.b != -3) {
            arrayList.add("capacity=" + this.b);
        }
        if (this.c != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.c);
        }
        return ov6.a(this) + '[' + i04.j0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
