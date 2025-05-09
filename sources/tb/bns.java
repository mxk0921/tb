package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f16497a;
    public Handler b;
    public Handler c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static final bns instance = new bns();

        static {
            t2o.a(329252886);
        }
    }

    static {
        t2o.a(329252884);
    }

    public static bns a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bns) ipChange.ipc$dispatch("2c60dbd4", new Object[0]);
        }
        return b.instance;
    }

    public Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("cd8cc975", new Object[]{this});
        }
        return this.b;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.f16497a == null) {
            try {
                HandlerThread handlerThread = new HandlerThread("TScheduleThread");
                this.f16497a = handlerThread;
                handlerThread.start();
                this.b = new Handler(this.f16497a.getLooper());
                this.c = new Handler(Looper.getMainLooper());
            } catch (Throwable unused) {
                this.f16497a = null;
            }
        }
    }

    public void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f14f41", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (Thread.currentThread() == this.f16497a) {
                runnable.run();
            } else {
                this.b.post(runnable);
            }
        }
    }

    public void e(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47566c86", new Object[]{this, runnable, new Long(j)});
        } else if (runnable != null) {
            this.b.postDelayed(runnable, j);
        }
    }

    public void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44b6a68", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.c.post(runnable);
            }
        }
    }

    public bns() {
        c();
    }
}
