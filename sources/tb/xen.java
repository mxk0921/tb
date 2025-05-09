package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xen {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Random f31337a = new Random();

    static {
        t2o.a(157286497);
    }

    public static double a(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58572c19", new Object[]{new Double(d), new Double(d2)})).doubleValue();
        }
        if (d2 < d || d < vu3.b.GEO_NOT_SUPPORT) {
            throw new IllegalArgumentException("");
        } else if (d == d2) {
            return d;
        } else {
            return d + ((d2 - d) * f31337a.nextDouble());
        }
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4621f90a", new Object[0])).longValue();
        }
        return c(0L, Long.MAX_VALUE);
    }

    public static long c(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4596e40a", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        if (j2 < j || j < 0) {
            throw new IllegalArgumentException("");
        } else if (j == j2) {
            return j;
        } else {
            return (long) a(j, j2);
        }
    }
}
