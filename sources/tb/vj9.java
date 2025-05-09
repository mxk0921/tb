package tb;

import android.graphics.RectF;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vj9 {

    /* renamed from: a  reason: collision with root package name */
    public static final uj9 f30042a = new a();
    public static final uj9 b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements uj9 {
        @Override // tb.uj9
        public yj9 a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float k = com.google.android.material.transition.b.k(f4, f6, f2, f3, f);
            float f8 = k / f4;
            float f9 = k / f6;
            return new yj9(f8, f9, k, f5 * f8, k, f7 * f9);
        }

        @Override // tb.uj9
        public void b(RectF rectF, float f, yj9 yj9Var) {
            rectF.bottom -= Math.abs(yj9Var.f - yj9Var.d) * f;
        }

        @Override // tb.uj9
        public boolean c(yj9 yj9Var) {
            if (yj9Var.d > yj9Var.f) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements uj9 {
        @Override // tb.uj9
        public yj9 a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float k = com.google.android.material.transition.b.k(f5, f7, f2, f3, f);
            float f8 = k / f5;
            float f9 = k / f7;
            return new yj9(f8, f9, f4 * f8, k, f6 * f9, k);
        }

        @Override // tb.uj9
        public void b(RectF rectF, float f, yj9 yj9Var) {
            float abs = (Math.abs(yj9Var.e - yj9Var.c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // tb.uj9
        public boolean c(yj9 yj9Var) {
            if (yj9Var.c > yj9Var.e) {
                return true;
            }
            return false;
        }
    }

    public static uj9 a(int i, boolean z, RectF rectF, RectF rectF2) {
        uj9 uj9Var = f30042a;
        uj9 uj9Var2 = b;
        if (i != 0) {
            if (i == 1) {
                return uj9Var;
            }
            if (i == 2) {
                return uj9Var2;
            }
            throw new IllegalArgumentException("Invalid fit mode: " + i);
        } else if (b(z, rectF, rectF2)) {
            return uj9Var;
        } else {
            return uj9Var2;
        }
    }

    public static boolean b(boolean z, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f = (height2 * width) / width2;
        float f2 = (width2 * height) / width;
        if (z) {
            if (f < height) {
                return false;
            }
        } else if (f2 < height2) {
            return false;
        }
        return true;
    }
}
