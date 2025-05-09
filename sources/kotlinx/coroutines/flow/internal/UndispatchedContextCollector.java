package kotlinx.coroutines.flow.internal;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.internal.ThreadContextKt;
import tb.ar4;
import tb.dkf;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R3\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector;", "T", "Ltb/sp9;", "downstream", "Lkotlin/coroutines/d;", "emitContext", "<init>", "(Ltb/sp9;Lkotlin/coroutines/d;)V", "value", "Ltb/xhv;", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "a", "Lkotlin/coroutines/d;", "", TplMsg.VALUE_T_NATIVE_RETURN, "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Ltb/ar4;", "c", "Ltb/u1a;", "emitRef", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class UndispatchedContextCollector<T> implements sp9<T> {

    /* renamed from: a  reason: collision with root package name */
    private final d f15372a;
    private final Object b;
    private final u1a<T, ar4<? super xhv>, Object> c;

    public UndispatchedContextCollector(sp9<? super T> sp9Var, d dVar) {
        this.f15372a = dVar;
        this.b = ThreadContextKt.b(dVar);
        this.c = new UndispatchedContextCollector$emitRef$1(sp9Var, null);
    }

    @Override // tb.sp9
    public Object emit(T t, ar4<? super xhv> ar4Var) {
        Object c = a.c(this.f15372a, t, this.b, this.c, ar4Var);
        if (c == dkf.d()) {
            return c;
        }
        return xhv.INSTANCE;
    }
}
