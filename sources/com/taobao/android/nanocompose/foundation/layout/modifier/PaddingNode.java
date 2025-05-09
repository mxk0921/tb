package com.taobao.android.nanocompose.foundation.layout.modifier;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.ldz;
import tb.odz;
import tb.pdz;
import tb.qjz;
import tb.t2o;
import tb.uaz;
import tb.v2z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PaddingNode extends uaz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float e;
    public float f;
    public float g;
    public float h;
    public boolean i;

    static {
        t2o.a(598737135);
    }

    public /* synthetic */ PaddingNode(float f, float f2, float f3, float f4, boolean z, a07 a07Var) {
        this(f, f2, f3, f4, z);
    }

    public static /* synthetic */ Object ipc$super(PaddingNode paddingNode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/modifier/PaddingNode");
    }

    @Override // tb.uaz
    public odz n(pdz pdzVar, ldz ldzVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("fafc1888", new Object[]{this, pdzVar, ldzVar, new Long(j)});
        }
        ckf.g(pdzVar, "$receiver");
        ckf.g(ldzVar, "measurable");
        int f = pdzVar.f(r()) + pdzVar.f(p());
        int f2 = pdzVar.f(s()) + pdzVar.f(o());
        qjz d = ldzVar.d(v2z.g(j, -f, -f2));
        return pdzVar.e(v2z.f(j, d.k() + f), v2z.e(j, d.h() + f2), new PaddingNode$measure$1(this, d, pdzVar));
    }

    public final float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("107cd88c", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public final float p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e995af10", new Object[]{this})).floatValue();
        }
        return this.g;
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1720af15", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final float r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3098d97", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public final float s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d73008a", new Object[]{this})).floatValue();
        }
        return this.f;
    }

    public final void t(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e56910c", new Object[]{this, new Float(f)});
        } else {
            this.h = f;
        }
    }

    public final void u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1060a0", new Object[]{this, new Float(f)});
        } else {
            this.g = f;
        }
    }

    public final void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcc4c57", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final void w(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66473ff9", new Object[]{this, new Float(f)});
        } else {
            this.e = f;
        }
    }

    public final void x(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55dd3e66", new Object[]{this, new Float(f)});
        } else {
            this.f = f;
        }
    }

    public PaddingNode(float f, float f2, float f3, float f4, boolean z) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = z;
    }
}
