package anetwork.channel.stat;

import anetwork.channel.statist.StatisticData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface INetworkStat {
    String get(String str);

    void put(String str, StatisticData statisticData);

    void reset(String str);
}
