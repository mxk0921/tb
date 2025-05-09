package com.taobao.tao.adapter.biz.plugins.watermask.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CircleProgressBar extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RectF mRectF;
    private Paint mRingPaintBg;
    private Paint ringPaintProgress;
    private int currentProgress = 0;
    private int progressStrokeWidth = 6;

    static {
        t2o.a(793772112);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(1, null);
        initVariable();
    }

    private void initVariable() {
        int argb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf25a33", new Object[]{this});
            return;
        }
        Paint paint = new Paint();
        this.ringPaintProgress = paint;
        paint.setAntiAlias(true);
        this.ringPaintProgress.setDither(true);
        this.ringPaintProgress.setColor(-1);
        Paint paint2 = this.ringPaintProgress;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.ringPaintProgress.setStrokeCap(Paint.Cap.ROUND);
        this.ringPaintProgress.setStrokeWidth(this.progressStrokeWidth);
        Paint paint3 = new Paint();
        this.mRingPaintBg = paint3;
        paint3.setAntiAlias(true);
        this.mRingPaintBg.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 26) {
            Paint paint4 = this.mRingPaintBg;
            argb = Color.argb(0.07f, 0.0f, 0.0f, 0.0f);
            paint4.setColor(argb);
        }
        this.mRingPaintBg.setStyle(style);
        this.mRingPaintBg.setStrokeWidth(this.progressStrokeWidth);
    }

    public static /* synthetic */ Object ipc$super(CircleProgressBar circleProgressBar, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/adapter/biz/plugins/watermask/view/CircleProgressBar");
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        if (this.mRectF == null) {
            int i = this.progressStrokeWidth;
            this.mRectF = new RectF(i, i, getWidth() - 6, getHeight() - 6);
        }
        if (this.currentProgress >= 0) {
            canvas.drawArc(this.mRectF, -90.0f, 360.0f, false, this.mRingPaintBg);
            canvas.drawArc(this.mRectF, -90.0f, (this.currentProgress / 100.0f) * 360.0f, false, this.ringPaintProgress);
        }
        super.onDraw(canvas);
    }

    public void setProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0340d", new Object[]{this, new Integer(i)});
            return;
        }
        this.currentProgress = i;
        setText(i + f7l.MOD);
    }
}
