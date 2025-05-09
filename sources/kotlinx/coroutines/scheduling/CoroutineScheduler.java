package kotlinx.coroutines.scheduling;

import com.alibaba.security.realidentity.o;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.Random;
import tb.a07;
import tb.bmv;
import tb.ckf;
import tb.dv6;
import tb.gca;
import tb.gdt;
import tb.hfn;
import tb.mix;
import tb.net;
import tb.ov6;
import tb.sct;
import tb.u1r;
import tb.vft;
import tb.x6o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;

    /* renamed from: a  reason: collision with root package name */
    public final int f15387a;
    public final int b;
    public final long c;
    public final String d;
    public final gca e;
    public final gca f;
    @Volatile
    public volatile long g;
    public final x6o<c> h;
    @Volatile
    public volatile long i;
    @Volatile
    public volatile int j;
    public static final a Companion = new a(null);
    public static final AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, at.f);
    public static final AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, bmv.MSGTYPE_INTERVAL);
    public static final AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, at.j);
    public static final u1r NOT_IN_STACK = new u1r("NOT_IN_STACK");

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CoroutineScheduler(int i, int i2, long j, String str) {
        this.f15387a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        } else if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j > 0) {
            this.e = new gca();
            this.f = new gca();
            this.h = new x6o<>((i + 1) * 2);
            this.i = i << 42;
            this.j = 0;
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
    }

    public static /* synthetic */ void L(CoroutineScheduler coroutineScheduler, Runnable runnable, gdt gdtVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            gdtVar = vft.NonBlockingContext;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.F(runnable, gdtVar, z);
    }

    public static /* synthetic */ boolean L0(CoroutineScheduler coroutineScheduler, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = l.get(coroutineScheduler);
        }
        return coroutineScheduler.E0(j);
    }

    public final sct A(Runnable runnable, gdt gdtVar) {
        long a2 = vft.f29991a.a();
        if (!(runnable instanceof sct)) {
            return new net(runnable, a2, gdtVar);
        }
        sct sctVar = (sct) runnable;
        sctVar.f27955a = a2;
        sctVar.b = gdtVar;
        return sctVar;
    }

    public final void B0(long j, boolean z) {
        if (!z && !M0() && !E0(j)) {
            M0();
        }
    }

    public final c C() {
        c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof c) {
            cVar = (c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !ckf.b(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void C0() {
        if (!M0() && !L0(this, 0L, 1, null)) {
            M0();
        }
    }

    public final sct D0(c cVar, sct sctVar, boolean z) {
        if (cVar == null) {
            return sctVar;
        }
        if (cVar.d == WorkerState.TERMINATED) {
            return sctVar;
        }
        if (sctVar.b.b() == 0 && cVar.d == WorkerState.BLOCKING) {
            return sctVar;
        }
        cVar.j = true;
        return cVar.b.a(sctVar, z);
    }

    public final boolean E0(long j) {
        int c2 = hfn.c(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0);
        int i = this.f15387a;
        if (c2 < i) {
            int w = w();
            if (w == 1 && i > 1) {
                w();
            }
            if (w > 0) {
                return true;
            }
        }
        return false;
    }

    public final void F(Runnable runnable, gdt gdtVar, boolean z) {
        boolean z2;
        long j;
        sct A = A(runnable, gdtVar);
        boolean z3 = false;
        if (A.b.b() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            j = l.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        c C = C();
        sct D0 = D0(C, A, z);
        if (D0 == null || g(D0)) {
            if (z && C != null) {
                z3 = true;
            }
            if (z2) {
                B0(j, z3);
            } else if (!z3) {
                C0();
            }
        } else {
            throw new RejectedExecutionException(this.d + " was terminated");
        }
    }

    public final boolean M0() {
        c c0;
        do {
            c0 = c0();
            if (c0 == null) {
                return false;
            }
        } while (!c.m().compareAndSet(c0, -1, 0));
        LockSupport.unpark(c0);
        return true;
    }

    public final int Z(c cVar) {
        Object j = cVar.j();
        while (j != NOT_IN_STACK) {
            if (j == null) {
                return 0;
            }
            c cVar2 = (c) j;
            int i = cVar2.i();
            if (i != 0) {
                return i;
            }
            j = cVar2.j();
        }
        return -1;
    }

    public final c c0() {
        while (true) {
            long j = k.get(this);
            c b2 = this.h.b((int) (2097151 & j));
            if (b2 == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int Z = Z(b2);
            if (Z >= 0) {
                if (k.compareAndSet(this, j, Z | j2)) {
                    b2.w(NOT_IN_STACK);
                    return b2;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        u0(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        L(this, runnable, null, false, 6, null);
    }

    public final boolean f0(c cVar) {
        long j;
        int i;
        if (cVar.j() != NOT_IN_STACK) {
            return false;
        }
        do {
            j = k.get(this);
            i = cVar.i();
            String str = dv6.DEBUG_PROPERTY_NAME;
            cVar.w(this.h.b((int) (2097151 & j)));
        } while (!k.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | i));
        return true;
    }

    public final boolean g(sct sctVar) {
        if (sctVar.b.b() == 1) {
            return this.f.a(sctVar);
        }
        return this.e.a(sctVar);
    }

    public final void i0(c cVar, int i, int i2) {
        while (true) {
            long j = k.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = Z(cVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (k.compareAndSet(this, j, j2 | i3)) {
                    return;
                }
            }
        }
    }

    public final boolean isTerminated() {
        if (m.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final void n0(sct sctVar) {
        try {
            sctVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        x6o<c> x6oVar = this.h;
        int a2 = x6oVar.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a2; i6++) {
            c b2 = x6oVar.b(i6);
            if (b2 != null) {
                int e = b2.b.e();
                int i7 = b.$EnumSwitchMapping$0[b2.d.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(e);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (e > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(e);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(ov6.b(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f15387a;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final void u0(long j) {
        int i;
        sct sctVar;
        if (m.compareAndSet(this, 0, 1)) {
            c C = C();
            synchronized (this.h) {
                i = (int) (l.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    c b2 = this.h.b(i2);
                    ckf.d(b2);
                    c cVar = b2;
                    if (cVar != C) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        String str = dv6.DEBUG_PROPERTY_NAME;
                        cVar.b.f(this.f);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (C != null) {
                    sctVar = C.h(true);
                    if (sctVar != null) {
                        continue;
                        n0(sctVar);
                    }
                }
                sctVar = this.e.d();
                if (sctVar == null && (sctVar = this.f.d()) == null) {
                    break;
                }
                n0(sctVar);
            }
            if (C != null) {
                C.z(WorkerState.TERMINATED);
            }
            String str2 = dv6.DEBUG_PROPERTY_NAME;
            k.set(this, 0L);
            l.set(this, 0L);
        }
    }

    public final int w() {
        synchronized (this.h) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = l;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int c2 = hfn.c(i - ((int) ((j & 4398044413952L) >> 21)), 0);
                if (c2 >= this.f15387a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i2 = ((int) (l.get(this) & 2097151)) + 1;
                if (i2 <= 0 || this.h.b(i2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i2);
                this.h.c(i2, cVar);
                if (i2 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i3 = c2 + 1;
                    cVar.start();
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b!\u0010\u001cJ\u001d\u0010$\u001a\u0004\u0018\u00010\u000f2\n\u0010#\u001a\u00060\u0004j\u0002`\"H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010\fJ\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\tJ\u0015\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0004\u0018\u00010\u000f2\u0006\u00102\u001a\u00020\u0007¢\u0006\u0004\b3\u0010 R*\u00109\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0015R\u0014\u0010<\u001a\u00020:8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010;R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010>R\u0016\u0010A\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010@R\u0016\u0010C\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010BR$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010BR\u0016\u0010L\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u00102\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010MR\u0012\u0010Q\u001a\u00020N8Æ\u0002¢\u0006\u0006\u001a\u0004\bO\u0010PR\b\u0010R\u001a\u00020D8\u0006¨\u0006S"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "Ljava/lang/Thread;", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "", "index", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "", "x", "()Z", "Ltb/xhv;", "u", "()V", "y", o.b, "Ltb/sct;", "task", "d", "(Ltb/sct;)V", "taskMode", "c", "(I)V", TplMsg.VALUE_T_NATIVE_RETURN, "r", "B", "mode", "n", "f", "()Ltb/sct;", at.f, "scanLocalQueue", "e", "(Z)Ltb/sct;", "s", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "A", "(I)Ltb/sct;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", AmnetConstant.VAL_SUPPORT_ZSTD, "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "run", "", "t", "()J", "p", "upperBound", "q", "(I)I", "mayHaveLocalTasks", "h", "a", TLogTracker.LEVEL_INFO, bmv.MSGTYPE_INTERVAL, "()I", "v", "indexInArray", "Ltb/mix;", "Ltb/mix;", "localQueue", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTask", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "state", "J", "terminationDeadline", "", "Ljava/lang/Object;", at.j, "()Ljava/lang/Object;", "w", "(Ljava/lang/Object;)V", "nextParkedWorker", "minDelayUntilStealableTaskNs", "rngState", "Z", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", at.k, "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "scheduler", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class c extends Thread {
        private static final AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(c.class, "e");

        /* renamed from: a  reason: collision with root package name */
        private volatile int f15388a;
        public final mix b;
        private final Ref$ObjectRef<sct> c;
        public WorkerState d;
        @Volatile
        private volatile int e;
        private long f;
        private volatile Object g;
        private long h;
        private int i;
        public boolean j;

        private c() {
            setDaemon(true);
            this.b = new mix();
            this.c = new Ref$ObjectRef<>();
            this.d = WorkerState.DORMANT;
            this.g = CoroutineScheduler.NOT_IN_STACK;
            this.i = Random.Default.nextInt();
        }

        private final sct A(int i) {
            int i2 = (int) (CoroutineScheduler.l.get(CoroutineScheduler.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int q = q(i2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                q++;
                if (q > i2) {
                    q = 1;
                }
                c b = coroutineScheduler.h.b(q);
                if (b != null && b != this) {
                    long o = b.b.o(i, this.c);
                    if (o == -1) {
                        Ref$ObjectRef<sct> ref$ObjectRef = this.c;
                        sct sctVar = ref$ObjectRef.element;
                        ref$ObjectRef.element = null;
                        return sctVar;
                    } else if (o > 0) {
                        j = Math.min(j, o);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.h = j;
            return null;
        }

        private final void B() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.h) {
                try {
                    if (!coroutineScheduler.isTerminated()) {
                        if (((int) (CoroutineScheduler.l.get(coroutineScheduler) & 2097151)) > coroutineScheduler.f15387a) {
                            if (l.compareAndSet(this, -1, 1)) {
                                int i = this.f15388a;
                                v(0);
                                coroutineScheduler.i0(this, i, 0);
                                int andDecrement = (int) (CoroutineScheduler.l.getAndDecrement(coroutineScheduler) & 2097151);
                                if (andDecrement != i) {
                                    c b = coroutineScheduler.h.b(andDecrement);
                                    ckf.d(b);
                                    c cVar = b;
                                    coroutineScheduler.h.c(i, cVar);
                                    cVar.v(i);
                                    coroutineScheduler.i0(cVar, andDecrement, i);
                                }
                                coroutineScheduler.h.c(andDecrement, null);
                                xhv xhvVar = xhv.INSTANCE;
                                this.d = WorkerState.TERMINATED;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private final void b(int i) {
            if (i != 0) {
                CoroutineScheduler.l.addAndGet(CoroutineScheduler.this, -2097152L);
                if (this.d != WorkerState.TERMINATED) {
                    String str = dv6.DEBUG_PROPERTY_NAME;
                    this.d = WorkerState.DORMANT;
                }
            }
        }

        private final void c(int i) {
            if (i != 0 && z(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.C0();
            }
        }

        private final void d(sct sctVar) {
            int b = sctVar.b.b();
            n(b);
            c(b);
            CoroutineScheduler.this.n0(sctVar);
            b(b);
        }

        private final sct e(boolean z) {
            boolean z2;
            sct s;
            sct s2;
            if (z) {
                if (q(CoroutineScheduler.this.f15387a * 2) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (s2 = s()) != null) {
                    return s2;
                }
                sct g = this.b.g();
                if (g != null) {
                    return g;
                }
                if (!z2 && (s = s()) != null) {
                    return s;
                }
            } else {
                sct s3 = s();
                if (s3 != null) {
                    return s3;
                }
            }
            return A(3);
        }

        private final sct f() {
            sct h = this.b.h();
            if (h != null) {
                return h;
            }
            sct d = CoroutineScheduler.this.f.d();
            if (d == null) {
                return A(1);
            }
            return d;
        }

        private final sct g() {
            sct j = this.b.j();
            if (j != null) {
                return j;
            }
            sct d = CoroutineScheduler.this.f.d();
            if (d == null) {
                return A(2);
            }
            return d;
        }

        public static final AtomicIntegerFieldUpdater m() {
            return l;
        }

        private final void n(int i) {
            this.f = 0L;
            if (this.d == WorkerState.PARKING) {
                String str = dv6.DEBUG_PROPERTY_NAME;
                this.d = WorkerState.BLOCKING;
            }
        }

        private final boolean o() {
            if (this.g != CoroutineScheduler.NOT_IN_STACK) {
                return true;
            }
            return false;
        }

        private final void r() {
            if (this.f == 0) {
                this.f = System.nanoTime() + CoroutineScheduler.this.c;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.c);
            if (System.nanoTime() - this.f >= 0) {
                this.f = 0L;
                B();
            }
        }

        private final sct s() {
            if (q(2) == 0) {
                sct d = CoroutineScheduler.this.e.d();
                if (d != null) {
                    return d;
                }
                return CoroutineScheduler.this.f.d();
            }
            sct d2 = CoroutineScheduler.this.f.d();
            if (d2 != null) {
                return d2;
            }
            return CoroutineScheduler.this.e.d();
        }

        private final void u() {
            loop0: while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.isTerminated() && this.d != WorkerState.TERMINATED) {
                    sct h = h(this.j);
                    if (h != null) {
                        this.h = 0L;
                        d(h);
                    } else {
                        this.j = false;
                        if (this.h == 0) {
                            y();
                        } else if (!z) {
                            z = true;
                        } else {
                            z(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.h);
                            this.h = 0L;
                        }
                    }
                }
            }
            z(WorkerState.TERMINATED);
        }

        private final boolean x() {
            long j;
            if (this.d == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.l;
            do {
                j = atomicLongFieldUpdater.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.l.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
            this.d = WorkerState.CPU_ACQUIRED;
            return true;
        }

        private final void y() {
            if (!o()) {
                CoroutineScheduler.this.f0(this);
                return;
            }
            l.set(this, -1);
            while (o() && l.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.d != WorkerState.TERMINATED) {
                z(WorkerState.PARKING);
                Thread.interrupted();
                r();
            }
        }

        public final sct h(boolean z) {
            if (x()) {
                return e(z);
            }
            return f();
        }

        public final int i() {
            return this.f15388a;
        }

        public final Object j() {
            return this.g;
        }

        public final CoroutineScheduler k() {
            return CoroutineScheduler.this;
        }

        public final int l() {
            return this.e;
        }

        public final boolean p() {
            if (this.d == WorkerState.BLOCKING) {
                return true;
            }
            return false;
        }

        public final int q(int i) {
            int i2 = this.i;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.i = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            u();
        }

        public final long t() {
            boolean z;
            sct sctVar;
            if (this.d == WorkerState.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sctVar = g();
            } else {
                sctVar = f();
            }
            if (sctVar == null) {
                long j = this.h;
                if (j == 0) {
                    return -1L;
                }
                return j;
            }
            CoroutineScheduler.this.n0(sctVar);
            if (!z) {
                CoroutineScheduler.l.addAndGet(CoroutineScheduler.this, -2097152L);
            }
            String str = dv6.DEBUG_PROPERTY_NAME;
            return 0L;
        }

        public final void v(int i) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.d);
            sb.append("-worker-");
            if (i == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i);
            }
            sb.append(str);
            setName(sb.toString());
            this.f15388a = i;
        }

        public final void w(Object obj) {
            this.g = obj;
        }

        public final boolean z(WorkerState workerState) {
            boolean z;
            WorkerState workerState2 = this.d;
            if (workerState2 == WorkerState.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CoroutineScheduler.l.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.d = workerState;
            }
            return z;
        }

        public c(CoroutineScheduler coroutineScheduler, int i) {
            this();
            v(i);
        }
    }
}
