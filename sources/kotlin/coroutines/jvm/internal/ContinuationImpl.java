package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import tb.ar4;
import tb.ckf;
import tb.ea4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Ltb/ar4;", "", "completion", "Lkotlin/coroutines/d;", "_context", "<init>", "(Ltb/ar4;Lkotlin/coroutines/d;)V", "(Ltb/ar4;)V", "intercepted", "()Ltb/ar4;", "Ltb/xhv;", "releaseIntercepted", "()V", "Lkotlin/coroutines/d;", "Ltb/ar4;", "getContext", "()Lkotlin/coroutines/d;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final d _context;
    private transient ar4<Object> intercepted;

    public ContinuationImpl(ar4<Object> ar4Var, d dVar) {
        super(ar4Var);
        this._context = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, tb.ar4
    public d getContext() {
        d dVar = this._context;
        ckf.d(dVar);
        return dVar;
    }

    public final ar4<Object> intercepted() {
        ar4<Object> ar4Var = this.intercepted;
        if (ar4Var == null) {
            c cVar = (c) getContext().get(c.Key);
            if (cVar == null || (ar4Var = cVar.interceptContinuation(this)) == null) {
                ar4Var = this;
            }
            this.intercepted = ar4Var;
        }
        return ar4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        ar4<?> ar4Var = this.intercepted;
        if (!(ar4Var == null || ar4Var == this)) {
            d.b bVar = getContext().get(c.Key);
            ckf.d(bVar);
            ((c) bVar).releaseInterceptedContinuation(ar4Var);
        }
        this.intercepted = ea4.INSTANCE;
    }

    public ContinuationImpl(ar4<Object> ar4Var) {
        this(ar4Var, ar4Var != null ? ar4Var.getContext() : null);
    }
}
