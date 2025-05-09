package com.sina.weibo.sdk.common;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UiError {
    public int errorCode;
    public String errorDetail;
    public String errorMessage;

    static {
        t2o.a(988807216);
    }

    public UiError(int i, String str, String str2) {
        this.errorCode = i;
        this.errorMessage = str;
        this.errorDetail = str2;
    }
}
