package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "mtuDetect")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MtuDetectStat extends StatObject {
    @Dimension
    public int errCode;
    @Dimension
    public String ip;
    @Dimension
    public int mtu;
    @Dimension
    public int pingSuccessCount;
    @Dimension
    public int pingTimeoutCount;
    @Dimension
    public String rtt;
    @Dimension
    public String nettype = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public String mnc = NetworkStatusHelper.getSimOp();
    @Dimension
    public String bssid = NetworkStatusHelper.getWifiBSSID();

    static {
        t2o.a(607125775);
    }
}
