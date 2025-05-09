package com.taobao.android.nanocompose.foundation.layout.RowColumn;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement;
import java.util.List;
import tb.bmz;
import tb.ckf;
import tb.d3z;
import tb.ldz;
import tb.mdz;
import tb.odz;
import tb.pdz;
import tb.qjz;
import tb.t2o;
import tb.zlz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class RowColumnMeasurePolicy implements mdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LayoutOrientation f9018a;
    public final Arrangement.d b;
    public final Arrangement.l c;
    public final d3z d;

    static {
        t2o.a(598737094);
        t2o.a(598737024);
    }

    public RowColumnMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.d dVar, Arrangement.l lVar, d3z d3zVar) {
        ckf.g(layoutOrientation, "orientation");
        ckf.g(d3zVar, "crossAxisAlignment");
        this.f9018a = layoutOrientation;
        this.b = dVar;
        this.c = lVar;
        this.d = d3zVar;
    }

    @Override // tb.mdz
    public odz a(pdz pdzVar, List<? extends ldz> list, long j) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("3fc33aa2", new Object[]{this, pdzVar, list, new Long(j)});
        }
        ckf.g(pdzVar, "$receiver");
        ckf.g(list, "measurables");
        bmz bmzVar = new bmz(this.f9018a, this.b, this.c, this.d, list, new qjz[list.size()]);
        zlz e = bmzVar.e(pdzVar, j, 0, list.size());
        if (this.f9018a == LayoutOrientation.Horizontal) {
            i2 = e.e();
            i = e.b();
        } else {
            i2 = e.b();
            i = e.e();
        }
        return pdzVar.e(i2, i, new RowColumnMeasurePolicy$measure$1(bmzVar, e, pdzVar));
    }
}
