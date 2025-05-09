package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ptt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e39c9d43", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        return TimeUnit.MILLISECONDS.toMillis(j2 - j);
    }

    public static long b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53ce8417", new Object[]{new Long(j)})).longValue();
        }
        return a(j, System.currentTimeMillis());
    }
}
