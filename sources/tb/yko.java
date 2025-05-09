package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.ChiTuRewriteUtils;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yko {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<j8m> f32154a;
    public fj4 b;
    public final i3p c;
    public c4p d;
    public final orj e;
    public final it4 f;
    public final fbk g;
    public final vg3 h;
    public final kxi i;
    public final rg3<BaseCellBean> j;
    public final jxi<x02, BaseTypedBean> k;
    public final zmo l;
    public ChiTuRewriteUtils m;
    public vr3 n;
    public tr3 o;
    public final tb4 p;
    public final hj8 q;

    static {
        t2o.a(993001566);
    }

    public yko() {
        this.f32154a = new HashSet();
        this.e = new orj();
        this.f = new it4();
        fbk fbkVar = new fbk();
        this.g = fbkVar;
        this.l = new zmo();
        this.p = new tb4();
        this.q = agg.a();
        this.c = new i3p(this);
        fbkVar.d(this);
    }

    public rg3<BaseCellBean> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rg3) ipChange.ipc$dispatch("744941fb", new Object[]{this});
        }
        return this.j;
    }

    public vg3 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vg3) ipChange.ipc$dispatch("bd9a8a90", new Object[]{this});
        }
        return this.h;
    }

    public ChiTuRewriteUtils c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChiTuRewriteUtils) ipChange.ipc$dispatch("bf3ec002", new Object[]{this});
        }
        if (this.m == null) {
            this.m = new ChiTuRewriteUtils(this);
        }
        return this.m;
    }

    public tr3 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tr3) ipChange.ipc$dispatch("c8040ab6", new Object[]{this});
        }
        if (this.o == null) {
            this.o = new tr3();
        }
        return this.o;
    }

    public vr3 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vr3) ipChange.ipc$dispatch("6c35bce4", new Object[]{this});
        }
        if (this.n == null) {
            this.n = new vr3(this);
        }
        return this.n;
    }

    public i3p f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i3p) ipChange.ipc$dispatch("a272dbf2", new Object[]{this});
        }
        return this.c;
    }

    public fj4 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fj4) ipChange.ipc$dispatch("69d761dd", new Object[]{this});
        }
        return this.b;
    }

    public it4 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (it4) ipChange.ipc$dispatch("613a3146", new Object[]{this});
        }
        return this.f;
    }

    public hj8 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hj8) ipChange.ipc$dispatch("b488783", new Object[]{this});
        }
        return this.q;
    }

    public tb4 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tb4) ipChange.ipc$dispatch("3a60f2e8", new Object[]{this});
        }
        return this.p;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public c4p l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4p) ipChange.ipc$dispatch("a0dbce5f", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new c4p();
        }
        return this.d;
    }

    public jxi<x02, BaseTypedBean> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jxi) ipChange.ipc$dispatch("4e98921d", new Object[]{this});
        }
        return this.k;
    }

    public kxi n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kxi) ipChange.ipc$dispatch("33b2fdea", new Object[]{this});
        }
        return this.i;
    }

    public orj o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (orj) ipChange.ipc$dispatch("af9735b7", new Object[]{this});
        }
        return this.e;
    }

    public void p(h9m h9mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b23bec7", new Object[]{this, h9mVar});
            return;
        }
        Iterator it = ((HashSet) this.f32154a).iterator();
        while (it.hasNext()) {
            h9mVar.a((j8m) it.next());
        }
    }

    public void q(fj4 fj4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2307ecff", new Object[]{this, fj4Var});
        } else {
            this.b = fj4Var;
        }
    }

    public zmo r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zmo) ipChange.ipc$dispatch("1cf6a0f7", new Object[]{this});
        }
        return this.l;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e704cb", new Object[]{this});
        }
    }

    public fbk t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fbk) ipChange.ipc$dispatch("a7fd9e95", new Object[]{this});
        }
        return this.g;
    }

    public yko(fj4 fj4Var) {
        this.f32154a = new HashSet();
        this.e = new orj();
        this.f = new it4();
        fbk fbkVar = new fbk();
        this.g = fbkVar;
        this.l = new zmo();
        this.p = new tb4();
        this.q = agg.a();
        this.b = fj4Var;
        fbkVar.d(this);
        this.j = new rg3<>(this);
        this.h = new vg3(this);
        this.k = new jxi<>(this);
        this.i = new kxi(this);
        this.c = new i3p(this);
    }
}
