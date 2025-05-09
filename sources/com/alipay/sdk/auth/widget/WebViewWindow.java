package com.alipay.sdk.auth.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WebViewWindow extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler k = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    private ImageView f4513a;
    private TextView b;
    private ImageView c;
    private ProgressBar d;
    private WebView e;
    private e f;
    private f g;
    private g h;
    private final View.OnClickListener i;
    private final float j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.alipay.sdk.auth.widget.WebViewWindow$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class RunnableC0228a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f4515a;

            public RunnableC0228a(View view) {
                this.f4515a = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f4515a.setEnabled(true);
                }
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            g a2 = WebViewWindow.a(WebViewWindow.this);
            if (a2 != null) {
                view.setEnabled(false);
                WebViewWindow.a().postDelayed(new RunnableC0228a(view), 256L);
                if (view == WebViewWindow.b(WebViewWindow.this)) {
                    a2.b(WebViewWindow.this);
                } else if (view == WebViewWindow.c(WebViewWindow.this)) {
                    a2.a(WebViewWindow.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements DownloadListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4516a;

        public b(Context context) {
            this.f4516a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84e41dba", new Object[]{this, str, str2, str3, str4, new Long(j)});
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                this.f4516a.startActivity(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends WebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/sdk/auth/widget/WebViewWindow$c");
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cfc92fda", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
            }
            return WebViewWindow.e(WebViewWindow.this).a(WebViewWindow.this, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16eaf531", new Object[]{this, webView, new Integer(i)});
            } else {
                WebViewWindow.d(WebViewWindow.this).setVisibility(8);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9388acc", new Object[]{this, webView, str});
            } else {
                WebViewWindow.e(WebViewWindow.this).c(WebViewWindow.this, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d extends WebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -968324284:
                    return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
                case -496040708:
                    super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                    return null;
                case 756225189:
                    super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                    return null;
                case 1835642644:
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/sdk/auth/widget/WebViewWindow$d");
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d69af14", new Object[]{this, webView, str});
            } else if (!WebViewWindow.f(WebViewWindow.this).a(WebViewWindow.this, str)) {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cead5e47", new Object[]{this, webView, str, bitmap});
            } else if (!WebViewWindow.f(WebViewWindow.this).d(WebViewWindow.this, str)) {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d1314a5", new Object[]{this, webView, new Integer(i), str, str2});
            } else if (!WebViewWindow.f(WebViewWindow.this).a(WebViewWindow.this, i, str, str2)) {
                super.onReceivedError(webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e26f04fc", new Object[]{this, webView, sslErrorHandler, sslError});
            } else if (!WebViewWindow.f(WebViewWindow.this).a(WebViewWindow.this, sslErrorHandler, sslError)) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c6488b44", new Object[]{this, webView, str})).booleanValue();
            }
            if (!WebViewWindow.f(WebViewWindow.this).b(WebViewWindow.this, str)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface e {
        boolean a(WebViewWindow webViewWindow, String str, String str2, String str3, JsPromptResult jsPromptResult);

        void c(WebViewWindow webViewWindow, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface f {
        boolean a(WebViewWindow webViewWindow, int i, String str, String str2);

        boolean a(WebViewWindow webViewWindow, SslErrorHandler sslErrorHandler, SslError sslError);

        boolean a(WebViewWindow webViewWindow, String str);

        boolean b(WebViewWindow webViewWindow, String str);

        boolean d(WebViewWindow webViewWindow, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface g {
        void a(WebViewWindow webViewWindow);

        void b(WebViewWindow webViewWindow);
    }

    public WebViewWindow(Context context) {
        this(context, null);
    }

    public static /* synthetic */ g a(WebViewWindow webViewWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("2bf18b0b", new Object[]{webViewWindow}) : webViewWindow.h;
    }

    public static /* synthetic */ ImageView b(WebViewWindow webViewWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("85230471", new Object[]{webViewWindow}) : webViewWindow.f4513a;
    }

    public static /* synthetic */ ImageView c(WebViewWindow webViewWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("76db950", new Object[]{webViewWindow}) : webViewWindow.c;
    }

    public static /* synthetic */ ProgressBar d(WebViewWindow webViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProgressBar) ipChange.ipc$dispatch("e957d5e9", new Object[]{webViewWindow});
        }
        return webViewWindow.d;
    }

    public static /* synthetic */ e e(WebViewWindow webViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("bb4f749", new Object[]{webViewWindow});
        }
        return webViewWindow.f;
    }

    public static /* synthetic */ f f(WebViewWindow webViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("43a5d287", new Object[]{webViewWindow});
        }
        return webViewWindow.g;
    }

    public static /* synthetic */ Object ipc$super(WebViewWindow webViewWindow, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/sdk/auth/widget/WebViewWindow");
    }

    public ImageView getBackButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("542c045a", new Object[]{this});
        }
        return this.f4513a;
    }

    public ImageView getRefreshButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("80dde12", new Object[]{this});
        }
        return this.c;
    }

    public TextView getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("680f299d", new Object[]{this});
        }
        return this.b;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.e.getUrl();
    }

    public WebView getWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebView) ipChange.ipc$dispatch("fb78e94f", new Object[]{this});
        }
        return this.e;
    }

    public void setChromeProxy(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25068bce", new Object[]{this, eVar});
            return;
        }
        this.f = eVar;
        if (eVar == null) {
            this.e.setWebChromeClient(null);
        } else {
            this.e.setWebChromeClient(new c());
        }
    }

    public void setWebClientProxy(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e916a4c", new Object[]{this, fVar});
            return;
        }
        this.g = fVar;
        if (fVar == null) {
            this.e.setWebViewClient(null);
        } else {
            this.e.setWebViewClient(new d());
        }
    }

    public void setWebEventProxy(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d6760", new Object[]{this, gVar});
        } else {
            this.h = gVar;
        }
    }

    public WebViewWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new a();
        this.j = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        a(context);
        b(context);
        c(context);
    }

    public static /* synthetic */ Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]) : k;
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        ProgressBar progressBar = new ProgressBar(context, null, 16973855);
        this.d = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(17301612));
        this.d.setMax(100);
        this.d.setBackgroundColor(-218103809);
        addView(this.d, new LinearLayout.LayoutParams(-1, a(2)));
    }

    private void c(Context context) {
        WebView webView = new WebView(context);
        this.e = webView;
        webView.setVerticalScrollbarOverlay(true);
        a(this.e, context);
        WebSettings settings = this.e.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setUseWideViewPort(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        this.e.setVerticalScrollbarOverlay(true);
        this.e.setDownloadListener(new b(context));
        try {
            try {
                this.e.removeJavascriptInterface("searchBoxJavaBridge_");
                this.e.removeJavascriptInterface("accessibility");
                this.e.removeJavascriptInterface("accessibilityTraversal");
            } catch (Exception unused) {
                Method method = this.e.getClass().getMethod("removeJavascriptInterface", new Class[0]);
                if (method != null) {
                    method.invoke(this.e, "searchBoxJavaBridge_");
                    method.invoke(this.e, "accessibility");
                    method.invoke(this.e, "accessibilityTraversal");
                }
            }
        } catch (Throwable unused2) {
        }
        com.alipay.sdk.m.f.b.a(this.e);
        addView(this.e, new LinearLayout.LayoutParams(-1, -1));
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(8);
        ImageView imageView = new ImageView(context);
        this.f4513a = imageView;
        imageView.setOnClickListener(this.i);
        ImageView imageView2 = this.f4513a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        this.f4513a.setImageDrawable(com.alipay.sdk.m.e.d.a(com.alipay.sdk.m.e.d.f4527a, context));
        this.f4513a.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f4513a, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(a(1), a(25)));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-15658735);
        this.b.setTextSize(17.0f);
        this.b.setMaxLines(1);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(a(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.b, layoutParams);
        ImageView imageView3 = new ImageView(context);
        this.c = imageView3;
        imageView3.setOnClickListener(this.i);
        this.c.setScaleType(scaleType);
        this.c.setImageDrawable(com.alipay.sdk.m.e.d.a(com.alipay.sdk.m.e.d.b, context));
        this.c.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.c, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, a(48)));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        removeAllViews();
        this.e.removeAllViews();
        this.e.setWebViewClient(null);
        this.e.setWebChromeClient(null);
        this.e.destroy();
    }

    public void a(WebView webView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c69691d", new Object[]{this, webView, context});
            return;
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        WebSettings settings = webView.getSettings();
        settings.setUserAgentString(userAgentString + com.alipay.sdk.m.e.e.d(context));
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.e.loadUrl(str);
        com.alipay.sdk.m.f.b.a(this.e);
    }

    public void a(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a7c79", new Object[]{this, str, bArr});
        } else {
            this.e.postUrl(str, bArr);
        }
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : (int) (i * this.j);
    }
}
