package com.alibaba.wireless.security.open.middletier.fc.ui;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.wireless.security.open.middletier.MidBridge;
import com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.DownloadListener;
import com.uc.webview.export.WebView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BXWVWebview extends WVUCWebView implements IBXWebview {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IUrlVerifyCallback f3441a = null;

    static {
        t2o.a(659554385);
        t2o.a(659554412);
    }

    public BXWVWebview(Context context, String str) {
        super(context);
        getSettings().setTextZoom(100);
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(BXWVWebview bXWVWebview, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/ui/BXWVWebview");
    }

    @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview
    public void bxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d69c414b", new Object[]{this});
            return;
        }
        int wvmlfcdmSwitch = MidBridge.getWvmlfcdmSwitch();
        setVisibility(8);
        if (wvmlfcdmSwitch > 0) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this);
            }
            destroy();
            return;
        }
        removeAllViews();
        coreDestroy();
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
        this.f3441a = iUrlVerifyCallback;
        setWebViewClient(new WVUCWebViewClient(context) { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.BXWVWebview.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == -623958539) {
                    return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/ui/BXWVWebview$1");
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
                }
                IUrlVerifyCallback iUrlVerifyCallback2 = BXWVWebview.this.f3441a;
                if (iUrlVerifyCallback2 == null || !iUrlVerifyCallback2.shouldOverrideUrlLoading(str)) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                return true;
            }
        });
        if (iBXDownloadService != null) {
            setDownloadListener(new DownloadListener(this) { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.BXWVWebview.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uc.webview.export.DownloadListener
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
