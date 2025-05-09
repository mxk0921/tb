package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.ProxyCacheException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public eq9 f17527a;
    public final z9q b;
    public final pr2 c;
    public volatile ExecutorService g;
    public volatile boolean h;
    public final Object d = new Object();
    public final Object e = new Object();
    public volatile int i = -1;
    public final AtomicBoolean j = new AtomicBoolean(true);
    public final AtomicBoolean k = new AtomicBoolean(false);
    public long l = 0;
    public long m = 0;
    public final AtomicLong n = new AtomicLong(0);
    public final AtomicLong o = new AtomicLong(0);
    public final AtomicInteger f = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(774897900);
        }

        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d2n.a(d2n.this);
            d2n.b(d2n.this).set(true);
            d2n.c(d2n.this).set(true);
        }
    }

    static {
        t2o.a(774897898);
    }

    public d2n(z9q z9qVar, pr2 pr2Var, t7b t7bVar) {
        this.b = (z9q) epm.b(z9qVar);
        this.c = (pr2) epm.b(pr2Var);
    }

    public static /* synthetic */ void a(d2n d2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d0be69", new Object[]{d2nVar});
        } else {
            d2nVar.n();
        }
    }

    public static /* synthetic */ AtomicBoolean b(d2n d2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("df406c88", new Object[]{d2nVar});
        }
        return d2nVar.j;
    }

    public static /* synthetic */ AtomicBoolean c(d2n d2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("a66fb8a7", new Object[]{d2nVar});
        }
        return d2nVar.k;
    }

    public final void d() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e4e932", new Object[]{this});
            return;
        }
        int i = this.f.get();
        if (i >= 1) {
            this.f.set(0);
            throw new ProxyCacheException("Error reading source " + i + " times");
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc30b3a", new Object[]{this});
            return;
        }
        try {
            this.b.close();
        } catch (ProxyCacheException e) {
            l(new ProxyCacheException("Error closing source " + this.b, e));
        } catch (Exception e2) {
            l(new Exception("close source unknown exception " + this.b, e2));
        }
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85ebbc5f", new Object[]{this})).longValue();
        }
        return this.o.get();
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19cd9331", new Object[]{this})).longValue();
        }
        return this.n.get();
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d2044e", new Object[]{this})).booleanValue();
        }
        if (VExecutors.currentThread().isInterrupted() || this.h) {
            return true;
        }
        return false;
    }

    public final void i(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbeb41b", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        j(j, j2);
        synchronized (this.d) {
            this.d.notifyAll();
        }
    }

    public void j(long j, long j2) {
        int i;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3757ed", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 == 0) {
            i = 100;
        } else {
            i = (int) ((j * 100) / j2);
        }
        if (i == this.i) {
            z = false;
        }
        if (i2 >= 0 && z) {
            k(i);
        }
        this.i = i;
    }

    public void k(int i) {
        throw null;
    }

    public final void l(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        }
    }

    public int m(byte[] bArr, long j, int i, boolean z, boolean z2) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4da4e16", new Object[]{this, bArr, new Long(j), new Integer(i), new Boolean(z), new Boolean(z2)})).intValue();
        }
        e2n.a(bArr, j, i);
        this.l = System.currentTimeMillis();
        while (!this.c.isCompleted() && !this.h && this.c.available() < i + j) {
            if (!z2) {
                this.n.compareAndSet(0L, System.currentTimeMillis());
            }
            if (z && this.k.get()) {
                break;
            }
            o();
            r();
            d();
        }
        int b2 = this.c.b(bArr, j, i);
        long currentTimeMillis = System.currentTimeMillis();
        this.m = currentTimeMillis;
        if (currentTimeMillis - this.l > 100) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "cache read time is " + (this.m - this.l) + " mBeginWriteCacheTimeStamp is " + this.l + " mEndWriteCacheTimeStamp is " + this.m);
        }
        if (this.c.isCompleted() && this.i != 100) {
            this.i = 100;
            k(100);
        }
        return b2;
    }

    public final synchronized void o() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5812ceb2", new Object[]{this});
            return;
        }
        this.g = dq.b();
        if (!this.h && !this.c.isCompleted() && this.j.compareAndSet(true, false)) {
            this.g.submit(new b());
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        synchronized (this.e) {
            try {
                this.h = true;
                this.c.close();
            } catch (ProxyCacheException e) {
                l(e);
            }
        }
    }

    public final void q() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f966c69b", new Object[]{this});
            return;
        }
        synchronized (this.e) {
            try {
                if (!h() && this.c.available() == this.b.length()) {
                    this.c.complete();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca61fca0", new Object[]{this});
            return;
        }
        synchronized (this.d) {
            try {
                try {
                    this.d.wait(500L);
                } catch (InterruptedException e) {
                    throw new ProxyCacheException("Waiting source data is interrupted!", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
        if (r7 != false) goto L_0x00b2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
        q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
        if (r7 == false) goto L_0x00d1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
        q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
        r1 = tb.tfb.MODULE_SDK_PAGE;
        r2 = new java.lang.StringBuilder("readSource error: ");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.d2n.n():void");
    }
}
