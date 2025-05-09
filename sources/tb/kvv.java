package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kvv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicInteger b = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f22955a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593014);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = kvv.a().getAndIncrement();
            return new Thread(runnable, "UtHandlerThread:" + andIncrement);
        }
    }

    static {
        t2o.a(962593013);
    }

    public kvv() {
        this.f22955a = null;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a());
        this.f22955a = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return b;
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
        } else {
            this.f22955a.submit(runnable);
        }
    }
}
