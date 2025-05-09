package com.taobao.android.weex_uikit.widget.border;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.h5k;
import tb.li2;
import tb.ni2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BorderProp extends h5k<BorderProp> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALL = 4;
    public static final int BOTTOM_LEFT = 3;
    public static final int BOTTOM_RIGHT = 2;
    public static final int DASHED = 2;
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final int DOTTED = 1;
    public static final int EDGE_ALL = 4;
    public static final int EDGE_BOTTOM = 3;
    public static final int EDGE_COUNT = 4;
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 1;
    public static final int SET = 0;
    public static final int SOLID = 0;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    public static final int UNSET = -1;
    public Path f;
    public Path g;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    /* renamed from: a  reason: collision with root package name */
    public final PathEffect[] f10010a = new PathEffect[4];
    public final int[] b = {-1, 0, -1, 0, -1, 0, -1, 0, -1, 0};
    public final int[] c = {-1, 0, -1, 0, -1, 0, -1, 0, -1, 0};
    public final int[] d = {-1, -16777216, -1, -16777216, -1, -16777216, -1, -16777216, -1, -16777216};
    public final int[] e = {-1, 0, -1, 0, -1, 0, -1, 0, -1, 0};
    public final Path[] h = new Path[4];
    public final boolean[] i = new boolean[4];
    public final li2 j = new li2(this);

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface BorderStyle {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface Corner {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface Edge {
    }

    static {
        t2o.a(986710131);
    }

    public static void A(int[] iArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add60024", new Object[]{iArr, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = i * 2;
        iArr[i3] = 0;
        iArr[i3 + 1] = i2;
    }

    public static /* synthetic */ Object ipc$super(BorderProp borderProp, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/border/BorderProp");
    }

    public static int l(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f05acfa6", new Object[]{iArr, new Integer(i)})).intValue();
        }
        return iArr[(i * 2) + 1];
    }

    public static boolean o(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a360dfa", new Object[]{iArr, new Integer(i)})).booleanValue();
        }
        if (iArr[i * 2] == 0) {
            return true;
        }
        return false;
    }

    public static void t(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d5302c", new Object[]{iArr, new Integer(i)});
            return;
        }
        int i2 = i * 2;
        iArr[i2] = -1;
        iArr[i2 + 1] = 0;
    }

    public boolean B() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee4a30d4", new Object[]{this})).booleanValue();
        }
        boolean z5 = this.m;
        boolean z6 = this.q;
        if (this.k == 0 || this.l == 0) {
            this.m = false;
            return false;
        }
        if (this.n || z5) {
            C();
        }
        if (this.m || this.n || this.p || this.o) {
            D();
            z6 = true;
        }
        if (this.n || this.o || z5) {
            this.j.l(this.k, this.l);
        }
        if (this.o || z5) {
            this.j.k(this.k, this.l);
        }
        if (this.o || this.p || this.n || z5) {
            ni2.l(this, this.k, this.l);
            ni2.n(this, this.k, this.l);
            ni2.m(this, this.k, this.l);
            ni2.j(this, this.k, this.l);
        }
        if (this.n || this.o) {
            int g = g(0);
            int g2 = g(1);
            int g3 = g(3);
            int g4 = g(2);
            float e = e(0);
            float e2 = e(1);
            float e3 = e(3);
            float e4 = e(2);
            boolean[] zArr = this.i;
            if (g > 0 || ((g2 > 0 || g3 > 0) && (e > 0.0f || e3 > 0.0f))) {
                z = true;
            } else {
                z = false;
            }
            zArr[0] = z;
            if (g2 > 0 || ((g > 0 || g4 > 0) && (e > 0.0f || e2 > 0.0f))) {
                z2 = true;
            } else {
                z2 = false;
            }
            zArr[1] = z2;
            if (g4 > 0 || ((g2 > 0 || g3 > 0) && (e2 > 0.0f || e4 > 0.0f))) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[2] = z3;
            if (g3 <= 0 && ((g <= 0 && g4 <= 0) || (e3 <= 0.0f && e4 <= 0.0f))) {
                z4 = false;
            }
            zArr[3] = z4;
        }
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.m = false;
        return z6;
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310d140a", new Object[]{this});
            return;
        }
        this.f = null;
        this.r = false;
        for (int i = 0; i < 4; i++) {
            if (e(i) > 0) {
                float[] fArr = new float[8];
                int min = Math.min(this.k, this.l) / 2;
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    int min2 = Math.min(min, e(i3));
                    int i4 = i3 * 2;
                    float f = min2;
                    fArr[i4] = f;
                    fArr[i4 + 1] = f;
                    if (i3 == 0) {
                        i2 = min2;
                    } else if (!z) {
                        if (i2 != min2) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                }
                this.r = !z;
                RectF rectF = new RectF(0.0f, 0.0f, this.k, this.l);
                Path path = new Path();
                this.f = path;
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }

    public final void D() {
        int g;
        int d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f338327", new Object[]{this});
            return;
        }
        this.g = null;
        int f = f(0);
        if (f == 0 && f == f(1) && f == f(2) && f == f(3) && (g = g(0)) == g(1) && g == g(2) && g == g(3) && (d = d(0)) == d(1) && d == d(2) && d == d(3)) {
            Path path = new Path();
            this.g = path;
            Path path2 = this.f;
            if (path2 != null) {
                path.addPath(path2);
            } else {
                path.addRect(0.0f, 0.0f, this.k, this.l, Path.Direction.CW);
            }
        }
    }

    public void E(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1856811", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.k != i || this.l != i2) {
            this.m = true;
            this.k = i;
            this.l = i2;
        }
    }

    public void a(BorderProp borderProp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1053e296", new Object[]{this, borderProp});
        } else if (borderProp != null) {
            int length = this.b.length;
            for (int i = 0; i < length; i++) {
                this.b[i] = borderProp.b[i];
                this.d[i] = borderProp.d[i];
                this.e[i] = borderProp.e[i];
                this.c[i] = borderProp.c[i];
            }
            this.j.b(borderProp.j);
            for (int i2 = 0; i2 < 4; i2++) {
                this.h[i2] = borderProp.h[i2];
                this.f10010a[i2] = borderProp.f10010a[i2];
                this.i[i2] = borderProp.i[i2];
            }
            this.k = borderProp.k;
            this.l = borderProp.l;
            this.f = borderProp.f;
            this.g = borderProp.g;
            this.r = borderProp.r;
        }
    }

    public void b(Canvas canvas, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa8ce0f", new Object[]{this, canvas, paint});
        } else if (this.g == null) {
            c(canvas, 0, paint);
            c(canvas, 1, paint);
            c(canvas, 2, paint);
            c(canvas, 3, paint);
        } else if (g(0) > 0) {
            paint.setColor(d(0));
            paint.setPathEffect(null);
            paint.setStrokeWidth(g(0) * 2);
            canvas.drawPath(this.g, paint);
        }
    }

    public final void c(Canvas canvas, int i, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54da47aa", new Object[]{this, canvas, new Integer(i), paint});
        } else if (m(i)) {
            int a2 = this.j.a(canvas, i);
            if (f(i) == 0) {
                paint.setPathEffect(null);
            } else {
                paint.setPathEffect(h(i));
            }
            paint.setColor(d(i));
            if (f(i) == 1) {
                paint.setStrokeWidth(g(i));
            } else {
                paint.setStrokeWidth(i(i) * 2);
            }
            canvas.drawPath(j(i), paint);
            if (a2 != -1) {
                canvas.restoreToCount(a2);
            }
        }
    }

    public int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf8de68e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 4) {
            throw new RuntimeException("can't access border color array with @Edge.EDGE_ALL");
        } else if (o(this.d, i)) {
            return l(this.d, i);
        } else {
            if (o(this.d, 4)) {
                return l(this.d, 4);
            }
            return -16777216;
        }
    }

    public int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82ddc57b", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 4) {
            throw new RuntimeException("can't access border radius array with @Corner.ALL");
        } else if (o(this.e, i)) {
            return l(this.e, i);
        } else {
            if (o(this.e, 4)) {
                return l(this.e, 4);
            }
            return 0;
        }
    }

    public int f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b08b900", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 4) {
            throw new RuntimeException("can't access border style array with @Edge.EDGE_ALL");
        } else if (o(this.c, i)) {
            return l(this.c, i);
        } else {
            if (o(this.c, 4)) {
                return l(this.c, 4);
            }
            return 0;
        }
    }

    public int g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24156e0b", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 4) {
            throw new RuntimeException("can't access border width array with @Edge.EDGE_ALL");
        } else if (o(this.b, i)) {
            return l(this.b, i);
        } else {
            if (o(this.b, 4)) {
                return l(this.b, 4);
            }
            return 0;
        }
    }

    public final PathEffect h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PathEffect) ipChange.ipc$dispatch("af47a78c", new Object[]{this, new Integer(i)});
        }
        if (i != 4) {
            return this.f10010a[i];
        }
        throw new RuntimeException("can't access effect array with @Edge.EDGE_ALL");
    }

    public final int i(int i) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2140ce9b", new Object[]{this, new Integer(i)})).intValue();
        }
        int g = g(i);
        if (i == 0) {
            i3 = g(1);
            i2 = g(3);
        } else if (i == 1) {
            i3 = g(0);
            i2 = g(2);
        } else if (i == 2) {
            i3 = g(1);
            i2 = g(3);
        } else if (i != 3) {
            i2 = 0;
        } else {
            i3 = g(0);
            i2 = g(2);
        }
        return Math.max(i3, Math.max(i2, g));
    }

    public Path j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("ce228c09", new Object[]{this, new Integer(i)});
        }
        return this.h[i];
    }

    public Path k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("fe3071fc", new Object[]{this});
        }
        return this.f;
    }

    public final boolean m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9f34dd5", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.i[i];
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b9b4ed", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72816294", new Object[]{this, new Integer(i)});
            return;
        }
        t(this.d, i);
        this.q = true;
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e59c8af", new Object[]{this, new Integer(i)});
            return;
        }
        t(this.e, i);
        this.n = true;
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dfc3506", new Object[]{this, new Integer(i)});
            return;
        }
        t(this.c, i);
        this.p = true;
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c708ea11", new Object[]{this, new Integer(i)});
            return;
        }
        t(this.b, i);
        this.o = true;
    }

    public void u(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc56c3c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        A(this.d, i, i2);
        this.q = true;
    }

    public void v(int i, PathEffect pathEffect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608dfe2a", new Object[]{this, new Integer(i), pathEffect});
        } else {
            this.f10010a[i] = pathEffect;
        }
    }

    public void w(int i, Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df16fcf", new Object[]{this, new Integer(i), path});
        } else if (i == 0 || i == 1 || i == 2 || i == 3) {
            this.h[i] = path;
        } else if (i == 4) {
            for (int i2 = 0; i2 < 4; i2++) {
                this.h[i2] = path;
            }
        }
    }

    public void x(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7006e087", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        A(this.e, i, Math.max(0, i2));
        this.n = true;
    }

    public void y(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a4e80a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        A(this.c, i, i2);
        this.p = true;
    }

    public void z(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2ed45f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        A(this.b, i, Math.max(0, i2));
        this.o = true;
    }
}
