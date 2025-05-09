package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hk2 implements rst, cuo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final huo f20701a;
    public final Queue<buo> b = new LinkedList();
    public int c;
    public int d;

    public hk2(huo huoVar, int i) {
        this.f20701a = huoVar;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:8:0x0019, B:10:0x001f, B:17:0x002f, B:18:0x0034), top: B:24:0x0019 }] */
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
            com.android.alibaba.ip.runtime.IpChange r2 = tb.hk2.$ipChange
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
            monitor-enter(r5)
            int r2 = r5.d     // Catch: all -> 0x002a
            int r3 = r5.c     // Catch: all -> 0x002a
            if (r2 < r3) goto L_0x002c
            java.util.Queue<tb.buo> r2 = r5.b     // Catch: all -> 0x002a
            java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch: all -> 0x002a
            boolean r2 = r2.offer(r6)     // Catch: all -> 0x002a
            if (r2 != 0) goto L_0x002d
            goto L_0x002c
        L_0x002a:
            r6 = move-exception
            goto L_0x003d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            int r2 = r5.d     // Catch: all -> 0x002a
            int r2 = r2 + r0
            r5.d = r2     // Catch: all -> 0x002a
        L_0x0034:
            monitor-exit(r5)     // Catch: all -> 0x002a
            if (r1 == 0) goto L_0x003c
            tb.huo r0 = r5.f20701a
            r0.a(r6)
        L_0x003c:
            return
        L_0x003d:
            monitor-exit(r5)     // Catch: all -> 0x002a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hk2.a(tb.buo):void");
    }

    public final void b() {
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
                    if (this.d < this.c) {
                        buoVar = (buo) ((LinkedList) this.b).poll();
                    } else {
                        buoVar = null;
                    }
                    if (buoVar != null) {
                        this.d++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (buoVar != null) {
                this.f20701a.a(buoVar);
                buo.q.set(buoVar2);
            } else {
                return;
            }
        }
    }

    @Override // tb.huo
    public int c() {
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
        synchronized (this) {
            this.d--;
        }
        b();
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
        b();
    }

    @Override // tb.huo
    public synchronized boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b9f46f", new Object[]{this})).booleanValue();
        }
        return this.f20701a.f();
    }

    @Override // tb.huo
    public synchronized String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return this.f20701a.getStatus();
    }
}
