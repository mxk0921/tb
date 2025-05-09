package anet.channel.appmonitor;

import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.StatObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IAppMonitor {
    void commitAlarm(AlarmObject alarmObject);

    void commitCount(CountObject countObject);

    void commitStat(StatObject statObject);

    @Deprecated
    void register();

    @Deprecated
    void register(Class<?> cls);
}
