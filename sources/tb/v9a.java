package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v9a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f29867a;
    public final ScheduledExecutorService b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(v9a v9aVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "tcrash");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static final v9a INSTANCE = new v9a(null);
    }

    public /* synthetic */ v9a(a aVar) {
        this();
    }

    public static v9a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v9a) ipChange.ipc$dispatch("a27662f", new Object[0]);
        }
        return b.INSTANCE;
    }

    public ScheduledExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("7196a47e", new Object[]{this});
        }
        return this.b;
    }

    public Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("25d5cc55", new Object[]{this});
        }
        if (this.f29867a == null) {
            HandlerThread handlerThread = new HandlerThread("tcrash-h");
            this.f29867a = handlerThread;
            handlerThread.start();
        }
        return new Handler(this.f29867a.getLooper());
    }

    public v9a() {
        this.f29867a = null;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(3, new a(this));
        this.b = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }
}
