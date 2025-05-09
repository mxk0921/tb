package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class VelocityMatrix {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String sTag = "VelocityMatrix";
    public float mDRotate;
    public float mDScaleX;
    public float mDScaleY;
    public float mDTranslateX;
    public float mDTranslateY;
    public float mRotate;

    public void applyTransform(float f, float f2, int i, int i2, float[] fArr) {
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23209d90", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2), fArr});
            return;
        }
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f4 + this.mDTranslateX;
        float f8 = f5 + this.mDTranslateY;
        float f9 = f7 + (this.mDScaleX * (f - 0.5f) * 2.0f);
        float f10 = f8 + (this.mDScaleY * f6);
        float radians = (float) Math.toRadians(this.mDRotate);
        double radians2 = (float) Math.toRadians(this.mRotate);
        double d = i2 * f6;
        fArr[0] = f9 + (((float) ((((-i) * f3) * Math.sin(radians2)) - (Math.cos(radians2) * d))) * radians);
        fArr[1] = f10 + (radians * ((float) (((i * f3) * Math.cos(radians2)) - (d * Math.sin(radians2)))));
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mDRotate = 0.0f;
        this.mDTranslateY = 0.0f;
        this.mDTranslateX = 0.0f;
        this.mDScaleY = 0.0f;
        this.mDScaleX = 0.0f;
    }

    public void setRotationVelocity(SplineSet splineSet, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e118e6b", new Object[]{this, splineSet, new Float(f)});
        } else if (splineSet != null) {
            this.mDRotate = splineSet.getSlope(f);
            this.mRotate = splineSet.get(f);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5dd154", new Object[]{this, splineSet, splineSet2, new Float(f)});
            return;
        }
        if (splineSet != null) {
            this.mDScaleX = splineSet.getSlope(f);
        }
        if (splineSet2 != null) {
            this.mDScaleY = splineSet2.getSlope(f);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21bea0d", new Object[]{this, splineSet, splineSet2, new Float(f)});
            return;
        }
        if (splineSet != null) {
            this.mDTranslateX = splineSet.getSlope(f);
        }
        if (splineSet2 != null) {
            this.mDTranslateY = splineSet2.getSlope(f);
        }
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5647c5d", new Object[]{this, keyCycleOscillator, new Float(f)});
        } else if (keyCycleOscillator != null) {
            this.mDRotate = keyCycleOscillator.getSlope(f);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8a676", new Object[]{this, keyCycleOscillator, keyCycleOscillator2, new Float(f)});
            return;
        }
        if (keyCycleOscillator != null) {
            this.mDScaleX = keyCycleOscillator.getSlope(f);
        }
        if (keyCycleOscillator2 != null) {
            this.mDScaleY = keyCycleOscillator2.getSlope(f);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36162ef", new Object[]{this, keyCycleOscillator, keyCycleOscillator2, new Float(f)});
            return;
        }
        if (keyCycleOscillator != null) {
            this.mDTranslateX = keyCycleOscillator.getSlope(f);
        }
        if (keyCycleOscillator2 != null) {
            this.mDTranslateY = keyCycleOscillator2.getSlope(f);
        }
    }
}
