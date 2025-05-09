package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class why {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_MASK_BACKGROUND_COLOR = "#ffffff";
    public static final String e = why.class.getSimpleName();
    public Paint b;
    public Path c = null;
    public RectF d = null;

    static {
        t2o.a(918552709);
    }

    public why() {
        d();
    }

    public final void a(View view, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc2aeeb", new Object[]{this, view, viewGroup, new Integer(i)});
            return;
        }
        if (this.c == null) {
            this.c = new Path();
        }
        if (this.d == null) {
            this.d = new RectF();
        }
        this.c.reset();
        this.c.moveTo(viewGroup.getLeft(), viewGroup.getBottom());
        this.c.lineTo(viewGroup.getLeft(), view.getTop() + i);
        int i2 = i * 2;
        this.d.set(viewGroup.getLeft(), view.getTop(), viewGroup.getLeft() + i2, view.getTop() + i2);
        this.c.arcTo(this.d, 180.0f, 90.0f);
        this.c.lineTo(viewGroup.getRight() - i, view.getTop());
        this.d.set(viewGroup.getRight() - i2, view.getTop(), viewGroup.getRight(), view.getTop() + i2);
        this.c.arcTo(this.d, 270.0f, 90.0f);
        this.c.lineTo(viewGroup.getRight(), viewGroup.getBottom());
        this.c.close();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c866a327", new Object[]{this});
            return;
        }
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.b.setColor(Color.parseColor(DEFAULT_MASK_BACKGROUND_COLOR));
    }

    public void b(Canvas canvas, ViewGroup viewGroup, View view, int i, int[] iArr, int i2, yhy yhyVar) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afabab39", new Object[]{this, canvas, viewGroup, view, new Integer(i), iArr, new Integer(i2), yhyVar});
            return;
        }
        canvas.save();
        try {
            i3 = Color.parseColor(yhyVar.d());
        } catch (IllegalArgumentException e2) {
            tpu.Companion.a(e, "背景色异常", e2);
            i3 = Color.parseColor(DEFAULT_MASK_BACKGROUND_COLOR);
        }
        this.b.setColor(i3);
        if (view != null) {
            a(view, viewGroup, i2);
            canvas.drawPath(this.c, this.b);
        } else if (iArr == null || iArr[0] <= i) {
            this.b.setColor(i3);
            canvas.drawRect(0.0f, 0.0f, viewGroup.getRight(), viewGroup.getBottom(), this.b);
        } else {
            canvas.drawRect(0.0f, 0.0f, viewGroup.getRight(), viewGroup.getBottom(), this.b);
        }
        canvas.restore();
    }

    public void c(Canvas canvas, ViewGroup viewGroup, View view, int i, int[] iArr, boolean z, float f, yhy yhyVar) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb46ba4", new Object[]{this, canvas, viewGroup, view, new Integer(i), iArr, new Boolean(z), new Float(f), yhyVar});
            return;
        }
        canvas.save();
        this.b.setAntiAlias(true);
        this.b.setAlpha((int) (f * 255.0f));
        int[] iArr2 = z ? new int[]{Color.parseColor(yhyVar.b()), Color.parseColor(yhyVar.a())} : new int[]{Color.parseColor(yhyVar.f()), Color.parseColor(yhyVar.e())};
        int top = view != null ? view.getTop() : 0;
        this.b.setShader(new LinearGradient(0.0f, top, 0.0f, top + pb6.c(viewGroup.getContext(), 321.0f), iArr2, (float[]) null, Shader.TileMode.CLAMP));
        if (view != null) {
            a(view, viewGroup, pb6.c(viewGroup.getContext(), yhyVar.h()));
            canvas.drawPath(this.c, this.b);
        } else if (iArr == null || iArr[0] <= i) {
            try {
                i2 = Color.parseColor(yhyVar.d());
            } catch (IllegalArgumentException e2) {
                tpu.Companion.a(e, "背景色异常", e2);
                i2 = Color.parseColor(DEFAULT_MASK_BACKGROUND_COLOR);
            }
            this.b.setColor(i2);
            canvas.drawRect(0.0f, 0.0f, viewGroup.getRight(), viewGroup.getBottom(), this.b);
        } else {
            try {
                i3 = Color.parseColor(yhyVar.d());
            } catch (IllegalArgumentException e3) {
                tpu.Companion.a(e, "背景色异常", e3);
                i3 = Color.parseColor(DEFAULT_MASK_BACKGROUND_COLOR);
            }
            this.b.setColor(i3);
            canvas.drawRect(0.0f, 0.0f, viewGroup.getRight(), viewGroup.getBottom(), this.b);
        }
        canvas.restore();
    }
}
