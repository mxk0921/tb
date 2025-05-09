package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledFuture;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ts3 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f28926a = "CleanTask";
    private static boolean b = false;
    private static final long c = 300000;
    private static ts3 d;
    private static ScheduledFuture e;

    static {
        t2o.a(962593025);
    }

    private ts3() {
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[0]);
            return;
        }
        ScheduledFuture scheduledFuture = e;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            e.cancel(true);
        }
        b = false;
        d = null;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!b) {
            nhh.f(f28926a, "init TimeoutEventManager");
            d = new ts3();
            e = zdt.c().e(e, d, 300000L);
            b = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        nhh.f(f28926a, "clean TimeoutEvent");
        fl8.s().h();
    }
}
