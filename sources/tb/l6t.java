package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import tb.cpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l6t implements cpr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static l6t h;
    public m6t c;
    public cpr d;
    public cpr.b e;
    public String f;

    /* renamed from: a  reason: collision with root package name */
    public final String f23141a = l6t.class.getSimpleName();
    public final Runnable g = new a();
    public final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
                l6t.a(l6t.this);
            }
        }
    }

    static {
        t2o.a(806356410);
        t2o.a(806356196);
    }

    public l6t() {
        TaoLiveLaunchInitializer.init();
    }

    public static /* synthetic */ void a(l6t l6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7625a7ec", new Object[]{l6tVar});
        } else {
            l6tVar.p();
        }
    }

    public static String f(m6t m6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("905ac651", new Object[]{m6tVar});
        }
        g();
        l6t l6tVar = new l6t();
        h = l6tVar;
        l6tVar.y(m6tVar);
        return h.m();
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7c00a", new Object[0]);
            return;
        }
        l6t l6tVar = h;
        if (l6tVar != null) {
            l6tVar.B();
            h = null;
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f4bb54", new Object[]{str});
            return;
        }
        l6t l6tVar = h;
        if (l6tVar != null && str != null && str.equals(l6tVar.m())) {
            g();
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba8f16c", new Object[]{this});
            return;
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            cprVar.z();
            this.d.l0();
            if (this.c.g()) {
                cpr cprVar2 = this.d;
                if (cprVar2 instanceof wkr) {
                    ((wkr) cprVar2).v0(this.c);
                }
            }
            this.d = null;
        }
        this.b.removeCallbacksAndMessages(null);
        this.e = null;
        this.c = null;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1002ca60", new Object[]{this, str});
            return;
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            cprVar.n(str);
        }
    }

    public void c(hbd hbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef6cf7", new Object[]{this, hbdVar});
            return;
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            cprVar.q(hbdVar);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2056d6", new Object[]{this});
            return;
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            cprVar.s();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec10943", new Object[]{this});
            return;
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            cprVar.t();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81652", new Object[]{this});
            return;
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            cprVar.y();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d8f98", new Object[]{this});
            return;
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            cprVar.z();
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713f4d9e", new Object[]{this, str});
            return;
        }
        this.f = str + "_" + System.currentTimeMillis();
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98e4f580", new Object[]{this});
        }
        return this.f;
    }

    public bwd n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bwd) ipChange.ipc$dispatch("80c7fafa", new Object[]{this});
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            return cprVar.E();
        }
        return v2s.o().a();
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a62424", new Object[]{this, new Boolean(z)});
            return;
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            cprVar.J(z);
        }
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        cpr.b bVar = this.e;
        if (bVar != null) {
            bVar.onMessageReceived(i, obj);
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ba114", new Object[]{this});
            return;
        }
        m6t m6tVar = this.c;
        if (m6tVar == null) {
            eir.a(this.f23141a, "PMModel is null when start subscribe PM");
        } else if (m6tVar.m()) {
            m6t m6tVar2 = this.c;
            this.d = new cpr(1, m6tVar2.c, null, m6tVar2.e(), this.c.f(), this.c.i(), false, this);
        } else if (hjr.i()) {
            x(this.c);
        } else {
            z(this.c);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            cprVar.O();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            cprVar.P();
        }
    }

    public void u(ncc nccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74714414", new Object[]{this, nccVar});
            return;
        }
        cpr cprVar = this.d;
        if (cprVar != null) {
            cprVar.a0(nccVar);
        }
    }

    public void v(cpr.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69502c", new Object[]{this, bVar});
        } else {
            this.e = bVar;
        }
    }

    public final void x(m6t m6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb58ad9", new Object[]{this, m6tVar});
            return;
        }
        this.d = new wkr(1, m6tVar.c, null, m6tVar.e(), m6tVar.f(), m6tVar.i(), m6tVar.h(), this, m6tVar.j(), m6tVar.k());
        if (m6tVar.l()) {
            this.d.b0(true);
            this.d.e0(m6tVar.b());
            this.d.f0(m6tVar.c());
            this.d.g0(m6tVar.d());
        }
        this.d.d0(m6tVar.d);
        this.d.a0(m6tVar.f);
        if (m6tVar.g()) {
            cpr cprVar = this.d;
            if (cprVar instanceof wkr) {
                ((wkr) cprVar).w0(m6tVar);
            }
        }
        this.d.y();
    }

    public void y(m6t m6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e2bc14", new Object[]{this, m6tVar});
            return;
        }
        this.c = m6tVar;
        k(m6tVar.c);
        int i = m6tVar.g;
        if (i != 0) {
            this.b.postDelayed(this.g, i);
        } else {
            p();
        }
    }

    public final void z(m6t m6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cb1d44", new Object[]{this, m6tVar});
            return;
        }
        xlr xlrVar = new xlr(1, m6tVar.c, null, m6tVar.f28751a, m6tVar.e(), m6tVar.f(), m6tVar.i(), m6tVar.h(), m6tVar.b, false, false, this);
        this.d = xlrVar;
        xlrVar.d0(m6tVar.d);
        this.d.a0(m6tVar.f);
        this.d.i0();
        this.d.y();
    }
}
