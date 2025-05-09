package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class pav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadPoolExecutor f25981a;
    public static final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f25982a;

        public a(Runnable runnable) {
            this.f25982a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                pav.a().execute(this.f25982a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MessageQueue.IdleHandler f25983a;

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
                try {
                    b.this.f25983a.queueIdle();
                } catch (Exception e) {
                    hav.a("Ultron#runOnIdleOfHandlerError1", e.getMessage());
                }
            }
        }

        public b(MessageQueue.IdleHandler idleHandler) {
            this.f25983a = idleHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                pav.k(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MessageQueue f25985a;
        public final /* synthetic */ MessageQueue.IdleHandler b;

        public c(MessageQueue messageQueue, MessageQueue.IdleHandler idleHandler) {
            this.f25985a = messageQueue;
            this.b = idleHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f25985a.addIdleHandler(this.b);
            } catch (Exception e) {
                hav.a("Ultron#delayRunOnIdleOfHandler", e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25986a;

        public d(String str) {
            this.f25986a = str;
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return this.f25986a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f25987a;
        public final Runnable b;

        static {
            t2o.a(83886358);
        }

        public e(String str, Runnable runnable) {
            this.f25987a = str;
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
            hav.b("UltronSchedules", "rejectedExecution", "threadName=" + this.f25987a);
        }
    }

    static {
        t2o.a(83886352);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f25981a = e(Math.max(1, availableProcessors / 2), availableProcessors, 10L, TimeUnit.SECONDS, "UltronWorkSchedules");
    }

    public static /* synthetic */ ThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("b81d9757", new Object[0]);
        }
        return f25981a;
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

    public static Handler c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("bfdfb875", new Object[]{str});
        }
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public static ThreadPoolExecutor d(int i, int i2, long j, TimeUnit timeUnit, Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("c4c81ffc", new Object[]{new Integer(i), new Integer(i2), new Long(j), timeUnit, runnable, str});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().createExecutorService(i, i2, j, timeUnit, new LinkedBlockingQueue(), new d(str), new e(str, runnable));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor e(int i, int i2, long j, TimeUnit timeUnit, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("9a7d60fe", new Object[]{new Integer(i), new Integer(i2), new Long(j), timeUnit, str});
        }
        return d(i, i2, j, timeUnit, null, str);
    }

    public static void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96563b0", new Object[]{runnable});
        } else if (runnable != null) {
            b.removeCallbacks(runnable);
        }
    }

    public static void g(MessageQueue.IdleHandler idleHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99f5c5e", new Object[]{idleHandler});
        } else {
            h(idleHandler, 0L);
        }
    }

    public static void h(MessageQueue.IdleHandler idleHandler, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca626", new Object[]{idleHandler, new Long(j)});
            return;
        }
        try {
            if (Looper.myLooper() != null) {
                i(new c(Looper.myQueue(), idleHandler), j);
            } else if (0 == j) {
                idleHandler.queueIdle();
            } else {
                i(new b(idleHandler), j);
            }
        } catch (Exception e2) {
            hav.a("Ultron#runOnIdleOfHandlerError2", e2.getMessage());
        }
    }

    public static void i(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f14c3f2", new Object[]{runnable, new Long(j)});
        } else {
            b.postDelayed(runnable, j);
        }
    }

    public static void j(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99bd8cee", new Object[]{runnable});
        } else {
            b.postAtFrontOfQueue(runnable);
        }
    }

    public static void k(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b82c6a", new Object[]{runnable});
        } else {
            l(runnable, 0L);
        }
    }

    public static void l(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4dd79a", new Object[]{runnable, new Long(j)});
        } else if (0 == j) {
            f25981a.execute(runnable);
        } else {
            i(new a(runnable), j);
        }
    }

    public static void m(boolean z, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ace6e6", new Object[]{new Boolean(z), runnable});
        } else if (b() || !z) {
            k(runnable);
        } else {
            runnable.run();
        }
    }
}
