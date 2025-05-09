package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.d2g;
import tb.fic;
import tb.g3g;
import tb.gic;
import tb.h2g;
import tb.i3g;
import tb.k2g;
import tb.p2g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m2g<BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> implements iic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public CT f23733a;
    public String b;
    public boolean c;
    public final List<String> d = new ArrayList();
    public ECT e;
    public BCT f;
    public TCT g;
    public DCT h;
    public PCT i;

    static {
        t2o.a(1002438704);
        t2o.a(1002438703);
    }

    public m2g(CT ct) {
        this.f23733a = ct;
    }

    public final String a() {
        String str;
        m2g m2gVar;
        h2g m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45a107e9", new Object[]{this});
        }
        u2g a2 = u2g.Companion.a();
        CT g = g();
        if (g == null || (m = g.m()) == null) {
            str = null;
        } else {
            str = m.k();
        }
        t2g c = a2.c(str);
        if (c == null || (m2gVar = (m2g) c.b()) == null) {
            return null;
        }
        return m2gVar.b;
    }

    public final BCT b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BCT) ((d2g) ipChange.ipc$dispatch("bd3b0fcf", new Object[]{this}));
        }
        return this.f;
    }

    public final List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5e232239", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.jic
    public void f() {
        h2g m;
        String k;
        t2g c;
        m2g m2gVar;
        i2g l;
        g2g a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        this.c = false;
        u2g a3 = u2g.Companion.a();
        CT g = g();
        if (!(g == null || (l = g.l()) == null || (a2 = l.a()) == null || !a2.a())) {
            Iterator it = ((ArrayList) this.d).iterator();
            while (it.hasNext()) {
                t2g c2 = a3.c((String) it.next());
                if (c2 != null) {
                    c2.c(false);
                    a3.f(c2);
                    m2g m2gVar2 = (m2g) c2.b();
                    if (m2gVar2 != null) {
                        m2gVar2.f();
                    }
                }
            }
        }
        CT g2 = g();
        if (!(g2 == null || (m = g2.m()) == null || (k = m.k()) == null || (c = a3.c(k)) == null || (m2gVar = (m2g) c.b()) == null)) {
            m2gVar.n(this.b);
        }
        CT g3 = g();
        if (g3 != null) {
            g3.f();
        }
        s(null);
        ((ArrayList) this.d).clear();
        ECT ect = this.e;
        if (ect != null) {
            ect.f();
        }
        BCT bct = this.f;
        if (bct != null) {
            bct.f();
        }
        TCT tct = this.g;
        if (tct != null) {
            tct.f();
        }
        DCT dct = this.h;
        if (dct != null) {
            dct.f();
        }
        PCT pct = this.i;
        if (pct != null) {
            pct.f();
        }
    }

    public CT g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CT) ((h2g) ipChange.ipc$dispatch("5ab35416", new Object[]{this}));
        }
        return this.f23733a;
    }

    public final DCT h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DCT) ((k2g) ipChange.ipc$dispatch("63b27d27", new Object[]{this}));
        }
        return this.h;
    }

    public final ECT j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ECT) ((p2g) ipChange.ipc$dispatch("85bd10c7", new Object[]{this}));
        }
        return this.e;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
        }
        return this.b;
    }

    public final TCT l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCT) ((i3g) ipChange.ipc$dispatch("7ecf6b72", new Object[]{this}));
        }
        return this.g;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2d0d5b", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2663f14c", new Object[]{this, str});
        } else {
            kqu.a(this.d).remove(str);
        }
    }

    public final void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebc6e25", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void q(BCT bct) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793e95e5", new Object[]{this, bct});
        } else {
            this.f = bct;
        }
    }

    public void s(CT ct) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcab972", new Object[]{this, ct});
        } else {
            this.f23733a = ct;
        }
    }

    public final void t(DCT dct) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32c7c8d", new Object[]{this, dct});
        } else {
            this.h = dct;
        }
    }

    public final void u(ECT ect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b9ff7d", new Object[]{this, ect});
        } else {
            this.e = ect;
        }
    }

    public final void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb8cafc", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void w(PCT pct) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb97b68", new Object[]{this, pct});
        } else {
            this.i = pct;
        }
    }

    public final void x(TCT tct) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd83be2", new Object[]{this, tct});
        } else {
            this.g = tct;
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
        }
    }
}
