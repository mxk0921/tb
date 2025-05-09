package kotlinx.coroutines.flow;

import com.loc.at;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import tb.a07;
import tb.ar4;
import tb.bmv;
import tb.dkf;
import tb.ozm;
import tb.pg1;
import tb.u1a;
import tb.xhv;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R>\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/a;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlin/Function2;", "Ltb/ozm;", "Ltb/ar4;", "Ltb/xhv;", "", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "Lkotlin/coroutines/d;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Ltb/u1a;Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)V", at.j, "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", Constants.Name.SCOPE, bmv.MSGTYPE_INTERVAL, "(Ltb/ozm;Ltb/ar4;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "d", "Ltb/u1a;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class a<T> extends ChannelFlow<T> {
    private final u1a<ozm<? super T>, ar4<? super xhv>, Object> d;

    public /* synthetic */ a(u1a u1aVar, d dVar, int i, BufferOverflow bufferOverflow, int i2, a07 a07Var) {
        this(u1aVar, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public static /* synthetic */ <T> Object o(a<T> aVar, ozm<? super T> ozmVar, ar4<? super xhv> ar4Var) {
        Object invoke = ((a) aVar).d.invoke(ozmVar, ar4Var);
        if (invoke == dkf.d()) {
            return invoke;
        }
        return xhv.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object i(ozm<? super T> ozmVar, ar4<? super xhv> ar4Var) {
        return o(this, ozmVar, ar4Var);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> j(d dVar, int i, BufferOverflow bufferOverflow) {
        return new a(this.d, dVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(u1a<? super ozm<? super T>, ? super ar4<? super xhv>, ? extends Object> u1aVar, d dVar, int i, BufferOverflow bufferOverflow) {
        super(dVar, i, bufferOverflow);
        this.d = u1aVar;
    }
}
