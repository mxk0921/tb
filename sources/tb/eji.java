package tb;

import android.os.SystemClock;
import com.alibaba.ability.utils.MegaTrace;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class eji {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ExecutorService f;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f18617a = new AtomicInteger();
    public final LinkedList<d<?>> b = new LinkedList<>();
    public int c;
    public final String d;
    public final int e;
    public static final b Companion = new b(null);
    public static final c g = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a<T> implements Callable<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f18618a;

        static {
            t2o.a(144703608);
        }

        public a(Runnable runnable, T t) {
            ckf.g(runnable, "runnable");
            this.f18618a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public T call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            this.f18618a.run();
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements qqt {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final a INSTANCE = new a();

            @Override // tb.qqt
            public final String newThreadName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return "mega-pool";
            }
        }

        static {
            t2o.a(144703609);
        }

        public b() {
        }

        public static final /* synthetic */ ExecutorService a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorService) ipChange.ipc$dispatch("1c11b143", new Object[]{bVar});
            }
            return bVar.b();
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final ExecutorService b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorService) ipChange.ipc$dispatch("86ad5538", new Object[]{this});
            }
            if (eji.b() == null) {
                try {
                    eji.d(VExecutors.newCachedThreadPool(a.INSTANCE));
                } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
                    eji.d(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 120L, TimeUnit.SECONDS, new SynchronousQueue(), new uij("mega-pool", 0, 2, null)));
                }
            }
            ExecutorService b = eji.b();
            ckf.d(b);
            return b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;

        /* renamed from: a  reason: collision with root package name */
        private final Object f18619a = new Object();
        private LinkedList<d<?>> c = new LinkedList<>();
        private final PriorityQueue<d<?>> d = new PriorityQueue<>();

        static {
            t2o.a(144703611);
        }

        @Override // java.lang.Runnable
        public void run() {
            d<?> dVar;
            LinkedList<d<?>> linkedList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (true) {
                synchronized (this.f18619a) {
                    try {
                        dVar = null;
                        if (!this.c.isEmpty()) {
                            linkedList = this.c;
                        } else {
                            linkedList = null;
                        }
                        this.c = new LinkedList<>();
                        xhv xhvVar = xhv.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (linkedList != null) {
                    for (d<?> dVar2 : linkedList) {
                        this.d.add(dVar2);
                    }
                }
                if (this.d.isEmpty()) {
                    synchronized (this.f18619a) {
                        try {
                            if (this.c.isEmpty()) {
                                this.f18619a.wait();
                            }
                            xhv xhvVar2 = xhv.INSTANCE;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    long d = this.d.peek().d() - SystemClock.elapsedRealtimeNanos();
                    if (d > 0) {
                        synchronized (this.f18619a) {
                            try {
                                if (this.c.isEmpty()) {
                                    IpChange ipChange2 = eji.$ipChange;
                                    this.f18619a.wait(d / 1000000, (int) (d % 1000000));
                                }
                                xhv xhvVar3 = xhv.INSTANCE;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        dVar = this.d.remove();
                    }
                }
                if (dVar != null) {
                    eji.e(dVar.e(), dVar);
                }
            }
        }

        public final void a(d<?> dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29ceac6b", new Object[]{this, dVar});
                return;
            }
            ckf.g(dVar, "task");
            synchronized (this.f18619a) {
                try {
                    this.c.add(dVar);
                    if (this.b) {
                        this.f18619a.notifyAll();
                    } else {
                        this.b = true;
                        Thread thread = new Thread(this);
                        thread.setName("MegaScheduler");
                        thread.start();
                    }
                    xhv xhvVar = xhv.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d<T> implements Comparable<d<T>>, Future<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Object f18620a = new Object();
        private Thread b;
        private boolean c;
        private boolean d;
        private T e;
        private Throwable f;
        private final eji g;
        private final long h;
        private final Callable<T> i;

        static {
            t2o.a(144703612);
        }

        public d(eji ejiVar, long j, Callable<T> callable) {
            ckf.g(ejiVar, "megaScheduler");
            ckf.g(callable, "callable");
            this.g = ejiVar;
            this.h = j;
            this.i = callable;
        }

        /* renamed from: b */
        public int compareTo(d<T> dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1b045336", new Object[]{this, dVar})).intValue();
            }
            ckf.g(dVar, "other");
            return (this.h > dVar.h ? 1 : (this.h == dVar.h ? 0 : -1));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            Thread thread;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            synchronized (this.f18620a) {
                try {
                    if (this.d) {
                        return false;
                    }
                    this.c = true;
                    if (z && (thread = this.b) != null) {
                        thread.interrupt();
                    }
                    this.d = true;
                    xhv xhvVar = xhv.INSTANCE;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2173abc4", new Object[]{this})).longValue();
            }
            return this.h;
        }

        public final eji e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eji) ipChange.ipc$dispatch("18af74f9", new Object[]{this});
            }
            return this.g;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : get(0L, null);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
            }
            synchronized (this.f18620a) {
                z = this.c;
            }
            return z;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
            }
            synchronized (this.f18620a) {
                z = this.d;
            }
            return z;
        }

        public final void run() {
            Throwable th;
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (this.f18620a) {
                if (!this.c) {
                    this.b = Thread.currentThread();
                    xhv xhvVar = xhv.INSTANCE;
                    try {
                        t = this.i.call();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        t = null;
                    }
                    synchronized (this.f18620a) {
                        this.f = th;
                        this.e = t;
                        this.b = null;
                        this.d = true;
                        this.f18620a.notifyAll();
                        xhv xhvVar2 = xhv.INSTANCE;
                    }
                }
            }
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) {
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("122d0181", new Object[]{this, new Long(j), timeUnit});
            }
            synchronized (this.f18620a) {
                try {
                    if (!this.d) {
                        if (j <= 0) {
                            this.f18620a.wait();
                        } else {
                            if (timeUnit == null) {
                                timeUnit = TimeUnit.MILLISECONDS;
                            }
                            long convert = TimeUnit.NANOSECONDS.convert(j, timeUnit);
                            IpChange ipChange2 = eji.$ipChange;
                            this.f18620a.wait(convert / 1000000, (int) (convert % 1000000));
                            if (!this.d) {
                                throw new TimeoutException("MegaFutureGetTimeout");
                            }
                        }
                    }
                    if (this.f == null) {
                        t = this.e;
                        xhv xhvVar = xhv.INSTANCE;
                    } else {
                        throw new ExecutionException(this.f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return t;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final eji f18621a;

        static {
            t2o.a(144703613);
        }

        public e(eji ejiVar) {
            ckf.g(ejiVar, "scheduler");
            this.f18621a = ejiVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                do {
                } while (eji.a(this.f18621a, eji.c(this.f18621a).incrementAndGet()));
            }
        }
    }

    static {
        t2o.a(144703607);
    }

    public eji(String str, int i) {
        ckf.g(str, "name");
        this.d = str;
        this.e = i;
    }

    public static final /* synthetic */ boolean a(eji ejiVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf94ace", new Object[]{ejiVar, new Integer(i)})).booleanValue();
        }
        return ejiVar.f(i);
    }

    public static final /* synthetic */ ExecutorService b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("e9cd3626", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ AtomicInteger c(eji ejiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("3aae8ac0", new Object[]{ejiVar});
        }
        return ejiVar.f18617a;
    }

    public static final /* synthetic */ void d(ExecutorService executorService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40c8c66", new Object[]{executorService});
        } else {
            f = executorService;
        }
    }

    public static final /* synthetic */ void e(eji ejiVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b48daf", new Object[]{ejiVar, dVar});
        } else {
            ejiVar.k(dVar);
        }
    }

    public static /* synthetic */ Future j(eji ejiVar, Runnable runnable, long j, TimeUnit timeUnit, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("e722520a", new Object[]{ejiVar, runnable, new Long(j), timeUnit, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return ejiVar.h(runnable, j, timeUnit);
    }

    public final Future<Object> g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable});
        }
        return j(this, runnable, 0L, null, 6, null);
    }

    public final Future<Object> h(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("747d42a7", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        ckf.g(runnable, "runnable");
        ckf.g(timeUnit, mh1.PRICE_UNIT);
        try {
            MegaTrace megaTrace = MegaTrace.INSTANCE;
            megaTrace.b("MegaScheduler#submit");
            Future<Object> i = i(new a(runnable, null), j, timeUnit);
            megaTrace.e();
            return i;
        } catch (Throwable th) {
            MegaTrace.INSTANCE.e();
            throw th;
        }
    }

    public final <T> Future<T> i(Callable<T> callable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("ca3b871c", new Object[]{this, callable, new Long(j), timeUnit});
        }
        ckf.g(callable, "callable");
        ckf.g(timeUnit, mh1.PRICE_UNIT);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (j > 0) {
            elapsedRealtimeNanos += TimeUnit.NANOSECONDS.convert(j, timeUnit);
        }
        d<?> dVar = new d<>(this, elapsedRealtimeNanos, callable);
        g.a(dVar);
        return dVar;
    }

    public final void k(d<?> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58e496c", new Object[]{this, dVar});
            return;
        }
        synchronized (this.b) {
            try {
                this.b.addLast(dVar);
                int i = this.e;
                int i2 = this.c;
                if (i2 >= 0 && i > i2) {
                    this.c = i2 + 1;
                    b.a(Companion).submit(new e(this));
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acebe90b", new Object[]{this, new Integer(i)})).booleanValue();
        }
        synchronized (this.b) {
            if (this.b.isEmpty()) {
                this.c--;
                return false;
            }
            d<?> removeFirst = this.b.removeFirst();
            ckf.f(removeFirst, "taskQ.removeFirst()");
            d<?> dVar = removeFirst;
            xhv xhvVar = xhv.INSTANCE;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            int priority = currentThread.getPriority();
            currentThread.setName(this.d + '-' + i);
            dVar.run();
            currentThread.setName(name);
            currentThread.setPriority(priority);
            return true;
        }
    }
}
