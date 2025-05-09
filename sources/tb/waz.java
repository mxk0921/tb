package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.phz;
import tb.yaz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class waz implements vgz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final OriginNode f30575a;
    public mdz f;
    public waz g;
    public jkz h;
    public NCComponentViewHandler i;
    public ctz j;
    public RenderContext k;
    public final abz l;
    public Object m;
    public boolean n;
    public final List<waz> b = new ArrayList();
    public List<lfz> c = new ArrayList();
    public final yaz d = new yaz(this);
    public final uiz e = new uiz(this);
    public final List<ldz> o = new ArrayList();

    static {
        t2o.a(598737382);
        t2o.a(598737290);
    }

    public waz(OriginNode originNode, RenderContext renderContext) {
        ckf.g(originNode, "originNode");
        ckf.g(renderContext, "renderContext");
        this.f30575a = originNode;
        this.h = i2z.Companion.a(originNode.s());
        this.k = renderContext;
        this.l = renderContext.j();
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1168900d", new Object[]{this});
        } else {
            this.d.m();
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e789961", new Object[]{this});
            return;
        }
        G();
        this.e.h();
    }

    public final void C(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb696ee", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.d.i().r(i, i2);
        }
    }

    public final boolean D(u2z u2zVar) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5e3f3f4", new Object[]{this, u2zVar})).booleanValue();
        }
        if (u2zVar == null) {
            j = this.d.d();
        } else {
            j = u2zVar.q();
        }
        return this.d.h().x(j);
    }

    public final void E(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee14770", new Object[]{this, wazVar});
        } else if (wazVar != null && c().remove(wazVar)) {
            w();
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1991bd3b", new Object[]{this});
        } else {
            this.d.i().y();
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc9a168", new Object[]{this});
        } else {
            this.h = i2z.Companion.a(this.f30575a.s());
        }
    }

    public final void H(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f97a43", new Object[]{this, obj});
        } else {
            this.m = obj;
        }
    }

    public final void I(mdz mdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef5a4e1", new Object[]{this, mdzVar});
            return;
        }
        ckf.g(mdzVar, "<set-?>");
        this.f = mdzVar;
    }

    public final void J(List<lfz> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21859e51", new Object[]{this, list});
            return;
        }
        ckf.g(list, "modifier");
        M(this.c, list);
        this.c = list;
    }

    public final void K(ctz ctzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebd2e1a", new Object[]{this, ctzVar});
            return;
        }
        ckf.g(ctzVar, "<set-?>");
        this.j = ctzVar;
    }

    public final void L(NCComponentViewHandler nCComponentViewHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de37167", new Object[]{this, nCComponentViewHandler});
        } else {
            this.i = nCComponentViewHandler;
        }
    }

    public final void M(List<lfz> list, List<lfz> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6625df73", new Object[]{this, list, list2});
            return;
        }
        System.out.println((Object) ckf.p("layoutNode this : ", this));
        this.e.n(list, list2);
        this.d.q();
    }

    public final void N() {
        hoz hozVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95db6ee", new Object[]{this});
        } else if (!z()) {
            OriginNode originNode = this.f30575a;
            NCComponentViewHandler nCComponentViewHandler = this.i;
            if (nCComponentViewHandler == null) {
                hozVar = null;
            } else {
                hozVar = nCComponentViewHandler.createSizable();
            }
            I(originNode.f(new ndz(hozVar, this.h)));
            if (n() != null) {
                this.l.onRequestMeasure(this);
                return;
            }
            throw new IllegalArgumentException("MeasurePolicy cannot be null");
        }
    }

    public final void O(int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79450949", new Object[]{this, new Integer(i), new Double(d)});
        } else {
            this.h.j(i, d);
        }
    }

    public final void P(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794510cb", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            this.h.k(i, f);
        }
    }

    public final void Q(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79451c0e", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.h.h(i, i2);
        }
    }

    public final void R(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79451fcf", new Object[]{this, new Integer(i), new Long(j)});
        } else {
            this.h.i(i, j);
        }
    }

    public final void S(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0b1e31", new Object[]{this, new Integer(i), obj});
            return;
        }
        ckf.g(obj, "value");
        this.h.m(i, obj);
    }

    public final void T(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8c581f", new Object[]{this, new Integer(i), str});
            return;
        }
        ckf.g(str, "value");
        this.h.g(i, str);
    }

    public final void U(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79455bdf", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.h.l(i, z);
        }
    }

    public final void V(RenderContext renderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e3e64d", new Object[]{this, renderContext});
            return;
        }
        ckf.g(renderContext, "renderContext");
        this.k = renderContext;
    }

    public final void W(NCComponentViewHandler nCComponentViewHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c618db3", new Object[]{this, nCComponentViewHandler});
            return;
        }
        ckf.g(nCComponentViewHandler, "ncComponentViewHandler");
        this.i = nCComponentViewHandler;
    }

    public final void a(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795d32f3", new Object[]{this, wazVar});
        } else if (wazVar != null && wazVar != this) {
            ((ArrayList) this.b).add(wazVar);
            wazVar.g = this;
            w();
        }
    }

    public final List<ldz> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f9703d4", new Object[]{this});
        }
        if (!this.n) {
            return this.o;
        }
        ((ArrayList) this.o).clear();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            waz wazVar = (waz) it.next();
            if (wazVar.z()) {
                ((ArrayList) this.o).addAll(wazVar.b());
            } else {
                ((ArrayList) this.o).add(wazVar.d.i());
            }
        }
        this.n = false;
        return this.o;
    }

    public final List<waz> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9e990726", new Object[]{this});
        }
        return this.b;
    }

    public final i2z d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i2z) ipChange.ipc$dispatch("8643daa5", new Object[]{this});
        }
        return this.f30575a.i();
    }

    public final String e() {
        String f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47cc1ee2", new Object[]{this});
        }
        i2z i = this.f30575a.i();
        return (i == null || (f = i.f()) == null) ? "null" : f;
    }

    public final v4z f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v4z) ipChange.ipc$dispatch("f2a78517", new Object[]{this});
        }
        return t().f();
    }

    public final Object g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3b2b1877", new Object[]{this});
        }
        return this.m;
    }

    public final viz h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (viz) ipChange.ipc$dispatch("268fb5cc", new Object[]{this});
        }
        return this.e.b();
    }

    public final taz i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (taz) ipChange.ipc$dispatch("3022790f", new Object[]{this});
        }
        return h().x();
    }

    public final taz j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (taz) ipChange.ipc$dispatch("908de154", new Object[]{this});
        }
        return h().x();
    }

    public final byte k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3145c20", new Object[]{this})).byteValue();
        }
        return this.d.g();
    }

    public final abz l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abz) ipChange.ipc$dispatch("e3e9094", new Object[]{this});
        }
        return this.l;
    }

    public final yaz.a m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yaz.a) ipChange.ipc$dispatch("79438c63", new Object[]{this});
        }
        return this.d.i();
    }

    public final mdz n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdz) ipChange.ipc$dispatch("788fe261", new Object[]{this});
        }
        mdz mdzVar = this.f;
        if (mdzVar != null) {
            return mdzVar;
        }
        ckf.y("measurePolicy");
        throw null;
    }

    public final uiz o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uiz) ipChange.ipc$dispatch("e8a38be6", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.vgz
    public void onEvent(phz phzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2076faa8", new Object[]{this, phzVar});
            return;
        }
        ckf.g(phzVar, "event");
        if (phzVar.b() != null && phz.b.b(phzVar.e(), phz.b.a((byte) 0))) {
            o().f(phzVar);
        }
    }

    public final OriginNode p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OriginNode) ipChange.ipc$dispatch("1d247a52", new Object[]{this});
        }
        return this.f30575a;
    }

    public final viz q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (viz) ipChange.ipc$dispatch("226a3287", new Object[]{this});
        }
        return this.e.c();
    }

    public final waz r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (waz) ipChange.ipc$dispatch("eb2631b", new Object[]{this});
        }
        return this.g;
    }

    public final jkz s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkz) ipChange.ipc$dispatch("5f92a5e9", new Object[]{this});
        }
        return this.h;
    }

    public final RenderContext t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderContext) ipChange.ipc$dispatch("cc4f291d", new Object[]{this});
        }
        return this.k;
    }

    public final ctz u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ctz) ipChange.ipc$dispatch("8cdea5d0", new Object[]{this});
        }
        ctz ctzVar = this.j;
        if (ctzVar != null) {
            return ctzVar;
        }
        ckf.y("variableRegion");
        throw null;
    }

    public final NCComponentViewHandler v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NCComponentViewHandler) ipChange.ipc$dispatch("6d0bed61", new Object[]{this});
        }
        return this.i;
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9eefee8", new Object[]{this});
        } else {
            this.n = true;
        }
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f11450e", new Object[]{this})).booleanValue();
        }
        return this.d.f();
    }

    public final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d25992e", new Object[]{this})).booleanValue();
        }
        return this.d.j();
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6c28c", new Object[]{this})).booleanValue();
        }
        return this.f30575a.v();
    }
}
