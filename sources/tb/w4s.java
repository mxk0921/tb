package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w4s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593291);
    }

    public static void registerTLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc8127a", new Object[0]);
        } else if (b1v.bTlogExtend) {
            nhh.t(new vdh());
        }
    }
}
