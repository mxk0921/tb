package tb;

import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.graphics.RectF;
import androidx.core.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.border.BorderProp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ni2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710130);
    }

    public static Path a(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("8471d2ef", new Object[]{borderProp, new Integer(i), new Integer(i2)});
        }
        Path i3 = i(borderProp.g(3), borderProp.g(2), borderProp.g(0), borderProp.e(2), borderProp.e(3), i, i2);
        if (i3 == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, i / 2.0f, i2 / 2.0f);
        i3.transform(matrix);
        return i3;
    }

    public static PathEffect b(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PathEffect) ipChange.ipc$dispatch("7fbb66db", new Object[]{new Float(f), new Float(f2), new Integer(i)});
        }
        float f3 = 2.0f * f2;
        int round = Math.round(((f * 2.0f) + f3) / (6.0f * f2));
        new Path().addRect(0.0f, 0.0f, f3, f2, Path.Direction.CW);
        return new DashPathEffect(new float[]{f3, (f - (round * f3)) / (round - 1)}, 0.0f);
    }

    public static PathEffect c(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PathEffect) ipChange.ipc$dispatch("61fad882", new Object[]{new Float(f), new Float(f2), new Integer(i)});
        }
        int round = Math.round((f + f2) / (2.0f * f2));
        float f3 = (f - (round * f2)) / (round - 1);
        Path path = new Path();
        path.addOval(new RectF(0.0f, 0.0f, f2, f2), Path.Direction.CW);
        return new PathDashPathEffect(path, f2 + f3, 0.0f, PathDashPathEffect.Style.ROTATE);
    }

    public static PathEffect d(int i, BorderProp borderProp, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PathEffect) ipChange.ipc$dispatch("ce9258b2", new Object[]{new Integer(i), borderProp, new Float(f)});
        }
        int f2 = borderProp.f(i);
        float g = borderProp.g(i);
        if (f2 == 1) {
            return c(f, g, i);
        }
        if (f2 != 2) {
            return null;
        }
        return b(f, g, i);
    }

    public static Path e(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("c3814313", new Object[]{borderProp, new Integer(i), new Integer(i2)});
        }
        Path i3 = i(borderProp.g(0), borderProp.g(3), borderProp.g(1), borderProp.e(3), borderProp.e(0), i2, i);
        if (i3 == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f, 0.0f, 0.0f);
        matrix.postRotate(180.0f, 0.0f, i2 / 2.0f);
        i3.transform(matrix);
        return i3;
    }

    public static Pair<Path, Float> f(int i, int i2, int i3, BorderProp borderProp, int i4, int i5, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float max;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("881a20e5", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), borderProp, new Integer(i4), new Integer(i5), new Float(f), new Float(f2)});
        }
        Path path = new Path();
        float min = Math.min(i4, i5) / 2.0f;
        float min2 = Math.min(min, f);
        float min3 = Math.min(min, f2);
        int g = borderProp.g(i);
        int g2 = borderProp.g(i2);
        int g3 = borderProp.g(i3);
        float f6 = g;
        if (f6 < min2 || g2 < min2) {
            float f7 = i5 / 2.0f;
            path.moveTo(0.0f, f7);
            path.rLineTo(0.0f, -Math.max(0.0f, f7 - min2));
            float f8 = min2 * 2.0f;
            path.arcTo(new RectF(0.0f, 0.0f, f8, f8), -180.0f, 90.0f);
            float f9 = i4;
            f3 = 0.0f;
            path.lineTo(f9 - min3, 0.0f);
            f4 = ((float) (max + 0.0f + ((min2 * 3.141592653589793d) / 2.0d))) + ((f9 - min2) - min3);
        } else {
            path.moveTo(0.0f, 0.0f);
            float f10 = i4 - min3;
            path.lineTo(f10, 0.0f);
            f4 = f10 + 0.0f;
            f3 = 0.0f;
        }
        if (f6 < min3 || g3 < min3) {
            float f11 = i4;
            float f12 = min3 * 2.0f;
            path.arcTo(new RectF(f11 - f12, f3, f11, f12), -90.0f, 90.0f);
            float max2 = Math.max(0.0f, (i5 / 2.0f) - min3);
            path.rLineTo(0.0f, max2);
            f5 = ((float) (f4 + ((min3 * 3.141592653589793d) / 2.0d))) + max2;
        } else {
            path.lineTo(i4, f3);
            f5 = f4 + min3;
        }
        return new Pair<>(path, Float.valueOf(f5));
    }

    public static Path g(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("f79a0c4a", new Object[]{borderProp, new Integer(i), new Integer(i2)});
        }
        Path i3 = i(borderProp.g(2), borderProp.g(1), borderProp.g(3), borderProp.e(1), borderProp.e(2), i2, i);
        if (i3 == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f, 0.0f, 0.0f);
        matrix.postTranslate(i, 0.0f);
        i3.transform(matrix);
        return i3;
    }

    public static Path h(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("846225b1", new Object[]{borderProp, new Integer(i), new Integer(i2)});
        }
        return i(borderProp.g(1), borderProp.g(0), borderProp.g(2), borderProp.e(0), borderProp.e(1), i, i2);
    }

    public static Path i(int i, int i2, int i3, float f, float f2, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("6c1da6a9", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Float(f), new Float(f2), new Integer(i4), new Integer(i5)});
        }
        if (i == i2 && i == i3) {
            return null;
        }
        Path path = new Path();
        float f3 = i4;
        float f4 = f3 / 2.0f;
        float f5 = i5 / 2.0f;
        float min = Math.min(f4, f5);
        float min2 = Math.min(min, f2);
        float min3 = Math.min(min, f);
        path.moveTo(f3, f5);
        path.rLineTo(0.0f, -Math.max(0.0f, f5 - min2));
        float f6 = min2 * 2.0f;
        path.arcTo(new RectF(f3 - f6, 0.0f, f3, f6), 0.0f, -90.0f);
        path.lineTo(f4, 0.0f);
        path.lineTo(min3, 0.0f);
        float f7 = min3 * 2.0f;
        path.arcTo(new RectF(0.0f, 0.0f, f7, f7), -90.0f, -90.0f);
        path.lineTo(0.0f, f5);
        float f8 = i2;
        path.rLineTo(f8, 0.0f);
        float max = Math.max(0.0f, min3 - Math.min(i2, i));
        float f9 = i;
        path.rLineTo(0.0f, -Math.max(0.0f, (f5 - f9) - max));
        float f10 = max * 2.0f;
        float f11 = i5 - i;
        path.arcTo(new RectF(f8, f9, Math.min(f8 + f10, i4 - i2), Math.min(f10 + f9, f11)), -180.0f, 90.0f);
        path.lineTo(f4, f9);
        float max2 = Math.max(0.0f, min2 - Math.min(i, i3));
        float f12 = i3;
        float f13 = i4 - i3;
        float f14 = max2 * 2.0f;
        path.arcTo(new RectF(Math.max(f12, f13 - f14), f9, f13, Math.min(f14 + f9, f11)), -90.0f, 90.0f);
        path.lineTo(f13, f5);
        path.rLineTo(f12, 0.0f);
        return path;
    }

    public static void j(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdbd61e", new Object[]{borderProp, new Integer(i), new Integer(i2)});
            return;
        }
        Pair<Path, Float> f = f(3, 2, 0, borderProp, i, i2, borderProp.e(2), borderProp.e(3));
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, i / 2.0f, i2 / 2.0f);
        f.first.transform(matrix);
        borderProp.w(3, f.first);
        k(3, borderProp, f.second.floatValue());
    }

    public static void k(int i, BorderProp borderProp, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f190be15", new Object[]{new Integer(i), borderProp, new Float(f)});
        } else {
            borderProp.v(i, d(i, borderProp, f));
        }
    }

    public static void l(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8877dff", new Object[]{borderProp, new Integer(i), new Integer(i2)});
            return;
        }
        Pair<Path, Float> f = f(0, 3, 1, borderProp, i2, i, borderProp.e(3), borderProp.e(0));
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f, 0.0f, 0.0f);
        matrix.postRotate(180.0f, 0.0f, i2 / 2.0f);
        f.first.transform(matrix);
        borderProp.w(0, f.first);
        k(0, borderProp, f.second.floatValue());
    }

    public static void m(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc076b4", new Object[]{borderProp, new Integer(i), new Integer(i2)});
            return;
        }
        Pair<Path, Float> f = f(2, 1, 3, borderProp, i2, i, borderProp.e(1), borderProp.e(2));
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f, 0.0f, 0.0f);
        matrix.postTranslate(i, 0.0f);
        f.first.transform(matrix);
        borderProp.w(2, f.first);
        k(2, borderProp, f.second.floatValue());
    }

    public static void n(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e4d8ed", new Object[]{borderProp, new Integer(i), new Integer(i2)});
            return;
        }
        Pair<Path, Float> f = f(1, 0, 2, borderProp, i, i2, borderProp.e(0), borderProp.e(1));
        borderProp.w(1, f.first);
        k(1, borderProp, f.second.floatValue());
    }
}
