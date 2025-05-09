package com.uc.webview.internal.android;

import android.content.Context;
import android.webkit.WebViewDatabase;
import com.uc.webview.internal.interfaces.IWebViewDatabase;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o implements IWebViewDatabase {

    /* renamed from: a  reason: collision with root package name */
    private WebViewDatabase f14366a;

    public o(Context context) {
        this.f14366a = WebViewDatabase.getInstance(context);
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final void clearFormData() {
        this.f14366a.clearFormData();
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final void clearHttpAuthUsernamePassword() {
        this.f14366a.clearHttpAuthUsernamePassword();
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final void clearUsernamePassword() {
        this.f14366a.clearUsernamePassword();
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final boolean hasFormData() {
        return this.f14366a.hasFormData();
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final boolean hasHttpAuthUsernamePassword() {
        return this.f14366a.hasHttpAuthUsernamePassword();
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final boolean hasUsernamePassword() {
        return this.f14366a.hasUsernamePassword();
    }
}
