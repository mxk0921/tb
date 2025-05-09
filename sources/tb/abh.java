package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class abh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(789577863);
    }

    public static double a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b905fbdf", new Object[]{new Double(d)})).doubleValue();
        }
        return b(d) / 60.0d;
    }

    public static double b(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37af38bb", new Object[]{new Double(d)})).doubleValue();
        }
        return (Math.sin(((90.0d - d) * 3.1415926d) / 180.0d) * 40075.36d) / 360.0d;
    }

    public static double c(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca0252b2", new Object[]{new Double(d)})).doubleValue();
        }
        return a(d) / 60.0d;
    }

    public static double d(int i, int i2, int i3, int i4, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37bb93aa", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Double(d)})).doubleValue();
        }
        double d2 = i2 / d;
        double d3 = i4 / d;
        double c = ((i / d) - (i3 / d)) * 3600.0d * c((d2 / 2.0d) + (d3 / 2.0d));
        double d4 = (d3 - d2) * 3600.0d * 0.03081841820987654d;
        return Math.sqrt((c * c) + (d4 * d4));
    }
}
