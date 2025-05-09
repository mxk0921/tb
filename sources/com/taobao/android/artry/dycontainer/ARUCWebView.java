package com.taobao.android.artry.dycontainer;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.uc.webview.export.JsResult;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.util.Map;
import tb.a2i;
import tb.dtw;
import tb.dxv;
import tb.etw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ARUCWebView extends WVUCWebView implements etw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_CACHE_SIZE = 8388608;
    private static final String TAG = "ARUCWebView";
    private Context mContext;
    private Uri mCurrentUri;
    private TUrlImageView mLogoView;
    private FrameLayout mWebWaitingView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ WebView f6376a;
            public final /* synthetic */ String b;

            public a(WebView webView, String str) {
                this.f6376a = webView;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Context context;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                WebView webView = this.f6376a;
                if (webView != null && (context = webView.getContext()) != null) {
                    Toast.makeText(context, this.b, 0).show();
                }
            }
        }

        static {
            t2o.a(396361777);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/dycontainer/ARUCWebView$JSAlertWebChromeClient");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16bdf0ae", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
            }
            a2i.a().post(new a(webView, str2));
            if (jsResult != null) {
                jsResult.confirm();
            }
            return true;
        }
    }

    static {
        t2o.a(396361775);
        t2o.a(989856419);
    }

    public ARUCWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void initLoadingView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3caff0", new Object[]{this, context});
            return;
        }
        this.mWebWaitingView = new FrameLayout(context);
        addView(this.mWebWaitingView, new FrameLayout.LayoutParams(-1, -1));
        this.mWebWaitingView.setBackgroundColor(-1);
        this.mWebWaitingView.setVisibility(8);
    }

    private void initLogoView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a97101", new Object[]{this, context});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        this.mLogoView = tUrlImageView;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN015c5zOm1l8XcoDqJiK_!!6000000004774-2-tps-360-360.png");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.artry_logo_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        this.mWebWaitingView.addView(this.mLogoView, layoutParams);
    }

    public static /* synthetic */ Object ipc$super(ARUCWebView aRUCWebView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == 490249163) {
            super.loadUrl((String) objArr[0], (Map) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/artry/dycontainer/ARUCWebView");
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        dtw.b(null);
    }

    public void hideLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mWebWaitingView;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context.getApplicationContext();
        setScrollBarStyle(0);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        settings.setAppCacheMaxSize(8388608L);
        settings.setDatabaseEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        setInitialScale(0);
        dtw.b(this);
        setWebViewClient(new WVUCWebViewClient(context));
        setWebChromeClient(new b());
        initLoadingView(context);
        initLogoView(context);
    }

    @Override // tb.etw
    public boolean isNeedupdateURLRule(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8ad454f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    @Override // tb.etw
    public boolean isOpenURLIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e6c8dd2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void loadUrl(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d389bcb", new Object[]{this, str, map});
            return;
        }
        super.loadUrl(str, map);
        try {
            if (dxv.j(str)) {
                this.mCurrentUri = Uri.parse(str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tb.etw
    public boolean shouldOverrideUrlLoading(Context context, IWVWebView iWVWebView, String str) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e91d587", new Object[]{this, context, iWVWebView, str})).booleanValue();
        }
        if (dxv.j(str)) {
            try {
                uri = Uri.parse(str);
            } catch (Throwable unused) {
                uri = null;
            }
            if (uri == null || this.mCurrentUri == null || !TextUtils.equals(uri.getHost(), this.mCurrentUri.getHost()) || !TextUtils.equals(uri.getPath(), this.mCurrentUri.getPath())) {
                try {
                    return Nav.from(this.mContext).toUri(str);
                } catch (Throwable unused2) {
                    Log.e(TAG, "failed navigate the url[%s]..." + str);
                }
            } else {
                reload();
            }
        }
        return false;
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mWebWaitingView;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    @Override // tb.etw
    public void updateURLRule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db7cb89", new Object[]{this});
        }
    }

    public ARUCWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ARUCWebView(Context context) {
        super(context);
        init(context);
    }
}
