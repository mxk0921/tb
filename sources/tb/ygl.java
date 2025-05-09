package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.RenderProcessGoneDetail;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ygl extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ece b;

    static {
        t2o.a(502268239);
    }

    public ygl(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ygl yglVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456974963:
                super.onReceivedHttpError((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceResponse) objArr[2]);
                return null;
            case -1262473342:
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            case -79464220:
                return new Boolean(super.onRenderProcessGone((WebView) objArr[0], (RenderProcessGoneDetail) objArr[1]));
            case 534767588:
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            case 1373550412:
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/webview/OverrideUrlWebViewClient");
        }
    }

    public void a(ece eceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a13ee0", new Object[]{this, eceVar});
        } else {
            this.b = eceVar;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        tfs.i("[webcomponent]-client", "OverrideUrlWebViewClient onPageFinished url: " + str);
        this.b.onFinish(str);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        tfs.i("[webcomponent]-client", "OverrideUrlWebViewClient onPageStarted url: " + str);
        if (!TextUtils.isEmpty(str) && !"about:blank".equals(str)) {
            this.b.onStart(str);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        super.onReceivedError(webView, i, str, str2);
        tfs.i("[webcomponent]-client", "OverrideUrlWebViewClient onReceivedError failingUrl: " + str2);
        ece eceVar = this.b;
        eceVar.onFailed("errorCode: " + i + " desc: " + str);
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a928538d", new Object[]{this, webView, webResourceRequest, webResourceResponse});
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        tfs.e("[webcomponent]-client", "webResourceResponse statusCode: " + webResourceResponse.getStatusCode() + " data: " + webResourceResponse.getData());
        this.b.onFailed("http error");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.b.onFailed(sslError.toString());
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb4378e4", new Object[]{this, webView, renderProcessGoneDetail})).booleanValue();
        }
        tfs.e("[webcomponent]-client", "onRenderProcessGone webview:" + webView + ", crash:" + renderProcessGoneDetail.didCrash() + ", priority:" + renderProcessGoneDetail.rendererPriorityAtExit());
        this.b.a(renderProcessGoneDetail);
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        if (super.shouldOverrideUrlLoading(webView, str)) {
            return true;
        }
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        if (hitTestResult != null) {
            i = hitTestResult.getType();
        } else {
            i = 0;
        }
        if (i <= 0) {
            return false;
        }
        try {
            return Nav.from(o.J()).toUri(str);
        } catch (Exception unused) {
            return true;
        }
    }
}
