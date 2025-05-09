package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class p7z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final t2z f25927a;

    static {
        t2o.a(598737437);
        t2o.a(598737449);
    }

    public p7z(t2z t2zVar, i6z i6zVar) {
        ckf.g(t2zVar, "constantSectionResult");
        ckf.g(i6zVar, "exprSectionResult");
        this.f25927a = t2zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.onz<tb.q7z, java.lang.String> a(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.p7z.a(byte[], int, int):tb.onz");
    }

    public final hhz b(d0z d0zVar, int i) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("6ee03578", new Object[]{this, d0zVar, new Integer(i)});
        }
        int b = u6z.b(i);
        if (u6z.c(b, u6z.b(0))) {
            d0zVar.D(d0zVar.A() + 1);
            return hhz.Companion.a();
        } else if (u6z.c(b, u6z.b(1))) {
            return hhz.Companion.j(d0zVar.b());
        } else {
            if (u6z.c(b, u6z.b(2))) {
                z = true;
            } else {
                z = u6z.c(b, u6z.b(3));
            }
            if (!z) {
                z2 = u6z.c(b, u6z.b(4));
            }
            if (z2) {
                return hhz.Companion.d(d0zVar.s());
            }
            if (u6z.c(b, u6z.b(5))) {
                return hhz.Companion.e(d0zVar.u());
            }
            if (u6z.c(b, u6z.b(6))) {
                return hhz.Companion.c(d0zVar.i());
            }
            if (u6z.c(b, u6z.b(7))) {
                return hhz.Companion.b(d0zVar.n());
            }
            if (u6z.c(b, u6z.b(8))) {
                int s = d0zVar.s();
                List<String> a2 = this.f25927a.a();
                if (s < a2.size()) {
                    return hhz.Companion.g(a2.get(s));
                }
                throw new IllegalStateException(ckf.p("Binary::FuncSectionLoader readConst value is null fieldType: ", Integer.valueOf(i)));
            }
            throw new IllegalArgumentException(ckf.p("Binary::FuncSectionLoader readConst unsupported fieldType: ", Integer.valueOf(i)));
        }
    }
}
