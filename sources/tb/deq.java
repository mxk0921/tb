package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class deq extends l2m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long g;
    public boolean h;
    public double i;
    public double j;
    public double k;
    public double l;
    public boolean m;
    public final b n = new b();
    public double o;
    public double p;
    public double q;
    public double r;
    public double s;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public double f17761a;
        public double b;

        static {
            t2o.a(87031898);
        }

        public b() {
        }
    }

    static {
        t2o.a(87031896);
    }

    public static /* synthetic */ Object ipc$super(deq deqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/core/internal/SpringAnimationDriver");
    }

    @Override // tb.l2m
    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d579e98", new Object[]{this, new Long(j)});
            return;
        }
        if (!this.h) {
            b bVar = this.n;
            double d = this.d;
            bVar.f17761a = d;
            this.o = d;
            this.g = j;
            this.s = vu3.b.GEO_NOT_SUPPORT;
            this.h = true;
        }
        j((j - this.g) / 1000.0d);
        this.g = j;
        b bVar2 = this.n;
        this.d = bVar2.f17761a;
        this.e = bVar2.b;
        if (l()) {
            this.f = true;
        }
    }

    public final void j(double d) {
        double d2;
        double d3;
        double d4 = d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22cc555", new Object[]{this, new Double(d4)});
        } else if (!l()) {
            if (d4 > 0.064d) {
                d4 = 0.064d;
            }
            this.s += d4;
            double d5 = this.j;
            double d6 = this.k;
            double d7 = this.i;
            double d8 = -this.l;
            double sqrt = d5 / (Math.sqrt(d7 * d6) * 2.0d);
            double sqrt2 = Math.sqrt(d7 / d6);
            double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
            double d9 = this.p - this.o;
            double d10 = this.s;
            if (sqrt < 1.0d) {
                double exp = Math.exp((-sqrt) * sqrt2 * d10);
                double d11 = sqrt * sqrt2;
                double d12 = d8 + (d11 * d9);
                double d13 = d10 * sqrt3;
                d2 = this.p - ((((d12 / sqrt3) * Math.sin(d13)) + (Math.cos(d13) * d9)) * exp);
                d3 = ((d11 * exp) * (((Math.sin(d13) * d12) / sqrt3) + (Math.cos(d13) * d9))) - (((Math.cos(d13) * d12) - ((sqrt3 * d9) * Math.sin(d13))) * exp);
            } else {
                double exp2 = Math.exp((-sqrt2) * d10);
                double d14 = this.p - (((((sqrt2 * d9) + d8) * d10) + d9) * exp2);
                d3 = exp2 * ((d8 * ((d10 * sqrt2) - 1.0d)) + (d10 * d9 * sqrt2 * sqrt2));
                d2 = d14;
            }
            b bVar = this.n;
            bVar.f17761a = d2;
            bVar.b = d3;
            if (l() || (this.m && m())) {
                if (this.i > vu3.b.GEO_NOT_SUPPORT) {
                    double d15 = this.p;
                    this.o = d15;
                    this.n.f17761a = d15;
                } else {
                    double d16 = this.n.f17761a;
                    this.p = d16;
                    this.o = d16;
                }
                this.n.b = vu3.b.GEO_NOT_SUPPORT;
            }
        }
    }

    public final double k(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74e2c7f2", new Object[]{this, bVar})).doubleValue();
        }
        return Math.abs(this.p - bVar.f17761a);
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fec607c", new Object[]{this})).booleanValue();
        }
        if (Math.abs(this.n.b) > this.q) {
            return false;
        }
        if (k(this.n) <= this.r || this.i == vu3.b.GEO_NOT_SUPPORT) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e34b228c", new Object[]{this})).booleanValue();
        }
        if (this.i <= vu3.b.GEO_NOT_SUPPORT) {
            return false;
        }
        double d = this.o;
        double d2 = this.p;
        if ((d >= d2 || this.n.f17761a <= d2) && (d <= d2 || this.n.f17761a >= d2)) {
            return false;
        }
        return true;
    }

    @Override // tb.l2m
    public void e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86648201", new Object[]{this, map});
            return;
        }
        b bVar = this.n;
        double d = pxv.d(map, "initialVelocity", vu3.b.GEO_NOT_SUPPORT);
        bVar.b = d;
        this.e = d;
        this.i = pxv.d(map, cc5.STIFFNESS, 100.0d);
        this.j = pxv.d(map, "damping", 10.0d);
        this.k = pxv.d(map, "mass", 1.0d);
        this.l = this.n.b;
        this.d = pxv.d(map, "fromValue", vu3.b.GEO_NOT_SUPPORT);
        this.p = pxv.d(map, "toValue", 1.0d);
        this.q = pxv.d(map, "restSpeedThreshold", 0.001d);
        this.r = pxv.d(map, "restDisplacementThreshold", 0.001d);
        this.m = pxv.b(map, "overshootClamping", false);
        this.f = false;
        this.s = vu3.b.GEO_NOT_SUPPORT;
        this.h = false;
    }
}
