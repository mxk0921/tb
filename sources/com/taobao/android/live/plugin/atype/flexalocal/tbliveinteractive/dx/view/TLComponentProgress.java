package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.dx.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TLComponentProgress extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RectF mARCRectF;
    private Paint mPaint;
    private Path mPath;
    private RectF mRectF;
    private double progress;
    private int progressColor;
    private int progressRadius;
    private int progressWidth;

    static {
        t2o.a(295699898);
    }

    public TLComponentProgress(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(TLComponentProgress tLComponentProgress, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/dx/view/TLComponentProgress");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.save();
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            this.mARCRectF.set(getLeft() - measuredWidth, getTop() - measuredHeight, getRight() + measuredWidth, getBottom() + measuredHeight);
            this.mPath.reset();
            this.mPath.addArc(this.mARCRectF, -90.0f, (float) this.progress);
            this.mPath.lineTo(measuredWidth, measuredHeight);
            this.mPath.close();
            canvas.clipPath(this.mPath);
            int i = this.progressWidth / 2;
            this.mRectF.set(getLeft() + i, getTop() + i, getRight() - i, getBottom() - i);
            this.mPaint.setStrokeWidth(this.progressWidth);
            this.mPaint.setColor(this.progressColor);
            RectF rectF = this.mRectF;
            int i2 = this.progressRadius;
            canvas.drawRoundRect(rectF, i2, i2, this.mPaint);
            canvas.restore();
        }
    }

    public void setProgress(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf02148", new Object[]{this, new Double(d)});
        } else {
            this.progress = d;
        }
    }

    public void setProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260e3e8", new Object[]{this, new Integer(i)});
        } else {
            this.progressColor = i;
        }
    }

    public void setProgressRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6a71db", new Object[]{this, new Integer(i)});
        } else {
            this.progressRadius = i;
        }
    }

    public void setProgressWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e86b65", new Object[]{this, new Integer(i)});
        } else {
            this.progressWidth = i;
        }
    }

    public TLComponentProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TLComponentProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.progress = vu3.b.GEO_NOT_SUPPORT;
        this.progressColor = -1996494010;
        this.progressRadius = 10;
        this.progressWidth = 2;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mRectF = new RectF();
        this.mPath = new Path();
        this.mARCRectF = new RectF();
    }
}
