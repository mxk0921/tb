package kotlinx.coroutines.debug.internal;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.jvm.Volatile;
import tb.a07;
import tb.ar4;
import tb.bv6;
import tb.ckf;
import tb.g1a;
import tb.kqu;
import tb.pc1;
import tb.qgq;
import tb.vu4;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a {
    public static final a INSTANCE;
    public static final g1a<Boolean, xhv> b;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentWeakMap<C0861a<?>, Boolean> f15265a = new ConcurrentWeakMap<>(false, 1, null);
    public static final ConcurrentWeakMap<vu4, bv6> c = new ConcurrentWeakMap<>(true);

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lkotlinx/coroutines/debug/internal/a$a;", "T", "Ltb/ar4;", "Ltb/vu4;", "delegate", "Ltb/bv6;", "info", "<init>", "(Ltb/ar4;Ltb/bv6;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "Ltb/xhv;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "Ltb/ar4;", TplMsg.VALUE_T_NATIVE_RETURN, "Ltb/bv6;", "Ltb/qgq;", "()Ltb/qgq;", "frame", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/d;", "context", "getCallerFrame", "()Ltb/vu4;", "callerFrame", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.debug.internal.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class C0861a<T> implements ar4<T>, vu4 {

        /* renamed from: a  reason: collision with root package name */
        public final ar4<T> f15266a;
        public final bv6 b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0861a(ar4<? super T> ar4Var, bv6 bv6Var) {
            this.f15266a = ar4Var;
        }

        private final qgq a() {
            this.b.getClass();
            return null;
        }

        @Override // tb.vu4
        public vu4 getCallerFrame() {
            a();
            return null;
        }

        @Override // tb.ar4
        public d getContext() {
            return this.f15266a.getContext();
        }

        @Override // tb.vu4
        public StackTraceElement getStackTraceElement() {
            a();
            return null;
        }

        @Override // tb.ar4
        public void resumeWith(Object obj) {
            a.INSTANCE.f(this);
            this.f15266a.resumeWith(obj);
        }

        public String toString() {
            return this.f15266a.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b {
        @Volatile

        /* renamed from: a  reason: collision with root package name */
        public volatile int f15267a;

        static {
            AtomicIntegerFieldUpdater.newUpdater(b.class, "a");
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class c {
        @Volatile

        /* renamed from: a  reason: collision with root package name */
        public volatile long f15268a;

        static {
            AtomicLongFieldUpdater.newUpdater(c.class, "a");
        }

        public c() {
        }

        public /* synthetic */ c(a07 a07Var) {
            this();
        }
    }

    static {
        a aVar = new a();
        INSTANCE = aVar;
        new pc1().b();
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        b = aVar.d();
        new b(null);
        new c(null);
    }

    public static final /* synthetic */ boolean b(a aVar, C0861a aVar2) {
        aVar.e(aVar2);
        throw null;
    }

    public final g1a<Boolean, xhv> d() {
        Object obj;
        try {
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            ckf.e(newInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            kqu.e(newInstance, 1);
            obj = Result.m1108constructorimpl((g1a) newInstance);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        if (Result.m1114isFailureimpl(obj)) {
            obj = null;
        }
        return (g1a) obj;
    }

    public final boolean e(C0861a<?> aVar) {
        aVar.b.b();
        throw null;
    }

    public final void f(C0861a<?> aVar) {
        f15265a.remove(aVar);
        aVar.b.getClass();
    }
}
