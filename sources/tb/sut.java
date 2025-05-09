package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321715);
    }

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f906fc68", new Object[]{new Long(j)})).longValue();
        }
        if (j > 0) {
            return j - (System.currentTimeMillis() - SystemClock.uptimeMillis());
        }
        return j;
    }
}
