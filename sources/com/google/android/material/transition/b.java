package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.shape.a;
import tb.hu4;
import tb.qwn;
import tb.zz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final RectF f5204a = new RectF();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements a.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RectF f5205a;

        public a(RectF rectF) {
            this.f5205a = rectF;
        }

        @Override // com.google.android.material.shape.a.c
        public hu4 a(hu4 hu4Var) {
            if (hu4Var instanceof qwn) {
                return hu4Var;
            }
            RectF rectF = this.f5205a;
            return new qwn(hu4Var.a(rectF) / rectF.height());
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.google.android.material.transition.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class C0260b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RectF f5206a;
        public final /* synthetic */ RectF b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;

        public C0260b(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            this.f5206a = rectF;
            this.b = rectF2;
            this.c = f;
            this.d = f2;
            this.e = f3;
        }

        public hu4 a(hu4 hu4Var, hu4 hu4Var2) {
            return new zz(b.k(hu4Var.a(this.f5206a), hu4Var2.a(this.b), this.c, this.d, this.e));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
        void a(Canvas canvas);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface d {
    }

    public static float a(RectF rectF) {
        return rectF.width() * rectF.height();
    }

    public static com.google.android.material.shape.a b(com.google.android.material.shape.a aVar, RectF rectF) {
        return aVar.x(new a(rectF));
    }

    public static Shader c(int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    public static <T> T d(T t, T t2) {
        if (t != null) {
            return t;
        }
        return t2;
    }

    public static View e(View view, int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    public static View f(View view, int i) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return e(view, i);
    }

    public static RectF g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    public static RectF h(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static boolean i(com.google.android.material.shape.a aVar, RectF rectF) {
        if (aVar.r().a(rectF) == 0.0f && aVar.t().a(rectF) == 0.0f && aVar.l().a(rectF) == 0.0f && aVar.j().a(rectF) == 0.0f) {
            return false;
        }
        return true;
    }

    public static float j(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static float k(float f, float f2, float f3, float f4, float f5) {
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return j(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int l(int i, int i2, float f, float f2, float f3) {
        if (f3 < f) {
            return i;
        }
        if (f3 > f2) {
            return i2;
        }
        return (int) j(i, i2, (f3 - f) / (f2 - f));
    }

    public static com.google.android.material.shape.a m(com.google.android.material.shape.a aVar, com.google.android.material.shape.a aVar2, RectF rectF, RectF rectF2, float f, float f2, float f3) {
        if (f3 < f) {
            return aVar;
        }
        if (f3 > f2) {
            return aVar2;
        }
        return p(aVar, aVar2, rectF, new C0260b(rectF, rectF2, f, f2, f3));
    }

    public static int n(Canvas canvas, Rect rect, int i) {
        RectF rectF = f5204a;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    public static void o(Canvas canvas, Rect rect, float f, float f2, float f3, int i, c cVar) {
        if (i > 0) {
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                n(canvas, rect, i);
            }
            cVar.a(canvas);
            canvas.restoreToCount(save);
        }
    }

    public static com.google.android.material.shape.a p(com.google.android.material.shape.a aVar, com.google.android.material.shape.a aVar2, RectF rectF, d dVar) {
        com.google.android.material.shape.a aVar3;
        if (i(aVar, rectF)) {
            aVar3 = aVar;
        } else {
            aVar3 = aVar2;
        }
        a.b v = aVar3.v();
        C0260b bVar = (C0260b) dVar;
        v.E(bVar.a(aVar.r(), aVar2.r()));
        v.I(bVar.a(aVar.t(), aVar2.t()));
        v.v(bVar.a(aVar.j(), aVar2.j()));
        v.z(bVar.a(aVar.l(), aVar2.l()));
        return v.m();
    }
}
