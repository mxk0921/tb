package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class zt4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856458);
    }

    public void onCoreSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc4fa79", new Object[]{this});
        }
    }

    public void onUCCorePrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1aa650", new Object[]{this});
        }
    }
}
