package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Easing {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final String ANTICIPATE = "cubic(0.36, 0, 0.66, -0.56)";
    private static final String ANTICIPATE_NAME = "anticipate";
    private static final String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final String LINEAR = "cubic(1, 1, 0, 0)";
    private static final String LINEAR_NAME = "linear";
    private static final String OVERSHOOT = "cubic(0.34, 1.56, 0.64, 1)";
    private static final String OVERSHOOT_NAME = "overshoot";
    private static final String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
    private static final String STANDARD_NAME = "standard";
    public String mStr = "identity";
    public static Easing sDefault = new Easing();
    private static final String ACCELERATE_NAME = "accelerate";
    private static final String DECELERATE_NAME = "decelerate";
    public static String[] NAMED_EASING = {"standard", ACCELERATE_NAME, DECELERATE_NAME, "linear"};

    public double get(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc02ef", new Object[]{this, new Double(d)})).doubleValue();
        }
        return d;
    }

    public double getDiff(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49e98cea", new Object[]{this, new Double(d)})).doubleValue();
        }
        return 1.0d;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.mStr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        if (r4.equals(androidx.constraintlayout.core.motion.utils.Easing.ACCELERATE_NAME) == false) goto L_0x004e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.constraintlayout.core.motion.utils.Easing getInterpolator(java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(java.lang.String):androidx.constraintlayout.core.motion.utils.Easing");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CubicEasing extends Easing {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static double sDError = 1.0E-4d;
        private static double sError = 0.01d;
        public double mX1;
        public double mX2;
        public double mY1;
        public double mY2;

        public CubicEasing(String str) {
            this.mStr = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.mX1 = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.mY1 = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.mX2 = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.mY2 = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        private double getDiffX(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3b3bcf68", new Object[]{this, new Double(d)})).doubleValue();
            }
            double d2 = 1.0d - d;
            double d3 = this.mX1;
            double d4 = this.mX2;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        private double getDiffY(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3cf0a807", new Object[]{this, new Double(d)})).doubleValue();
            }
            double d2 = 1.0d - d;
            double d3 = this.mY1;
            double d4 = this.mY2;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        private double getX(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("34781a03", new Object[]{this, new Double(d)})).doubleValue();
            }
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.mX1 * d2 * d3 * d) + (this.mX2 * d3 * d * d) + (d * d * d);
        }

        private double getY(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("362cf2a2", new Object[]{this, new Double(d)})).doubleValue();
            }
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.mY1 * d2 * d3 * d) + (this.mY2 * d3 * d * d) + (d * d * d);
        }

        public static /* synthetic */ Object ipc$super(CubicEasing cubicEasing, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/Easing$CubicEasing");
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double get(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("72fc02ef", new Object[]{this, new Double(d)})).doubleValue();
            }
            if (d <= vu3.b.GEO_NOT_SUPPORT) {
                return vu3.b.GEO_NOT_SUPPORT;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > sError) {
                d2 *= 0.5d;
                if (getX(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double x = getX(d4);
            double d5 = d3 + d2;
            double x2 = getX(d5);
            double y = getY(d4);
            return (((getY(d5) - y) * (d - x)) / (x2 - x)) + y;
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double getDiff(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49e98cea", new Object[]{this, new Double(d)})).doubleValue();
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > sDError) {
                d2 *= 0.5d;
                if (getX(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (getY(d5) - getY(d4)) / (getX(d5) - getX(d4));
        }

        public void setup(double d, double d2, double d3, double d4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f6b7604", new Object[]{this, new Double(d), new Double(d2), new Double(d3), new Double(d4)});
                return;
            }
            this.mX1 = d;
            this.mY1 = d2;
            this.mX2 = d3;
            this.mY2 = d4;
        }

        public CubicEasing(double d, double d2, double d3, double d4) {
            setup(d, d2, d3, d4);
        }
    }
}
