package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "caton_fg_total_monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CatonFgTotalStatistic extends CatonTotalStatistic {
    @Dimension
    public String commitType;
    @Dimension
    public String nettype = NetworkStatusHelper.getNetworkSubType();
    @Measure
    public double useTime;

    static {
        t2o.a(607125750);
    }

    public CatonFgTotalStatistic(String str, String str2, String str3, boolean z, int i, double d) {
        super(str2, str3, z, i);
        this.useTime = vu3.b.GEO_NOT_SUPPORT;
        this.commitType = str;
        this.useTime = d;
    }
}
