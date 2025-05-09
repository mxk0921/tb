package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.taobao.taobao.R;
import tb.uhp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements uhp {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ShapeableImageView;
    private final Paint borderPaint;
    private final Paint clearPaint;
    private final RectF destination;
    private Path maskPath;
    private final RectF maskRect;
    private final Path path;
    private final b pathProvider;
    private final MaterialShapeDrawable shadowDrawable;
    private com.google.android.material.shape.a shapeAppearanceModel;
    private ColorStateList strokeColor;
    private float strokeWidth;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f5100a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.shapeAppearanceModel != null) {
                RectF rectF = shapeableImageView.destination;
                Rect rect = this.f5100a;
                rectF.round(rect);
                shapeableImageView.shadowDrawable.setBounds(rect);
                shapeableImageView.shadowDrawable.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private void drawStroke(Canvas canvas) {
        if (this.strokeColor != null) {
            this.borderPaint.setStrokeWidth(this.strokeWidth);
            int colorForState = this.strokeColor.getColorForState(getDrawableState(), this.strokeColor.getDefaultColor());
            if (this.strokeWidth > 0.0f && colorForState != 0) {
                this.borderPaint.setColor(colorForState);
                canvas.drawPath(this.path, this.borderPaint);
            }
        }
    }

    private void updateShapeMask(int i, int i2) {
        this.destination.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.pathProvider.d(this.shapeAppearanceModel, 1.0f, this.destination, this.path);
        this.maskPath.rewind();
        this.maskPath.addPath(this.path);
        this.maskRect.set(0.0f, 0.0f, i, i2);
        this.maskPath.addRect(this.maskRect, Path.Direction.CCW);
    }

    @Override // tb.uhp
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.maskPath, this.clearPaint);
        drawStroke(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateShapeMask(i, i2);
    }

    @Override // tb.uhp
    public void setShapeAppearanceModel(com.google.android.material.shape.a aVar) {
        this.shapeAppearanceModel = aVar;
        this.shadowDrawable.setShapeAppearanceModel(aVar);
        updateShapeMask(getWidth(), getHeight());
        invalidate();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.strokeColor = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.strokeWidth != f) {
            this.strokeWidth = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ShapeableImageView(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            int r0 = com.google.android.material.imageview.ShapeableImageView.DEF_STYLE_RES
            android.content.Context r6 = tb.bai.c(r6, r7, r8, r0)
            r5.<init>(r6, r7, r8)
            com.google.android.material.shape.b r6 = new com.google.android.material.shape.b
            r6.<init>()
            r5.pathProvider = r6
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r5.path = r6
            android.content.Context r6 = r5.getContext()
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.clearPaint = r1
            r2 = 1
            r1.setAntiAlias(r2)
            r3 = -1
            r1.setColor(r3)
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.DST_OUT
            r3.<init>(r4)
            r1.setXfermode(r3)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.destination = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.maskRect = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r5.maskPath = r1
            int[] r1 = com.taobao.taobao.R.styleable.ShapeableImageView
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r1, r8, r0)
            int r3 = com.taobao.taobao.R.styleable.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r3 = tb.u9i.a(r6, r1, r3)
            r5.strokeColor = r3
            int r3 = com.taobao.taobao.R.styleable.ShapeableImageView_strokeWidth
            r4 = 0
            int r1 = r1.getDimensionPixelSize(r3, r4)
            float r1 = (float) r1
            r5.strokeWidth = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.borderPaint = r1
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            r1.setAntiAlias(r2)
            com.google.android.material.shape.a$b r6 = com.google.android.material.shape.a.e(r6, r7, r8, r0)
            com.google.android.material.shape.a r6 = r6.m()
            r5.shapeAppearanceModel = r6
            com.google.android.material.shape.MaterialShapeDrawable r6 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.a r7 = r5.shapeAppearanceModel
            r6.<init>(r7)
            r5.shadowDrawable = r6
            com.google.android.material.imageview.ShapeableImageView$a r6 = new com.google.android.material.imageview.ShapeableImageView$a
            r6.<init>()
            r5.setOutlineProvider(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
