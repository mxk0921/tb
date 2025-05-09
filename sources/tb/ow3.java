package tb;

import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ow3 implements qw3<Double> {
    @Override // tb.qw3
    public /* bridge */ /* synthetic */ boolean a(Double d, Double d2) {
        return b(d.doubleValue(), d2.doubleValue());
    }

    public boolean b(double d, double d2) {
        if (d <= d2) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ow3)) {
            return false;
        }
        ow3 ow3Var = (ow3) obj;
        ow3Var.getClass();
        ow3Var.getClass();
        return true;
    }

    @Override // tb.rw3
    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
    }

    @Override // tb.rw3
    public /* bridge */ /* synthetic */ Comparable getStart() {
        return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
    }

    public int hashCode() {
        return (Double.doubleToLongBits(vu3.b.GEO_NOT_SUPPORT) * 31) + Double.doubleToLongBits(vu3.b.GEO_NOT_SUPPORT);
    }

    @Override // tb.rw3
    public boolean isEmpty() {
        return false;
    }

    public String toString() {
        return "0.0..0.0";
    }
}
