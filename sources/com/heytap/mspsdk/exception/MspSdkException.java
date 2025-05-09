package com.heytap.mspsdk.exception;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MspSdkException extends RuntimeException {
    public int code;

    static {
        t2o.a(253755415);
    }

    public MspSdkException(int i, String str) {
        super(str);
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "MspSdkException{code=" + this.code + ",message=" + super.toString() + '}';
    }
}
