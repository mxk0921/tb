package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class n8b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static final ScheduledExecutorService INSTANCE = Executors.newSingleThreadScheduledExecutor(new gst("ShortcutsThreadPool"));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static final ThreadPoolExecutor INSTANCE = new ThreadPoolExecutor(1, 1, 3, TimeUnit.SECONDS, new LinkedBlockingDeque(), new gst("WVCalendarSingleThreadPool"));
    }

    public static ScheduledExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("f6425e18", new Object[0]);
        }
        return a.INSTANCE;
    }

    public static ExecutorService b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("669119ad", new Object[0]);
        }
        ThreadPoolExecutor threadPoolExecutor = b.INSTANCE;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
