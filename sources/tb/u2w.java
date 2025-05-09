package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public double f29097a;
    public double b;
    public double c;

    static {
        t2o.a(87031935);
    }

    public u2w(double d, double d2, double d3) {
        this.f29097a = d;
        this.b = d2;
        this.c = d3;
    }

    public u2w a(p7n p7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u2w) ipChange.ipc$dispatch("b18993df", new Object[]{this, p7nVar});
        }
        double d = this.f29097a;
        double d2 = this.b;
        double d3 = this.c;
        double d4 = p7nVar.f25922a;
        double d5 = p7nVar.b;
        double d6 = p7nVar.c;
        double d7 = p7nVar.d;
        double d8 = ((d7 * d) + (d5 * d3)) - (d6 * d2);
        double d9 = ((d7 * d2) + (d6 * d)) - (d4 * d3);
        double d10 = ((d7 * d3) + (d4 * d2)) - (d5 * d);
        double d11 = -d4;
        double d12 = ((d * d11) - (d2 * d5)) - (d3 * d6);
        double d13 = -d6;
        double d14 = -d5;
        this.f29097a = (((d8 * d7) + (d12 * d11)) + (d9 * d13)) - (d10 * d14);
        this.b = (((d9 * d7) + (d12 * d14)) + (d10 * d11)) - (d8 * d13);
        this.c = (((d10 * d7) + (d12 * d13)) + (d8 * d14)) - (d9 * d11);
        return this;
    }

    public void b(double d, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17849bf5", new Object[]{this, new Double(d), new Double(d2), new Double(d3)});
            return;
        }
        this.f29097a = d;
        this.b = d2;
        this.c = d3;
    }
}
