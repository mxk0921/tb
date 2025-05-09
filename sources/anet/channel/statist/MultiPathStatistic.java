package anet.channel.statist;

import anet.channel.AwcnConfig;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = AwcnConfig.MULTI_PATH_MONITOR_KEY)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MultiPathStatistic extends RequestMonitor {
    static {
        t2o.a(607125776);
    }

    public MultiPathStatistic(RequestStatistic requestStatistic) {
        super(requestStatistic);
    }
}
