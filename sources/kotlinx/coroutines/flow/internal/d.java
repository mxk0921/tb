package kotlinx.coroutines.flow.internal;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import kotlin.Metadata;
import tb.ar4;
import tb.vu4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/internal/d;", "T", "Ltb/ar4;", "Ltb/vu4;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "uCont", "Lkotlin/coroutines/d;", "context", "<init>", "(Ltb/ar4;Lkotlin/coroutines/d;)V", "Lkotlin/Result;", "result", "Ltb/xhv;", "resumeWith", "(Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "a", "Ltb/ar4;", TplMsg.VALUE_T_NATIVE_RETURN, "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/d;", "getCallerFrame", "()Ltb/vu4;", "callerFrame", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class d<T> implements ar4<T>, vu4 {

    /* renamed from: a  reason: collision with root package name */
    private final ar4<T> f15375a;
    private final kotlin.coroutines.d b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(ar4<? super T> ar4Var, kotlin.coroutines.d dVar) {
        this.f15375a = ar4Var;
        this.b = dVar;
    }

    @Override // tb.vu4
    public vu4 getCallerFrame() {
        ar4<T> ar4Var = this.f15375a;
        if (ar4Var instanceof vu4) {
            return (vu4) ar4Var;
        }
        return null;
    }

    @Override // tb.ar4
    public kotlin.coroutines.d getContext() {
        return this.b;
    }

    @Override // tb.vu4
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // tb.ar4
    public void resumeWith(Object obj) {
        this.f15375a.resumeWith(obj);
    }
}
