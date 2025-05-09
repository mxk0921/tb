package kotlinx.coroutines.flow;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.m;
import tb.ajq;
import tb.ar4;
import tb.o2a;
import tb.qp9;
import tb.sp9;
import tb.t23;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096Aø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/flow/i;", "T", "Ltb/ajq;", "Ltb/t23;", "Ltb/o2a;", "flow", "Lkotlinx/coroutines/m;", "job", "<init>", "(Ltb/ajq;Lkotlinx/coroutines/m;)V", "Ltb/sp9;", "collector", "", "a", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Ltb/qp9;", "f", "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Ltb/qp9;", "Lkotlinx/coroutines/m;", "", TplMsg.VALUE_T_NATIVE_RETURN, "()Ljava/util/List;", "replayCache", "getValue", "()Ljava/lang/Object;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class i<T> implements ajq<T>, t23<T>, o2a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final m f15363a;
    private final /* synthetic */ ajq<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(ajq<? extends T> ajqVar, m mVar) {
        this.f15363a = mVar;
        this.b = ajqVar;
    }

    @Override // tb.clp, tb.qp9, tb.t23
    public Object a(sp9<? super T> sp9Var, ar4<?> ar4Var) {
        return this.b.a(sp9Var, ar4Var);
    }

    @Override // tb.clp
    public List<T> b() {
        return this.b.b();
    }

    @Override // tb.o2a
    public qp9<T> f(d dVar, int i, BufferOverflow bufferOverflow) {
        return m.b(this, dVar, i, bufferOverflow);
    }

    @Override // tb.ajq
    public T getValue() {
        return this.b.getValue();
    }
}
