package com.taobao.android.buy.module.progressBar.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.ai;
import tb.g27;
import tb.gt9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliBuyProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int endColor;
    private boolean isAdjust;
    private LinearGradient linearGradient;
    private ValueAnimator mAnimator;
    private Paint mBarPaint;
    private final int mBarWidth;
    private float mEndXOfBar;
    private final int mMarginTopOfBar;
    private final int mMarginTopOfText;
    private float mProgress;
    private c mProgressUpdateListener;
    private float mProgressWidth;
    private final float mRatio;
    private float mStartXOfBar;
    private String mText;
    private final int mWidth;
    private final int startColor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/module/progressBar/widget/AliBuyProgressBar$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                AliBuyProgressBar.access$002(AliBuyProgressBar.this, 0.99f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            AliBuyProgressBar.access$002(AliBuyProgressBar.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            AliBuyProgressBar aliBuyProgressBar = AliBuyProgressBar.this;
            AliBuyProgressBar.access$102(aliBuyProgressBar, AliBuyProgressBar.access$200(aliBuyProgressBar) + (AliBuyProgressBar.access$000(AliBuyProgressBar.this) * AliBuyProgressBar.access$300(AliBuyProgressBar.this) * 0.42f));
            AliBuyProgressBar.access$402(AliBuyProgressBar.this, new LinearGradient(AliBuyProgressBar.access$200(AliBuyProgressBar.this), 0.0f, AliBuyProgressBar.access$100(AliBuyProgressBar.this), 0.0f, (int) gt9.COLOR_UNFOLLOW_DEFAULT, -28672, Shader.TileMode.CLAMP));
            int access$000 = (((int) (AliBuyProgressBar.access$000(AliBuyProgressBar.this) * 100.0f)) / 10) * 10;
            if (AliBuyProgressBar.access$000(AliBuyProgressBar.this) == 0.99f) {
                access$000 = 99;
            }
            AliBuyProgressBar aliBuyProgressBar2 = AliBuyProgressBar.this;
            AliBuyProgressBar.access$502(aliBuyProgressBar2, AliBuyProgressBar.access$600(aliBuyProgressBar2, access$000));
            if (AliBuyProgressBar.access$700(AliBuyProgressBar.this) != null) {
                AliBuyProgressBar.access$700(AliBuyProgressBar.this).a(AliBuyProgressBar.access$500(AliBuyProgressBar.this));
            }
            AliBuyProgressBar.this.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void a(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
    }

    static {
        t2o.a(301990066);
    }

    public AliBuyProgressBar(Context context) {
        this(context, null);
    }

    public static /* synthetic */ float access$000(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b34e0a13", new Object[]{aliBuyProgressBar})).floatValue();
        }
        return aliBuyProgressBar.mProgress;
    }

    public static /* synthetic */ float access$002(AliBuyProgressBar aliBuyProgressBar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb55942b", new Object[]{aliBuyProgressBar, new Float(f)})).floatValue();
        }
        aliBuyProgressBar.mProgress = f;
        return f;
    }

    public static /* synthetic */ float access$100(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6fc34d4", new Object[]{aliBuyProgressBar})).floatValue();
        }
        return aliBuyProgressBar.mProgressWidth;
    }

    public static /* synthetic */ float access$102(AliBuyProgressBar aliBuyProgressBar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6cc18a", new Object[]{aliBuyProgressBar, new Float(f)})).floatValue();
        }
        aliBuyProgressBar.mProgressWidth = f;
        return f;
    }

    public static /* synthetic */ float access$200(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1aaa5f95", new Object[]{aliBuyProgressBar})).floatValue();
        }
        return aliBuyProgressBar.mStartXOfBar;
    }

    public static /* synthetic */ int access$300(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e588a59", new Object[]{aliBuyProgressBar})).intValue();
        }
        return aliBuyProgressBar.mWidth;
    }

    public static /* synthetic */ LinearGradient access$402(AliBuyProgressBar aliBuyProgressBar, LinearGradient linearGradient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearGradient) ipChange.ipc$dispatch("24b26e77", new Object[]{aliBuyProgressBar, linearGradient});
        }
        aliBuyProgressBar.linearGradient = linearGradient;
        return linearGradient;
    }

    public static /* synthetic */ String access$500(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a33e1b8", new Object[]{aliBuyProgressBar});
        }
        return aliBuyProgressBar.mText;
    }

    public static /* synthetic */ String access$502(AliBuyProgressBar aliBuyProgressBar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44fe11ec", new Object[]{aliBuyProgressBar, str});
        }
        aliBuyProgressBar.mText = str;
        return str;
    }

    public static /* synthetic */ String access$600(AliBuyProgressBar aliBuyProgressBar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3729a66", new Object[]{aliBuyProgressBar, new Integer(i)});
        }
        return aliBuyProgressBar.getText(i);
    }

    public static /* synthetic */ c access$700(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("63db3310", new Object[]{aliBuyProgressBar});
        }
        return aliBuyProgressBar.mProgressUpdateListener;
    }

    private String getText(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f841a27", new Object[]{this, new Integer(i)});
        }
        if (this.isAdjust) {
            return Localization.q(R.string.taobao_app_1029_1_37094) + i + "%) ...";
        }
        return Localization.q(R.string.taobao_app_1029_1_37093) + i + "%) ...";
    }

    private void initAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327f851e", new Object[]{this});
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.3f, 0.99f);
        this.mAnimator = ofFloat;
        ofFloat.setDuration(7000L);
        this.mAnimator.setInterpolator(new LinearInterpolator());
        this.mAnimator.addListener(new a());
        this.mAnimator.addUpdateListener(new b());
    }

    private void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        int i = this.mWidth;
        this.mStartXOfBar = (i * 0.58000004f) / 2.0f;
        this.mEndXOfBar = (i * 1.42f) / 2.0f;
        Paint paint = new Paint(1);
        this.mBarPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mBarPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mBarPaint.setStrokeWidth(this.mBarWidth);
    }

    public static /* synthetic */ Object ipc$super(AliBuyProgressBar aliBuyProgressBar, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/module/progressBar/widget/AliBuyProgressBar");
    }

    public void finishLoading(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628fa346", new Object[]{this, dVar});
            return;
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mProgress = 1.0f;
            this.mProgressWidth = this.mStartXOfBar + (this.mWidth * 0.42f);
            String text = getText(100);
            this.mText = text;
            c cVar = this.mProgressUpdateListener;
            if (cVar != null) {
                cVar.a(text);
            }
            invalidate();
            if (dVar != null) {
                ((g27.c) dVar).a();
            }
        }
    }

    public void isAdjust(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed868574", new Object[]{this, new Boolean(z)});
        } else {
            this.isAdjust = z;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        this.mBarPaint.setColor(-2565928);
        this.mBarPaint.setShader(null);
        float f = this.mStartXOfBar;
        int i = this.mMarginTopOfBar;
        canvas.drawLine(f, i, this.mEndXOfBar, i, this.mBarPaint);
        this.mBarPaint.setShader(this.linearGradient);
        float f2 = this.mStartXOfBar;
        int i2 = this.mMarginTopOfBar;
        canvas.drawLine(f2, i2, this.mProgressWidth, i2, this.mBarPaint);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setmProgressUpdateListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c358da", new Object[]{this, cVar});
        } else {
            this.mProgressUpdateListener = cVar;
        }
    }

    public AliBuyProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWidth = ai.a(240.0f);
        this.mRatio = 0.42f;
        this.mBarWidth = ai.a(3.0f);
        this.mMarginTopOfBar = ai.a(10.0f);
        this.mMarginTopOfText = ai.a(34.0f);
        this.mProgress = 0.0f;
        this.startColor = gt9.COLOR_UNFOLLOW_DEFAULT;
        this.endColor = -28672;
        initPaint();
        initAnimator();
        this.mAnimator.start();
    }
}
