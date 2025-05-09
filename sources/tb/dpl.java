package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dpl implements rst, cuo, p3o<w3o> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final huo f17999a;
    public final Queue<buo> b = new LinkedList();
    public final SparseArray<Long> c = new SparseArray<>();
    public final List<Integer> d = new ArrayList();
    public final long e;
    public int f;
    public int g;
    public int h;
    public long i;
    public a j;
    public final boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    public dpl(huo huoVar, int i, int i2, boolean z) {
        this.f17999a = huoVar;
        this.g = i;
        this.e = i2 * 1000000;
        this.k = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
        j(r6);
     */
    @Override // tb.huo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(tb.buo r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.dpl.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "388bbf9d"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            r6.u(r5)
            boolean r2 = r5.k(r6)
            monitor-enter(r5)
            boolean r3 = r6.m()     // Catch: all -> 0x0027
            if (r3 == 0) goto L_0x0029
            r5.h()     // Catch: all -> 0x0027
            goto L_0x0029
        L_0x0027:
            r6 = move-exception
            goto L_0x004f
        L_0x0029:
            if (r2 != 0) goto L_0x003d
            int r2 = r5.h     // Catch: all -> 0x0027
            int r3 = r5.g     // Catch: all -> 0x0027
            if (r2 < r3) goto L_0x003d
            java.util.Queue<tb.buo> r2 = r5.b     // Catch: all -> 0x0027
            java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch: all -> 0x0027
            boolean r2 = r2.offer(r6)     // Catch: all -> 0x0027
            if (r2 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x0043
            r5.j(r6)     // Catch: all -> 0x0027
            goto L_0x0046
        L_0x0043:
            r6.p(r5)     // Catch: all -> 0x0027
        L_0x0046:
            monitor-exit(r5)     // Catch: all -> 0x0027
            if (r0 == 0) goto L_0x004e
            tb.huo r0 = r5.f17999a
            r0.a(r6)
        L_0x004e:
            return
        L_0x004f:
            monitor-exit(r5)     // Catch: all -> 0x0027
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dpl.a(tb.buo):void");
    }

    @Override // tb.p3o
    public void b(w3o w3oVar) {
        buo buoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919f9586", new Object[]{this, w3oVar});
        } else if (w3oVar != null) {
            int d = w3oVar.d();
            synchronized (this) {
                try {
                    Iterator<buo> it = this.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            buoVar = null;
                            break;
                        }
                        buoVar = it.next();
                        if (d == buoVar.e()) {
                            break;
                        }
                    }
                    if (buoVar != null) {
                        ((LinkedList) this.b).remove(buoVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (buoVar != null) {
                buoVar.b();
                buoVar.x(this);
                xv8.f("RxSysLog", "[PairingThrottling] ID=%d cancelled before scheduling the action in queue", Integer.valueOf(d));
            }
        }
    }

    @Override // tb.huo
    public synchronized int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2751476", new Object[]{this})).intValue();
        }
        return ((LinkedList) this.b).size();
    }

    @Override // tb.cuo
    public void d(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46703ad", new Object[]{this, buoVar});
            return;
        }
        int e = buoVar.e();
        if ((e <= 0 || this.k || buoVar.l()) && m(e)) {
            g();
        }
    }

    @Override // tb.rst
    public synchronized void e(int i) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b200094a", new Object[]{this, new Integer(i)});
                return;
            }
            synchronized (this) {
                if (this.f >= 3 || i == this.g) {
                    z = false;
                }
                if (z) {
                    this.g = i;
                }
                if (z) {
                    g();
                }
            }
        }
    }

    @Override // tb.huo
    public synchronized boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b9f46f", new Object[]{this})).booleanValue();
        }
        return this.f17999a.f();
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
                    h();
                    if (this.h < this.g) {
                        buoVar = (buo) ((LinkedList) this.b).poll();
                    } else {
                        buoVar = null;
                    }
                    if (buoVar != null) {
                        j(buoVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (buoVar != null) {
                buoVar.x(this);
                this.f17999a.a(buoVar);
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
        return this.f17999a.getStatus();
    }

    public final synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779ddba8", new Object[]{this});
            return;
        }
        long nanoTime = System.nanoTime();
        if (nanoTime - this.i >= 30000000) {
            this.i = nanoTime;
            ((ArrayList) this.d).clear();
            int size = this.c.size();
            long nanoTime2 = System.nanoTime();
            for (int i = 0; i < size; i++) {
                Long valueAt = this.c.valueAt(i);
                if (valueAt != null && nanoTime2 - valueAt.longValue() >= this.e) {
                    ((ArrayList) this.d).add(Integer.valueOf(this.c.keyAt(i)));
                }
            }
            int size2 = ((ArrayList) this.d).size();
            boolean z = false;
            for (int i2 = 0; i2 < size2; i2++) {
                Integer num = (Integer) ((ArrayList) this.d).get(i2);
                int intValue = num.intValue();
                xv8.f("RxSysLog", "[PairingThrottling] remove expired pair, id=%d", num);
                if (!m(intValue) && !z) {
                    z = false;
                }
                z = true;
            }
            int i3 = this.f;
            if (i3 < 3) {
                int i4 = i3 + size2;
                this.f = i4;
                if (i4 >= 3) {
                    this.g = Integer.MAX_VALUE;
                    xv8.k("RxSysLog", "[PairingThrottling] auto degrade to unlimited scheduler, expired total=%d", Integer.valueOf(i4));
                    a aVar = this.j;
                    if (aVar != null) {
                        ((TBImageFlowMonitor) aVar).G();
                    }
                }
            }
            if (z) {
                g();
            }
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ec6fd2", new Object[]{this, new Integer(i)});
        } else if (m(i)) {
            g();
        }
    }

    public final synchronized void j(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aec4272", new Object[]{this, buoVar});
            return;
        }
        int e = buoVar.e();
        if (e <= 0) {
            this.h++;
        } else if (buoVar.m() && this.c.get(e) == null) {
            this.c.put(e, Long.valueOf(System.nanoTime()));
            this.h++;
        }
    }

    public final boolean k(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c149f358", new Object[]{this, buoVar})).booleanValue();
        }
        if (buoVar.e() <= 0 || buoVar.m() || !buoVar.l()) {
            return false;
        }
        return true;
    }

    public void l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5add4f", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    public final boolean m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfae6018", new Object[]{this, new Integer(i)})).booleanValue();
        }
        synchronized (this) {
            try {
                if (i <= 0) {
                    this.h--;
                    return true;
                } else if (this.c.get(i) == null) {
                    return false;
                } else {
                    this.c.remove(i);
                    this.h--;
                    return true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
