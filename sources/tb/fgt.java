package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fgt implements IInfoFlowDevice {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782152);
        t2o.a(486539301);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDevice
    public String getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[]{this});
        }
        return m0b.d();
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDevice
    public int getDeviceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be20", new Object[]{this})).intValue();
        }
        return (int) qp0.c();
    }
}
