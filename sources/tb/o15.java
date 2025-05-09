package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.scheduler.Priority;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.guo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class o15 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int e = (Runtime.getRuntime().availableProcessors() * 2) + 1;
    public final ThreadPoolExecutor c;
    public final PriorityBlockingQueue<ljf> d = new PriorityBlockingQueue<>();
    public final AtomicInteger b = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f25076a = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (true) {
                try {
                    ljf ljfVar = (ljf) o15.a(o15.this).poll(120L, TimeUnit.SECONDS);
                    if (ljfVar != null) {
                        ljfVar.run();
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class b extends guo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Priority f25078a;
        public final int b;

        static {
            t2o.a(377487424);
        }

        public /* synthetic */ b(o15 o15Var, Priority priority, int i, a aVar) {
            this(priority, i);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/scheduler/internal/CustomPriorityScheduler$CustomScheduler");
        }

        @Override // tb.guo
        public guo.a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (guo.a) ipChange.ipc$dispatch("ec92d6be", new Object[]{this});
            }
            synchronized (o15.b(o15.this)) {
                try {
                    if (o15.b(o15.this).get() < o15.c()) {
                        o15.b(o15.this).incrementAndGet();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new fxm(o15.a(o15.this), this.f25078a, this.b);
        }

        public b(Priority priority, int i) {
            this.f25078a = priority;
            this.b = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f25079a = new AtomicInteger();
        public final String b;

        static {
            t2o.a(377487425);
        }

        public c(String str) {
            this.b = str;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("215168f1", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append("-Thread-#");
            sb.append(this.f25079a.incrementAndGet());
            return sb.toString();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, a());
        }
    }

    static {
        t2o.a(377487422);
    }

    public o15() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new c("feaureInstaller"));
        this.c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.submit(new a());
    }

    public static /* synthetic */ PriorityBlockingQueue a(o15 o15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PriorityBlockingQueue) ipChange.ipc$dispatch("62e5ca42", new Object[]{o15Var});
        }
        return o15Var.d;
    }

    public static /* synthetic */ AtomicInteger b(o15 o15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("b0e7516b", new Object[]{o15Var});
        }
        return o15Var.b;
    }

    public static /* synthetic */ int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b88b92d", new Object[0])).intValue();
        }
        return e;
    }

    public static o15 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o15) ipChange.ipc$dispatch("6bad4cd", new Object[0]);
        }
        return new o15();
    }

    public guo e(Priority priority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (guo) ipChange.ipc$dispatch("4888c9e2", new Object[]{this, priority});
        }
        return new b(this, priority, this.f25076a.incrementAndGet(), null);
    }
}
