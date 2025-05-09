package androidx.core.util;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TypedValueCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api34Impl() {
        }

        public static float deriveDimension(int i, float f, DisplayMetrics displayMetrics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a3a095e0", new Object[]{new Integer(i), new Float(f), displayMetrics})).floatValue();
            }
            return TypedValue.deriveDimension(i, f, displayMetrics);
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface ComplexDimensionUnit {
    }

    private TypedValueCompat() {
    }

    public static float deriveDimension(int i, float f, DisplayMetrics displayMetrics) {
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3a095e0", new Object[]{new Integer(i), new Float(f), displayMetrics})).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.deriveDimension(i, f, displayMetrics);
        }
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            float f4 = displayMetrics.density;
            if (f4 == 0.0f) {
                return 0.0f;
            }
            return f / f4;
        } else if (i != 2) {
            if (i == 3) {
                float f5 = displayMetrics.xdpi;
                if (f5 == 0.0f) {
                    return 0.0f;
                }
                f2 = f / f5;
                f3 = INCHES_PER_PT;
            } else if (i == 4) {
                float f6 = displayMetrics.xdpi;
                if (f6 == 0.0f) {
                    return 0.0f;
                }
                return f / f6;
            } else if (i == 5) {
                float f7 = displayMetrics.xdpi;
                if (f7 == 0.0f) {
                    return 0.0f;
                }
                f2 = f / f7;
                f3 = INCHES_PER_MM;
            } else {
                throw new IllegalArgumentException("Invalid unitToConvertTo " + i);
            }
            return f2 / f3;
        } else {
            float f8 = displayMetrics.scaledDensity;
            if (f8 == 0.0f) {
                return 0.0f;
            }
            return f / f8;
        }
    }

    public static float dpToPx(float f, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25822cf9", new Object[]{new Float(f), displayMetrics})).floatValue();
        }
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    public static int getUnitFromComplexDimension(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d8dcb015", new Object[]{new Integer(i)})).intValue() : i & 15;
    }

    public static float pxToSp(float f, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8e8dc8a", new Object[]{new Float(f), displayMetrics})).floatValue();
        }
        return deriveDimension(2, f, displayMetrics);
    }

    public static float spToPx(float f, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40434a0a", new Object[]{new Float(f), displayMetrics})).floatValue();
        }
        return TypedValue.applyDimension(2, f, displayMetrics);
    }

    public static float pxToDp(float f, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9348ef9", new Object[]{new Float(f), displayMetrics})).floatValue();
        }
        return deriveDimension(1, f, displayMetrics);
    }
}
