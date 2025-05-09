package com.taobao.browser;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.preRender.BasePreInitManager;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.core.view.ViewCompat;
import anet.channel.util.HttpConstant;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.app.pay.H5PayInterceptor;
import com.alipay.android.msp.model.H5PayCallback;
import com.alipay.android.msp.model.H5PayResultModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.urlFilter.UrlFilter;
import com.taobao.browser.urlFilter.UrlResourceFilter;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.shop.common.ShopUrlFilter;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import com.ut.mini.UTAnalytics;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import tb.a7e;
import tb.d8s;
import tb.eqw;
import tb.fm2;
import tb.hm2;
import tb.im2;
import tb.j9l;
import tb.k7r;
import tb.lq6;
import tb.m7r;
import tb.mol;
import tb.mov;
import tb.og8;
import tb.pg1;
import tb.rb;
import tb.ssw;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.wpw;
import tb.y71;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CommonWebViewClient extends hm2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final UrlFilter d;
    public String g;
    public int f = 0;
    public int h = 0;
    public String i = "0";
    public String j = "";
    public boolean k = false;
    public long l = 0;
    public String m = "";
    public final List<UrlResourceFilter> e = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BrowserHybridWebView f10247a;

        public a(BrowserHybridWebView browserHybridWebView) {
            this.f10247a = browserHybridWebView;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else if (this.f10247a.getPageLoadCount() > 0) {
                this.f10247a.refresh();
            } else {
                CommonWebViewClient.b(CommonWebViewClient.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10248a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ BrowserHybridWebView c;

        public b(String str, Context context, BrowserHybridWebView browserHybridWebView) {
            this.f10248a = str;
            this.b = context;
            this.c = browserHybridWebView;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            this.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f10248a)));
            if (this.c.getPageLoadCount() <= 0) {
                CommonWebViewClient.b(CommonWebViewClient.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebView f10249a;

        public c(WebView webView) {
            this.f10249a = webView;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            WebView webView = this.f10249a;
            if (!(webView instanceof BrowserHybridWebView) || ((BrowserHybridWebView) webView).getPageLoadCount() <= 0) {
                CommonWebViewClient.b(CommonWebViewClient.this);
            } else {
                ((WVUCWebView) this.f10249a).refresh();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10250a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ WebView c;

        public d(String str, Context context, WebView webView) {
            this.f10250a = str;
            this.b = context;
            this.c = webView;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            this.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f10250a)));
            WebView webView = this.c;
            if (!(webView instanceof BrowserHybridWebView) || ((BrowserHybridWebView) webView).getPageLoadCount() <= 0) {
                CommonWebViewClient.b(CommonWebViewClient.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements H5PayCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f10251a;
        public final /* synthetic */ WebView b;
        public final /* synthetic */ Context c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10252a;

            public a(String str) {
                this.f10252a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    e.this.b.loadUrl(this.f10252a);
                }
            }
        }

        public e(CommonWebViewClient commonWebViewClient, JSONObject jSONObject, WebView webView, Context context) {
            this.f10251a = jSONObject;
            this.b = webView;
            this.c = context;
        }

        @Override // com.alipay.android.msp.model.H5PayCallback
        public void onPayResult(H5PayResultModel h5PayResultModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e568f3e1", new Object[]{this, h5PayResultModel});
                return;
            }
            StringBuilder sb = new StringBuilder("result code=[");
            sb.append(h5PayResultModel.getResultCode());
            sb.append("],result url=[");
            sb.append(h5PayResultModel.getReturnUrl());
            sb.append("]");
            try {
                this.f10251a.put(rb.RESULT_KEY, true);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ((WVUCWebView) this.b).fireEvent("nativePayDealt", this.f10251a.toString());
            String returnUrl = h5PayResultModel.getReturnUrl();
            if (!TextUtils.isEmpty(returnUrl)) {
                ((Activity) this.c).runOnUiThread(new a(returnUrl));
            }
        }
    }

    static {
        t2o.a(619708458);
    }

    public CommonWebViewClient(Context context, UrlFilter urlFilter) {
        super(context);
        this.d = urlFilter;
    }

    public static /* synthetic */ void b(CommonWebViewClient commonWebViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc45ae47", new Object[]{commonWebViewClient});
        } else {
            commonWebViewClient.e();
        }
    }

    public static /* synthetic */ Object ipc$super(CommonWebViewClient commonWebViewClient, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2109781315:
                return super.shouldInterceptRequest((WebView) objArr[0], (String) objArr[1]);
            case -1262473342:
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            case -1171743094:
                super.onLoadResource((WebView) objArr[0], (String) objArr[1]);
                return null;
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            case -332805219:
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            case 534767588:
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            case 1373550412:
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/CommonWebViewClient");
        }
    }

    public void c(UrlResourceFilter urlResourceFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40d9597", new Object[]{this, urlResourceFilter});
        } else {
            ((ArrayList) this.e).add(urlResourceFilter);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1102;
        UrlFilter urlFilter = this.d;
        if (urlFilter != null) {
            urlFilter.notifyParent(obtain);
        }
    }

    public final boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43c5a138", new Object[]{this, str})).booleanValue();
        }
        return Pattern.matches("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$", str);
    }

    public final boolean g(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ed10e2", new Object[]{this, webView, str})).booleanValue();
        }
        if (!(webView instanceof BrowserHybridWebView) || str == null) {
            return false;
        }
        BrowserHybridWebView browserHybridWebView = (BrowserHybridWebView) webView;
        browserHybridWebView.setWebviewMode(str, (a7e) webView);
        if (browserHybridWebView.getWebviewMode() == -1) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda88aa0", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf240677", new Object[]{this, webView, message, message2});
        } else {
            message2.sendToTarget();
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba289e8a", new Object[]{this, webView, str});
            return;
        }
        if (str.contains(".manifest")) {
            this.g = str;
            this.f++;
        } else if (!TextUtils.isEmpty(this.g)) {
            this.h++;
        }
        super.onLoadResource(webView, str);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        if (i == -400) {
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
            Message obtain = Message.obtain();
            obtain.what = 401;
            UrlFilter urlFilter = this.d;
            if (urlFilter != null) {
                urlFilter.notifyParent(obtain);
            }
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
        if (i != -2) {
            TBS.Ext.commitEvent("Webview", 4, "Core_Webview", "Fail", "code:" + i + ",desc:" + str, "url=" + str2);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        y7t.a("CommonWebViewClient", "ssl error :" + sslError.getUrl());
        String url = sslError.getUrl();
        if (j(url)) {
            sslErrorHandler.proceed();
            v7t.i("CommonWebViewClient", "url=[" + url + "] 域名在白名单里面，放行");
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse doFilter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("823f4abd", new Object[]{this, webView, str});
        }
        if (this.l == 0) {
            this.l = System.currentTimeMillis();
            k7r.b("exchain.FullTrace", "H5 start start: " + this.l);
        }
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            UrlResourceFilter urlResourceFilter = (UrlResourceFilter) it.next();
            if (urlResourceFilter.match(str) && (doFilter = urlResourceFilter.doFilter(str)) != null) {
                return doFilter;
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // tb.hm2, android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        boolean d2 = d(webView, str, jSONObject);
        if (d2 && webView != null && (webView.getContext() instanceof BrowserActivity)) {
            mol.b().f(BrowserUtil.r((Activity) webView.getContext()), webView.getOriginalUrl(), str);
        }
        try {
            jSONObject.put("url", (Object) str);
            jSONObject.put("overrideUrlLoading", (Object) Boolean.valueOf(d2));
            AppMonitor.Alarm.commitSuccess(m7r.KEY_MONITOR_MODULE, "shouldOverrideUrlLoading", jSONObject.toJSONString());
            TLog.loge("WindVane", "CommonWebViewClient", "shouldOverrideUrlLoading " + jSONObject.toJSONString());
        } catch (Exception unused) {
        }
        return d2;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        k7r.b("exchain.FullTrace", "H5 start end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - this.l));
        this.l = 0L;
        Message obtain = Message.obtain();
        obtain.obj = str;
        obtain.what = 401;
        UrlFilter urlFilter = this.d;
        if (urlFilter != null) {
            urlFilter.notifyParent(obtain);
        }
        if (!TextUtils.isEmpty(this.g)) {
            TBS.Ext.commitEvent("Page_Webview", Constants.EventID_H5_APPCACHE, str, this.g, "" + this.f, "" + this.h);
            this.g = null;
            this.f = 0;
        }
        webView.evaluateJavascript("(function(p){if(!p||!p.timing)return;var t=p.timing,s=t.navigationStart,les=t.loadEventStart;return JSON.stringify({ngs:s,les:les})})(window.performance)", new ValueCallback<String>() { // from class: com.taobao.browser.CommonWebViewClient.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onReceiveValue(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                    return;
                }
                JSONObject jSONObject = null;
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        if (str2.startsWith("\"") && str2.endsWith("\"")) {
                            str2 = str2.substring(1, str2.length() - 1);
                        }
                        jSONObject = new JSONObject(str2.replace("\\", ""));
                    }
                } catch (Exception unused) {
                }
                if (jSONObject != null) {
                    d8s.a().e(jSONObject.optLong("ngs"));
                    d8s.a().d(jSONObject.optLong("les"));
                }
            }
        });
        super.onPageFinished(webView, str);
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("mt_scripts");
            URLDecoder.decode(queryParameter, "UTF-8");
            if (!TextUtils.isEmpty(queryParameter) && h(Uri.parse(queryParameter))) {
                ((WVUCWebView) webView).evaluateJavascript("(function(){const script=document.createElement('script');script.src='" + queryParameter + "';script.crossOrigin = 'anonymous';document.body.appendChild(script);})()");
            }
        } catch (Throwable unused) {
        }
        if ((webView instanceof BrowserHybridWebView) && ((BrowserHybridWebView) webView).isPreRender()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("attached", ViewCompat.isAttachedToWindow(webView));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            ((WVUCWebView) webView).fireEvent(BasePreInitManager.ONLOAD_EVENT, jSONObject.toString());
        }
        if (webView.getContext() instanceof BrowserActivity) {
            mol.b().c(BrowserUtil.r((Activity) webView.getContext()), str);
        }
    }

    public final boolean h(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("492c2c3d", new Object[]{this, uri})).booleanValue();
        }
        String[] split = OrangeConfig.getInstance().getConfig("WindVane", "mt_scripts", "").split(",");
        if (split.length == 0) {
            return false;
        }
        String host = uri.getHost();
        for (String str : split) {
            if (host.endsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb3ac5bc", new Object[]{this, str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        String[] split = OrangeConfig.getInstance().getConfig("WindVane", "ssl_white_list", "").split(",");
        if (split.length == 0) {
            return false;
        }
        boolean z = false;
        for (String str2 : split) {
            if (TextUtils.equals(str2, parse.getHost())) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0126 A[Catch: all -> 0x0156, TryCatch #1 {all -> 0x0156, blocks: (B:15:0x004e, B:17:0x0056, B:19:0x005a, B:21:0x0068, B:24:0x0075, B:25:0x00ad, B:26:0x00fe, B:28:0x0126, B:29:0x0135, B:31:0x013f, B:33:0x0148, B:35:0x0150, B:36:0x0153), top: B:68:0x004e }] */
    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPageStarted(com.uc.webview.export.WebView r10, java.lang.String r11, android.graphics.Bitmap r12) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.CommonWebViewClient.onPageStarted(com.uc.webview.export.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    public final boolean d(WebView webView, String str, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afca9c8e", new Object[]{this, webView, str, jSONObject})).booleanValue();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("url", this.m);
        lq6.a().e("afc", hashMap);
        this.i = j9l.c("WindVane", m7r.TB_ALLOW_OPEN_CLIENT, "0");
        this.j = j9l.c("WindVane", m7r.TB_THIRD_MIDDLE_JUMP_REGEX, "");
        TLog.loge("BrowserActivity", "CommonWebViewClient", "shouldOverrideUrl: " + str);
        WVUCWebView wVUCWebView = (WVUCWebView) webView;
        wVUCWebView.bizCode = "";
        if (im2.a(str) && this.mContext != null) {
            UTAnalytics.getInstance().getDefaultTracker().setPageStatusCode(this.mContext.get(), 1);
        }
        TBS.setH5Url(str);
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        try {
            if (parse.isHierarchical()) {
                String queryParameter = parse.getQueryParameter("hybrid");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (!"true".equals(queryParameter)) {
                    }
                }
                UrlFilter urlFilter = this.d;
                if ((urlFilter != null && urlFilter.filtrate(str)) || (fm2.commonConfig.u && webView != null && new ShopUrlFilter().b(str, webView.getContext()))) {
                    for (StackTraceElement stackTraceElement : Looper.getMainLooper().getThread().getStackTrace()) {
                        stackTraceElement.toString();
                    }
                    jSONObject.put("reason", "filter");
                    return true;
                }
            }
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if ((("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) && (!TextUtils.isEmpty(scheme))) && (!TextUtils.isEmpty(host))) {
                if (webView instanceof BrowserHybridWebView) {
                    BrowserHybridWebView browserHybridWebView = (BrowserHybridWebView) webView;
                    if (mov.a(this.j, str)) {
                        browserHybridWebView.allowThirdMiddlePageJump = true;
                        browserHybridWebView.needNotiSafe = false;
                    }
                    this.k = browserHybridWebView.allowThirdMiddlePageJump;
                }
                if (!og8.b() || !f(host)) {
                    wpw wpwVar = vpw.commonConfig;
                    if (wpwVar.A || !ssw.c(str, (a7e) webView)) {
                        int d2 = BrowserUtil.d((IWVWebView) webView, str);
                        if (d2 == 0) {
                            jSONObject.put("reason", "jaeState");
                            return true;
                        }
                        if (1 == d2) {
                            wVUCWebView.bizCode = "jae";
                        }
                        Context currentContext = wVUCWebView.getCurrentContext();
                        if (wpwVar.A || !g(webView, str) || !"1".equals(this.i) || this.k || !(currentContext instanceof Activity)) {
                            if ("true".equals(OrangeConfig.getInstance().getConfig("WindVane", "alipayNative", "true"))) {
                                try {
                                    if (currentContext instanceof Activity) {
                                        H5PayInterceptor h5PayInterceptor = new H5PayInterceptor((Activity) currentContext);
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("user_token", Login.getSid());
                                        hashMap2.put("user_token_type", "tbsid");
                                        Login.getSid();
                                        JSONObject jSONObject2 = new JSONObject();
                                        if (h5PayInterceptor.payInterceptorWithUrl(str, new e(this, jSONObject2, webView, currentContext), hashMap2)) {
                                            jSONObject.put("reason", "alipayNative");
                                            return true;
                                        }
                                        try {
                                            jSONObject2.put(rb.RESULT_KEY, false);
                                        } catch (JSONException e2) {
                                            e2.printStackTrace();
                                        }
                                        ((WVUCWebView) webView).fireEvent("nativePayDealt", jSONObject2.toString());
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
                            jSONObject.put("reason", pg1.ATOM_super);
                            return shouldOverrideUrlLoading;
                        }
                        new AlertDialog.Builder(currentContext).setTitle(R.string.browser_warning).setMessage(currentContext.getString(R.string.browser_tips) + scheme + HttpConstant.SCHEME_SPLIT + host).setPositiveButton(R.string.browser_open_url, new d(str, currentContext, webView)).setNegativeButton(R.string.browser_cancel, new c(webView)).setCancelable(false).create().show();
                        jSONObject.put("reason", "forbiddenAccessV2");
                        return true;
                    }
                    String b2 = eqw.c().b();
                    if (TextUtils.isEmpty(b2)) {
                        wVUCWebView.onMessage(402, str);
                    } else {
                        webView.loadUrl(b2);
                    }
                    jSONObject.put("reason", "forbiddenAccessV1");
                    y71.commitFail("SecurityBlock", 3, "shouldOverrideUrlLoading Black", str);
                    return true;
                }
                TLog.logd("CommonWebViewClient", "is debug: " + og8.b());
                jSONObject.put("reason", "ipDebug");
                return super.shouldOverrideUrlLoading(webView, str);
            } else if (TextUtils.isEmpty(scheme)) {
                return true;
            } else {
                jSONObject.put("reason", "nonHttp");
                y71.commitFail("SecurityBlock", 5, "other scheme allow", str);
                try {
                    if (!super.shouldOverrideUrlLoading(webView, str)) {
                        Intent parseUri = Intent.parseUri(str, 1);
                        parseUri.setComponent(null);
                        parseUri.setSelector(null);
                        y71.commitFail("parseUri", 1, "parseUri", str);
                        if (webView.getContext() != null) {
                            webView.getContext().startActivity(parseUri);
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return true;
            }
        } catch (Exception e3) {
            y7t.a("CommonWebViewClient", "common url filter error:" + e3.getMessage());
            jSONObject.put("reason", "filterError");
            return true;
        }
    }
}
