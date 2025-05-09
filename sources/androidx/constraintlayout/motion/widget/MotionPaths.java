package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.LinkedHashMap;
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
    public int mAnimateRelativeTo;
    public LinkedHashMap<String, ConstraintAttribute> mAttributes;
    public int mDrawPath;
    public float mHeight;
    public Easing mKeyFrameEasing;
    public int mMode;
    public int mPathMotionArc;
    public float mPathRotate;
    public float mPosition;
    public float mProgress;
    public float mRelativeAngle;
    public MotionController mRelativeToController;
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
        int i = Key.UNSET;
        this.mPathMotionArc = i;
        this.mAnimateRelativeTo = i;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
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

    public void applyParameters(ConstraintSet.Constraint constraint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248eed9d", new Object[]{this, constraint});
            return;
        }
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = constraint.propertySet.mProgress;
        this.mRelativeAngle = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.mAttributes.put(str, constraintAttribute);
            }
        }
    }

    public void configureRelativeTo(MotionController motionController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa98a5d", new Object[]{this, motionController});
        } else {
            motionController.getPos(this.mProgress);
        }
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23345e31", new Object[]{this, motionPaths, zArr, strArr, new Boolean(z)});
            return;
        }
        boolean diff = diff(this.mX, motionPaths.mX);
        boolean diff2 = diff(this.mY, motionPaths.mY);
        zArr[0] = zArr[0] | diff(this.mPosition, motionPaths.mPosition);
        boolean z2 = diff | diff2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
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
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d, fArr2, new float[2]);
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
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        float[] fArr = new float[numberOfInterpolatedValues];
        constraintAttribute.getValuesToInterpolate(fArr);
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
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
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
        return this.mAttributes.containsKey(str);
    }

    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2348224e", new Object[]{this, keyPosition, motionPaths, motionPaths2});
            return;
        }
        float f5 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f5;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f = f5;
        } else {
            f = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f2 = f5;
        } else {
            f2 = keyPosition.mPercentHeight;
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
        if (Float.isNaN(keyPosition.mPercentX)) {
            f3 = f5;
        } else {
            f3 = keyPosition.mPercentX;
        }
        float f18 = 0.0f;
        if (Float.isNaN(keyPosition.mAltPercentY)) {
            f4 = 0.0f;
        } else {
            f4 = keyPosition.mAltPercentY;
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f5 = keyPosition.mPercentY;
        }
        if (!Float.isNaN(keyPosition.mAltPercentX)) {
            f18 = keyPosition.mAltPercentX;
        }
        this.mMode = 0;
        this.mX = (int) (((motionPaths.mX + (f3 * f12)) + (f18 * f13)) - f15);
        this.mY = (int) (((motionPaths.mY + (f12 * f4)) + (f13 * f5)) - f17);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPolar(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2abff8", new Object[]{this, new Integer(i), new Integer(i2), keyPosition, motionPaths, motionPaths2});
            return;
        }
        float f6 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f6;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mMode = keyPosition.mPositionType;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f = f6;
        } else {
            f = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f2 = f6;
        } else {
            f2 = keyPosition.mPercentHeight;
        }
        float f7 = motionPaths2.mWidth;
        float f8 = motionPaths.mWidth;
        float f9 = motionPaths2.mHeight;
        float f10 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        this.mWidth = (int) (f8 + ((f7 - f8) * f));
        this.mHeight = (int) (f10 + ((f9 - f10) * f2));
        if (keyPosition.mPositionType != 2) {
            if (Float.isNaN(keyPosition.mPercentX)) {
                f5 = f6;
            } else {
                f5 = keyPosition.mPercentX;
            }
            float f11 = motionPaths2.mX;
            float f12 = motionPaths.mX;
            this.mX = (f5 * (f11 - f12)) + f12;
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f6 = keyPosition.mPercentY;
            }
            float f13 = motionPaths2.mY;
            float f14 = motionPaths.mY;
            this.mY = (f6 * (f13 - f14)) + f14;
        } else {
            if (Float.isNaN(keyPosition.mPercentX)) {
                float f15 = motionPaths2.mX;
                float f16 = motionPaths.mX;
                f3 = ((f15 - f16) * f6) + f16;
            } else {
                f3 = Math.min(f2, f) * keyPosition.mPercentX;
            }
            this.mX = f3;
            if (Float.isNaN(keyPosition.mPercentY)) {
                float f17 = motionPaths2.mY;
                float f18 = motionPaths.mY;
                f4 = (f6 * (f17 - f18)) + f18;
            } else {
                f4 = keyPosition.mPercentY;
            }
            this.mY = f4;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initScreen(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd5cf2a", new Object[]{this, new Integer(i), new Integer(i2), keyPosition, motionPaths, motionPaths2});
            return;
        }
        float f3 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f3;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f = f3;
        } else {
            f = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f2 = f3;
        } else {
            f2 = keyPosition.mPercentHeight;
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
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.mX = (int) (keyPosition.mPercentX * (i - ((int) this.mWidth)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.mY = (int) (keyPosition.mPercentY * (i2 - ((int) this.mHeight)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
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

    public void setupRelative(MotionController motionController, MotionPaths motionPaths) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c74104", new Object[]{this, motionController, motionPaths});
            return;
        }
        double d = ((this.mX + (this.mWidth / 2.0f)) - motionPaths.mX) - (motionPaths.mWidth / 2.0f);
        double d2 = ((this.mY + (this.mHeight / 2.0f)) - motionPaths.mY) - (motionPaths.mHeight / 2.0f);
        this.mRelativeToController = motionController;
        this.mX = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.mY = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.mY = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    public int compareTo(MotionPaths motionPaths) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b4a83ec9", new Object[]{this, motionPaths})).intValue() : Float.compare(this.mPosition, motionPaths.mPosition);
    }

    public int getCustomDataCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8b580e2", new Object[]{this, str})).intValue();
        }
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    public void initAxis(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ac8f75", new Object[]{this, keyPosition, motionPaths, motionPaths2});
            return;
        }
        float f = keyPosition.mFramePosition / 100.0f;
        this.mTime = f;
        this.mDrawPath = keyPosition.mDrawPath;
        float f2 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f3 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f4 = motionPaths2.mWidth;
        float f5 = motionPaths.mWidth;
        float f6 = f4 - f5;
        float f7 = motionPaths2.mHeight;
        float f8 = motionPaths.mHeight;
        float f9 = f7 - f8;
        this.mPosition = this.mTime;
        float f10 = motionPaths.mX;
        float f11 = f10 + (f5 / 2.0f);
        float f12 = motionPaths.mY;
        float f13 = f12 + (f8 / 2.0f);
        float f14 = motionPaths2.mX + (f4 / 2.0f);
        float f15 = motionPaths2.mY + (f7 / 2.0f);
        if (f11 > f14) {
            f11 = f14;
            f14 = f11;
        }
        if (f13 <= f15) {
            f13 = f15;
            f15 = f13;
        }
        float f16 = f14 - f11;
        float f17 = f13 - f15;
        float f18 = f6 * f2;
        float f19 = f18 / 2.0f;
        this.mX = (int) ((f10 + (f16 * f)) - f19);
        float f20 = f9 * f3;
        float f21 = f20 / 2.0f;
        this.mY = (int) ((f12 + (f17 * f)) - f21);
        this.mWidth = (int) (f5 + f18);
        this.mHeight = (int) (f8 + f20);
        float f22 = Float.isNaN(keyPosition.mPercentX) ? f : keyPosition.mPercentX;
        float f23 = 0.0f;
        float f24 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f = keyPosition.mPercentY;
        }
        if (!Float.isNaN(keyPosition.mAltPercentX)) {
            f23 = keyPosition.mAltPercentX;
        }
        this.mMode = 0;
        this.mX = (int) (((motionPaths.mX + (f22 * f16)) + (f23 * f17)) - f19);
        this.mY = (int) (((motionPaths.mY + (f16 * f24)) + (f17 * f)) - f21);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e281e471", new Object[]{this, keyPosition, motionPaths, motionPaths2});
            return;
        }
        float f3 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f3;
        this.mDrawPath = keyPosition.mDrawPath;
        float f4 = Float.isNaN(keyPosition.mPercentWidth) ? f3 : keyPosition.mPercentWidth;
        float f5 = Float.isNaN(keyPosition.mPercentHeight) ? f3 : keyPosition.mPercentHeight;
        float f6 = motionPaths2.mWidth - motionPaths.mWidth;
        float f7 = motionPaths2.mHeight - motionPaths.mHeight;
        this.mPosition = this.mTime;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f3 = keyPosition.mPercentX;
        }
        float f8 = motionPaths.mX;
        float f9 = motionPaths.mWidth;
        float f10 = motionPaths.mY;
        float f11 = motionPaths.mHeight;
        float f12 = (motionPaths2.mX + (motionPaths2.mWidth / 2.0f)) - ((f9 / 2.0f) + f8);
        float f13 = (motionPaths2.mY + (motionPaths2.mHeight / 2.0f)) - (f10 + (f11 / 2.0f));
        float f14 = f12 * f3;
        float f15 = (f6 * f4) / 2.0f;
        this.mX = (int) ((f8 + f14) - f15);
        float f16 = f3 * f13;
        float f17 = (f7 * f5) / 2.0f;
        this.mY = (int) ((f10 + f16) - f17);
        this.mWidth = (int) (f9 + f);
        this.mHeight = (int) (f11 + f2);
        float f18 = Float.isNaN(keyPosition.mPercentY) ? 0.0f : keyPosition.mPercentY;
        this.mMode = 1;
        float f19 = (int) ((motionPaths.mX + f14) - f15);
        float f20 = (int) ((motionPaths.mY + f16) - f17);
        this.mX = f19 + ((-f13) * f18);
        this.mY = f20 + (f12 * f18);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
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
            double d = dArr2[i];
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

    public MotionPaths(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        int i3 = Key.UNSET;
        this.mPathMotionArc = i3;
        this.mAnimateRelativeTo = i3;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != Key.UNSET) {
            initPolar(i, i2, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i4 = keyPosition.mPositionType;
        if (i4 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
        } else if (i4 == 2) {
            initScreen(i, i2, keyPosition, motionPaths, motionPaths2);
        } else if (i4 != 3) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initAxis(keyPosition, motionPaths, motionPaths2);
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
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d, fArr2, new float[2]);
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
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d, fArr3, fArr4);
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

    public void setView(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        float f3;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3500b", new Object[]{this, new Float(f), view, iArr, dArr, dArr2, dArr3, new Boolean(z)});
            return;
        }
        float f5 = this.mX;
        float f6 = this.mY;
        float f7 = this.mWidth;
        float f8 = this.mHeight;
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
        float f9 = Float.NaN;
        int i4 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
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
                f5 = f5;
                float f14 = (float) d;
                float f15 = (float) this.mTempDelta[i4];
                if (i4 == 1) {
                    f10 = f15;
                    f5 = f14;
                } else if (i4 == 2) {
                    f11 = f15;
                    f6 = f14;
                } else if (i4 == 3) {
                    f12 = f15;
                    f7 = f14;
                } else if (i4 == 4) {
                    f13 = f15;
                    f8 = f14;
                } else if (i4 == 5) {
                    f9 = f14;
                }
            } else {
                f5 = f5;
            }
            i4++;
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = f5;
            double d3 = f6;
            f4 = (float) ((f16 + (Math.sin(d3) * d2)) - (f7 / 2.0f));
            f6 = (float) ((f17 - (Math.cos(d3) * d2)) - (f8 / 2.0f));
            double d4 = f10;
            f2 = f8;
            f3 = f7;
            double d5 = f11;
            float sin = (float) (f18 + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float cos = (float) ((f19 - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            if (dArr2.length >= 2) {
                dArr2[0] = sin;
                dArr2[1] = cos;
            }
            if (!Float.isNaN(f9)) {
                view.setRotation((float) (f9 + Math.toDegrees(Math.atan2(cos, sin))));
            }
        } else {
            f3 = f7;
            f2 = f8;
            if (!Float.isNaN(f9)) {
                view.setRotation(f9 + ((float) Math.toDegrees(Math.atan2(f11 + (f13 / 2.0f), f10 + (f12 / 2.0f)))) + 0.0f);
            }
            f4 = f5;
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(f4, f6, f4 + f3, f6 + f2);
            return;
        }
        float f20 = f4 + 0.5f;
        int i5 = (int) f20;
        float f21 = f6 + 0.5f;
        int i6 = (int) f21;
        int i7 = (int) (f20 + f3);
        int i8 = (int) (f21 + f2);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (!(i9 == view.getMeasuredWidth() && i10 == view.getMeasuredHeight() && !z)) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }
}
