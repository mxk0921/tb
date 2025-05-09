package com.alipay.android.msp.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CustomProgressWheel extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object INIT_LOCK = new Object();
    private boolean linearProgress;
    private ProgressCallback oW;
    private int circleRadius = 105;
    private int barWidth = 10;
    private int rimWidth = 10;
    private final int barLength = 16;
    private final int oG = 270;
    private boolean fillRadius = false;
    private double oH = 500.0d;
    private double oI = 460.0d;
    private float oJ = 0.0f;
    private boolean oK = true;
    private long oL = 210;
    private final long oM = 200;
    private int barColor = Color.parseColor("#108ee9");
    private int rimColor = 16777215;
    private Paint oN = new Paint();
    private Paint oO = new Paint();
    private RectF oP = new RectF();
    private float spinSpeed = 230.0f;
    private long oQ = 0;
    private float mProgress = 0.0f;
    private float mTargetProgress = 0.0f;
    private boolean isSpinning = false;
    private int oR = 64;
    private float oS = 0.0f;
    private float oT = 0.1f;
    private boolean oU = false;
    private boolean oV = false;
    private boolean isRunning = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ProgressCallback {
        void onProgressUpdate(float f);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class WheelSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<WheelSavedState> CREATOR = new Parcelable.Creator<WheelSavedState>() { // from class: com.alipay.android.msp.ui.widget.CustomProgressWheel.WheelSavedState.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WheelSavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (WheelSavedState) ipChange.ipc$dispatch("7e98099c", new Object[]{this, parcel}) : new WheelSavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WheelSavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (WheelSavedState[]) ipChange.ipc$dispatch("23ec99c5", new Object[]{this, new Integer(i)}) : new WheelSavedState[i];
            }
        };
        int barColor;
        int barWidth;
        int circleRadius;
        boolean fillRadius;
        boolean isSpinning;
        boolean linearProgress;
        float mProgress;
        float mTargetProgress;
        int rimColor;
        int rimWidth;
        float spinSpeed;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.mProgress);
            parcel.writeFloat(this.mTargetProgress);
            parcel.writeByte(this.isSpinning ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.spinSpeed);
            parcel.writeInt(this.barWidth);
            parcel.writeInt(this.barColor);
            parcel.writeInt(this.rimWidth);
            parcel.writeInt(this.rimColor);
            parcel.writeInt(this.circleRadius);
            parcel.writeByte(this.linearProgress ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.fillRadius ? (byte) 1 : (byte) 0);
        }

        public WheelSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private WheelSavedState(Parcel parcel) {
            super(parcel);
            this.mProgress = parcel.readFloat();
            this.mTargetProgress = parcel.readFloat();
            boolean z = false;
            this.isSpinning = parcel.readByte() != 0;
            this.spinSpeed = parcel.readFloat();
            this.barWidth = parcel.readInt();
            this.barColor = parcel.readInt();
            this.rimWidth = parcel.readInt();
            this.rimColor = parcel.readInt();
            this.circleRadius = parcel.readInt();
            this.linearProgress = parcel.readByte() != 0;
            this.fillRadius = parcel.readByte() != 0 ? true : z;
        }
    }

    public CustomProgressWheel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb7c9b5", new Object[]{this});
        } else if (this.oW != null) {
            this.oW.onProgressUpdate(Math.round((this.mProgress * 100.0f) / 360.0f) / 100.0f);
        }
    }

    public static /* synthetic */ Object ipc$super(CustomProgressWheel customProgressWheel, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/CustomProgressWheel");
        }
    }

    private void setupPaints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd358439", new Object[]{this});
            return;
        }
        this.oN.setColor(this.barColor);
        this.oN.setAntiAlias(true);
        Paint paint = this.oN;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.oN.setStrokeWidth(this.barWidth);
        this.oN.setStrokeCap(Paint.Cap.ROUND);
        this.oO.setColor(this.rimColor);
        this.oO.setAntiAlias(true);
        this.oO.setStyle(style);
        this.oO.setStrokeWidth(this.rimWidth);
    }

    public void beginDrawTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7304e451", new Object[]{this});
            return;
        }
        this.oU = true;
        this.oV = false;
        this.oS = 0.0f;
        invalidate();
    }

    public int getBarColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73c26600", new Object[]{this})).intValue();
        }
        return this.barColor;
    }

    public int getBarWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa9d7ae3", new Object[]{this})).intValue();
        }
        return this.barWidth;
    }

    public int getCircleRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec49472", new Object[]{this})).intValue();
        }
        return this.circleRadius;
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        if (this.isSpinning) {
            return -1.0f;
        }
        return this.mProgress / 360.0f;
    }

    public int getRimColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0931c5d", new Object[]{this})).intValue();
        }
        return this.rimColor;
    }

    public int getRimWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("576e3140", new Object[]{this})).intValue();
        }
        return this.rimWidth;
    }

    public float getSpinSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ec91766", new Object[]{this})).floatValue();
        }
        return this.spinSpeed / 360.0f;
    }

    public boolean isSpinning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69a72bcb", new Object[]{this})).booleanValue();
        }
        return this.isSpinning;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        synchronized (INIT_LOCK) {
            try {
                if (this.isRunning) {
                    this.oR = (int) (this.oP.width() / 1.6d);
                    boolean z2 = this.oU;
                    float f4 = 0.0f;
                    if (z2 && !this.oV) {
                        float centerX = this.oP.centerX();
                        float centerY = this.oP.centerY();
                        canvas.drawArc(this.oP, 360.0f, 360.0f, false, this.oN);
                        int i = this.oR;
                        float f5 = this.oS;
                        canvas.drawLine(centerX - (i / 2), centerY + (i / 6), (centerX - (i / 2)) + ((i / 3) * f5), centerY + (i / 6) + ((i / 3) * f5), this.oN);
                        float f6 = this.oS + this.oT;
                        this.oS = f6;
                        if (f6 >= 1.0f) {
                            this.oS = 0.0f;
                            this.oV = true;
                        }
                    } else if (z2) {
                        float centerX2 = this.oP.centerX();
                        float centerY2 = this.oP.centerY();
                        canvas.drawArc(this.oP, 360.0f, 360.0f, false, this.oN);
                        int i2 = this.oR;
                        canvas.drawLine(centerX2 - (i2 / 2), centerY2 + (i2 / 6), centerX2 - (i2 / 6), centerY2 + (i2 / 2), this.oN);
                        int i3 = this.oR;
                        float f7 = this.oS;
                        canvas.drawLine(centerX2 - (i3 / 6), centerY2 + (i3 / 2), (centerX2 - (i3 / 6)) + (((i3 * 7) / 12) * f7), (centerY2 + (i3 / 2)) - (((i3 * 3) / 4) * f7), this.oN);
                        float f8 = this.oS + this.oT;
                        this.oS = f8;
                        if (f8 >= 1.0f) {
                            this.oS = 1.0f;
                        }
                    } else {
                        canvas.drawArc(this.oP, 360.0f, 360.0f, false, this.oO);
                        if (this.isSpinning) {
                            long uptimeMillis = SystemClock.uptimeMillis() - this.oQ;
                            float f9 = (((float) uptimeMillis) * this.spinSpeed) / 1000.0f;
                            long j = this.oL;
                            if (j >= 200) {
                                double d = this.oH + uptimeMillis;
                                this.oH = d;
                                double d2 = this.oI;
                                if (d > d2) {
                                    this.oH = d - d2;
                                    this.oL = 0L;
                                    this.oK = !this.oK;
                                }
                                float cos = (((float) Math.cos(((this.oH / d2) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                                if (this.oK) {
                                    this.oJ = cos * 254.0f;
                                } else {
                                    float f10 = (1.0f - cos) * 254.0f;
                                    this.mProgress += this.oJ - f10;
                                    this.oJ = f10;
                                }
                            } else {
                                this.oL = j + uptimeMillis;
                            }
                            float f11 = this.mProgress + f9;
                            this.mProgress = f11;
                            if (f11 > 360.0f) {
                                this.mProgress = f11 - 360.0f;
                                ProgressCallback progressCallback = this.oW;
                                if (progressCallback != null) {
                                    progressCallback.onProgressUpdate(-1.0f);
                                }
                            }
                            this.oQ = SystemClock.uptimeMillis();
                            float f12 = this.mProgress - 90.0f;
                            float f13 = this.oJ + 16.0f;
                            if (isInEditMode()) {
                                f3 = 0.0f;
                                f2 = 135.0f;
                            } else {
                                f3 = f12;
                                f2 = f13;
                            }
                            canvas.drawArc(this.oP, f3, f2, false, this.oN);
                        } else {
                            float f14 = this.mProgress;
                            if (f14 != this.mTargetProgress) {
                                this.mProgress = Math.min(this.mProgress + ((((float) (SystemClock.uptimeMillis() - this.oQ)) / 1000.0f) * this.spinSpeed), this.mTargetProgress);
                                this.oQ = SystemClock.uptimeMillis();
                            } else {
                                z = false;
                            }
                            if (f14 != this.mProgress) {
                                ao();
                            }
                            float f15 = this.mProgress;
                            if (!this.linearProgress) {
                                f4 = ((float) (1.0d - Math.pow(1.0f - (f15 / 360.0f), 4.0d))) * 360.0f;
                                f15 = ((float) (1.0d - Math.pow(1.0f - (this.mProgress / 360.0f), 2.0d))) * 360.0f;
                            }
                            if (isInEditMode()) {
                                f = 360.0f;
                            } else {
                                f = f15;
                            }
                            canvas.drawArc(this.oP, f4 - 90.0f, f, false, this.oN);
                        }
                    }
                    if (z) {
                        invalidate();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int paddingLeft = (this.circleRadius * 2) + getPaddingLeft() + getPaddingRight();
        int paddingTop = (this.circleRadius * 2) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingLeft = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (!(parcelable instanceof WheelSavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            WheelSavedState wheelSavedState = (WheelSavedState) parcelable;
            super.onRestoreInstanceState(wheelSavedState.getSuperState());
            this.mProgress = wheelSavedState.mProgress;
            this.mTargetProgress = wheelSavedState.mTargetProgress;
            this.isSpinning = wheelSavedState.isSpinning;
            this.spinSpeed = wheelSavedState.spinSpeed;
            this.barWidth = wheelSavedState.barWidth;
            this.barColor = wheelSavedState.barColor;
            this.rimWidth = wheelSavedState.rimWidth;
            this.rimColor = wheelSavedState.rimColor;
            this.circleRadius = wheelSavedState.circleRadius;
            this.linearProgress = wheelSavedState.linearProgress;
            this.fillRadius = wheelSavedState.fillRadius;
            this.oQ = SystemClock.uptimeMillis();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        WheelSavedState wheelSavedState = new WheelSavedState(super.onSaveInstanceState());
        wheelSavedState.mProgress = this.mProgress;
        wheelSavedState.mTargetProgress = this.mTargetProgress;
        wheelSavedState.isSpinning = this.isSpinning;
        wheelSavedState.spinSpeed = this.spinSpeed;
        wheelSavedState.barWidth = this.barWidth;
        wheelSavedState.barColor = this.barColor;
        wheelSavedState.rimWidth = this.rimWidth;
        wheelSavedState.rimColor = this.rimColor;
        wheelSavedState.circleRadius = this.circleRadius;
        wheelSavedState.linearProgress = this.linearProgress;
        wheelSavedState.fillRadius = this.fillRadius;
        return wheelSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (!this.fillRadius) {
            int i5 = (i - paddingLeft) - paddingRight;
            int min = Math.min(Math.min(i5, (i2 - paddingBottom) - paddingTop), (this.circleRadius * 2) - (this.barWidth * 2));
            int i6 = ((i5 - min) / 2) + paddingLeft;
            int i7 = ((((i2 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i8 = this.barWidth;
            this.oP = new RectF(i6 + i8, i7 + i8, (i6 + min) - i8, (i7 + min) - i8);
        } else {
            int i9 = this.barWidth;
            this.oP = new RectF(paddingLeft + i9, paddingTop + i9, (i - paddingRight) - i9, (i2 - paddingBottom) - i9);
        }
        setupPaints();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.oQ = SystemClock.uptimeMillis();
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        synchronized (INIT_LOCK) {
            this.isRunning = false;
            this.oH = 500.0d;
            this.oJ = 0.0f;
            this.oK = true;
            this.oL = 210L;
            this.oQ = 0L;
            this.mProgress = 0.0f;
            this.mTargetProgress = 0.0f;
        }
    }

    public void resetCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab64187", new Object[]{this});
            return;
        }
        this.mProgress = 0.0f;
        this.mTargetProgress = 0.0f;
        invalidate();
    }

    public void setBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9761350a", new Object[]{this, new Integer(i)});
            return;
        }
        this.barColor = i;
        setupPaints();
        if (!this.isSpinning) {
            invalidate();
        }
    }

    public void setBarWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe8bc87", new Object[]{this, new Integer(i)});
            return;
        }
        this.barWidth = i;
        if (!this.isSpinning) {
            invalidate();
        }
    }

    public void setCallback(ProgressCallback progressCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e523a86e", new Object[]{this, progressCallback});
            return;
        }
        this.oW = progressCallback;
        if (!this.isSpinning) {
            ao();
        }
    }

    public void setCircleRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5647ad8", new Object[]{this, new Integer(i)});
            return;
        }
        this.circleRadius = i;
        if (!this.isSpinning) {
            invalidate();
        }
    }

    public void setInstantProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9c512d", new Object[]{this, new Float(f)});
            return;
        }
        if (this.isSpinning) {
            this.mProgress = 0.0f;
            this.isSpinning = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.mTargetProgress) {
            float min = Math.min(f * 360.0f, 360.0f);
            this.mTargetProgress = min;
            this.mProgress = min;
            this.oQ = SystemClock.uptimeMillis();
            invalidate();
        }
    }

    public void setLinearProgress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf61239", new Object[]{this, new Boolean(z)});
            return;
        }
        this.linearProgress = z;
        if (!this.isSpinning) {
            invalidate();
        }
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        if (this.isSpinning) {
            this.mProgress = 0.0f;
            this.isSpinning = false;
            ao();
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.mTargetProgress;
        if (f != f2) {
            if (this.mProgress == f2) {
                this.oQ = SystemClock.uptimeMillis();
            }
            this.mTargetProgress = Math.min(f * 360.0f, 360.0f);
            invalidate();
        }
    }

    public void setRimColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a74a4d", new Object[]{this, new Integer(i)});
            return;
        }
        this.rimColor = i;
        setupPaints();
        if (!this.isSpinning) {
            invalidate();
        }
    }

    public void setRimWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292ed1ca", new Object[]{this, new Integer(i)});
            return;
        }
        this.rimWidth = i;
        if (!this.isSpinning) {
            invalidate();
        }
    }

    public void setSpinSpeed(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4250a716", new Object[]{this, new Float(f)});
        } else {
            this.spinSpeed = f * 360.0f;
        }
    }

    public void spin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88318bc9", new Object[]{this});
            return;
        }
        this.oQ = SystemClock.uptimeMillis();
        this.isSpinning = true;
        invalidate();
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        synchronized (INIT_LOCK) {
            this.isRunning = true;
        }
    }

    public void stopSpinning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f543a29f", new Object[]{this});
            return;
        }
        this.isSpinning = false;
        this.mProgress = 0.0f;
        this.mTargetProgress = 0.0f;
        invalidate();
    }

    public CustomProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomProgressWheel(Context context) {
        super(context);
    }
}
