package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import tb.pg1;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    public static final int EASE_IN = 1;
    public static final int EASE_IN_OUT = 0;
    public static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    public static final int LINEAR = 3;
    public static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    public String[] mAttributeTable;
    private HashMap<String, ViewSpline> mAttributesMap;
    public String mConstraintTag;
    public float mCurrentCenterX;
    public float mCurrentCenterY;
    private HashMap<String, ViewOscillator> mCycleMap;
    public int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private int mPathMotionArc;
    private int mQuantizeMotionSteps;
    private CurveFit[] mSpline;
    private HashMap<String, ViewTimeCycle> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    public View mView;
    public Rect mTempRect = new Rect();
    public boolean mForceMeasure = false;
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    public float mMotionStagger = Float.NaN;
    public float mStaggerOffset = 0.0f;
    public float mStaggerScale = 1.0f;
    private int mMaxDimension = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<Key> mKeyList = new ArrayList<>();
    private View mTransformPivotView = null;
    private float mQuantizeMotionPhase = Float.NaN;
    private Interpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    public MotionController(View view) {
        int i = Key.UNSET;
        this.mPathMotionArc = i;
        this.mTransformPivotTarget = i;
        this.mQuantizeMotionSteps = i;
        setView(view);
    }

    private float getAdjustedPosition(float f, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a34025c7", new Object[]{this, new Float(f), fArr})).floatValue();
        }
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.mStaggerScale;
            if (f4 != 1.0d) {
                float f5 = this.mStaggerOffset;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && f < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        float f6 = Float.NaN;
        while (it.hasNext()) {
            MotionPaths next = it.next();
            Easing easing2 = next.mKeyFrameEasing;
            if (easing2 != null) {
                float f7 = next.mTime;
                if (f7 < f) {
                    easing = easing2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.mTime;
                }
            }
        }
        if (easing != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (f - f2) / f8;
            f = (((float) easing.get(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d);
            }
        }
        return f;
    }

    private static Interpolator getInterpolator(Context context, int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("72946eaf", new Object[]{context, new Integer(i), str, new Integer(i2)});
        }
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            final Easing interpolator = Easing.getInterpolator(str);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
                    }
                    return (float) Easing.this.get(f);
                }
            };
        } else if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        } else {
            if (i == 1) {
                return new AccelerateInterpolator();
            }
            if (i == 2) {
                return new DecelerateInterpolator();
            }
            if (i == 4) {
                return new BounceInterpolator();
            }
            if (i != 5) {
                return null;
            }
            return new OvershootInterpolator();
        }
    }

    private void insertKey(MotionPaths motionPaths) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b124e2f0", new Object[]{this, motionPaths});
            return;
        }
        int binarySearch = Collections.binarySearch(this.mMotionPaths, motionPaths);
        if (binarySearch == 0) {
            Log.e(TAG, " KeyPath position \"" + motionPaths.mPosition + "\" outside of range");
        }
        this.mMotionPaths.add((-binarySearch) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487c641b", new Object[]{this, motionPaths});
        } else {
            motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
        }
    }

    public void addKey(Key key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7fa7f1", new Object[]{this, key});
        } else {
            this.mKeyList.add(key);
        }
    }

    public void addKeys(ArrayList<Key> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd192ee", new Object[]{this, arrayList});
        } else {
            this.mKeyList.addAll(arrayList);
        }
    }

    public int buildKeyBounds(float[] fArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1fc6239", new Object[]{this, fArr, iArr})).intValue();
        }
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (double d : timePoints) {
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba806f2a", new Object[]{this, fArr, iArr})).intValue();
        }
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < timePoints.length; i3++) {
            this.mSpline[0].getPos(timePoints[i3], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i3], this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    public void buildRect(float f, float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fffed51", new Object[]{this, new Float(f), fArr, new Integer(i)});
            return;
        }
        this.mSpline[0].getPos(getAdjustedPosition(f, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i);
    }

    public void buildRectangles(float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("558c1c7f", new Object[]{this, fArr, new Integer(i)});
            return;
        }
        float f = 1.0f / (i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            this.mSpline[0].getPos(getAdjustedPosition(i2 * f, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i2 * 8);
        }
    }

    public void endTrigger(boolean z) {
        float f;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c968a8f0", new Object[]{this, new Boolean(z)});
        } else if (pg1.ATOM_EXT_button.equals(Debug.getName(this.mView)) && this.mKeyTriggers != null) {
            while (true) {
                KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                if (i < keyTriggerArr.length) {
                    KeyTrigger keyTrigger = keyTriggerArr[i];
                    if (z) {
                        f = -100.0f;
                    } else {
                        f = 100.0f;
                    }
                    keyTrigger.conditionallyFire(f, this.mView);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public int getAnimateRelativeTo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94082eec", new Object[]{this})).intValue();
        }
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public void getCenter(double d, float[] fArr, float[] fArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc679f02", new Object[]{this, new Double(d), fArr, fArr2});
            return;
        }
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d, dArr);
        this.mSpline[0].getSlope(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cfc8064", new Object[]{this})).floatValue();
        }
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d0a97e5", new Object[]{this})).floatValue();
        }
        return this.mCurrentCenterY;
    }

    public void getDpDt(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("563498f2", new Object[]{this, new Float(f), new Float(f2), new Float(f3), fArr});
            return;
        }
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d = adjustedPosition;
            curveFitArr[0].getSlope(d, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * f4;
                i++;
            }
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d, dArr2);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        float f5 = motionPaths.mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f6 = f5 - motionPaths2.mX;
        float f7 = motionPaths.mY - motionPaths2.mY;
        float f8 = (motionPaths.mWidth - motionPaths2.mWidth) + f6;
        float f9 = (motionPaths.mHeight - motionPaths2.mHeight) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    public int getDrawPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("792dedf9", new Object[]{this})).intValue();
        }
        int i = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().mDrawPath);
        }
        return Math.max(i, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c72bdfe", new Object[]{this})).floatValue();
        }
        return this.mEndMotionPath.mHeight;
    }

    public float getFinalWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf9cf5d", new Object[]{this})).floatValue();
        }
        return this.mEndMotionPath.mWidth;
    }

    public float getFinalX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ecc090f", new Object[]{this})).floatValue();
        }
        return this.mEndMotionPath.mX;
    }

    public float getFinalY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7eda2090", new Object[]{this})).floatValue();
        }
        return this.mEndMotionPath.mY;
    }

    public MotionPaths getKeyFrame(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionPaths) ipChange.ipc$dispatch("7bb1d845", new Object[]{this, new Integer(i)});
        }
        return this.mMotionPaths.get(i);
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e3c2c8b", new Object[]{this, new Integer(i), iArr})).intValue();
        }
        float[] fArr = new float[2];
        Iterator<Key> it = this.mKeyList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            int i4 = next.mType;
            if (i4 == i || i != -1) {
                iArr[i3] = 0;
                iArr[i3 + 1] = i4;
                int i5 = next.mFramePosition;
                iArr[i3 + 2] = i5;
                double d = i5 / 100.0f;
                this.mSpline[0].getPos(d, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i3 + 3] = Float.floatToIntBits(fArr[0]);
                int i6 = i3 + 4;
                iArr[i6] = Float.floatToIntBits(fArr[1]);
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    iArr[i3 + 5] = keyPosition.mPositionType;
                    iArr[i3 + 6] = Float.floatToIntBits(keyPosition.mPercentX);
                    i6 = i3 + 7;
                    iArr[i6] = Float.floatToIntBits(keyPosition.mPercentY);
                }
                int i7 = i6 + 1;
                iArr[i3] = i7 - i3;
                i2++;
                i3 = i7;
            }
        }
        return i2;
    }

    public float getKeyFrameParameter(int i, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29625467", new Object[]{this, new Integer(i), new Float(f), new Float(f2)})).floatValue();
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        float f3 = motionPaths.mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f4 = motionPaths2.mX;
        float f5 = f3 - f4;
        float f6 = motionPaths.mY;
        float f7 = motionPaths2.mY;
        float f8 = f6 - f7;
        float f9 = f4 + (motionPaths2.mWidth / 2.0f);
        float f10 = f7 + (motionPaths2.mHeight / 2.0f);
        float hypot = (float) Math.hypot(f5, f8);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot(f11, f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f11 * f5) + (f12 * f8);
        if (i == 0) {
            return f13 / hypot;
        }
        if (i == 1) {
            return (float) Math.sqrt((hypot * hypot) - (f13 * f13));
        }
        if (i == 2) {
            return f11 / f5;
        }
        if (i == 3) {
            return f12 / f5;
        }
        if (i == 4) {
            return f11 / f8;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f12 / f8;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7553759", new Object[]{this, iArr, fArr})).intValue();
        }
        Iterator<Key> it = this.mKeyList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            int i3 = next.mFramePosition;
            iArr[i] = (next.mType * 1000) + i3;
            double d = i3 / 100.0f;
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    public KeyPositionBase getPositionKeyframe(int i, int i2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyPositionBase) ipChange.ipc$dispatch("68987320", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Float(f2)});
        }
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f3 = motionPaths.mX;
        rectF.left = f3;
        float f4 = motionPaths.mY;
        rectF.top = f4;
        rectF.right = f3 + motionPaths.mWidth;
        rectF.bottom = f4 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f5 = motionPaths2.mX;
        rectF2.left = f5;
        float f6 = motionPaths2.mY;
        rectF2.top = f6;
        rectF2.right = f5 + motionPaths2.mWidth;
        rectF2.bottom = f6 + motionPaths2.mHeight;
        Iterator<Key> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            Key next = it.next();
            if (next instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) next;
                if (keyPositionBase.intersects(i, i2, rectF, rectF2, f, f2)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    public float getStartHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae6909ea", new Object[]{this})).floatValue();
        }
        return this.mStartMotionPath.mHeight;
    }

    public float getStartWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d65455f1", new Object[]{this})).floatValue();
        }
        return this.mStartMotionPath.mWidth;
    }

    public float getStartX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ff8f9a3", new Object[]{this})).floatValue();
        }
        return this.mStartMotionPath.mX;
    }

    public float getStartY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90071124", new Object[]{this})).floatValue();
        }
        return this.mStartMotionPath.mY;
    }

    public int getTransformPivotTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92a9bd7", new Object[]{this})).intValue();
        }
        return this.mTransformPivotTarget;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mView;
    }

    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f, float f2, String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f35c1a2", new Object[]{this, view, keyPositionBase, new Float(f), new Float(f2), strArr, fArr});
            return;
        }
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f3 = motionPaths.mX;
        rectF.left = f3;
        float f4 = motionPaths.mY;
        rectF.top = f4;
        rectF.right = f3 + motionPaths.mWidth;
        rectF.bottom = f4 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f5 = motionPaths2.mX;
        rectF2.left = f5;
        float f6 = motionPaths2.mY;
        rectF2.top = f6;
        rectF2.right = f5 + motionPaths2.mWidth;
        rectF2.bottom = f6 + motionPaths2.mHeight;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f, f2, strArr, fArr);
    }

    public void rotate(Rect rect, Rect rect2, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7bcaa1", new Object[]{this, rect, rect2, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((i4 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((i6 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 4) {
            int i7 = rect.left + rect.right;
            rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
            rect2.top = (i7 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
    }

    public void setBothStates(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42753866", new Object[]{this, view});
            return;
        }
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mEndMotionPath.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
        this.mEndPoint.setState(view);
    }

    public void setDrawPath(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f66ac31", new Object[]{this, new Integer(i)});
        } else {
            this.mStartMotionPath.mDrawPath = i;
        }
    }

    public void setEndState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a393a3cd", new Object[]{this, rect, constraintSet, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            rotate(rect, this.mTempRect, i3, i, i2);
            rect = this.mTempRect;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.mTime = 1.0f;
        motionPaths.mPosition = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(rect, constraintSet, i3, this.mId);
    }

    public void setPathMotionArc(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("164325a7", new Object[]{this, new Integer(i)});
        } else {
            this.mPathMotionArc = i;
        }
    }

    public void setStartCurrentState(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37882a13", new Object[]{this, view});
            return;
        }
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ViewState viewState, View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21da7541", new Object[]{this, viewState, view, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        Rect rect = new Rect();
        if (i == 1) {
            int i4 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i2 - ((i4 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        } else if (i == 2) {
            int i5 = viewState.left + viewState.right;
            rect.left = i3 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
            rect.top = (i5 - viewState.height()) / 2;
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, view, i, viewState.rotation);
    }

    public void setTransformPivotTarget(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f5ac13", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTransformPivotTarget = i;
        this.mTransformPivotView = null;
    }

    public void setView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
            return;
        }
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public void setup(int i, int i2, float f, long j) {
        HashMap<String, Integer> hashMap;
        ArrayList arrayList;
        HashSet<String> hashSet;
        String[] strArr;
        boolean z;
        MotionPaths motionPaths;
        int i3;
        int i4;
        int i5;
        ConstraintAttribute constraintAttribute;
        int i6;
        ViewTimeCycle viewTimeCycle;
        ConstraintAttribute constraintAttribute2;
        int i7;
        Integer num;
        ViewSpline viewSpline;
        ConstraintAttribute constraintAttribute3;
        HashMap<String, Integer> hashMap2;
        HashSet<String> hashSet2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("983b25e8", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Long(j)});
            return;
        }
        new HashSet();
        HashSet<String> hashSet3 = new HashSet<>();
        HashSet<String> hashSet4 = new HashSet<>();
        HashSet<String> hashSet5 = new HashSet<>();
        HashMap<String, Integer> hashMap3 = new HashMap<>();
        int i8 = this.mPathMotionArc;
        if (i8 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i8;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet4);
        ArrayList<Key> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<Key> it = arrayList2.iterator();
            ArrayList arrayList3 = null;
            while (it.hasNext()) {
                Key next = it.next();
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    hashMap2 = hashMap3;
                    hashSet2 = hashSet5;
                    insertKey(new MotionPaths(i, i2, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i9 = keyPosition.mCurveFit;
                    if (i9 != Key.UNSET) {
                        this.mCurveFitType = i9;
                    }
                } else {
                    hashMap2 = hashMap3;
                    hashSet2 = hashSet5;
                    if (next instanceof KeyCycle) {
                        next.getAttributeNames(hashSet2);
                    } else if (next instanceof KeyTimeCycle) {
                        next.getAttributeNames(hashSet3);
                    } else if (next instanceof KeyTrigger) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add((KeyTrigger) next);
                        arrayList3 = arrayList3;
                    } else {
                        next.setInterpolation(hashMap2);
                        next.getAttributeNames(hashSet4);
                    }
                }
                hashSet5 = hashSet2;
                hashMap3 = hashMap2;
            }
            hashMap = hashMap3;
            hashSet = hashSet5;
            arrayList = arrayList3;
        } else {
            hashMap = hashMap3;
            hashSet = hashSet5;
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        if (!hashSet4.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it2 = hashSet4.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<Key> it3 = this.mKeyList.iterator();
                    while (it3.hasNext()) {
                        Key next3 = it3.next();
                        HashMap<String, ConstraintAttribute> hashMap4 = next3.mCustomConstraints;
                        if (!(hashMap4 == null || (constraintAttribute3 = hashMap4.get(str)) == null)) {
                            sparseArray.append(next3.mFramePosition, constraintAttribute3);
                        }
                    }
                    viewSpline = ViewSpline.makeCustomSpline(next2, sparseArray);
                } else {
                    viewSpline = ViewSpline.makeSpline(next2);
                }
                if (viewSpline != null) {
                    viewSpline.setType(next2);
                    this.mAttributesMap.put(next2, viewSpline);
                }
            }
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<Key> it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    Key next4 = it4.next();
                    if (next4 instanceof KeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                if (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) {
                    i7 = 0;
                } else {
                    i7 = num.intValue();
                }
                ViewSpline viewSpline2 = this.mAttributesMap.get(str2);
                if (viewSpline2 != null) {
                    viewSpline2.setup(i7);
                }
            }
        }
        if (!hashSet3.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it5 = hashSet3.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<Key> it6 = this.mKeyList.iterator();
                        while (it6.hasNext()) {
                            Key next6 = it6.next();
                            HashMap<String, ConstraintAttribute> hashMap5 = next6.mCustomConstraints;
                            if (!(hashMap5 == null || (constraintAttribute2 = hashMap5.get(str3)) == null)) {
                                sparseArray2.append(next6.mFramePosition, constraintAttribute2);
                            }
                        }
                        viewTimeCycle = ViewTimeCycle.makeCustomSpline(next5, sparseArray2);
                    } else {
                        viewTimeCycle = ViewTimeCycle.makeSpline(next5, j);
                    }
                    if (viewTimeCycle != null) {
                        viewTimeCycle.setType(next5);
                        this.mTimeCycleAttributesMap.put(next5, viewTimeCycle);
                    }
                }
            }
            ArrayList<Key> arrayList5 = this.mKeyList;
            if (arrayList5 != null) {
                Iterator<Key> it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    Key next7 = it7.next();
                    if (next7 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i6 = hashMap.get(str4).intValue();
                } else {
                    i6 = 0;
                }
                this.mTimeCycleAttributesMap.get(str4).setup(i6);
            }
        }
        int size = this.mMotionPaths.size();
        int i10 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i10];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it8 = this.mMotionPaths.iterator();
        int i11 = 1;
        while (it8.hasNext()) {
            motionPathsArr[i11] = it8.next();
            i11++;
        }
        HashSet hashSet6 = new HashSet();
        for (String str5 : this.mEndMotionPath.mAttributes.keySet()) {
            if (this.mStartMotionPath.mAttributes.containsKey(str5)) {
                if (!hashSet4.contains("CUSTOM," + str5)) {
                    hashSet6.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet6.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i12 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i12 >= strArr.length) {
                break;
            }
            String str6 = strArr[i12];
            this.mAttributeInterpolatorCount[i12] = 0;
            int i13 = 0;
            while (true) {
                if (i13 >= i10) {
                    break;
                }
                if (motionPathsArr[i13].mAttributes.containsKey(str6) && (constraintAttribute = motionPathsArr[i13].mAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i12] = iArr[i12] + constraintAttribute.numberOfInterpolatedValues();
                    break;
                }
                i13++;
            }
            i12++;
        }
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            z = true;
        } else {
            z = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i14 = 1; i14 < i10; i14++) {
            motionPathsArr[i14].different(motionPathsArr[i14 - 1], zArr, this.mAttributeNames, z);
        }
        int i15 = 0;
        for (int i16 = 1; i16 < length; i16++) {
            if (zArr[i16]) {
                i15++;
            }
        }
        this.mInterpolateVariables = new int[i15];
        int max = Math.max(2, i15);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i17 = 0;
        int i18 = 1;
        while (i18 < length) {
            if (zArr[i18]) {
                i5 = 1;
                this.mInterpolateVariables[i17] = i18;
                i17++;
            } else {
                i5 = 1;
            }
            i18 += i5;
        }
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, i10, this.mInterpolateVariables.length);
        double[] dArr2 = new double[i10];
        for (int i19 = 0; i19 < i10; i19++) {
            motionPathsArr[i19].fillStandard(dArr[i19], this.mInterpolateVariables);
            dArr2[i19] = motionPathsArr[i19].mTime;
        }
        int i20 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i20 >= iArr2.length) {
                break;
            }
            if (iArr2[i20] < MotionPaths.sNames.length) {
                String str7 = MotionPaths.sNames[this.mInterpolateVariables[i20]] + " [";
                for (int i21 = 0; i21 < i10; i21++) {
                    str7 = str7 + dArr[i21][i20];
                }
            }
            i20++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i22 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i22 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i22];
            double[] dArr3 = null;
            double[][] dArr4 = null;
            int i23 = 0;
            int i24 = 0;
            while (i23 < i10) {
                if (motionPathsArr[i23].hasCustomData(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i10];
                        i4 = 0;
                        dArr4 = (double[][]) Array.newInstance(Double.TYPE, i10, motionPathsArr[i23].getCustomDataCount(str8));
                    } else {
                        i4 = 0;
                    }
                    MotionPaths motionPaths2 = motionPathsArr[i23];
                    dArr3[i24] = motionPaths2.mTime;
                    motionPaths2.getCustomData(str8, dArr4[i24], i4);
                    i3 = 1;
                    i24++;
                } else {
                    i3 = 1;
                }
                i23 += i3;
            }
            i22++;
            this.mSpline[i22] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i24), (double[][]) Arrays.copyOf(dArr4, i24));
        }
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr3 = new int[i10];
            double[] dArr5 = new double[i10];
            double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, i10, 2);
            for (int i25 = 0; i25 < i10; i25++) {
                iArr3[i25] = motionPathsArr[i25].mPathMotionArc;
                dArr5[i25] = motionPaths.mTime;
                double[] dArr7 = dArr6[i25];
                dArr7[0] = motionPaths.mX;
                dArr7[1] = motionPaths.mY;
            }
            this.mArcSpline = CurveFit.getArc(iArr3, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it9 = hashSet.iterator();
            float f2 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                ViewOscillator makeSpline = ViewOscillator.makeSpline(next8);
                if (makeSpline != null) {
                    if (makeSpline.variesByPath() && Float.isNaN(f2)) {
                        f2 = getPreCycleDistance();
                    }
                    makeSpline.setType(next8);
                    this.mCycleMap.put(next8, makeSpline);
                }
            }
            Iterator<Key> it10 = this.mKeyList.iterator();
            while (it10.hasNext()) {
                Key next9 = it10.next();
                if (next9 instanceof KeyCycle) {
                    ((KeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            for (ViewOscillator viewOscillator : this.mCycleMap.values()) {
                viewOscillator.setup(f2);
            }
        }
    }

    public void setupRelative(MotionController motionController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbaf0bd9", new Object[]{this, motionController});
            return;
        }
        this.mStartMotionPath.setupRelative(motionController, motionController.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motionController, motionController.mEndMotionPath);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return " start: x: " + this.mStartMotionPath.mX + " y: " + this.mStartMotionPath.mY + " end: x: " + this.mEndMotionPath.mX + " y: " + this.mEndMotionPath.mY;
    }

    public double[] getPos(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (double[]) ipChange.ipc$dispatch("fc3f3bc6", new Object[]{this, new Double(d)});
        }
        this.mSpline[0].getPos(d, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d, dArr);
            }
        }
        return this.mInterpolateData;
    }

    public void remeasure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3446ed2", new Object[]{this});
        } else {
            this.mForceMeasure = true;
        }
    }

    public int getAttributeValues(String str, float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f658c4b2", new Object[]{this, str, fArr, new Integer(i)})).intValue();
        }
        ViewSpline viewSpline = this.mAttributesMap.get(str);
        if (viewSpline == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = viewSpline.get(i2 / (fArr.length - 1));
        }
        return fArr.length;
    }

    private float getPreCycleDistance() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d45c5605", new Object[]{this})).floatValue();
        }
        float[] fArr = new float[2];
        float f2 = 1.0f / 99;
        double d = vu3.b.GEO_NOT_SUPPORT;
        double d2 = 0.0d;
        float f3 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f4 = i * f2;
            double d3 = f4;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f5 = Float.NaN;
            float f6 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f7 = next.mTime;
                    if (f7 < f4) {
                        f6 = f7;
                        easing = easing2;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.mTime;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                d3 = (((float) easing.get((f4 - f6) / f)) * (f5 - f6)) + f6;
            }
            this.mSpline[0].getPos(d3, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d3, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i > 0) {
                f3 += (float) Math.hypot(d2 - fArr[1], d - fArr[0]);
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildPath(float[] r29, int r30) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionController.buildPath(float[], int):void");
    }

    public boolean interpolate(View view, float f, long j, KeyCache keyCache) {
        boolean z;
        ViewTimeCycle.PathRotate pathRotate;
        float f2;
        double d;
        View view2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6710cf5", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
        }
        float adjustedPosition = getAdjustedPosition(f, null);
        int i = this.mQuantizeMotionSteps;
        if (i != Key.UNSET) {
            float f4 = 1.0f / i;
            float floor = ((float) Math.floor(adjustedPosition / f4)) * f4;
            float f5 = (adjustedPosition % f4) / f4;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f5 = (f5 + this.mQuantizeMotionPhase) % 1.0f;
            }
            Interpolator interpolator = this.mQuantizeMotionInterpolator;
            if (interpolator != null) {
                f3 = interpolator.getInterpolation(f5);
            } else {
                f3 = ((double) f5) > 0.5d ? 1.0f : 0.0f;
            }
            adjustedPosition = (f3 * f4) + floor;
        }
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            for (ViewSpline viewSpline : hashMap.values()) {
                viewSpline.setProperty(view, adjustedPosition);
            }
        }
        HashMap<String, ViewTimeCycle> hashMap2 = this.mTimeCycleAttributesMap;
        if (hashMap2 != null) {
            pathRotate = null;
            z = false;
            for (ViewTimeCycle viewTimeCycle : hashMap2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    z |= viewTimeCycle.setProperty(view, adjustedPosition, j, keyCache);
                }
            }
        } else {
            pathRotate = null;
            z = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d2 = adjustedPosition;
            curveFitArr[0].getPos(d2, this.mInterpolateData);
            this.mSpline[0].getSlope(d2, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                    this.mArcSpline.getSlope(d2, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                d = d2;
                f2 = adjustedPosition;
                this.mStartMotionPath.setView(adjustedPosition, view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null, this.mForceMeasure);
                this.mForceMeasure = false;
            } else {
                d = d2;
                f2 = adjustedPosition;
            }
            if (this.mTransformPivotTarget != Key.UNSET) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((View) view.getParent()).findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top = (view2.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
            if (hashMap3 != null) {
                for (ViewSpline viewSpline2 : hashMap3.values()) {
                    if (viewSpline2 instanceof ViewSpline.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        if (dArr2.length > 1) {
                            ((ViewSpline.PathRotate) viewSpline2).setPathRotate(view, f2, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                z |= pathRotate.setPathRotate(view, keyCache, f2, j, dArr3[0], dArr3[1]);
            }
            int i2 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i2 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i2].getPos(d, this.mValuesBuff);
                CustomSupport.setInterpolatedValue(this.mStartMotionPath.mAttributes.get(this.mAttributeNames[i2 - 1]), view, this.mValuesBuff);
                i2++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f2 <= 0.0f) {
                    view.setVisibility(motionConstrainedPoint.mVisibility);
                } else if (f2 >= 1.0f) {
                    view.setVisibility(this.mEndPoint.mVisibility);
                } else if (this.mEndPoint.mVisibility != motionConstrainedPoint.mVisibility) {
                    view.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i3 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i3 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i3].conditionallyFire(f2, view);
                    i3++;
                }
            }
            adjustedPosition = f2;
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f6 = motionPaths.mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f7 = f6 + ((motionPaths2.mX - f6) * adjustedPosition);
            float f8 = motionPaths.mY;
            float f9 = f8 + ((motionPaths2.mY - f8) * adjustedPosition);
            float f10 = motionPaths.mWidth;
            float f11 = motionPaths2.mWidth;
            float f12 = motionPaths.mHeight;
            float f13 = motionPaths2.mHeight;
            float f14 = f7 + 0.5f;
            int i4 = (int) f14;
            float f15 = f9 + 0.5f;
            int i5 = (int) f15;
            int i6 = (int) (f14 + ((f11 - f10) * adjustedPosition) + f10);
            int i7 = (int) (f15 + ((f13 - f12) * adjustedPosition) + f12);
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (!(f11 == f10 && f13 == f12 && !this.mForceMeasure)) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                this.mForceMeasure = false;
            }
            view.layout(i4, i5, i6, i7);
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            for (ViewOscillator viewOscillator : hashMap4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view, adjustedPosition, dArr4[0], dArr4[1]);
                } else {
                    viewOscillator.setProperty(view, adjustedPosition);
                }
            }
        }
        return z;
    }

    public void buildBounds(float[] fArr, int i) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0b928e", new Object[]{this, fArr, new Integer(i)});
            return;
        }
        float f2 = 1.0f;
        float f3 = 1.0f / (i - 1);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        int i2 = 0;
        while (i2 < i) {
            float f4 = i2 * f3;
            float f5 = this.mStaggerScale;
            float f6 = 0.0f;
            if (f5 != f2) {
                float f7 = this.mStaggerOffset;
                if (f4 < f7) {
                    f4 = 0.0f;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f7) * f5, f2);
                }
            }
            double d = f4;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f8 = Float.NaN;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f9 = next.mTime;
                    if (f9 < f4) {
                        f6 = f9;
                        easing = easing2;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.mTime;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d = (((float) easing.get((f4 - f6) / f)) * (f8 - f6)) + f6;
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i2 * 2);
            i2++;
            f2 = 1.0f;
        }
    }

    public void getPostLayoutDvDp(float f, int i, int i2, float f2, float f3, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951a2a06", new Object[]{this, new Float(f), new Integer(i), new Integer(i2), new Float(f2), new Float(f3), fArr});
            return;
        }
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewSpline viewSpline = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        ViewSpline viewSpline2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
        ViewSpline viewSpline3 = hashMap3 == null ? null : hashMap3.get(Key.ROTATION);
        HashMap<String, ViewSpline> hashMap4 = this.mAttributesMap;
        ViewSpline viewSpline4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, ViewSpline> hashMap5 = this.mAttributesMap;
        ViewSpline viewSpline5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, ViewOscillator> hashMap6 = this.mCycleMap;
        ViewOscillator viewOscillator = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, ViewOscillator> hashMap7 = this.mCycleMap;
        ViewOscillator viewOscillator2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, ViewOscillator> hashMap8 = this.mCycleMap;
        ViewOscillator viewOscillator3 = hashMap8 == null ? null : hashMap8.get(Key.ROTATION);
        HashMap<String, ViewOscillator> hashMap9 = this.mCycleMap;
        ViewOscillator viewOscillator4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, ViewOscillator> hashMap10 = this.mCycleMap;
        ViewOscillator viewOscillator5 = hashMap10 == null ? null : hashMap10.get("scaleY");
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
        velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d = adjustedPosition;
                curveFit.getPos(d, dArr);
                this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
        } else if (this.mSpline != null) {
            double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            int i3 = 0;
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * f4;
                    i3++;
                } else {
                    this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f5 = motionPaths.mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f6 = f5 - motionPaths2.mX;
            float f7 = motionPaths.mY - motionPaths2.mY;
            float f8 = (motionPaths.mHeight - motionPaths2.mHeight) + f7;
            fArr[0] = (f6 * (1.0f - f2)) + (((motionPaths.mWidth - motionPaths2.mWidth) + f6) * f2);
            fArr[1] = (f7 * (1.0f - f3)) + (f8 * f3);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
        }
    }

    public void setStartState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749bc14", new Object[]{this, rect, constraintSet, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            rotate(rect, this.mTempRect, i3, i, i2);
        }
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        readView(motionPaths);
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(rect, constraintSet, i3, this.mId);
        this.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        this.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
        this.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
        Context context = this.mView.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        this.mQuantizeMotionInterpolator = getInterpolator(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }
}
