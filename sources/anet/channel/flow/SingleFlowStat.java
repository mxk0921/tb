package anet.channel.flow;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SingleFlowStat implements Serializable {
    public String host;
    public String launchTime;
    public OneFlowStat oneFlowStat;
    public String url;

    static {
        t2o.a(607125654);
    }

    public SingleFlowStat(RequestStatistic requestStatistic, OneFlowStat oneFlowStat) {
        this.launchTime = null;
        this.host = null;
        this.url = null;
        this.oneFlowStat = oneFlowStat;
        this.url = requestStatistic.url;
        this.host = requestStatistic.host;
        this.launchTime = GlobalAppRuntimeInfo.getLaunchTime();
    }
}
