package tb;

import android.os.Handler;
import android.os.Looper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ln8 {
    public static volatile ln8 c;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f23437a;
    public final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "nirvana_base_executor_queue_" + System.currentTimeMillis());
        }
    }

    public ln8() {
        new HashMap();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(4, new a(), new ThreadPoolExecutor.CallerRunsPolicy());
        this.f23437a = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(2L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.setMaximumPoolSize(4);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static String a(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            String stringWriter2 = stringWriter.toString();
            stringWriter.close();
            printWriter.close();
            return stringWriter2;
        } catch (Exception unused) {
            return "ErrorInfoFromException";
        }
    }

    public static ln8 b() {
        if (c == null) {
            synchronized (ThreadPoolExecutor.class) {
                try {
                    if (c == null) {
                        c = new ln8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void c(Runnable runnable) {
        this.b.post(runnable);
    }

    public void d(Runnable runnable, long j) {
        this.b.postDelayed(runnable, j);
    }

    public void e() {
        if (c != null) {
            synchronized (ThreadPoolExecutor.class) {
                try {
                    if (c != null) {
                        c.f23437a.shutdown();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void f(Runnable runnable) {
        this.b.removeCallbacks(runnable);
    }

    public void finalize() throws Throwable {
        super.finalize();
        e();
    }

    public void g(Runnable runnable) {
        this.f23437a.remove(runnable);
    }

    public RunnableScheduledFuture<?> h(Runnable runnable) {
        return i(runnable, 0L);
    }

    public RunnableScheduledFuture<?> i(Runnable runnable, long j) {
        if (j < 0) {
            j = 0;
        }
        return (RunnableScheduledFuture) this.f23437a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                safeRun();
            } catch (Throwable th) {
                try {
                    onException(th);
                } finally {
                    onFinal();
                }
            }
        }

        public abstract void safeRun();

        public void onFinal() {
        }

        public void onException(Throwable th) {
        }
    }
}
