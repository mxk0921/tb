package com.taobao.android.sku.hybrid;

import android.content.Context;
import android.graphics.Bitmap;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.Map;
import tb.fsw;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, Class<? extends kpw>> pluginMap;
    private static int sRefCount = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(442499205);
        }

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 534767588) {
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            } else if (hashCode == 1373550412) {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/sku/hybrid/SkuWebView$DetailHybridWebViewClient");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            } else {
                super.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            } else {
                super.onReceivedError(webView, i, str, str2);
            }
        }
    }

    static {
        t2o.a(442499204);
        HashMap hashMap = new HashMap(2);
        pluginMap = hashMap;
        hashMap.put(PageSkuPlugin.PLUGIN_NAME, PageSkuPlugin.class);
        pluginMap.put(TicketPlugin.PLUGIN_NAME, TicketPlugin.class);
    }

    public SkuWebView(Context context) {
        super(context);
        initDetailWebView(context);
    }

    private void initDetailWebView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca2d4c9", new Object[]{this, context});
            return;
        }
        initSettings();
        setOverScrollMode(2);
        setWebViewClient(new a(context));
        for (String str : pluginMap.keySet()) {
            fsw.i(str, pluginMap.get(str), true);
        }
        sRefCount++;
    }

    private void initSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205185a", new Object[]{this});
            return;
        }
        setInitialScale(100);
        WebSettings settings = getSettings();
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
    }

    public static /* synthetic */ Object ipc$super(SkuWebView skuWebView, String str, Object... objArr) {
        if (str.hashCode() == -610146718) {
            super.coreDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/hybrid/SkuWebView");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba1e662", new Object[]{this});
            return;
        }
        int i = sRefCount - 1;
        sRefCount = i;
        if (i <= 0) {
            for (String str : pluginMap.keySet()) {
                fsw.p(str);
            }
            sRefCount = 0;
        }
        super.coreDestroy();
    }

    public SkuWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initDetailWebView(context);
    }

    public SkuWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initDetailWebView(context);
    }
}
