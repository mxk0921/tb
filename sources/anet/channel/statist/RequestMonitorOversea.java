package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "request_monitor_oversea_full_sampling")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RequestMonitorOversea extends RequestMonitor {
    static {
        t2o.a(607125788);
    }

    public RequestMonitorOversea(RequestStatistic requestStatistic) {
        super(requestStatistic);
    }
}
