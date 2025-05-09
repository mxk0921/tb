package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f24005a = null;
    public static ScheduledThreadPoolExecutor b = null;
    public static ScheduledThreadPoolExecutor c = null;
    public static ScheduledThreadPoolExecutor d = null;
    public static ScheduledThreadPoolExecutor e = null;
    public static ScheduledThreadPoolExecutor f = null;
    public static ScheduledThreadPoolExecutor g = null;

    static {
        t2o.a(349175814);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        try {
            h().execute(runnable);
        } catch (Throwable th) {
            s55.h("AThreadPool", "execute err", th, new Object[0]);
        }
    }

    public static ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("6f425fe7", new Object[0]);
        }
        if (c == null) {
            c = of.a(1, "adaemon-action");
        }
        return c;
    }

    public static ScheduledThreadPoolExecutor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("a1328626", new Object[0]);
        }
        if (f == null) {
            f = of.a(1, "adaemon-frame");
        }
        return f;
    }

    public static ScheduledThreadPoolExecutor d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("fff961cf", new Object[0]);
        }
        if (g == null) {
            g = of.b(1, "adaemon-frame-schedule", 100L);
        }
        return g;
    }

    public static ScheduledThreadPoolExecutor e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("56d45417", new Object[0]);
        }
        if (d == null) {
            d = of.a(2, "adaemon-io");
        }
        return d;
    }

    public static ScheduledThreadPoolExecutor f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("2dae36cf", new Object[0]);
        }
        if (e == null) {
            e = of.a(1, "adaemon-memArt");
        }
        return e;
    }

    public static ScheduledThreadPoolExecutor g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("1f68a2dc", new Object[0]);
        }
        if (b == null) {
            b = of.a(1, "adaemon-reporter");
        }
        return b;
    }

    public static ScheduledThreadPoolExecutor h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("419cef3c", new Object[0]);
        }
        if (f24005a == null) {
            f24005a = of.a(1, "adaemon-schedule");
        }
        return f24005a;
    }

    public static void i(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566df939", new Object[]{runnable, new Long(j), timeUnit});
            return;
        }
        try {
            f().schedule(runnable, j, timeUnit);
        } catch (Throwable th) {
            s55.h("AThreadPool", "memArtCleanTask", th, new Object[0]);
        }
    }

    public static void j(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb8f1c3", new Object[]{runnable});
            return;
        }
        try {
            g().submit(runnable);
        } catch (Throwable th) {
            s55.h("AThreadPool", "submitReporterTask", th, new Object[0]);
        }
    }

    public static void k(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6822b13", new Object[]{runnable, new Long(j), timeUnit});
            return;
        }
        try {
            h().schedule(runnable, j, timeUnit);
        } catch (Throwable th) {
            s55.h("AThreadPool", "submitScheduledTask", th, new Object[0]);
        }
    }

    public static void l(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990aaeaa", new Object[]{runnable});
            return;
        }
        try {
            h().schedule(runnable, 0L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            s55.h("AThreadPool", "submitSingleTask", th, new Object[0]);
        }
    }
}
