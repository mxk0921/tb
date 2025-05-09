package com.taobao.themis.web.runtime;

import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import tb.n8s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IWebAdapter extends n8s {
    String getUserAgent(String str);

    WebChromeClient getWebChromeClient(ITMSPage iTMSPage);

    void onPageStarted(ITMSPage iTMSPage, WebView webView);

    void registerPlugins();

    WebResourceResponse shouldInterceptRequest(ITMSPage iTMSPage, WebResourceRequest webResourceRequest);

    boolean shouldOverrideUrlLoading(ITMSPage iTMSPage, WebResourceRequest webResourceRequest);
}
