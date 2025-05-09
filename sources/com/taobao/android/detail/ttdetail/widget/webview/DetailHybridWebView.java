package com.taobao.android.detail.ttdetail.widget.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.widget.webview.plugin.OpenWindowPlugin;
import com.taobao.android.detail.ttdetail.widget.webview.plugin.PageDetailPlugin;
import com.taobao.taobao.R;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import tb.atw;
import tb.b5m;
import tb.fsw;
import tb.hns;
import tb.kpw;
import tb.od7;
import tb.t2o;
import tb.tgh;
import tb.toj;
import tb.tq4;
import tb.vbl;
import tb.xq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailHybridWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DetailHybridWebView";
    private e heightChangedListener;
    private c mDescLoadErrorListener;
    private d mDescLoadFinishListener;
    private b mDescStartLoadListener;
    private boolean mReachBottom;
    private static HashMap<String, Class<? extends kpw>> sPluginMap = new HashMap<>(4);
    private static boolean isPluginInit = false;
    private boolean mIsPaused = false;
    public boolean mStrictNav = false;
    private final String TOKEN = "hash: " + hashCode();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912263153);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/webview/DetailHybridWebView$DetailHybridWebViewClient");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            tgh.b(DetailHybridWebView.TAG, "url load finished : " + str + "，progress: " + webView.getProgress());
            super.onPageFinished(webView, str);
            if (DetailHybridWebView.access$100(DetailHybridWebView.this) != null) {
                DetailHybridWebView.access$100(DetailHybridWebView.this).a(webView, str);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            tgh.b(DetailHybridWebView.TAG, "url load started : " + str);
            super.onPageStarted(webView, str, bitmap);
            if (DetailHybridWebView.access$000(DetailHybridWebView.this) != null) {
                DetailHybridWebView.access$000(DetailHybridWebView.this).a(webView, str);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            tgh.b(DetailHybridWebView.TAG, "url load on error : " + str2 + "error info : " + i + ", " + str);
            super.onReceivedError(webView, i, str, str2);
            if (DetailHybridWebView.access$200(DetailHybridWebView.this) != null) {
                DetailHybridWebView.access$200(DetailHybridWebView.this).a(webView, i, str, str2);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
            }
            tgh.b(DetailHybridWebView.TAG, "nav url in hybrid webview mode: " + DetailHybridWebView.this.mStrictNav + " url: " + str);
            if (DetailHybridWebView.this.mStrictNav) {
                return f.b(webView, str);
            }
            return f.a(webView, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(WebView webView, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void a(WebView webView, int i, String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void a(WebView webView, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface e {
    }

    static {
        t2o.a(912263152);
    }

    public DetailHybridWebView(Context context) {
        super(getActivity(context));
        initDetailWebview(getActivity(context));
    }

    public static /* synthetic */ b access$000(DetailHybridWebView detailHybridWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6ec441b0", new Object[]{detailHybridWebView});
        }
        return detailHybridWebView.mDescStartLoadListener;
    }

    public static /* synthetic */ d access$100(DetailHybridWebView detailHybridWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c21467bb", new Object[]{detailHybridWebView});
        }
        return detailHybridWebView.mDescLoadFinishListener;
    }

    public static /* synthetic */ c access$200(DetailHybridWebView detailHybridWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("58d57db9", new Object[]{detailHybridWebView});
        }
        return detailHybridWebView.mDescLoadErrorListener;
    }

    private static Context getActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("cd9041b4", new Object[]{context});
        }
        if (context == null) {
            return b5m.z().a();
        }
        return context;
    }

    private void initDetailWebview(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79a54e9", new Object[]{this, context});
            return;
        }
        initSettings();
        setOverScrollMode(2);
        setWebViewClient(new a(context));
        if (vbl.s0()) {
            setWvUIModel(new hns(context, this));
        }
    }

    private static void initPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d268a4f7", new Object[0]);
            return;
        }
        sPluginMap.put("Page_Detail", PageDetailPlugin.class);
        sPluginMap.put(OpenWindowPlugin.PLUGIN_NAME, OpenWindowPlugin.class);
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
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        if (needDegrade()) {
            tgh.b(TAG, "need degrade.");
            setLayerType(1, null);
        }
    }

    public static /* synthetic */ Object ipc$super(DetailHybridWebView detailHybridWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -610146718:
                super.coreDestroy();
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 143825882:
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/webview/DetailHybridWebView");
        }
    }

    private boolean needDegrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66ebfb0b", new Object[]{this})).booleanValue();
        }
        return vbl.a();
    }

    public static void registerPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3583184", new Object[0]);
            return;
        }
        if (!isPluginInit) {
            initPlugins();
            isPluginInit = true;
        }
        for (String str : sPluginMap.keySet()) {
            fsw.i(str, sPluginMap.get(str), true);
        }
    }

    public static void unregisterPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cca824b", new Object[0]);
            return;
        }
        for (String str : sPluginMap.keySet()) {
            fsw.p(str);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba1e662", new Object[]{this});
            return;
        }
        clearHistory();
        super.coreDestroy();
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        if (i2 <= 0 || i4 != i6) {
            z2 = false;
        }
        this.mReachBottom = z2;
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            super.destroy();
        }
    }

    public void enableLoadingAnim() {
        RelativeLayout relativeLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36199b71", new Object[]{this});
            return;
        }
        atw wvUIModel = getWvUIModel();
        if (wvUIModel != null) {
            PreRenderManager g = PreRenderManager.g(this.context);
            if (g != null) {
                relativeLayout = (RelativeLayout) g.j(this.context, R.layout.tt_taodetail_loading_mask, null, true);
            } else {
                relativeLayout = (RelativeLayout) LayoutInflater.from(this.context).inflate(R.layout.tt_taodetail_loading_mask, (ViewGroup) null);
            }
            wvUIModel.setLoadingView(relativeLayout);
            wvUIModel.enableShowLoading();
        }
    }

    public boolean getReachBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed4ea4d3", new Object[]{this})).booleanValue();
        }
        return this.mReachBottom;
    }

    @Override // com.uc.webview.export.WebView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (!this.mIsPaused) {
            this.mIsPaused = true;
            super.onPause();
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (this.mIsPaused) {
            this.mIsPaused = false;
            super.onResume();
        }
    }

    public void resizeHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24d6141", new Object[]{this, new Integer(i)});
            return;
        }
        getLayoutParams().height = i;
        requestLayout();
        e eVar = this.heightChangedListener;
        if (eVar != null) {
            ((od7.a) eVar).a();
        }
    }

    public void setDescLoadErrorListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0691157", new Object[]{this, cVar});
        } else {
            this.mDescLoadErrorListener = cVar;
        }
    }

    public void setDescLoadFinishListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2835b9", new Object[]{this, dVar});
        } else {
            this.mDescLoadFinishListener = dVar;
        }
    }

    public void setDescStartLoadListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37f6224", new Object[]{this, bVar});
        } else {
            this.mDescStartLoadListener = bVar;
        }
    }

    public void setHeightChangedListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a912cd7", new Object[]{this, eVar});
        } else {
            this.heightChangedListener = eVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912263158);
        }

        public static boolean a(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dddfa64f", new Object[]{webView, str})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || str.contains("innerWebview")) {
                return false;
            }
            xq0.c().a(tq4.d(webView).getApplicationContext()).c(str);
            return true;
        }

        public static boolean b(WebView webView, String str) {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1b7cc492", new Object[]{webView, str})).booleanValue();
            }
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            String trim = str.trim();
            if (TextUtils.isEmpty(trim)) {
                return true;
            }
            if (!trim.startsWith("tel:") && !trim.startsWith("mailto:")) {
                for (String str2 : toj.NAV_URL_DETAIL) {
                    if (!TextUtils.isEmpty(str2) && trim.startsWith(str2)) {
                        xq0.c().a(tq4.d(webView).getApplicationContext()).c(trim);
                        return true;
                    }
                }
                if (!TextUtils.isEmpty(toj.NAV_URL_SHOP) && trim.startsWith(toj.NAV_URL_SHOP)) {
                    xq0.c().a(tq4.d(webView).getApplicationContext()).c(trim);
                    return true;
                }
            }
            return false;
        }
    }

    public DetailHybridWebView(Context context, AttributeSet attributeSet) {
        super(getActivity(context), attributeSet);
        initDetailWebview(getActivity(context));
    }

    public DetailHybridWebView(Context context, AttributeSet attributeSet, int i) {
        super(getActivity(context), attributeSet, i);
        initDetailWebview(getActivity(context));
    }
}
