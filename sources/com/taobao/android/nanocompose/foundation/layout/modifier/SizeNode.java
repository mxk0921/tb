package com.taobao.android.nanocompose.foundation.layout.modifier;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.hfn;
import tb.ldz;
import tb.n5z;
import tb.odz;
import tb.pdz;
import tb.qjz;
import tb.t2o;
import tb.u2z;
import tb.uaz;
import tb.v2z;
import tb.v4z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class SizeNode extends uaz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float e;
    public float f;
    public float g;
    public float h;
    public boolean i;

    static {
        t2o.a(598737140);
    }

    public /* synthetic */ SizeNode(float f, float f2, float f3, float f4, boolean z, a07 a07Var) {
        this(f, f2, f3, f4, z);
    }

    public static /* synthetic */ Object ipc$super(SizeNode sizeNode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/modifier/SizeNode");
    }

    @Override // tb.uaz
    public odz n(pdz pdzVar, ldz ldzVar, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("fafc1888", new Object[]{this, pdzVar, ldzVar, new Long(j)});
        }
        ckf.g(pdzVar, "$receiver");
        ckf.g(ldzVar, "measurable");
        long t = t(pdzVar);
        if (o()) {
            j2 = v2z.d(j, t);
        } else {
            float s = s();
            n5z.a aVar = n5z.Companion;
            if (!n5z.l(s, aVar.a())) {
                i = u2z.n(t);
            } else {
                i = hfn.f(u2z.n(j), u2z.l(t));
            }
            if (!n5z.l(q(), aVar.a())) {
                i2 = u2z.l(t);
            } else {
                i2 = hfn.c(u2z.l(j), u2z.n(t));
            }
            if (!n5z.l(r(), aVar.a())) {
                i3 = u2z.m(t);
            } else {
                i3 = hfn.f(u2z.m(j), u2z.k(t));
            }
            if (!n5z.l(p(), aVar.a())) {
                i4 = u2z.k(t);
            } else {
                i4 = hfn.c(u2z.k(j), u2z.m(t));
            }
            j2 = v2z.a(i, i2, i3, i4);
        }
        qjz d = ldzVar.d(j2);
        return pdzVar.e(d.k(), d.h(), new SizeNode$measure$1(d));
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7f5677d", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final float p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8bc4f660", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public final float q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fecac523", new Object[]{this})).floatValue();
        }
        return this.g;
    }

    public final float r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c02bd7ce", new Object[]{this})).floatValue();
        }
        return this.f;
    }

    public final float s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be6afdf5", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public final long t(v4z v4zVar) {
        int i;
        int i2;
        int i3;
        int c;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb9fdd08", new Object[]{this, v4zVar})).longValue();
        }
        float q = q();
        n5z.a aVar = n5z.Companion;
        if (!n5z.l(q, aVar.a())) {
            i = hfn.c(v4zVar.f(q()), 0);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (!n5z.l(p(), aVar.a())) {
            i2 = hfn.c(v4zVar.f(p()), 0);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (n5z.l(s(), aVar.a()) || (i3 = hfn.c(hfn.f(v4zVar.f(s()), i), 0)) == Integer.MAX_VALUE) {
            i3 = 0;
        }
        if (!n5z.l(r(), aVar.a()) && (c = hfn.c(hfn.f(v4zVar.f(r()), i2), 0)) != Integer.MAX_VALUE) {
            i4 = c;
        }
        return v2z.a(i3, i, i4, i2);
    }

    public final void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810b6987", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final void v(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60110a50", new Object[]{this, new Float(f)});
        } else {
            this.h = f;
        }
    }

    public final void w(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb942a55", new Object[]{this, new Float(f)});
        } else {
            this.g = f;
        }
    }

    public final void x(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88656a2", new Object[]{this, new Float(f)});
        } else {
            this.f = f;
        }
    }

    public final void y(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ffb0bc3", new Object[]{this, new Float(f)});
        } else {
            this.e = f;
        }
    }

    public SizeNode(float f, float f2, float f3, float f4, boolean z) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = z;
    }
}
