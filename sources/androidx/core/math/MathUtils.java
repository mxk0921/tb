package androidx.core.math;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MathUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private MathUtils() {
    }

    public static int addExact(int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d7df78", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = i + i2;
        if ((i >= 0) == (i2 >= 0)) {
            boolean z2 = i >= 0;
            if (i3 < 0) {
                z = false;
            }
            if (z2 != z) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i3;
    }

    public static double clamp(double d, double d2, double d3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b727c96a", new Object[]{new Double(d), new Double(d2), new Double(d3)})).doubleValue() : d < d2 ? d2 : d > d3 ? d3 : d;
    }

    public static int decrementExact(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f93188a3", new Object[]{new Integer(i)})).intValue();
        }
        if (i != Integer.MIN_VALUE) {
            return i - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6a6647f", new Object[]{new Integer(i)})).intValue();
        }
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int multiplyExact(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db7a3215", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = i * i2;
        if (i == 0 || i2 == 0 || (i3 / i == i2 && i3 / i2 == i)) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int negateExact(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cca16452", new Object[]{new Integer(i)})).intValue();
        }
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int subtractExact(int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea7a4725", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = i - i2;
        if ((i < 0) != (i2 < 0)) {
            boolean z2 = i < 0;
            if (i3 >= 0) {
                z = false;
            }
            if (z2 != z) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i3;
    }

    public static int toIntExact(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b19605", new Object[]{new Long(j)})).intValue();
        }
        if (j <= 2147483647L && j >= -2147483648L) {
            return (int) j;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long addExact(long j, long j2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d85799", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        long j3 = j + j2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if ((i >= 0) == (j2 >= 0)) {
            boolean z2 = i >= 0;
            if (j3 < 0) {
                z = false;
            }
            if (z2 != z) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j3;
    }

    public static float clamp(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b744e8ae", new Object[]{new Float(f), new Float(f2), new Float(f3)})).floatValue() : f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static long decrementExact(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9318c65", new Object[]{new Long(j)})).longValue();
        }
        if (j != Long.MIN_VALUE) {
            return j - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6a66841", new Object[]{new Long(j)})).longValue();
        }
        if (j != Long.MAX_VALUE) {
            return j + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long negateExact(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cca16814", new Object[]{new Long(j)})).longValue();
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long subtractExact(long j, long j2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea7abf46", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        long j3 = j - j2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if ((i < 0) != (j2 < 0)) {
            boolean z2 = i < 0;
            if (j3 >= 0) {
                z = false;
            }
            if (z2 != z) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j3;
    }

    public static int clamp(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b7709794", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static long multiplyExact(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db7aaa36", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        long j3 = j * j2;
        if (j == 0 || j2 == 0 || (j3 / j == j2 && j3 / j2 == j)) {
            return j3;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long clamp(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b77f2736", new Object[]{new Long(j), new Long(j2), new Long(j3)})).longValue() : j < j2 ? j2 : j > j3 ? j3 : j;
    }
}
