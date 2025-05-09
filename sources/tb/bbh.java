package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static double a(double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c2436e0", new Object[]{new Double(d), new Double(d2), new Double(d3), new Double(d4)})).doubleValue();
        }
        double c = c(d2);
        double c2 = c(d4);
        return (Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((c - c2) / 2.0d), 2.0d) + ((Math.cos(c) * Math.cos(c2)) * Math.pow(Math.sin((c(d) - c(d3)) / 2.0d), 2.0d)))) * 2.0d) * 6378.137d) * 10000.0d) / 10000.0d) * 1000.0d;
    }

    public static Double b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("6ea52986", new Object[]{str, str2, str3, str4});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            try {
                return Double.valueOf(a(Double.parseDouble(str), Double.parseDouble(str2), Double.parseDouble(str3), Double.parseDouble(str4)));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static double c(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fac27990", new Object[]{new Double(d)})).doubleValue();
        }
        return (d * 3.141592653589793d) / 180.0d;
    }
}
