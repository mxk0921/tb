package com.taobao.message.uikit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.why;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SectorProgressWheel extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint bgPaint;
    private Paint circlePaint;
    private Paint fgPaint;
    private int gapPixel;
    private RectF oval;
    private RectF ovalOutside;
    private int bgColor = Color.parseColor("#10000000");
    private int fgColor = Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR);
    private int circleColor = Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR);
    private float percent = 0.0f;
    private float startAngle = 270.0f;

    static {
        t2o.a(552599741);
    }

    public SectorProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gapPixel = 2;
        this.gapPixel = dip2px(context, this.gapPixel);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        Paint paint = new Paint();
        this.bgPaint = paint;
        paint.setColor(this.bgColor);
        Paint paint2 = new Paint();
        this.fgPaint = paint2;
        paint2.setColor(this.fgColor);
        this.fgPaint.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.circlePaint = paint3;
        paint3.setColor(this.circleColor);
        this.circlePaint.setAntiAlias(true);
        this.circlePaint.setFilterBitmap(true);
        this.circlePaint.setFlags(1);
        this.circlePaint.setStyle(Paint.Style.STROKE);
        this.circlePaint.setStrokeWidth(this.gapPixel);
    }

    public static /* synthetic */ Object ipc$super(SectorProgressWheel sectorProgressWheel, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/message/uikit/widget/SectorProgressWheel");
        }
    }

    private void refreshTheLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c6b6e7", new Object[]{this});
            return;
        }
        invalidate();
        requestLayout();
    }

    public int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{this, context, new Float(f)})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int getBgColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1061a262", new Object[]{this})).intValue();
        }
        return this.bgColor;
    }

    public int getFgColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63f46d66", new Object[]{this})).intValue();
        }
        return this.fgColor;
    }

    public float getPercent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("326e8506", new Object[]{this})).floatValue();
        }
        return this.percent;
    }

    public float getStartAngle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0ba527e", new Object[]{this})).floatValue();
        }
        return this.startAngle;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawArc(this.ovalOutside, 0.0f, 360.0f, true, this.bgPaint);
        canvas.drawArc(this.ovalOutside, 0.0f, 360.0f, false, this.circlePaint);
        canvas.drawArc(this.oval, this.startAngle, 3.6f * this.percent, true, this.fgPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        float paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        float paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        this.ovalOutside = new RectF(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + paddingLeft, getPaddingTop() + paddingBottom);
        this.oval = new RectF(getPaddingLeft() + this.gapPixel, getPaddingTop() + this.gapPixel, (getPaddingLeft() + paddingLeft) - this.gapPixel, (getPaddingTop() + paddingBottom) - this.gapPixel);
    }

    public void setBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321c1980", new Object[]{this, new Integer(i)});
            return;
        }
        this.bgColor = i;
        refreshTheLayout();
    }

    public void setFgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e2aefc", new Object[]{this, new Integer(i)});
            return;
        }
        this.fgColor = i;
        refreshTheLayout();
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        this.percent = f;
        invalidate();
    }

    public void setStartAngle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d670066", new Object[]{this, new Float(f)});
            return;
        }
        this.startAngle = f + 270.0f;
        invalidate();
        requestLayout();
    }
}
