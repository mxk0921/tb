package com.uc.webview.internal.android;

import com.uc.webview.export.JsPromptResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class d implements JsPromptResult {

    /* renamed from: a  reason: collision with root package name */
    private android.webkit.JsPromptResult f14346a;

    public d(android.webkit.JsPromptResult jsPromptResult) {
        this.f14346a = jsPromptResult;
    }

    @Override // com.uc.webview.export.JsPromptResult, com.uc.webview.export.JsResult
    public final void cancel() {
        this.f14346a.cancel();
    }

    @Override // com.uc.webview.export.JsPromptResult, com.uc.webview.export.JsResult
    public final void confirm() {
        this.f14346a.confirm();
    }

    @Override // com.uc.webview.export.JsPromptResult
    public final void confirm(String str) {
        this.f14346a.confirm(str);
    }
}
