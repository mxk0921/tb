package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "CustomFrame")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CustomFrameStat extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String connType;
    @Dimension
    public int dataChannel;
    @Dimension
    public int dataQoS;
    @Dimension
    public int errCode;
    @Dimension
    public String host;
    @Dimension
    public boolean isAccs;
    @Dimension
    public int ret = 0;
    @Dimension
    public String netType = NetworkStatusHelper.getStatus().toString();

    static {
        t2o.a(607125756);
    }

    public static /* synthetic */ Object ipc$super(CustomFrameStat customFrameStat, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/CustomFrameStat");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CustomFrameStat{host='" + this.host + "', isAccs=" + this.isAccs + ", ret=" + this.ret + ", errCode=" + this.errCode + ", netType='" + this.netType + ", connType='" + this.connType + ", dataChannel=" + this.dataChannel + ", dataQoS=" + this.dataQoS + "'}";
    }
}
