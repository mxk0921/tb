package com.taobao.android.nanocompose.runtime.node;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.ckf;
import tb.d1a;
import tb.t2o;
import tb.u2z;
import tb.waz;
import tb.xhv;
import tb.zaz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MeasureAndLayoutDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public waz f9027a;
    public final Set<waz> b = new LinkedHashSet();
    public u2z c;

    static {
        t2o.a(598737393);
    }

    public static /* synthetic */ boolean j(MeasureAndLayoutDelegate measureAndLayoutDelegate, waz wazVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82c820f4", new Object[]{measureAndLayoutDelegate, wazVar, new Boolean(z), new Integer(i), obj})).booleanValue();
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return measureAndLayoutDelegate.i(wazVar, z);
    }

    public static /* synthetic */ boolean m(MeasureAndLayoutDelegate measureAndLayoutDelegate, waz wazVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38560395", new Object[]{measureAndLayoutDelegate, wazVar, new Boolean(z), new Integer(i), obj})).booleanValue();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.l(wazVar, z);
    }

    public final boolean a(waz wazVar, u2z u2zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3a37767", new Object[]{this, wazVar, u2zVar})).booleanValue();
        }
        boolean D = wazVar.D(u2zVar);
        waz r = wazVar.r();
        if (D && r != null) {
            m(this, wazVar, false, 2, null);
        }
        return D;
    }

    public final Set<waz> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d3f1d259", new Object[]{this});
        }
        return this.b;
    }

    public final waz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (waz) ipChange.ipc$dispatch("69e85a63", new Object[]{this});
        }
        return this.f9027a;
    }

    public final u2z d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u2z) ipChange.ipc$dispatch("f88fe3a8", new Object[]{this});
        }
        return this.c;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5fbb499", new Object[]{this})).booleanValue();
        }
        return true ^ this.b.isEmpty();
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45a2c32e", new Object[]{this})).booleanValue();
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        h(new MeasureAndLayoutDelegate$measureAndLayout$1(this, ref$BooleanRef));
        return ref$BooleanRef.element;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100db9b1", new Object[]{this});
        } else if (!this.b.isEmpty()) {
            for (waz wazVar : this.b) {
                k(wazVar);
            }
        }
    }

    public final void h(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931f5192", new Object[]{this, d1aVar});
        } else {
            d1aVar.invoke();
        }
    }

    public final boolean i(waz wazVar, boolean z) {
        boolean z2;
        u2z u2zVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98bd7a5", new Object[]{this, wazVar, new Boolean(z)})).booleanValue();
        }
        if (wazVar.y()) {
            if (ckf.b(wazVar, this.f9027a)) {
                u2zVar = d();
            } else {
                u2zVar = null;
            }
            z2 = a(wazVar, u2zVar);
        } else {
            z2 = false;
        }
        if (z && wazVar.x()) {
            if (wazVar == this.f9027a) {
                wazVar.C(0, 0);
            } else {
                wazVar.F();
            }
        }
        return z2;
    }

    public final void k(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc2f60f", new Object[]{this, wazVar});
        } else if (ckf.b(wazVar, this.f9027a)) {
            a(wazVar, d());
        }
    }

    public final void n(u2z u2zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80c9f04", new Object[]{this, u2zVar});
        } else {
            this.c = u2zVar;
        }
    }

    public final void o(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81203343", new Object[]{this, wazVar});
        } else if (wazVar != null) {
            this.f9027a = wazVar;
        } else {
            throw new IllegalArgumentException("root is nullptr");
        }
    }

    public final void p(long j) {
        waz wazVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7cd609", new Object[]{this, new Long(j)});
            return;
        }
        u2z d = d();
        if (d != null) {
            z = u2z.g(d.q(), j);
        }
        if (!z && (wazVar = this.f9027a) != null) {
            n(u2z.b(j));
            wazVar.A();
            b().add(wazVar);
        }
    }

    public final boolean l(waz wazVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dacd0e4", new Object[]{this, wazVar, new Boolean(z)})).booleanValue();
        }
        ckf.g(wazVar, "layoutNode");
        byte k = wazVar.k();
        zaz.a aVar = zaz.Companion;
        if (zaz.e(k, aVar.c()) || zaz.e(k, aVar.b()) || !zaz.e(k, aVar.a())) {
            return false;
        }
        if (wazVar.y() && !z) {
            return false;
        }
        wazVar.A();
        waz r = wazVar.r();
        if (r == null || !r.y()) {
            this.b.add(wazVar);
        }
        this.b.add(wazVar);
        return true;
    }
}
