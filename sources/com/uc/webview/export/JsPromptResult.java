package com.uc.webview.export;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface JsPromptResult extends JsResult {
    @Override // com.uc.webview.export.JsResult
    void cancel();

    @Override // com.uc.webview.export.JsResult
    void confirm();

    void confirm(String str);
}
