package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.Inet64Util;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "ipv6_detect")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Ipv6DetectStat extends StatObject {
    @Dimension
    public String cip;
    @Dimension
    public long detectTime;
    @Dimension
    public String detectUrl;
    @Dimension
    public String host;
    @Dimension
    public String ip;
    @Dimension
    public String netType = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public int ipStack = Inet64Util.getStackType();
    @Dimension
    public int ret = -1;
    @Dimension
    public String localIpv4 = Inet64Util.mLocalIpv4;
    @Dimension
    public String localIpv6 = Inet64Util.mLocalIpv6;
    @Dimension
    public int ipv4MTU = Inet64Util.mLocalIpv4MTU;
    @Dimension
    public int ipv6MTU = Inet64Util.mLocalIpv6MTU;

    static {
        t2o.a(607125769);
    }

    public Ipv6DetectStat(String str) {
        this.host = str;
        Inet64Util.getIpAddressByInterfaces();
    }
}
