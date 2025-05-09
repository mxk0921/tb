package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zjl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ScheduledThreadPoolExecutor f32805a;
    public static final AtomicInteger b = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(628097111);
        }

        public a(String str) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = zjl.a().getAndIncrement();
            Thread thread = new Thread(runnable, "PM-SEND" + andIncrement);
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        t2o.a(628097110);
    }

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return b;
    }

    public static ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("71df1096", new Object[0]);
        }
        if (f32805a == null) {
            synchronized (zjl.class) {
                try {
                    if (f32805a == null) {
                        f32805a = new ScheduledThreadPoolExecutor(1, new a("PM-SEND"));
                        f32805a.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        f32805a.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f32805a;
    }
}
