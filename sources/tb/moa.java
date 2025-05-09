package tb;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltb/moa;", "Ltb/na4;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class moa extends na4<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final FrameLayout c;
    public WVUCWebView d;
    public final Context e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(moa moaVar, Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/industry/tbiunicontainer/core/component/H5Component$getView$1");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
            }
            ckf.g(str, "targetUrl");
            wfr.INSTANCE.b("H5Component", "nav url: ".concat(str));
            return false;
        }
    }

    static {
        t2o.a(804257829);
    }

    public moa(Context context) {
        ckf.g(context, "context");
        this.e = context;
        this.c = new FrameLayout(context);
    }

    public static /* synthetic */ Object ipc$super(moa moaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/industry/tbiunicontainer/core/component/H5Component");
    }

    @Override // tb.na4
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        }
    }

    @Override // tb.na4
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // tb.na4
    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        WVUCWebView wVUCWebView = new WVUCWebView(this.e);
        this.d = wVUCWebView;
        wVUCWebView.setWebViewClient(new WebViewClient());
        WVUCWebView wVUCWebView2 = this.d;
        if (wVUCWebView2 != null) {
            wVUCWebView2.setWebChromeClient(new WebChromeClient());
            WVUCWebView wVUCWebView3 = this.d;
            if (wVUCWebView3 != null) {
                wVUCWebView3.setInitialScale(100);
                WVUCWebView wVUCWebView4 = this.d;
                if (wVUCWebView4 != null) {
                    WebSettings settings = wVUCWebView4.getSettings();
                    ckf.f(settings, "webView.settings");
                    settings.setUseWideViewPort(true);
                    settings.setBuiltInZoomControls(true);
                    settings.setSupportZoom(true);
                    settings.setLoadWithOverviewMode(true);
                    settings.setDisplayZoomControls(false);
                    settings.setSavePassword(false);
                    WVUCWebView wVUCWebView5 = this.d;
                    if (wVUCWebView5 != null) {
                        wVUCWebView5.setOverScrollMode(2);
                        WVUCWebView wVUCWebView6 = this.d;
                        if (wVUCWebView6 != null) {
                            wVUCWebView6.setWebViewClient(new a(this, this.e));
                            FrameLayout frameLayout = this.c;
                            WVUCWebView wVUCWebView7 = this.d;
                            if (wVUCWebView7 != null) {
                                frameLayout.addView(wVUCWebView7, new FrameLayout.LayoutParams(-1, -1));
                                return this.c;
                            }
                            ckf.y("webView");
                            throw null;
                        }
                        ckf.y("webView");
                        throw null;
                    }
                    ckf.y("webView");
                    throw null;
                }
                ckf.y("webView");
                throw null;
            }
            ckf.y("webView");
            throw null;
        }
        ckf.y("webView");
        throw null;
    }
}
