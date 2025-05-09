package com.taobao.tao.flexbox.layoutmanager.uikit.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANGLE_ANIMATOR_DURATION = 2000;
    private static final int MIN_SWEEP_ANGLE = 30;
    private static final int SWEEP_ANIMATOR_DURATION = 600;
    private float mBorderWidth;
    private float mCurrentGlobalAngle;
    private float mCurrentGlobalAngleOffset;
    private float mCurrentSweepAngle;
    private boolean mModeAppearing;
    private ObjectAnimator mObjectAnimatorAngle;
    private ObjectAnimator mObjectAnimatorSweep;
    private Paint mPaint;
    private boolean mRunning;
    private static final Interpolator ANGLE_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator SWEEP_INTERPOLATOR = new DecelerateInterpolator();
    private final RectF fBounds = new RectF();
    private Property<CircularProgressDrawable, Float> mAngleProperty = new a(this, Float.class, "angle");
    private Property<CircularProgressDrawable, Float> mSweepProperty = new b(this, Float.class, "arc");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends Property<CircularProgressDrawable, Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(CircularProgressDrawable circularProgressDrawable, Class cls, String str) {
            super(cls, str);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/uikit/view/CircularProgressDrawable$1");
        }

        /* renamed from: a */
        public Float get(CircularProgressDrawable circularProgressDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Float) ipChange.ipc$dispatch("1ec6ea97", new Object[]{this, circularProgressDrawable});
            }
            return Float.valueOf(circularProgressDrawable.getCurrentGlobalAngle());
        }

        /* renamed from: b */
        public void set(CircularProgressDrawable circularProgressDrawable, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d6128bf", new Object[]{this, circularProgressDrawable, f});
            } else {
                circularProgressDrawable.setCurrentGlobalAngle(f.floatValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends Property<CircularProgressDrawable, Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(CircularProgressDrawable circularProgressDrawable, Class cls, String str) {
            super(cls, str);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/uikit/view/CircularProgressDrawable$2");
        }

        /* renamed from: a */
        public Float get(CircularProgressDrawable circularProgressDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Float) ipChange.ipc$dispatch("1ec6ea97", new Object[]{this, circularProgressDrawable});
            }
            return Float.valueOf(circularProgressDrawable.getCurrentSweepAngle());
        }

        /* renamed from: b */
        public void set(CircularProgressDrawable circularProgressDrawable, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d6128bf", new Object[]{this, circularProgressDrawable, f});
            } else {
                circularProgressDrawable.setCurrentSweepAngle(f.floatValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            } else {
                CircularProgressDrawable.access$000(CircularProgressDrawable.this);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    static {
        t2o.a(503317379);
    }

    public CircularProgressDrawable(int i, float f) {
        this.mBorderWidth = f;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(f);
        this.mPaint.setColor(i);
        setupAnimations();
    }

    public static /* synthetic */ void access$000(CircularProgressDrawable circularProgressDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7235d868", new Object[]{circularProgressDrawable});
        } else {
            circularProgressDrawable.toggleAppearingMode();
        }
    }

    public static /* synthetic */ Object ipc$super(CircularProgressDrawable circularProgressDrawable, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/uikit/view/CircularProgressDrawable");
    }

    private void setupAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b7f253", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.mAngleProperty, 360.0f);
        this.mObjectAnimatorAngle = ofFloat;
        ofFloat.setInterpolator(ANGLE_INTERPOLATOR);
        this.mObjectAnimatorAngle.setDuration(2000L);
        this.mObjectAnimatorAngle.setRepeatMode(1);
        this.mObjectAnimatorAngle.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, this.mSweepProperty, 300.0f);
        this.mObjectAnimatorSweep = ofFloat2;
        ofFloat2.setInterpolator(SWEEP_INTERPOLATOR);
        this.mObjectAnimatorSweep.setDuration(600L);
        this.mObjectAnimatorSweep.setRepeatMode(1);
        this.mObjectAnimatorSweep.setRepeatCount(-1);
        this.mObjectAnimatorSweep.addListener(new c());
    }

    private void toggleAppearingMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7b9903", new Object[]{this});
            return;
        }
        boolean z = this.mModeAppearing;
        this.mModeAppearing = true ^ z;
        if (!z) {
            this.mCurrentGlobalAngleOffset = (this.mCurrentGlobalAngleOffset + 60.0f) % 360.0f;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        float f2 = this.mCurrentGlobalAngle - this.mCurrentGlobalAngleOffset;
        float f3 = this.mCurrentSweepAngle;
        if (!this.mModeAppearing) {
            f2 += f3;
            f = (360.0f - f3) - 30.0f;
        } else {
            f = f3 + 30.0f;
        }
        canvas.drawArc(this.fBounds, f2, f, false, this.mPaint);
    }

    public float getCurrentGlobalAngle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4968fa4", new Object[]{this})).floatValue();
        }
        return this.mCurrentGlobalAngle;
    }

    public float getCurrentSweepAngle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6db42a61", new Object[]{this})).floatValue();
        }
        return this.mCurrentSweepAngle;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        return this.mRunning;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        RectF rectF = this.fBounds;
        float f = this.mBorderWidth;
        rectF.left = rect.left + (f / 2.0f) + 0.5f;
        rectF.right = (rect.right - (f / 2.0f)) - 0.5f;
        rectF.top = rect.top + (f / 2.0f) + 0.5f;
        rectF.bottom = (rect.bottom - (f / 2.0f)) - 0.5f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            this.mPaint.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            this.mPaint.setColorFilter(colorFilter);
        }
    }

    public void setCurrentGlobalAngle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46bb400", new Object[]{this, new Float(f)});
            return;
        }
        this.mCurrentGlobalAngle = f;
        invalidateSelf();
    }

    public void setCurrentSweepAngle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b15277b", new Object[]{this, new Float(f)});
            return;
        }
        this.mCurrentSweepAngle = f;
        invalidateSelf();
    }

    public void setRingColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1643f52b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPaint.setColor(i);
        invalidateSelf();
    }

    public void setRingWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6acb7165", new Object[]{this, new Float(f)});
            return;
        }
        this.mPaint.setStrokeWidth(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!isRunning()) {
            this.mRunning = true;
            this.mObjectAnimatorAngle.start();
            this.mObjectAnimatorSweep.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (isRunning()) {
            this.mRunning = false;
            this.mObjectAnimatorAngle.cancel();
            this.mObjectAnimatorSweep.cancel();
            invalidateSelf();
        }
    }
}
