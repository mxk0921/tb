package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class mcp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544380);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ef9d451", new Object[0])).longValue();
        }
        try {
            return lut.m().i();
        } catch (Throwable th) {
            ku0.j("ServerClock.now", th);
            return System.currentTimeMillis();
        }
    }
}
