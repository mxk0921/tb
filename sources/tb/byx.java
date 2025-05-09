package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.f.f;
import tb.day;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class byx extends day {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b b;
    public static final f c;
    public static final int d = e(Runtime.getRuntime().availableProcessors(), s15.d().c());
    public static final c e;
    public final AtomicReference<b> h;
    public final ThreadFactory j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends day.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final mzx f16725a;
        public final eux b;
        public final mzx c;
        public final c d;
        public volatile boolean e;

        static {
            t2o.a(628097504);
        }

        public a(c cVar) {
            this.d = cVar;
            mzx mzxVar = new mzx();
            this.f16725a = mzxVar;
            eux euxVar = new eux();
            this.b = euxVar;
            mzx mzxVar2 = new mzx();
            this.c = mzxVar2;
            mzxVar2.a(mzxVar);
            mzxVar2.a(euxVar);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/f/b$a");
        }

        @Override // tb.day.c
        public sxx b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (sxx) ipChange.ipc$dispatch("895389e0", new Object[]{this, runnable}) : this.e ? tao.reactivex.d.a.b.INSTANCE : this.d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f16725a);
        }

        @Override // tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (!this.e) {
                this.e = true;
                this.c.b_();
            }
        }

        @Override // tb.day.c
        public sxx d(Runnable runnable, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sxx) ipChange.ipc$dispatch("57bda9d4", new Object[]{this, runnable, new Long(j), timeUnit});
            }
            if (this.e) {
                return tao.reactivex.d.a.b.INSTANCE;
            }
            return this.d.e(runnable, j, timeUnit, this.b);
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.e;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f16726a;
        public final c[] b;
        public long c;

        static {
            t2o.a(628097505);
        }

        public b(int i, ThreadFactory threadFactory) {
            this.f16726a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("a482075e", new Object[]{this});
            }
            int i = this.f16726a;
            if (i == 0) {
                return byx.e;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % i)];
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            for (c cVar : this.b) {
                cVar.b_();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class c extends r5y {
        static {
            t2o.a(628097506);
        }

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        t2o.a(628097503);
        c cVar = new c(new f("PmComputationShutdown"));
        e = cVar;
        cVar.b_();
        f fVar = new f("PmComputationThreadPool", 5, true);
        c = fVar;
        b bVar = new b(0, fVar);
        b = bVar;
        bVar.b();
    }

    public byx() {
        this(c);
    }

    public static int e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 <= 0 || i2 > i) {
            return i;
        }
        return i2;
    }

    public static /* synthetic */ Object ipc$super(byx byxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/f/b");
    }

    @Override // tb.day
    public sxx b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("91d6798c", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        return this.h.get().a().f(runnable, j, j2, timeUnit);
    }

    @Override // tb.day
    public sxx c(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("57bda9d4", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        return this.h.get().a().g(runnable, j, timeUnit);
    }

    @Override // tb.day
    public day.c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (day.c) ipChange.ipc$dispatch("96f4a96c", new Object[]{this});
        }
        return new a(this.h.get().a());
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        b bVar = new b(d, this.j);
        if (!sng.a(this.h, b, bVar)) {
            bVar.b();
        }
    }

    public byx(ThreadFactory threadFactory) {
        this.j = threadFactory;
        this.h = new AtomicReference<>(b);
        f();
    }
}
