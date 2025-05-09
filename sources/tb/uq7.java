package tb;

import com.alibaba.security.realidentity.o;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.loc.at;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.d;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.c;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.j;
import kotlinx.coroutines.m;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\b!\u0010\"J \u0010%\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&JH\u0010+\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2%\b\b\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u0012\u0018\u00010'H\u0080\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001aH\u0010¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010 H\u0080\b¢\u0006\u0004\b1\u00102J!\u00103\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0080\bø\u0001\u0000¢\u0006\u0004\b3\u0010&J\u001f\u00107\u001a\u00020\u00122\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00028\u0000H\u0000¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010C\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b@\u0010A\u0012\u0004\bB\u0010\u0014R\u0014\u0010E\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bD\u0010AR\u001a\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0018R\u0014\u00105\u001a\u0002048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001c\u0010L\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b<\u0010MR\u0013\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0 8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, d2 = {"Ltb/uq7;", "T", "Lkotlinx/coroutines/j;", "Ltb/vu4;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ltb/ar4;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Ltb/ar4;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "s", "()Z", "Ltb/xhv;", at.j, "()V", "v", "Lkotlinx/coroutines/c;", at.k, "()Lkotlinx/coroutines/c;", "Ltb/q23;", "", AmnetConstant.VAL_SUPPORT_ZSTD, "(Ltb/q23;)Ljava/lang/Throwable;", "cause", "u", "(Ljava/lang/Throwable;)Z", "", bmv.MSGTYPE_INTERVAL, "()Ljava/lang/Object;", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "w", "(Ljava/lang/Object;Ltb/g1a;)V", "takenState", TplMsg.VALUE_T_NATIVE_RETURN, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "x", "(Ljava/lang/Object;)Z", "y", "Lkotlin/coroutines/d;", "context", "value", "m", "(Lkotlin/coroutines/d;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "d", "Lkotlinx/coroutines/CoroutineDispatcher;", "e", "Ltb/ar4;", "f", "Ljava/lang/Object;", o.b, "_state", at.f, "countOrElement", "n", "reusableCancellableContinuation", "getContext", "()Lkotlin/coroutines/d;", "getCallerFrame", "()Ltb/vu4;", "callerFrame", "()Ltb/ar4;", "delegate", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class uq7<T> extends j<T> implements vu4, ar4<T> {
    private static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(uq7.class, Object.class, "h");
    public final CoroutineDispatcher d;
    public final ar4<T> e;
    public Object f = vq7.f30175a;
    public final Object g = ThreadContextKt.b(getContext());
    @Volatile
    private volatile Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public uq7(CoroutineDispatcher coroutineDispatcher, ar4<? super T> ar4Var) {
        super(-1);
        this.d = coroutineDispatcher;
        this.e = ar4Var;
    }

    private final c<?> n() {
        Object obj = i.get(this);
        if (obj instanceof c) {
            return (c) obj;
        }
        return null;
    }

    private final void t(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, g1a<Object, xhv> g1aVar, Object obj) {
        while (true) {
            g1aVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlinx.coroutines.j
    public void b(Object obj, Throwable th) {
        if (obj instanceof ga4) {
            ((ga4) obj).b.invoke(th);
        }
    }

    @Override // tb.vu4
    public vu4 getCallerFrame() {
        ar4<T> ar4Var = this.e;
        if (ar4Var instanceof vu4) {
            return (vu4) ar4Var;
        }
        return null;
    }

    @Override // tb.ar4
    public d getContext() {
        return this.e.getContext();
    }

    @Override // tb.vu4
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.j
    public Object i() {
        Object obj = this.f;
        String str = dv6.DEBUG_PROPERTY_NAME;
        this.f = vq7.f30175a;
        return obj;
    }

    public final void j() {
        do {
        } while (i.get(this) == vq7.REUSABLE_CLAIMED);
    }

    public final c<T> k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                i.set(this, vq7.REUSABLE_CLAIMED);
                return null;
            } else if (obj instanceof c) {
                if (h30.a(i, this, obj, vq7.REUSABLE_CLAIMED)) {
                    return (c) obj;
                }
            } else if (obj != vq7.REUSABLE_CLAIMED && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void m(d dVar, T t) {
        this.f = t;
        this.c = 1;
        this.d.dispatchYield(dVar, this);
    }

    @Override // tb.ar4
    public void resumeWith(Object obj) {
        d context = this.e.getContext();
        Object d = ia4.d(obj, null, 1, null);
        if (this.d.isDispatchNeeded(context)) {
            this.f = d;
            this.c = 0;
            this.d.dispatch(context, this);
            return;
        }
        String str = dv6.DEBUG_PROPERTY_NAME;
        sk8 a2 = mqt.INSTANCE.a();
        if (a2.V0()) {
            this.f = d;
            this.c = 0;
            a2.Q0(this);
            return;
        }
        a2.S0(true);
        try {
            d context2 = getContext();
            Object c = ThreadContextKt.c(context2, this.g);
            this.e.resumeWith(obj);
            xhv xhvVar = xhv.INSTANCE;
            ThreadContextKt.a(context2, c);
            do {
            } while (a2.Y0());
        } catch (Throwable th) {
            try {
                g(th, null);
            } finally {
                a2.N0(true);
            }
        }
    }

    public final boolean s() {
        if (i.get(this) != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.d + ", " + ov6.c(this.e) + ']';
    }

    public final boolean u(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            u1r u1rVar = vq7.REUSABLE_CLAIMED;
            if (ckf.b(obj, u1rVar)) {
                if (h30.a(i, this, u1rVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (h30.a(i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void v() {
        j();
        c<?> n = n();
        if (n != null) {
            n.v();
        }
    }

    public final void w(Object obj, g1a<? super Throwable, xhv> g1aVar) {
        ogv<?> ogvVar;
        Object c = ia4.c(obj, g1aVar);
        if (this.d.isDispatchNeeded(getContext())) {
            this.f = c;
            this.c = 1;
            this.d.dispatch(getContext(), this);
            return;
        }
        String str = dv6.DEBUG_PROPERTY_NAME;
        sk8 a2 = mqt.INSTANCE.a();
        if (a2.V0()) {
            this.f = c;
            this.c = 1;
            a2.Q0(this);
            return;
        }
        a2.S0(true);
        try {
            m mVar = (m) getContext().get(m.Key);
            if (mVar == null || mVar.isActive()) {
                ar4<T> ar4Var = this.e;
                Object obj2 = this.g;
                d context = ar4Var.getContext();
                Object c2 = ThreadContextKt.c(context, obj2);
                if (c2 != ThreadContextKt.NO_THREAD_ELEMENTS) {
                    ogvVar = CoroutineContextKt.g(ar4Var, context, c2);
                } else {
                    ogvVar = null;
                }
                this.e.resumeWith(obj);
                xhv xhvVar = xhv.INSTANCE;
                if (ogvVar == null || ogvVar.w1()) {
                    ThreadContextKt.a(context, c2);
                }
            } else {
                CancellationException u0 = mVar.u0();
                b(c, u0);
                resumeWith(Result.m1108constructorimpl(b.a(u0)));
            }
            do {
            } while (a2.Y0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean x(Object obj) {
        m mVar = (m) getContext().get(m.Key);
        if (mVar == null || mVar.isActive()) {
            return false;
        }
        CancellationException u0 = mVar.u0();
        b(obj, u0);
        resumeWith(Result.m1108constructorimpl(b.a(u0)));
        return true;
    }

    public final void y(Object obj) {
        ogv<?> ogvVar;
        ar4<T> ar4Var = this.e;
        Object obj2 = this.g;
        d context = ar4Var.getContext();
        Object c = ThreadContextKt.c(context, obj2);
        if (c != ThreadContextKt.NO_THREAD_ELEMENTS) {
            ogvVar = CoroutineContextKt.g(ar4Var, context, c);
        } else {
            ogvVar = null;
        }
        try {
            this.e.resumeWith(obj);
            xhv xhvVar = xhv.INSTANCE;
        } finally {
            if (ogvVar == null || ogvVar.w1()) {
                ThreadContextKt.a(context, c);
            }
        }
    }

    public final Throwable z(q23<?> q23Var) {
        u1r u1rVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            u1rVar = vq7.REUSABLE_CLAIMED;
            if (obj != u1rVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (h30.a(i, this, obj, null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
        } while (!h30.a(i, this, u1rVar, q23Var));
        return null;
    }

    public static /* synthetic */ void o() {
    }

    @Override // kotlinx.coroutines.j
    public ar4<T> d() {
        return this;
    }
}
