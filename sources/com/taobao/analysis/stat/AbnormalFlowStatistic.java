package com.taobao.analysis.stat;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import java.util.Map;
import tb.bs;
import tb.f7l;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "AbnormalFlowMonitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AbnormalFlowStatistic extends StatObject {
    @Dimension
    public volatile String activityName;
    @Measure
    public double bgDataSize;
    @Dimension
    public volatile long currentTime;
    @Measure
    public double fgDataSize;
    @Dimension
    public int flowType;
    @Dimension
    public volatile String refer;
    @Measure
    public double useTime;
    @Dimension
    public String abnormalFlag = "abnormalUser";
    @Dimension
    public String bgUrl = "";
    @Dimension
    public String fgUrl = "";

    public AbnormalFlowStatistic(String str, String str2, bs.a aVar, long j, int i, double d) {
        this.flowType = i;
        this.currentTime = j;
        this.useTime = d;
        this.refer = str;
        this.activityName = str2;
        this.bgDataSize = aVar.f16586a;
        this.fgDataSize = aVar.b;
        for (Map.Entry<String, Integer> entry : aVar.d.entrySet()) {
            this.fgUrl += "[(reqCount:" + entry.getValue() + f7l.BRACKET_END_STR + entry.getKey() + "]";
        }
        for (Map.Entry<String, Integer> entry2 : aVar.c.entrySet()) {
            this.bgUrl += "[(reqCount:" + entry2.getValue() + f7l.BRACKET_END_STR + entry2.getKey() + "]";
        }
    }
}
