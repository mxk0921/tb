package tb;

import kotlin.random.Random;
import kotlin.random.XorWowRandom;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class uen {
    public static final Random a(int i) {
        return new XorWowRandom(i, i >> 31);
    }

    public static final String b(Object obj, Object obj2) {
        ckf.g(obj, "from");
        ckf.g(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void c(double d, double d2) {
        if (d2 <= d) {
            throw new IllegalArgumentException(b(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    public static final void d(int i, int i2) {
        if (i2 <= i) {
            throw new IllegalArgumentException(b(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public static final void e(long j, long j2) {
        if (j2 <= j) {
            throw new IllegalArgumentException(b(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    public static final int f(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final int g(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
