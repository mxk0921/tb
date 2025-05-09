package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class z25 extends MaterialShapeDrawable {
    public final Paint x;
    public final RectF y;
    public int z;

    public z25() {
        this(null);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        o0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.y, this.x);
        n0(canvas);
    }

    public boolean m0() {
        return !this.y.isEmpty();
    }

    public final void n0(Canvas canvas) {
        if (!u0(getCallback())) {
            canvas.restoreToCount(this.z);
        }
    }

    public final void o0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (u0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        q0(canvas);
    }

    public void p0() {
        r0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void q0(Canvas canvas) {
        this.z = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
    }

    public void r0(float f, float f2, float f3, float f4) {
        RectF rectF = this.y;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public void s0(RectF rectF) {
        r0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void t0() {
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        Paint paint = this.x;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final boolean u0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public z25(a aVar) {
        super(aVar == null ? new a() : aVar);
        this.x = new Paint(1);
        t0();
        this.y = new RectF();
    }
}
