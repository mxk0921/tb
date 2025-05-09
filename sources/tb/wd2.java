package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wd2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicInteger INTEGER = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledExecutorService f30627a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(int i) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = wd2.INTEGER.getAndIncrement();
            Thread thread = new Thread(runnable, "CrashReporterAdapter:" + andIncrement);
            thread.setPriority(1);
            return thread;
        }
    }

    public synchronized void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be75d9d", new Object[]{this, runnable});
            return;
        }
        if (f30627a == null) {
            f30627a = Executors.newScheduledThreadPool(3, new a(1));
            if (zap.b().f32654a != null && "true".equals(zap.b().f32654a.getSharedPreferences("BizErrorReport", 0).getString("allowCoreThreadTimeOut", "true"))) {
                ScheduledExecutorService scheduledExecutorService = f30627a;
                if (scheduledExecutorService instanceof ThreadPoolExecutor) {
                    ((ThreadPoolExecutor) scheduledExecutorService).setKeepAliveTime(3L, TimeUnit.SECONDS);
                    ((ThreadPoolExecutor) f30627a).allowCoreThreadTimeOut(true);
                }
            }
        }
        f30627a.submit(runnable);
    }
}
