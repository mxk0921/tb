package com.taobao.android.dinamicx.view;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.pb6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeProgressView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint backgroundPaint;
    private RectF backgroundRect;
    private DinamicXEngine engine;
    private a listener;
    private Paint progressPaint;
    public ValueAnimator valueAnimator;
    private final RectF progressRect = new RectF();
    private float progress = 0.0f;
    private float maxProgress = 100.0f;
    private int sectionDuration = 0;
    private int cornerRadius = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(float f, int i);
    }

    static {
        t2o.a(444597179);
    }

    public DXNativeProgressView(DinamicXEngine dinamicXEngine, Context context) {
        super(context);
        init();
        this.engine = dinamicXEngine;
    }

    public static /* synthetic */ Object ipc$super(DXNativeProgressView dXNativeProgressView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/view/DXNativeProgressView");
        }
    }

    private void onProgressChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad07a83", new Object[]{this});
            return;
        }
        a aVar = this.listener;
        if (aVar != null) {
            aVar.a(getProgress(), 0);
        }
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        return this.progress;
    }

    public a getProgressChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b8039cb7", new Object[]{this});
        }
        return this.listener;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Paint paint = new Paint();
        this.backgroundPaint = paint;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        this.backgroundPaint.setColor(-16777216);
        this.backgroundRect = new RectF();
        Paint paint2 = new Paint();
        this.progressPaint = paint2;
        paint2.setStyle(style);
        this.progressPaint.setColor(-1);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.valueAnimator.end();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.backgroundRect != null) {
            this.maxProgress = Math.min(100.0f, this.maxProgress);
            int i = getLayoutParams().height;
            float f = getLayoutParams().width;
            int i2 = (int) ((this.progress / 100.0f) * f);
            RectF rectF = this.backgroundRect;
            float f2 = i;
            rectF.set(0.0f, 0.0f, f, f2);
            int i3 = this.cornerRadius;
            canvas.drawRoundRect(rectF, i3, i3, this.backgroundPaint);
            this.progressRect.set(0.0f, 0.0f, i2, f2);
            RectF rectF2 = this.progressRect;
            int i4 = this.cornerRadius;
            canvas.drawRoundRect(rectF2, i4, i4, this.progressPaint);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.backgroundPaint.setColor(i);
        }
    }

    public void setCornerRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c79033", new Object[]{this, new Integer(i)});
        } else {
            this.cornerRadius = pb6.d(this.engine, getContext(), i);
        }
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        invalidate();
        this.progress = f;
        onProgressChange();
    }

    public void setProgressChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac187c9", new Object[]{this, aVar});
        } else {
            this.listener = aVar;
        }
    }

    public void setProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260e3e8", new Object[]{this, new Integer(i)});
        } else {
            this.progressPaint.setColor(i);
        }
    }

    public void setProgressWithoutAnim(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0903b8f", new Object[]{this, new Float(f)});
            return;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.valueAnimator.cancel();
        }
        if (this.progress != f) {
            invalidate();
            this.progress = f;
            onProgressChange();
        }
    }

    public void setSectionDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8dd46e5", new Object[]{this, new Integer(i)});
        } else {
            this.sectionDuration = i;
        }
    }

    public void startProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a542c0d", new Object[]{this, new Integer(i)});
            return;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.valueAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", i, 100.0f);
        this.valueAnimator = ofFloat;
        ofFloat.setDuration(this.sectionDuration);
        this.valueAnimator.setInterpolator(new LinearInterpolator());
        this.valueAnimator.start();
    }
}
