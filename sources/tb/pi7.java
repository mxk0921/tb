package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pi7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944679);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[0]);
        }
        gqh a2 = zqh.d().a();
        if (a2 != null) {
            return a2.getDeviceLevel();
        }
        return "low";
    }
}
