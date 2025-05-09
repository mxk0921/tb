package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.fuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class he4 extends fuo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final c SHUTDOWN_WORKER;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<b> f20578a = new AtomicReference<>(NONE);
    public static final b NONE = new b(0);
    public static final String KEY_MAX_THREADS = "rx2.computation-threads";
    public static final int MAX_THREADS = cap(Runtime.getRuntime().availableProcessors(), Integer.getInteger(KEY_MAX_THREADS, 0).intValue());
    public static final wko THREAD_FACTORY = new wko("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f20580a;
        public final c[] b;
        public long c;

        static {
            t2o.a(973078532);
        }

        public b(int i) {
            this.f20580a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(he4.THREAD_FACTORY);
            }
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9921fac1", new Object[]{this});
            }
            int i = this.f20580a;
            if (i == 0) {
                return he4.SHUTDOWN_WORKER;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % i)];
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
                return;
            }
            for (c cVar : this.b) {
                cVar.dispose();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c extends c2k {
        static {
            t2o.a(973078533);
        }

        public c(riw riwVar) {
            super(riwVar);
        }
    }

    public he4() {
        start();
    }

    public static int cap(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2857b96c", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 <= 0 || i2 > i) {
            return i;
        }
        return i2;
    }

    public static /* synthetic */ Object ipc$super(he4 he4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/rxjava/schedulers/ComputationVirtualScheduler");
    }

    public fuo.c createWorker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fuo.c) ipChange.ipc$dispatch("c24fc352", new Object[]{this});
        }
        return new a(this.f20578a.get().a());
    }

    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("38285f5", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        return this.f20578a.get().a().scheduleDirect(runnable, j, timeUnit);
    }

    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("f7b7b3fc", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        return this.f20578a.get().a().schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
    }

    public void shutdown() {
        b bVar;
        b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        do {
            bVar = this.f20578a.get();
            bVar2 = NONE;
            if (bVar == bVar2) {
                return;
            }
        } while (!sng.a(this.f20578a, bVar, bVar2));
        bVar.b();
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        b bVar = new b(MAX_THREADS);
        if (!sng.a(this.f20578a, NONE, bVar)) {
            bVar.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends fuo.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ListCompositeDisposable f20579a;
        public final jd4 b;
        public final ListCompositeDisposable c;
        public final c d;
        public volatile boolean e;

        static {
            t2o.a(973078531);
        }

        public a(c cVar) {
            this.d = cVar;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.f20579a = listCompositeDisposable;
            jd4 jd4Var = new jd4();
            this.b = jd4Var;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.c = listCompositeDisposable2;
            listCompositeDisposable2.add(listCompositeDisposable);
            listCompositeDisposable2.add(jd4Var);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/rxjava/schedulers/ComputationVirtualScheduler$EventLoopWorker");
        }

        public void dispose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[]{this});
            } else if (!this.e) {
                this.e = true;
                this.c.dispose();
            }
        }

        public boolean isDisposed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue();
            }
            return this.e;
        }

        public Disposable schedule(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Disposable) ipChange.ipc$dispatch("2b50b7b8", new Object[]{this, runnable});
            }
            if (this.e) {
                return EmptyDisposable.INSTANCE;
            }
            return this.d.scheduleActual(runnable, 0L, null, this.f20579a);
        }

        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Disposable) ipChange.ipc$dispatch("4603eaac", new Object[]{this, runnable, new Long(j), timeUnit});
            }
            if (this.e) {
                return EmptyDisposable.INSTANCE;
            }
            return this.d.scheduleActual(runnable, j, timeUnit, this.b);
        }
    }

    static {
        t2o.a(973078530);
        c cVar = new c(new wko("RxComputationShutdown"));
        SHUTDOWN_WORKER = cVar;
        cVar.dispose();
    }
}
