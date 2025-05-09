package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class out {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f536047", new Object[0])).longValue();
        }
        return SystemClock.uptimeMillis();
    }

    public static long b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f906fc68", new Object[]{new Long(j)})).longValue();
        }
        if (j > 0) {
            return j - (System.currentTimeMillis() - SystemClock.uptimeMillis());
        }
        return j;
    }

    public static long c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fad39ae", new Object[]{new Long(j)})).longValue();
        }
        if (j > 0) {
            return j + (System.currentTimeMillis() - SystemClock.uptimeMillis());
        }
        return j;
    }
}
