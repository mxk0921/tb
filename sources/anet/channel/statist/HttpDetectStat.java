package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "http_detect")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HttpDetectStat extends StatObject {
    @Dimension
    public int code;
    @Dimension
    public String host;
    @Dimension
    public String ip;
    @Dimension
    public volatile String netType;
    @Dimension
    public String protocol;
    @Dimension
    public int ret;

    static {
        t2o.a(607125768);
    }

    public HttpDetectStat(String str, IConnStrategy iConnStrategy) {
        this.host = str;
        if (iConnStrategy != null) {
            this.ip = iConnStrategy.getIp();
            this.protocol = iConnStrategy.getProtocol().protocol;
        }
        this.netType = NetworkStatusHelper.getNetworkSubType();
    }
}
