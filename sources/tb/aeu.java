package tb;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.model.layer.a;
import java.util.Collections;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class aeu {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f15698a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public pw1<PointF, PointF> f;
    public pw1<?, PointF> g;
    public pw1<rro, rro> h;
    public pw1<Float, Float> i;
    public pw1<Integer, Integer> j;
    public hn9 k;
    public hn9 l;
    public pw1<?, Float> m;
    public pw1<?, Float> n;

    public aeu(vx0 vx0Var) {
        pw1<PointF, PointF> pw1Var;
        pw1<PointF, PointF> pw1Var2;
        pw1<rro, rro> pw1Var3;
        pw1<Float, Float> pw1Var4;
        hn9 hn9Var;
        hn9 hn9Var2;
        if (vx0Var.c() == null) {
            pw1Var = null;
        } else {
            pw1Var = vx0Var.c().a();
        }
        this.f = pw1Var;
        if (vx0Var.f() == null) {
            pw1Var2 = null;
        } else {
            pw1Var2 = vx0Var.f().a();
        }
        this.g = pw1Var2;
        if (vx0Var.h() == null) {
            pw1Var3 = null;
        } else {
            pw1Var3 = vx0Var.h().a();
        }
        this.h = pw1Var3;
        if (vx0Var.g() == null) {
            pw1Var4 = null;
        } else {
            pw1Var4 = vx0Var.g().a();
        }
        this.i = pw1Var4;
        if (vx0Var.i() == null) {
            hn9Var = null;
        } else {
            hn9Var = (hn9) vx0Var.i().a();
        }
        this.k = hn9Var;
        if (hn9Var != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        if (vx0Var.j() == null) {
            hn9Var2 = null;
        } else {
            hn9Var2 = (hn9) vx0Var.j().a();
        }
        this.l = hn9Var2;
        if (vx0Var.e() != null) {
            this.j = vx0Var.e().a();
        }
        if (vx0Var.k() != null) {
            this.m = vx0Var.k().a();
        } else {
            this.m = null;
        }
        if (vx0Var.d() != null) {
            this.n = vx0Var.d().a();
        } else {
            this.n = null;
        }
    }

    public void a(a aVar) {
        aVar.i(this.j);
        aVar.i(this.m);
        aVar.i(this.n);
        aVar.i(this.f);
        aVar.i(this.g);
        aVar.i(this.h);
        aVar.i(this.i);
        aVar.i(this.k);
        aVar.i(this.l);
    }

    public void b(pw1.b bVar) {
        pw1<Integer, Integer> pw1Var = this.j;
        if (pw1Var != null) {
            pw1Var.a(bVar);
        }
        pw1<?, Float> pw1Var2 = this.m;
        if (pw1Var2 != null) {
            pw1Var2.a(bVar);
        }
        pw1<?, Float> pw1Var3 = this.n;
        if (pw1Var3 != null) {
            pw1Var3.a(bVar);
        }
        pw1<PointF, PointF> pw1Var4 = this.f;
        if (pw1Var4 != null) {
            pw1Var4.a(bVar);
        }
        pw1<?, PointF> pw1Var5 = this.g;
        if (pw1Var5 != null) {
            pw1Var5.a(bVar);
        }
        pw1<rro, rro> pw1Var6 = this.h;
        if (pw1Var6 != null) {
            pw1Var6.a(bVar);
        }
        pw1<Float, Float> pw1Var7 = this.i;
        if (pw1Var7 != null) {
            pw1Var7.a(bVar);
        }
        hn9 hn9Var = this.k;
        if (hn9Var != null) {
            hn9Var.a(bVar);
        }
        hn9 hn9Var2 = this.l;
        if (hn9Var2 != null) {
            hn9Var2.a(bVar);
        }
    }

    public <T> boolean c(T t, fmh<T> fmhVar) {
        if (t == ylh.TRANSFORM_ANCHOR_POINT) {
            pw1<PointF, PointF> pw1Var = this.f;
            if (pw1Var == null) {
                this.f = new w1w(fmhVar, new PointF());
                return true;
            }
            pw1Var.n(fmhVar);
            return true;
        } else if (t == ylh.TRANSFORM_POSITION) {
            pw1<?, PointF> pw1Var2 = this.g;
            if (pw1Var2 == null) {
                this.g = new w1w(fmhVar, new PointF());
                return true;
            }
            pw1Var2.n(fmhVar);
            return true;
        } else {
            if (t == ylh.TRANSFORM_POSITION_X) {
                pw1<?, PointF> pw1Var3 = this.g;
                if (pw1Var3 instanceof dcq) {
                    ((dcq) pw1Var3).r(fmhVar);
                    return true;
                }
            }
            if (t == ylh.TRANSFORM_POSITION_Y) {
                pw1<?, PointF> pw1Var4 = this.g;
                if (pw1Var4 instanceof dcq) {
                    ((dcq) pw1Var4).s(fmhVar);
                    return true;
                }
            }
            if (t == ylh.TRANSFORM_SCALE) {
                pw1<rro, rro> pw1Var5 = this.h;
                if (pw1Var5 == null) {
                    this.h = new w1w(fmhVar, new rro());
                    return true;
                }
                pw1Var5.n(fmhVar);
                return true;
            } else if (t == ylh.TRANSFORM_ROTATION) {
                pw1<Float, Float> pw1Var6 = this.i;
                if (pw1Var6 == null) {
                    this.i = new w1w(fmhVar, Float.valueOf(0.0f));
                    return true;
                }
                pw1Var6.n(fmhVar);
                return true;
            } else if (t == ylh.TRANSFORM_OPACITY) {
                pw1<Integer, Integer> pw1Var7 = this.j;
                if (pw1Var7 == null) {
                    this.j = new w1w(fmhVar, 100);
                    return true;
                }
                pw1Var7.n(fmhVar);
                return true;
            } else if (t == ylh.TRANSFORM_START_OPACITY) {
                pw1<?, Float> pw1Var8 = this.m;
                if (pw1Var8 == null) {
                    this.m = new w1w(fmhVar, Float.valueOf(100.0f));
                    return true;
                }
                pw1Var8.n(fmhVar);
                return true;
            } else if (t == ylh.TRANSFORM_END_OPACITY) {
                pw1<?, Float> pw1Var9 = this.n;
                if (pw1Var9 == null) {
                    this.n = new w1w(fmhVar, Float.valueOf(100.0f));
                    return true;
                }
                pw1Var9.n(fmhVar);
                return true;
            } else if (t == ylh.TRANSFORM_SKEW) {
                if (this.k == null) {
                    this.k = new hn9(Collections.singletonList(new w4g(Float.valueOf(0.0f))));
                }
                this.k.n(fmhVar);
                return true;
            } else if (t != ylh.TRANSFORM_SKEW_ANGLE) {
                return false;
            } else {
                if (this.l == null) {
                    this.l = new hn9(Collections.singletonList(new w4g(Float.valueOf(0.0f))));
                }
                this.l.n(fmhVar);
                return true;
            }
        }
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public pw1<?, Float> e() {
        return this.n;
    }

    public Matrix f() {
        float f;
        float f2;
        float f3;
        PointF h;
        Matrix matrix = this.f15698a;
        matrix.reset();
        pw1<?, PointF> pw1Var = this.g;
        if (!(pw1Var == null || (h = pw1Var.h()) == null)) {
            float f4 = h.x;
            if (!(f4 == 0.0f && h.y == 0.0f)) {
                matrix.preTranslate(f4, h.y);
            }
        }
        pw1<Float, Float> pw1Var2 = this.i;
        if (pw1Var2 != null) {
            if (pw1Var2 instanceof w1w) {
                f3 = pw1Var2.h().floatValue();
            } else {
                f3 = ((hn9) pw1Var2).p();
            }
            if (f3 != 0.0f) {
                matrix.preRotate(f3);
            }
        }
        hn9 hn9Var = this.k;
        if (hn9Var != null) {
            hn9 hn9Var2 = this.l;
            if (hn9Var2 == null) {
                f = 0.0f;
            } else {
                f = (float) Math.cos(Math.toRadians((-hn9Var2.p()) + 90.0f));
            }
            hn9 hn9Var3 = this.l;
            if (hn9Var3 == null) {
                f2 = 1.0f;
            } else {
                f2 = (float) Math.sin(Math.toRadians((-hn9Var3.p()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(hn9Var.p()));
            d();
            float[] fArr = this.e;
            fArr[0] = f;
            fArr[1] = f2;
            float f5 = -f2;
            fArr[3] = f5;
            fArr[4] = f;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = f;
            fArr[1] = f5;
            fArr[3] = f2;
            fArr[4] = f;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        pw1<rro, rro> pw1Var3 = this.h;
        if (pw1Var3 != null) {
            rro h2 = pw1Var3.h();
            if (!(h2.b() == 1.0f && h2.c() == 1.0f)) {
                matrix.preScale(h2.b(), h2.c());
            }
        }
        pw1<PointF, PointF> pw1Var4 = this.f;
        if (pw1Var4 != null) {
            PointF h3 = pw1Var4.h();
            float f6 = h3.x;
            if (!(f6 == 0.0f && h3.y == 0.0f)) {
                matrix.preTranslate(-f6, -h3.y);
            }
        }
        return matrix;
    }

    public Matrix g(float f) {
        PointF pointF;
        rro rroVar;
        float f2;
        pw1<?, PointF> pw1Var = this.g;
        PointF pointF2 = null;
        if (pw1Var == null) {
            pointF = null;
        } else {
            pointF = pw1Var.h();
        }
        pw1<rro, rro> pw1Var2 = this.h;
        if (pw1Var2 == null) {
            rroVar = null;
        } else {
            rroVar = pw1Var2.h();
        }
        Matrix matrix = this.f15698a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (rroVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(rroVar.b(), d), (float) Math.pow(rroVar.c(), d));
        }
        pw1<Float, Float> pw1Var3 = this.i;
        if (pw1Var3 != null) {
            float floatValue = pw1Var3.h().floatValue();
            pw1<PointF, PointF> pw1Var4 = this.f;
            if (pw1Var4 != null) {
                pointF2 = pw1Var4.h();
            }
            float f3 = floatValue * f;
            float f4 = 0.0f;
            if (pointF2 == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF2.x;
            }
            if (pointF2 != null) {
                f4 = pointF2.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return matrix;
    }

    public pw1<?, Integer> h() {
        return this.j;
    }

    public pw1<?, Float> i() {
        return this.m;
    }

    public void j(float f) {
        pw1<Integer, Integer> pw1Var = this.j;
        if (pw1Var != null) {
            pw1Var.m(f);
        }
        pw1<?, Float> pw1Var2 = this.m;
        if (pw1Var2 != null) {
            pw1Var2.m(f);
        }
        pw1<?, Float> pw1Var3 = this.n;
        if (pw1Var3 != null) {
            pw1Var3.m(f);
        }
        pw1<PointF, PointF> pw1Var4 = this.f;
        if (pw1Var4 != null) {
            pw1Var4.m(f);
        }
        pw1<?, PointF> pw1Var5 = this.g;
        if (pw1Var5 != null) {
            pw1Var5.m(f);
        }
        pw1<rro, rro> pw1Var6 = this.h;
        if (pw1Var6 != null) {
            pw1Var6.m(f);
        }
        pw1<Float, Float> pw1Var7 = this.i;
        if (pw1Var7 != null) {
            pw1Var7.m(f);
        }
        hn9 hn9Var = this.k;
        if (hn9Var != null) {
            hn9Var.m(f);
        }
        hn9 hn9Var2 = this.l;
        if (hn9Var2 != null) {
            hn9Var2.m(f);
        }
    }
}
