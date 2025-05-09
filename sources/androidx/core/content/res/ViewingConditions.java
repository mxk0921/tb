package androidx.core.content.res;

import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewingConditions {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((CamUtils.yFromLStar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    private ViewingConditions(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.mN = f;
        this.mAw = f2;
        this.mNbb = f3;
        this.mNcb = f4;
        this.mC = f5;
        this.mNc = f6;
        this.mRgbD = fArr;
        this.mFl = f7;
        this.mFlRoot = f8;
        this.mZ = f9;
    }

    public static ViewingConditions make(float[] fArr, float f, float f2, float f3, boolean z) {
        float lerp;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewingConditions) ipChange.ipc$dispatch("37daf0bf", new Object[]{fArr, new Float(f), new Float(f2), new Float(f3), new Boolean(z)});
        }
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f6 = fArr[1];
        float f7 = (fArr3[0] * f5) + (fArr3[1] * f6);
        float f8 = fArr[2];
        float f9 = f7 + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[0] * f5) + (fArr4[1] * f6) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f5 * fArr5[0]) + (f6 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (f3 / 10.0f) + 0.8f;
        if (f12 >= 0.9d) {
            lerp = CamUtils.lerp(0.59f, 0.69f, (f12 - 0.9f) * 10.0f);
        } else {
            lerp = CamUtils.lerp(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
        }
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
        }
        double d = f4;
        if (d > 1.0d) {
            f4 = 1.0f;
        } else if (d < vu3.b.GEO_NOT_SUPPORT) {
            f4 = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * f4) + 1.0f) - f4, (((100.0f / f10) * f4) + 1.0f) - f4, (((100.0f / f11) * f4) + 1.0f) - f4};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float cbrt = (f14 * f) + (0.1f * f15 * f15 * ((float) Math.cbrt(f * 5.0d)));
        float yFromLStar = CamUtils.yFromLStar(f2) / fArr[1];
        double d2 = yFromLStar;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f11) / 100.0d, 0.42d)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        return new ViewingConditions(yFromLStar, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, lerp, f12, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float getAw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("113fa8a3", new Object[]{this})).floatValue();
        }
        return this.mAw;
    }

    public float getC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("742641a4", new Object[]{this})).floatValue();
        }
        return this.mC;
    }

    public float getFl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("192ce133", new Object[]{this})).floatValue();
        }
        return this.mFl;
    }

    public float getFlRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca38c735", new Object[]{this})).floatValue();
        }
        return this.mFlRoot;
    }

    public float getN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74c1442f", new Object[]{this})).floatValue();
        }
        return this.mN;
    }

    public float getNbb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a570226f", new Object[]{this})).floatValue();
        }
        return this.mNbb;
    }

    public float getNc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2654d2a2", new Object[]{this})).floatValue();
        }
        return this.mNc;
    }

    public float getNcb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a724fb0e", new Object[]{this})).floatValue();
        }
        return this.mNcb;
    }

    public float[] getRgbD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("884733cd", new Object[]{this});
        }
        return this.mRgbD;
    }

    public float getZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("756a5e3b", new Object[]{this})).floatValue();
        }
        return this.mZ;
    }
}
