package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 1332;
    private static final int ARROW_HEIGHT = 5;
    private static final int ARROW_HEIGHT_LARGE = 6;
    private static final int ARROW_WIDTH = 10;
    private static final int ARROW_WIDTH_LARGE = 12;
    private static final float CENTER_RADIUS = 7.5f;
    private static final float CENTER_RADIUS_LARGE = 11.0f;
    private static final float COLOR_CHANGE_OFFSET = 0.75f;
    public static final int DEFAULT = 1;
    private static final float GROUP_FULL_ROTATION = 216.0f;
    public static final int LARGE = 0;
    private static final float MAX_PROGRESS_ARC = 0.8f;
    private static final float MIN_PROGRESS_ARC = 0.01f;
    private static final float RING_ROTATION = 0.20999998f;
    private static final float SHRINK_OFFSET = 0.5f;
    private static final float STROKE_WIDTH = 2.5f;
    private static final float STROKE_WIDTH_LARGE = 3.0f;
    private Animator mAnimator;
    public boolean mFinishing;
    private Resources mResources;
    private final Ring mRing;
    private float mRotation;
    public float mRotationCount;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
    private static final int[] COLORS = {-16777216};

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface ProgressDrawableSize {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Ring {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Path mArrow;
        public int mArrowHeight;
        public final Paint mArrowPaint;
        public int mArrowWidth;
        public final Paint mCirclePaint;
        public int mColorIndex;
        public int[] mColors;
        public int mCurrentColor;
        public final Paint mPaint;
        public float mRingCenterRadius;
        public boolean mShowArrow;
        public float mStartingEndTrim;
        public float mStartingRotation;
        public float mStartingStartTrim;
        public final RectF mTempBounds = new RectF();
        public float mStartTrim = 0.0f;
        public float mEndTrim = 0.0f;
        public float mRotation = 0.0f;
        public float mStrokeWidth = 5.0f;
        public float mArrowScale = 1.0f;
        public int mAlpha = 255;

        public Ring() {
            Paint paint = new Paint();
            this.mPaint = paint;
            Paint paint2 = new Paint();
            this.mArrowPaint = paint2;
            Paint paint3 = new Paint();
            this.mCirclePaint = paint3;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void draw(Canvas canvas, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43e7455f", new Object[]{this, canvas, rect});
                return;
            }
            RectF rectF = this.mTempBounds;
            float f = this.mRingCenterRadius;
            float f2 = (this.mStrokeWidth / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.mArrowWidth * this.mArrowScale) / 2.0f, this.mStrokeWidth / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.mStartTrim;
            float f4 = this.mRotation;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.mEndTrim + f4) * 360.0f) - f5;
            this.mPaint.setColor(this.mCurrentColor);
            this.mPaint.setAlpha(this.mAlpha);
            float f7 = this.mStrokeWidth / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.mCirclePaint);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.mPaint);
            drawTriangle(canvas, f5, f6, rectF);
        }

        public void drawTriangle(Canvas canvas, float f, float f2, RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e69ecf63", new Object[]{this, canvas, new Float(f), new Float(f2), rectF});
            } else if (this.mShowArrow) {
                Path path = this.mArrow;
                if (path == null) {
                    Path path2 = new Path();
                    this.mArrow = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.mArrow.moveTo(0.0f, 0.0f);
                this.mArrow.lineTo(this.mArrowWidth * this.mArrowScale, 0.0f);
                Path path3 = this.mArrow;
                float f3 = this.mArrowScale;
                path3.lineTo((this.mArrowWidth * f3) / 2.0f, this.mArrowHeight * f3);
                this.mArrow.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.mArrowWidth * this.mArrowScale) / 2.0f), rectF.centerY() + (this.mStrokeWidth / 2.0f));
                this.mArrow.close();
                this.mArrowPaint.setColor(this.mCurrentColor);
                this.mArrowPaint.setAlpha(this.mAlpha);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.mArrow, this.mArrowPaint);
                canvas.restore();
            }
        }

        public int getAlpha() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dbf8c822", new Object[]{this})).intValue();
            }
            return this.mAlpha;
        }

        public float getArrowHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("178c94d1", new Object[]{this})).floatValue();
            }
            return this.mArrowHeight;
        }

        public float getArrowScale() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4bd3cbae", new Object[]{this})).floatValue();
            }
            return this.mArrowScale;
        }

        public float getArrowWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b8b0522a", new Object[]{this})).floatValue();
            }
            return this.mArrowWidth;
        }

        public int getBackgroundColor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue();
            }
            return this.mCirclePaint.getColor();
        }

        public float getCenterRadius() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5054c1b4", new Object[]{this})).floatValue();
            }
            return this.mRingCenterRadius;
        }

        public int[] getColors() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("46ff7c97", new Object[]{this});
            }
            return this.mColors;
        }

        public float getEndTrim() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d806405e", new Object[]{this})).floatValue();
            }
            return this.mEndTrim;
        }

        public int getNextColor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("acb03cf4", new Object[]{this})).intValue();
            }
            return this.mColors[getNextColorIndex()];
        }

        public int getNextColorIndex() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("36c597f2", new Object[]{this})).intValue();
            }
            return (this.mColorIndex + 1) % this.mColors.length;
        }

        public float getRotation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c471376b", new Object[]{this})).floatValue();
            }
            return this.mRotation;
        }

        public boolean getShowArrow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("59ecd9e1", new Object[]{this})).booleanValue();
            }
            return this.mShowArrow;
        }

        public float getStartTrim() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1ec47a65", new Object[]{this})).floatValue();
            }
            return this.mStartTrim;
        }

        public int getStartingColor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d3025947", new Object[]{this})).intValue();
            }
            return this.mColors[this.mColorIndex];
        }

        public float getStartingEndTrim() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22e9f5fe", new Object[]{this})).floatValue();
            }
            return this.mStartingEndTrim;
        }

        public float getStartingRotation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d60435cb", new Object[]{this})).floatValue();
            }
            return this.mStartingRotation;
        }

        public float getStartingStartTrim() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3f914805", new Object[]{this})).floatValue();
            }
            return this.mStartingStartTrim;
        }

        public Paint.Cap getStrokeCap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Paint.Cap) ipChange.ipc$dispatch("f84046f2", new Object[]{this});
            }
            return this.mPaint.getStrokeCap();
        }

        public float getStrokeWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("37af59af", new Object[]{this})).floatValue();
            }
            return this.mStrokeWidth;
        }

        public void goToNextColor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccb07ff4", new Object[]{this});
            } else {
                setColorIndex(getNextColorIndex());
            }
        }

        public void resetOriginals() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c3b6f3a", new Object[]{this});
                return;
            }
            this.mStartingStartTrim = 0.0f;
            this.mStartingEndTrim = 0.0f;
            this.mStartingRotation = 0.0f;
            setStartTrim(0.0f);
            setEndTrim(0.0f);
            setRotation(0.0f);
        }

        public void setAlpha(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            } else {
                this.mAlpha = i;
            }
        }

        public void setArrowDimensions(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8697f3bb", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            this.mArrowWidth = (int) f;
            this.mArrowHeight = (int) f2;
        }

        public void setArrowScale(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("657cad36", new Object[]{this, new Float(f)});
            } else if (f != this.mArrowScale) {
                this.mArrowScale = f;
            }
        }

        public void setBackgroundColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            } else {
                this.mCirclePaint.setColor(i);
            }
        }

        public void setCenterRadius(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95d9eaf0", new Object[]{this, new Float(f)});
            } else {
                this.mRingCenterRadius = f;
            }
        }

        public void setColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
            } else {
                this.mCurrentColor = i;
            }
        }

        public void setColorFilter(ColorFilter colorFilter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            } else {
                this.mPaint.setColorFilter(colorFilter);
            }
        }

        public void setColorIndex(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ade6e0cb", new Object[]{this, new Integer(i)});
                return;
            }
            this.mColorIndex = i;
            this.mCurrentColor = this.mColors[i];
        }

        public void setColors(int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf4f84c7", new Object[]{this, iArr});
                return;
            }
            this.mColors = iArr;
            setColorIndex(0);
        }

        public void setEndTrim(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f0b301e", new Object[]{this, new Float(f)});
            } else {
                this.mEndTrim = f;
            }
        }

        public void setRotation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c8c8619", new Object[]{this, new Float(f)});
            } else {
                this.mRotation = f;
            }
        }

        public void setShowArrow(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aba57ca3", new Object[]{this, new Boolean(z)});
            } else if (this.mShowArrow != z) {
                this.mShowArrow = z;
            }
        }

        public void setStartTrim(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81c1a3f7", new Object[]{this, new Float(f)});
            } else {
                this.mStartTrim = f;
            }
        }

        public void setStrokeCap(Paint.Cap cap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("208c8e06", new Object[]{this, cap});
            } else {
                this.mPaint.setStrokeCap(cap);
            }
        }

        public void setStrokeWidth(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6238daed", new Object[]{this, new Float(f)});
                return;
            }
            this.mStrokeWidth = f;
            this.mPaint.setStrokeWidth(f);
        }

        public void storeOriginals() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("689f70e8", new Object[]{this});
                return;
            }
            this.mStartingStartTrim = this.mStartTrim;
            this.mStartingEndTrim = this.mEndTrim;
            this.mStartingRotation = this.mRotation;
        }
    }

    public CircularProgressDrawable(Context context) {
        this.mResources = ((Context) Preconditions.checkNotNull(context)).getResources();
        Ring ring = new Ring();
        this.mRing = ring;
        ring.setColors(COLORS);
        setStrokeWidth(STROKE_WIDTH);
        setupAnimators();
    }

    private void applyFinishTranslation(float f, Ring ring) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f22115b", new Object[]{this, new Float(f), ring});
            return;
        }
        updateRingColor(f, ring);
        ring.setStartTrim(ring.getStartingStartTrim() + (((ring.getStartingEndTrim() - 0.01f) - ring.getStartingStartTrim()) * f));
        ring.setEndTrim(ring.getStartingEndTrim());
        ring.setRotation(ring.getStartingRotation() + ((((float) (Math.floor(ring.getStartingRotation() / 0.8f) + 1.0d)) - ring.getStartingRotation()) * f));
    }

    private int evaluateColorChange(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4914c652", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    private float getRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c471376b", new Object[]{this})).floatValue();
        }
        return this.mRotation;
    }

    public static /* synthetic */ Object ipc$super(CircularProgressDrawable circularProgressDrawable, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/swiperefreshlayout/widget/CircularProgressDrawable");
    }

    private void setRotation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8c8619", new Object[]{this, new Float(f)});
        } else {
            this.mRotation = f;
        }
    }

    private void setSizeParameters(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867021d4", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        Ring ring = this.mRing;
        float f5 = this.mResources.getDisplayMetrics().density;
        ring.setStrokeWidth(f2 * f5);
        ring.setCenterRadius(f * f5);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f3 * f5, f4 * f5);
    }

    private void setupAnimators() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245e4976", new Object[]{this});
            return;
        }
        final Ring ring = this.mRing;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressDrawable.this.updateRingColor(floatValue, ring);
                CircularProgressDrawable.this.applyTransformation(floatValue, ring, false);
                CircularProgressDrawable.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(LINEAR_INTERPOLATOR);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    return;
                }
                CircularProgressDrawable.this.applyTransformation(1.0f, ring, true);
                ring.storeOriginals();
                ring.goToNextColor();
                CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
                if (circularProgressDrawable.mFinishing) {
                    circularProgressDrawable.mFinishing = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    ring.setShowArrow(false);
                    return;
                }
                circularProgressDrawable.mRotationCount += 1.0f;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else {
                    CircularProgressDrawable.this.mRotationCount = 0.0f;
                }
            }
        });
        this.mAnimator = ofFloat;
    }

    public void applyTransformation(float f, Ring ring, boolean z) {
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959d5da0", new Object[]{this, new Float(f), ring, new Boolean(z)});
        } else if (this.mFinishing) {
            applyFinishTranslation(f, ring);
        } else if (f != 1.0f || z) {
            float startingRotation = ring.getStartingRotation();
            if (f < 0.5f) {
                f2 = ring.getStartingStartTrim();
                f3 = (MATERIAL_INTERPOLATOR.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float startingStartTrim = ring.getStartingStartTrim() + 0.79f;
                f2 = startingStartTrim - (((1.0f - MATERIAL_INTERPOLATOR.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = startingStartTrim;
            }
            float f4 = startingRotation + (RING_ROTATION * f);
            float f5 = (f + this.mRotationCount) * GROUP_FULL_ROTATION;
            ring.setStartTrim(f2);
            ring.setEndTrim(f3);
            ring.setRotation(f4);
            setRotation(f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        this.mRing.draw(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c822", new Object[]{this})).intValue();
        }
        return this.mRing.getAlpha();
    }

    public boolean getArrowEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c55f72f9", new Object[]{this})).booleanValue();
        }
        return this.mRing.getShowArrow();
    }

    public float getArrowHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("178c94d1", new Object[]{this})).floatValue();
        }
        return this.mRing.getArrowHeight();
    }

    public float getArrowScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bd3cbae", new Object[]{this})).floatValue();
        }
        return this.mRing.getArrowScale();
    }

    public float getArrowWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8b0522a", new Object[]{this})).floatValue();
        }
        return this.mRing.getArrowWidth();
    }

    public int getBackgroundColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue();
        }
        return this.mRing.getBackgroundColor();
    }

    public float getCenterRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5054c1b4", new Object[]{this})).floatValue();
        }
        return this.mRing.getCenterRadius();
    }

    public int[] getColorSchemeColors() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("bb87f8bb", new Object[]{this});
        }
        return this.mRing.getColors();
    }

    public float getEndTrim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d806405e", new Object[]{this})).floatValue();
        }
        return this.mRing.getEndTrim();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -3;
    }

    public float getProgressRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("395f9c38", new Object[]{this})).floatValue();
        }
        return this.mRing.getRotation();
    }

    public float getStartTrim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ec47a65", new Object[]{this})).floatValue();
        }
        return this.mRing.getStartTrim();
    }

    public Paint.Cap getStrokeCap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint.Cap) ipChange.ipc$dispatch("f84046f2", new Object[]{this});
        }
        return this.mRing.getStrokeCap();
    }

    public float getStrokeWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37af59af", new Object[]{this})).floatValue();
        }
        return this.mRing.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        return this.mAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRing.setAlpha(i);
        invalidateSelf();
    }

    public void setArrowDimensions(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8697f3bb", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.mRing.setArrowDimensions(f, f2);
        invalidateSelf();
    }

    public void setArrowEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c225aaf3", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mRing.setShowArrow(z);
        invalidateSelf();
    }

    public void setArrowScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657cad36", new Object[]{this, new Float(f)});
            return;
        }
        this.mRing.setArrowScale(f);
        invalidateSelf();
    }

    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRing.setBackgroundColor(i);
        invalidateSelf();
    }

    public void setCenterRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d9eaf0", new Object[]{this, new Float(f)});
            return;
        }
        this.mRing.setCenterRadius(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            return;
        }
        this.mRing.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbbd778b", new Object[]{this, iArr});
            return;
        }
        this.mRing.setColors(iArr);
        this.mRing.setColorIndex(0);
        invalidateSelf();
    }

    public void setProgressRotation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a706ec", new Object[]{this, new Float(f)});
            return;
        }
        this.mRing.setRotation(f);
        invalidateSelf();
    }

    public void setStartEndTrim(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb471764", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.mRing.setStartTrim(f);
        this.mRing.setEndTrim(f2);
        invalidateSelf();
    }

    public void setStrokeCap(Paint.Cap cap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208c8e06", new Object[]{this, cap});
            return;
        }
        this.mRing.setStrokeCap(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6238daed", new Object[]{this, new Float(f)});
            return;
        }
        this.mRing.setStrokeWidth(f);
        invalidateSelf();
    }

    public void setStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e94e4d", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 0) {
            setSizeParameters(CENTER_RADIUS_LARGE, 3.0f, 12.0f, 6.0f);
        } else {
            setSizeParameters(CENTER_RADIUS, STROKE_WIDTH, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        this.mAnimator.cancel();
        this.mRing.storeOriginals();
        if (this.mRing.getEndTrim() != this.mRing.getStartTrim()) {
            this.mFinishing = true;
            this.mAnimator.setDuration(666L);
            this.mAnimator.start();
            return;
        }
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        this.mAnimator.setDuration(1332L);
        this.mAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.mAnimator.cancel();
        setRotation(0.0f);
        this.mRing.setShowArrow(false);
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        invalidateSelf();
    }

    public void updateRingColor(float f, Ring ring) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70edf221", new Object[]{this, new Float(f), ring});
        } else if (f > 0.75f) {
            ring.setColor(evaluateColorChange((f - 0.75f) / 0.25f, ring.getStartingColor(), ring.getNextColor()));
        } else {
            ring.setColor(ring.getStartingColor());
        }
    }
}
