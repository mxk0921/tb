package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class efl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Double b;
    public final Double c;
    public final Double d;

    /* renamed from: a  reason: collision with root package name */
    public final p7n f18532a = new p7n(vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, 1.0d);
    public final u2w e = new u2w(vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, 1.0d);
    public final yi8 f = new yi8();
    public final p7n g = new p7n();
    public final p7n h = new p7n(-Math.sqrt(0.5d), vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, Math.sqrt(0.5d));

    static {
        t2o.a(87031887);
    }

    public efl(Double d, Double d2, Double d3) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    public p7n a(double d, double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p7n) ipChange.ipc$dispatch("b9726183", new Object[]{this, new Double(d), new Double(d2), new Double(d3), new Double(d4)});
        }
        Double d8 = this.b;
        if (d8 != null) {
            d5 = d8.doubleValue();
        } else {
            d5 = d4 + vu3.b.GEO_NOT_SUPPORT;
        }
        double radians = Math.toRadians(d5);
        Double d9 = this.c;
        if (d9 != null) {
            d6 = d9.doubleValue();
        } else {
            d6 = d2 + vu3.b.GEO_NOT_SUPPORT;
        }
        double radians2 = Math.toRadians(d6);
        Double d10 = this.d;
        if (d10 != null) {
            d7 = d10.doubleValue();
        } else {
            d7 = d3 + vu3.b.GEO_NOT_SUPPORT;
        }
        b(this.f18532a, radians, radians2, Math.toRadians(d7), vu3.b.GEO_NOT_SUPPORT);
        return this.f18532a;
    }

    public final void b(p7n p7nVar, double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ed1ce0", new Object[]{this, p7nVar, new Double(d), new Double(d2), new Double(d3), new Double(d4)});
            return;
        }
        this.f.a(d2, d, -d3, "YXZ");
        p7nVar.d(this.f);
        p7nVar.a(this.h);
        p7nVar.a(this.g.c(this.e, -d4));
    }
}
