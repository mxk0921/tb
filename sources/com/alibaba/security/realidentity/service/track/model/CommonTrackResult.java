package com.alibaba.security.realidentity.service.track.model;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CommonTrackResult implements Serializable {
    public static final int ERROR_CODE = -1;
    public static final int SUCCESS_CODE = 0;
    public int errorCode;
    public String message;

    public CommonTrackResult(int i, String str) {
        this.errorCode = i;
        this.message = str;
    }

    public CommonTrackResult(String str) {
        this.errorCode = 0;
        this.message = str;
    }

    public CommonTrackResult() {
        this.errorCode = 0;
        this.message = "";
    }
}
