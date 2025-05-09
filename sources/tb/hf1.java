package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hf1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20589a = true;
    public final Object b = new Object();
    public final String c;
    public final Runnable d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hf1 hf1Var = hf1.this;
            hf1.b(hf1Var, hf1.a(hf1Var));
        }
    }

    public hf1(String str, Runnable runnable) {
        this.c = str;
        this.d = runnable;
    }

    public static /* synthetic */ Runnable a(hf1 hf1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("497e9f50", new Object[]{hf1Var});
        }
        return hf1Var.d;
    }

    public static /* synthetic */ void b(hf1 hf1Var, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39593983", new Object[]{hf1Var, runnable});
        } else {
            hf1Var.g(runnable);
        }
    }

    public static hf1 f(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hf1) ipChange.ipc$dispatch("6d691d38", new Object[]{str, runnable});
        }
        return new hf1(str, runnable);
    }

    public hf1 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hf1) ipChange.ipc$dispatch("678c7dfa", new Object[]{this});
        }
        synchronized (this.b) {
            this.f20589a = false;
        }
        a aVar = new a();
        new Thread(aVar, this.c + "Async").start();
        return this;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7b62dd", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            e();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910a4c02", new Object[]{this});
            return;
        }
        while (!this.f20589a) {
            try {
                this.b.wait();
            } catch (Throwable th) {
                whh.b("AsyncWaiter", "error occurred when await loaded for: " + this.c, th);
            }
        }
    }

    public final void g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c60a96", new Object[]{this, runnable});
            return;
        }
        synchronized (this.b) {
            if (!this.f20589a) {
                runnable.run();
                this.f20589a = true;
                this.b.notifyAll();
            }
        }
    }
}
