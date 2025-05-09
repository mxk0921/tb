package com.taobao.android.dressup.common.view.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.bmv;
import tb.ckf;
import tb.iiz;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u0017J\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\u0017J\u001f\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u001a¢\u0006\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00100R\u0016\u00105\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00100R\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00100R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00100R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00100R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00100R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00100R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00100R\"\u0010<\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00100\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0016\u0010\u0018\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010@R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0016\u0010A\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010B\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u0016\u0010C\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010@R\u0014\u0010E\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010>R\u0014\u0010G\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010>R$\u0010H\u001a\u00020\t2\u0006\u0010H\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010>\"\u0004\bJ\u0010\u0017R$\u0010K\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010>\"\u0004\bM\u0010\u0017¨\u0006N"}, d2 = {"Lcom/taobao/android/dressup/common/view/indicator/IndicatorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltb/xhv;", "init", "()V", "computeFocusIndex", "judgeIndex", bmv.MSGTYPE_INTERVAL, "", "isMinScaleIndex", "(I)Z", "radius", "setRadius", "(I)V", "newControl", "indicatorCount", "", "minScale", "setNewControlParams", "(ZIF)V", "focusColor", "setFocusColor", "unfocusColor", "setUnfocusColor", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "width", "setBorderWidth", "(F)V", "mStrokeWidth", UTConstant.Args.UT_SUCCESS_F, "mStrokeColor", TLogTracker.LEVEL_INFO, "Landroid/graphics/Paint;", "mPaint", "Landroid/graphics/Paint;", "mTotal", "mIndex", "mLastIndex", "mFocusIndex", "mFocusColor", "mUnfocusColor", "mRadius", "mDiameter", "gapMargin", "getGapMargin", "()I", "setGapMargin", "Z", "minScaleFirst", "minScaleLast", "firstTime", "getDesiredHeight", "desiredHeight", "getDesiredWidth", "desiredWidth", iiz.PERF_STAG_TOTAL, "getTotal", "setTotal", "index", "getIndex", "setIndex", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class IndicatorView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int gapMargin;
    private int indicatorCount;
    private int mDiameter;
    private int mFocusColor;
    private int mFocusIndex;
    private int mIndex;
    private int mLastIndex;
    private Paint mPaint;
    private int mRadius;
    private int mStrokeColor;
    private float mStrokeWidth;
    private int mTotal;
    private int mUnfocusColor;
    private boolean minScaleFirst;
    private boolean minScaleLast;
    private boolean newControl;
    private float minScale = 1.0f;
    private boolean firstTime = true;

    static {
        t2o.a(918552780);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorView(Context context) {
        super(context);
        ckf.g(context, "context");
        init();
    }

    private final void computeFocusIndex() {
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
                this.mFocusIndex = 0;
            }
            if (this.minScaleFirst && i <= 1) {
                this.minScaleFirst = false;
            }
            if (!this.minScaleLast && i < this.mTotal - (this.indicatorCount - 1)) {
                this.minScaleLast = true;
            }
        }
    }

    private final int getDesiredHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfe33a5", new Object[]{this})).intValue();
        }
        return this.mDiameter + getPaddingTop() + getPaddingBottom();
    }

    private final int getDesiredWidth() {
        int paddingLeft;
        int paddingRight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f17153c", new Object[]{this})).intValue();
        }
        if (this.newControl) {
            int i = this.indicatorCount;
            paddingLeft = (this.mDiameter * i) + ((i - 1) * this.gapMargin) + getPaddingLeft();
            paddingRight = getPaddingRight();
        } else {
            int i2 = this.mTotal;
            paddingLeft = (this.mDiameter * i2) + ((i2 - 1) * this.gapMargin) + getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return paddingLeft + paddingRight;
    }

    private final void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mTotal = 1;
        this.mIndex = 0;
        this.mFocusColor = Color.parseColor("#ff5000");
        this.mUnfocusColor = Color.parseColor("#7fffffff");
        this.mStrokeColor = Color.parseColor("#7f666666");
        this.mRadius = 4;
        this.gapMargin = 8;
        this.mStrokeWidth = 1.0f;
        this.mDiameter = (4 + ((int) 1.0f)) * 2;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
    }

    public static /* synthetic */ Object ipc$super(IndicatorView indicatorView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/indicator/IndicatorView");
    }

    private final boolean isMinScaleIndex(int i) {
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

    private final void judgeIndex() {
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

    public final int getGapMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeb296e8", new Object[]{this})).intValue();
        }
        return this.gapMargin;
    }

    public final int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.mIndex;
    }

    public final int getTotal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcf28f08", new Object[]{this})).intValue();
        }
        return this.mTotal;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        canvas.drawColor(0);
        if (this.mTotal > 1) {
            int paddingTop = this.mRadius + ((int) this.mStrokeWidth) + getPaddingTop();
            int measuredWidth = ((getMeasuredWidth() - getDesiredWidth()) / 2) + getPaddingLeft() + this.mRadius + ((int) this.mStrokeWidth);
            if (this.newControl) {
                int i2 = this.indicatorCount;
                while (i < i2) {
                    boolean isMinScaleIndex = isMinScaleIndex(i);
                    Paint paint = this.mPaint;
                    ckf.d(paint);
                    paint.setColor(this.mStrokeColor);
                    Paint paint2 = this.mPaint;
                    ckf.d(paint2);
                    Paint.Style style = Paint.Style.FILL;
                    paint2.setStyle(style);
                    if (isMinScaleIndex) {
                        float f = (this.mRadius * this.minScale) + this.mStrokeWidth;
                        Paint paint3 = this.mPaint;
                        ckf.d(paint3);
                        canvas.drawCircle(((this.mDiameter + this.gapMargin) * i) + measuredWidth, paddingTop, f, paint3);
                    } else {
                        float f2 = this.mRadius + this.mStrokeWidth;
                        Paint paint4 = this.mPaint;
                        ckf.d(paint4);
                        canvas.drawCircle(((this.mDiameter + this.gapMargin) * i) + measuredWidth, paddingTop, f2, paint4);
                    }
                    if (i == this.mFocusIndex) {
                        Paint paint5 = this.mPaint;
                        ckf.d(paint5);
                        paint5.setColor(this.mFocusColor);
                        Paint paint6 = this.mPaint;
                        ckf.d(paint6);
                        paint6.setStyle(style);
                        Paint paint7 = this.mPaint;
                        ckf.d(paint7);
                        canvas.drawCircle(((this.mDiameter + this.gapMargin) * i) + measuredWidth, paddingTop, this.mRadius, paint7);
                    } else {
                        Paint paint8 = this.mPaint;
                        ckf.d(paint8);
                        paint8.setColor(this.mUnfocusColor);
                        Paint paint9 = this.mPaint;
                        ckf.d(paint9);
                        paint9.setStyle(style);
                        if (isMinScaleIndex) {
                            float f3 = this.mRadius * this.minScale;
                            Paint paint10 = this.mPaint;
                            ckf.d(paint10);
                            canvas.drawCircle(((this.mDiameter + this.gapMargin) * i) + measuredWidth, paddingTop, f3, paint10);
                        } else {
                            Paint paint11 = this.mPaint;
                            ckf.d(paint11);
                            canvas.drawCircle(((this.mDiameter + this.gapMargin) * i) + measuredWidth, paddingTop, this.mRadius, paint11);
                        }
                    }
                    i++;
                }
                return;
            }
            int i3 = this.mTotal;
            while (i < i3) {
                Paint paint12 = this.mPaint;
                ckf.d(paint12);
                paint12.setColor(this.mStrokeColor);
                Paint paint13 = this.mPaint;
                ckf.d(paint13);
                Paint.Style style2 = Paint.Style.FILL;
                paint13.setStyle(style2);
                float f4 = paddingTop;
                float f5 = this.mRadius + this.mStrokeWidth;
                Paint paint14 = this.mPaint;
                ckf.d(paint14);
                canvas.drawCircle(((this.mDiameter + this.gapMargin) * i) + measuredWidth, f4, f5, paint14);
                if (i == this.mIndex) {
                    Paint paint15 = this.mPaint;
                    ckf.d(paint15);
                    paint15.setColor(this.mFocusColor);
                    Paint paint16 = this.mPaint;
                    ckf.d(paint16);
                    paint16.setStyle(style2);
                    Paint paint17 = this.mPaint;
                    ckf.d(paint17);
                    canvas.drawCircle(((this.mDiameter + this.gapMargin) * i) + measuredWidth, f4, this.mRadius, paint17);
                } else {
                    Paint paint18 = this.mPaint;
                    ckf.d(paint18);
                    paint18.setColor(this.mUnfocusColor);
                    Paint paint19 = this.mPaint;
                    ckf.d(paint19);
                    paint19.setStyle(style2);
                    Paint paint20 = this.mPaint;
                    ckf.d(paint20);
                    canvas.drawCircle(((this.mDiameter + this.gapMargin) * i) + measuredWidth, f4, this.mRadius, paint20);
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dressup.common.view.indicator.IndicatorView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0022
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r10)
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r2 = 0
            r10[r2] = r8
            r2 = 1
            r10[r2] = r1
            r1 = 2
            r10[r1] = r9
            java.lang.String r9 = "26cb6a66"
            r0.ipc$dispatch(r9, r10)
            return
        L_0x0022:
            super.onMeasure(r9, r10)
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            int r1 = android.view.View.MeasureSpec.getMode(r10)
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            int r10 = android.view.View.MeasureSpec.getSize(r10)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r3) goto L_0x0047
            int r0 = r8.getDesiredWidth()
            double r4 = (double) r0
            double r6 = (double) r9
            double r4 = java.lang.Math.max(r4, r6)
        L_0x0045:
            int r9 = (int) r4
            goto L_0x0055
        L_0x0047:
            int r4 = r8.getDesiredWidth()
            if (r0 != r2) goto L_0x0054
            double r4 = (double) r4
            double r6 = (double) r9
            double r4 = java.lang.Math.min(r4, r6)
            goto L_0x0045
        L_0x0054:
            r9 = r4
        L_0x0055:
            if (r1 != r3) goto L_0x0063
            int r0 = r8.getDesiredHeight()
            double r0 = (double) r0
            double r2 = (double) r10
            double r0 = java.lang.Math.max(r0, r2)
        L_0x0061:
            int r10 = (int) r0
            goto L_0x0071
        L_0x0063:
            int r0 = r8.getDesiredHeight()
            if (r1 != r2) goto L_0x0070
            double r0 = (double) r0
            double r2 = (double) r10
            double r0 = java.lang.Math.min(r0, r2)
            goto L_0x0061
        L_0x0070:
            r10 = r0
        L_0x0071:
            r8.setMeasuredDimension(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dressup.common.view.indicator.IndicatorView.onMeasure(int, int):void");
    }

    public final void setBorderWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c811f7e1", new Object[]{this, new Float(f)});
        } else {
            this.mStrokeWidth = f;
        }
    }

    public final void setFocusColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c42e40f", new Object[]{this, new Integer(i)});
        } else {
            this.mFocusColor = i;
        }
    }

    public final void setGapMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9722ba", new Object[]{this, new Integer(i)});
        } else {
            this.gapMargin = i;
        }
    }

    public final void setIndex(int i) {
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

    public final void setNewControlParams(boolean z, int i, float f) {
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
        int min = (int) Math.min(i, i2);
        this.indicatorCount = min;
        this.minScale = f;
        if (this.firstTime) {
            this.firstTime = false;
            if (z && this.mIndex < this.mTotal - (min - 1)) {
                this.minScaleLast = true;
            }
        }
    }

    public final void setRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fd848", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRadius = i;
        this.mDiameter = (i * 2) + (((int) this.mStrokeWidth) * 2);
    }

    public final void setTotal(int i) {
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

    public final void setUnfocusColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a24d8d6", new Object[]{this, new Integer(i)});
        } else {
            this.mUnfocusColor = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        init();
    }
}
