package anet.channel.flow;

import anet.channel.statist.RequestStatistic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface INetworkAnalysis {
    void commitFlow(FlowStat flowStat);

    void commitFlow(RequestStatistic requestStatistic);

    void createConnectCount(String str, String str2, String str3);
}
