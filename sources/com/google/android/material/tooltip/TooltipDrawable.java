package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.taobao.taobao.R;
import tb.cok;
import tb.e78;
import tb.hkt;
import tb.l7i;
import tb.m4i;
import tb.u9i;
import tb.xot;
import tb.ykt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements ykt.b {
    public final ykt A;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public CharSequence x;
    public final Context y;
    public final Paint.FontMetrics z = new Paint.FontMetrics();
    public final View.OnLayoutChangeListener B = new a();
    public final Rect C = new Rect();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            TooltipDrawable.this.z0(view);
        }
    }

    public TooltipDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ykt yktVar = new ykt(this);
        this.A = yktVar;
        this.y = context;
        yktVar.e().density = context.getResources().getDisplayMetrics().density;
        yktVar.e().setTextAlign(Paint.Align.CENTER);
    }

    public static TooltipDrawable q0(Context context, AttributeSet attributeSet, int i, int i2) {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, i, i2);
        tooltipDrawable.v0(attributeSet, i, i2);
        return tooltipDrawable;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(n0(), (float) (-((this.H * Math.sqrt(2.0d)) - this.H)));
        super.draw(canvas);
        t0(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.A.e().getTextSize(), this.F);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.D * 2) + u0(), this.E);
    }

    public final float n0() {
        int i;
        Rect rect = this.C;
        if (((rect.right - getBounds().right) - this.I) - this.G < 0) {
            i = ((rect.right - getBounds().right) - this.I) - this.G;
        } else if (((rect.left - getBounds().left) - this.I) + this.G <= 0) {
            return 0.0f;
        } else {
            i = ((rect.left - getBounds().left) - this.I) + this.G;
        }
        return i;
    }

    public final float o0() {
        TextPaint e = this.A.e();
        Paint.FontMetrics fontMetrics = this.z;
        e.getFontMetrics(fontMetrics);
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a.b v = getShapeAppearanceModel().v();
        v.r(r0());
        setShapeAppearanceModel(v.m());
    }

    public final float p0(Rect rect) {
        return rect.centerY() - o0();
    }

    public final e78 r0() {
        float width = ((float) (getBounds().width() - (this.H * Math.sqrt(2.0d)))) / 2.0f;
        return new cok(new m4i(this.H), Math.min(Math.max(-n0(), -width), width));
    }

    public void s0(View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.B);
        }
    }

    public final void t0(Canvas canvas) {
        if (this.x != null) {
            Rect bounds = getBounds();
            int p0 = (int) p0(bounds);
            ykt yktVar = this.A;
            if (yktVar.d() != null) {
                yktVar.e().drawableState = getState();
                yktVar.j(this.y);
            }
            CharSequence charSequence = this.x;
            canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), p0, yktVar.e());
        }
    }

    public final float u0() {
        CharSequence charSequence = this.x;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.A.f(charSequence.toString());
    }

    public final void v0(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = xot.h(this.y, attributeSet, R.styleable.Tooltip, i, i2, new int[0]);
        Context context = this.y;
        this.H = context.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        a.b v = getShapeAppearanceModel().v();
        v.r(r0());
        setShapeAppearanceModel(v.m());
        x0(h.getText(R.styleable.Tooltip_android_text));
        y0(u9i.f(context, h, R.styleable.Tooltip_android_textAppearance));
        W(ColorStateList.valueOf(h.getColor(R.styleable.Tooltip_backgroundTint, l7i.e(ColorUtils.setAlphaComponent(l7i.b(context, 16842801, TooltipDrawable.class.getCanonicalName()), 229), ColorUtils.setAlphaComponent(l7i.b(context, R.attr.colorOnBackground, TooltipDrawable.class.getCanonicalName()), 153)))));
        h0(ColorStateList.valueOf(l7i.b(context, R.attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
        this.D = h.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
        this.E = h.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
        this.F = h.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
        this.G = h.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
        h.recycle();
    }

    public void w0(View view) {
        if (view != null) {
            z0(view);
            view.addOnLayoutChangeListener(this.B);
        }
    }

    public void x0(CharSequence charSequence) {
        if (!TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.A.i(true);
            invalidateSelf();
        }
    }

    public void y0(hkt hktVar) {
        this.A.h(hktVar, this.y);
    }

    public final void z0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.I = iArr[0];
        view.getWindowVisibleDisplayFrame(this.C);
    }
}
