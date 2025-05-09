package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import tb.zqu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionKeyPosition extends MotionKey {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int KEY_TYPE = 2;
    public static final String NAME = "KeyPosition";
    public static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public int mCurveFit;
    public int mPathMotionArc;
    public String mTransitionEasing = null;
    public int mDrawPath = 0;
    public float mPercentWidth = Float.NaN;
    public float mPercentHeight = Float.NaN;
    public float mPercentX = Float.NaN;
    public float mPercentY = Float.NaN;
    public float mAltPercentX = Float.NaN;
    public float mAltPercentY = Float.NaN;
    public int mPositionType = 0;
    private float mCalculatedPositionX = Float.NaN;
    private float mCalculatedPositionY = Float.NaN;

    public MotionKeyPosition() {
        int i = MotionKey.UNSET;
        this.mCurveFit = i;
        this.mPathMotionArc = i;
        this.mType = 2;
    }

    private void calcCartesianPosition(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef54843", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = 0.0f;
        float f8 = Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
        float f9 = Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
        float f10 = Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
        if (!Float.isNaN(this.mAltPercentX)) {
            f7 = this.mAltPercentX;
        }
        this.mCalculatedPositionX = (int) (f + (f8 * f5) + (f7 * f6));
        this.mCalculatedPositionY = (int) (f2 + (f5 * f9) + (f6 * f10));
    }

    private void calcPathPosition(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb7296a", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.mPercentX;
        float f8 = this.mPercentY;
        this.mCalculatedPositionX = f + (f5 * f7) + ((-f6) * f8);
        this.mCalculatedPositionY = f2 + (f6 * f7) + (f5 * f8);
    }

    public static /* synthetic */ Object ipc$super(MotionKeyPosition motionKeyPosition, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -672364841:
                return new Boolean(super.setValue(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue()));
            case -672361958:
                return new Boolean(super.setValue(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case -235297766:
                return super.copy((MotionKey) objArr[0]);
            case 1099871003:
                return new Boolean(super.setValue(((Number) objArr[0]).intValue(), (String) objArr[1]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/key/MotionKeyPosition");
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d03d49", new Object[]{this, hashMap});
        }
    }

    public void calcPosition(int i, int i2, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605108c5", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        int i3 = this.mPositionType;
        if (i3 == 1) {
            calcPathPosition(f, f2, f3, f4);
        } else if (i3 != 2) {
            calcCartesianPosition(f, f2, f3, f4);
        } else {
            calcScreenPosition(i, i2);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey copy(MotionKey motionKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionKey) ipChange.ipc$dispatch("f1f9a41a", new Object[]{this, motionKey});
        }
        super.copy(motionKey);
        MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
        this.mTransitionEasing = motionKeyPosition.mTransitionEasing;
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mPercentWidth = motionKeyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = motionKeyPosition.mPercentX;
        this.mPercentY = motionKeyPosition.mPercentY;
        this.mAltPercentX = motionKeyPosition.mAltPercentX;
        this.mAltPercentY = motionKeyPosition.mAltPercentY;
        this.mCalculatedPositionX = motionKeyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = motionKeyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9934fc4", new Object[]{this, hashSet});
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eeb42d5", new Object[]{this, str})).intValue();
        }
        return zqu.a(str);
    }

    public float getPositionX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc690d90", new Object[]{this})).floatValue();
        }
        return this.mCalculatedPositionX;
    }

    public float getPositionY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc772511", new Object[]{this})).floatValue();
        }
        return this.mCalculatedPositionY;
    }

    public boolean intersects(int i, int i2, FloatRect floatRect, FloatRect floatRect2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51bde21f", new Object[]{this, new Integer(i), new Integer(i2), floatRect, floatRect2, new Float(f), new Float(f2)})).booleanValue();
        }
        calcPosition(i, i2, floatRect.centerX(), floatRect.centerY(), floatRect2.centerX(), floatRect2.centerY());
        if (Math.abs(f - this.mCalculatedPositionX) >= 20.0f || Math.abs(f2 - this.mCalculatedPositionY) >= 20.0f) {
            return false;
        }
        return true;
    }

    public void positionAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f, float f2, String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf4f21b9", new Object[]{this, motionWidget, floatRect, floatRect2, new Float(f), new Float(f2), strArr, fArr});
            return;
        }
        int i = this.mPositionType;
        if (i == 1) {
            positionPathAttributes(floatRect, floatRect2, f, f2, strArr, fArr);
        } else if (i != 2) {
            positionCartAttributes(floatRect, floatRect2, f, f2, strArr, fArr);
        } else {
            positionScreenAttributes(motionWidget, floatRect, floatRect2, f, f2, strArr, fArr);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec921a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == 100) {
            this.mFramePosition = i2;
        } else if (i == 508) {
            this.mCurveFit = i2;
        } else if (i != 510) {
            return super.setValue(i, i2);
        } else {
            this.mPositionType = i2;
        }
        return true;
    }

    private void calcScreenPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e899c711", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        float f = this.mPercentX;
        float f2 = 0;
        this.mCalculatedPositionX = (i * f) + f2;
        this.mCalculatedPositionY = (i2 * f) + f2;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MotionKey) ipChange.ipc$dispatch("dbbed667", new Object[]{this}) : new MotionKeyPosition().copy(this);
    }

    public void positionCartAttributes(FloatRect floatRect, FloatRect floatRect2, float f, float f2, String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efcaa23", new Object[]{this, floatRect, floatRect2, new Float(f), new Float(f2), strArr, fArr});
            return;
        }
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f - centerX) / centerX2;
            strArr[1] = "percentY";
            fArr[1] = (f2 - centerY) / centerY2;
        } else if ("percentX".equals(str)) {
            fArr[0] = (f - centerX) / centerX2;
            fArr[1] = (f2 - centerY) / centerY2;
        } else {
            fArr[1] = (f - centerX) / centerX2;
            fArr[0] = (f2 - centerY) / centerY2;
        }
    }

    public void positionScreenAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f, float f2, String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74547a6d", new Object[]{this, motionWidget, floatRect, floatRect2, new Float(f), new Float(f2), strArr, fArr});
            return;
        }
        floatRect.centerX();
        floatRect.centerY();
        floatRect2.centerX();
        floatRect2.centerY();
        MotionWidget parent = motionWidget.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f / width;
            strArr[1] = "percentY";
            fArr[1] = f2 / height;
        } else if ("percentX".equals(str)) {
            fArr[0] = f / width;
            fArr[1] = f2 / height;
        } else {
            fArr[1] = f / width;
            fArr[0] = f2 / height;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec86d7", new Object[]{this, new Integer(i), new Float(f)})).booleanValue();
        }
        switch (i) {
            case 503:
                this.mPercentWidth = f;
                break;
            case 504:
                this.mPercentHeight = f;
                break;
            case 505:
                this.mPercentWidth = f;
                this.mPercentHeight = f;
                break;
            case 506:
                this.mPercentX = f;
                break;
            case 507:
                this.mPercentY = f;
                break;
            default:
                return super.setValue(i, f);
        }
        return true;
    }

    public void positionPathAttributes(FloatRect floatRect, FloatRect floatRect2, float f, float f2, String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514a0fe", new Object[]{this, floatRect, floatRect2, new Float(f), new Float(f2), strArr, fArr});
            return;
        }
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = centerX2 / hypot;
        float f4 = centerY2 / hypot;
        float f5 = f2 - centerY;
        float f6 = f - centerX;
        float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / hypot;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            strArr[1] = "percentY";
            fArr[0] = f8;
            fArr[1] = f7;
        } else if ("percentX".equals(str)) {
            fArr[0] = f8;
            fArr[1] = f7;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418eb31b", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i != 501) {
            return super.setValue(i, str);
        }
        this.mTransitionEasing = str.toString();
        return true;
    }
}
