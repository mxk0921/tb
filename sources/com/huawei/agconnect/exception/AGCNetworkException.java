package com.huawei.agconnect.exception;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AGCNetworkException extends AGCException {
    public static final int NETWORK_UNAVAILABLE = 0;
    public static final int SERVER_NOT_REACH = 1;

    public AGCNetworkException(String str, int i) {
        super(str, i);
    }
}
