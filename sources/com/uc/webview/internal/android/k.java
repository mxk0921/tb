package com.uc.webview.internal.android;

import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import com.uc.webview.export.WebMessagePort;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class k extends WebMessagePort {

    /* renamed from: a  reason: collision with root package name */
    android.webkit.WebMessagePort f14359a;

    public k(android.webkit.WebMessagePort webMessagePort) {
        this.f14359a = webMessagePort;
    }

    @Override // com.uc.webview.export.WebMessagePort
    public final void close() {
        this.f14359a.close();
    }

    @Override // com.uc.webview.export.WebMessagePort
    public final void setWebMessageCallback(WebMessagePort.WebMessageCallback webMessageCallback) {
        setWebMessageCallback(webMessageCallback, null);
    }

    @Override // com.uc.webview.export.WebMessagePort
    public final void setWebMessageCallback(WebMessagePort.WebMessageCallback webMessageCallback, Handler handler) {
        this.f14359a.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: com.uc.webview.internal.android.k.1
            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public final void onMessage(android.webkit.WebMessagePort webMessagePort, WebMessage webMessage) {
            }
        });
    }

    @Override // com.uc.webview.export.WebMessagePort
    public final void postMessage(com.uc.webview.export.WebMessage webMessage) {
    }
}
