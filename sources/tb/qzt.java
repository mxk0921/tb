package tb;

import com.alibaba.analytics.core.model.Log;
import com.alibaba.analytics.core.sync.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qzt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static qzt g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27025a = false;
    public ozt b = null;
    public ozt c = null;
    public boolean d = false;
    public e1e e = null;
    public int f = 0;

    static {
        t2o.a(962592948);
    }

    public static synchronized qzt b() {
        synchronized (qzt.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qzt) ipChange.ipc$dispatch("e3424f6", new Object[0]);
            }
            if (g == null) {
                g = new qzt();
            }
            return g;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bad7a2e2", new Object[]{this})).intValue();
        }
        ozt oztVar = this.c;
        if (oztVar == null || this.b == null || !this.d) {
            return 0;
        }
        this.d = false;
        nhh.f("TnetHostPortMgrCenter", "LastTnetHostPort type", Integer.valueOf(oztVar.d()), "TnetHostPort type", Integer.valueOf(this.b.d()));
        if (this.c.d() != 2 || this.b.d() == 2) {
            return 0;
        }
        return 1;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("865b2364", new Object[]{this})).intValue();
        }
        ozt oztVar = this.b;
        if (oztVar != null && oztVar.d() == 2 && this.b.d() == 2) {
            return this.b.c();
        }
        return 0;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3090142", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public ozt e() {
        ozt b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozt) ipChange.ipc$dispatch("f80b62d6", new Object[]{this});
        }
        this.d = true;
        this.c = this.b;
        if (uzt.b().g()) {
            this.e = uzt.b().e();
            this.f = uzt.b().d();
            e1e e1eVar = this.e;
            if (!(e1eVar == null || (b = e1eVar.b()) == null)) {
                this.f27025a = true;
                this.b = b;
                return b;
            }
        }
        if (this.f27025a && b.i().j() < 50) {
            b.i().k();
            this.f27025a = false;
        }
        ozt b2 = szt.d().b();
        if (b2 != null) {
            this.b = b2;
            return b2;
        }
        ozt b3 = pzt.d().b();
        this.b = b3;
        return b3;
    }

    public ozt f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozt) ipChange.ipc$dispatch("3879e562", new Object[]{this});
        }
        if (this.b == null) {
            this.b = e();
        }
        return this.b;
    }

    public void g(qe2 qe2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff5b6f3", new Object[]{this, qe2Var});
        } else if (qe2Var != null && !o2w.k().H() && this.b != null) {
            h(qe2Var);
            if (this.b.d() == 2) {
                e1e e1eVar = this.e;
                if (e1eVar != null) {
                    e1eVar.c(qe2Var);
                }
            } else if (this.b.d() == 1) {
                szt.d().c(qe2Var);
            } else {
                pzt.d().c(qe2Var);
            }
        }
    }

    public void h(qe2 qe2Var) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd180d", new Object[]{this, qe2Var});
        } else if (qe2Var.f && qqo.b().c() && q2v.d().f(19997, "_ut_nw")) {
            HashMap hashMap = new HashMap();
            hashMap.put(gat.CT, String.valueOf(qe2Var.b));
            hashMap.put("rt", String.valueOf(qe2Var.c));
            hashMap.put("rs", String.valueOf(qe2Var.d));
            hashMap.put("success", String.valueOf(qe2Var.a() ? 1 : 0));
            int d = d();
            if (d == 2) {
                int c = uzt.b().c();
                if (c > 0) {
                    i = c;
                }
                hashMap.put("sip", String.valueOf(i));
            }
            ofh.l().d(new Log("UT", "19997", "_ut_nw", String.valueOf(c()), String.valueOf(d), hashMap));
        }
    }
}
