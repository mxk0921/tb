package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class IndicatorView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mRadius;
    private final Paint mRectPaint;
    private int mScrollBarThumbColor = -37590;
    private final RectF mScrollBarRectF = new RectF();
    private final RectF mIndicatorRectF = new RectF();

    static {
        t2o.a(486539417);
    }

    public IndicatorView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.mRectPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private float getRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue();
        }
        return this.mRadius;
    }

    public static /* synthetic */ Object ipc$super(IndicatorView indicatorView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/IndicatorView");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        float radius = getRadius();
        this.mRectPaint.setColor(Color.parseColor("#E6E6E6"));
        canvas.drawRoundRect(this.mScrollBarRectF, radius, radius, this.mRectPaint);
        this.mRectPaint.setColor(this.mScrollBarThumbColor);
        canvas.drawRoundRect(this.mIndicatorRectF, radius, radius, this.mRectPaint);
    }

    public void refreshScrollIndicator(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40bc2e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        float f = i4;
        this.mScrollBarRectF.set(0.0f, 0.0f, i3, f);
        this.mIndicatorRectF.set(i, 0.0f, i2, f);
        invalidate();
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            this.mRadius = f;
        }
    }

    public void setScrollBarThumbColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b627eb", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollBarThumbColor = i;
        }
    }
}
