package tb;

import android.graphics.Bitmap;
import android.net.Uri;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.web.runtime.IWebAdapter;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebView;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qds extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ocs b;
    public final String c;
    public final ITMSPage d;

    static {
        t2o.a(840957967);
    }

    public qds(ITMSPage iTMSPage, ocs ocsVar, String str) {
        super(iTMSPage.getInstance().I());
        this.b = ocsVar;
        iTMSPage.getInstance().I();
        this.c = str;
        this.d = iTMSPage;
    }

    public static /* synthetic */ Object ipc$super(qds qdsVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            case -486123589:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (WebResourceRequest) objArr[1]));
            case -332805219:
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            case 534767588:
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/mix/h5_render/TMSTinyWebviewClient");
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        super.onPageFinished(webView, str);
        ocs ocsVar = this.b;
        if (ocsVar != null) {
            ocsVar.a();
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        ocs ocsVar = this.b;
        if (ocsVar != null) {
            ocsVar.onRenderReady();
        }
        if (this.d.getExtension(ct2.class) != null) {
            ((ct2) this.d.getExtension(ct2.class)).h(webView, str);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient
    public void onResourceReceivedZCacheInfo(String str, ltw ltwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a146f9ac", new Object[]{this, str, ltwVar});
        } else if (this.d.getExtension(ct2.class) != null) {
            ((ct2) this.d.getExtension(ct2.class)).l(str, ltwVar.e);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        if (!q9s.T1(this.c)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        IWebAdapter iWebAdapter = (IWebAdapter) p8s.b(IWebAdapter.class);
        if (iWebAdapter == null) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return iWebAdapter.shouldOverrideUrlLoading(this.d, new WebResourceRequest(str, null));
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e30657bb", new Object[]{this, webView, webResourceRequest})).booleanValue();
        }
        if (!q9s.T1(this.c)) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        if (webResourceRequest == null) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        IWebAdapter iWebAdapter = (IWebAdapter) p8s.b(IWebAdapter.class);
        if (iWebAdapter == null || url == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return iWebAdapter.shouldOverrideUrlLoading(this.d, webResourceRequest);
    }
}
