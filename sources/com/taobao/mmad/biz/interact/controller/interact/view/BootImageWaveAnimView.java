package com.taobao.mmad.biz.interact.controller.interact.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BootImageWaveAnimView extends FrameLayout implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int animCycleTime;
    public final int animDuration;
    public final int animIdleDuration;
    public final int animInterval;
    private ValueAnimator animator;
    public final float initialAlpha;
    public float mAlpha1;
    public float mAlpha2;
    private Paint mPaint;
    private RectF mRectF;
    public float mScale1;
    public float mScale2;
    public int mWaveColor;
    public int mWaveRadius;
    public final float maxScale;

    static {
        t2o.a(573571121);
    }

    public BootImageWaveAnimView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(BootImageWaveAnimView bootImageWaveAnimView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mmad/biz/interact/controller/interact/view/BootImageWaveAnimView");
        }
    }

    private void resumeStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96f1b86", new Object[]{this});
            return;
        }
        this.mAlpha1 = 0.6f;
        this.mAlpha2 = 0.6f;
        this.mScale1 = 1.0f;
        this.mScale2 = 1.0f;
        postInvalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
        } else {
            resumeStatus();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84781bba", new Object[]{this, animator, new Boolean(z)});
        } else {
            resumeStatus();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
        } else {
            resumeStatus();
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        try {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (intValue >= 600) {
                this.mAlpha1 = 0.6f;
                this.mScale1 = 1.0f;
            } else {
                float f = intValue % 600;
                this.mAlpha1 = ((600.0f - (f * 1.0f)) / 600.0f) * 0.6f;
                this.mScale1 = ((f * 0.2f) / 600.0f) + 1.0f;
            }
            if (intValue >= 900) {
                this.mAlpha2 = 0.6f;
                this.mScale2 = 1.0f;
            } else if (intValue < 300) {
                this.mAlpha2 = 0.6f;
                this.mScale2 = 1.0f;
            } else {
                float f2 = (intValue - 300) % 600;
                this.mAlpha2 = ((600.0f - (f2 * 1.0f)) / 600.0f) * 0.6f;
                this.mScale2 = ((f2 * 0.2f) / 600.0f) + 1.0f;
            }
            postInvalidate();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        stopAnim();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF;
        Paint paint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0 && (rectF = this.mRectF) != null && (paint = this.mPaint) != null) {
            float f = this.mScale1;
            float f2 = measuredWidth;
            float f3 = measuredHeight;
            float f4 = (((f - 1.0f) * f2) / f3) + 1.0f;
            float f5 = ((1.0f - f4) * f3) / 2.0f;
            rectF.top = f5;
            float f6 = ((1.0f - f) * f2) / 2.0f;
            rectF.left = f6;
            rectF.right = f6 + (f * f2);
            rectF.bottom = f5 + (f4 * f3);
            paint.setAlpha((int) (this.mAlpha1 * 255.0f));
            RectF rectF2 = this.mRectF;
            int i = this.mWaveRadius;
            canvas.drawRoundRect(rectF2, i, i, this.mPaint);
            float f7 = this.mScale2;
            float f8 = (((f7 - 1.0f) * f2) / f3) + 1.0f;
            RectF rectF3 = this.mRectF;
            float f9 = ((1.0f - f8) * f3) / 2.0f;
            rectF3.top = f9;
            float f10 = ((1.0f - f7) * f2) / 2.0f;
            rectF3.left = f10;
            rectF3.right = f10 + (f7 * f2);
            rectF3.bottom = f9 + (f8 * f3);
            this.mPaint.setAlpha((int) (this.mAlpha2 * 255.0f));
            RectF rectF4 = this.mRectF;
            int i2 = this.mWaveRadius;
            canvas.drawRoundRect(rectF4, i2, i2, this.mPaint);
        }
    }

    public void startAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8157c9a", new Object[]{this});
            return;
        }
        try {
            ValueAnimator ofInt = ValueAnimator.ofInt(1500);
            this.animator = ofInt;
            ofInt.setDuration(1500L);
            this.animator.setRepeatMode(1);
            this.animator.setRepeatCount(-1);
            this.animator.setInterpolator(new LinearInterpolator());
            this.animator.addUpdateListener(this);
            this.animator.addListener(this);
            this.animator.start();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void stopAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a93203a", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
    }

    public BootImageWaveAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
        } else {
            resumeStatus();
        }
    }

    public BootImageWaveAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animDuration = 1500;
        this.animInterval = 600;
        this.animCycleTime = 600;
        this.animIdleDuration = 300;
        this.maxScale = 0.2f;
        this.initialAlpha = 0.6f;
        this.mWaveRadius = 20;
        this.mWaveColor = -1;
        try {
            setWillNotDraw(false);
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BootImageWaveAnimView);
                this.mWaveColor = obtainStyledAttributes.getColor(R.styleable.BootImageWaveAnimView_wave_color, this.mWaveColor);
                this.mWaveRadius = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BootImageWaveAnimView_wave_radius, this.mWaveRadius);
                obtainStyledAttributes.recycle();
            }
            this.mRectF = new RectF();
            Paint paint = new Paint(1);
            this.mPaint = paint;
            paint.setColor(this.mWaveColor);
            this.mPaint.setStyle(Paint.Style.FILL);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
