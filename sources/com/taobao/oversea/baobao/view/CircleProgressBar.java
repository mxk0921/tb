package com.taobao.oversea.baobao.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CircleProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_MAX = 100;
    private static final int DEFAULT_START_DEGREE = -90;
    private static final float MAX_DEGREE = 360.0f;
    private float mAp;
    private int mBackgroundColor;
    private float mBadgeRadius;
    private Paint.Cap mCap;
    private float mCenterX;
    private float mCenterY;
    private float mProgress;
    private int mProgressBackgroundColor;
    private int mProgressColor;
    private float mProgressStrokeWidth;
    private int mStartDegree;
    private final RectF mProgressRectF = new RectF();
    private final RectF mBoundsRectF = new RectF();
    private final Paint mProgressPaint = new Paint(1);
    private final Paint mProgressBackgroundPaint = new Paint(1);
    private final Paint mBackgroundPaint = new Paint(1);
    private final Paint mBadgeBackPaint = new Paint(1);
    private float mMax = 100.0f;
    private float mNearMax = 95.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        float progress;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState) ipChange.ipc$dispatch("38ec0ece", new Object[]{this, parcel});
                }
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState[]) ipChange.ipc$dispatch("b771fc85", new Object[]{this, new Integer(i)});
                }
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.progress);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.progress = parcel.readFloat();
        }
    }

    public CircleProgressBar(Context context, float f) {
        super(context);
        this.mAp = f;
        init();
    }

    private int ap(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccf6ad3d", new Object[]{this, new Float(f)})).intValue();
        }
        return (int) (f * this.mAp);
    }

    private void drawProgress(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cb50cd", new Object[]{this, canvas});
            return;
        }
        int width = getWidth();
        float f = width / 2.0f;
        canvas.drawCircle(f, f, (width / 2) - this.mProgressStrokeWidth, this.mBackgroundPaint);
        canvas.drawArc(this.mProgressRectF, 0.0f, MAX_DEGREE, false, this.mProgressBackgroundPaint);
        canvas.drawArc(this.mProgressRectF, 0.0f, (this.mProgress * MAX_DEGREE) / this.mMax, false, this.mProgressPaint);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mCap = Paint.Cap.ROUND;
        this.mBadgeRadius = ap(9.0f);
        this.mProgressStrokeWidth = ap(4.8f);
        this.mProgressColor = -21504;
        this.mProgressBackgroundColor = -1570;
        this.mBackgroundColor = -1;
        this.mStartDegree = DEFAULT_START_DEGREE;
        Paint paint = this.mProgressPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.mProgressPaint.setStrokeWidth(this.mProgressStrokeWidth);
        this.mProgressPaint.setColor(this.mProgressColor);
        this.mProgressPaint.setStrokeCap(this.mCap);
        this.mProgressBackgroundPaint.setStyle(style);
        this.mProgressBackgroundPaint.setStrokeWidth(this.mProgressStrokeWidth);
        this.mProgressBackgroundPaint.setColor(this.mProgressBackgroundColor);
        this.mProgressBackgroundPaint.setStrokeCap(this.mCap);
        Paint paint2 = this.mBackgroundPaint;
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.mBackgroundPaint.setColor(this.mBackgroundColor);
        this.mBackgroundPaint.setShadowLayer(ap(4.0f), -ap(3.1f), 0.0f, 855638016);
        this.mBadgeBackPaint.setStyle(style2);
    }

    public static /* synthetic */ Object ipc$super(CircleProgressBar circleProgressBar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/CircleProgressBar");
        }
    }

    private void updateProgressShader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7dc0a2", new Object[]{this});
            return;
        }
        this.mProgressPaint.setShader(null);
        this.mProgressPaint.setColor(this.mProgressColor);
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        return this.mProgress;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.save();
        canvas.rotate(this.mStartDegree, this.mCenterX, this.mCenterY);
        drawProgress(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setProgress(savedState.progress);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.progress = this.mProgress;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.mBoundsRectF.left = getPaddingLeft();
        this.mBoundsRectF.top = getPaddingTop();
        this.mBoundsRectF.right = i - getPaddingRight();
        this.mBoundsRectF.bottom = i2 - getPaddingBottom();
        this.mCenterX = this.mBoundsRectF.centerX();
        this.mCenterY = this.mBoundsRectF.centerY();
        this.mProgressRectF.set(this.mBoundsRectF);
        updateProgressShader();
        RectF rectF = this.mProgressRectF;
        float f = this.mProgressStrokeWidth;
        rectF.inset(f / 2.0f, f / 2.0f);
    }

    public void setGray(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e26c68", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            this.mProgressPaint.setColorFilter(colorMatrixColorFilter);
            this.mProgressBackgroundPaint.setColorFilter(colorMatrixColorFilter);
            this.mBackgroundPaint.setColorFilter(colorMatrixColorFilter);
            this.mBadgeBackPaint.setColorFilter(colorMatrixColorFilter);
        } else {
            this.mProgressPaint.setColorFilter(null);
            this.mProgressBackgroundPaint.setColorFilter(null);
            this.mBackgroundPaint.setColorFilter(null);
            this.mBadgeBackPaint.setColorFilter(null);
        }
        invalidate();
    }

    public void setMax(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c102bb7", new Object[]{this, new Float(f)});
            return;
        }
        this.mMax = f;
        this.mNearMax = f * 0.95f;
        invalidate();
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        float f2 = this.mNearMax;
        if (f <= f2 || f >= this.mMax) {
            this.mProgress = f;
        } else {
            this.mProgress = f2;
        }
        invalidate();
    }

    public void setProgressBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1ecf6", new Object[]{this, new Integer(i)});
            return;
        }
        this.mProgressBackgroundColor = i;
        this.mProgressBackgroundPaint.setColor(i);
        invalidate();
    }

    public void setProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260e3e8", new Object[]{this, new Integer(i)});
            return;
        }
        this.mProgressColor = i;
        updateProgressShader();
        invalidate();
    }
}
