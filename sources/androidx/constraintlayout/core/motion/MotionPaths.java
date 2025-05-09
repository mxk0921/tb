package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    public static final int OFF_HEIGHT = 4;
    public static final int OFF_PATH_ROTATE = 5;
    public static final int OFF_POSITION = 0;
    public static final int OFF_WIDTH = 3;
    public static final int OFF_X = 1;
    public static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    public static String[] sNames = {"position", "x", "y", "width", "height", "pathRotate"};
    public int mAnimateCircleAngleTo;
    public String mAnimateRelativeTo;
    public HashMap<String, CustomVariable> mCustomAttributes;
    public int mDrawPath;
    public float mHeight;
    public String mId;
    public Easing mKeyFrameEasing;
    public int mMode;
    public int mPathMotionArc;
    public float mPathRotate;
    public float mPosition;
    public float mProgress;
    public float mRelativeAngle;
    public Motion mRelativeToController;
    public double[] mTempDelta;
    public double[] mTempValue;
    public float mTime;
    public float mWidth;
    public float mX;
    public float mY;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = null;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mCustomAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("508ab10", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) != Float.isNaN(f2)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f2) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    private static float xRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6333276a", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)})).floatValue();
        }
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    private static float yRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3dd056b", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)})).floatValue();
        }
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    public void applyParameters(MotionWidget motionWidget) {
        ConstraintWidget constraintWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbb01e9", new Object[]{this, motionWidget});
            return;
        }
        this.mKeyFrameEasing = Easing.getInterpolator(motionWidget.mMotion.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.mMotion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = motionWidget.mPropertySet.mProgress;
        WidgetFrame widgetFrame = motionWidget.mWidgetFrame;
        if (!(widgetFrame == null || (constraintWidget = widgetFrame.widget) == null)) {
            this.mRelativeAngle = constraintWidget.mCircleConstraintAngle;
        }
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.mCustomAttributes.put(str, customAttribute);
            }
        }
    }

    public void configureRelativeTo(Motion motion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d141d42", new Object[]{this, motion});
        } else {
            motion.getPos(this.mProgress);
        }
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94631928", new Object[]{this, motionPaths, zArr, strArr, new Boolean(z)});
            return;
        }
        boolean diff = diff(this.mX, motionPaths.mX);
        boolean diff2 = diff(this.mY, motionPaths.mY);
        zArr[0] = zArr[0] | diff(this.mPosition, motionPaths.mPosition);
        boolean z4 = zArr[1];
        if (diff || diff2 || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        zArr[1] = z4 | z2;
        boolean z5 = zArr[2];
        if (!diff && !diff2 && !z) {
            z3 = false;
        }
        zArr[2] = z5 | z3;
        zArr[3] = zArr[3] | diff(this.mWidth, motionPaths.mWidth);
        zArr[4] = diff(this.mHeight, motionPaths.mHeight) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bceb7e", new Object[]{this, dArr, iArr});
            return;
        }
        float[] fArr = {this.mPosition, this.mX, this.mY, this.mWidth, this.mHeight, this.mPathRotate};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4829a86f", new Object[]{this, iArr, dArr, fArr, new Integer(i)});
            return;
        }
        float f = this.mWidth;
        float f2 = this.mHeight;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f2;
    }

    public void getCenter(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57527b5", new Object[]{this, new Double(d), iArr, dArr, fArr, new Integer(i)});
            return;
        }
        float f = this.mX;
        float f2 = this.mY;
        float f3 = this.mWidth;
        float f4 = this.mHeight;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f;
            double d3 = f2;
            f = (float) ((f6 + (Math.sin(d3) * d2)) - (f3 / 2.0f));
            f2 = (float) ((f7 - (d2 * Math.cos(d3))) - (f4 / 2.0f));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[1 + i] = f2 + (f4 / 2.0f) + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b0a20b", new Object[]{this, str, dArr, new Integer(i)})).intValue();
        }
        CustomVariable customVariable = this.mCustomAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i] = customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        float[] fArr = new float[numberOfInterpolatedValues];
        customVariable.getValuesToInterpolate(fArr);
        while (i2 < numberOfInterpolatedValues) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return numberOfInterpolatedValues;
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e10c60", new Object[]{this, iArr, dArr, fArr, new Integer(i)});
            return;
        }
        float f = this.mX;
        float f2 = this.mY;
        float f3 = this.mWidth;
        float f4 = this.mHeight;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float centerX = motion.getCenterX();
            double d = f;
            double d2 = f2;
            f2 = (float) ((this.mRelativeToController.getCenterY() - (d * Math.cos(d2))) - (f4 / 2.0f));
            f = (float) ((centerX + (Math.sin(d2) * d)) - (f3 / 2.0f));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i] = f + 0.0f;
        fArr[i + 1] = f2 + 0.0f;
        fArr[2 + i] = f6 + 0.0f;
        fArr[3 + i] = f2 + 0.0f;
        fArr[4 + i] = f6 + 0.0f;
        fArr[5 + i] = f7 + 0.0f;
        fArr[i + 6] = f + 0.0f;
        fArr[i + 7] = f7 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5229ca", new Object[]{this, str})).booleanValue();
        }
        return this.mCustomAttributes.containsKey(str);
    }

    public void initCartesian(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a7062b", new Object[]{this, motionKeyPosition, motionPaths, motionPaths2});
            return;
        }
        float f5 = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f5;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f = f5;
        } else {
            f = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f2 = f5;
        } else {
            f2 = motionKeyPosition.mPercentHeight;
        }
        float f6 = motionPaths2.mWidth;
        float f7 = motionPaths.mWidth;
        float f8 = motionPaths2.mHeight;
        float f9 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f10 = motionPaths.mX;
        float f11 = motionPaths.mY;
        float f12 = (motionPaths2.mX + (f6 / 2.0f)) - (f10 + (f7 / 2.0f));
        float f13 = (motionPaths2.mY + (f8 / 2.0f)) - (f11 + (f9 / 2.0f));
        float f14 = (f6 - f7) * f;
        float f15 = f14 / 2.0f;
        this.mX = (int) ((f10 + (f12 * f5)) - f15);
        float f16 = (f8 - f9) * f2;
        float f17 = f16 / 2.0f;
        this.mY = (int) ((f11 + (f13 * f5)) - f17);
        this.mWidth = (int) (f7 + f14);
        this.mHeight = (int) (f9 + f16);
        if (Float.isNaN(motionKeyPosition.mPercentX)) {
            f3 = f5;
        } else {
            f3 = motionKeyPosition.mPercentX;
        }
        float f18 = 0.0f;
        if (Float.isNaN(motionKeyPosition.mAltPercentY)) {
            f4 = 0.0f;
        } else {
            f4 = motionKeyPosition.mAltPercentY;
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            f5 = motionKeyPosition.mPercentY;
        }
        if (!Float.isNaN(motionKeyPosition.mAltPercentX)) {
            f18 = motionKeyPosition.mAltPercentX;
        }
        this.mMode = 0;
        this.mX = (int) (((motionPaths.mX + (f3 * f12)) + (f18 * f13)) - f15);
        this.mY = (int) (((motionPaths.mY + (f12 * f4)) + (f13 * f5)) - f17);
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initPath(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1cfece", new Object[]{this, motionKeyPosition, motionPaths, motionPaths2});
            return;
        }
        float f6 = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f6;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f = f6;
        } else {
            f = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f2 = f6;
        } else {
            f2 = motionKeyPosition.mPercentHeight;
        }
        float f7 = motionPaths2.mWidth - motionPaths.mWidth;
        float f8 = motionPaths2.mHeight - motionPaths.mHeight;
        this.mPosition = this.mTime;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            f6 = motionKeyPosition.mPercentX;
        }
        float f9 = motionPaths.mX;
        float f10 = motionPaths.mWidth;
        float f11 = motionPaths.mY;
        float f12 = motionPaths.mHeight;
        float f13 = (motionPaths2.mX + (motionPaths2.mWidth / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = (motionPaths2.mY + (motionPaths2.mHeight / 2.0f)) - (f11 + (f12 / 2.0f));
        float f15 = f13 * f6;
        float f16 = (f7 * f) / 2.0f;
        this.mX = (int) ((f9 + f15) - f16);
        float f17 = f6 * f14;
        float f18 = (f8 * f2) / 2.0f;
        this.mY = (int) ((f11 + f17) - f18);
        this.mWidth = (int) (f10 + f3);
        this.mHeight = (int) (f12 + f4);
        if (Float.isNaN(motionKeyPosition.mPercentY)) {
            f5 = 0.0f;
        } else {
            f5 = motionKeyPosition.mPercentY;
        }
        this.mMode = 1;
        float f19 = (int) ((motionPaths.mX + f15) - f16);
        float f20 = (int) ((motionPaths.mY + f17) - f18);
        this.mX = f19 + ((-f14) * f5);
        this.mY = f20 + (f13 * f5);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initPolar(int i, int i2, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964ebed5", new Object[]{this, new Integer(i), new Integer(i2), motionKeyPosition, motionPaths, motionPaths2});
            return;
        }
        float f7 = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f7;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mMode = motionKeyPosition.mPositionType;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f = f7;
        } else {
            f = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f2 = f7;
        } else {
            f2 = motionKeyPosition.mPercentHeight;
        }
        float f8 = motionPaths2.mWidth;
        float f9 = motionPaths.mWidth;
        float f10 = motionPaths2.mHeight;
        float f11 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        this.mWidth = (int) (f9 + ((f8 - f9) * f));
        this.mHeight = (int) (f11 + ((f10 - f11) * f2));
        int i3 = motionKeyPosition.mPositionType;
        if (i3 == 1) {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                f3 = f7;
            } else {
                f3 = motionKeyPosition.mPercentX;
            }
            float f12 = motionPaths2.mX;
            float f13 = motionPaths.mX;
            this.mX = (f3 * (f12 - f13)) + f13;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f7 = motionKeyPosition.mPercentY;
            }
            float f14 = motionPaths2.mY;
            float f15 = motionPaths.mY;
            this.mY = (f7 * (f14 - f15)) + f15;
        } else if (i3 != 2) {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                f6 = f7;
            } else {
                f6 = motionKeyPosition.mPercentX;
            }
            float f16 = motionPaths2.mX;
            float f17 = motionPaths.mX;
            this.mX = (f6 * (f16 - f17)) + f17;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f7 = motionKeyPosition.mPercentY;
            }
            float f18 = motionPaths2.mY;
            float f19 = motionPaths.mY;
            this.mY = (f7 * (f18 - f19)) + f19;
        } else {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                float f20 = motionPaths2.mX;
                float f21 = motionPaths.mX;
                f4 = ((f20 - f21) * f7) + f21;
            } else {
                f4 = Math.min(f2, f) * motionKeyPosition.mPercentX;
            }
            this.mX = f4;
            if (Float.isNaN(motionKeyPosition.mPercentY)) {
                float f22 = motionPaths2.mY;
                float f23 = motionPaths.mY;
                f5 = (f7 * (f22 - f23)) + f23;
            } else {
                f5 = motionKeyPosition.mPercentY;
            }
            this.mY = f5;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initScreen(int i, int i2, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39ae507", new Object[]{this, new Integer(i), new Integer(i2), motionKeyPosition, motionPaths, motionPaths2});
            return;
        }
        float f3 = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f3;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f = f3;
        } else {
            f = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f2 = f3;
        } else {
            f2 = motionKeyPosition.mPercentHeight;
        }
        float f4 = motionPaths2.mWidth;
        float f5 = motionPaths.mWidth;
        float f6 = motionPaths2.mHeight;
        float f7 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f8 = motionPaths.mX;
        float f9 = motionPaths.mY;
        float f10 = motionPaths2.mX + (f4 / 2.0f);
        float f11 = motionPaths2.mY + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.mX = (int) ((f8 + ((f10 - (f8 + (f5 / 2.0f))) * f3)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f2;
        this.mY = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f));
        this.mWidth = (int) (f5 + f12);
        this.mHeight = (int) (f7 + f13);
        this.mMode = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.mX = (int) (motionKeyPosition.mPercentX * (i - ((int) this.mWidth)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.mY = (int) (motionKeyPosition.mPercentY * (i2 - ((int) this.mHeight)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void setBounds(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88067fbe", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.mX = f;
        this.mY = f2;
        this.mWidth = f3;
        this.mHeight = f4;
    }

    public void setView(float f, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35dbeae5", new Object[]{this, new Float(f), motionWidget, iArr, dArr, dArr2, dArr3});
            return;
        }
        float f4 = this.mX;
        float f5 = this.mY;
        float f6 = this.mWidth;
        float f7 = this.mHeight;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i];
            this.mTempDelta = new double[i];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.mTempValue;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.mTempDelta[i3] = dArr2[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i4 >= dArr5.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr5[i4]);
            double d = vu3.b.GEO_NOT_SUPPORT;
            if (!isNaN || !(dArr3 == null || dArr3[i4] == vu3.b.GEO_NOT_SUPPORT)) {
                if (dArr3 != null) {
                    d = dArr3[i4];
                }
                if (!Double.isNaN(this.mTempValue[i4])) {
                    d = this.mTempValue[i4] + d;
                }
                f3 = f9;
                float f13 = (float) d;
                float f14 = (float) this.mTempDelta[i4];
                if (i4 == 1) {
                    f3 = f14;
                    f4 = f13;
                } else if (i4 == 2) {
                    f10 = f14;
                    f5 = f13;
                } else if (i4 == 3) {
                    f11 = f14;
                    f6 = f13;
                } else if (i4 == 4) {
                    f12 = f14;
                    f7 = f13;
                } else if (i4 == 5) {
                    f8 = f13;
                }
            } else {
                f3 = f9;
            }
            i4++;
            f9 = f3;
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter(f, fArr, fArr2);
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr2[0];
            float f18 = fArr2[1];
            double d2 = f4;
            double d3 = f5;
            float sin = (float) ((f15 + (Math.sin(d3) * d2)) - (f6 / 2.0f));
            float cos = (float) ((f16 - (Math.cos(d3) * d2)) - (f7 / 2.0f));
            double d4 = f9;
            double d5 = f10;
            float sin2 = (float) (f17 + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            f2 = f7;
            float cos2 = (float) ((f18 - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            if (dArr2.length >= 2) {
                dArr2[0] = sin2;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f8)) {
                motionWidget.setRotationZ((float) (f8 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f4 = sin;
            f5 = cos;
        } else {
            f2 = f7;
            if (!Float.isNaN(f8)) {
                motionWidget.setRotationZ(((float) (f8 + Math.toDegrees(Math.atan2(f10 + (f12 / 2.0f), f9 + (f11 / 2.0f))))) + 0.0f);
            }
        }
        float f19 = f4 + 0.5f;
        float f20 = f5 + 0.5f;
        motionWidget.layout((int) f19, (int) f20, (int) (f19 + f6), (int) (f20 + f2));
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11660ff6", new Object[]{this, motion, motionPaths});
            return;
        }
        double d = ((this.mX + (this.mWidth / 2.0f)) - motionPaths.mX) - (motionPaths.mWidth / 2.0f);
        double d2 = ((this.mY + (this.mHeight / 2.0f)) - motionPaths.mY) - (motionPaths.mHeight / 2.0f);
        this.mRelativeToController = motion;
        this.mX = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.mY = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.mY = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    public int compareTo(MotionPaths motionPaths) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7e1af40", new Object[]{this, motionPaths})).intValue() : Float.compare(this.mPosition, motionPaths.mPosition);
    }

    public int getCustomDataCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8b580e2", new Object[]{this, str})).intValue();
        }
        CustomVariable customVariable = this.mCustomAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    public void setDpDt(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24cef0", new Object[]{this, new Float(f), new Float(f2), fArr, iArr, dArr, dArr2});
            return;
        }
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    public MotionPaths(int i, int i2, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = null;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mCustomAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != null) {
            initPolar(i, i2, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i3 = motionKeyPosition.mPositionType;
        if (i3 == 1) {
            initPath(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i3 != 2) {
            initCartesian(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i, i2, motionKeyPosition, motionPaths, motionPaths2);
        }
    }

    public void getCenterVelocity(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda13a32", new Object[]{this, new Double(d), iArr, dArr, fArr, new Integer(i)});
            return;
        }
        float f = this.mX;
        float f2 = this.mY;
        float f3 = this.mWidth;
        float f4 = this.mHeight;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f;
            double d3 = f2;
            f = (float) ((f6 + (Math.sin(d3) * d2)) - (f3 / 2.0f));
            f2 = (float) ((f7 - (d2 * Math.cos(d3))) - (f4 / 2.0f));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[1 + i] = f2 + (f4 / 2.0f) + 0.0f;
    }

    public void getCenter(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3caec7e2", new Object[]{this, new Double(d), iArr, dArr, fArr, dArr2, fArr2});
            return;
        }
        float f2 = this.mX;
        float f3 = this.mY;
        float f4 = this.mWidth;
        float f5 = this.mHeight;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f10;
                f7 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f6 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f8 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = f7 + (f8 / 2.0f);
        float f13 = f6 + (f9 / 2.0f);
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f14;
            double d3 = f2;
            double d4 = f3;
            f2 = (float) ((d2 + (Math.sin(d4) * d3)) - (f4 / 2.0f));
            f3 = (float) ((f15 - (Math.cos(d4) * d3)) - (f5 / 2.0f));
            double d5 = f16;
            double d6 = f7;
            double d7 = f6;
            f12 = (float) (d5 + (Math.sin(d4) * d6) + (Math.cos(d4) * d7));
            f13 = (float) ((f17 - (d6 * Math.cos(d4))) + (Math.sin(d4) * d7));
            f = 2.0f;
        } else {
            f = 2.0f;
        }
        fArr[0] = f2 + (f4 / f) + 0.0f;
        fArr[1] = f3 + (f5 / f) + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }
}
