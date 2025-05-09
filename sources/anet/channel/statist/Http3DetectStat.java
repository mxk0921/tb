package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "http3_detect")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Http3DetectStat extends StatObject {
    @Dimension
    public int code;
    @Dimension
    public String host;
    @Dimension
    public String ip;
    @Dimension
    public String isBg;
    @Dimension
    public volatile String netType;
    @Dimension
    public String protocol;
    @Dimension
    public int ret;

    static {
        t2o.a(607125767);
    }

    public Http3DetectStat(String str, IConnStrategy iConnStrategy) {
        this.host = str;
        if (iConnStrategy != null) {
            this.ip = iConnStrategy.getIp();
            this.protocol = iConnStrategy.getProtocol().protocol;
        }
        this.netType = NetworkStatusHelper.getNetworkSubType();
    }
}
