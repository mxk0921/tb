package com.ali.user.open.core.exception;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MemberSDKException extends RuntimeException {
    private static final long serialVersionUID = 1357689949294215654L;
    public int code;
    public String message;
    public Throwable throwable;

    static {
        t2o.a(71303190);
    }

    public MemberSDKException(int i, String str, Throwable th) {
        super(str == null ? "" : str, th);
        this.code = i;
        this.message = str;
        this.throwable = th;
    }

    public MemberSDKException(int i, String str) {
        super(str == null ? "" : str);
        this.message = str;
    }
}
