package com.taobao.android.nanocompose.foundation.layout.box;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import tb.a0z;
import tb.can;
import tb.ckf;
import tb.ldz;
import tb.mdz;
import tb.odz;
import tb.pdz;
import tb.qjz;
import tb.t2o;
import tb.u2z;
import tb.v2z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BoxMeasurePolicy implements mdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final can f9019a;

    static {
        t2o.a(598737107);
        t2o.a(598737024);
    }

    public BoxMeasurePolicy(can canVar, boolean z) {
        ckf.g(canVar, "alignment");
        this.f9019a = canVar;
    }

    public static final /* synthetic */ can b(BoxMeasurePolicy boxMeasurePolicy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (can) ipChange.ipc$dispatch("2fdb6aa3", new Object[]{boxMeasurePolicy});
        }
        return boxMeasurePolicy.f9019a;
    }

    @Override // tb.mdz
    public odz a(pdz pdzVar, List<? extends ldz> list, long j) {
        boolean z;
        int n;
        int m;
        qjz d;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("3fc33aa2", new Object[]{this, pdzVar, list, new Long(j)});
        }
        ckf.g(pdzVar, "$receiver");
        ckf.g(list, "measurables");
        if (list.isEmpty()) {
            return pdzVar.e(u2z.n(j), u2z.m(j), BoxMeasurePolicy$measure$1.INSTANCE);
        }
        long e = u2z.e(j, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            ldz ldzVar = (ldz) list.get(0);
            if (!a0z.a(ldzVar)) {
                d = ldzVar.d(e);
                n = Math.max(u2z.n(j), d.k());
                m = Math.max(u2z.m(j), d.h());
            } else {
                n = u2z.n(j);
                m = u2z.m(j);
                d = ldzVar.d(u2z.Companion.e(u2z.n(j), u2z.m(j)));
            }
            return pdzVar.e(n, m, new BoxMeasurePolicy$measure$2(d, ldzVar, pdzVar, n, m, this));
        }
        qjz[] qjzVarArr = new qjz[list.size()];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = u2z.n(j);
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = u2z.m(j);
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            z = false;
            while (true) {
                int i3 = i2 + 1;
                ldz ldzVar2 = (ldz) list.get(i2);
                if (!a0z.a(ldzVar2)) {
                    qjz d2 = ldzVar2.d(e);
                    qjzVarArr[i2] = d2;
                    ref$IntRef.element = Math.max(ref$IntRef.element, d2.k());
                    ref$IntRef2.element = Math.max(ref$IntRef2.element, d2.h());
                } else {
                    z = true;
                }
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        } else {
            z = false;
        }
        if (z) {
            int i4 = ref$IntRef.element;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = ref$IntRef2.element;
            long a2 = v2z.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i7 = i + 1;
                    ldz ldzVar3 = (ldz) list.get(i);
                    if (a0z.a(ldzVar3)) {
                        qjzVarArr[i] = ldzVar3.d(a2);
                    }
                    if (i7 > size2) {
                        break;
                    }
                    i = i7;
                }
            }
        }
        return pdzVar.e(ref$IntRef.element, ref$IntRef2.element, new BoxMeasurePolicy$measure$5(qjzVarArr, list, pdzVar, ref$IntRef, ref$IntRef2, this));
    }
}
