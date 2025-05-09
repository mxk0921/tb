package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ir2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TNodeIndicatorView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int indicatorCount;
    private int mDiameter;
    private int mFocusColor;
    private int mFocusIndex;
    private int mGapMargin;
    private int mIndex;
    private int mLastIndex;
    private Paint mPaint;
    private int mRadius;
    private int mStrokeColor;
    public float mStrokeWidth;
    private int mTotal;
    private int mUnfocusColor;
    private boolean minScaleFirst;
    private boolean minScaleLast;
    private boolean newControl;
    private float minScale = 1.0f;
    private boolean firstTime = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12391a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;

        static {
            t2o.a(503317499);
        }

        public a(int i, int i2, int i3, boolean z, boolean z2) {
            this.f12391a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
            this.e = z2;
        }
    }

    static {
        t2o.a(503317498);
    }

    public TNodeIndicatorView(Context context) {
        super(context);
        init(context, null);
    }

    private void computeFocusIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee6da78", new Object[]{this});
        } else if (this.newControl) {
            int i = this.mIndex;
            if (i > this.mLastIndex) {
                int i2 = this.mFocusIndex;
                int i3 = this.indicatorCount;
                if (i2 == i3 - 2) {
                    if (i == this.mTotal - 1) {
                        this.mFocusIndex = i2 + 1;
                    }
                } else if (i2 < i3 - 2) {
                    this.mFocusIndex = i2 + 1;
                }
                if (!this.minScaleFirst && i >= i3 - 1) {
                    this.minScaleFirst = true;
                }
                if (this.minScaleLast && i >= this.mTotal - 2) {
                    this.minScaleLast = false;
                    return;
                }
                return;
            }
            int i4 = this.mFocusIndex;
            if (i4 > 1) {
                this.mFocusIndex = i4 - 1;
            } else if (i4 == 1 && i == 0) {
                this.mFocusIndex = i4 - 1;
            }
            if (this.minScaleFirst && i <= 1) {
                this.minScaleFirst = false;
            }
            if (!this.minScaleLast && i < this.mTotal - (this.indicatorCount - 1)) {
                this.minScaleLast = true;
            }
        }
    }

    private int getDesiredHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfe33a5", new Object[]{this})).intValue();
        }
        return this.mDiameter + getPaddingTop() + getPaddingBottom();
    }

    private int getDesiredWidth() {
        int paddingLeft;
        int paddingRight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f17153c", new Object[]{this})).intValue();
        }
        if (this.newControl) {
            int i = this.indicatorCount;
            paddingLeft = (this.mDiameter * i) + ((i - 1) * this.mGapMargin) + getPaddingLeft();
            paddingRight = getPaddingRight();
        } else {
            int i2 = this.mTotal;
            paddingLeft = (this.mDiameter * i2) + ((i2 - 1) * this.mGapMargin) + getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return paddingLeft + paddingRight;
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        this.mTotal = 1;
        this.mIndex = 0;
        this.mFocusColor = ir2.i(context, 1, "#ff5000");
        this.mUnfocusColor = ir2.i(context, 1, "#7fffffff");
        this.mStrokeColor = ir2.i(context, 1, "#7f666666");
        this.mRadius = 4;
        this.mGapMargin = 8;
        this.mStrokeWidth = 1.0f;
        this.mDiameter = (4 + ((int) 1.0f)) * 2;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
    }

    public static /* synthetic */ Object ipc$super(TNodeIndicatorView tNodeIndicatorView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/view/TNodeIndicatorView");
        }
    }

    private boolean isMinScaleIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff6450d0", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            return this.minScaleFirst;
        }
        if (i == this.indicatorCount - 1) {
            return this.minScaleLast;
        }
        return false;
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

    public a getCurrentIndicatorStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e5cf1e24", new Object[]{this});
        }
        return new a(this.mIndex, this.mLastIndex, this.mFocusIndex, this.minScaleFirst, this.minScaleLast);
    }

    public int getGapMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeb296e8", new Object[]{this})).intValue();
        }
        return this.mGapMargin;
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.mIndex;
    }

    public int getTotal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcf28f08", new Object[]{this})).intValue();
        }
        return this.mTotal;
    }

    public void initWithIndicatorStatus(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9bbda5", new Object[]{this, aVar});
            return;
        }
        this.mIndex = aVar.f12391a;
        this.mLastIndex = aVar.b;
        this.mFocusIndex = aVar.c;
        this.minScaleFirst = aVar.d;
        this.minScaleLast = aVar.e;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        canvas.drawColor(0);
        if (this.mTotal > 1) {
            int paddingTop = this.mRadius + ((int) this.mStrokeWidth) + getPaddingTop();
            int measuredWidth = ((getMeasuredWidth() - getDesiredWidth()) / 2) + getPaddingLeft() + this.mRadius + ((int) this.mStrokeWidth);
            if (this.newControl) {
                while (i < this.indicatorCount) {
                    boolean isMinScaleIndex = isMinScaleIndex(i);
                    this.mPaint.setColor(this.mStrokeColor);
                    Paint paint = this.mPaint;
                    Paint.Style style = Paint.Style.FILL;
                    paint.setStyle(style);
                    if (isMinScaleIndex) {
                        canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, paddingTop, (this.mRadius * this.minScale) + this.mStrokeWidth, this.mPaint);
                    } else {
                        canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, paddingTop, this.mRadius + this.mStrokeWidth, this.mPaint);
                    }
                    if (i == this.mFocusIndex) {
                        this.mPaint.setColor(this.mFocusColor);
                        this.mPaint.setStyle(style);
                        canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, paddingTop, this.mRadius, this.mPaint);
                    } else {
                        this.mPaint.setColor(this.mUnfocusColor);
                        this.mPaint.setStyle(style);
                        if (isMinScaleIndex) {
                            canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, paddingTop, this.mRadius * this.minScale, this.mPaint);
                        } else {
                            canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, paddingTop, this.mRadius, this.mPaint);
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < this.mTotal) {
                this.mPaint.setColor(this.mStrokeColor);
                Paint paint2 = this.mPaint;
                Paint.Style style2 = Paint.Style.FILL;
                paint2.setStyle(style2);
                float f = paddingTop;
                canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, f, this.mRadius + this.mStrokeWidth, this.mPaint);
                if (i == this.mIndex) {
                    this.mPaint.setColor(this.mFocusColor);
                    this.mPaint.setStyle(style2);
                    canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, f, this.mRadius, this.mPaint);
                } else {
                    this.mPaint.setColor(this.mUnfocusColor);
                    this.mPaint.setStyle(style2);
                    canvas.drawCircle(((this.mDiameter + this.mGapMargin) * i) + measuredWidth, f, this.mRadius, this.mPaint);
                }
                i++;
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
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

    public void setBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738a7ba7", new Object[]{this, new Integer(i)});
        } else {
            this.mStrokeColor = i;
        }
    }

    public void setBorderWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c811f7e1", new Object[]{this, new Float(f)});
        } else {
            this.mStrokeWidth = f;
        }
    }

    public void setFocusColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c42e40f", new Object[]{this, new Integer(i)});
        } else {
            this.mFocusColor = i;
        }
    }

    public void setGapMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9722ba", new Object[]{this, new Integer(i)});
        } else {
            this.mGapMargin = i;
        }
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mIndex;
        if (i != i2) {
            this.mLastIndex = i2;
            this.mIndex = i;
            computeFocusIndex();
            judgeIndex();
            invalidate();
        }
    }

    public void setNewControlParams(boolean z, int i, float f) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed7a565", new Object[]{this, new Boolean(z), new Integer(i), new Float(f)});
            return;
        }
        int i2 = this.mTotal;
        if (i < i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.newControl = z2 & z;
        int min = Math.min(i, i2);
        this.indicatorCount = min;
        this.minScale = f;
        if (this.firstTime) {
            this.firstTime = false;
            if (z && this.mIndex < this.mTotal - (min - 1)) {
                this.minScaleLast = true;
            }
        }
    }

    public void setRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fd848", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRadius = i;
        this.mDiameter = (i * 2) + (((int) this.mStrokeWidth) * 2);
    }

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

    public void setUnfocusColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a24d8d6", new Object[]{this, new Integer(i)});
        } else {
            this.mUnfocusColor = i;
        }
    }

    public TNodeIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public TNodeIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
