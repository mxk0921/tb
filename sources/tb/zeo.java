package tb;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import androidx.core.graphics.ColorUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class zeo {
    public static final boolean USE_FRAMEWORK_RIPPLE = true;

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f32710a = {16842919};
    public static final int[] b = {16843623, 16842908};
    public static final int[] c = {16842908};
    public static final int[] d = {16843623};
    public static final int[] e = {16842913, 16842919};
    public static final int[] f = {16842913, 16843623, 16842908};
    public static final int[] g = {16842913, 16842908};
    public static final int[] h = {16842913, 16843623};
    public static final int[] i = {16842913};
    public static final int[] j = {16842910, 16842919};

    public static ColorStateList a(ColorStateList colorStateList) {
        boolean z = USE_FRAMEWORK_RIPPLE;
        int[] iArr = f32710a;
        int[] iArr2 = e;
        int[] iArr3 = i;
        if (z) {
            return new ColorStateList(new int[][]{iArr3, StateSet.NOTHING}, new int[]{c(colorStateList, iArr2), c(colorStateList, iArr)});
        }
        int[] iArr4 = f;
        int[] iArr5 = g;
        int[] iArr6 = h;
        int[] iArr7 = b;
        int[] iArr8 = c;
        int[] iArr9 = d;
        return new ColorStateList(new int[][]{iArr2, iArr4, iArr5, iArr6, iArr3, iArr, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{c(colorStateList, iArr2), c(colorStateList, iArr4), c(colorStateList, iArr5), c(colorStateList, iArr6), 0, c(colorStateList, iArr), c(colorStateList, iArr7), c(colorStateList, iArr8), c(colorStateList, iArr9), 0});
    }

    public static int b(int i2) {
        return ColorUtils.setAlphaComponent(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    public static int c(ColorStateList colorStateList, int[] iArr) {
        int i2;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i2 = 0;
        }
        if (USE_FRAMEWORK_RIPPLE) {
            return b(i2);
        }
        return i2;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(j, 0));
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
