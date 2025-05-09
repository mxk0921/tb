package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class al7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f15807a;
    public final ThreadPoolExecutor b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(al7 al7Var) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "diagnose-thread";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(al7 al7Var) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "diagnose-logger-thread";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final al7 f15808a = new al7();

        static {
            t2o.a(615514148);
        }

        public static /* synthetic */ al7 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (al7) ipChange.ipc$dispatch("e57ea7be", new Object[0]);
            }
            return f15808a;
        }
    }

    static {
        t2o.a(615514145);
    }

    public al7() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) VExecutors.newScheduledThreadPool(2, new a(this));
        this.f15807a = scheduledThreadPoolExecutor;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        scheduledThreadPoolExecutor.setKeepAliveTime(3L, timeUnit);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().createExecutorService(1, 1, 3L, timeUnit, new LinkedBlockingQueue(), new b(this), new ThreadPoolExecutor.AbortPolicy());
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static al7 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (al7) ipChange.ipc$dispatch("1119d719", new Object[0]);
        }
        return c.a();
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            this.f15807a.execute(runnable);
        }
    }

    public Executor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("9ffc6e86", new Object[]{this});
        }
        return this.b;
    }

    public void d(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d8010", new Object[]{this, runnable, new Long(j), timeUnit});
        } else {
            this.f15807a.schedule(runnable, j, timeUnit);
        }
    }

    public void e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5defd9a9", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        } else {
            this.f15807a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }
    }
}
