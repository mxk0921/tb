package com.uc.webview.export;

import android.os.Handler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class HttpAuthHandler extends Handler {
    protected android.webkit.HttpAuthHandler mHandler = null;

    public void cancel() {
        this.mHandler.cancel();
    }

    public void proceed(String str, String str2) {
        this.mHandler.proceed(str, str2);
    }

    public boolean suppressDialog() {
        return false;
    }

    public boolean useHttpAuthUsernamePassword() {
        return this.mHandler.useHttpAuthUsernamePassword();
    }
}
