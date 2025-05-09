package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.lai;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 2;

    /* renamed from: a  reason: collision with root package name */
    public final a f5059a;
    public final View b;
    public final Path c = new Path();
    public final Paint d = new Paint(7);
    public final Paint e;
    public b.e f;
    public Drawable g;
    public boolean h;
    public boolean i;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface Strategy {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    public CircularRevealHelper(a aVar) {
        this.f5059a = aVar;
        View view = (View) aVar;
        this.b = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(0);
    }

    public void a() {
        if (STRATEGY == 0) {
            this.h = true;
            this.i = false;
            View view = this.b;
            view.buildDrawingCache();
            Bitmap drawingCache = view.getDrawingCache();
            if (!(drawingCache != null || view.getWidth() == 0 || view.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                view.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.h = false;
            this.i = true;
        }
    }

    public void b() {
        if (STRATEGY == 0) {
            this.i = false;
            View view = this.b;
            view.destroyDrawingCache();
            this.d.setShader(null);
            view.invalidate();
        }
    }

    public void c(Canvas canvas) {
        boolean n = n();
        Paint paint = this.e;
        a aVar = this.f5059a;
        View view = this.b;
        if (n) {
            int i = STRATEGY;
            if (i == 0) {
                b.e eVar = this.f;
                canvas.drawCircle(eVar.f5062a, eVar.b, eVar.c, this.d);
                if (p()) {
                    b.e eVar2 = this.f;
                    canvas.drawCircle(eVar2.f5062a, eVar2.b, eVar2.c, paint);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.c);
                aVar.actualDraw(canvas);
                if (p()) {
                    canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                aVar.actualDraw(canvas);
                if (p()) {
                    canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy " + i);
            }
        } else {
            aVar.actualDraw(canvas);
            if (p()) {
                canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
            }
        }
        d(canvas);
    }

    public final void d(Canvas canvas) {
        if (o()) {
            Rect bounds = this.g.getBounds();
            float width = this.f.f5062a - (bounds.width() / 2.0f);
            float height = this.f.b - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    public Drawable e() {
        return this.g;
    }

    public int f() {
        return this.e.getColor();
    }

    public final float g(b.e eVar) {
        float f = eVar.f5062a;
        float f2 = eVar.b;
        View view = this.b;
        return lai.b(f, f2, 0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    public b.e h() {
        b.e eVar = this.f;
        if (eVar == null) {
            return null;
        }
        b.e eVar2 = new b.e(eVar);
        if (eVar2.a()) {
            eVar2.c = g(eVar2);
        }
        return eVar2;
    }

    public final void i() {
        if (STRATEGY == 1) {
            Path path = this.c;
            path.rewind();
            b.e eVar = this.f;
            if (eVar != null) {
                path.addCircle(eVar.f5062a, eVar.b, eVar.c, Path.Direction.CW);
            }
        }
        this.b.invalidate();
    }

    public boolean j() {
        if (!this.f5059a.actualIsOpaque() || n()) {
            return false;
        }
        return true;
    }

    public void k(Drawable drawable) {
        this.g = drawable;
        this.b.invalidate();
    }

    public void l(int i) {
        this.e.setColor(i);
        this.b.invalidate();
    }

    public void m(b.e eVar) {
        if (eVar == null) {
            this.f = null;
        } else {
            b.e eVar2 = this.f;
            if (eVar2 == null) {
                this.f = new b.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (lai.c(eVar.c, g(eVar), 1.0E-4f)) {
                this.f.c = Float.MAX_VALUE;
            }
        }
        i();
    }

    public final boolean n() {
        boolean z;
        b.e eVar = this.f;
        if (eVar == null || eVar.a()) {
            z = true;
        } else {
            z = false;
        }
        if (STRATEGY != 0) {
            return !z;
        }
        if (z || !this.i) {
            return false;
        }
        return true;
    }

    public final boolean o() {
        if (this.h || this.g == null || this.f == null) {
            return false;
        }
        return true;
    }

    public final boolean p() {
        if (this.h || Color.alpha(this.e.getColor()) == 0) {
            return false;
        }
        return true;
    }
}
