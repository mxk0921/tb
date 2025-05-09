package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "nettype")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetTypeStat extends StatObject {
    @Dimension
    public int ipStackType;
    @Dimension
    public int lastIpStackType;
    @Dimension
    public String nat64Prefix;
    @Measure
    public long sumCostTime;
    @Dimension
    public int isCheck = -1;
    @Dimension
    public String carrierName = NetworkStatusHelper.getCarrier();
    @Dimension
    public String mnc = NetworkStatusHelper.getSimOp();
    @Dimension
    public String netType = NetworkStatusHelper.getStatus().getType();

    static {
        t2o.a(607125777);
    }
}
