package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.component.IndicatorView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLIndicatorView extends IndicatorView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mDiameter;
    private int mFocusColor;
    private int mFocusWidth;
    private int mGapMargin;
    private int mIndex;
    private Paint mPaint;
    private int mRadius;
    private int mStrokeColor;
    private float mStrokeWidth;
    private int mTotal;
    private int mUnfocusColor;
    public RectF rect;

    static {
        t2o.a(779093688);
    }

    public TBLIndicatorView(Context context) {
        this(context, null);
    }

    private int getDesiredHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfe33a5", new Object[]{this})).intValue();
        }
        return this.mDiameter + getPaddingTop() + getPaddingBottom();
    }

    private int getDesiredWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f17153c", new Object[]{this})).intValue();
        }
        int i = this.mTotal;
        return ((i - 1) * this.mDiameter) + this.mFocusWidth + ((i - 1) * this.mGapMargin) + getPaddingLeft() + getPaddingRight();
    }

    public static /* synthetic */ Object ipc$super(TBLIndicatorView tBLIndicatorView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/view/TBLIndicatorView");
    }

    private void judgeIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1957af02", new Object[]{this});
            return;
        }
        if (this.mIndex < 0) {
            this.mIndex = 0;
        }
        int i = this.mTotal;
        if (i - 1 < this.mIndex) {
            this.mIndex = i - 1;
        }
    }

    @Override // com.taobao.uikit.component.IndicatorView
    public int getGapMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeb296e8", new Object[]{this})).intValue();
        }
        return this.mGapMargin;
    }

    @Override // com.taobao.uikit.component.IndicatorView
    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.mIndex;
    }

    @Override // com.taobao.uikit.component.IndicatorView
    public int getTotal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcf28f08", new Object[]{this})).intValue();
        }
        return this.mTotal;
    }

    @Override // com.taobao.uikit.component.IndicatorView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        canvas.drawColor(0);
        if (this.mTotal > 1) {
            int paddingLeft = this.mRadius + getPaddingLeft();
            int paddingTop = this.mRadius + getPaddingTop();
            for (int i = 0; i < this.mTotal; i++) {
                int i2 = this.mIndex;
                if (i < i2) {
                    this.mPaint.setColor(this.mUnfocusColor);
                    this.mPaint.setStyle(Paint.Style.FILL);
                    float f = paddingTop;
                    canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + paddingLeft, f, this.mRadius, this.mPaint);
                    this.mPaint.setColor(this.mStrokeColor);
                    this.mPaint.setStyle(Paint.Style.STROKE);
                    canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + paddingLeft, f, this.mRadius - (this.mStrokeWidth * 0.5f), this.mPaint);
                } else if (i == i2) {
                    this.mPaint.setColor(this.mFocusColor);
                    this.mPaint.setStyle(Paint.Style.FILL);
                    RectF rectF = this.rect;
                    int i3 = this.mDiameter;
                    int i4 = this.mGapMargin;
                    int i5 = this.mRadius;
                    rectF.left = (((i3 + i4) * i) + paddingLeft) - i5;
                    rectF.top = paddingTop - i5;
                    rectF.right = ((((i3 + i4) * i) + paddingLeft) - i5) + this.mFocusWidth;
                    rectF.bottom = paddingTop + i5;
                    canvas.drawRoundRect(rectF, i5, i5, this.mPaint);
                } else {
                    this.mPaint.setColor(this.mUnfocusColor);
                    this.mPaint.setStyle(Paint.Style.FILL);
                    int i6 = i - 1;
                    int i7 = this.mDiameter;
                    int i8 = this.mGapMargin;
                    float f2 = paddingTop;
                    canvas.drawCircle(((i7 + i8) * i6) + paddingLeft + this.mFocusWidth + i8, f2, this.mRadius, this.mPaint);
                    this.mPaint.setColor(this.mStrokeColor);
                    this.mPaint.setStyle(Paint.Style.STROKE);
                    int i9 = this.mDiameter;
                    int i10 = this.mGapMargin;
                    canvas.drawCircle((i6 * (i9 + i10)) + paddingLeft + this.mFocusWidth + i10, f2, this.mRadius - (this.mStrokeWidth * 0.5f), this.mPaint);
                }
            }
        }
    }

    @Override // com.taobao.uikit.component.IndicatorView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            i3 = Math.max(getDesiredWidth(), size);
        } else {
            int desiredWidth = getDesiredWidth();
            if (mode == Integer.MIN_VALUE) {
                i3 = Math.min(desiredWidth, size);
            } else {
                i3 = desiredWidth;
            }
        }
        if (mode2 == 1073741824) {
            i4 = Math.max(getDesiredHeight(), size2);
        } else {
            int desiredHeight = getDesiredHeight();
            if (mode2 == Integer.MIN_VALUE) {
                i4 = Math.min(desiredHeight, size2);
            } else {
                i4 = desiredHeight;
            }
        }
        setMeasuredDimension(i3, i4);
    }

    @Override // com.taobao.uikit.component.IndicatorView
    public void setFocusColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c42e40f", new Object[]{this, new Integer(i)});
        } else {
            this.mFocusColor = i;
        }
    }

    @Override // com.taobao.uikit.component.IndicatorView
    public void setGapMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9722ba", new Object[]{this, new Integer(i)});
        } else {
            this.mGapMargin = i;
        }
    }

    @Override // com.taobao.uikit.component.IndicatorView
    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
            return;
        }
        this.mIndex = i;
        judgeIndex();
        invalidate();
    }

    @Override // com.taobao.uikit.component.IndicatorView
    public void setRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fd848", new Object[]{this, new Integer(i)});
        } else {
            this.mRadius = i;
        }
    }

    @Override // com.taobao.uikit.component.IndicatorView
    public void setTotal(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef84149a", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 1) {
            i = 1;
        }
        this.mTotal = i;
        requestLayout();
        invalidate();
    }

    @Override // com.taobao.uikit.component.IndicatorView
    public void setUnfocusColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a24d8d6", new Object[]{this, new Integer(i)});
        } else {
            this.mUnfocusColor = i;
        }
    }

    public TBLIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBLIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.rect = new RectF();
        this.mTotal = 1;
        this.mIndex = 0;
        this.mFocusColor = Color.parseColor("#ff5000");
        this.mUnfocusColor = Color.parseColor("#E0E0E0");
        this.mStrokeColor = Color.parseColor("#E0E0E0");
        this.mRadius = 2;
        this.mDiameter = 2 * 2;
        this.mGapMargin = 6;
        this.mStrokeWidth = 1.0f;
        this.mFocusWidth = 2 * 2;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TBLIndicatorView);
            this.mFocusColor = obtainStyledAttributes.getColor(R.styleable.TBLIndicatorView_uik_focusColor, this.mFocusColor);
            this.mUnfocusColor = obtainStyledAttributes.getColor(R.styleable.TBLIndicatorView_uik_unfocusColor, this.mUnfocusColor);
            this.mStrokeColor = obtainStyledAttributes.getColor(R.styleable.TBLIndicatorView_uik_strokeColor, this.mStrokeColor);
            float dimension = obtainStyledAttributes.getDimension(R.styleable.TBLIndicatorView_uik_strokeWidth, this.mStrokeWidth);
            this.mStrokeWidth = dimension;
            this.mPaint.setStrokeWidth(dimension);
            this.mTotal = obtainStyledAttributes.getInt(R.styleable.TBLIndicatorView_uik_total, 1);
            this.mIndex = obtainStyledAttributes.getInt(R.styleable.TBLIndicatorView_uik_index, 0);
            judgeIndex();
            int applyDimension = (int) TypedValue.applyDimension(1, this.mRadius, context.getResources().getDisplayMetrics());
            this.mRadius = applyDimension;
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TBLIndicatorView_uik_indicatorRadius, applyDimension);
            this.mRadius = dimensionPixelSize;
            this.mDiameter = dimensionPixelSize * 2;
            int applyDimension2 = (int) TypedValue.applyDimension(1, this.mGapMargin, context.getResources().getDisplayMetrics());
            this.mGapMargin = applyDimension2;
            this.mGapMargin = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TBLIndicatorView_uik_gapMargin, applyDimension2);
            int i2 = this.mRadius * 2;
            this.mFocusWidth = i2;
            this.mFocusWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TBLIndicatorView_focusWidth, i2);
            obtainStyledAttributes.recycle();
        }
    }
}
