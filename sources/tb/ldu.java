package tb;

import android.net.TrafficStats;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ldu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f23282a = Process.myUid();
    public static boolean b = true;

    public static long[] a() {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("20db164a", new Object[0]);
        }
        long[] jArr = new long[2];
        if (b && (i = f23282a) > 0) {
            jArr[0] = TrafficStats.getUidRxBytes(i);
            long uidTxBytes = TrafficStats.getUidTxBytes(i);
            jArr[1] = uidTxBytes;
            if (jArr[0] >= 0 && uidTxBytes >= 0) {
                z = true;
            }
            b = z;
        }
        return jArr;
    }
}
