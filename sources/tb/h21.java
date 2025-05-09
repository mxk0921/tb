package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h21 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331692);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b01fdc45", new Object[0])).longValue();
        }
        return System.currentTimeMillis() - c21.g().getLong("startProcessSystemTime", -1L);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421b04", new Object[0])).booleanValue();
        }
        return c21.g().getBoolean("isFirstLaunch", false);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("767f7a1f", new Object[0])).booleanValue();
        }
        return c21.g().getBoolean("isFullNewInstall", false);
    }
}
