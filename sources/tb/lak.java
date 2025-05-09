package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class lak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713755);
    }

    public static double a(double d, double d2) {
        double d3;
        double nextDouble;
        double pow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9605f7e9", new Object[]{new Double(d), new Double(d2)})).doubleValue();
        }
        Random random = new Random();
        if (d < 1.0d) {
            do {
                double nextDouble2 = random.nextDouble();
                nextDouble = random.nextDouble();
                pow = Math.pow(nextDouble2, 1.0d / d);
            } while (Math.pow(nextDouble, 1.0d / (1.0d - d)) + pow > 1.0d);
            return (-Math.log(random.nextDouble())) * pow * d2;
        }
        double d4 = d - 0.3333333333333333d;
        double sqrt = 1.0d / Math.sqrt(9.0d * d4);
        while (true) {
            double nextGaussian = random.nextGaussian();
            double d5 = (sqrt * nextGaussian) + 1.0d;
            if (d5 > vu3.b.GEO_NOT_SUPPORT) {
                d3 = d5 * d5 * d5;
                double nextDouble3 = random.nextDouble();
                double d6 = nextGaussian * nextGaussian;
                if (nextDouble3 < 1.0d - ((0.0331d * d6) * d6) || Math.log(nextDouble3) < (0.5d * nextGaussian * nextGaussian) + (((1.0d - d3) + Math.log(d3)) * d4)) {
                    break;
                }
            }
        }
        return d4 * d3 * d2;
    }

    public static double b(double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26b0c479", new Object[]{new Double(d), new Double(d2), new Double(d3), new Double(d4)})).doubleValue();
        }
        while (true) {
            double a2 = a(d, d2);
            if (a2 <= d4 && a2 >= d3) {
                return a2;
            }
        }
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35bca6f8", new Object[]{str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            ir9.c("NumUtils", "", e);
            return 0;
        }
    }
}
