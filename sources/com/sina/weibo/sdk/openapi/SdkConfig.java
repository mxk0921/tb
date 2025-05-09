package com.sina.weibo.sdk.openapi;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SdkConfig {
    private boolean userAgree;
    private boolean userAgreeWifiInfo;

    static {
        t2o.a(988807232);
    }

    public boolean isUserAgree() {
        return this.userAgree;
    }

    public boolean isUserAgreeWifiInfo() {
        return this.userAgreeWifiInfo;
    }

    public void setUserAgree(boolean z) {
        this.userAgree = z;
    }

    public void setUserAgreeWifiInfo(boolean z) {
        this.userAgreeWifiInfo = z;
    }
}
