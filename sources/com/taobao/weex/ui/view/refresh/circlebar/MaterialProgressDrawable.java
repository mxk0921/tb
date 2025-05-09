package com.taobao.weex.ui.view.refresh.circlebar;

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
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialProgressDrawable extends Drawable implements Animatable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 1332;
    private static final int ARROW_HEIGHT = 5;
    private static final int ARROW_HEIGHT_LARGE = 6;
    private static final float ARROW_OFFSET_ANGLE = 5.0f;
    private static final int ARROW_WIDTH = 10;
    private static final int ARROW_WIDTH_LARGE = 12;
    private static final float CENTER_RADIUS = 8.75f;
    private static final float CENTER_RADIUS_LARGE = 12.5f;
    private static final int CIRCLE_DIAMETER = 40;
    private static final int CIRCLE_DIAMETER_LARGE = 56;
    private static final float COLOR_START_DELAY_OFFSET = 0.75f;
    public static final int DEFAULT = 1;
    private static final float END_TRIM_START_DELAY_OFFSET = 0.5f;
    private static final float FULL_ROTATION = 1080.0f;
    public static final int LARGE = 0;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
    private static final float MAX_PROGRESS_ARC = 0.8f;
    private static final float NUM_POINTS = 5.0f;
    private static final float START_TRIM_DURATION_OFFSET = 0.5f;
    private static final float STROKE_WIDTH = 2.5f;
    private static final float STROKE_WIDTH_LARGE = 3.0f;
    private final int[] COLORS;
    private Animation mAnimation;
    private final ArrayList<Animation> mAnimators = new ArrayList<>();
    private final Drawable.Callback mCallback;
    public boolean mFinishing;
    private double mHeight;
    private View mParent;
    private Resources mResources;
    private final Ring mRing;
    private float mRotation;
    private float mRotationCount;
    private double mWidth;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface ProgressDrawableSize {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Ring {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mAlpha;
        private Path mArrow;
        private int mArrowHeight;
        private final Paint mArrowPaint;
        private float mArrowScale;
        private int mArrowWidth;
        private int mBackgroundColor;
        private final Drawable.Callback mCallback;
        private int mColorIndex;
        private int[] mColors;
        private int mCurrentColor;
        private final Paint mPaint;
        private double mRingCenterRadius;
        private boolean mShowArrow;
        private float mStartingEndTrim;
        private float mStartingRotation;
        private float mStartingStartTrim;
        private final RectF mTempBounds = new RectF();
        private float mStartTrim = 0.0f;
        private float mEndTrim = 0.0f;
        private float mRotation = 0.0f;
        private float mStrokeWidth = 5.0f;
        private float mStrokeInset = MaterialProgressDrawable.STROKE_WIDTH;
        private final Paint mCirclePaint = new Paint(1);

        static {
            t2o.a(985661774);
        }

        public Ring(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.mPaint = paint;
            Paint paint2 = new Paint();
            this.mArrowPaint = paint2;
            this.mCallback = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        private void drawTriangle(Canvas canvas, float f, float f2, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17f47007", new Object[]{this, canvas, new Float(f), new Float(f2), rect});
            } else if (this.mShowArrow) {
                Path path = this.mArrow;
                if (path == null) {
                    Path path2 = new Path();
                    this.mArrow = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f3 = (((int) this.mStrokeInset) / 2) * this.mArrowScale;
                float sin = (float) ((this.mRingCenterRadius * Math.sin(vu3.b.GEO_NOT_SUPPORT)) + rect.exactCenterY());
                this.mArrow.moveTo(0.0f, 0.0f);
                this.mArrow.lineTo(this.mArrowWidth * this.mArrowScale, 0.0f);
                Path path3 = this.mArrow;
                float f4 = this.mArrowScale;
                path3.lineTo((this.mArrowWidth * f4) / 2.0f, this.mArrowHeight * f4);
                this.mArrow.offset(((float) ((this.mRingCenterRadius * Math.cos(vu3.b.GEO_NOT_SUPPORT)) + rect.exactCenterX())) - f3, sin);
                this.mArrow.close();
                this.mArrowPaint.setColor(this.mCurrentColor);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.mArrow, this.mArrowPaint);
            }
        }

        private int getNextColorIndex() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("36c597f2", new Object[]{this})).intValue();
            }
            return (this.mColorIndex + 1) % this.mColors.length;
        }

        private void invalidateSelf() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52a9f82e", new Object[]{this});
            } else {
                this.mCallback.invalidateDrawable(null);
            }
        }

        public void draw(Canvas canvas, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43e7455f", new Object[]{this, canvas, rect});
                return;
            }
            RectF rectF = this.mTempBounds;
            rectF.set(rect);
            float f = this.mStrokeInset;
            rectF.inset(f, f);
            float f2 = this.mStartTrim;
            float f3 = this.mRotation;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.mEndTrim + f3) * 360.0f) - f4;
            this.mPaint.setColor(this.mCurrentColor);
            canvas.drawArc(rectF, f4, f5, false, this.mPaint);
            drawTriangle(canvas, f4, f5, rect);
            if (this.mAlpha < 255) {
                this.mCirclePaint.setColor(this.mBackgroundColor);
                this.mCirclePaint.setAlpha(255 - this.mAlpha);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, this.mCirclePaint);
            }
        }

        public int getAlpha() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dbf8c822", new Object[]{this})).intValue();
            }
            return this.mAlpha;
        }

        public double getCenterRadius() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5054c1b2", new Object[]{this})).doubleValue();
            }
            return this.mRingCenterRadius;
        }

        public float getEndTrim() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d806405e", new Object[]{this})).floatValue();
            }
            return this.mEndTrim;
        }

        public float getInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2b209463", new Object[]{this})).floatValue();
            }
            return this.mStrokeInset;
        }

        public int getNextColor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("acb03cf4", new Object[]{this})).intValue();
            }
            return this.mColors[getNextColorIndex()];
        }

        public float getRotation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c471376b", new Object[]{this})).floatValue();
            }
            return this.mRotation;
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
                invalidateSelf();
            }
        }

        public void setBackgroundColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            } else {
                this.mBackgroundColor = i;
            }
        }

        public void setCenterRadius(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95d9e36e", new Object[]{this, new Double(d)});
            } else {
                this.mRingCenterRadius = d;
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
                return;
            }
            this.mPaint.setColorFilter(colorFilter);
            invalidateSelf();
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
                return;
            }
            this.mEndTrim = f;
            invalidateSelf();
        }

        public void setInsets(int i, int i2) {
            double ceil;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ba49f1f", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            float min = Math.min(i, i2);
            double d = this.mRingCenterRadius;
            if (d <= vu3.b.GEO_NOT_SUPPORT || min < 0.0f) {
                ceil = Math.ceil(this.mStrokeWidth / 2.0f);
            } else {
                ceil = (min / 2.0f) - d;
            }
            this.mStrokeInset = (float) ceil;
        }

        public void setRotation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c8c8619", new Object[]{this, new Float(f)});
                return;
            }
            this.mRotation = f;
            invalidateSelf();
        }

        public void setShowArrow(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aba57ca3", new Object[]{this, new Boolean(z)});
            } else if (this.mShowArrow != z) {
                this.mShowArrow = z;
                invalidateSelf();
            }
        }

        public void setStartTrim(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81c1a3f7", new Object[]{this, new Float(f)});
                return;
            }
            this.mStartTrim = f;
            invalidateSelf();
        }

        public void setStrokeWidth(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6238daed", new Object[]{this, new Float(f)});
                return;
            }
            this.mStrokeWidth = f;
            this.mPaint.setStrokeWidth(f);
            invalidateSelf();
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

    static {
        t2o.a(985661769);
    }

    public MaterialProgressDrawable(Context context, View view) {
        int[] iArr = {-16777216};
        this.COLORS = iArr;
        Drawable.Callback callback = new Drawable.Callback() { // from class: com.taobao.weex.ui.view.refresh.circlebar.MaterialProgressDrawable.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
                } else {
                    MaterialProgressDrawable.this.invalidateSelf();
                }
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4282486", new Object[]{this, drawable, runnable, new Long(j)});
                } else {
                    MaterialProgressDrawable.this.scheduleSelf(runnable, j);
                }
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e77f3b17", new Object[]{this, drawable, runnable});
                } else {
                    MaterialProgressDrawable.this.unscheduleSelf(runnable);
                }
            }
        };
        this.mCallback = callback;
        this.mParent = view;
        this.mResources = context.getResources();
        Ring ring = new Ring(callback);
        this.mRing = ring;
        ring.setColors(iArr);
        updateSizes(1);
        setupAnimators();
    }

    public static /* synthetic */ void access$000(MaterialProgressDrawable materialProgressDrawable, float f, Ring ring) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62563733", new Object[]{materialProgressDrawable, new Float(f), ring});
        } else {
            materialProgressDrawable.applyFinishTranslation(f, ring);
        }
    }

    public static /* synthetic */ float access$100(MaterialProgressDrawable materialProgressDrawable, Ring ring) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bd3c92e", new Object[]{materialProgressDrawable, ring})).floatValue();
        }
        return materialProgressDrawable.getMinProgressArc(ring);
    }

    public static /* synthetic */ void access$200(MaterialProgressDrawable materialProgressDrawable, float f, Ring ring) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79560235", new Object[]{materialProgressDrawable, new Float(f), ring});
        } else {
            materialProgressDrawable.updateRingColor(f, ring);
        }
    }

    public static /* synthetic */ Interpolator access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("c171884f", new Object[0]);
        }
        return MATERIAL_INTERPOLATOR;
    }

    public static /* synthetic */ float access$400(MaterialProgressDrawable materialProgressDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b83d0ede", new Object[]{materialProgressDrawable})).floatValue();
        }
        return materialProgressDrawable.mRotationCount;
    }

    public static /* synthetic */ float access$402(MaterialProgressDrawable materialProgressDrawable, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("844728c0", new Object[]{materialProgressDrawable, new Float(f)})).floatValue();
        }
        materialProgressDrawable.mRotationCount = f;
        return f;
    }

    private void applyFinishTranslation(float f, Ring ring) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6178de0", new Object[]{this, new Float(f), ring});
            return;
        }
        updateRingColor(f, ring);
        ring.setStartTrim(ring.getStartingStartTrim() + (((ring.getStartingEndTrim() - getMinProgressArc(ring)) - ring.getStartingStartTrim()) * f));
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

    private float getMinProgressArc(Ring ring) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cfda149", new Object[]{this, ring})).floatValue();
        }
        return (float) Math.toRadians(ring.getStrokeWidth() / (ring.getCenterRadius() * 6.283185307179586d));
    }

    private float getRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c471376b", new Object[]{this})).floatValue();
        }
        return this.mRotation;
    }

    public static /* synthetic */ Object ipc$super(MaterialProgressDrawable materialProgressDrawable, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/refresh/circlebar/MaterialProgressDrawable");
    }

    private void setSizeParameters(double d, double d2, double d3, double d4, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de74454", new Object[]{this, new Double(d), new Double(d2), new Double(d3), new Double(d4), new Float(f), new Float(f2)});
            return;
        }
        Ring ring = this.mRing;
        float f3 = this.mResources.getDisplayMetrics().density;
        double d5 = f3;
        this.mWidth = d * d5;
        this.mHeight = d2 * d5;
        ring.setStrokeWidth(((float) d4) * f3);
        ring.setCenterRadius(d3 * d5);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f * f3, f2 * f3);
        ring.setInsets((int) this.mWidth, (int) this.mHeight);
    }

    private void setupAnimators() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245e4976", new Object[]{this});
            return;
        }
        final Ring ring = this.mRing;
        Animation animation = new Animation() { // from class: com.taobao.weex.ui.view.refresh.circlebar.MaterialProgressDrawable.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/refresh/circlebar/MaterialProgressDrawable$1");
            }

            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("882d4c01", new Object[]{this, new Float(f), transformation});
                    return;
                }
                MaterialProgressDrawable materialProgressDrawable = MaterialProgressDrawable.this;
                if (materialProgressDrawable.mFinishing) {
                    MaterialProgressDrawable.access$000(materialProgressDrawable, f, ring);
                    return;
                }
                float access$100 = MaterialProgressDrawable.access$100(materialProgressDrawable, ring);
                float startingEndTrim = ring.getStartingEndTrim();
                float startingStartTrim = ring.getStartingStartTrim();
                float startingRotation = ring.getStartingRotation();
                MaterialProgressDrawable.access$200(MaterialProgressDrawable.this, f, ring);
                if (f <= 0.5f) {
                    ring.setStartTrim(startingStartTrim + ((0.8f - access$100) * MaterialProgressDrawable.access$300().getInterpolation(f / 0.5f)));
                }
                if (f > 0.5f) {
                    ring.setEndTrim(startingEndTrim + ((0.8f - access$100) * MaterialProgressDrawable.access$300().getInterpolation((f - 0.5f) / 0.5f)));
                }
                ring.setRotation(startingRotation + (0.25f * f));
                MaterialProgressDrawable.this.setRotation((f * 216.0f) + ((MaterialProgressDrawable.access$400(MaterialProgressDrawable.this) / 5.0f) * MaterialProgressDrawable.FULL_ROTATION));
            }
        };
        animation.setRepeatCount(-1);
        animation.setRepeatMode(1);
        animation.setInterpolator(LINEAR_INTERPOLATOR);
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.weex.ui.view.refresh.circlebar.MaterialProgressDrawable.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation2});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation2});
                    return;
                }
                ring.storeOriginals();
                ring.goToNextColor();
                Ring ring2 = ring;
                ring2.setStartTrim(ring2.getEndTrim());
                MaterialProgressDrawable materialProgressDrawable = MaterialProgressDrawable.this;
                if (materialProgressDrawable.mFinishing) {
                    materialProgressDrawable.mFinishing = false;
                    animation2.setDuration(1332L);
                    ring.setShowArrow(false);
                    return;
                }
                MaterialProgressDrawable.access$402(materialProgressDrawable, (MaterialProgressDrawable.access$400(materialProgressDrawable) + 1.0f) % 5.0f);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation2});
                } else {
                    MaterialProgressDrawable.access$402(MaterialProgressDrawable.this, 0.0f);
                }
            }
        });
        this.mAnimation = animation;
    }

    private void updateRingColor(float f, Ring ring) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6958625a", new Object[]{this, new Float(f), ring});
        } else if (f > 0.75f) {
            ring.setColor(evaluateColorChange((f - 0.75f) / 0.25f, ring.getStartingColor(), ring.getNextColor()));
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
        int save = canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        this.mRing.draw(canvas, bounds);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c822", new Object[]{this})).intValue();
        }
        return this.mRing.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        return (int) this.mHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        return (int) this.mWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        ArrayList<Animation> arrayList = this.mAnimators;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            this.mRing.setAlpha(i);
        }
    }

    public void setArrowScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657cad36", new Object[]{this, new Float(f)});
        } else {
            this.mRing.setArrowScale(f);
        }
    }

    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.mRing.setBackgroundColor(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            this.mRing.setColorFilter(colorFilter);
        }
    }

    public void setColorSchemeColors(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbbd778b", new Object[]{this, iArr});
            return;
        }
        this.mRing.setColors(iArr);
        this.mRing.setColorIndex(0);
    }

    public void setProgressRotation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a706ec", new Object[]{this, new Float(f)});
        } else {
            this.mRing.setRotation(f);
        }
    }

    public void setRotation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8c8619", new Object[]{this, new Float(f)});
            return;
        }
        this.mRotation = f;
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
    }

    public void showArrow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51747a1", new Object[]{this, new Boolean(z)});
        } else {
            this.mRing.setShowArrow(z);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        this.mAnimation.reset();
        this.mRing.storeOriginals();
        if (this.mRing.getEndTrim() != this.mRing.getStartTrim()) {
            this.mFinishing = true;
            this.mAnimation.setDuration(666L);
            this.mParent.startAnimation(this.mAnimation);
            return;
        }
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        this.mAnimation.setDuration(1332L);
        this.mParent.startAnimation(this.mAnimation);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.mParent.clearAnimation();
        setRotation(0.0f);
        this.mRing.setShowArrow(false);
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
    }

    public void updateSizes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678957b3", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            setSizeParameters(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            setSizeParameters(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }
}
