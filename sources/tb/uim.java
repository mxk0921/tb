package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.postureCenter.core.PostureCenterLifeCycleDetector;
import com.taobao.android.behavix.postureCenter.services.base.bridge.SimpleNetBridge;
import com.taobao.android.behavix.postureCenter.services.info.DevicesDelegate;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uim {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750549);
    }

    public static DevicesDelegate a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DevicesDelegate) ipChange.ipc$dispatch("e0e9c40b", new Object[0]);
        }
        return DevicesDelegate.j();
    }

    public static p6a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p6a) ipChange.ipc$dispatch("7377561d", new Object[0]);
        }
        return p6a.f();
    }

    public static PostureCenterLifeCycleDetector c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PostureCenterLifeCycleDetector) ipChange.ipc$dispatch("81e1904c", new Object[0]);
        }
        return PostureCenterLifeCycleDetector.b();
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8c0ba9", new Object[0]);
        } else {
            SimpleNetBridge.initWithCheck();
        }
    }
}
