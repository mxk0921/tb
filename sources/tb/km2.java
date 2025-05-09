package tb;

import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class km2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile km2 f22752a;
    public static ExecutorService b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f22753a;

        public a(km2 km2Var, Runnable runnable) {
            this.f22753a = runnable;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            this.f22753a.run();
            return false;
        }
    }

    static {
        t2o.a(619708443);
    }

    public km2() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new usw("BrowserExecutor"));
        b = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static km2 a() {
        km2 km2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (km2) ipChange.ipc$dispatch("e0bca6d2", new Object[0]);
        }
        if (f22752a != null) {
            return f22752a;
        }
        synchronized (km2.class) {
            try {
                if (f22752a == null) {
                    f22752a = new km2();
                }
                km2Var = f22752a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return km2Var;
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc13e81d", new Object[]{this, runnable});
        } else {
            ((ThreadPoolExecutor) b).execute(runnable);
        }
    }

    public void c(Runnable runnable) {
        MessageQueue queue;
        a aVar = new a(this, runnable);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                queue = Looper.getMainLooper().getQueue();
                queue.addIdleHandler(aVar);
            } else {
                Looper mainLooper = Looper.getMainLooper();
                Field field = mainLooper.getClass().getField("mQueue");
                field.setAccessible(true);
                ((MessageQueue) field.get(mainLooper)).addIdleHandler(aVar);
            }
        } catch (Throwable th) {
            y7t.a("BrowserExecutor", "runOnUIIdle: error " + th);
            th.printStackTrace();
        }
    }
}
