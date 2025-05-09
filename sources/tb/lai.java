package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class lai {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    public static float a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float b(float f, float f2, float f3, float f4, float f5, float f6) {
        return e(a(f, f2, f3, f4), a(f, f2, f5, f4), a(f, f2, f5, f6), a(f, f2, f3, f6));
    }

    public static boolean c(float f, float f2, float f3) {
        if (f + f3 >= f2) {
            return true;
        }
        return false;
    }

    public static float d(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static float e(float f, float f2, float f3, float f4) {
        if (f > f2 && f > f3 && f > f4) {
            return f;
        }
        if (f2 > f3 && f2 > f4) {
            return f2;
        }
        if (f3 > f4) {
            return f3;
        }
        return f4;
    }
}
