package com.taobao.tao.flexbox.layoutmanager.actionservice.core;

import android.content.Context;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.webview.WVWebView;
import android.taobao.windvane.webview.WVWebViewClient;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BackgroundWebview extends WVWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler handler = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class MyWVWebViewClient extends WVWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(347078693);
        }

        public MyWVWebViewClient(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(MyWVWebViewClient myWVWebViewClient, String str, Object... objArr) {
            if (str.hashCode() == -496040708) {
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/actionservice/core/BackgroundWebview$MyWVWebViewClient");
        }

        @Override // android.taobao.windvane.webview.WVWebViewClient, android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e26f04fc", new Object[]{this, webView, sslErrorHandler, sslError});
            } else if (ActionService.n() == 0) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                sslErrorHandler.proceed();
            }
        }
    }

    static {
        t2o.a(347078692);
    }

    public BackgroundWebview(Context context) {
        super(context);
        MyWVWebViewClient myWVWebViewClient = new MyWVWebViewClient(context);
        this.webViewClient = myWVWebViewClient;
        super.setWebViewClient(myWVWebViewClient);
    }

    public static /* synthetic */ Object ipc$super(BackgroundWebview backgroundWebview, String str, Object... objArr) {
        if (str.hashCode() == 1144012385) {
            super.setWebViewClient((WebViewClient) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/actionservice/core/BackgroundWebview");
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
