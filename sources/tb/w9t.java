package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w9t implements mgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f30549a = VExecutors.newScheduledThreadPool(20, new a(this));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(w9t w9tVar) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "rso-inner-vt";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f30550a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public b(Runnable runnable, long j, long j2) {
            this.f30550a = runnable;
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
                this.f30550a.run();
                RSoLog.d("vtask-> after runnable, , duration=" + ((uos.b() - this.b) - this.c) + ", run=" + this.f30550a + ", deley=" + this.c);
            } catch (Throwable th) {
                rbn.g("task -> run into error ", th);
            }
        }
    }

    public w9t() {
        c();
    }

    @Override // tb.mgd
    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c1a6f5", new Object[]{this, runnable, new Long(j)});
            return;
        }
        try {
            this.f30549a.schedule(new b(runnable, uos.b(), j), j, TimeUnit.MILLISECONDS);
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
        return VExecutors.currentThread();
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

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f30549a;
            scheduledThreadPoolExecutor.setKeepAliveTime(2L, TimeUnit.SECONDS);
            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
            scheduledThreadPoolExecutor.setRejectedExecutionHandler(new x9t(this));
        } catch (Throwable th) {
            rbn.g("task-manager init() error", th);
        }
    }
}
