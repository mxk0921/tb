package com.uc.webview.internal.android;

import com.uc.webview.export.JsResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class e implements JsResult {

    /* renamed from: a  reason: collision with root package name */
    private android.webkit.JsResult f14347a;

    public e(android.webkit.JsResult jsResult) {
        this.f14347a = jsResult;
    }

    @Override // com.uc.webview.export.JsResult
    public final void cancel() {
        this.f14347a.cancel();
    }

    @Override // com.uc.webview.export.JsResult
    public final void confirm() {
        this.f14347a.confirm();
    }
}
