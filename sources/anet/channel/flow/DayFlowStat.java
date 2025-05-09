package anet.channel.flow;

import anet.channel.statist.RequestStatistic;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DayFlowStat implements Serializable {
    public OneFlowStat oneFlowStat;
    public int startUpCount = 0;

    static {
        t2o.a(607125640);
    }

    public DayFlowStat(RequestStatistic requestStatistic, OneFlowStat oneFlowStat) {
        this.oneFlowStat = oneFlowStat;
    }
}
