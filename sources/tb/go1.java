package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class go1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iwl f20124a = new iwl();
    private final mj8 b;
    private volatile boolean c;

    static {
        t2o.a(723517442);
    }

    public go1(mj8 mj8Var) {
        this.b = mj8Var;
    }

    public void a(iwq iwqVar, Event event, kj8 kj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1646f16d", new Object[]{this, iwqVar, event, kj8Var});
            return;
        }
        gwl a2 = gwl.a(iwqVar, event, kj8Var);
        synchronized (this) {
            try {
                this.f20124a.a(a2);
                if (!this.c) {
                    this.c = true;
                    this.b.c().execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (true) {
            try {
                try {
                    gwl c = this.f20124a.c(1000);
                    if (c == null) {
                        synchronized (this) {
                            c = this.f20124a.b();
                            if (c == null) {
                                this.c = false;
                                this.c = false;
                                return;
                            }
                        }
                    }
                    this.b.d(c);
                } catch (InterruptedException unused) {
                    Thread.currentThread().getName();
                    this.c = false;
                    return;
                }
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }
}
