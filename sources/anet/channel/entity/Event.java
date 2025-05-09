package anet.channel.entity;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Event {
    public int errorCode;
    public String errorDetail;
    public final int eventType;

    static {
        t2o.a(607125635);
    }

    public Event(int i) {
        this.eventType = i;
    }

    public Event(int i, int i2, String str) {
        this.eventType = i;
        this.errorCode = i2;
        this.errorDetail = str;
    }
}
