package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "vpn_fast_degrade_monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class VpnFastDegradeStatistic extends RequestMonitor {
    static {
        t2o.a(607125800);
    }

    public VpnFastDegradeStatistic(RequestStatistic requestStatistic) {
        super(requestStatistic);
    }
}
