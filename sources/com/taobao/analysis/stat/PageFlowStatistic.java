package com.taobao.analysis.stat;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "pageAvgFlow")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PageFlowStatistic extends StatObject {
    @Dimension
    public String f_activityname;
    @Measure
    public long f_downstream;
    @Measure
    public long f_pageReqCount;
    @Measure
    public long f_staytime;
    @Measure
    public long f_upstream;

    public PageFlowStatistic(String str, long j, long j2, long j3, long j4) {
        this.f_activityname = str;
        this.f_upstream = j;
        this.f_downstream = j2;
        this.f_pageReqCount = j3;
        this.f_staytime = j4;
    }
}
