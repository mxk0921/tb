package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.f.f;
import tb.day;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class l4y extends day {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f b;
    public static final c d;
    public static final a g;
    public final ThreadFactory f;
    public final AtomicReference<a> h;
    public static final TimeUnit i = TimeUnit.SECONDS;
    public static final f c = new f("PmCachedWorkerPoolEvictor", 5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final long f23111a;
        private final ConcurrentLinkedQueue<c> b;
        public final eux c;
        private final ScheduledExecutorService d;
        private final Future<?> e;
        private final ThreadFactory f;

        static {
            t2o.a(628097509);
        }

        public a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledFuture<?> scheduledFuture;
            ScheduledExecutorService scheduledExecutorService;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            this.f23111a = j2;
            this.b = new ConcurrentLinkedQueue<>();
            this.c = new eux();
            this.f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, l4y.c);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.d = scheduledExecutorService;
            this.e = scheduledFuture;
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("a482f01c", new Object[]{this});
            }
            if (this.c.b()) {
                return l4y.d;
            }
            while (!this.b.isEmpty()) {
                c poll = this.b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.f);
            this.c.a(cVar);
            return cVar;
        }

        public void b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("533bd39c", new Object[]{this, cVar});
                return;
            }
            cVar.i(d() + this.f23111a);
            this.b.offer(cVar);
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!this.b.isEmpty()) {
                long d = d();
                Iterator<c> it = this.b.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.j() > d) {
                        return;
                    }
                    if (this.b.remove(next)) {
                        this.c.b(next);
                    }
                }
            }
        }

        public long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
            }
            return System.nanoTime();
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            this.c.b_();
            Future<?> future = this.e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b extends day.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final a b;
        public final c c;
        public final AtomicBoolean d = new AtomicBoolean();

        /* renamed from: a  reason: collision with root package name */
        public final eux f23112a = new eux();

        static {
            t2o.a(628097510);
        }

        public b(a aVar) {
            this.b = aVar;
            this.c = aVar.a();
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/f/d$b");
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return this.d.get();
        }

        @Override // tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (this.d.compareAndSet(false, true)) {
                this.f23112a.b_();
                this.b.b(this.c);
            }
        }

        @Override // tb.day.c
        public sxx d(Runnable runnable, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sxx) ipChange.ipc$dispatch("57bda9d4", new Object[]{this, runnable, new Long(j), timeUnit});
            }
            if (this.f23112a.b()) {
                return tao.reactivex.d.a.b.INSTANCE;
            }
            return this.c.e(runnable, j, timeUnit, this.f23112a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class c extends r5y {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long c = 0;

        static {
            t2o.a(628097511);
        }

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/f/d$c");
        }

        public void i(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else {
                this.c = j;
            }
        }

        public long j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
            }
            return this.c;
        }
    }

    static {
        t2o.a(628097508);
        c cVar = new c(new f("PmCachedThreadSchedulerShutdown"));
        d = cVar;
        cVar.b_();
        f fVar = new f("PmCachedThreadScheduler", 5);
        b = fVar;
        a aVar = new a(0L, null, fVar);
        g = aVar;
        aVar.e();
    }

    public l4y() {
        this(b);
    }

    public static /* synthetic */ Object ipc$super(l4y l4yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/f/d");
    }

    @Override // tb.day
    public day.c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (day.c) ipChange.ipc$dispatch("96f4a96c", new Object[]{this});
        }
        return new b(this.h.get());
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a aVar = new a(60L, i, this.f);
        if (!sng.a(this.h, g, aVar)) {
            aVar.e();
        }
    }

    public l4y(ThreadFactory threadFactory) {
        this.f = threadFactory;
        this.h = new AtomicReference<>(g);
        e();
    }
}
