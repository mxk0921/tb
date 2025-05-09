package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class oav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadPoolExecutor f25267a;
    public static final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f25268a;

        public a(Runnable runnable) {
            this.f25268a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                oav.a().execute(this.f25268a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25269a;

        public b(String str) {
            this.f25269a = str;
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return this.f25269a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f25270a;
        public final Runnable b;

        static {
            t2o.a(794820648);
        }

        public c(String str, Runnable runnable) {
            this.f25270a = str;
            this.b = runnable;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            Runnable runnable2 = this.b;
            if (runnable2 != null) {
                runnable2.run();
            }
            iav.c("UltronSchedules", "rejectedExecution", "threadName=" + this.f25270a);
        }
    }

    static {
        t2o.a(794820642);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f25267a = d(Math.max(1, availableProcessors / 2), availableProcessors, 10L, TimeUnit.SECONDS, "UltronWorkSchedules");
    }

    public static /* synthetic */ ThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("b81d9757", new Object[0]);
        }
        return f25267a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static ThreadPoolExecutor c(int i, int i2, long j, TimeUnit timeUnit, Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("c4c81ffc", new Object[]{new Integer(i), new Integer(i2), new Long(j), timeUnit, runnable, str});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().createExecutorService(i, i2, j, timeUnit, new LinkedBlockingQueue(), new b(str), new c(str, runnable));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor d(int i, int i2, long j, TimeUnit timeUnit, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("9a7d60fe", new Object[]{new Integer(i), new Integer(i2), new Long(j), timeUnit, str});
        }
        return c(i, i2, j, timeUnit, null, str);
    }

    public static void e(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f14c3f2", new Object[]{runnable, new Long(j)});
        } else {
            b.postDelayed(runnable, j);
        }
    }

    public static void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b82c6a", new Object[]{runnable});
        } else {
            g(runnable, 0L);
        }
    }

    public static void g(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4dd79a", new Object[]{runnable, new Long(j)});
        } else if (0 == j) {
            f25267a.execute(runnable);
        } else {
            e(new a(runnable), j);
        }
    }
}
