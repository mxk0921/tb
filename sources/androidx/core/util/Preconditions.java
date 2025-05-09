package androidx.core.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class Preconditions {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private Preconditions() {
    }

    public static void checkArgument(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f0c668", new Object[]{new Boolean(z)});
        } else if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b72dfe1f", new Object[]{new Float(f), str})).floatValue();
        }
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        } else if (!Float.isInfinite(f)) {
            return f;
        } else {
            throw new IllegalArgumentException(str + " must not be infinite");
        }
    }

    public static int checkArgumentInRange(int i, int i2, int i3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17333b66", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), str})).intValue();
        }
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        } else if (i <= i3) {
            return i;
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
        }
    }

    public static int checkArgumentNonnegative(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2d3b09c", new Object[]{new Integer(i), str})).intValue();
        }
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57e53456", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    public static <T> T checkNotNull(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("56526bdd", new Object[]{t});
        }
        t.getClass();
        return t;
    }

    public static void checkState(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e59d2e", new Object[]{new Boolean(z), str});
        } else if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((CharSequence) ipChange.ipc$dispatch("371dabbc", new Object[]{t}));
        }
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException();
    }

    public static void checkArgument(boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806ec44", new Object[]{new Boolean(z), obj});
        } else if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkArgumentNonnegative(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a98fd092", new Object[]{new Integer(i)})).intValue();
        }
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T checkNotNull(T t, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("370afac1", new Object[]{t, obj});
        }
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375b4464", new Object[]{new Boolean(z)});
        } else {
            checkState(z, null);
        }
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd403bf", new Object[]{new Boolean(z), str, objArr});
        } else if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((CharSequence) ipChange.ipc$dispatch("f0ef67e0", new Object[]{t, obj}));
        }
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((CharSequence) ipChange.ipc$dispatch("5fe197f1", new Object[]{t, str, objArr}));
        }
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static long checkArgumentInRange(long j, long j2, long j3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f48384c8", new Object[]{new Long(j), new Long(j2), new Long(j3), str})).longValue();
        }
        if (j < j2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + j2 + ", " + j3 + "] (too low)");
        } else if (j <= j3) {
            return j;
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + j2 + ", " + j3 + "] (too high)");
        }
    }

    public static float checkArgumentInRange(float f, float f2, float f3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f425f40", new Object[]{new Float(f), new Float(f2), new Float(f3), str})).floatValue();
        }
        if (f < f2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f2), Float.valueOf(f3)));
        } else if (f <= f3) {
            return f;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f2), Float.valueOf(f3)));
        }
    }

    public static double checkArgumentInRange(double d, double d2, double d3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4a1cc7c", new Object[]{new Double(d), new Double(d2), new Double(d3), str})).doubleValue();
        }
        if (d < d2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d2), Double.valueOf(d3)));
        } else if (d <= d3) {
            return d;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d2), Double.valueOf(d3)));
        }
    }
}
