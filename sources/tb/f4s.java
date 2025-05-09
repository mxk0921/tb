package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f4s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356522);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec0bfeda", new Object[0])).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (v2s.o().C() != null) {
            return v2s.o().C().getServerTime();
        }
        return currentTimeMillis;
    }
}
