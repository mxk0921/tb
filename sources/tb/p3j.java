package tb;

import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.lab.comfrm.inner.Schedules;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p3j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ScheduledExecutorService f25857a;
    public static final ScheduledExecutorService b;
    public static volatile HandlerThread c;

    static {
        t2o.a(745537554);
        ScheduledExecutorService newScheduledThreadPool = VExecutors.newScheduledThreadPool(1, new Schedules.MyThreadNameFactory("MtbMonitor"));
        f25857a = newScheduledThreadPool;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ((ThreadPoolExecutor) newScheduledThreadPool).setKeepAliveTime(10000L, timeUnit);
        ((ThreadPoolExecutor) newScheduledThreadPool).allowCoreThreadTimeOut(true);
        ScheduledExecutorService newScheduledThreadPool2 = VExecutors.newScheduledThreadPool(8, new Schedules.MyThreadNameFactory("MtbIO"));
        b = newScheduledThreadPool2;
        ((ThreadPoolExecutor) newScheduledThreadPool2).setKeepAliveTime(3000L, timeUnit);
        ((ThreadPoolExecutor) newScheduledThreadPool2).allowCoreThreadTimeOut(true);
    }

    public static ScheduledFuture a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("d04cb017", new Object[]{runnable, new Long(j)});
        }
        return b.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public static HandlerThread b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("ee53de5f", new Object[0]);
        }
        if (c != null) {
            return c;
        }
        synchronized (p3j.class) {
            try {
                if (c == null) {
                    c = new HandlerThread("mtbMtop");
                    c.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static Looper c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("a854eca3", new Object[0]);
        }
        Looper looper = b().getLooper();
        if (looper != null) {
            return looper;
        }
        HandlerThread handlerThread = new HandlerThread("mtbMtop");
        handlerThread.start();
        return handlerThread.getLooper();
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5860ab", new Object[]{runnable});
        } else {
            b.execute(runnable);
        }
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c8b4df", new Object[]{runnable});
        } else {
            f25857a.execute(runnable);
        }
    }

    public static void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f52770d", new Object[]{runnable});
        } else {
            uuu.a(runnable);
        }
    }

    public static void g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade5f3d0", new Object[]{runnable});
        } else {
            new VirtualThread(runnable, "mtbLogic").ofVirtual().start();
        }
    }
}
