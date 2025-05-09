package com.taobao.tao.flexbox.layoutmanager.actionservice.core;

import android.content.Context;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BackgroundUCWebview extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler handler = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(347078691);
        }

        public a(BackgroundUCWebview backgroundUCWebview, Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1262473342) {
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/actionservice/core/BackgroundUCWebview$MyWVWebViewClient");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            } else if (ActionService.n() == 0) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                sslErrorHandler.proceed();
            }
        }
    }

    static {
        t2o.a(347078690);
    }

    public BackgroundUCWebview(Context context) {
        super(context);
        a aVar = new a(this, context);
        this.webViewClient = aVar;
        super.setWebViewClient(aVar);
    }

    public static /* synthetic */ Object ipc$super(BackgroundUCWebview backgroundUCWebview, String str, Object... objArr) {
        if (str.hashCode() == 1118518886) {
            super.setWebViewClient((WebViewClient) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/actionservice/core/BackgroundUCWebview");
    }

    @Override // android.view.View
    public boolean post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd609e29", new Object[]{this, runnable})).booleanValue();
        }
        this.handler.post(runnable);
        return true;
    }
}
