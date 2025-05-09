package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class euh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GC_EVENT_NAME = "on_gc";
    public static volatile long c;
    public static boolean d;
    public static volatile boolean f;

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayDeque<cuh> f18819a = new ArrayDeque<>();
    public static final AtomicInteger b = new AtomicInteger(0);
    public static final AtomicInteger e = new AtomicInteger(0);
    public static final AtomicLong g = new AtomicLong();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f18820a;

        public a(long j) {
            this.f18820a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (euh.g(this.f18820a)) {
                cuh g = cuh.g();
                g.k(this.f18820a);
                g.h(fuh.a());
                g.j(euh.GC_EVENT_NAME);
                while (euh.h().size() >= 100) {
                    euh.h().poll();
                }
                euh.h().add(g);
            } else {
                euh.i();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f18821a;

        public /* synthetic */ b(int i, a aVar) {
            this(i);
        }

        public void finalize() throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            } else if (euh.a()) {
                guh.a(guh.DETAIL_LOG, "MTSGc:监听器降级成功，token:" + this.f18821a);
            } else if (this.f18821a != euh.b().get()) {
                guh.a(guh.DETAIL_LOG, "MTSGc:当前监听器已经失效，token:" + this.f18821a);
            } else if (!euh.c()) {
                guh.a(guh.DETAIL_LOG, "MTSGc:所有监听器已经失效，token:" + this.f18821a);
            } else {
                euh.d().incrementAndGet();
                long g = cvh.g();
                guh.a(guh.DETAIL_LOG, "MTSGc:gcTime:" + g + "，token:" + this.f18821a);
                euh.e(g);
                euh.f(new WeakReference(new b(this.f18821a)));
            }
        }

        public b(int i) {
            this.f18821a = i;
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return d;
    }

    public static /* synthetic */ AtomicInteger b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("64f15fa2", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue();
        }
        return f;
    }

    public static /* synthetic */ AtomicLong d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicLong) ipChange.ipc$dispatch("731a9db8", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7011a9", new Object[]{new Long(j)});
        } else {
            k(j);
        }
    }

    public static /* synthetic */ WeakReference f(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("c12c016e", new Object[]{weakReference});
        }
        return weakReference;
    }

    public static /* synthetic */ boolean g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d326b6b", new Object[]{new Long(j)})).booleanValue();
        }
        return r(j);
    }

    public static /* synthetic */ ArrayDeque h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayDeque) ipChange.ipc$dispatch("4c76e140", new Object[0]);
        }
        return f18819a;
    }

    public static /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6407e17f", new Object[0]);
        } else {
            t();
        }
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd62b7a", new Object[0]);
            return;
        }
        c = cvh.g();
        b.incrementAndGet();
        if (!f) {
            f = true;
            new WeakReference(new b(n(), null));
        }
    }

    public static void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268f9ad5", new Object[]{new Long(j)});
        } else {
            wuh.b().a(new a(j));
        }
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3800e1e3", new Object[0]);
        } else if (f) {
            f = false;
            guh.a(guh.DETAIL_LOG, "MTSGc: 正在销毁监听器，token:" + e.getAndIncrement());
        }
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47a2c8e", new Object[0]);
            return;
        }
        guh.a(guh.TAG, "MTSGc:监听器开始降级。");
        d = true;
        t();
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45dc4da2", new Object[0])).intValue();
        }
        AtomicInteger atomicInteger = e;
        int incrementAndGet = atomicInteger.incrementAndGet();
        if (incrementAndGet > 0) {
            return incrementAndGet;
        }
        atomicInteger.set(0);
        return atomicInteger.incrementAndGet();
    }

    public static long o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77234002", new Object[0])).longValue();
        }
        return g.get();
    }

    public static ArrayList<cuh> p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("98023191", new Object[]{new Long(j)});
        }
        ArrayList<cuh> arrayList = new ArrayList<>();
        Iterator<cuh> it = f18819a.iterator();
        while (it.hasNext()) {
            cuh next = it.next();
            if (next.f() > j) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93e50e50", new Object[0])).booleanValue();
        }
        return d;
    }

    public static boolean r(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab06170f", new Object[]{new Long(j)})).booleanValue();
        }
        if (b.get() <= 0 || j - c >= 30000) {
            return false;
        }
        return true;
    }

    public static void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba4a21d", new Object[0]);
            return;
        }
        b.decrementAndGet();
        if (!r(cvh.g())) {
            t();
        }
    }

    public static void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209251a0", new Object[0]);
            return;
        }
        ArrayDeque<cuh> arrayDeque = f18819a;
        if (!arrayDeque.isEmpty()) {
            arrayDeque.clear();
        }
        b.set(0);
        l();
    }
}
