package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class url {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321709);
    }

    public static long a(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("423edc6", new Object[]{obj, new Long(j)})).longValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return j;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (Exception e) {
            txj.f("new_detail异常", "ParseUtils.parseLong异常", e);
            return -1L;
        }
    }
}
