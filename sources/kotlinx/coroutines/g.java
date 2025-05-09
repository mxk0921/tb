package kotlinx.coroutines;

import com.alibaba.security.realidentity.b1;
import com.alibaba.security.realidentity.o;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.sdk.m.f.b;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.k;
import tb.dv6;
import tb.hfn;
import tb.lca;
import tb.mqt;
import tb.pg1;
import tb.rr7;
import tb.sk8;
import tb.zzi;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0016\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u0010\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010\u001a\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u0006H\u0000¢\u0006\u0004\b!\u0010\u0005J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001e\u00100\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010\u0005R\u0014\u00104\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00108\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00103R\u0014\u0010:\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00103R\u0014\u0010<\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u00103R\u0016\u0010>\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00103R\u0014\u0010@\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\rR\u0014\u0010B\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010D\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\nR\u0014\u0010F\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\r¨\u0006G"}, d2 = {"Lkotlinx/coroutines/g;", "Lkotlinx/coroutines/k;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "Ltb/xhv;", "A1", "Ljava/lang/Thread;", lca.STAGE_T1, "()Ljava/lang/Thread;", "", "z1", "()Z", "s1", "task", "h1", "(Ljava/lang/Runnable;)V", "", pg1.ATOM_EXT_now, "Lkotlinx/coroutines/k$c;", "delayedTask", b1.f2663a, "(JLkotlinx/coroutines/k$c;)V", "shutdown", "timeMillis", pg1.ATOM_EXT_block, "Lkotlin/coroutines/d;", "context", "Ltb/rr7;", TplMsg.VALUE_T_NATIVE_RETURN, "(JLjava/lang/Runnable;Lkotlin/coroutines/d;)Ltb/rr7;", "run", "u1", "timeout", "B1", "(J)V", "", "THREAD_NAME", "Ljava/lang/String;", at.j, "J", "DEFAULT_KEEP_ALIVE_MS", at.k, "KEEP_ALIVE_NANOS", "l", "Ljava/lang/Thread;", b.c, "_thread", "", "m", TLogTracker.LEVEL_INFO, "FRESH", "n", "ACTIVE", o.b, "SHUTDOWN_REQ", "p", "SHUTDOWN_ACK", "q", zzi.SHUTDOWN_REQ, "r", "debugStatus", "w1", "isShutDown", "x1", "isShutdownRequested", "a1", "thread", "y1", "isThreadPresent", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class g extends k implements Runnable {
    public static final g INSTANCE;
    public static final String THREAD_NAME = "kotlinx.coroutines.DefaultExecutor";
    private static final long j = 1000;
    private static final long k;
    private static volatile Thread l = null;
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 3;
    private static final int q = 4;
    private static volatile int r;

    static {
        Long l2;
        g gVar = new g();
        INSTANCE = gVar;
        sk8.T0(gVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        k = timeUnit.toNanos(l2.longValue());
    }

    private g() {
    }

    private final void A1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized void s1() {
        if (x1()) {
            r = 3;
            m1();
            notifyAll();
        }
    }

    private final synchronized Thread t1() {
        Thread thread;
        thread = l;
        if (thread == null) {
            thread = new Thread(this, THREAD_NAME);
            l = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean w1() {
        if (r == 4) {
            return true;
        }
        return false;
    }

    private final boolean x1() {
        int i = r;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    private final synchronized boolean z1() {
        if (x1()) {
            return false;
        }
        r = 1;
        notifyAll();
        return true;
    }

    public final synchronized void B1(long j2) {
        try {
            long currentTimeMillis = System.currentTimeMillis() + j2;
            if (!x1()) {
                r = 2;
            }
            while (r != 3 && l != null) {
                Thread thread = l;
                if (thread != null) {
                    LockSupport.unpark(thread);
                }
                if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                    break;
                }
                wait(j2);
            }
            r = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // kotlinx.coroutines.l
    public Thread a1() {
        Thread thread = l;
        if (thread == null) {
            return t1();
        }
        return thread;
    }

    @Override // kotlinx.coroutines.k, kotlinx.coroutines.h
    public rr7 b(long j2, Runnable runnable, d dVar) {
        return p1(j2, runnable);
    }

    @Override // kotlinx.coroutines.l
    public void b1(long j2, k.c cVar) {
        A1();
        throw null;
    }

    @Override // kotlinx.coroutines.k
    public void h1(Runnable runnable) {
        if (!w1()) {
            super.h1(runnable);
        } else {
            A1();
            throw null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        mqt.INSTANCE.c(this);
        try {
            if (z1()) {
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long X0 = X0();
                    if (X0 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = k + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            l = null;
                            s1();
                            if (!U0()) {
                                a1();
                                return;
                            }
                            return;
                        }
                        X0 = hfn.g(X0, j3);
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (X0 > 0) {
                        if (x1()) {
                            l = null;
                            s1();
                            if (!U0()) {
                                a1();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, X0);
                    }
                }
            }
        } finally {
            l = null;
            s1();
            if (!U0()) {
                a1();
            }
        }
    }

    @Override // kotlinx.coroutines.k, tb.sk8
    public void shutdown() {
        r = 4;
        super.shutdown();
    }

    public final synchronized void u1() {
        String str = dv6.DEBUG_PROPERTY_NAME;
        r = 0;
        t1();
        while (r == 0) {
            wait();
        }
    }

    public final boolean y1() {
        if (l != null) {
            return true;
        }
        return false;
    }

    private static /* synthetic */ void v1() {
    }
}
