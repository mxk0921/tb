package com.uc.webview.export;

import android.os.Handler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class WebMessagePort {
    public abstract void close();

    public abstract void postMessage(WebMessage webMessage);

    public abstract void setWebMessageCallback(WebMessageCallback webMessageCallback);

    public abstract void setWebMessageCallback(WebMessageCallback webMessageCallback, Handler handler);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class WebMessageCallback {
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        }
    }
}
