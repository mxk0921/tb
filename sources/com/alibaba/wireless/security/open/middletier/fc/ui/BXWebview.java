package com.alibaba.wireless.security.open.middletier.fc.ui;

import android.content.Context;
import android.util.Log;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0139;
import com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fn1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BXWebview extends WebView implements IBXWebview {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IUrlVerifyCallback f3444a = null;

    static {
        t2o.a(659554388);
        t2o.a(659554412);
    }

    public BXWebview(Context context, String str) {
        super(context);
        WebSettings settings = getSettings();
        if (str.startsWith("file://")) {
            settings.setJavaScriptEnabled(false);
        } else {
            settings.setJavaScriptEnabled(true);
        }
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        settings.setTextZoom(100);
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(BXWebview bXWebview, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/ui/BXWebview");
    }

    @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview
    public void bxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d69c414b", new Object[]{this});
            return;
        }
        setVisibility(8);
        removeAllViews();
        destroy();
    }

    @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview
    public void bxLoadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18607c4", new Object[]{this, str});
        } else {
            loadUrl(str);
        }
    }

    @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview
    public void bxSetUp(Context context, IUrlVerifyCallback iUrlVerifyCallback, final IBXWebview.IBXDownloadService iBXDownloadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1d6dfa", new Object[]{this, context, iUrlVerifyCallback, iBXDownloadService});
            return;
        }
        this.f3444a = iUrlVerifyCallback;
        setWebViewClient(new WebViewClient() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.BXWebview.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r4, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -968324284) {
                    return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
                }
                if (hashCode == 2049823353) {
                    super.onReceivedError((WebView) objArr[0], (WebResourceRequest) objArr[1], fn1.a(objArr[2]));
                    return null;
                }
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/wireless/security/open/middletier/fc/ui/BXWebview$1");
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a2dd279", new Object[]{this, webView, webResourceRequest, webResourceError});
                    return;
                }
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                Log.e(C0139.f211, "Error: !!! ");
                Log.e(C0139.f211, "onReceivedError occuring requesut=" + webResourceRequest + " error=" + webResourceError);
                Log.e(C0139.f211, "Error: !!! ");
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("c6488b44", new Object[]{this, webView, str})).booleanValue();
                }
                IUrlVerifyCallback iUrlVerifyCallback2 = BXWebview.this.f3444a;
                if (iUrlVerifyCallback2 == null || !iUrlVerifyCallback2.shouldOverrideUrlLoading(str)) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                return true;
            }
        });
        if (iBXDownloadService != null) {
            setDownloadListener(new DownloadListener(this) { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.BXWebview.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84e41dba", new Object[]{this, str, str2, str3, str4, new Long(j)});
                    } else {
                        iBXDownloadService.startDownload(str, str3);
                    }
                }
            });
        }
    }
}
