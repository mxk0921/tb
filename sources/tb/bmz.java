package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.LayoutDirection;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.LayoutOrientation;
import com.taobao.weex.common.WXConfig;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class bmz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LayoutOrientation f16486a;
    public final Arrangement.d b;
    public final Arrangement.l c;
    public final d3z d;
    public final List<ldz> e;
    public final qjz[] f;
    public final cmz[] g;

    static {
        t2o.a(598737097);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bmz(LayoutOrientation layoutOrientation, Arrangement.d dVar, Arrangement.l lVar, d3z d3zVar, List<? extends ldz> list, qjz[] qjzVarArr) {
        ckf.g(layoutOrientation, "orientation");
        ckf.g(d3zVar, "crossAxisAlignment");
        ckf.g(list, "measurables");
        ckf.g(qjzVarArr, "placeables");
        this.f16486a = layoutOrientation;
        this.b = dVar;
        this.c = lVar;
        this.d = d3zVar;
        this.e = list;
        this.f = qjzVarArr;
        int size = list.size();
        cmz[] cmzVarArr = new cmz[size];
        for (int i = 0; i < size; i++) {
            cmzVarArr[i] = amz.c(this.e.get(i));
        }
        this.g = cmzVarArr;
    }

    public final int a(qjz qjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f33851b7", new Object[]{this, qjzVar})).intValue();
        }
        ckf.g(qjzVar, "<this>");
        if (this.f16486a == LayoutOrientation.Horizontal) {
            return qjzVar.h();
        }
        return qjzVar.k();
    }

    public final int b(qjz qjzVar, cmz cmzVar, int i, LayoutDirection layoutDirection, int i2) {
        d3z d3zVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d32e72ba", new Object[]{this, qjzVar, cmzVar, new Integer(i), layoutDirection, new Integer(i2)})).intValue();
        }
        if (cmzVar == null) {
            d3zVar = null;
        } else {
            d3zVar = cmzVar.a();
        }
        if (d3zVar == null) {
            d3zVar = this.d;
        }
        int a2 = i - a(qjzVar);
        if (this.f16486a == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return d3zVar.a(a2, layoutDirection, qjzVar, i2);
    }

    public final int[] c(int i, int[] iArr, int[] iArr2, pdz pdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("d5444ee", new Object[]{this, new Integer(i), iArr, iArr2, pdzVar});
        }
        if (this.f16486a == LayoutOrientation.Vertical) {
            Arrangement.l lVar = this.c;
            if (lVar != null) {
                lVar.b(pdzVar, i, iArr, iArr2);
            } else {
                throw new IllegalArgumentException("null verticalArrangement in Column");
            }
        } else {
            Arrangement.d dVar = this.b;
            if (dVar != null) {
                dVar.c(pdzVar, i, iArr, pdzVar.getLayoutDirection(), iArr2);
            } else {
                throw new IllegalArgumentException("null horizontalArrangement in Row");
            }
        }
        return iArr2;
    }

    public final int d(qjz qjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99bdee30", new Object[]{this, qjzVar})).intValue();
        }
        ckf.g(qjzVar, "<this>");
        if (this.f16486a == LayoutOrientation.Horizontal) {
            return qjzVar.k();
        }
        return qjzVar.h();
    }

    public final void f(zlz zlzVar, int i, LayoutDirection layoutDirection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a25c3e9", new Object[]{this, zlzVar, new Integer(i), layoutDirection});
            return;
        }
        ckf.g(zlzVar, "measureResult");
        ckf.g(layoutDirection, WXConfig.layoutDirection);
        int f = zlzVar.f();
        int c = zlzVar.c();
        if (f < c) {
            while (true) {
                int i2 = f + 1;
                qjz qjzVar = this.f[f];
                ckf.d(qjzVar);
                int[] d = zlzVar.d();
                ofz a2 = this.e.get(f).a();
                int b = b(qjzVar, a2 instanceof cmz ? (cmz) a2 : null, zlzVar.b(), layoutDirection, zlzVar.a()) + i;
                if (this.f16486a == LayoutOrientation.Horizontal) {
                    qjzVar.m(d[f - zlzVar.f()], b);
                } else {
                    qjzVar.m(b, d[f - zlzVar.f()]);
                }
                if (i2 < c) {
                    f = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:79|140|80|(7:(9:84|142|87|88|146|89|90|(1:95)(1:94)|96)|146|89|90|(1:92)|95|96)|86|142|87|88) */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x036a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x036b, code lost:
        r43 = r9;
        r36 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.zlz e(tb.pdz r45, long r46, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bmz.e(tb.pdz, long, int, int):tb.zlz");
    }
}
