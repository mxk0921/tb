package com.uc.webview.internal.android;

import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    protected WebView f14356a;
    protected com.uc.webview.export.WebChromeClient b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends WebChromeClient.FileChooserParams {
        private WebChromeClient.FileChooserParams b;

        public a(WebChromeClient.FileChooserParams fileChooserParams) {
            this.b = fileChooserParams;
        }

        @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
        public final Intent createIntent() {
            return this.b.createIntent();
        }

        @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
        public final String[] getAcceptTypes() {
            return this.b.getAcceptTypes();
        }

        @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
        public final String getFilenameHint() {
            return this.b.getFilenameHint();
        }

        @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
        public final int getMode() {
            return this.b.getMode();
        }

        @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
        public final CharSequence getTitle() {
            return this.b.getTitle();
        }

        @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
        public final boolean isCaptureEnabled() {
            return this.b.isCaptureEnabled();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(android.webkit.WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        a aVar;
        if (fileChooserParams == null) {
            aVar = null;
        } else {
            aVar = new a(fileChooserParams);
        }
        return this.b.onShowFileChooser(this.f14356a, valueCallback, aVar);
    }
}
