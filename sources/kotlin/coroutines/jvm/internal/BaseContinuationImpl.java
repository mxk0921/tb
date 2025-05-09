package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.d;
import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.ev6;
import tb.jv6;
import tb.vu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Ltb/ar4;", "", "Ltb/vu4;", "Ljava/io/Serializable;", "completion", "<init>", "(Ltb/ar4;)V", "Lkotlin/Result;", "result", "Ltb/xhv;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Ltb/ar4;)Ltb/ar4;", "value", "(Ljava/lang/Object;Ltb/ar4;)Ltb/ar4;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Ltb/ar4;", "getCompletion", "()Ltb/ar4;", "getCallerFrame", "()Ltb/vu4;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class BaseContinuationImpl implements ar4<Object>, vu4, Serializable {
    private final ar4<Object> completion;

    public BaseContinuationImpl(ar4<Object> ar4Var) {
        this.completion = ar4Var;
    }

    public ar4<xhv> create(ar4<?> ar4Var) {
        ckf.g(ar4Var, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // tb.vu4
    public vu4 getCallerFrame() {
        ar4<Object> ar4Var = this.completion;
        if (ar4Var instanceof vu4) {
            return (vu4) ar4Var;
        }
        return null;
    }

    public final ar4<Object> getCompletion() {
        return this.completion;
    }

    @Override // tb.ar4
    public abstract /* synthetic */ d getContext();

    @Override // tb.vu4
    public StackTraceElement getStackTraceElement() {
        return ev6.d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.ar4
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        ar4 ar4Var = this;
        while (true) {
            jv6.b(ar4Var);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) ar4Var;
            ar4 ar4Var2 = baseContinuationImpl.completion;
            ckf.d(ar4Var2);
            try {
                invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
            if (invokeSuspend != dkf.d()) {
                obj = Result.m1108constructorimpl(invokeSuspend);
                baseContinuationImpl.releaseIntercepted();
                if (ar4Var2 instanceof BaseContinuationImpl) {
                    ar4Var = ar4Var2;
                } else {
                    ar4Var2.resumeWith(obj);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ckf.g(ar4Var, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
