package android.taobao.windvane.extra.uc;

import android.net.Uri;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.embed.Empty;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.EmbedViewConfig;
import com.uc.webview.export.extension.IEmbedView;
import com.uc.webview.export.extension.IEmbedViewContainer;
import com.uc.webview.export.extension.UCClient;
import java.util.ArrayList;
import java.util.Map;
import tb.fqw;
import tb.hpl;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.wpw;
import tb.y71;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUCClient extends UCClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUCClient";
    public String tStart;
    public IWVWebView webView;

    static {
        t2o.a(989856099);
    }

    public WVUCClient() {
        this.webView = null;
        this.tStart = "0";
    }

    public static /* synthetic */ Object ipc$super(WVUCClient wVUCClient, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1380575401) {
            super.onPageStartedEx((WebView) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 1507240588) {
            super.onWebViewEvent((WebView) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in android/taobao/windvane/extra/uc/WVUCClient");
        }
    }

    @Override // com.uc.webview.export.extension.UCClient
    public IEmbedView getEmbedView(EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        String str;
        BaseEmbedView baseEmbedView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IEmbedView) ipChange.ipc$dispatch("5415cbeb", new Object[]{this, embedViewConfig, iEmbedViewContainer});
        }
        Map map = embedViewConfig.mObjectParam;
        if (map.containsKey(hpl.VIEW_TYPE)) {
            String str2 = (String) map.get(hpl.VIEW_TYPE);
            if (map.containsKey("bridgeId")) {
                str = (String) map.get("bridgeId");
            } else {
                str = "";
            }
            if (vpw.commonConfig.k1) {
                baseEmbedView = fqw.d(str, str2, this.webView, embedViewConfig, iEmbedViewContainer);
            } else {
                baseEmbedView = fqw.c(str, str2, this.webView, embedViewConfig);
            }
            if (baseEmbedView == null) {
                v7t.d(y71.MONITOR_POINT_EMBED_VIEW, "failed to create embedView");
            } else {
                iEmbedViewContainer.setOnParamChangedListener(baseEmbedView);
                iEmbedViewContainer.setOnStateChangedListener(baseEmbedView);
                iEmbedViewContainer.setOnVisibilityChangedListener(baseEmbedView);
                return baseEmbedView;
            }
        } else {
            v7t.d(y71.MONITOR_POINT_EMBED_VIEW, "viewType should not be lost");
        }
        Empty empty = new Empty();
        empty.init("", "empty", this.webView, null);
        return empty;
    }

    @Override // com.uc.webview.export.extension.UCClient
    public void onPageStartedEx(WebView webView, String str) {
        WVUCWebViewClient webViewClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb61757", new Object[]{this, webView, str});
            return;
        }
        super.onPageStartedEx(webView, str);
        if ((webView instanceof WVUCWebView) && (webViewClient = ((WVUCWebView) webView).getWebViewClient()) != null) {
            webViewClient.setPageStartUrl(str);
        }
    }

    @Override // com.uc.webview.export.extension.UCClient
    public void onGpuProcessGone(WebView webView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71eb23d1", new Object[]{this, webView, new Integer(i)});
            return;
        }
        v7t.i("sandbox", "onGpuProcessGone");
        if ((i & 2) != 0) {
            Uri parse = Uri.parse(this.webView.getUrl());
            String str = parse.getHost() + parse.getPath();
            if (!yaa.k) {
                v7t.d("GPU", "gpu process is killed, url = [" + str + "] , upload information!");
                y71.commitFail(y71.MONITOR_POINT_GPU_PROCESS_GONE_TYPE, 1, null, str);
            }
            wpw wpwVar = vpw.commonConfig;
            if (((ArrayList) wpwVar.i.g).contains(str)) {
                v7t.d("GPU", "gpu process error, need not reload page, url = [" + str + "]");
                return;
            }
            vpw.b();
            if (wpwVar.R) {
                IWVWebView iWVWebView = this.webView;
                if (iWVWebView instanceof WVUCWebView) {
                    ((WVUCWebView) iWVWebView).refreshWhenForeground();
                } else {
                    iWVWebView.refresh();
                }
                v7t.d("GPU", "gpu process error, reload page, url = [" + str + "]");
            }
        }
    }

    public WVUCClient(IWVWebView iWVWebView) {
        this.tStart = "0";
        this.webView = iWVWebView;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    @Override // com.uc.webview.export.extension.UCClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onWebViewEvent(final com.uc.webview.export.WebView r12, int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCClient.onWebViewEvent(com.uc.webview.export.WebView, int, java.lang.Object):void");
    }
}
