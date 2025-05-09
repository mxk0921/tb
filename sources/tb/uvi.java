package tb;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uvi {

    /* renamed from: a  reason: collision with root package name */
    public static final PointF f29637a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static float c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static boolean e(float f, float f2, float f3) {
        if (f < f2 || f > f3) {
            return false;
        }
        return true;
    }

    public static int f(int i, int i2) {
        boolean z;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (z || i4 == 0) {
            return i3;
        }
        return i3 - 1;
    }

    public static int g(float f, float f2) {
        return h((int) f, (int) f2);
    }

    public static int h(int i, int i2) {
        return i - (i2 * f(i, i2));
    }

    public static void i(ghp ghpVar, Path path) {
        path.reset();
        PointF b = ghpVar.b();
        path.moveTo(b.x, b.y);
        PointF pointF = f29637a;
        pointF.set(b.x, b.y);
        for (int i = 0; i < ghpVar.a().size(); i++) {
            xy4 xy4Var = ghpVar.a().get(i);
            PointF a2 = xy4Var.a();
            PointF b2 = xy4Var.b();
            PointF c = xy4Var.c();
            if (!a2.equals(pointF) || !b2.equals(c)) {
                path.cubicTo(a2.x, a2.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            pointF.set(c.x, c.y);
        }
        if (ghpVar.d()) {
            path.close();
        }
    }

    public static double j(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int l(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static void m(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2, g4g g4gVar) {
        if (e4gVar.c(g4gVar.getName(), i)) {
            list.add(e4gVar2.a(g4gVar.getName()).i(g4gVar));
        }
    }
}
