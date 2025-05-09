package com.taobao.android.nanocompose.foundation.layout.root;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
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
public final class RootMeasurePolicy implements mdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737144);
        t2o.a(598737024);
    }

    @Override // tb.mdz
    public odz a(pdz pdzVar, List<? extends ldz> list, long j) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("3fc33aa2", new Object[]{this, pdzVar, list, new Long(j)});
        }
        ckf.g(pdzVar, "$receiver");
        ckf.g(list, "measurables");
        if (list.isEmpty()) {
            return pdzVar.e(u2z.n(j), u2z.m(j), RootMeasurePolicy$measure$1.INSTANCE);
        }
        if (list.size() == 1) {
            qjz d = ((ldz) list.get(0)).d(j);
            return pdzVar.e(v2z.f(j, d.k()), v2z.e(j, d.h()), new RootMeasurePolicy$measure$2(d));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                arrayList.add(((ldz) list.get(i3)).d(j));
                if (i4 > size) {
                    break;
                }
                i3 = i4;
            }
        }
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i5 = 0;
            i = 0;
            while (true) {
                int i6 = i2 + 1;
                qjz qjzVar = (qjz) arrayList.get(i2);
                i5 = Math.max(qjzVar.k(), i5);
                i = Math.max(qjzVar.h(), i);
                if (i6 > size2) {
                    break;
                }
                i2 = i6;
            }
            i2 = i5;
        } else {
            i = 0;
        }
        return pdzVar.e(v2z.f(j, i2), v2z.e(j, i), new RootMeasurePolicy$measure$4(arrayList));
    }
}
