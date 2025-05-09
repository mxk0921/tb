package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.ScoreLevel;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.j;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0003R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u0014\u0010(\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\nR\u0011\u0010)\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0011\u0010+\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\fR\u0011\u0010-\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b,\u0010\f¨\u0006."}, d2 = {"Ltb/sk8;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "", "unconfined", "", "P0", "(Z)J", "X0", "()J", "Y0", "()Z", "Z0", "Lkotlinx/coroutines/j;", "task", "Ltb/xhv;", "Q0", "(Lkotlinx/coroutines/j;)V", "S0", "(Z)V", ScoreLevel.N0, "", "parallelism", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "shutdown", "a", "J", "useCount", TplMsg.VALUE_T_NATIVE_RETURN, "Z", "shared", "Ltb/ob1;", "c", "Ltb/ob1;", "unconfinedQueue", "U0", "isEmpty", "R0", "nextTime", "isActive", "V0", "isUnconfinedLoopActive", "W0", "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class sk8 extends CoroutineDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private long f28107a;
    private boolean b;
    private ob1<j<?>> c;

    public static /* synthetic */ void O0(sk8 sk8Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            sk8Var.N0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long P0(boolean z) {
        if (z) {
            return 4294967296L;
        }
        return 1L;
    }

    public static /* synthetic */ void T0(sk8 sk8Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            sk8Var.S0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void N0(boolean z) {
        long P0 = this.f28107a - P0(z);
        this.f28107a = P0;
        if (P0 <= 0) {
            String str = dv6.DEBUG_PROPERTY_NAME;
            if (this.b) {
                shutdown();
            }
        }
    }

    public final void Q0(j<?> jVar) {
        ob1<j<?>> ob1Var = this.c;
        if (ob1Var == null) {
            ob1Var = new ob1<>();
            this.c = ob1Var;
        }
        ob1Var.addLast(jVar);
    }

    public long R0() {
        ob1<j<?>> ob1Var = this.c;
        if (ob1Var != null && !ob1Var.isEmpty()) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    public final void S0(boolean z) {
        this.f28107a += P0(z);
        if (!z) {
            this.b = true;
        }
    }

    public boolean U0() {
        return W0();
    }

    public final boolean V0() {
        if (this.f28107a >= P0(true)) {
            return true;
        }
        return false;
    }

    public final boolean W0() {
        ob1<j<?>> ob1Var = this.c;
        if (ob1Var != null) {
            return ob1Var.isEmpty();
        }
        return true;
    }

    public long X0() {
        if (!Y0()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean Y0() {
        j<?> k;
        ob1<j<?>> ob1Var = this.c;
        if (ob1Var == null || (k = ob1Var.k()) == null) {
            return false;
        }
        k.run();
        return true;
    }

    public boolean Z0() {
        return false;
    }

    public final boolean isActive() {
        if (this.f28107a > 0) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i) {
        apg.a(i);
        return this;
    }

    public void shutdown() {
    }
}
