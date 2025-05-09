package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.android.HandlerContext;
import tb.a07;
import tb.ckf;
import tb.dsa;
import tb.hfn;
import tb.o5k;
import tb.q23;
import tb.quf;
import tb.rr7;
import tb.w08;
import tb.xhv;
import tb.zq7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class HandlerContext extends dsa {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f15249a;
    public final String b;
    public final boolean c;
    public volatile HandlerContext d;
    public final HandlerContext e;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "tb/ajo", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q23 f15250a;
        final /* synthetic */ HandlerContext b;

        public a(q23 q23Var, HandlerContext handlerContext) {
            this.f15250a = q23Var;
            this.b = handlerContext;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f15250a.r(this.b, xhv.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerContext(Handler handler, String str, boolean z) {
        super(null);
        HandlerContext handlerContext = null;
        this.f15249a = handler;
        this.b = str;
        this.c = z;
        this.d = z ? this : handlerContext;
        HandlerContext handlerContext2 = this.d;
        if (handlerContext2 == null) {
            handlerContext2 = new HandlerContext(handler, str, true);
            this.d = handlerContext2;
        }
        this.e = handlerContext2;
    }

    public static final void T0(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.f15249a.removeCallbacks(runnable);
    }

    public final void R0(d dVar, Runnable runnable) {
        quf.c(dVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        zq7.b().dispatch(dVar, runnable);
    }

    /* renamed from: S0 */
    public HandlerContext N0() {
        return this.e;
    }

    @Override // tb.dsa, kotlinx.coroutines.h
    public rr7 b(long j, final Runnable runnable, d dVar) {
        if (this.f15249a.postDelayed(runnable, hfn.g(j, w08.MAX_MILLIS))) {
            return new rr7() { // from class: tb.csa
                @Override // tb.rr7
                public final void dispose() {
                    HandlerContext.T0(HandlerContext.this, runnable);
                }
            };
        }
        R0(dVar, runnable);
        return o5k.INSTANCE;
    }

    @Override // kotlinx.coroutines.h
    public void c(long j, q23<? super xhv> q23Var) {
        a aVar = new a(q23Var, this);
        if (this.f15249a.postDelayed(aVar, hfn.g(j, w08.MAX_MILLIS))) {
            q23Var.h(new HandlerContext$scheduleResumeAfterDelay$1(this, aVar));
        } else {
            R0(q23Var.getContext(), aVar);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(d dVar, Runnable runnable) {
        if (!this.f15249a.post(runnable)) {
            R0(dVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext) || ((HandlerContext) obj).f15249a != this.f15249a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f15249a);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(d dVar) {
        if (!this.c || !ckf.b(Looper.myLooper(), this.f15249a.getLooper())) {
            return true;
        }
        return false;
    }

    @Override // tb.fzh, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String O0 = O0();
        if (O0 != null) {
            return O0;
        }
        String str = this.b;
        if (str == null) {
            str = this.f15249a.toString();
        }
        if (!this.c) {
            return str;
        }
        return str + ".immediate";
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i, a07 a07Var) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
