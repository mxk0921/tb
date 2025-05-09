package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "caton_total_monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CatonTotalStatistic extends StatObject {
    @Measure
    public int catonCount;
    @Dimension
    public String endTime;
    @Dimension
    public boolean isNetworkChange;
    @Dimension
    public String startTime;

    static {
        t2o.a(607125752);
    }

    public CatonTotalStatistic(String str, String str2, boolean z, int i) {
        this.startTime = str;
        this.endTime = str2;
        this.isNetworkChange = z;
        this.catonCount = i;
    }
}
