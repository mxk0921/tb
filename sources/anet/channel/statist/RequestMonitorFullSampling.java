package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "request_monitor_full_sampling")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RequestMonitorFullSampling extends RequestMonitor {
    static {
        t2o.a(607125787);
    }

    public RequestMonitorFullSampling(RequestStatistic requestStatistic) {
        super(requestStatistic);
    }
}
