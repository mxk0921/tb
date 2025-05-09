package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nt6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f24938a;
    public Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static final nt6 instance = new nt6();

        static {
            t2o.a(487587983);
        }
    }

    static {
        t2o.a(487587981);
    }

    public static nt6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nt6) ipChange.ipc$dispatch("c5288e4f", new Object[0]);
        }
        return b.instance;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.f24938a == null) {
            try {
                HandlerThread handlerThread = new HandlerThread("HomePageDataSourceThread");
                this.f24938a = handlerThread;
                handlerThread.start();
                this.b = new Handler(this.f24938a.getLooper());
                new Handler(Looper.getMainLooper());
            } catch (Throwable unused) {
                this.f24938a = null;
            }
        }
    }

    public void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f14f41", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (Thread.currentThread() == this.f24938a) {
                runnable.run();
            } else {
                this.b.post(runnable);
            }
        }
    }

    public nt6() {
        b();
    }
}
