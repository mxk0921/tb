package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Handler f19242a;
    public HandlerThread b;
    public Handler c;
    public HandlerThread d;
    public Handler e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static final fet INSTANCE = new fet();
    }

    public static fet a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fet) ipChange.ipc$dispatch("8b30a0cd", new Object[0]);
        }
        return b.INSTANCE;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce96e7e", new Object[]{this});
        } else {
            this.f19242a = new Handler(Looper.getMainLooper());
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e4b137", new Object[]{this});
            return;
        }
        HandlerThread handlerThread = new HandlerThread("InfoFlowCoreSubThread");
        this.b = handlerThread;
        handlerThread.start();
        this.c = new Handler(this.b.getLooper());
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3765ba1", new Object[]{this});
            return;
        }
        HandlerThread handlerThread = new HandlerThread("InfoFlowCoreUserTrackThread");
        this.d = handlerThread;
        handlerThread.start();
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
                this.f19242a.post(runnable);
            } else {
                this.f19242a.postDelayed(runnable, j);
            }
        }
    }

    public void g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44b6a68", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f19242a.post(runnable);
            }
        }
    }

    public void h(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e72592f", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (Thread.currentThread() == this.d) {
                runnable.run();
            } else {
                this.e.post(runnable);
            }
        }
    }

    public fet() {
        c();
        b();
        d();
    }
}
