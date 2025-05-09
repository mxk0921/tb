package kotlinx.coroutines.flow.internal;

import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import tb.ar4;
import tb.aw7;
import tb.ckf;
import tb.dkf;
import tb.f4k;
import tb.jv6;
import tb.msq;
import tb.quf;
import tb.sp9;
import tb.vu4;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010&\u001a\u00020%8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Ltb/sp9;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Ltb/vu4;", "collector", "Lkotlin/coroutines/d;", "collectContext", "<init>", "(Ltb/sp9;Lkotlin/coroutines/d;)V", "Ltb/ar4;", "Ltb/xhv;", "uCont", "value", "", "emit", "(Ltb/ar4;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "checkContext", "(Lkotlin/coroutines/d;Lkotlin/coroutines/d;Ljava/lang/Object;)V", "Ltb/aw7;", "exception", "exceptionTransparencyViolated", "(Ltb/aw7;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "Ltb/sp9;", "Lkotlin/coroutines/d;", "", "collectContextSize", TLogTracker.LEVEL_INFO, "lastEmissionContext", "completion", "Ltb/ar4;", "getCallerFrame", "()Ltb/vu4;", "callerFrame", "getContext", "()Lkotlin/coroutines/d;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class SafeCollector<T> extends ContinuationImpl implements sp9<T> {
    public final d collectContext;
    public final int collectContextSize;
    public final sp9<T> collector;
    private ar4<? super xhv> completion;
    private d lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(sp9<? super T> sp9Var, d dVar) {
        super(f4k.INSTANCE, EmptyCoroutineContext.INSTANCE);
        this.collector = sp9Var;
        this.collectContext = dVar;
        this.collectContextSize = ((Number) dVar.fold(0, SafeCollector$collectContextSize$1.INSTANCE)).intValue();
    }

    private final void checkContext(d dVar, d dVar2, T t) {
        if (dVar2 instanceof aw7) {
            exceptionTransparencyViolated((aw7) dVar2, t);
        }
        SafeCollector_commonKt.a(this, dVar);
    }

    private final void exceptionTransparencyViolated(aw7 aw7Var, Object obj) {
        throw new IllegalStateException(msq.i("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aw7Var.f16038a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // tb.sp9
    public Object emit(T t, ar4<? super xhv> ar4Var) {
        try {
            Object emit = emit(ar4Var, (ar4<? super xhv>) t);
            if (emit == dkf.d()) {
                jv6.c(ar4Var);
            }
            return emit == dkf.d() ? emit : xhv.INSTANCE;
        } catch (Throwable th) {
            this.lastEmissionContext = new aw7(th, ar4Var.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, tb.vu4
    public vu4 getCallerFrame() {
        ar4<? super xhv> ar4Var = this.completion;
        if (ar4Var instanceof vu4) {
            return (vu4) ar4Var;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl, tb.ar4
    public d getContext() {
        d dVar = this.lastEmissionContext;
        if (dVar == null) {
            return EmptyCoroutineContext.INSTANCE;
        }
        return dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, tb.vu4
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        Throwable th = Result.m1111exceptionOrNullimpl(obj);
        if (th != null) {
            this.lastEmissionContext = new aw7(th, getContext());
        }
        ar4<? super xhv> ar4Var = this.completion;
        if (ar4Var != null) {
            ar4Var.resumeWith(obj);
        }
        return dkf.d();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    private final Object emit(ar4<? super xhv> ar4Var, T t) {
        d context = ar4Var.getContext();
        quf.f(context);
        d dVar = this.lastEmissionContext;
        if (dVar != context) {
            checkContext(context, dVar, t);
            this.lastEmissionContext = context;
        }
        this.completion = ar4Var;
        w1a a2 = SafeCollectorKt.a();
        sp9<T> sp9Var = this.collector;
        ckf.e(sp9Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object invoke = a2.invoke(sp9Var, t, this);
        if (!ckf.b(invoke, dkf.d())) {
            this.completion = null;
        }
        return invoke;
    }
}
