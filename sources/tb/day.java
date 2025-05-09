package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tao.reactivex.d.a.d;
import tao.reactivex.d.h.e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class day {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final long f17697a = TimeUnit.MINUTES.toNanos(15);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Runnable, sxx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f17698a;
        public final c b;
        public Thread c;

        static {
            t2o.a(628097535);
            t2o.a(628097368);
        }

        public a(Runnable runnable, c cVar) {
            this.f17698a = runnable;
            this.b = cVar;
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return this.b.b();
        }

        @Override // tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
                return;
            }
            if (this.c == Thread.currentThread()) {
                c cVar = this.b;
                if (cVar instanceof r5y) {
                    ((r5y) cVar).h();
                    return;
                }
            }
            this.b.b_();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.c = Thread.currentThread();
            try {
                this.f17698a.run();
            } finally {
                b_();
                this.c = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b implements Runnable, sxx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f17699a;
        public final c b;
        public volatile boolean c;

        static {
            t2o.a(628097536);
            t2o.a(628097368);
        }

        public b(Runnable runnable, c cVar) {
            this.f17699a = runnable;
            this.b = cVar;
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        @Override // tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
                return;
            }
            this.c = true;
            this.b.b_();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.c) {
                try {
                    this.f17699a.run();
                } catch (Throwable th) {
                    uxx.a(th);
                    this.b.b_();
                    throw e.a(th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static abstract class c implements sxx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final Runnable f17700a;
            public final d b;
            public final long c;
            public long d;
            public long e;
            public long f;

            static {
                t2o.a(628097538);
            }

            public a(long j, Runnable runnable, long j2, d dVar, long j3) {
                this.f17700a = runnable;
                this.b = dVar;
                this.c = j3;
                this.e = j2;
                this.f = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                this.f17700a.run();
                if (!this.b.b()) {
                    c cVar = c.this;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long a2 = cVar.a(timeUnit);
                    long j2 = day.f17697a;
                    long j3 = this.e;
                    if (a2 + j2 >= j3) {
                        long j4 = this.c;
                        if (a2 < j3 + j4 + j2) {
                            long j5 = this.f;
                            long j6 = this.d + 1;
                            this.d = j6;
                            j = j5 + (j6 * j4);
                            this.e = a2;
                            this.b.b(c.this.d(this, j - a2, timeUnit));
                        }
                    }
                    long j7 = this.c;
                    long j8 = a2 + j7;
                    long j9 = this.d + 1;
                    this.d = j9;
                    this.f = j8 - (j7 * j9);
                    j = j8;
                    this.e = a2;
                    this.b.b(c.this.d(this, j - a2, timeUnit));
                }
            }
        }

        static {
            t2o.a(628097537);
            t2o.a(628097368);
        }

        public long a(TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("594d62c4", new Object[]{this, timeUnit})).longValue();
            }
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public sxx b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sxx) ipChange.ipc$dispatch("895389e0", new Object[]{this, runnable});
            }
            return d(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public sxx c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sxx) ipChange.ipc$dispatch("91d6798c", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
            }
            d dVar = new d();
            d dVar2 = new d(dVar);
            long nanos = timeUnit.toNanos(j2);
            long a2 = a(TimeUnit.NANOSECONDS);
            sxx d = d(new a(a2 + timeUnit.toNanos(j), runnable, a2, dVar2, nanos), j, timeUnit);
            if (d == tao.reactivex.d.a.b.INSTANCE) {
                return d;
            }
            dVar.b(d);
            return dVar2;
        }

        public abstract sxx d(Runnable runnable, long j, TimeUnit timeUnit);
    }

    static {
        t2o.a(628097534);
    }

    public sxx a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("895389e0", new Object[]{this, runnable});
        }
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public sxx b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("91d6798c", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        c d = d();
        b bVar = new b(runnable, d);
        sxx c2 = d.c(bVar, j, j2, timeUnit);
        if (c2 == tao.reactivex.d.a.b.INSTANCE) {
            return c2;
        }
        return bVar;
    }

    public sxx c(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("57bda9d4", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        c d = d();
        a aVar = new a(runnable, d);
        d.d(aVar, j, timeUnit);
        return aVar;
    }

    public abstract c d();
}
