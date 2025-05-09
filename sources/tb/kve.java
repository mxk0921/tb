package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782856);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8001b7f", new Object[0]);
        }
        int d = z5r.d();
        if (d == 1) {
            return "poor";
        }
        if (d == 2) {
            return "normal";
        }
        if (d != 3) {
            return "unknown";
        }
        return "excellent";
    }
}
