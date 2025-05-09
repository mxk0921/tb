package com.taobao.android.nanocompose.foundation.layout;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.a07;
import tb.ckf;
import tb.haz;
import tb.hoz;
import tb.iaz;
import tb.ioz;
import tb.jkz;
import tb.ldz;
import tb.mdz;
import tb.ndz;
import tb.odz;
import tb.pdz;
import tb.t2o;
import tb.u2z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DefaultMeasurePolicy implements mdz, ioz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hoz f9011a;
    public final jkz b;

    static {
        t2o.a(598737016);
        t2o.a(598737024);
        t2o.a(598737102);
    }

    public DefaultMeasurePolicy(ndz ndzVar, hoz hozVar, jkz jkzVar) {
        ckf.g(ndzVar, "measurePolicyCreateParams");
        ckf.g(jkzVar, "props");
        this.f9011a = hozVar;
        this.b = jkzVar;
    }

    @Override // tb.mdz
    public odz a(pdz pdzVar, List<? extends ldz> list, long j) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("3fc33aa2", new Object[]{this, pdzVar, list, new Long(j)});
        }
        ckf.g(pdzVar, "$receiver");
        ckf.g(list, "measurables");
        hoz hozVar = this.f9011a;
        haz a2 = hozVar == null ? null : haz.a(hozVar.a(this, j));
        if (a2 == null) {
            j2 = iaz.a(u2z.n(j), u2z.m(j));
        } else {
            j2 = a2.i();
        }
        return pdzVar.e(haz.f(j2), haz.e(j2), DefaultMeasurePolicy$measure$1.INSTANCE);
    }

    public /* synthetic */ DefaultMeasurePolicy(ndz ndzVar, hoz hozVar, jkz jkzVar, int i, a07 a07Var) {
        this(ndzVar, (i & 2) != 0 ? ndzVar.a() : hozVar, (i & 4) != 0 ? ndzVar.b() : jkzVar);
    }
}
