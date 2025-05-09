package androidx.core.graphics;

import android.graphics.Color;
import androidx.core.content.res.CamColor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;
import tb.f7l;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ColorUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final ThreadLocal<double[]> TEMP_ARRAY = new ThreadLocal<>();
    private static final double XYZ_EPSILON = 0.008856d;
    private static final double XYZ_KAPPA = 903.3d;
    private static final double XYZ_WHITE_REFERENCE_X = 95.047d;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0d;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static Color compositeColors(Color color, Color color2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Color) ipChange.ipc$dispatch("ae22c188", new Object[]{color, color2});
            }
            if (Objects.equals(color.getModel(), color2.getModel())) {
                if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                    color = color.convert(color2.getColorSpace());
                }
                float[] components = color.getComponents();
                float[] components2 = color2.getComponents();
                float alpha = color.alpha();
                float alpha2 = color2.alpha() * (1.0f - alpha);
                int componentCount = color2.getComponentCount() - 1;
                float f = alpha + alpha2;
                components2[componentCount] = f;
                if (f > 0.0f) {
                    alpha /= f;
                    alpha2 /= f;
                }
                for (int i = 0; i < componentCount; i++) {
                    components2[i] = (components[i] * alpha) + (components2[i] * alpha2);
                }
                return Color.valueOf(components2, color2.getColorSpace());
            }
            throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + f7l.BRACKET_END_STR);
        }
    }

    private ColorUtils() {
    }

    public static int HSLToColor(float[] fArr) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("949e0f0c", new Object[]{fArr})).intValue();
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                i = Math.round(f4 * 255.0f);
                break;
            case 1:
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                i = Math.round(f4 * 255.0f);
                break;
            case 2:
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                i = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                i = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                i = 0;
                i3 = 0;
                i2 = 0;
                break;
        }
        return Color.rgb(constrain(i3, 0, 255), constrain(i2, 0, 255), constrain(i, 0, 255));
    }

    public static void LABToXYZ(double d, double d2, double d3, double[] dArr) {
        double d4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99983c8f", new Object[]{new Double(d), new Double(d2), new Double(d3), dArr});
            return;
        }
        double d5 = (d + 16.0d) / 116.0d;
        double d6 = (d2 / 500.0d) + d5;
        double d7 = d5 - (d3 / 200.0d);
        double pow = Math.pow(d6, 3.0d);
        if (pow <= XYZ_EPSILON) {
            pow = ((d6 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        if (d > 7.9996247999999985d) {
            d4 = Math.pow(d5, 3.0d);
        } else {
            d4 = d / XYZ_KAPPA;
        }
        double pow2 = Math.pow(d7, 3.0d);
        if (pow2 <= XYZ_EPSILON) {
            pow2 = ((d7 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        dArr[0] = pow * XYZ_WHITE_REFERENCE_X;
        dArr[1] = d4 * 100.0d;
        dArr[2] = pow2 * XYZ_WHITE_REFERENCE_Z;
    }

    public static int M3HCTToColor(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9093577", new Object[]{new Float(f), new Float(f2), new Float(f3)})).intValue();
        }
        return CamColor.toColor(f, f2, f3);
    }

    public static void RGBToHSL(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d1ce0e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), fArr});
            return;
        }
        float f3 = i / 255.0f;
        float f4 = i2 / 255.0f;
        float f5 = i3 / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            if (max == f3) {
                f = ((f4 - f5) / f6) % 6.0f;
            } else if (max == f4) {
                f = ((f5 - f3) / f6) + 2.0f;
            } else {
                f = 4.0f + ((f3 - f4) / f6);
            }
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = constrain(f8, 0.0f, 360.0f);
        fArr[1] = constrain(f2, 0.0f, 1.0f);
        fArr[2] = constrain(f7, 0.0f, 1.0f);
    }

    public static void RGBToLAB(int i, int i2, int i3, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa55f40", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), dArr});
            return;
        }
        RGBToXYZ(i, i2, i3, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static int XYZToColor(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3be811bb", new Object[]{new Double(d), new Double(d2), new Double(d3)})).intValue();
        }
        double d7 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d8 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d9 = (((d * 0.0557d) + (d2 * (-0.204d))) + (1.057d * d3)) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        return Color.rgb(constrain((int) Math.round(d4 * 255.0d), 0, 255), constrain((int) Math.round(d5 * 255.0d), 0, 255), constrain((int) Math.round(d6 * 255.0d), 0, 255));
    }

    public static int blendARGB(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b011a2f", new Object[]{new Integer(i), new Integer(i2), new Float(f)})).intValue();
        }
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public static double calculateContrast(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec2b0d9d", new Object[]{new Integer(i), new Integer(i2)})).doubleValue();
        }
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = compositeColors(i, i2);
            }
            double calculateLuminance = calculateLuminance(i) + 0.05d;
            double calculateLuminance2 = calculateLuminance(i2) + 0.05d;
            return Math.max(calculateLuminance, calculateLuminance2) / Math.min(calculateLuminance, calculateLuminance2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    public static double calculateLuminance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ce7a58", new Object[]{new Integer(i)})).doubleValue();
        }
        double[] tempDouble3Array = getTempDouble3Array();
        colorToXYZ(i, tempDouble3Array);
        return tempDouble3Array[1] / 100.0d;
    }

    public static int calculateMinimumAlpha(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("479a436", new Object[]{new Integer(i), new Integer(i2), new Float(f)})).intValue();
        }
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = f;
            if (calculateContrast(setAlphaComponent(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (calculateContrast(setAlphaComponent(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    public static float circularInterpolate(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7b3f6a7", new Object[]{new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > f) {
                f += 360.0f;
            } else {
                f2 += 360.0f;
            }
        }
        return (f + ((f2 - f) * f3)) % 360.0f;
    }

    public static void colorToHSL(int i, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af8b424", new Object[]{new Integer(i), fArr});
        } else {
            RGBToHSL(Color.red(i), Color.green(i), Color.blue(i), fArr);
        }
    }

    public static void colorToLAB(int i, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e082e256", new Object[]{new Integer(i), dArr});
        } else {
            RGBToLAB(Color.red(i), Color.green(i), Color.blue(i), dArr);
        }
    }

    public static void colorToM3HCT(int i, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a8d92", new Object[]{new Integer(i), fArr});
        } else {
            CamColor.getM3HCTfromColor(i, fArr);
        }
    }

    public static void colorToXYZ(int i, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77accca", new Object[]{new Integer(i), dArr});
        } else {
            RGBToXYZ(Color.red(i), Color.green(i), Color.blue(i), dArr);
        }
    }

    private static int compositeAlpha(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3aabcf1", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    public static int compositeColors(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bce5fcb1", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int compositeAlpha = compositeAlpha(alpha2, alpha);
        return Color.argb(compositeAlpha, compositeComponent(Color.red(i), alpha2, Color.red(i2), alpha, compositeAlpha), compositeComponent(Color.green(i), alpha2, Color.green(i2), alpha, compositeAlpha), compositeComponent(Color.blue(i), alpha2, Color.blue(i2), alpha, compositeAlpha));
    }

    private static int compositeComponent(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb960499", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
        }
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    private static float constrain(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa4d6c72", new Object[]{new Float(f), new Float(f2), new Float(f3)})).floatValue() : f < f2 ? f2 : Math.min(f, f3);
    }

    private static double[] getTempDouble3Array() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (double[]) ipChange.ipc$dispatch("f663bb77", new Object[0]);
        }
        ThreadLocal<double[]> threadLocal = TEMP_ARRAY;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    private static double pivotXyzComponent(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46d7837f", new Object[]{new Double(d)})).doubleValue();
        }
        if (d > XYZ_EPSILON) {
            return Math.pow(d, 0.3333333333333333d);
        }
        return ((d * XYZ_KAPPA) + 16.0d) / 116.0d;
    }

    public static int setAlphaComponent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e26d49b", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    private static int constrain(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa791b58", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : i < i2 ? i2 : Math.min(i, i3);
    }

    public static int LABToColor(double d, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1b2e6af", new Object[]{new Double(d), new Double(d2), new Double(d3)})).intValue();
        }
        double[] tempDouble3Array = getTempDouble3Array();
        LABToXYZ(d, d2, d3, tempDouble3Array);
        return XYZToColor(tempDouble3Array[0], tempDouble3Array[1], tempDouble3Array[2]);
    }

    public static double distanceEuclidean(double[] dArr, double[] dArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f16aecb0", new Object[]{dArr, dArr2})).doubleValue();
        }
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    public static void XYZToLAB(double d, double d2, double d3, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb264a27", new Object[]{new Double(d), new Double(d2), new Double(d3), dArr});
        } else if (dArr.length == 3) {
            double pivotXyzComponent = pivotXyzComponent(d / XYZ_WHITE_REFERENCE_X);
            double pivotXyzComponent2 = pivotXyzComponent(d2 / 100.0d);
            double pivotXyzComponent3 = pivotXyzComponent(d3 / XYZ_WHITE_REFERENCE_Z);
            dArr[0] = Math.max((double) vu3.b.GEO_NOT_SUPPORT, (116.0d * pivotXyzComponent2) - 16.0d);
            dArr[1] = (pivotXyzComponent - pivotXyzComponent2) * 500.0d;
            dArr[2] = (pivotXyzComponent2 - pivotXyzComponent3) * 200.0d;
        } else {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
    }

    public static void blendHSL(float[] fArr, float[] fArr2, float f, float[] fArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78bcfde", new Object[]{fArr, fArr2, new Float(f), fArr3});
        } else if (fArr3.length == 3) {
            float f2 = 1.0f - f;
            fArr3[0] = circularInterpolate(fArr[0], fArr2[0], f);
            fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
            fArr3[2] = (fArr[2] * f2) + (fArr2[2] * f);
        } else {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
    }

    public static void blendLAB(double[] dArr, double[] dArr2, double d, double[] dArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9993ca12", new Object[]{dArr, dArr2, new Double(d), dArr3});
        } else if (dArr3.length == 3) {
            double d2 = 1.0d - d;
            dArr3[0] = (dArr[0] * d2) + (dArr2[0] * d);
            dArr3[1] = (dArr[1] * d2) + (dArr2[1] * d);
            dArr3[2] = (dArr[2] * d2) + (dArr2[2] * d);
        } else {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
    }

    public static void RGBToXYZ(int i, int i2, int i3, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84c7cb4", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), dArr});
        } else if (dArr.length == 3) {
            double d = i / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = i2 / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = i3 / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
        } else {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
    }

    public static Color compositeColors(Color color, Color color2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Color) ipChange.ipc$dispatch("ae22c188", new Object[]{color, color2}) : Api26Impl.compositeColors(color, color2);
    }
}
