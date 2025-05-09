package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "background_request_monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BackgroundStatistic extends RequestMonitor {
    static {
        t2o.a(607125748);
    }

    public BackgroundStatistic(RequestStatistic requestStatistic) {
        super(requestStatistic);
    }
}
