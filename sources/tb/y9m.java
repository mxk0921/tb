package tb;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;
import tb.pw1;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y9m implements bul, pw1.b, g4g {
    public final String b;
    public final LottieDrawable c;
    public final PolystarShape.Type d;
    public final boolean e;
    public final boolean f;
    public final pw1<?, Float> g;
    public final pw1<?, PointF> h;
    public final pw1<?, Float> i;
    public final pw1<?, Float> j;
    public final pw1<?, Float> k;
    public final pw1<?, Float> l;
    public final pw1<?, Float> m;
    public boolean o;

    /* renamed from: a  reason: collision with root package name */
    public final Path f31926a = new Path();
    public final ce4 n = new ce4();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31927a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f31927a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31927a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public y9m(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, PolystarShape polystarShape) {
        this.c = lottieDrawable;
        this.b = polystarShape.d();
        PolystarShape.Type j = polystarShape.j();
        this.d = j;
        this.e = polystarShape.k();
        this.f = polystarShape.l();
        pw1<Float, Float> a2 = polystarShape.g().a();
        this.g = a2;
        pw1<PointF, PointF> a3 = polystarShape.h().a();
        this.h = a3;
        pw1<Float, Float> a4 = polystarShape.i().a();
        this.i = a4;
        pw1<Float, Float> a5 = polystarShape.e().a();
        this.k = a5;
        pw1<Float, Float> a6 = polystarShape.f().a();
        this.m = a6;
        PolystarShape.Type type = PolystarShape.Type.STAR;
        if (j == type) {
            this.j = polystarShape.b().a();
            this.l = polystarShape.c().a();
        } else {
            this.j = null;
            this.l = null;
        }
        aVar.i(a2);
        aVar.i(a3);
        aVar.i(a4);
        aVar.i(a5);
        aVar.i(a6);
        if (j == type) {
            aVar.i(this.j);
            aVar.i(this.l);
        }
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        a6.a(this);
        if (j == type) {
            this.j.a(this);
            this.l.a(this);
        }
    }

    @Override // tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        pw1<?, Float> pw1Var;
        pw1<?, Float> pw1Var2;
        if (t == ylh.POLYSTAR_POINTS) {
            this.g.n(fmhVar);
        } else if (t == ylh.POLYSTAR_ROTATION) {
            this.i.n(fmhVar);
        } else if (t == ylh.POSITION) {
            this.h.n(fmhVar);
        } else if (t == ylh.POLYSTAR_INNER_RADIUS && (pw1Var2 = this.j) != null) {
            pw1Var2.n(fmhVar);
        } else if (t == ylh.POLYSTAR_OUTER_RADIUS) {
            this.k.n(fmhVar);
        } else if (t == ylh.POLYSTAR_INNER_ROUNDEDNESS && (pw1Var = this.l) != null) {
            pw1Var.n(fmhVar);
        } else if (t == ylh.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.m.n(fmhVar);
        }
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
        for (int i = 0; i < list.size(); i++) {
            fo4 fo4Var = list.get(i);
            if (fo4Var instanceof pgu) {
                pgu pguVar = (pgu) fo4Var;
                if (pguVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.n.a(pguVar);
                    pguVar.a(this);
                }
            }
        }
    }

    @Override // tb.f4g
    public void d(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
        uvi.m(e4gVar, i, list, e4gVar2, this);
    }

    public final void f() {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        int i;
        float f;
        Path path;
        float f2;
        y9m y9mVar = this;
        int floor = (int) Math.floor(y9mVar.g.h().floatValue());
        pw1<?, Float> pw1Var = y9mVar.i;
        if (pw1Var == null) {
            d = vu3.b.GEO_NOT_SUPPORT;
        } else {
            d = pw1Var.h().floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d6 = floor;
        float floatValue = y9mVar.m.h().floatValue() / 100.0f;
        float floatValue2 = y9mVar.k.h().floatValue();
        double d7 = floatValue2;
        float cos = (float) (Math.cos(radians) * d7);
        float sin = (float) (Math.sin(radians) * d7);
        Path path2 = y9mVar.f31926a;
        path2.moveTo(cos, sin);
        double d8 = (float) (6.283185307179586d / d6);
        double d9 = radians + d8;
        double ceil = Math.ceil(d6);
        int i2 = 0;
        double d10 = d8;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d9) * d7);
            float sin2 = (float) (Math.sin(d9) * d7);
            if (floatValue != 0.0f) {
                d4 = ceil;
                d3 = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                i = i2;
                d2 = d9;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f3 = floatValue2 * floatValue * 0.25f;
                float cos3 = ((float) Math.cos(atan2)) * f3;
                float sin3 = ((float) Math.sin(atan2)) * f3;
                float cos4 = ((float) Math.cos(atan22)) * f3;
                float sin4 = f3 * ((float) Math.sin(atan22));
                f = sin2;
                d5 = d10;
                f2 = cos2;
                path = path2;
                path2.cubicTo(cos - cos3, sin - sin3, cos4 + cos2, sin4 + sin2, f2, f);
            } else {
                d2 = d9;
                d4 = ceil;
                d3 = d7;
                f = sin2;
                f2 = cos2;
                path = path2;
                d5 = d10;
                i = i2;
                path.lineTo(f2, f);
            }
            double d11 = d2 + d5;
            cos = f2;
            path2 = path;
            sin = f;
            d10 = d5;
            d7 = d3;
            y9mVar = this;
            d9 = d11;
            i2 = i + 1;
            ceil = d4;
        }
        PointF h = y9mVar.h.h();
        path2.offset(h.x, h.y);
        path2.close();
    }

    @Override // tb.pw1.b
    public void g() {
        j();
    }

    @Override // tb.fo4
    public String getName() {
        return this.b;
    }

    @Override // tb.bul
    public Path getPath() {
        boolean z = this.o;
        Path path = this.f31926a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.e) {
            this.o = true;
            return path;
        }
        int i = a.f31927a[this.d.ordinal()];
        if (i == 1) {
            i();
        } else if (i == 2) {
            f();
        }
        path.close();
        this.n.b(path);
        this.o = true;
        return path;
    }

    public final void i() {
        double d;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        float f6;
        double d2;
        float f7;
        float f8;
        float f9;
        float f10;
        Path path;
        double d3;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float floatValue = this.g.h().floatValue();
        pw1<?, Float> pw1Var = this.i;
        if (pw1Var == null) {
            d = vu3.b.GEO_NOT_SUPPORT;
        } else {
            d = pw1Var.h().floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d4 = floatValue;
        float f16 = (float) (6.283185307179586d / d4);
        if (this.f) {
            f16 *= -1.0f;
        }
        float f17 = f16 / 2.0f;
        float f18 = floatValue - ((int) floatValue);
        int i2 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f18) * f17;
        }
        float floatValue2 = this.k.h().floatValue();
        float floatValue3 = this.j.h().floatValue();
        pw1<?, Float> pw1Var2 = this.l;
        if (pw1Var2 != null) {
            f = pw1Var2.h().floatValue() / 100.0f;
        } else {
            f = 0.0f;
        }
        pw1<?, Float> pw1Var3 = this.m;
        if (pw1Var3 != null) {
            f2 = pw1Var3.h().floatValue() / 100.0f;
        } else {
            f2 = 0.0f;
        }
        Path path2 = this.f31926a;
        if (i2 != 0) {
            float f19 = floatValue3 + ((floatValue2 - floatValue3) * f18);
            double d5 = f19;
            i = i2;
            f4 = (float) (d5 * Math.cos(radians));
            float sin = (float) (d5 * Math.sin(radians));
            path2.moveTo(f4, sin);
            d2 = radians + ((f16 * f18) / 2.0f);
            f6 = sin;
            f3 = f19;
            f5 = f17;
        } else {
            i = i2;
            double d6 = floatValue2;
            float cos = (float) (Math.cos(radians) * d6);
            f6 = (float) (d6 * Math.sin(radians));
            path2.moveTo(cos, f6);
            f5 = f17;
            d2 = radians + f5;
            f4 = cos;
            f3 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < ceil) {
                if (z) {
                    f7 = floatValue2;
                } else {
                    f7 = floatValue3;
                }
                int i4 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                if (i4 == 0 || d7 != ceil - 2.0d) {
                    f8 = f16;
                    f9 = f5;
                } else {
                    f8 = f16;
                    f9 = (f16 * f18) / 2.0f;
                }
                if (i4 == 0 || d7 != ceil - 1.0d) {
                    f10 = f3;
                    f3 = f7;
                } else {
                    f10 = f3;
                }
                double d8 = f3;
                float cos2 = (float) (d8 * Math.cos(d2));
                float sin2 = (float) (d8 * Math.sin(d2));
                if (f == 0.0f && f2 == 0.0f) {
                    path2.lineTo(cos2, sin2);
                    d3 = d2;
                    f11 = f;
                    path = path2;
                } else {
                    d3 = d2;
                    double atan2 = (float) (Math.atan2(f6, f4) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f11 = f;
                    path = path2;
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z) {
                        f12 = f11;
                    } else {
                        f12 = f2;
                    }
                    if (z) {
                        f13 = f2;
                    } else {
                        f13 = f11;
                    }
                    if (z) {
                        f14 = floatValue3;
                    } else {
                        f14 = floatValue2;
                    }
                    if (z) {
                        f15 = floatValue2;
                    } else {
                        f15 = floatValue3;
                    }
                    float f20 = f14 * f12 * 0.47829f;
                    float f21 = cos3 * f20;
                    float f22 = f20 * sin3;
                    float f23 = f15 * f13 * 0.47829f;
                    float f24 = cos4 * f23;
                    float f25 = f23 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f21 *= f18;
                            f22 *= f18;
                        } else if (d7 == ceil - 1.0d) {
                            f24 *= f18;
                            f25 *= f18;
                        }
                    }
                    path.cubicTo(f4 - f21, f6 - f22, cos2 + f24, sin2 + f25, cos2, sin2);
                }
                z = !z;
                i3++;
                f = f11;
                f4 = cos2;
                d2 = d3 + f9;
                f16 = f8;
                f3 = f10;
                path2 = path;
                f6 = sin2;
                ceil = ceil;
            } else {
                PointF h = this.h.h();
                path2.offset(h.x, h.y);
                path2.close();
                return;
            }
        }
    }

    public final void j() {
        this.o = false;
        this.c.invalidateSelf();
    }
}
