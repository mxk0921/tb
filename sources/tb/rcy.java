package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorType;
import com.tanx.exposer.achieve.retry.AdMonitorRetryType;
import com.tanx.exposer.framework.connectivity.NetworkStateObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import tb.gcy;
import tb.qcy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rcy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f27285a;
    public ed0 b;
    public jcy c;
    public final d d;
    public final AtomicInteger e;
    public final NetworkStateObserver.b f;
    public int g;
    public final ConcurrentLinkedQueue<tcy> h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NetworkStateObserver.c.tanxc_do.a(rcy.this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rcy.this.h();
            String a2 = azv.a(System.currentTimeMillis(), "yyyy-MM-dd");
            qgh.a("AdRetryExposeManager", "currentDate=" + a2);
            rcy rcyVar = rcy.this;
            rcyVar.c.g(a2, rcyVar.g);
            rcy.c(rcy.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements NetworkStateObserver.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.tanx.exposer.framework.connectivity.NetworkStateObserver.b
        public void a(int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f616de17", new Object[]{this, new Integer(i)});
                return;
            }
            rcy rcyVar = rcy.this;
            if (i == -1) {
                z = false;
            }
            rcyVar.getClass();
            if (z && rcyVar.b.e() != null && rcy.this.b.e().i()) {
                rcy.this.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {
        static {
            t2o.a(283115554);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {
        public static final rcy tanxc_do = new rcy((byte) 0);

        static {
            t2o.a(283115555);
        }
    }

    static {
        t2o.a(283115550);
    }

    public /* synthetic */ rcy(byte b2) {
        this();
    }

    public static /* synthetic */ void c(rcy rcyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646927fc", new Object[]{rcyVar});
        } else {
            rcyVar.m();
        }
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd23f8e5", new Object[]{this});
            return;
        }
        this.d.getClass();
        int i = 5 - this.e.get();
        qgh.a("AdRetryExposeManager", "availableRetryCount=" + i);
        if (i > 0) {
            if (this.h.size() > 0) {
                qgh.a("AdRetryExposeManager", "failedRequestQueue.size=" + this.h.size());
                ArrayList arrayList = new ArrayList();
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    tcy poll = this.h.poll();
                    if (poll != null) {
                        arrayList.add(poll);
                        h();
                        this.c.e(poll.d());
                    }
                    i = i2;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j((tcy) it.next(), true);
                }
            }
        }
    }

    public void b(Context context, ed0 ed0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5692f9d", new Object[]{this, context, ed0Var});
            return;
        }
        this.f27285a = context;
        this.b = ed0Var;
        if (ed0Var.e() != null) {
            this.g = ed0Var.e().c();
        }
        l();
        g();
    }

    public void d(tcy tcyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc790923", new Object[]{this, tcyVar});
        } else if (tcyVar != null && this.h.contains(tcyVar) && this.h.remove(tcyVar)) {
            j(tcyVar, false);
        }
    }

    public void e(tcy tcyVar, int i, String str, boolean z) {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f970c0a", new Object[]{this, tcyVar, new Integer(i), str, new Boolean(z)});
        } else if (tcyVar != null) {
            if (z) {
                this.e.decrementAndGet();
            } else {
                tcyVar.f(AdMonitorRetryType.NONE);
                if (tcyVar.j() == null) {
                    obj = "";
                } else {
                    obj = tcyVar.j().toString();
                }
                kcy.a().commitFail("TanxExposer", "EXPOSER_SUCCESS_POINT", String.valueOf(i), str, obj);
            }
            ocy.g(tcyVar, i, str, z, tcyVar.m().name());
            h();
            if (!k(tcyVar)) {
                i(tcyVar, i, str, false);
            } else if (!this.h.contains(tcyVar)) {
                n();
                this.h.add(tcyVar);
                this.c.w(tcyVar);
                i(tcyVar, i, str, true);
            }
        }
    }

    public void f(tcy tcyVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a8ce11", new Object[]{this, tcyVar, new Boolean(z)});
            return;
        }
        if (z) {
            this.e.decrementAndGet();
        }
        if (tcyVar != null) {
            if (!z) {
                tcyVar.f(AdMonitorRetryType.NONE);
                if (tcyVar.j() == null) {
                    str = "";
                } else {
                    str = tcyVar.j().toString();
                }
                kcy.a().commitSuccess("TanxExposer", "EXPOSER_SUCCESS_POINT", str);
            }
            ocy.h(tcyVar, z, tcyVar.m().name());
            hcy d2 = ed0.h().d();
            if (!(d2 == null || tcyVar.m() == AdMonitorRetryType.DB)) {
                d2.d(tcyVar.i(), tcyVar.l(), tcyVar.j());
            }
            a();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e889dd", new Object[]{this});
        } else {
            pcy.a(new a(), 10000L);
        }
    }

    public synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6077", new Object[]{this});
            return;
        }
        if (this.c == null) {
            this.c = new jcy(this.f27285a);
        }
    }

    public final void i(tcy tcyVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc10838", new Object[]{this, tcyVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        hcy d2 = ed0.h().d();
        if (d2 != null && tcyVar.m() != AdMonitorRetryType.DB) {
            if (z) {
                d2.a(i, str, tcyVar.i(), tcyVar.l(), tcyVar.j());
            } else {
                d2.c(i, str, tcyVar.i(), tcyVar.l(), tcyVar.j());
            }
        }
    }

    public final void j(tcy tcyVar, boolean z) {
        szc szcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60154a3", new Object[]{this, tcyVar, new Boolean(z)});
        } else if (tcyVar != null) {
            if (z) {
                tcyVar.h().incrementAndGet();
                this.e.incrementAndGet();
            }
            lcy lcyVar = new lcy(this.b.e().d());
            if (tcyVar.l() == AdMonitorType.EXPOSE) {
                szcVar = new qcy.b(tcyVar, z);
            } else {
                szcVar = new gcy.b(tcyVar, z);
            }
            lcyVar.a(tcyVar.l(), tcyVar.k(), szcVar);
        }
    }

    public boolean k(tcy tcyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b8c6855", new Object[]{this, tcyVar})).booleanValue();
        }
        ad0 e2 = this.b.e();
        if (e2 != null && e2.j() && e2.f().contains(tcyVar.l()) && tcyVar.c() > 0 && tcyVar.h().get() < tcyVar.c()) {
            return true;
        }
        return false;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2029203", new Object[]{this});
        } else {
            pcy.a(new b(), 0L);
        }
    }

    public rcy() {
        this.d = new d();
        this.e = new AtomicInteger(0);
        this.f = new c();
        this.g = 3;
        this.h = new ConcurrentLinkedQueue<>();
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f00f5cf", new Object[]{this});
            return;
        }
        int size = this.h.size();
        this.d.getClass();
        if (size >= 500) {
            int size2 = this.h.size();
            this.d.getClass();
            ArrayList arrayList = new ArrayList(size2 - 500);
            while (true) {
                int size3 = this.h.size();
                this.d.getClass();
                if (size3 < 500) {
                    break;
                }
                tcy poll = this.h.poll();
                if (poll != null) {
                    arrayList.add(poll);
                    h();
                    this.c.e(poll.d());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i((tcy) it.next(), -2, "retry fail,exceed max retry count", false);
            }
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb506334", new Object[]{this});
            return;
        }
        h();
        List<tcy> b2 = this.c.b(azv.a(System.currentTimeMillis(), "yyyy-MM-dd"));
        if (!b2.isEmpty()) {
            int size = b2.size();
            if (qgh.f26737a) {
                qgh.a("AdRetryExposeManager", "sendRetryMonitor: count = " + size);
            }
            for (int i = 0; i < size; i++) {
                tcy tcyVar = b2.get(i);
                tcyVar.f(AdMonitorRetryType.DB);
                if (!k(tcyVar)) {
                    this.c.e(tcyVar.d());
                } else if (!this.h.contains(tcyVar)) {
                    n();
                    this.h.add(tcyVar);
                } else {
                    this.c.e(tcyVar.d());
                }
            }
            if (NetworkStateObserver.c.tanxc_do.b()) {
                a();
            } else if (qgh.f26737a) {
                qgh.a("AdRetryExposeManager", "sendRetryMonitor return because no net.");
            }
        } else if (qgh.f26737a) {
            qgh.a("AdRetryExposeManager", "sendRetryMonitor return because no retry monitor info.");
        }
    }
}
