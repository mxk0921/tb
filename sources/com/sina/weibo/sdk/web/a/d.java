package com.sina.weibo.sdk.web.a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.sina.weibo.sdk.b.e;
import com.sina.weibo.sdk.web.a;
import com.sina.weibo.sdk.web.b.b;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class d extends b {
    static {
        t2o.a(988807258);
    }

    public d(Activity activity, a aVar, b bVar) {
        super(activity, aVar, bVar);
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final void p(String str) {
        n(str);
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final void q() {
        o("cancel share!!!");
        a aVar = this.az;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final boolean s() {
        q();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("sinaweibo://browser/close")) {
            return false;
        }
        Bundle h = e.h(str);
        if (h != null) {
            String string = h.getString("code");
            String string2 = h.getString("msg");
            if ("0".equals(string)) {
                m(string2);
            } else {
                n(string2);
            }
        } else {
            n("bundle is null!!!");
        }
        a aVar = this.az;
        if (aVar == null) {
            return true;
        }
        aVar.q();
        return true;
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        if (TextUtils.isEmpty(uri) || !uri.startsWith("sinaweibo://browser/close")) {
            return false;
        }
        Bundle h = e.h(uri);
        if (h != null) {
            String string = h.getString("code");
            String string2 = h.getString("msg");
            if (TextUtils.isEmpty(string)) {
                o("code is null!!!");
            } else if ("0".equals(string)) {
                m(string2);
            } else {
                n(string2);
            }
        } else {
            n("bundle is null!!!");
        }
        a aVar = this.az;
        if (aVar == null) {
            return true;
        }
        aVar.q();
        return true;
    }
}
