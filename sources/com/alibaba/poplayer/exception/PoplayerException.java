package com.alibaba.poplayer.exception;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PoplayerException extends RuntimeException {
    private static final long serialVersionUID = 1;

    static {
        t2o.a(625999904);
    }

    public PoplayerException() {
    }

    public PoplayerException(String str, Throwable th) {
        super(str, th);
    }

    public PoplayerException(String str) {
        super(str);
    }

    public PoplayerException(Throwable th) {
        super(th);
    }
}
