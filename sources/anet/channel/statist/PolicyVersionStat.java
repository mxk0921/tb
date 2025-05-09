package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "policyVersion")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PolicyVersionStat extends StatObject {
    @Dimension
    public String host;
    @Dimension
    public int reportType;
    @Dimension
    public int version;
    @Dimension
    public String netType = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public String mnc = NetworkStatusHelper.getSimOp();

    static {
        t2o.a(607125781);
    }

    public PolicyVersionStat(String str, int i) {
        this.host = str;
        this.version = i;
    }
}
