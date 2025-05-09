package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.TBDialog;
import com.taobao.taobao.R;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c6p extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final xnv b;
    public String d;
    public c f;
    public long g;
    public fmo i;
    public int c = 0;
    public int e = 0;
    public boolean h = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            c6p.a(c6p.this).b();
            c6p.a(c6p.this).dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            c6p.a(c6p.this).a();
            c6p.a(c6p.this).dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends TBDialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final SslErrorHandler f16893a;
        public final String b;

        static {
            t2o.a(815792546);
        }

        public c(c6p c6pVar, Activity activity, String str, String str2, SslErrorHandler sslErrorHandler, String str3) {
            super(activity, str, str2);
            this.f16893a = sslErrorHandler;
            this.b = str3;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/onesearch/SearchUCWebViewClient$SslDialog");
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            TBS.Ext.commitEvent("onReceivedSslError", 26667, "doCanceled-" + this.b);
            this.f16893a.cancel();
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3489a35", new Object[]{this});
                return;
            }
            TBS.Ext.commitEvent("onReceivedSslError", 26667, "doProceed-" + this.b);
            this.f16893a.proceed();
        }
    }

    static {
        t2o.a(815792543);
    }

    public c6p(Context context, xnv xnvVar) {
        super(context);
        this.b = xnvVar;
    }

    public static /* synthetic */ c a(c6p c6pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("96dc838f", new Object[]{c6pVar});
        }
        return c6pVar.f;
    }

    public static /* synthetic */ Object ipc$super(c6p c6pVar, String str, Object... objArr) {
        switch (str.hashCode()) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/onesearch/SearchUCWebViewClient");
        }
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb54f539", new Object[]{this, str});
        }
        if (!o4p.Q0()) {
            return str;
        }
        try {
            if (!TextUtils.isEmpty(str) && this.i != null) {
                Uri parse = Uri.parse(str);
                if (!TextUtils.isEmpty(parse.getQueryParameter("spm"))) {
                    return str;
                }
                String C2 = com.taobao.search.sf.widgets.onesearch.b.C2(this.i.getModel());
                return !TextUtils.isEmpty(C2) ? parse.buildUpon().appendQueryParameter("spm", C2).toString() : str;
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea52d51f", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void d(fmo fmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7244e9", new Object[]{this, fmoVar});
        } else {
            this.i = fmoVar;
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
            this.d = str;
            this.c++;
        } else if (!TextUtils.isEmpty(this.d)) {
            this.e++;
        }
        super.onLoadResource(webView, str);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        this.g = System.currentTimeMillis();
        xnv xnvVar = this.b;
        if (xnvVar != null) {
            xnvVar.d();
        }
        super.onPageStarted(webView, str, bitmap);
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
            xnv xnvVar = this.b;
            if (xnvVar != null) {
                xnvVar.c();
            }
        } else {
            xnv xnvVar2 = this.b;
            if (xnvVar2 != null) {
                xnvVar2.b();
            }
        }
        super.onReceivedError(webView, i, str, str2);
        if (i != -2) {
            TBS.Ext.commitEvent("Webview", 4, "Core_Webview", "Fail", "code:" + i + ",desc:" + str, "url=" + str2);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
        } else if (webView.getRootView().getContext() instanceof Activity) {
            c cVar = new c(this, (Activity) webView.getRootView().getContext(), "警告", Localization.q(R.string.taobao_app_1005_1_16648), sslErrorHandler, webView.getUrl());
            this.f = cVar;
            cVar.setPositiveButton(new a());
            this.f.setNegativeButton(new b());
            if (!this.f.isShowing()) {
                this.f.show();
            }
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        xnv xnvVar = this.b;
        if (xnvVar != null) {
            xnvVar.c();
        }
        if (!TextUtils.isEmpty(this.d)) {
            TBS.Ext.commitEvent("Page_Webview", Constants.EventID_H5_APPCACHE, str, this.d, "" + this.c, "" + this.e);
            this.d = null;
            this.c = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        b4p.c("H5Performance", "" + this.g + " " + currentTimeMillis);
        webView.loadUrl("javascript:try{var perf=window.lib.perf;var __setTime=perf.setTime;if(__setTime&&typeof(__setTime)==\"function\"){__setTime({'event':'start','type':'page','time':" + this.g + "});__setTime({'event':'onWVLoadE','type':'page','time':" + currentTimeMillis + "});}perf.wvSetAlbum();}catch(e){}");
        super.onPageFinished(webView, str);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        b4p.a("SearchWebViewClient", "filterUrl: " + str);
        String f = f6p.f(str, "_xForceInterception");
        String f2 = f6p.f(str, "_xDisableInterception");
        boolean equalsIgnoreCase = com.alipay.mobile.common.logging.util.perf.Constants.VAL_YES.equalsIgnoreCase(f);
        boolean equalsIgnoreCase2 = com.alipay.mobile.common.logging.util.perf.Constants.VAL_YES.equalsIgnoreCase(f2);
        boolean equalsIgnoreCase3 = "no".equalsIgnoreCase(f);
        boolean equalsIgnoreCase4 = "no".equalsIgnoreCase(f2);
        if (equalsIgnoreCase) {
            b4p.h("SearchWebViewClient", "local: intercept = true");
            z = true;
        } else if (equalsIgnoreCase3) {
            b4p.h("SearchWebViewClient", "local: intercept = false");
            z = false;
        } else {
            z = this.h;
            b4p.h("SearchWebViewClient", "global: intercept = " + z);
        }
        if (equalsIgnoreCase2) {
            b4p.h("SearchWebViewClient", "global: new intercept = false");
            this.h = false;
        } else if (equalsIgnoreCase4) {
            b4p.h("SearchWebViewClient", "global: new intercept = true");
            this.h = true;
        } else {
            b4p.h("SearchWebViewClient", "global: new intercept = unchanged " + this.h);
        }
        if (!z) {
            return super.shouldOverrideUrlLoading(webView, b(str));
        }
        try {
            xnv xnvVar = this.b;
            if (xnvVar == null || !xnvVar.a(b(str))) {
                if (b4p.i()) {
                    b4p.a("SearchWebViewClient", "taobao all filter false");
                }
                return super.shouldOverrideUrlLoading(webView, b(str));
            }
            b4p.a("SearchWebViewClient", "common url filter, filtrate true");
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
