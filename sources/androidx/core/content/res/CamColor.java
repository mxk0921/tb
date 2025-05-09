package androidx.core.content.res;

import androidx.core.graphics.ColorUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CamColor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    public CamColor(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.mHue = f;
        this.mChroma = f2;
        this.mJ = f3;
        this.mQ = f4;
        this.mM = f5;
        this.mS = f6;
        this.mJstar = f7;
        this.mAstar = f8;
        this.mBstar = f9;
    }

    private static CamColor findCamByJ(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CamColor) ipChange.ipc$dispatch("d36ad6a6", new Object[]{new Float(f), new Float(f2), new Float(f3)});
        }
        float f4 = 1000.0f;
        CamColor camColor = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > 0.01f) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int viewedInSrgb = fromJch(f8, f2, f).viewedInSrgb();
            float lStarFromInt = CamUtils.lStarFromInt(viewedInSrgb);
            float abs = Math.abs(f3 - lStarFromInt);
            if (abs < 0.2f) {
                CamColor fromColor = fromColor(viewedInSrgb);
                float distance = fromColor.distance(fromJch(fromColor.getJ(), fromColor.getChroma(), f));
                if (distance <= 1.0f) {
                    camColor = fromColor;
                    f4 = abs;
                    f5 = distance;
                }
            }
            if (f4 == 0.0f && f5 == 0.0f) {
                break;
            } else if (lStarFromInt < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return camColor;
    }

    public static CamColor fromColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CamColor) ipChange.ipc$dispatch("6e3e4fbf", new Object[]{new Integer(i)});
        }
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        fromColorInViewingConditions(i, ViewingConditions.DEFAULT, fArr, fArr2);
        return new CamColor(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void fromColorInViewingConditions(int i, ViewingConditions viewingConditions, float[] fArr, float[] fArr2) {
        float f;
        float pow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568722ec", new Object[]{new Integer(i), viewingConditions, fArr, fArr2});
            return;
        }
        CamUtils.xyzFromInt(i, fArr2);
        float[][] fArr3 = CamUtils.XYZ_TO_CAM16RGB;
        float f2 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f3 = fArr2[1];
        float f4 = (fArr4[0] * f2) + (fArr4[1] * f3);
        float f5 = fArr2[2];
        float f6 = f4 + (fArr4[2] * f5);
        float[] fArr5 = fArr3[1];
        float f7 = (fArr5[0] * f2) + (fArr5[1] * f3) + (fArr5[2] * f5);
        float[] fArr6 = fArr3[2];
        float f8 = viewingConditions.getRgbD()[0] * f6;
        float f9 = viewingConditions.getRgbD()[1] * f7;
        float f10 = viewingConditions.getRgbD()[2] * ((f2 * fArr6[0]) + (f3 * fArr6[1]) + (f5 * fArr6[2]));
        float pow2 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f8)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f9)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f10)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f11 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f12 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f13 = signum2 * 20.0f;
        float f14 = (((signum * 20.0f) + f13) + (21.0f * signum3)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((f15 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(pow5 / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        if (atan2 < 20.14d) {
            f = atan2 + 360.0f;
        } else {
            f = atan2;
        }
        float sqrt = ((float) Math.sqrt(pow5 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f11 * f11) + (f12 * f12)))) / (f14 + 0.305f), 0.9d));
        float flRoot = viewingConditions.getFlRoot() * sqrt;
        float sqrt2 = ((float) Math.sqrt((pow * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f17 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
        double d2 = f16;
        float cos = ((float) Math.cos(d2)) * log;
        float sin = log * ((float) Math.sin(d2));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow5;
            fArr[1] = c;
            fArr[2] = flRoot;
            fArr[3] = sqrt2;
            fArr[4] = f17;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    private static CamColor fromJch(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CamColor) ipChange.ipc$dispatch("fe7dc34e", new Object[]{new Float(f), new Float(f2), new Float(f3)});
        }
        return fromJchInFrame(f, f2, f3, ViewingConditions.DEFAULT);
    }

    private static CamColor fromJchInFrame(float f, float f2, float f3, ViewingConditions viewingConditions) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CamColor) ipChange.ipc$dispatch("5fe0b6dd", new Object[]{new Float(f), new Float(f2), new Float(f3), viewingConditions});
        }
        float flRoot = viewingConditions.getFlRoot() * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(f / 100.0d)) * (viewingConditions.getAw() + 4.0f);
        float flRoot2 = f2 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((flRoot2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new CamColor(f3, f2, f, flRoot, flRoot2, sqrt, f4, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static void getM3HCTfromColor(int i, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80db80b", new Object[]{new Integer(i), fArr});
            return;
        }
        fromColorInViewingConditions(i, ViewingConditions.DEFAULT, null, fArr);
        fArr[2] = CamUtils.lStarFromInt(i);
    }

    public static int toColor(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ba809724", new Object[]{new Float(f), new Float(f2), new Float(f3)})).intValue() : toColor(f, f2, f3, ViewingConditions.DEFAULT);
    }

    public float distance(CamColor camColor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a2d6f18", new Object[]{this, camColor})).floatValue();
        }
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    public float getAStar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f91f694", new Object[]{this})).floatValue();
        }
        return this.mAstar;
    }

    public float getBStar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13d66595", new Object[]{this})).floatValue();
        }
        return this.mBstar;
    }

    public float getChroma() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93fae3e3", new Object[]{this})).floatValue();
        }
        return this.mChroma;
    }

    public float getHue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88a11939", new Object[]{this})).floatValue();
        }
        return this.mHue;
    }

    public float getJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7488e62b", new Object[]{this})).floatValue();
        }
        return this.mJ;
    }

    public float getJStar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5f9dd9d", new Object[]{this})).floatValue();
        }
        return this.mJstar;
    }

    public float getM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74b32cae", new Object[]{this})).floatValue();
        }
        return this.mM;
    }

    public float getQ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74eb8ab2", new Object[]{this})).floatValue();
        }
        return this.mQ;
    }

    public float getS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7507b9b4", new Object[]{this})).floatValue();
        }
        return this.mS;
    }

    public int viewed(ViewingConditions viewingConditions) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("162b6383", new Object[]{this, viewingConditions})).intValue();
        }
        if (getChroma() == vu3.b.GEO_NOT_SUPPORT || getJ() == vu3.b.GEO_NOT_SUPPORT) {
            f = 0.0f;
        } else {
            f = getChroma() / ((float) Math.sqrt(getJ() / 100.0d));
        }
        float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float aw = viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()));
        float cos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f3 = (((0.305f + nbb) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = nbb * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max((double) vu3.b.GEO_NOT_SUPPORT, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max((double) vu3.b.GEO_NOT_SUPPORT, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum3 = Math.signum(((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max((double) vu3.b.GEO_NOT_SUPPORT, (Math.abs(f2) * 27.13d) / (400.0d - Math.abs(f2))), 2.380952380952381d));
        float f9 = signum / viewingConditions.getRgbD()[0];
        float f10 = signum2 / viewingConditions.getRgbD()[1];
        float f11 = signum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f12, (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11), (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    public int viewedInSrgb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("522e0c5d", new Object[]{this})).intValue();
        }
        return viewed(ViewingConditions.DEFAULT);
    }

    public static int toColor(float f, float f2, float f3, ViewingConditions viewingConditions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88d3f69d", new Object[]{new Float(f), new Float(f2), new Float(f3), viewingConditions})).intValue();
        }
        if (f2 < 1.0d || Math.round(f3) <= vu3.b.GEO_NOT_SUPPORT || Math.round(f3) >= 100.0d) {
            return CamUtils.intFromLStar(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        CamColor camColor = null;
        float f4 = f2;
        boolean z = true;
        float f5 = 0.0f;
        while (Math.abs(f5 - f2) >= 0.4f) {
            CamColor findCamByJ = findCamByJ(min, f4, f3);
            if (!z) {
                if (findCamByJ == null) {
                    f2 = f4;
                } else {
                    f5 = f4;
                    camColor = findCamByJ;
                }
                f4 = ((f2 - f5) / 2.0f) + f5;
            } else if (findCamByJ != null) {
                return findCamByJ.viewed(viewingConditions);
            } else {
                f4 = ((f2 - f5) / 2.0f) + f5;
                z = false;
            }
        }
        if (camColor == null) {
            return CamUtils.intFromLStar(f3);
        }
        return camColor.viewed(viewingConditions);
    }
}
