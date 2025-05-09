package kotlinx.coroutines;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.a;
import kotlin.coroutines.b;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.apg;
import tb.ar4;
import tb.ckf;
import tb.g1a;
import tb.ov6;
import tb.pg1;
import tb.uq7;
import tb.zog;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00112\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!¨\u0006#"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/c;", "<init>", "()V", "Lkotlin/coroutines/d;", "context", "", "isDispatchNeeded", "(Lkotlin/coroutines/d;)Z", "", "parallelism", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", pg1.ATOM_EXT_block, "Ltb/xhv;", "dispatch", "(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V", "dispatchYield", "T", "Ltb/ar4;", "continuation", "interceptContinuation", "(Ltb/ar4;)Ltb/ar4;", "releaseInterceptedContinuation", "(Ltb/ar4;)V", "other", "plus", "(Lkotlinx/coroutines/CoroutineDispatcher;)Lkotlinx/coroutines/CoroutineDispatcher;", "", "toString", "()Ljava/lang/String;", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class CoroutineDispatcher extends a implements c {
    public static final Key Key = new Key(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class Key extends b<c, CoroutineDispatcher> {

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/d$b;", AdvanceSetting.NETWORK_TYPE, "Lkotlinx/coroutines/CoroutineDispatcher;", "invoke", "(Lkotlin/coroutines/d$b;)Lkotlinx/coroutines/CoroutineDispatcher;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.CoroutineDispatcher$Key$1  reason: invalid class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class AnonymousClass1 extends Lambda implements g1a<d.b, CoroutineDispatcher> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            public final CoroutineDispatcher invoke(d.b bVar) {
                if (bVar instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ Key(a07 a07Var) {
            this();
        }

        public Key() {
            super(c.Key, AnonymousClass1.INSTANCE);
        }
    }

    public CoroutineDispatcher() {
        super(c.Key);
    }

    public abstract void dispatch(d dVar, Runnable runnable);

    public void dispatchYield(d dVar, Runnable runnable) {
        dispatch(dVar, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) c.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.c
    public final <T> ar4<T> interceptContinuation(ar4<? super T> ar4Var) {
        return new uq7(this, ar4Var);
    }

    public boolean isDispatchNeeded(d dVar) {
        return true;
    }

    public CoroutineDispatcher limitedParallelism(int i) {
        apg.a(i);
        return new zog(this, i);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        return c.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.c
    public final void releaseInterceptedContinuation(ar4<?> ar4Var) {
        ckf.e(ar4Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((uq7) ar4Var).v();
    }

    public String toString() {
        return ov6.a(this) + '@' + ov6.b(this);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final CoroutineDispatcher plus(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }
}
