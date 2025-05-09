package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class pw3 implements qw3<Float> {
    @Override // tb.qw3
    public /* bridge */ /* synthetic */ boolean a(Float f, Float f2) {
        return b(f.floatValue(), f2.floatValue());
    }

    public boolean b(float f, float f2) {
        if (f <= f2) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pw3)) {
            return false;
        }
        pw3 pw3Var = (pw3) obj;
        pw3Var.getClass();
        pw3Var.getClass();
        return true;
    }

    @Override // tb.rw3
    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return Float.valueOf(0.0f);
    }

    @Override // tb.rw3
    public /* bridge */ /* synthetic */ Comparable getStart() {
        return Float.valueOf(0.0f);
    }

    public int hashCode() {
        return (Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f);
    }

    @Override // tb.rw3
    public boolean isEmpty() {
        return false;
    }

    public String toString() {
        return "0.0..0.0";
    }
}
