package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f23787a;
    public Handler b;
    public Handler c;
    public HandlerThread d;
    public Handler e;
    public HandlerThread f;
    public Handler g;
    public HandlerThread h;
    public Handler i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static final m5a instance = new m5a();

        static {
            t2o.a(729808916);
        }
    }

    static {
        t2o.a(729808914);
    }

    public static m5a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m5a) ipChange.ipc$dispatch("3ada8152", new Object[0]);
        }
        return b.instance;
    }

    public Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b010e33", new Object[]{this});
        }
        return this.e;
    }

    public Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("cd8cc975", new Object[]{this});
        }
        return this.b;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.c = new Handler(Looper.getMainLooper());
        if (this.f23787a == null) {
            try {
                HandlerThread handlerThread = new HandlerThread("HomeGateway1Thread");
                this.f23787a = handlerThread;
                handlerThread.start();
                this.b = new Handler(this.f23787a.getLooper());
            } catch (Throwable th) {
                bqa.b("GatewayThreadMgr", "HomeGateway1Thread create fail", th);
                this.f23787a = null;
            }
        }
        if (this.d == null) {
            try {
                HandlerThread handlerThread2 = new HandlerThread("HomeMtopThread");
                this.d = handlerThread2;
                handlerThread2.start();
                this.e = new Handler(this.d.getLooper());
            } catch (Throwable th2) {
                bqa.b("GatewayThreadMgr", "HomeMtopThread create fail", th2);
                this.d = null;
            }
        }
        if (this.f == null) {
            try {
                HandlerThread handlerThread3 = new HandlerThread("HomeTraceLogThread");
                this.f = handlerThread3;
                handlerThread3.start();
                this.g = new Handler(this.f.getLooper());
            } catch (Throwable th3) {
                bqa.b("GatewayThreadMgr", "HomeTraceLogThread create fail", th3);
                this.f = null;
            }
        }
        if (this.h == null) {
            try {
                HandlerThread handlerThread4 = new HandlerThread("HomeIOThread");
                this.h = handlerThread4;
                handlerThread4.start();
                this.i = new Handler(this.h.getLooper());
            } catch (Throwable th4) {
                bqa.b("GatewayThreadMgr", "HomeIOThread create fail", th4);
                this.h = null;
            }
        }
        f0b.i().o(true);
    }

    public void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f14f41", new Object[]{this, runnable});
        } else if (runnable != null && this.f23787a != null) {
            if (Thread.currentThread() == this.f23787a) {
                runnable.run();
            } else {
                this.b.post(runnable);
            }
        }
    }

    public void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85adef9a", new Object[]{this, runnable});
        } else {
            this.b.postAtFrontOfQueue(runnable);
        }
    }

    public void g(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5a9259", new Object[]{this, runnable, new Long(j)});
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
            ipChange.ipc$dispatch("56ea9cf5", new Object[]{this, runnable});
        } else if (runnable != null && this.h != null) {
            if (Thread.currentThread() == this.h) {
                runnable.run();
            } else {
                this.i.post(runnable);
            }
        }
    }

    public void i(Runnable runnable) {
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

    public void j(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29dbead8", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.c.postAtFrontOfQueue(runnable);
            }
        }
    }

    public void k(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53725774", new Object[]{this, runnable});
        } else if (runnable != null && this.f != null) {
            if (Thread.currentThread() == this.f) {
                runnable.run();
            } else {
                this.g.post(runnable);
            }
        }
    }

    public m5a() {
        d();
    }
}
