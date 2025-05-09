package com.ali.user.mobile.model;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface NumAuthCallback {
    public static final int INIT_ERROR = -103;
    public static final String INIT_ERROR_MSG = "auth sdk checkEnvAvailable is false";
    public static final int ORANGE_MISS = -104;
    public static final String ORANGE_MISS_MSG = "miss orange";
    public static final int RPC_PARSE_ERROR = -101;
    public static final String RPC_PARSE_ERROR_MSG = "rpc parse data fail";

    void onInit(boolean z);
}
