package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f17950a = new Handler(Looper.getMainLooper());
    public static final ThreadPoolExecutor b;
    public static final Handler c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f17951a;

        public a(Runnable runnable) {
            this.f17951a = runnable;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            try {
                this.f17951a.run();
            } catch (Throwable th) {
                ck.g().e(AURATraceUtil.c(th), ck.b.b().i("AURA/error").a());
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17952a;

        public b(String str) {
            this.f17952a = str;
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return this.f17952a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f17953a;

        static {
            t2o.a(79691966);
        }

        public c(String str) {
            this.f17953a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            rbb g = ck.g();
            g.b("AURASchedules", "rejectedExecution", "threadName=" + this.f17953a);
        }
    }

    static {
        t2o.a(79691963);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        b = d(Math.max(1, availableProcessors / 2), availableProcessors, 10L, TimeUnit.SECONDS, "AURASchedules");
        HandlerThread handlerThread = new HandlerThread("AURAWorkerHandler");
        handlerThread.start();
        c = new Handler(handlerThread.getLooper());
    }

    public static Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[0]);
        }
        return f17950a;
    }

    public static Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("32c20be9", new Object[0]);
        }
        return c;
    }

    @Deprecated
    public static Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4dfb60f0", new Object[0]);
        }
        return c;
    }

    public static ThreadPoolExecutor d(int i, int i2, long j, TimeUnit timeUnit, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("9a7d60fe", new Object[]{new Integer(i), new Integer(i2), new Long(j), timeUnit, str});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().createExecutorService(i, i2, j, timeUnit, new LinkedBlockingQueue(), new b(str), new c(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a1f70d", new Object[]{runnable});
        } else {
            Looper.myQueue().addIdleHandler(new a(runnable));
        }
    }

    public static void f(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c41d8e1", new Object[]{runnable, new Long(j)});
        } else if (ao.a()) {
            runnable.run();
        } else {
            f17950a.postDelayed(runnable, j);
        }
    }

    public static void g(Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f39141", new Object[]{runnable, runnable2});
            return;
        }
        try {
            if (ao.a()) {
                runnable.run();
            } else {
                f17950a.postDelayed(runnable, 0L);
            }
        } catch (Throwable th) {
            ck.g().e(AURATraceUtil.c(th), ck.b.b().i("AURA/error").a());
            if (runnable2 != null) {
                runnable2.run();
            }
        }
    }

    public static void h(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b82c6a", new Object[]{runnable});
        } else {
            b.execute(runnable);
        }
    }
}
