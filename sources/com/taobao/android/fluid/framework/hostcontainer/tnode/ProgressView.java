package com.taobao.android.fluid.framework.hostcontainer.tnode;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ir9;
import tb.pr9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ProgressView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ProgressView";
    private ObjectAnimator mAnimator;
    private int mBackgroupColor;
    private final Context mContext;
    private Paint mPaint;
    private int mProgressColor;
    private int mProgressHeight;
    private float mRadius;
    private final RectF tmpRectF = new RectF();
    private final float mMaxProgress = 100.0f;
    private float mCurrentProgress = 0.0f;
    private long mDuration = 5000;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ProgressView.access$002(ProgressView.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            ProgressView.this.invalidate();
        }
    }

    static {
        t2o.a(468714400);
    }

    public ProgressView(Context context) {
        super(context);
        this.mContext = context;
        initView();
    }

    public static /* synthetic */ float access$002(ProgressView progressView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("580414f2", new Object[]{progressView, new Float(f)})).floatValue();
        }
        progressView.mCurrentProgress = f;
        return f;
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        setBackgroundDrawable(null);
        this.mBackgroupColor = Color.parseColor("#5CFFFFFF");
        this.mProgressColor = Color.parseColor("#FFFFFF");
        this.mRadius = pr9.b(this.mContext, 1.5f);
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.FILL);
        ObjectAnimator objectAnimator = new ObjectAnimator();
        this.mAnimator = objectAnimator;
        objectAnimator.setInterpolator(new LinearInterpolator());
        this.mAnimator.addUpdateListener(new a());
    }

    public static /* synthetic */ Object ipc$super(ProgressView progressView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/ProgressView");
    }

    private void setCurrentProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddbd095", new Object[]{this, new Float(f)});
            return;
        }
        this.mCurrentProgress = f;
        invalidate();
    }

    private void stopAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a93203a", new Object[]{this});
            return;
        }
        ObjectAnimator objectAnimator = this.mAnimator;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.mAnimator.end();
        }
    }

    public void clearProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceac6721", new Object[]{this});
            return;
        }
        stopAnim();
        setCurrentProgress(0.0f);
    }

    public void pauseAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60820a2e", new Object[]{this});
            return;
        }
        ObjectAnimator objectAnimator = this.mAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void setDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b4c7", new Object[]{this, new Long(j)});
        } else {
            this.mDuration = j;
        }
    }

    public void setProgressFull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb6d6d65", new Object[]{this});
            return;
        }
        stopAnim();
        setCurrentProgress(100.0f);
    }

    public void setProgressHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c238e266", new Object[]{this, new Integer(i)});
        } else {
            this.mProgressHeight = i;
        }
    }

    public void startAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8157c9a", new Object[]{this});
        } else if (this.mAnimator != null) {
            stopAnim();
            this.mAnimator.setFloatValues(0.0f, 100.0f);
            this.mAnimator.setDuration(this.mDuration);
            this.mAnimator.start();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        try {
            int width = getWidth();
            int height = getHeight();
            if (this.mProgressHeight == 0) {
                this.mProgressHeight = height;
            }
            int i = (height - this.mProgressHeight) / 2;
            this.mPaint.setColor(this.mBackgroupColor);
            float f = i;
            float f2 = width;
            this.tmpRectF.set(0.0f, f, f2, this.mProgressHeight + i);
            RectF rectF = this.tmpRectF;
            float f3 = this.mRadius;
            canvas.drawRoundRect(rectF, f3, f3, this.mPaint);
            this.mPaint.setColor(this.mProgressColor);
            this.tmpRectF.set(0.0f, f, Math.min((this.mCurrentProgress / 100.0f) * f2, f2), i + this.mProgressHeight);
            RectF rectF2 = this.tmpRectF;
            float f4 = this.mRadius;
            canvas.drawRoundRect(rectF2, f4, f4, this.mPaint);
        } catch (Throwable th) {
            ir9.b(TAG, "onDraw error:" + th);
        }
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        initView();
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        initView();
    }
}
