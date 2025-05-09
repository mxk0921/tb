package com.uc.webview.internal.android;

import android.webkit.WebMessage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class j extends WebMessage {

    /* renamed from: a  reason: collision with root package name */
    private com.uc.webview.export.WebMessage f14358a;

    public j(com.uc.webview.export.WebMessage webMessage) {
        super(webMessage.getData());
        this.f14358a = webMessage;
    }

    @Override // android.webkit.WebMessage
    public final String getData() {
        return this.f14358a.getData();
    }
}
