package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u5o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f29162a;
    public static final Handler b;
    public static final ThreadPoolExecutor c = pos.mExecutor;

    static {
        t2o.a(912262655);
        HandlerThread handlerThread = new HandlerThread("DetailPreloadReqThread");
        handlerThread.start();
        b = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("DetailReqThread");
        handlerThread2.start();
        f29162a = new Handler(handlerThread2.getLooper());
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            c.execute(runnable);
        }
    }

    public static Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("404d6a84", new Object[0]);
        }
        return b;
    }

    public static Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("cd8cc975", new Object[0]);
        }
        return f29162a;
    }
}
