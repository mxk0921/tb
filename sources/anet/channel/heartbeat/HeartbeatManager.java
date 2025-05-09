package anet.channel.heartbeat;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HeartbeatManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(607125666);
    }

    public static IHeartbeat getDefaultBackgroundAccsHeartbeat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHeartbeat) ipChange.ipc$dispatch("8fcd8284", new Object[0]);
        }
        return new DefaultBgAccsHeartbeatImpl();
    }

    public static IHeartbeat getDefaultHeartbeat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHeartbeat) ipChange.ipc$dispatch("bd8fe1c4", new Object[0]);
        }
        return new DefaultHeartbeatImpl();
    }
}
