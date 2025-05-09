package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ms6 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile int c = -1;
    private static ExecutorService d;
    private static Handler e;

    /* renamed from: a  reason: collision with root package name */
    public ayb f24270a;
    public a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void onFinish();
    }

    static {
        t2o.a(157286614);
    }

    public ms6(ayb aybVar) {
        this.f24270a = aybVar;
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[0]);
            return;
        }
        ExecutorService executorService = d;
        if (executorService != null && !executorService.isShutdown()) {
            d.shutdownNow();
        }
        c();
        c = -1;
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        synchronized (ms6.class) {
            try {
                if (c == -1) {
                    if (d != null) {
                        a();
                    }
                    d = pav.e(1, 1, 100L, TimeUnit.MILLISECONDS, "DataRequestTask");
                    e = new Handler(Looper.getMainLooper());
                    c = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a851129", new Object[0]);
            return;
        }
        Handler handler = e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        if (c == -1) {
            b();
        }
        d.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        ayb aybVar = this.f24270a;
        if (aybVar != null) {
            aybVar.a(this.b);
        }
    }

    public ms6(ayb aybVar, a aVar) {
        this.f24270a = aybVar;
        this.b = aVar;
    }
}
