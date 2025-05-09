package androidx.core.content.res;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CamUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};
    public static final float[][] SRGB_TO_XYZ = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private CamUtils() {
    }

    public static float lStarFromInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44da1285", new Object[]{new Integer(i)})).floatValue();
        }
        return lStarFromY(yFromInt(i));
    }

    public static float lStarFromY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cb236f8", new Object[]{new Float(f)})).floatValue();
        }
        float f2 = f / 100.0f;
        if (f2 <= 0.008856452f) {
            return f2 * 903.2963f;
        }
        return (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    public static float lerp(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("740de472", new Object[]{new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        return f + ((f2 - f) * f3);
    }

    public static float linearized(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22be1237", new Object[]{new Integer(i)})).floatValue();
        }
        float f = i / 255.0f;
        if (f <= 0.04045f) {
            return (f / 12.92f) * 100.0f;
        }
        return ((float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static void xyzFromInt(int i, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb84e9b", new Object[]{new Integer(i), fArr});
            return;
        }
        float linearized = linearized(Color.red(i));
        float linearized2 = linearized(Color.green(i));
        float linearized3 = linearized(Color.blue(i));
        float[][] fArr2 = SRGB_TO_XYZ;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * linearized) + (fArr3[1] * linearized2) + (fArr3[2] * linearized3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * linearized) + (fArr4[1] * linearized2) + (fArr4[2] * linearized3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (linearized * fArr5[0]) + (linearized2 * fArr5[1]) + (linearized3 * fArr5[2]);
    }

    public static float yFromInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54051da0", new Object[]{new Integer(i)})).floatValue();
        }
        float linearized = linearized(Color.red(i));
        float linearized2 = linearized(Color.green(i));
        float linearized3 = linearized(Color.blue(i));
        float[] fArr = SRGB_TO_XYZ[1];
        return (linearized * fArr[0]) + (linearized2 * fArr[1]) + (linearized3 * fArr[2]);
    }

    public static float yFromLStar(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a780560e", new Object[]{new Float(f)})).floatValue();
        }
        if (f > 8.0f) {
            return ((float) Math.pow((f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
        }
        return (f / 903.2963f) * 100.0f;
    }

    public static int intFromLStar(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e890a707", new Object[]{new Float(f)})).intValue();
        }
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return ColorUtils.XYZToColor(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }
}
