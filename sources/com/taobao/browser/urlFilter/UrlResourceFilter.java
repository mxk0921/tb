package com.taobao.browser.urlFilter;

import com.uc.webview.export.WebResourceResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface UrlResourceFilter {
    WebResourceResponse doFilter(String str);

    boolean match(String str);
}
