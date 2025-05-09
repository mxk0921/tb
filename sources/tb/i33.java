package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i33 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597196);
    }

    public static void a(RectF rectF, Path path, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9958f0b0", new Object[]{rectF, path, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Integer(i5), new Integer(i6)});
            return;
        }
        int i7 = i5;
        int i8 = (i6 + 1) % 8;
        do {
            switch (i7) {
                case 0:
                    l(path, z3 ? i2 : 0, rectF, z2);
                    i7 = (i7 + 1) % 8;
                    break;
                case 1:
                    h(path, i2, rectF, z2, z3);
                    i7 = (i7 + 1) % 8;
                    break;
                case 2:
                    g(path, z4 ? i4 : 0, rectF, z3);
                    i7 = (i7 + 1) % 8;
                    break;
                case 3:
                    f(path, i4, rectF, z3, z4);
                    i7 = (i7 + 1) % 8;
                    break;
                case 4:
                    b(path, z ? i3 : 0, rectF, z4);
                    i7 = (i7 + 1) % 8;
                    break;
                case 5:
                    c(path, i3, rectF, z4, z);
                    i7 = (i7 + 1) % 8;
                    break;
                case 6:
                    d(path, z2 ? i : 0, rectF, z);
                    i7 = (i7 + 1) % 8;
                    break;
                case 7:
                    e(path, i, rectF, z, z2);
                    i7 = (i7 + 1) % 8;
                    break;
                default:
                    i7 = (i7 + 1) % 8;
                    break;
            }
        } while (i7 != i8);
    }

    public static void b(Path path, int i, RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9e520a", new Object[]{path, new Integer(i), rectF, new Boolean(z)});
        } else if (z) {
            path.lineTo(rectF.left + i, rectF.bottom);
        } else {
            path.moveTo(rectF.left + i, rectF.bottom);
        }
    }

    public static void c(Path path, int i, RectF rectF, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a63c852", new Object[]{path, new Integer(i), rectF, new Boolean(z), new Boolean(z2)});
        } else if (i > 0 && z && z2) {
            float f = rectF.left;
            float f2 = rectF.bottom;
            float f3 = i * 2;
            path.arcTo(new RectF(f, f2 - f3, f3 + f, f2), 90.0f, 90.0f);
        } else if (z) {
            path.lineTo(rectF.left, rectF.bottom);
        } else {
            path.moveTo(rectF.left, rectF.bottom);
        }
    }

    public static void d(Path path, int i, RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0c97ae", new Object[]{path, new Integer(i), rectF, new Boolean(z)});
        } else if (z) {
            path.lineTo(rectF.left, rectF.top + i);
        } else {
            path.moveTo(rectF.left, rectF.top + i);
        }
    }

    public static void e(Path path, int i, RectF rectF, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93645fc6", new Object[]{path, new Integer(i), rectF, new Boolean(z), new Boolean(z2)});
        } else if (i > 0 && z && z2) {
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = i * 2;
            path.arcTo(new RectF(f, f2, f + f3, f3 + f2), -180.0f, 90.0f);
        } else if (z) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            path.moveTo(rectF.left, rectF.top);
        }
    }

    public static void f(Path path, int i, RectF rectF, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9485131f", new Object[]{path, new Integer(i), rectF, new Boolean(z), new Boolean(z2)});
        } else if (i > 0 && z && z2) {
            float f = rectF.right;
            float f2 = i * 2;
            float f3 = rectF.bottom;
            path.arcTo(new RectF(f - f2, f3 - f2, f, f3), 0.0f, 90.0f);
        } else if (z) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            path.moveTo(rectF.right, rectF.bottom);
        }
    }

    public static void g(Path path, int i, RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9e8241", new Object[]{path, new Integer(i), rectF, new Boolean(z)});
        } else if (z) {
            path.lineTo(rectF.right, rectF.bottom - i);
        } else {
            path.moveTo(rectF.right, rectF.bottom - i);
        }
    }

    public static void h(Path path, int i, RectF rectF, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f592d019", new Object[]{path, new Integer(i), rectF, new Boolean(z), new Boolean(z2)});
        } else if (i > 0 && z && z2) {
            float f = rectF.right;
            float f2 = i * 2;
            float f3 = rectF.top;
            path.arcTo(new RectF(f - f2, f3, f, f2 + f3), -90.0f, 90.0f);
        } else if (z) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            path.moveTo(rectF.right, rectF.top);
        }
    }

    public static void i(Canvas canvas, Paint paint, RectF rectF, int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dd30d3", new Object[]{canvas, paint, rectF, iArr, iArr2});
            return;
        }
        if (q(iArr2) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (w(iArr2) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (t(iArr2) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (o(iArr2) > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int s = s(iArr);
        int v = v(iArr);
        int r = r(iArr);
        int u = u(iArr);
        Path path = new Path();
        if (z || z2 || z3 || z4) {
            if (!z) {
                path.moveTo(rectF.left, rectF.top);
                a(rectF, path, s, v, r, u, false, z2, z3, z4, 0, 4);
            } else if (!z2) {
                path.moveTo(rectF.right, rectF.top);
                a(rectF, path, s, v, r, u, true, false, z3, z4, 2, 6);
            } else if (!z3) {
                path.moveTo(rectF.right, rectF.bottom);
                a(rectF, path, s, v, r, u, true, true, false, z4, 4, 0);
            } else if (!z4) {
                path.moveTo(rectF.left, rectF.bottom);
                a(rectF, path, s, v, r, u, true, true, true, false, 6, 2);
            } else {
                path.moveTo(rectF.left, rectF.top + s);
                a(rectF, path, s, v, r, u, true, true, true, true, 7, 6);
                path.close();
            }
            canvas.drawPath(path, paint);
        }
    }

    public static void j(Canvas canvas, Paint paint, RectF rectF, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68dcc37", new Object[]{canvas, paint, rectF, iArr});
            return;
        }
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.FILL);
        i(canvas, paint, rectF, iArr, new int[]{1, 1, 1, 1});
        paint.setStyle(style);
    }

    public static void k(Canvas canvas, Paint paint, RectF rectF, int[] iArr, int[] iArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecabc7c7", new Object[]{canvas, paint, rectF, iArr, iArr2});
            return;
        }
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.STROKE);
        i(canvas, paint, rectF, iArr, iArr2);
        paint.setStyle(style);
    }

    public static void l(Path path, int i, RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63b08e8", new Object[]{path, new Integer(i), rectF, new Boolean(z)});
        } else if (z) {
            path.lineTo(rectF.right - i, rectF.top);
        } else {
            path.moveTo(rectF.right - i, rectF.top);
        }
    }

    public static int m(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ea0f68c", new Object[]{iArr})).intValue();
        }
        if (iArr == null) {
            return 0;
        }
        for (int i : iArr) {
            if (i != 0) {
                return i;
            }
        }
        return 0;
    }

    public static int n(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("757e4f7d", new Object[]{iArr, new Integer(i)})).intValue();
        }
        if (iArr != null && i >= 0 && i <= iArr.length - 1) {
            return iArr[i];
        }
        return 0;
    }

    public static int o(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acbb821", new Object[]{iArr})).intValue();
        }
        return n(iArr, 3);
    }

    public static int p(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0eb9764", new Object[]{iArr, new Integer(i)})).intValue();
        }
        if (iArr != null && i >= 0 && i <= iArr.length - 1) {
            return iArr[i];
        }
        return 0;
    }

    public static int q(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b93b1045", new Object[]{iArr})).intValue();
        }
        return n(iArr, 0);
    }

    public static int r(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c763af7", new Object[]{iArr})).intValue();
        }
        return p(iArr, 2);
    }

    public static int s(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d354d87", new Object[]{iArr})).intValue();
        }
        return p(iArr, 0);
    }

    public static int t(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43b85f7c", new Object[]{iArr})).intValue();
        }
        return n(iArr, 2);
    }

    public static int u(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5992afe0", new Object[]{iArr})).intValue();
        }
        return p(iArr, 3);
    }

    public static int v(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed7a293e", new Object[]{iArr})).intValue();
        }
        return p(iArr, 1);
    }

    public static int w(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c604dee3", new Object[]{iArr})).intValue();
        }
        return n(iArr, 1);
    }
}
