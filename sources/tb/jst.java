package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class jst {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f22189a;
    public static final ExecutorService b;
    public static final Handler c;
    public static final ScheduledExecutorService d;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            pgh.p("must NOT called on main thread");
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    static {
        ExecutorService executorService;
        ExecutorService executorService2;
        ScheduledExecutorService scheduledExecutorService = null;
        try {
            executorService = (ExecutorService) vxq.f30318a.get("makeComputeExecutorService").invoke(null, 4, 4, 120, "FBPreThrd");
        } catch (Throwable th) {
            pgh.l(th);
            executorService = null;
        }
        f22189a = executorService;
        try {
            ExecutorService executorService3 = (ExecutorService) vxq.f30318a.get("makeNormalExecutorService").invoke(null, 4, 1024, 120, "FBNmThrd");
        } catch (Throwable th2) {
            pgh.l(th2);
        }
        try {
            executorService2 = (ExecutorService) vxq.f30318a.get("makeIOExecutorService").invoke(null, 4, 1024, 120, "FBIoThrd");
        } catch (Throwable th3) {
            pgh.l(th3);
            executorService2 = null;
        }
        b = executorService2;
        c = new Handler(Looper.getMainLooper());
        try {
            scheduledExecutorService = (ScheduledExecutorService) vxq.f30318a.get("makeScheduledExecutorService").invoke(null, 1, "FbLowThrd");
        } catch (Throwable th4) {
            pgh.l(th4);
        }
        d = scheduledExecutorService;
    }
}
