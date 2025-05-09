package tb;

import com.google.android.material.shape.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class oi2 extends e78 implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public float f25402a;
    public float b;
    public float c;
    public float d;
    public float e = 0.0f;

    public oi2(float f, float f2, float f3) {
        this.b = f;
        this.f25402a = f2;
        h(f3);
    }

    @Override // tb.e78
    public void b(float f, float f2, float f3, c cVar) {
        float f4 = this.c;
        if (f4 == 0.0f) {
            cVar.l(f, 0.0f);
            return;
        }
        float f5 = ((this.b * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.f25402a;
        float f7 = f2 + this.e;
        float f8 = (this.d * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            cVar.l(f, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((f9 * f9) - (f10 * f10));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f10));
        float f13 = 90.0f - degrees;
        cVar.l(f11, 0.0f);
        float f14 = f6 * 2.0f;
        cVar.a(f11 - f6, 0.0f, f11 + f6, f14, 270.0f, degrees);
        cVar.a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        cVar.a(f12 - f6, 0.0f, f12 + f6, f14, 270.0f - degrees, degrees);
        cVar.l(f, 0.0f);
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.b;
    }

    public float e() {
        return this.f25402a;
    }

    public float f() {
        return this.c;
    }

    public float g() {
        return this.e;
    }

    public void h(float f) {
        if (f >= 0.0f) {
            this.d = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void i(float f) {
        this.b = f;
    }

    public void j(float f) {
        this.f25402a = f;
    }

    public void k(float f) {
        this.c = f;
    }

    public void l(float f) {
        this.e = f;
    }
}
