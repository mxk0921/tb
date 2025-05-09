package com.opos.process.bridge.provider;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BridgeException extends Exception {
    public int code;

    static {
        t2o.a(253755467);
    }

    public BridgeException(String str, int i) {
        super(str);
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    public BridgeException(String str, Throwable th, int i) {
        super(str, th);
        this.code = i;
    }

    public BridgeException(Throwable th, int i) {
        super(th);
        this.code = i;
    }
}
