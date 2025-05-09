package com.taobao.android.nanocompose.foundation.layout.modifier;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.hfn;
import tb.iai;
import tb.ldz;
import tb.odz;
import tb.pdz;
import tb.qjz;
import tb.t2o;
import tb.u2z;
import tb.uaz;
import tb.v2z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class FillNode extends uaz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Direction e;
    public float f;

    static {
        t2o.a(598737125);
    }

    public FillNode(Direction direction, float f) {
        ckf.g(direction, "direction");
        this.e = direction;
        this.f = f;
    }

    public static /* synthetic */ Object ipc$super(FillNode fillNode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/modifier/FillNode");
    }

    @Override // tb.uaz
    public odz n(pdz pdzVar, ldz ldzVar, long j) {
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
        if (!u2z.j(j) || this.e == Direction.Vertical) {
            i2 = u2z.n(j);
            i = u2z.l(j);
        } else {
            i2 = hfn.h(iai.d(u2z.l(j) * this.f), u2z.n(j), u2z.l(j));
            i = i2;
        }
        if (!u2z.i(j) || this.e == Direction.Horizontal) {
            int m = u2z.m(j);
            i3 = u2z.k(j);
            i4 = m;
        } else {
            i4 = hfn.h(iai.d(u2z.k(j) * this.f), u2z.m(j), u2z.k(j));
            i3 = i4;
        }
        qjz d = ldzVar.d(v2z.a(i2, i, i4, i3));
        return pdzVar.e(d.k(), d.h(), new FillNode$measure$1(d));
    }

    public final void o(Direction direction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5455f49", new Object[]{this, direction});
            return;
        }
        ckf.g(direction, "<set-?>");
        this.e = direction;
    }

    public final void p(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2116c615", new Object[]{this, new Float(f)});
        } else {
            this.f = f;
        }
    }
}
