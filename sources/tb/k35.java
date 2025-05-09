package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.i35;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k35 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f22373a = new AtomicInteger(0);
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        /* compiled from: Taobao */
        /* renamed from: tb.k35$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0962a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f22374a;

            public RunnableC0962a(Runnable runnable) {
                this.f22374a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Thread.currentThread().setPriority(5);
                Process.setThreadPriority(a.this.b);
                if ("launcher-async".equals(a.this.c)) {
                    i1d.a();
                }
                this.f22374a.run();
            }
        }

        public a(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            RunnableC0962a aVar = new RunnableC0962a(runnable);
            return new Thread(aVar, this.c + "-" + this.f22373a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22375a;

        public b(String str) {
            this.f22375a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.f22375a + "-scheduled-launcher");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22376a;

        public c(String str) {
            this.f22376a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.f22376a + "-scheduled-launcher");
        }
    }

    public static i35 a(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i35) ipChange.ipc$dispatch("1981e786", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        return b(str, i, i2, i3, null);
    }

    public static i35 b(String str, int i, int i2, int i3, i35.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i35) ipChange.ipc$dispatch("a598deb9", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), aVar});
        }
        return new i35(i, i2, aVar, new a(i3, str));
    }

    public static ScheduledExecutorService c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("ec04c31e", new Object[]{str});
        }
        if (t.a(LauncherRuntime.g, "next_launch_thread_opt")) {
            return e(str);
        }
        return d(str);
    }

    public static ScheduledExecutorService d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("40d7afd", new Object[]{str});
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new b(str));
        scheduledThreadPoolExecutor.setKeepAliveTime(5L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public static ScheduledExecutorService e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("1c764026", new Object[]{str});
        }
        return Executors.newSingleThreadScheduledExecutor(new c(str));
    }
}
