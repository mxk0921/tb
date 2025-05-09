package anet.channel.entity;

import anet.channel.Session;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface EventCb {
    void onEvent(Session session, int i, Event event);
}
