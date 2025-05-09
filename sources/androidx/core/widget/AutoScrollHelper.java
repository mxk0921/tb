package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
    private static final int DEFAULT_EDGE_TYPE = 1;
    private static final float DEFAULT_MAXIMUM_EDGE = Float.MAX_VALUE;
    private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
    private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
    private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
    private static final int DEFAULT_RAMP_UP_DURATION = 500;
    private static final float DEFAULT_RELATIVE_EDGE = 0.2f;
    private static final float DEFAULT_RELATIVE_VELOCITY = 1.0f;
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    private static final int HORIZONTAL = 0;
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    private static final int VERTICAL = 1;
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    public boolean mAnimating;
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    public boolean mNeedsCancel;
    public boolean mNeedsReset;
    private Runnable mRunnable;
    public final View mTarget;
    public final ClampedScroller mScroller = new ClampedScroller();
    private final Interpolator mEdgeInterpolator = new AccelerateInterpolator();
    private float[] mRelativeEdges = {0.0f, 0.0f};
    private float[] mMaximumEdges = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] mRelativeVelocity = {0.0f, 0.0f};
    private float[] mMinimumVelocity = {0.0f, 0.0f};
    private float[] mMaximumVelocity = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ClampedScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mEffectiveRampDown;
        private int mRampDownDuration;
        private int mRampUpDuration;
        private float mStopValue;
        private float mTargetVelocityX;
        private float mTargetVelocityY;
        private long mStartTime = Long.MIN_VALUE;
        private long mStopTime = -1;
        private long mDeltaTime = 0;
        private int mDeltaX = 0;
        private int mDeltaY = 0;

        private float getValueAt(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c98667f", new Object[]{this, new Long(j)})).floatValue();
            }
            long j2 = this.mStartTime;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.mStopTime;
            if (j3 < 0 || j < j3) {
                return AutoScrollHelper.constrain(((float) (j - j2)) / this.mRampUpDuration, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.mStopValue;
            return (1.0f - f) + (f * AutoScrollHelper.constrain(((float) (j - j3)) / this.mEffectiveRampDown, 0.0f, 1.0f));
        }

        private float interpolateValue(float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d4594919", new Object[]{this, new Float(f)})).floatValue() : ((-4.0f) * f * f) + (f * 4.0f);
        }

        public void computeScrollDelta() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9f10ebb", new Object[]{this});
            } else if (this.mDeltaTime != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float interpolateValue = interpolateValue(getValueAt(currentAnimationTimeMillis));
                this.mDeltaTime = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.mDeltaTime)) * interpolateValue;
                this.mDeltaX = (int) (this.mTargetVelocityX * f);
                this.mDeltaY = (int) (f * this.mTargetVelocityY);
            } else {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }

        public int getDeltaX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fb62810", new Object[]{this})).intValue();
            }
            return this.mDeltaX;
        }

        public int getDeltaY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fc43f91", new Object[]{this})).intValue();
            }
            return this.mDeltaY;
        }

        public int getHorizontalDirection() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("68d59a7f", new Object[]{this})).intValue();
            }
            float f = this.mTargetVelocityX;
            return (int) (f / Math.abs(f));
        }

        public int getVerticalDirection() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9bc09eed", new Object[]{this})).intValue();
            }
            float f = this.mTargetVelocityY;
            return (int) (f / Math.abs(f));
        }

        public boolean isFinished() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
            }
            if (this.mStopTime <= 0 || AnimationUtils.currentAnimationTimeMillis() <= this.mStopTime + this.mEffectiveRampDown) {
                return false;
            }
            return true;
        }

        public void requestStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("751338", new Object[]{this});
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mEffectiveRampDown = AutoScrollHelper.constrain((int) (currentAnimationTimeMillis - this.mStartTime), 0, this.mRampDownDuration);
            this.mStopValue = getValueAt(currentAnimationTimeMillis);
            this.mStopTime = currentAnimationTimeMillis;
        }

        public void setRampDownDuration(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10618f92", new Object[]{this, new Integer(i)});
            } else {
                this.mRampDownDuration = i;
            }
        }

        public void setRampUpDuration(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bcda539", new Object[]{this, new Integer(i)});
            } else {
                this.mRampUpDuration = i;
            }
        }

        public void setTargetVelocity(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32bf7157", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            this.mTargetVelocityX = f;
            this.mTargetVelocityY = f2;
        }

        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mStartTime = currentAnimationTimeMillis;
            this.mStopTime = -1L;
            this.mDeltaTime = currentAnimationTimeMillis;
            this.mStopValue = 0.5f;
            this.mDeltaX = 0;
            this.mDeltaY = 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ScrollAnimationRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ScrollAnimationRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (autoScrollHelper.mAnimating) {
                if (autoScrollHelper.mNeedsReset) {
                    autoScrollHelper.mNeedsReset = false;
                    autoScrollHelper.mScroller.start();
                }
                ClampedScroller clampedScroller = AutoScrollHelper.this.mScroller;
                if (clampedScroller.isFinished() || !AutoScrollHelper.this.shouldAnimate()) {
                    AutoScrollHelper.this.mAnimating = false;
                    return;
                }
                AutoScrollHelper autoScrollHelper2 = AutoScrollHelper.this;
                if (autoScrollHelper2.mNeedsCancel) {
                    autoScrollHelper2.mNeedsCancel = false;
                    autoScrollHelper2.cancelTargetTouch();
                }
                clampedScroller.computeScrollDelta();
                AutoScrollHelper.this.scrollTargetBy(clampedScroller.getDeltaX(), clampedScroller.getDeltaY());
                ViewCompat.postOnAnimation(AutoScrollHelper.this.mTarget, this);
            }
        }
    }

    public AutoScrollHelper(View view) {
        this.mTarget = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        setMaximumVelocity(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        setMinimumVelocity(f3, f3);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(DEFAULT_ACTIVATION_DELAY);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    private float computeTargetVelocity(int i, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94840779", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        float edgeValue = getEdgeValue(this.mRelativeEdges[i], f2, this.mMaximumEdges[i], f);
        int i2 = (edgeValue > 0.0f ? 1 : (edgeValue == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.mRelativeVelocity[i];
        float f5 = this.mMinimumVelocity[i];
        float f6 = this.mMaximumVelocity[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return constrain(edgeValue * f7, f5, f6);
        }
        return -constrain((-edgeValue) * f7, f5, f6);
    }

    public static float constrain(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa4d6c72", new Object[]{new Float(f), new Float(f2), new Float(f3)})).floatValue() : f > f3 ? f3 : f < f2 ? f2 : f;
    }

    private float constrainEdgeValue(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cca42f4", new Object[]{this, new Float(f), new Float(f2)})).floatValue();
        }
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.mEdgeType;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.mAnimating && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    private float getEdgeValue(float f, float f2, float f3, float f4) {
        float f5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f039adf5", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).floatValue();
        }
        float constrain = constrain(f * f2, 0.0f, f3);
        float constrainEdgeValue = constrainEdgeValue(f2 - f4, constrain) - constrainEdgeValue(f4, constrain);
        if (constrainEdgeValue < 0.0f) {
            f5 = -this.mEdgeInterpolator.getInterpolation(-constrainEdgeValue);
        } else if (constrainEdgeValue <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.mEdgeInterpolator.getInterpolation(constrainEdgeValue);
        }
        return constrain(f5, -1.0f, 1.0f);
    }

    private void requestStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751338", new Object[]{this});
        } else if (this.mNeedsReset) {
            this.mAnimating = false;
        } else {
            this.mScroller.requestStop();
        }
    }

    private void startAnimating() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5581dba3", new Object[]{this});
            return;
        }
        if (this.mRunnable == null) {
            this.mRunnable = new ScrollAnimationRunnable();
        }
        this.mAnimating = true;
        this.mNeedsReset = true;
        if (this.mAlreadyDelayed || (i = this.mActivationDelay) <= 0) {
            this.mRunnable.run();
        } else {
            ViewCompat.postOnAnimationDelayed(this.mTarget, this.mRunnable, i);
        }
        this.mAlreadyDelayed = true;
    }

    public abstract boolean canTargetScrollHorizontally(int i);

    public abstract boolean canTargetScrollVertically(int i);

    public void cancelTargetTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601313db", new Object[]{this});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.mTarget.onTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.mEnabled;
    }

    public boolean isExclusive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8801b1f", new Object[]{this})).booleanValue();
        }
        return this.mExclusive;
    }

    public abstract void scrollTargetBy(int i, int i2);

    public AutoScrollHelper setActivationDelay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollHelper) ipChange.ipc$dispatch("1e737297", new Object[]{this, new Integer(i)});
        }
        this.mActivationDelay = i;
        return this;
    }

    public AutoScrollHelper setEdgeType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollHelper) ipChange.ipc$dispatch("8717e609", new Object[]{this, new Integer(i)});
        }
        this.mEdgeType = i;
        return this;
    }

    public AutoScrollHelper setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollHelper) ipChange.ipc$dispatch("ff44b1f4", new Object[]{this, new Boolean(z)});
        }
        if (this.mEnabled && !z) {
            requestStop();
        }
        this.mEnabled = z;
        return this;
    }

    public AutoScrollHelper setExclusive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollHelper) ipChange.ipc$dispatch("3c45edf7", new Object[]{this, new Boolean(z)});
        }
        this.mExclusive = z;
        return this;
    }

    public AutoScrollHelper setMaximumEdges(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollHelper) ipChange.ipc$dispatch("27743585", new Object[]{this, new Float(f), new Float(f2)});
        }
        float[] fArr = this.mMaximumEdges;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public AutoScrollHelper setMaximumVelocity(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollHelper) ipChange.ipc$dispatch("bc6ef9c8", new Object[]{this, new Float(f), new Float(f2)});
        }
        float[] fArr = this.mMaximumVelocity;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public AutoScrollHelper setMinimumVelocity(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollHelper) ipChange.ipc$dispatch("ac0f58b6", new Object[]{this, new Float(f), new Float(f2)});
        }
        float[] fArr = this.mMinimumVelocity;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public AutoScrollHelper setRampDownDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollHelper) ipChange.ipc$dispatch("521a5c78", new Object[]{this, new Integer(i)});
        }
        this.mScroller.setRampDownDuration(i);
        return this;
    }

    public AutoScrollHelper setRampUpDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollHelper) ipChange.ipc$dispatch("206ffcdf", new Object[]{this, new Integer(i)});
        }
        this.mScroller.setRampUpDuration(i);
        return this;
    }

    public AutoScrollHelper setRelativeVelocity(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollHelper) ipChange.ipc$dispatch("82193bb8", new Object[]{this, new Float(f), new Float(f2)});
        }
        float[] fArr = this.mRelativeVelocity;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public boolean shouldAnimate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58217339", new Object[]{this})).booleanValue();
        }
        ClampedScroller clampedScroller = this.mScroller;
        int verticalDirection = clampedScroller.getVerticalDirection();
        int horizontalDirection = clampedScroller.getHorizontalDirection();
        if ((verticalDirection == 0 || !canTargetScrollVertically(verticalDirection)) && (horizontalDirection == 0 || !canTargetScrollHorizontally(horizontalDirection))) {
            return false;
        }
        return true;
    }

    public static int constrain(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa791b58", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public AutoScrollHelper setRelativeEdges(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoScrollHelper) ipChange.ipc$dispatch("d112b995", new Object[]{this, new Float(f), new Float(f2)});
        }
        float[] fArr = this.mRelativeEdges;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r4 != 3) goto L_0x0074;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.core.widget.AutoScrollHelper.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0020
            java.lang.String r5 = "d4aa3aa4"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            java.lang.Object r7 = r4.ipc$dispatch(r5, r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0020:
            boolean r4 = r6.mEnabled
            if (r4 != 0) goto L_0x0025
            return r2
        L_0x0025:
            int r4 = r8.getActionMasked()
            if (r4 == 0) goto L_0x0036
            if (r4 == r1) goto L_0x0032
            if (r4 == r0) goto L_0x003a
            if (r4 == r3) goto L_0x0032
            goto L_0x0074
        L_0x0032:
            r6.requestStop()
            goto L_0x0074
        L_0x0036:
            r6.mNeedsCancel = r1
            r6.mAlreadyDelayed = r2
        L_0x003a:
            float r0 = r8.getX()
            int r3 = r7.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r6.mTarget
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r6.computeTargetVelocity(r2, r0, r3, r4)
            float r8 = r8.getY()
            int r7 = r7.getHeight()
            float r7 = (float) r7
            android.view.View r3 = r6.mTarget
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r7 = r6.computeTargetVelocity(r1, r8, r7, r3)
            androidx.core.widget.AutoScrollHelper$ClampedScroller r8 = r6.mScroller
            r8.setTargetVelocity(r0, r7)
            boolean r7 = r6.mAnimating
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.shouldAnimate()
            if (r7 == 0) goto L_0x0074
            r6.startAnimating()
        L_0x0074:
            boolean r7 = r6.mExclusive
            if (r7 == 0) goto L_0x007d
            boolean r7 = r6.mAnimating
            if (r7 == 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
