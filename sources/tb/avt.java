package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class avt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856450);
    }

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93a91012", new Object[]{new Long(j)})).longValue();
        }
        if (j > 0) {
            return (SystemClock.uptimeMillis() - System.currentTimeMillis()) + j;
        }
        return 0L;
    }
}
