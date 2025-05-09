package com.uc.webview.export;

import android.os.Handler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SslErrorHandler extends Handler {
    protected android.webkit.SslErrorHandler mHandler = null;

    public void cancel() {
        this.mHandler.cancel();
    }

    public void proceed() {
        this.mHandler.proceed();
    }
}
