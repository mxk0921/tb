package tb;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a25 implements ypt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ScheduledExecutorService b;
    public static final boolean c;

    /* renamed from: a  reason: collision with root package name */
    public Runnable f15495a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f15496a;

        public a(Runnable runnable) {
            this.f15496a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f15496a.run();
            a25.this.f15495a = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f15497a = new AtomicInteger();
        public final int b;
        public final String c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a extends Thread {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == 1548812690) {
                    super.run();
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/downloader/adapter/CustomThreadImpl$DownloadThreadFactory$1");
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Process.setThreadPriority(b.this.b);
                } catch (Throwable th) {
                    fs7.d("DownloadThreadFactory", "[run]Thread set thread priority error ---", th, new Object[0]);
                }
                try {
                    super.run();
                } catch (Throwable th2) {
                    fs7.d("DownloadThreadFactory", "[run]Thread run error ---", th2, new Object[0]);
                }
            }
        }

        public b(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("DownloadSDK ");
            if (!TextUtils.isEmpty(this.c)) {
                sb.append(this.c);
                sb.append(" ");
            } else {
                sb.append("DefaultPool ");
            }
            sb.append("Thread:");
            sb.append(this.f15497a.getAndIncrement());
            return new a(runnable, sb.toString());
        }
    }

    static {
        try {
            IpChange ipChange = VExecutors.$ipChange;
            c = true;
        } catch (Throwable unused) {
        }
    }

    public static ScheduledExecutorService b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("73e3b116", new Object[0]);
        }
        if (b == null) {
            synchronized (a25.class) {
                try {
                    if (b == null) {
                        if (!c || !d()) {
                            b = new ScheduledThreadPoolExecutor(10, new b(10, "Custom_Pool"));
                            if (b instanceof ScheduledThreadPoolExecutor) {
                                ((ScheduledThreadPoolExecutor) b).setKeepAliveTime(3L, TimeUnit.SECONDS);
                                ((ScheduledThreadPoolExecutor) b).allowCoreThreadTimeOut(true);
                            }
                        } else {
                            b = VExecutors.newScheduledThreadPool(10, new c(null));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static boolean d() {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3d24b10", new Object[0])).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            is64Bit = Process.is64Bit();
            if (!is64Bit) {
                return true;
            }
        }
        String str = Build.BRAND;
        if ((TextUtils.equals(str, SystemUtils.PRODUCT_HUAWEI) || TextUtils.equals(str, SystemUtils.PRODUCT_HONOR)) && i >= 23 && i <= 27) {
            return true;
        }
        return false;
    }

    public void a(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4467641a", new Object[]{this, runnable, new Boolean(z)});
        } else if (runnable != null) {
            fs7.e("Download.CustomThreadImpl", "[execute] Custom ThreadPool", new Object[0]);
            try {
                b().execute(runnable);
            } catch (Throwable th) {
                fs7.d("Download.CustomThreadImpl", "[execute] Custom ThreadPool error", th, new Object[0]);
            }
        }
    }

    public void c(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f55df7d", new Object[]{this, runnable, new Long(j)});
        } else if (this.f15495a == null && runnable != null) {
            this.f15495a = runnable;
            try {
                b().schedule(new a(runnable), j, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                fs7.d("Download.CustomThreadImpl", "[postDelayed] Custom ThreadPool error", th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f15499a;

        public c() {
            this.f15499a = new AtomicInteger();
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "Download_V_" + this.f15499a.getAndIncrement();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }
}
