package tb;

import android.util.Log;
import com.alibaba.security.ccrc.service.build.C1184p;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ist {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadPoolExecutor f21555a;
    public static final ScheduledThreadPoolExecutor b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f21556a = new AtomicInteger(1);
        public final String b;

        static {
            t2o.a(654311473);
        }

        public a(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable);
            String str = this.b;
            int andIncrement = this.f21556a.getAndIncrement();
            thread.setName("#safe-clean-" + str + "-" + andIncrement);
            return thread;
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e0a5e3", new Object[]{runnable});
        } else {
            f21555a.execute(runnable);
        }
    }

    public static /* synthetic */ void c(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4744faf4", new Object[]{runnable, threadPoolExecutor});
        } else {
            Log.e(C1184p.f2612a, "reject!");
        }
    }

    public static void d(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d8010", new Object[]{runnable, new Long(j), timeUnit});
        } else {
            b.schedule(runnable, j, timeUnit);
        }
    }

    static {
        t2o.a(654311472);
        a aVar = new a("action");
        a aVar2 = new a("init");
        f21555a = new ThreadPoolExecutor(0, 3, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), aVar, new RejectedExecutionHandler() { // from class: tb.bst
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                ist.c(runnable, threadPoolExecutor);
            }
        });
        b = new ScheduledThreadPoolExecutor(0, aVar2);
    }
}
