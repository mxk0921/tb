package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.rxm.schedule.CentralSchedulerQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y5i implements rst, pn8, cuo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final huo f31866a;
    public final CentralSchedulerQueue b;
    public int c;
    public int d;

    public y5i(huo huoVar, int i, int i2, int i3) {
        this.f31866a = huoVar;
        this.c = i;
        this.b = new CentralSchedulerQueue(this, i2, i3);
    }

    @Override // tb.huo
    public void a(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388bbf9d", new Object[]{this, buoVar});
            return;
        }
        buoVar.v(this);
        i(buoVar, true);
    }

    @Override // tb.pn8
    public synchronized boolean b() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1431f003", new Object[]{this})).booleanValue();
            }
            if (this.d < this.c) {
                z = true;
            }
            return z;
        }
    }

    @Override // tb.huo
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2751476", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    @Override // tb.cuo
    public void d(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46703ad", new Object[]{this, buoVar});
            return;
        }
        synchronized (this) {
            this.d--;
        }
        g();
    }

    @Override // tb.rst
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b200094a", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this) {
            this.c = i;
        }
        g();
    }

    @Override // tb.huo
    public synchronized boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b9f46f", new Object[]{this})).booleanValue();
        }
        return this.f31866a.f();
    }

    public final void g() {
        buo buoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c2e03f", new Object[]{this});
            return;
        }
        buo buoVar2 = buo.q.get();
        while (true) {
            synchronized (this) {
                try {
                    if (this.d >= this.c && !this.b.reachPatienceCapacity()) {
                        buoVar = null;
                    }
                    buoVar = (buo) this.b.poll();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (buoVar != null) {
                i(buoVar, false);
                buo.q.set(buoVar2);
            } else {
                return;
            }
        }
    }

    @Override // tb.huo
    public synchronized String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return "MasterThrottling[running=" + this.d + ", max=" + this.c + "]," + this.f31866a.getStatus();
    }

    public final void h(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a6244d", new Object[]{this, buoVar});
        } else {
            buoVar.run();
        }
    }

    public final void i(buo buoVar, boolean z) {
        int moveIn;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d8703f", new Object[]{this, buoVar, new Boolean(z)});
            return;
        }
        synchronized (this) {
            try {
                moveIn = this.b.moveIn(buoVar, z);
                if (moveIn != 3) {
                    this.d++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (moveIn == 1) {
            this.f31866a.a(buoVar);
        } else if (moveIn == 2) {
            h(buoVar);
        }
    }
}
