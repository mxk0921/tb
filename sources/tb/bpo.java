package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 !*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u000fB!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Ltb/bpo;", "T", "Ltb/ar4;", "Ltb/vu4;", "delegate", "", "initialResult", "<init>", "(Ltb/ar4;Ljava/lang/Object;)V", "(Ltb/ar4;)V", "Lkotlin/Result;", "result", "Ltb/xhv;", "resumeWith", "(Ljava/lang/Object;)V", "a", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "toString", "()Ljava/lang/String;", "Ltb/ar4;", TplMsg.VALUE_T_NATIVE_RETURN, "Ljava/lang/Object;", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/d;", "context", "getCallerFrame", "()Ltb/vu4;", "callerFrame", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class bpo<T> implements ar4<T>, vu4 {
    private static final a c = new a(null);
    private static final AtomicReferenceFieldUpdater<bpo<?>, Object> d = AtomicReferenceFieldUpdater.newUpdater(bpo.class, Object.class, TplMsg.VALUE_T_NATIVE_RETURN);

    /* renamed from: a  reason: collision with root package name */
    private final ar4<T> f16535a;
    private volatile Object b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bpo(ar4<? super T> ar4Var, Object obj) {
        ckf.g(ar4Var, "delegate");
        this.f16535a = ar4Var;
        this.b = obj;
    }

    public final Object a() {
        Object obj = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            if (h30.a(d, this, coroutineSingletons, dkf.d())) {
                return dkf.d();
            }
            obj = this.b;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return dkf.d();
        }
        if (!(obj instanceof Result.Failure)) {
            return obj;
        }
        throw ((Result.Failure) obj).exception;
    }

    @Override // tb.vu4
    public vu4 getCallerFrame() {
        ar4<T> ar4Var = this.f16535a;
        if (ar4Var instanceof vu4) {
            return (vu4) ar4Var;
        }
        return null;
    }

    @Override // tb.ar4
    public d getContext() {
        return this.f16535a.getContext();
    }

    @Override // tb.vu4
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // tb.ar4
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                if (h30.a(d, this, coroutineSingletons, obj)) {
                    return;
                }
            } else if (obj2 != dkf.d()) {
                throw new IllegalStateException("Already resumed");
            } else if (h30.a(d, this, dkf.d(), CoroutineSingletons.RESUMED)) {
                this.f16535a.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f16535a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bpo(ar4<? super T> ar4Var) {
        this(ar4Var, CoroutineSingletons.UNDECIDED);
        ckf.g(ar4Var, "delegate");
    }
}
