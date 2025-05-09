package kotlinx.coroutines;

import com.alibaba.security.realidentity.l1;
import com.alibaba.security.realidentity.p1;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.h;
import tb.ar4;
import tb.ckf;
import tb.dv6;
import tb.g1a;
import tb.h30;
import tb.hfn;
import tb.mqt;
import tb.nrt;
import tb.o5k;
import tb.ort;
import tb.pg1;
import tb.q23;
import tb.rr7;
import tb.s23;
import tb.u1r;
import tb.uch;
import tb.uk8;
import tb.w08;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004>?\u001d@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0004J%\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00122\n\u0010\u001f\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\n\u0010\u001f\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0004¢\u0006\u0004\b-\u0010\u0004R$\u00103\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00107\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b6\u0010$R\u0013\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109088\u0002X\u0082\u0004R\u000b\u0010<\u001a\u00020;8\u0002X\u0082\u0004R\u0013\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u000108088\u0002X\u0082\u0004¨\u0006A"}, d2 = {"Lkotlinx/coroutines/k;", "Lkotlinx/coroutines/l;", "Lkotlinx/coroutines/h;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "i1", "(Ljava/lang/Runnable;)Z", "g1", "()Ljava/lang/Runnable;", "Ltb/xhv;", "e1", "Lkotlinx/coroutines/k$c;", "r1", "(Lkotlinx/coroutines/k$c;)Z", "", pg1.ATOM_EXT_now, "delayedTask", "", "o1", "(JLkotlinx/coroutines/k$c;)I", l1.f, "shutdown", "timeMillis", "Ltb/q23;", "continuation", "c", "(JLtb/q23;)V", pg1.ATOM_EXT_block, "Ltb/rr7;", p1.d, "(JLjava/lang/Runnable;)Ltb/rr7;", "X0", "()J", "Lkotlin/coroutines/d;", "context", "dispatch", "(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V", "h1", "(Ljava/lang/Runnable;)V", "n1", "(JLkotlinx/coroutines/k$c;)V", "m1", "value", "j1", "()Z", "q1", "(Z)V", "isCompleted", "U0", "isEmpty", "R0", "nextTime", "", "Lkotlinx/coroutines/k$d;", "_delayed", "Ltb/qg1;", "_isCompleted", "_queue", "a", TplMsg.VALUE_T_NATIVE_RETURN, "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class k extends l implements h {
    private static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "d");
    private static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "e");
    private static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(k.class, "f");
    @Volatile
    private volatile Object d;
    @Volatile
    private volatile Object e;
    @Volatile
    private volatile int f = 0;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/k$a;", "Lkotlinx/coroutines/k$c;", "", "nanoTime", "Ltb/q23;", "Ltb/xhv;", "cont", "<init>", "(Lkotlinx/coroutines/k;JLtb/q23;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "d", "Ltb/q23;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class a extends c {
        private final q23<xhv> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j, q23<? super xhv> q23Var) {
            super(j);
            this.d = q23Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.r(k.this, xhv.INSTANCE);
        }

        @Override // kotlinx.coroutines.k.c
        public String toString() {
            return super.toString() + this.d;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/k$b;", "Lkotlinx/coroutines/k$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", pg1.ATOM_EXT_block, "<init>", "(JLjava/lang/Runnable;)V", "Ltb/xhv;", "run", "()V", "", "toString", "()Ljava/lang/String;", "d", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b extends c {
        private final Runnable d;

        public b(long j, Runnable runnable) {
            super(j);
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.run();
        }

        @Override // kotlinx.coroutines.k.c
        public String toString() {
            return super.toString() + this.d;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b \u0010)R0\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b\"\u0010/¨\u00061"}, d2 = {"Lkotlinx/coroutines/k$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Ltb/rr7;", "Ltb/ort;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "f", "(Lkotlinx/coroutines/k$c;)I", pg1.ATOM_EXT_now, "", "h", "(J)Z", "Lkotlinx/coroutines/k$d;", Baggage.Amnet.SECURITY_DELAYED, "Lkotlinx/coroutines/k;", "eventLoop", at.f, "(JLkotlinx/coroutines/k$d;Lkotlinx/coroutines/k;)I", "Ltb/xhv;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "()V", "", "toString", "()Ljava/lang/String;", "a", "J", TplMsg.VALUE_T_NATIVE_RETURN, "Ljava/lang/Object;", "_heap", "c", TLogTracker.LEVEL_INFO, "getIndex", "()I", "(I)V", "index", "Ltb/nrt;", "value", "e", "()Ltb/nrt;", "(Ltb/nrt;)V", "heap", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static abstract class c implements Runnable, Comparable<c>, rr7, ort {

        /* renamed from: a  reason: collision with root package name */
        public long f15384a;
        private volatile Object b;
        private int c = -1;

        public c(long j) {
            this.f15384a = j;
        }

        @Override // tb.ort
        public void a(int i) {
            this.c = i;
        }

        @Override // tb.ort
        public void b(nrt<?> nrtVar) {
            if (this.b != uk8.f29432a) {
                this.b = nrtVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        @Override // tb.rr7
        public final void dispose() {
            d dVar;
            synchronized (this) {
                try {
                    Object obj = this.b;
                    u1r u1rVar = uk8.f29432a;
                    if (obj != u1rVar) {
                        if (obj instanceof d) {
                            dVar = (d) obj;
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            dVar.g(this);
                        }
                        this.b = u1rVar;
                        xhv xhvVar = xhv.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // tb.ort
        public nrt<?> e() {
            Object obj = this.b;
            if (obj instanceof nrt) {
                return (nrt) obj;
            }
            return null;
        }

        /* renamed from: f */
        public int compareTo(c cVar) {
            int i = ((this.f15384a - cVar.f15384a) > 0L ? 1 : ((this.f15384a - cVar.f15384a) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            return 0;
        }

        public final int g(long j, d dVar, k kVar) {
            synchronized (this) {
                if (this.b == uk8.f29432a) {
                    return 2;
                }
                synchronized (dVar) {
                    c b = dVar.b();
                    if (kVar.j1()) {
                        return 1;
                    }
                    if (b == null) {
                        dVar.d = j;
                    } else {
                        long j2 = b.f15384a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - dVar.d > 0) {
                            dVar.d = j;
                        }
                    }
                    long j3 = this.f15384a;
                    long j4 = dVar.d;
                    if (j3 - j4 < 0) {
                        this.f15384a = j4;
                    }
                    dVar.a(this);
                    return 0;
                }
            }
        }

        @Override // tb.ort
        public int getIndex() {
            return this.c;
        }

        public final boolean h(long j) {
            if (j - this.f15384a >= 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f15384a + ']';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class d extends nrt<c> {
        public long d;

        public d(long j) {
            this.d = j;
        }
    }

    private final void e1() {
        String str = dv6.DEBUG_PROPERTY_NAME;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            u1r u1rVar = uk8.b;
            if (obj == null) {
                if (h30.a(g, this, null, u1rVar)) {
                    return;
                }
            } else if (obj instanceof uch) {
                ((uch) obj).d();
                return;
            } else if (obj != u1rVar) {
                uch uchVar = new uch(8, true);
                uchVar.a((Runnable) obj);
                if (h30.a(g, this, obj, uchVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final Runnable g1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof uch) {
                uch uchVar = (uch) obj;
                Object j = uchVar.j();
                if (j != uch.REMOVE_FROZEN) {
                    return (Runnable) j;
                }
                h30.a(g, this, obj, uchVar.i());
            } else if (obj == uk8.b) {
                return null;
            } else {
                if (h30.a(g, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean i1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (j1()) {
                return false;
            }
            if (obj == null) {
                if (h30.a(g, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof uch) {
                uch uchVar = (uch) obj;
                int a2 = uchVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    h30.a(g, this, obj, uchVar.i());
                } else if (a2 == 2) {
                    return false;
                }
            } else if (obj == uk8.b) {
                return false;
            } else {
                uch uchVar2 = new uch(8, true);
                uchVar2.a((Runnable) obj);
                uchVar2.a(runnable);
                if (h30.a(g, this, obj, uchVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j1() {
        if (i.get(this) != 0) {
            return true;
        }
        return false;
    }

    private final void k1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, g1a<Object, xhv> g1aVar, Object obj) {
        while (true) {
            g1aVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void l1() {
        c i2;
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) h.get(this);
            if (dVar != null && (i2 = dVar.i()) != null) {
                b1(nanoTime, i2);
            } else {
                return;
            }
        }
    }

    private final int o1(long j, c cVar) {
        if (j1()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            h30.a(atomicReferenceFieldUpdater, this, null, new d(j));
            Object obj = atomicReferenceFieldUpdater.get(this);
            ckf.d(obj);
            dVar = (d) obj;
        }
        return cVar.g(j, dVar, this);
    }

    private final void q1(boolean z) {
        i.set(this, z ? 1 : 0);
    }

    private final boolean r1(c cVar) {
        c cVar2;
        d dVar = (d) h.get(this);
        if (dVar != null) {
            cVar2 = dVar.e();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    @Override // tb.sk8
    public long R0() {
        c e;
        if (super.R0() == 0) {
            return 0L;
        }
        Object obj = g.get(this);
        if (obj != null) {
            if (obj instanceof uch) {
                if (!((uch) obj).g()) {
                    return 0L;
                }
            } else if (obj == uk8.b) {
                return Long.MAX_VALUE;
            } else {
                return 0L;
            }
        }
        d dVar = (d) h.get(this);
        if (dVar == null || (e = dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        return hfn.d(e.f15384a - System.nanoTime(), 0L);
    }

    @Override // tb.sk8
    public boolean U0() {
        if (!W0()) {
            return false;
        }
        d dVar = (d) h.get(this);
        if (dVar != null && !dVar.d()) {
            return false;
        }
        Object obj = g.get(this);
        if (obj != null) {
            if (obj instanceof uch) {
                return ((uch) obj).g();
            }
            if (obj != uk8.b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    @Override // tb.sk8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long X0() {
        /*
            r9 = this;
            boolean r0 = r9.Y0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.k.h
            java.lang.Object r0 = r0.get(r9)
            kotlinx.coroutines.k$d r0 = (kotlinx.coroutines.k.d) r0
            if (r0 == 0) goto L_0x0046
            boolean r3 = r0.d()
            if (r3 != 0) goto L_0x0046
            long r3 = java.lang.System.nanoTime()
        L_0x001d:
            monitor-enter(r0)
            tb.ort r5 = r0.b()     // Catch: all -> 0x0035
            r6 = 0
            if (r5 != 0) goto L_0x0027
            monitor-exit(r0)
            goto L_0x003f
        L_0x0027:
            kotlinx.coroutines.k$c r5 = (kotlinx.coroutines.k.c) r5     // Catch: all -> 0x0035
            boolean r7 = r5.h(r3)     // Catch: all -> 0x0035
            r8 = 0
            if (r7 == 0) goto L_0x0037
            boolean r5 = r9.i1(r5)     // Catch: all -> 0x0035
            goto L_0x0038
        L_0x0035:
            r1 = move-exception
            goto L_0x0044
        L_0x0037:
            r5 = 0
        L_0x0038:
            if (r5 == 0) goto L_0x003e
            tb.ort r6 = r0.h(r8)     // Catch: all -> 0x0035
        L_0x003e:
            monitor-exit(r0)
        L_0x003f:
            kotlinx.coroutines.k$c r6 = (kotlinx.coroutines.k.c) r6
            if (r6 != 0) goto L_0x001d
            goto L_0x0046
        L_0x0044:
            monitor-exit(r0)
            throw r1
        L_0x0046:
            java.lang.Runnable r0 = r9.g1()
            if (r0 == 0) goto L_0x0050
            r0.run()
            return r1
        L_0x0050:
            long r0 = r9.R0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.k.X0():long");
    }

    public rr7 b(long j, Runnable runnable, kotlin.coroutines.d dVar) {
        return h.a.b(this, j, runnable, dVar);
    }

    @Override // kotlinx.coroutines.h
    public void c(long j, q23<? super xhv> q23Var) {
        long b2 = uk8.b(j);
        if (b2 < w08.MAX_MILLIS) {
            long nanoTime = System.nanoTime();
            a aVar = new a(b2 + nanoTime, q23Var);
            n1(nanoTime, aVar);
            s23.a(q23Var, aVar);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        h1(runnable);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object f1(long j, ar4<? super xhv> ar4Var) {
        return h.a.a(this, j, ar4Var);
    }

    public void h1(Runnable runnable) {
        if (i1(runnable)) {
            c1();
        } else {
            g.INSTANCE.h1(runnable);
        }
    }

    public final void m1() {
        g.set(this, null);
        h.set(this, null);
    }

    public final void n1(long j, c cVar) {
        int o1 = o1(j, cVar);
        if (o1 != 0) {
            if (o1 == 1) {
                b1(j, cVar);
            } else if (o1 != 2) {
                throw new IllegalStateException("unexpected result");
            }
        } else if (r1(cVar)) {
            c1();
        }
    }

    public final rr7 p1(long j, Runnable runnable) {
        long b2 = uk8.b(j);
        if (b2 >= w08.MAX_MILLIS) {
            return o5k.INSTANCE;
        }
        long nanoTime = System.nanoTime();
        b bVar = new b(b2 + nanoTime, runnable);
        n1(nanoTime, bVar);
        return bVar;
    }

    @Override // tb.sk8
    public void shutdown() {
        mqt.INSTANCE.b();
        q1(true);
        e1();
        do {
        } while (X0() <= 0);
        l1();
    }
}
