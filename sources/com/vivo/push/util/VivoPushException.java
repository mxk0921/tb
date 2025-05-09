package com.vivo.push.util;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VivoPushException extends Exception {
    public static final int REASON_CODE_ACCESS = 10000;
    private int mReasonCode;

    public VivoPushException(String str) {
        this(10000, str);
    }

    public int getCode() {
        return this.mReasonCode;
    }

    public VivoPushException(int i, String str) {
        super(str);
        this.mReasonCode = i;
    }
}
