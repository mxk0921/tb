package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x23 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237932);
    }

    public static long a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5dc57f8", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        long j3 = j + j2;
        return ((j3 * (1 + j3)) / 2) + j2;
    }

    public static void b(long j, long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd893983", new Object[]{new Long(j), jArr});
            return;
        }
        if (jArr == null || jArr.length < 2) {
            jArr = new long[2];
        }
        long floor = (long) (Math.floor(Math.sqrt((8 * j) + 1) - 1.0d) / 2.0d);
        long j2 = j - (((floor * floor) + floor) / 2);
        jArr[0] = floor - j2;
        jArr[1] = j2;
    }
}
