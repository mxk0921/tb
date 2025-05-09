package anet.channel.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConnEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isSuccess = false;
    public long connTime = Long.MAX_VALUE;
    public boolean isAccs = false;
    public boolean isTunnel = false;
    public boolean isForceCell = false;
    public ProxyStrategy useProxyStrategy = null;

    static {
        t2o.a(607125828);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (this.isSuccess) {
            return "ConnEvent#Success";
        }
        return "ConnEvent#Fail";
    }
}
