package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ia2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static double a(double d, double d2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e80b2399", new Object[]{new Double(d), new Double(d2), new Integer(i)})).doubleValue();
        }
        return new BigDecimal(Double.toString(d)).divide(new BigDecimal(Double.toString(d2)), i, 1).doubleValue();
    }

    public static float b(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8283b5b", new Object[]{new Float(f), new Float(f2), new Integer(i)})).floatValue();
        }
        return new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(f2)), i, 1).floatValue();
    }
}
