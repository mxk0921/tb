package com.taobao.android.trade.event;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class EventCenterException extends RuntimeException {
    private static final long serialVersionUID = -2912559384646531479L;

    static {
        t2o.a(723517451);
    }

    public EventCenterException(String str) {
        super(str);
    }

    public EventCenterException(Throwable th) {
        super(th);
    }

    public EventCenterException(String str, Throwable th) {
        super(str, th);
    }
}
