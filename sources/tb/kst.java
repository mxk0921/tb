package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kst {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "address.ThreadUtils";

    /* renamed from: a  reason: collision with root package name */
    public static final ScheduledExecutorService f22895a = new ScheduledThreadPoolExecutor(4, new of0("AddressDelayThread"));
    public static final ExecutorService b = Executors.newCachedThreadPool(new of0("AddressThread"));

    static {
        new Handler(Looper.getMainLooper());
    }

    public static ExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("3aef58be", new Object[0]);
        }
        return b;
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429895e3", new Object[]{runnable});
        } else {
            b.execute(runnable);
        }
    }

    public static void c(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2828cf55", new Object[]{runnable, new Long(j)});
        } else {
            ((ScheduledThreadPoolExecutor) f22895a).schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }
}
