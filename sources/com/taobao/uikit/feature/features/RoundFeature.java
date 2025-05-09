package com.taobao.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RoundFeature extends AbsFeature<View> implements CanvasCallback, LayoutCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint mPaint;
    private Path mPath;
    private Path mPathExtraA;
    private Path mPathExtraB;
    private Path mPathExtraC;
    private Path mPathExtraD;
    private RectF mRectF;
    private Rect mRectOld;
    private Rect mRectOut;
    private Drawable mShadowDrawable;
    private int mShadowOffset;
    private int mShadowOffsetPixel;
    private boolean mFastEnable = false;
    private float mRadius = 0.0f;

    static {
        t2o.a(931135561);
    }

    private void calcRect(Rect rect) {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2390b9", new Object[]{this, rect});
            return;
        }
        Drawable drawable = this.mShadowDrawable;
        if (drawable != null) {
            float intrinsicWidth = drawable.getIntrinsicWidth() / this.mShadowDrawable.getIntrinsicHeight();
            int measuredWidth = this.mHost.getMeasuredWidth();
            int measuredHeight = this.mHost.getMeasuredHeight();
            int i4 = (int) (measuredHeight * intrinsicWidth);
            if (i4 <= measuredWidth) {
                int i5 = (measuredWidth - i4) / 2;
                i3 = i5;
                measuredWidth = i5 + i4;
                i2 = measuredHeight;
                i = 0;
            } else {
                int i6 = (int) (measuredWidth / intrinsicWidth);
                i = (measuredHeight - i6) / 2;
                i2 = i + i6;
            }
            this.mShadowOffsetPixel = ((measuredWidth - i3) * this.mShadowOffset) / this.mShadowDrawable.getIntrinsicWidth();
            rect.set(i3, i, measuredWidth, i2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    private void drawShadow(Canvas canvas, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce2079f", new Object[]{this, canvas, rect});
            return;
        }
        Drawable drawable = this.mShadowDrawable;
        if (drawable != null) {
            this.mRectOld.set(drawable.getBounds());
            this.mShadowDrawable.setBounds(rect);
            this.mShadowDrawable.draw(canvas);
            this.mShadowDrawable.setBounds(this.mRectOld);
        }
    }

    private void invalidateHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2908a", new Object[]{this});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            t.invalidate();
        }
    }

    public static /* synthetic */ Object ipc$super(RoundFeature roundFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((View) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/RoundFeature");
    }

    private void update() {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            float measuredWidth = t.getMeasuredWidth();
            float measuredHeight = this.mHost.getMeasuredHeight();
            if (measuredWidth > measuredHeight) {
                f = measuredHeight / 2.0f;
            } else {
                f = measuredWidth / 2.0f;
            }
            float f3 = this.mShadowOffsetPixel;
            float f4 = this.mRadius;
            if (f4 <= 0.0f || f4 >= f) {
                f2 = f3;
            } else {
                f2 = f3 + (f - f4);
                f = f4;
            }
            calcRect(this.mRectOut);
            this.mRectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
            this.mPath.reset();
            this.mPathExtraA.reset();
            this.mPathExtraB.reset();
            this.mPathExtraC.reset();
            this.mPathExtraD.reset();
            this.mPath.addCircle(measuredWidth / 2.0f, measuredHeight / 2.0f, f - this.mShadowOffsetPixel, Path.Direction.CCW);
            this.mPath.setFillType(Path.FillType.INVERSE_WINDING);
            if (measuredHeight > measuredWidth) {
                Path path = this.mPathExtraA;
                float f5 = ((measuredHeight - measuredWidth) / 2.0f) + f2;
                Path.Direction direction = Path.Direction.CW;
                path.addRect(0.0f, 0.0f, measuredWidth, f5, direction);
                float f6 = ((measuredHeight + measuredWidth) / 2.0f) - f2;
                this.mPathExtraB.addRect(0.0f, f6, measuredWidth, measuredHeight, direction);
                this.mPathExtraC.addRect(0.0f, f5, f2, f6, direction);
                this.mPathExtraD.addRect(measuredWidth - f2, f5, measuredWidth, f6, direction);
                return;
            }
            Path path2 = this.mPathExtraA;
            float f7 = ((measuredWidth - measuredHeight) / 2.0f) + f2;
            Path.Direction direction2 = Path.Direction.CW;
            path2.addRect(0.0f, 0.0f, f7, measuredHeight, direction2);
            float f8 = ((measuredHeight + measuredWidth) / 2.0f) - f2;
            this.mPathExtraB.addRect(f8, 0.0f, measuredWidth, measuredHeight, direction2);
            this.mPathExtraC.addRect(f7, 0.0f, f8, f2, direction2);
            this.mPathExtraD.addRect(f7, measuredHeight - f2, f8, measuredHeight, direction2);
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
            return;
        }
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.drawPath(this.mPathExtraA, this.mPaint);
        canvas.drawPath(this.mPathExtraB, this.mPaint);
        canvas.drawPath(this.mPathExtraC, this.mPaint);
        canvas.drawPath(this.mPathExtraD, this.mPaint);
        drawShadow(canvas, this.mRectOut);
        if (!this.mFastEnable) {
            canvas.restore();
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d9525f", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            update();
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b3e1e1", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
        } else if (!this.mFastEnable) {
            canvas.saveLayerAlpha(this.mRectF, 255, 31);
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd545ddc", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        int i2 = -1;
        if (!(attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundFeature)) == null)) {
            this.mShadowDrawable = obtainStyledAttributes.getDrawable(R.styleable.RoundFeature_uik_shadowDrawable);
            this.mShadowOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RoundFeature_uik_shadowOffset, 0);
            this.mFastEnable = obtainStyledAttributes.getBoolean(R.styleable.RoundFeature_uik_fastEnable, false);
            i2 = obtainStyledAttributes.getColor(R.styleable.RoundFeature_uik_fastColor, -1);
            this.mRadius = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RoundFeature_uik_radius, 0);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(i2);
        if (!this.mFastEnable) {
            this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        this.mRectF = new RectF();
        this.mRectOut = new Rect();
        this.mPath = new Path();
        this.mRectOld = new Rect();
        this.mPathExtraA = new Path();
        this.mPathExtraB = new Path();
        this.mPathExtraC = new Path();
        this.mPathExtraD = new Path();
    }

    public float getRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue();
        }
        return this.mRadius;
    }

    public void setFastColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1db9c57", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPaint.setColor(i);
        invalidateHost();
    }

    public void setFastEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a733ccc", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mFastEnable = z;
        if (!z) {
            this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        } else {
            this.mPaint.setXfermode(null);
        }
        invalidateHost();
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa76c81", new Object[]{this, view});
            return;
        }
        super.setHost(view);
        view.requestLayout();
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else if (f != this.mRadius) {
            this.mRadius = f;
            update();
            invalidateHost();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dded430b", new Object[]{this, drawable});
            return;
        }
        this.mShadowDrawable = drawable;
        invalidateHost();
    }

    public void setShadowOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cd27", new Object[]{this, new Integer(i)});
            return;
        }
        this.mShadowOffset = i;
        invalidateHost();
    }
}
