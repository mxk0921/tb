package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b05 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ScheduledThreadPoolExecutor f16108a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f16109a = 0;

        static {
            t2o.a(620757127);
        }

        public a(String str) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            StringBuilder sb = new StringBuilder("Phenix-cache-");
            int i = this.f16109a;
            this.f16109a = 1 + i;
            sb.append(i);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        t2o.a(620757126);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Phenix-cache-"), new ThreadPoolExecutor.AbortPolicy());
        f16108a = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static void a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d8010", new Object[]{runnable, new Long(j), timeUnit});
        } else {
            f16108a.schedule(runnable, j, timeUnit);
        }
    }
}
