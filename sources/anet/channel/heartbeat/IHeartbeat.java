package anet.channel.heartbeat;

import anet.channel.Session;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IHeartbeat {
    void reSchedule();

    void start(Session session);

    void stop();
}
