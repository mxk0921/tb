package anetwork.channel.stat;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkStat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(607126110);
    }

    public static INetworkStat getNetworkStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INetworkStat) ipChange.ipc$dispatch("b1d2d6ec", new Object[0]);
        }
        return NetworkStatCache.getInstance();
    }
}
