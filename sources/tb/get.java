package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class get {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Handler f19937a;
    public HandlerThread b;
    public Handler c;
    public HandlerThread d;
    public Handler e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static final get INSTANCE = new get();

        static {
            t2o.a(486539748);
        }
    }

    static {
        t2o.a(486539746);
    }

    public static get a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (get) ipChange.ipc$dispatch("6f97611f", new Object[0]);
        }
        return b.INSTANCE;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce96e7e", new Object[]{this});
        } else {
            this.f19937a = new Handler(Looper.getMainLooper());
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e4b137", new Object[]{this});
            return;
        }
        if (bve.d()) {
            this.b = new HandlerThread("InfoFlowCoreSubThread");
        } else {
            this.b = wsa.a("InfoFlowCoreSubThread");
        }
        this.b.start();
        this.c = new Handler(this.b.getLooper());
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3765ba1", new Object[]{this});
            return;
        }
        if (bve.d()) {
            this.d = new HandlerThread("InfoFlowCoreUserTrackThread");
        } else {
            this.d = wsa.a("InfoFlowCoreUserTrackThread");
        }
        this.d.start();
        this.e = new Handler(this.d.getLooper());
    }

    public void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f14f41", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (Thread.currentThread() == this.b) {
                runnable.run();
            } else {
                this.c.post(runnable);
            }
        }
    }

    public void f(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5a9259", new Object[]{this, runnable, new Long(j)});
        } else if (runnable != null) {
            if (j == 0) {
                this.f19937a.post(runnable);
            } else {
                this.f19937a.postDelayed(runnable, j);
            }
        }
    }

    public void g(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11dac4d8", new Object[]{this, runnable, new Long(j)});
        } else if (runnable != null) {
            if (j == 0) {
                this.c.post(runnable);
            } else {
                this.c.postDelayed(runnable, j);
            }
        }
    }

    public void h(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44b6a68", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f19937a.post(runnable);
            }
        }
    }

    public void i(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e72592f", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (!bve.s()) {
                runnable.run();
                fve.e("TaskExecutor", "postUserTrackThread ut子线程开关关闭，使用原线程调度");
                return;
            }
            fve.e("TaskExecutor", "postUserTrackThread ut子线程执行");
            if (Thread.currentThread() == this.d) {
                runnable.run();
            } else {
                this.e.post(runnable);
            }
        }
    }

    public void j(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1429dd", new Object[]{this, runnable});
        } else if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
    }

    public void k(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f14d14c", new Object[]{this, runnable});
        } else if (runnable != null) {
            this.f19937a.removeCallbacks(runnable);
        }
    }

    public get() {
        c();
        b();
        d();
    }
}
