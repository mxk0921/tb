package anet.channel.statist;

import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "wifi_fg_use_cell_monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WifiFgUseCellReqStatic extends RequestMonitor {
    @Dimension
    public volatile String scene;
    @Measure
    public volatile double useForceCellFlowByDay = vu3.b.GEO_NOT_SUPPORT;

    static {
        t2o.a(607125802);
    }

    public WifiFgUseCellReqStatic(RequestStatistic requestStatistic, String str) {
        super(requestStatistic);
        this.scene = "";
        this.scene = str;
    }
}
