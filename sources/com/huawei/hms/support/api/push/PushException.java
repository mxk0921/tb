package com.huawei.hms.support.api.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PushException extends RuntimeException {
    public static final String EXCEPTION_SEND_FAILED = "send message failed";

    public PushException() {
    }

    public PushException(String str, Throwable th) {
        super(str, th);
    }

    public PushException(String str) {
        super(str);
    }

    public PushException(Throwable th) {
        super(th);
    }
}
