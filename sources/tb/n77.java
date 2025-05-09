package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n77 implements mgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24551a;
    public final ScheduledThreadPoolExecutor b = new ScheduledThreadPoolExecutor(20);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, n77.c(n77.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(n77 n77Var) {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
            } else {
                rbn.e("error_task_manager", "task dropped");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f24553a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public c(Runnable runnable, long j, long j2) {
            this.f24553a = runnable;
            this.b = j;
            this.c = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f24553a.run();
                RSoLog.d("task-> after runnable, , duration=" + ((uos.b() - this.b) - this.c) + ", poolSize=" + n77.d(n77.this).getPoolSize() + ", run=" + this.f24553a + ", deley=" + this.c);
            } catch (Throwable th) {
                rbn.g("task -> run into error ", th);
            }
        }
    }

    public n77(String str) {
        this.f24551a = str;
        e();
    }

    public static /* synthetic */ String c(n77 n77Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d4ba12d", new Object[]{n77Var});
        }
        return n77Var.f24551a;
    }

    public static /* synthetic */ ScheduledThreadPoolExecutor d(n77 n77Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("ed9809c5", new Object[]{n77Var});
        }
        return n77Var.b;
    }

    @Override // tb.mgd
    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c1a6f5", new Object[]{this, runnable, new Long(j)});
            return;
        }
        try {
            this.b.schedule(new c(runnable, uos.b(), j), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            rbn.g("task-manager submitDelayed() error", th);
        }
    }

    @Override // tb.mgd
    public Thread b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("1d66d847", new Object[]{this});
        }
        return Thread.currentThread();
    }

    @Override // tb.mgd
    public void submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be75d9d", new Object[]{this, runnable});
        } else {
            a(runnable, 0L);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            this.b.setKeepAliveTime(2L, TimeUnit.SECONDS);
            this.b.allowCoreThreadTimeOut(true);
            this.b.setThreadFactory(new a());
            this.b.setRejectedExecutionHandler(new b(this));
        } catch (Throwable th) {
            rbn.g("task-manager init() error", th);
        }
    }
}
